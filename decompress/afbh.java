import java.util.Set;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afbh implements Serializable
{
    private static final long serialVersionUID = 0L;
    
    public static afbh i() {
        return afag.a;
    }
    
    public static afbh j(final Object o) {
        afbh a;
        if (o == null) {
            a = afag.a;
        }
        else {
            a = new afbn(o);
        }
        return a;
    }
    
    public static afbh k(final Object o) {
        o.getClass();
        return new afbn(o);
    }
    
    public abstract afbh a(final afbh p0);
    
    public abstract afbh b(final afax p0);
    
    public abstract Object c();
    
    public abstract Object d(final afci p0);
    
    public abstract Object e(final Object p0);
    
    @Override
    public abstract boolean equals(final Object p0);
    
    public abstract Object f();
    
    public abstract Set g();
    
    public abstract boolean h();
    
    @Override
    public abstract int hashCode();
}
