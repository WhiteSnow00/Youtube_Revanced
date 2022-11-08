import java.util.Collections;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewp extends aexq
{
    public static final aewp a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new aewp();
    }
    
    private aewp() {
    }
    
    private Object readResolve() {
        return aewp.a;
    }
    
    public final aexq a(final aexq aexq) {
        aexq.getClass();
        return aexq;
    }
    
    public final aexq b(final aexg aexg) {
        aexg.getClass();
        return aewp.a;
    }
    
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
    
    public final Object d(final aeyr aeyr) {
        final Object a = aeyr.a();
        a.getClass();
        return a;
    }
    
    public final Object e(final Object o) {
        o.getClass();
        return o;
    }
    
    public final boolean equals(final Object o) {
        return o == this;
    }
    
    public final Object f() {
        return null;
    }
    
    public final Set g() {
        return Collections.emptySet();
    }
    
    public final boolean h() {
        return false;
    }
    
    public final int hashCode() {
        return 2040732332;
    }
    
    public final String toString() {
        return "Optional.absent()";
    }
}
