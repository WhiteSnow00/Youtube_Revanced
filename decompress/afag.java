import java.util.Collections;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afag extends afbh
{
    public static final afag a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new afag();
    }
    
    private afag() {
    }
    
    private Object readResolve() {
        return afag.a;
    }
    
    @Override
    public final afbh a(final afbh afbh) {
        afbh.getClass();
        return afbh;
    }
    
    @Override
    public final afbh b(final afax afax) {
        afax.getClass();
        return afag.a;
    }
    
    @Override
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
    
    @Override
    public final Object d(final afci afci) {
        final Object a = afci.a();
        a.getClass();
        return a;
    }
    
    @Override
    public final Object e(final Object o) {
        o.getClass();
        return o;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this;
    }
    
    @Override
    public final Object f() {
        return null;
    }
    
    @Override
    public final Set g() {
        return Collections.emptySet();
    }
    
    @Override
    public final boolean h() {
        return false;
    }
    
    @Override
    public final int hashCode() {
        return 2040732332;
    }
    
    @Override
    public final String toString() {
        return "Optional.absent()";
    }
}
