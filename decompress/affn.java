// 
// Decompiled by Procyon v0.6.0
// 

final class affn extends affq
{
    final affr a;
    
    public affn(final affr a) {
        super(this.a = a);
    }
    
    @Override
    public final Object a(final int n) {
        return this.a.a[n];
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.containsKey(o);
    }
    
    @Override
    public final boolean remove(final Object o) {
        final int u = aegu.u(o);
        final int d = this.a.d(o, u);
        if (d != -1) {
            this.a.k(d, u);
            return true;
        }
        return false;
    }
}
