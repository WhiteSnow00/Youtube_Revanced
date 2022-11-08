import j$.util.Objects;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxs
{
    public final double a;
    public final double b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final Rect f;
    
    public oxs(final double a, final double b, final Rect c, final Rect d, final Rect e, final Rect f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof oxs)) {
            return false;
        }
        final oxs oxs = (oxs)o;
        return this.a == oxs.a && this.b == oxs.b && Objects.equals((Object)this.c, (Object)oxs.c) && Objects.equals((Object)this.d, (Object)oxs.d) && Objects.equals((Object)this.e, (Object)oxs.e) && Objects.equals((Object)this.f, (Object)oxs.f);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f });
    }
}
