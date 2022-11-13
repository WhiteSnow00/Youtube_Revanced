import android.view.View;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

final class ive extends akw
{
    final ivf a;
    
    public ive(final ivf a) {
        this.a = a;
    }
    
    private final String j(final CharSequence charSequence, final int n) {
        final ivf a = this.a;
        final CharSequence i = a.i;
        if (charSequence != null && i != null) {
            final Resources b = a.b;
            return b.getString(n, new Object[] { tpe.ad(b, charSequence), tpe.ad(this.a.b, i) });
        }
        return null;
    }
    
    public final void c(final View view, final aom aom) {
        super.c(view, aom);
        final ivf a = this.a;
        CharSequence charSequence;
        if (a.i == null) {
            charSequence = null;
        }
        else if (a.f) {
            charSequence = this.j(a.h, 2132017335);
        }
        else {
            charSequence = this.j(a.g, 2132017331);
        }
        if (charSequence != null) {
            aom.u(charSequence);
        }
        final ivf a2 = this.a;
        final Resources b = a2.b;
        int n;
        if (!a2.f) {
            n = 2132017336;
        }
        else {
            n = 2132017332;
        }
        aom.A((CharSequence)b.getString(n));
    }
}
