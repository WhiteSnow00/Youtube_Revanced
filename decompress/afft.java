// 
// Decompiled by Procyon v0.6.0
// 

public final class afft extends afgj
{
    public afft() {
    }
    
    public afft(final int n) {
        super(n);
    }
    
    public final affv a() {
        final int b = this.b;
        if (b == 0) {
            return (affv)afjw.b;
        }
        return (affv)new afjw(this.a, b);
    }
    
    @Deprecated
    @Override
    public final afgm b() {
        return this.a();
    }
    
    @Override
    public final /* bridge */ afgm c() {
        return this.a();
    }
    
    public final void d(final Object o, final Object o2) {
        super.g(o, o2);
    }
    
    public final void e(final Iterable iterable) {
        super.j(iterable);
    }
}
