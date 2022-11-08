import android.view.View;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

final class iug extends akv
{
    final /* synthetic */ iuh a;
    
    public iug(final iuh a) {
        this.a = a;
    }
    
    private final String j(final CharSequence charSequence, final int n) {
        final iuh a = this.a;
        final CharSequence i = a.i;
        if (charSequence != null && i != null) {
            final Resources b = a.b;
            return b.getString(n, new Object[] { tmy.ad(b, charSequence), tmy.ad(this.a.b, i) });
        }
        return null;
    }
    
    public final void c(final View view, final aol aol) {
        super.c(view, aol);
        final iuh a = this.a;
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
            aol.u(charSequence);
        }
        final iuh a2 = this.a;
        final Resources b = a2.b;
        int n;
        if (!a2.f) {
            n = 2132017336;
        }
        else {
            n = 2132017332;
        }
        aol.A((CharSequence)b.getString(n));
    }
}
