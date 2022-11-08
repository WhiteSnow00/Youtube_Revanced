import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afmc extends afme
{
    public final ByteBuffer a;
    
    public afmc() {
        this.a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    }
    
    @Override
    public final void a(final byte[] array, final int n) {
        agot.C(0, n, array.length);
        this.d(array, n);
    }
    
    @Override
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
    
    @Override
    public final void e(final byte[] array) {
        array.getClass();
        this.d(array, array.length);
    }
}
