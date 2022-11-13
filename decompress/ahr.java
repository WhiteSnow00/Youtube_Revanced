import android.content.res.Resources$Theme;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahr
{
    final Resources a;
    final Resources$Theme b;
    
    public ahr(final Resources a, final Resources$Theme b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final ahr ahr = (ahr)o;
                if (this.a.equals(ahr.a) && akp.b((Object)this.b, (Object)ahr.b)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return akp.a(new Object[] { this.a, this.b });
    }
}
