import java.net.SocketImpl;
import java.io.FileDescriptor;
import java.net.Socket;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubi extends Socket
{
    public aubi(final FileDescriptor fileDescriptor) {
        super(new aubh(fileDescriptor));
    }
}
