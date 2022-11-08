import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexh implements Serializable, aexg
{
    private static final long serialVersionUID = 0L;
    private final Object a;
    
    public aexh() {
        this.a = null;
    }
    
    public final Object apply(final Object o) {
        return null;
    }
    
    @Override
    public final boolean equals(Object a) {
        if (a instanceof aexh) {
            a = ((aexh)a).a;
            return aeda.v(null, null);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return 0;
    }
    
    @Override
    public final String toString() {
        return "Functions.constant(null)";
    }
}
