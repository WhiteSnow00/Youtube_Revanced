import java.util.Locale;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aukl implements Serializable
{
    private static final long serialVersionUID = 1971226328211649661L;
    
    protected abstract long a();
    
    protected auih b() {
        throw null;
    }
    
    public abstract auij c();
    
    public final int d() {
        return this.c().a(this.a());
    }
    
    public final String e(final Locale locale) {
        return this.c().l(this.a(), locale);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof aukl)) {
            return false;
        }
        final aukl aukl = (aukl)o;
        return this.d() == aukl.d() && this.g().equals(aukl.g()) && atqz.k(this.b(), aukl.b());
    }
    
    public final String f(final Locale locale) {
        return this.c().n(this.a(), locale);
    }
    
    public final auil g() {
        return this.c().p();
    }
    
    @Override
    public final int hashCode() {
        return this.d() * 17 + this.g().hashCode() + this.b().hashCode();
    }
    
    @Override
    public final String toString() {
        final String o = this.c().o();
        final StringBuilder sb = new StringBuilder("Property[");
        sb.append(o);
        sb.append("]");
        return sb.toString();
    }
}
