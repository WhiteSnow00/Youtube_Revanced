import java.io.OutputStream;
import java.io.InputStream;
import java.net.SocketAddress;
import java.net.InetAddress;
import java.io.FileDescriptor;
import java.net.SocketImpl;

// 
// Decompiled by Procyon v0.6.0
// 

final class auev extends SocketImpl
{
    public auev(final FileDescriptor fd) {
        this.fd = fd;
    }
    
    @Override
    protected final void accept(final SocketImpl socketImpl) {
        throw new RuntimeException("accept not implemented");
    }
    
    @Override
    protected final int available() {
        throw new RuntimeException("accept not implemented");
    }
    
    @Override
    protected final void bind(final InetAddress inetAddress, final int n) {
        throw new RuntimeException("accept not implemented");
    }
    
    @Override
    protected final void close() {
    }
    
    @Override
    protected final void connect(final String s, final int n) {
        throw new RuntimeException("connect not implemented");
    }
    
    @Override
    protected final void connect(final InetAddress inetAddress, final int n) {
        throw new RuntimeException("connect not implemented");
    }
    
    @Override
    protected final void connect(final SocketAddress socketAddress, final int n) {
        throw new RuntimeException("connect not implemented");
    }
    
    @Override
    protected final void create(final boolean b) {
    }
    
    @Override
    protected final InputStream getInputStream() {
        throw new RuntimeException("getInputStream not implemented");
    }
    
    @Override
    public final Object getOption(final int n) {
        throw new RuntimeException("getOption not implemented");
    }
    
    @Override
    protected final OutputStream getOutputStream() {
        throw new RuntimeException("getOutputStream not implemented");
    }
    
    @Override
    protected final void listen(final int n) {
        throw new RuntimeException("listen not implemented");
    }
    
    @Override
    protected final void sendUrgentData(final int n) {
        throw new RuntimeException("sendUrgentData not implemented");
    }
    
    @Override
    public final void setOption(final int n, final Object o) {
        throw new RuntimeException("setOption not implemented");
    }
}
