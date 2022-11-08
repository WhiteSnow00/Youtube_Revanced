import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ActionMenuView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jx implements ik
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public jx(final ActionMenuView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jx(final Toolbar a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jx(final ge a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jx(final np a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void U(final im im) {
        final int b = this.b;
        if (b == 0) {
            final ik d = ((ActionMenuView)this.a).d;
            if (d != null) {
                d.U(im);
            }
            return;
        }
        if (b != 1) {
            if (b != 2) {
                if (!((Toolbar)this.a).a.j()) {
                    ((Toolbar)this.a).r.c((Menu)im);
                }
                final ik x = ((Toolbar)this.a).x;
                if (x != null) {
                    x.U(im);
                }
            }
            return;
        }
        if (((ge)this.a).a.w()) {
            ((ge)this.a).b.onPanelClosed(108, (Menu)im);
            return;
        }
        if (((ge)this.a).b.onPreparePanel(0, (View)null, (Menu)im)) {
            ((ge)this.a).b.onMenuOpened(108, (Menu)im);
        }
    }
    
    public final boolean Y(final im im, final MenuItem menuItem) {
        final int b = this.b;
        final boolean b2 = false;
        if (b == 0) {
            final qpt e = ((ActionMenuView)this.a).e;
            boolean b3 = b2;
            if (e != null) {
                if (((Toolbar)e.a).r.e(menuItem)) {
                    b3 = true;
                }
                else {
                    final pu t = ((Toolbar)e.a).t;
                    b3 = b2;
                    if (t != null) {
                        if (t.a(menuItem)) {
                            return true;
                        }
                        b3 = b2;
                    }
                }
            }
            return b3;
        }
        if (b != 2) {
            return false;
        }
        final no d = ((np)this.a).d;
        return d != null && d.a(menuItem);
    }
}
