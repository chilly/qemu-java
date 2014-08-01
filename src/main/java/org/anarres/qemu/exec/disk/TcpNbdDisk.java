/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec.disk;

import java.net.InetSocketAddress;
import org.anarres.qemu.exec.dev.UdpHostDevice;

/**
 *
 * @author shevek
 */
public class TcpNbdDisk extends AbstractDisk {

    private final InetSocketAddress address;
    private final String name;

    public TcpNbdDisk(InetSocketAddress address, String name) {
        this.address = address;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("nbd:").append(UdpHostDevice.toHostString(address)).append(':').append(address.getPort());
        if (name != null)
            buf.append(":exportname=").append(name);
        return buf.toString();
    }
}