import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acnp implements Serializable, acnq
{
    private static final long serialVersionUID = 3447871915224247120L;
    private final Class a;
    private final Class b;
    
    public acnp(final Class a, final Class b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Class a() {
        return this.a;
    }
    
    @Override
    public final Class annotationType() {
        return acnq.class;
    }
    
    @Override
    public final Class b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acnq) {
            final acnq acnq = (acnq)o;
            if (this.a.equals(acnq.a()) && this.b.equals(acnq.b())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xE19A8550) + (this.b.hashCode() ^ 0x33A6F58C);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("@com.google.android.libraries.youtube.rendering.presenter.animation.dagger.PresenterClassPairKey(first=");
        sb.append(this.a);
        sb.append(", second=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
