import java.net.SocketImpl;
import java.io.FileDescriptor;
import java.net.Socket;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auew extends Socket
{
    public auew(final FileDescriptor fileDescriptor) {
        super(new auev(fileDescriptor));
    }
}
