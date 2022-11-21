import java.io.IOException;
import java.util.ConcurrentModificationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brx implements brm
{
    private final oqz a;
    
    public brx(final oqz a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
    }
    
    @Override
    public final void kY(final bro bro, final long n, final long n2) {
        if (!brz.b()) {
            this.a.X(new IOException(new ConcurrentModificationException()));
            return;
        }
        this.a.Y();
    }
    
    @Override
    public final yrd kZ(final bro bro, final IOException ex, final int n) {
        this.a.X(ex);
        return brr.d;
    }
    
    @Override
    public final void lb(final bro bro, final boolean b) {
    }
}
