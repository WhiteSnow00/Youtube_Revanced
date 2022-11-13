import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ikf
{
    public final int a;
    public final int b;
    public final Object c;
    
    public ikf(final int b, final int a, final SparseArray c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public ikf(final int b, final int a, final String c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public ikf(final int a, final String... c) {
        this.a = a;
        this.b = 0;
        this.c = c;
    }
    
    public ikf(final byte[] c, final int b, final int a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
}
