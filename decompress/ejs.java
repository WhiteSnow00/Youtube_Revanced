import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ejs implements eka
{
    public final eka a;
    public final String b;
    
    public ejs() {
        final eka f = ejs.f;
        throw null;
    }
    
    public ejs(final String b) {
        this.a = ejs.f;
        this.b = b;
    }
    
    public ejs(final String b, final eka a) {
        this.a = a;
        this.b = b;
    }
    
    public final eka d() {
        return (eka)new ejs(this.b, this.a.d());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ejs)) {
            return false;
        }
        final String b = this.b;
        final ejs ejs = (ejs)o;
        return b.equals(ejs.b) && this.a.equals(ejs.a);
    }
    
    public final Boolean g() {
        throw new IllegalStateException("Control is not a boolean");
    }
    
    public final Double h() {
        throw new IllegalStateException("Control is not a double");
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() * 31 + this.a.hashCode();
    }
    
    public final String i() {
        throw new IllegalStateException("Control is not a String");
    }
    
    public final Iterator l() {
        return null;
    }
    
    public final eka lA(final String s, final hyx hyx, final List list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
