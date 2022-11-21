import java.util.Collections;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afbn extends afbh
{
    private static final long serialVersionUID = 0L;
    public final Object a;
    
    public afbn(final Object a) {
        this.a = a;
    }
    
    @Override
    public final afbh a(final afbh afbh) {
        afbh.getClass();
        return this;
    }
    
    @Override
    public final afbh b(final afax afax) {
        final Object apply = afax.apply(this.a);
        apply.getClass();
        return new afbn(apply);
    }
    
    @Override
    public final Object c() {
        return this.a;
    }
    
    @Override
    public final Object d(final afci afci) {
        afci.getClass();
        return this.a;
    }
    
    @Override
    public final Object e(final Object o) {
        o.getClass();
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof afbn && this.a.equals(((afbn)o).a);
    }
    
    @Override
    public final Object f() {
        return this.a;
    }
    
    @Override
    public final Set g() {
        return Collections.singleton(this.a);
    }
    
    @Override
    public final boolean h() {
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Optional.of(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
