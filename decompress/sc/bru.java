import java.io.IOException;
import java.util.ConcurrentModificationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bru implements brj
{
    private final pvh a;
    
    public bru(final pvh a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
    }
    
    public final void kY(final brl brl, final long n, final long n2) {
        if (!brw.b()) {
            this.a.Y(new IOException(new ConcurrentModificationException()));
            return;
        }
        this.a.Z();
    }
    
    public final ypi kZ(final brl brl, final IOException ex, final int n) {
        this.a.Y(ex);
        return bro.d;
    }
    
    public final void lb(final brl brl, final boolean b) {
    }
}
