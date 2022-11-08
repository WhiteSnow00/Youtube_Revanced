import java.util.Set;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aexq implements Serializable
{
    private static final long serialVersionUID = 0L;
    
    public static aexq i() {
        return (aexq)aewp.a;
    }
    
    public static aexq j(final Object o) {
        Object a;
        if (o == null) {
            a = aewp.a;
        }
        else {
            a = new aexw(o);
        }
        return (aexq)a;
    }
    
    public static aexq k(final Object o) {
        o.getClass();
        return (aexq)new aexw(o);
    }
    
    public abstract aexq a(final aexq p0);
    
    public abstract aexq b(final aexg p0);
    
    public abstract Object c();
    
    public abstract Object d(final aeyr p0);
    
    public abstract Object e(final Object p0);
    
    @Override
    public abstract boolean equals(final Object p0);
    
    public abstract Object f();
    
    public abstract Set g();
    
    public abstract boolean h();
    
    @Override
    public abstract int hashCode();
}
