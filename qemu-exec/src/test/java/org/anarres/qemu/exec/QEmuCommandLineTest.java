/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import com.google.common.base.Joiner;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.UUID;
import org.anarres.qemu.exec.QEmuDisplayOption.DisplayType;
import org.anarres.qemu.exec.QEmuDriveOption.Cache;
import org.anarres.qemu.exec.host.chardev.BrailleCharDevice;
import org.anarres.qemu.exec.host.chardev.FileCharDevice;
import org.anarres.qemu.exec.host.chardev.LinuxParportCharDevice;
import org.anarres.qemu.exec.host.chardev.TcpCharDevice;
import org.anarres.qemu.exec.host.chardev.UnixCharDevice;
import org.anarres.qemu.exec.host.disk.IScsiDisk;
import org.anarres.qemu.exec.util.QEmuOptionsList;
import org.anarres.qemu.exec.util.QEmuIdAllocator;
import org.anarres.qemu.exec.recipe.QEmuMonitorRecipe;
import org.anarres.qemu.exec.recipe.QEmuVirtioSerialRecipe;
import org.anarres.qemu.exec.recipe.QEmuVirtioDriveRecipe;
import org.anarres.qemu.exec.recipe.QEmuVirtioNetRecipe;
import org.anarres.qemu.image.QEmuImageFormat;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author shevek
 */
public class QEmuCommandLineTest {

    private static final Logger LOG = LoggerFactory.getLogger(QEmuCommandLineTest.class);

    @Test
    public void testLibvirtCommandLine() {

        QEmuOptionsList defaultOptions = new QEmuOptionsList(
                new QEmuMachineOption().withAcceleration(QEmuMachineOption.Acceleration.kvm, QEmuMachineOption.Acceleration.tcg),
                QEmuMiscOptions.NO_USER_CONFIG,
                QEmuMiscOptions.NO_DEFAULTS,
                // QEmuMiscOptions.NO_SHUTDOWN,
                // QEmuMiscOptions.NO_ACPI,
                new QEmuRtcOption().withBase(QEmuRtcOption.Base.utc),
                null);

        QEmuCommandLine commandLine = new QEmuCommandLine(QEmuArchitecture.x86_64);
        QEmuIdAllocator allocator = commandLine.getAllocator();
        commandLine.addOptions(
                defaultOptions,
                new QEmuIdOption(UUID.randomUUID(), "sys-1"),
                new QEmuMemoryOption(1, QEmuMemoryOption.Magnitude.GIGA),
                new QEmuCpusOption(2).withSockets(2).withCores(1).withThreads(1),
                new QEmuDisplayOption(DisplayType.vnc).withVncDisplay(new VncDisplay.Socket(null, 0)),
                // mon
                new QEmuDeviceOption.Piix3Usb().withPciAddress(allocator),
                new QEmuVirtioDriveRecipe(allocator, "/var/tmp/qemu/sys-1/vda").withFormat(QEmuImageFormat.raw).withCache(Cache.unsafe).withProperty("bootindex", "1"),
                new QEmuVirtioNetRecipe(allocator, "tap0").withMac("fa:16:3e:13:ff:00"),
                new QEmuVirtioNetRecipe(allocator, "tap1").withMac("fa:16:3e:13:ff:01"),
                new QEmuKernelOption("/var/tmp/qemu/sys-1/kernel").withInitrd("/var/tmp/qemu/sys-1/initrd").withAppend("root=/dev/vda2 console=ttyS0"),
                new QEmuVirtioSerialRecipe(new FileCharDevice("/var/tmp/qemu/sys-1/console.log")),
                new QEmuMonitorRecipe(new UnixCharDevice("/var/tmp/qemu/sys-1/monitor.sock")),
                null);
        // -chardev socket,id=charmonitor,path=/var/lib/libvirt/qemu/sys-1.monitor,server,nowait

        LOG.info("Command is " + Joiner.on(' ').join(commandLine.toCommandWords()));
    }

    @Test
    public void testCommandLine() throws Exception {
        QEmuCommandLine commandLine = new QEmuCommandLine(QEmuArchitecture.x86_64);
        commandLine.addOptions(new QEmuMemoryOption(1, QEmuMemoryOption.Magnitude.GIGA).withPrealloc(true));
        commandLine.addOptions(new QEmuMonitorRecipe(new TcpCharDevice(4444)));
        commandLine.addOptions(new QEmuDriveOption(0, "/home/shevek/sda.img"));
        commandLine.addOptions(new QEmuDriveOption(1, "/home/shevek/sdb.img").withInterface(QEmuDriveOption.Interface.scsi));
        commandLine.addOptions(new QEmuDriveOption(2, new IScsiDisk(InetAddress.getByName("localhost"), "iqn.foo", 5)));
        commandLine.addOptions(new QEmuKeyboardOption(QEmuKeyboardOption.Layout.en_gb));
        commandLine.addOptions(new QEmuDisplayOption(QEmuDisplayOption.DisplayType.vnc));
        commandLine.addOptions(new QEmuVirtioSerialRecipe(new TcpCharDevice(new InetSocketAddress(123))));
        commandLine.addOptions(new QEmuVirtioSerialRecipe(new LinuxParportCharDevice(4)));
        commandLine.addOptions(new QEmuVirtioSerialRecipe(new BrailleCharDevice()));
        LOG.info("Command is " + commandLine.toCommandWords());
    }
}
