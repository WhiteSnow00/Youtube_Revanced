import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class fk implements hl
{
    final fw a;
    private final hl b;
    
    public fk(final fw a, final hl b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final hm hm) {
        this.b.a(hm);
        final fw a = this.a;
        if (a.r != null) {
            a.k.getDecorView().removeCallbacks(this.a.s);
        }
        final fw a2 = this.a;
        if (a2.q != null) {
            a2.T();
            final fw a3 = this.a;
            final bx ab = anb.aB((View)a3.q);
            ab.p(0.0f);
            a3.I = ab;
            this.a.I.s((anl)new fj(this));
        }
        final fw a4 = this.a;
        final fb l = a4.l;
        if (l != null) {
            l.onSupportActionModeFinished(a4.p);
        }
        final fw a5 = this.a;
        a5.p = null;
        anb.L((View)a5.u);
        this.a.V();
    }
    
    public final boolean b(final hm hm, final MenuItem menuItem) {
        return this.b.b(hm, menuItem);
    }
    
    public final boolean c(final hm hm, final Menu menu) {
        return this.b.c(hm, menu);
    }
    
    public final boolean d(final hm hm, final Menu menu) {
        anb.L((View)this.a.u);
        return this.b.d(hm, menu);
    }
}
