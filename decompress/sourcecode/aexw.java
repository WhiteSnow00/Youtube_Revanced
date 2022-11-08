import java.util.Collections;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexw extends aexq
{
    private static final long serialVersionUID = 0L;
    public final Object a;
    
    public aexw(final Object a) {
        this.a = a;
    }
    
    public final aexq a(final aexq aexq) {
        aexq.getClass();
        return this;
    }
    
    public final aexq b(final aexg aexg) {
        final Object apply = aexg.apply(this.a);
        apply.getClass();
        return new aexw(apply);
    }
    
    public final Object c() {
        return this.a;
    }
    
    public final Object d(final aeyr aeyr) {
        aeyr.getClass();
        return this.a;
    }
    
    public final Object e(final Object o) {
        o.getClass();
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof aexw && this.a.equals(((aexw)o).a);
    }
    
    public final Object f() {
        return this.a;
    }
    
    public final Set g() {
        return Collections.singleton(this.a);
    }
    
    public final boolean h() {
        return true;
    }
    
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Optional.of(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
