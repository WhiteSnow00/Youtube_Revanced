import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public interface ardi extends Closeable
{
    int a(final ByteBuffer p0);
    
    long b();
    
    long c();
    
    void close();
    
    long d(final long p0, final long p1, final WritableByteChannel p2);
    
    ByteBuffer e(final long p0, final long p1);
    
    void f(final long p0);
}
