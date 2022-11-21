import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqj implements bqv
{
    public final bqy a;
    public final bqo b;
    public final boolean c;
    
    public bqj(final bqy a, final bqo b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final List a(final int n, final azo azo, final int[] array) {
        final bqy a = this.a;
        final bqo b = this.b;
        final boolean c = this.c;
        final ett ett = new ett(a, 1);
        final afgc d = afgh.d();
        for (int i = 0; i < azo.a; ++i) {
            d.h(new bql(n, azo, i, b, array[i], c, (afbk)ett));
        }
        return d.g();
    }
}
