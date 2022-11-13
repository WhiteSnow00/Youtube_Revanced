import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ejr implements eka
{
    private final boolean a;
    
    public ejr(final Boolean b) {
        this.a = (b != null && b);
    }
    
    public final eka d() {
        return (eka)new ejr(this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ejr && this.a == ((ejr)o).a);
    }
    
    public final Boolean g() {
        return this.a;
    }
    
    public final Double h() {
        double n;
        if (!this.a) {
            n = 0.0;
        }
        else {
            n = 1.0;
        }
        return n;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }
    
    public final String i() {
        return Boolean.toString(this.a);
    }
    
    public final Iterator l() {
        return null;
    }
    
    public final eka lA(final String s, final hyx hyx, final List list) {
        if ("toString".equals(s)) {
            return (eka)new ekd(this.i());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", this.i(), s));
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
}
