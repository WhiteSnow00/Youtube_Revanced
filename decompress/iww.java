import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.content.res.Resources;
import android.view.View$OnLayoutChangeListener;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iww implements iuu
{
    private final ProgressBar a;
    private final boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    
    public iww(final View view, final vaf vaf) {
        alxp alxp;
        if ((alxp = vaf.b().e) == null) {
            alxp = alxp.a;
        }
        this.b = alxp.aX;
        final Resources resources = view.getResources();
        final ProgressBar a = (ProgressBar)view.findViewById(2131430451);
        this.a = a;
        final pee indeterminateDrawable = new pee(-1.0f, resources.getDimensionPixelSize(2131165558), resources.getDimensionPixelSize(2131165555), new int[] { resources.getColor(2131099753) });
        indeterminateDrawable.setAlpha(resources.getInteger(2131492881));
        a.setIndeterminateDrawable((Drawable)indeterminateDrawable);
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131165559);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165557);
        final int dimensionPixelSize3 = resources.getDimensionPixelSize(2131165560);
        final int dimensionPixelSize4 = resources.getDimensionPixelSize(2131165558);
        final int dimensionPixelSize5 = resources.getDimensionPixelSize(2131165556);
        a.getClass();
        final View view2 = (View)a.getParent();
        view2.getClass();
        final pee pee = (pee)a.getIndeterminateDrawable();
        pee.getClass();
        view2.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fya(a, pee, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5 + dimensionPixelSize5));
    }
    
    private final void a() {
        final boolean c = this.c;
        int visibility = 0;
        final boolean b = c && (!this.d || this.e) && !this.f;
        final ProgressBar a = this.a;
        if (!b) {
            visibility = 4;
        }
        a.setVisibility(visibility);
    }
    
    @Override
    public final void i(final boolean b) {
    }
    
    @Override
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
    }
    
    @Override
    public final void l(final boolean b) {
    }
    
    @Override
    public final void m(final boolean b) {
    }
    
    @Override
    public final void n(final trs trs) {
    }
    
    @Override
    public final void oY(final boolean b) {
    }
    
    @Override
    public final void oZ(final ControlsState controlsState) {
        final boolean c = this.c;
        final boolean b = controlsState.b;
        boolean c2;
        final boolean b2 = c2 = true;
        if (!b) {
            if (controlsState.a == abbx.a) {
                c2 = b2;
            }
            else {
                c2 = false;
            }
        }
        if (c != (this.c = c2)) {
            this.a();
        }
    }
    
    @Override
    public final void pa(final boolean b) {
    }
    
    @Override
    public final void pb(final boolean b) {
    }
    
    @Override
    public final void pc(final boolean d) {
        if (this.d == d) {
            return;
        }
        this.d = d;
        this.a();
    }
    
    @Override
    public final void r(final fkr fkr) {
    }
    
    @Override
    public final void s(final boolean e) {
        this.e = e;
        this.a();
    }
    
    @Override
    public final void t(final boolean f) {
        if (this.b) {
            if (this.f != f) {
                this.f = f;
                this.a();
            }
        }
    }
    
    @Override
    public final void u(final boolean b) {
    }
    
    @Override
    public final void v(final boolean b) {
    }
    
    @Override
    public final void w(final boolean b) {
    }
    
    @Override
    public final void x(final int n) {
    }
    
    @Override
    public final void y(final boolean b) {
    }
}
