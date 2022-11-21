// 
// Decompiled by Procyon v0.6.0
// 

final class bqm implements Comparable
{
    private final boolean a;
    private final boolean b;
    
    public bqm(final ayh ayh, final int n) {
        final int f = ayh.f;
        boolean a = true;
        if (0x1 != (f & 0x1)) {
            a = false;
        }
        this.a = a;
        this.b = bqy.k(n, false);
    }
    
    public final int a(final bqm bqm) {
        return afeq.b.e(this.b, bqm.b).e(this.a, bqm.a).a();
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return this.a((bqm)o);
    }
}
