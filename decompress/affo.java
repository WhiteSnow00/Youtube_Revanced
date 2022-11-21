// 
// Decompiled by Procyon v0.6.0
// 

final class affo extends affq
{
    final affr a;
    
    public affo(final affr a) {
        super(this.a = a);
    }
    
    @Override
    public final Object a(final int n) {
        return this.a.b[n];
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.containsValue(o);
    }
    
    @Override
    public final boolean remove(final Object o) {
        final int u = aegu.u(o);
        final int f = this.a.f(o, u);
        if (f != -1) {
            this.a.l(f, u);
            return true;
        }
        return false;
    }
}
