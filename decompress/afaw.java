// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afaw implements afax
{
    private transient afaw a;
    
    protected afaw() {
    }
    
    protected abstract Object a(final Object p0);
    
    @Deprecated
    @Override
    public final Object apply(final Object o) {
        return this.d(o);
    }
    
    protected abstract Object b(final Object p0);
    
    public Object c(Object a) {
        if (a == null) {
            return null;
        }
        a = this.a(a);
        a.getClass();
        return a;
    }
    
    public Object d(Object b) {
        if (b == null) {
            return null;
        }
        b = this.b(b);
        b.getClass();
        return b;
    }
    
    public final afaw e() {
        afaw a;
        if ((a = this.a) == null) {
            a = new afav(this);
            this.a = a;
        }
        return a;
    }
}
