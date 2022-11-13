import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afoc extends afoe
{
    public final ByteBuffer a;
    
    public afoc() {
        this.a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    }
    
    public final void a(final byte[] array, final int n) {
        adkp.P(0, n, array.length);
        this.d(array, n);
    }
    
    public final void b(final char c) {
        this.a.putChar(c);
        this.c(2);
    }
    
    public final void c(final int n) {
        try {
            this.d(this.a.array(), n);
        }
        finally {
            this.a.clear();
        }
    }
    
    protected void d(final byte[] array, final int n) {
        throw null;
    }
    
    public final void e(final byte[] array) {
        array.getClass();
        this.d(array, array.length);
    }
}
