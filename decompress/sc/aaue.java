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
    
    @Override
    public final double a(final int n, double c) {
        final aauj a = this.a;
        final Object e = a.e;
        final Object a2 = a.a;
        final double n2 = n;
        Double.isNaN(n2);
        c = ((aaud)a2).c(n2 / c);
        return (double)((Range)e).clamp((Comparable)(c * ((aaud)a.a).b())) / 10000.0;
    }
}
