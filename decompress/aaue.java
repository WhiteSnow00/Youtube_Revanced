import android.util.Range;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaue implements aaui
{
    public final aauj a;
    
    public aaue(final aauj a) {
        this.a = a;
    }
    
    public final double a(final int n, double b) {
        final aauj a = this.a;
        final Object e = a.e;
        final Object a2 = a.a;
        final double n2 = n;
        Double.isNaN(n2);
        final double c = ((aaud)a2).c(n2 / b);
        b = ((aaud)a.a).b();
        return (double)((Range)e).clamp((Comparable)(c * b)) / 10000.0;
    }
}
