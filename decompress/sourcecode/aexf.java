// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aexf implements aexg
{
    private transient aexf a;
    
    protected aexf() {
    }
    
    protected abstract Object a(final Object p0);
    
    @Deprecated
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
    
    public final aexf e() {
        aexf a;
        if ((a = this.a) == null) {
            a = new aexe(this);
            this.a = a;
        }
        return a;
    }
}
