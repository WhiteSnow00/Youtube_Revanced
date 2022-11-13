import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public interface asei extends Closeable
{
    void b();
    
    void c();
    
    void close();
    
    boolean d();
    
    int e();
    
    int f();
    
    asei g(final int p0);
    
    void i(final ByteBuffer p0);
    
    void j(final OutputStream p0, final int p1);
    
    void k(final byte[] p0, final int p1, final int p2);
    
    void l(final int p0);
}
