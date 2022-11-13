import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.SocketTimeoutException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.DatagramSocket;
import android.net.Uri;
import java.net.DatagramPacket;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcq extends bbd
{
    private final byte[] a;
    private final DatagramPacket b;
    private Uri c;
    private DatagramSocket d;
    private MulticastSocket e;
    private InetAddress f;
    private boolean g;
    private int h;
    
    public bcq() {
        super(true);
        final byte[] a = new byte[2000];
        this.a = a;
        this.b = new DatagramPacket(a, 0, 2000);
    }
    
    public final int a(final byte[] array, final int n, int min) {
        if (min == 0) {
            return 0;
        }
        if (this.h == 0) {
            try {
                final DatagramSocket d = this.d;
                dk.d((Object)d);
                d.receive(this.b);
                this.g(this.h = this.b.getLength());
            }
            catch (final IOException ex) {
                throw new bcp((Throwable)ex, 2001);
            }
            catch (final SocketTimeoutException ex2) {
                throw new bcp((Throwable)ex2, 2002);
            }
        }
        final int length = this.b.getLength();
        final int h = this.h;
        min = Math.min(h, min);
        System.arraycopy(this.a, length - h, array, n, min);
        this.h -= min;
        return min;
    }
    
    public final long b(final bbp bbp) {
        final Uri a = bbp.a;
        this.c = a;
        final String host = a.getHost();
        dk.d((Object)host);
        final int port = this.c.getPort();
        this.i(bbp);
        try {
            this.f = InetAddress.getByName(host);
            final InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f, port);
            if (this.f.isMulticastAddress()) {
                (this.e = new MulticastSocket(inetSocketAddress)).joinGroup(this.f);
                this.d = this.e;
            }
            else {
                this.d = new DatagramSocket(inetSocketAddress);
            }
            this.d.setSoTimeout(8000);
            this.g = true;
            this.j(bbp);
            return -1L;
        }
        catch (final IOException ex) {
            throw new bcp((Throwable)ex, 2001);
        }
        catch (final SecurityException ex2) {
            throw new bcp((Throwable)ex2, 2006);
        }
    }
    
    public final Uri c() {
        return this.c;
    }
    
    public final void f() {
        this.c = null;
        final MulticastSocket e = this.e;
        Label_0034: {
            if (e == null) {
                break Label_0034;
            }
            while (true) {
                try {
                    final InetAddress f = this.f;
                    dk.d((Object)f);
                    e.leaveGroup(f);
                    this.e = null;
                    final DatagramSocket d = this.d;
                    if (d != null) {
                        d.close();
                        this.d = null;
                    }
                    this.f = null;
                    this.h = 0;
                    if (this.g) {
                        this.g = false;
                        this.h();
                    }
                }
                catch (final IOException ex) {
                    continue;
                }
                break;
            }
        }
    }
}
