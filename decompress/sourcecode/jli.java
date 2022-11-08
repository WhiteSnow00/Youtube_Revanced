import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.content.res.Resources;
import android.content.Context;
import android.animation.Animator;
import android.animation.LayoutTransition;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import android.view.ViewGroup;
import android.animation.AnimatorSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jli
{
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public Runnable e;
    public Runnable f;
    public Runnable g;
    public Runnable h;
    public Runnable i;
    public Runnable j;
    public AnimatorSet k;
    public ViewGroup l;
    public SlimStatusBar m;
    public LayoutTransition n;
    public int o;
    private Animator p;
    
    public jli(final Context context) {
        final Resources resources = context.getResources();
        this.a = resources.getColor(2131102086);
        this.b = resources.getColor(2131102087);
        this.c = resources.getColor(2131102088);
        this.d = resources.getInteger(17694722);
    }
    
    public static boolean g(final ViewGroup viewGroup, final SlimStatusBar slimStatusBar) {
        return viewGroup.indexOfChild((View)slimStatusBar) >= 0;
    }
    
    private final void h() {
        this.l.removeCallbacks(this.e);
        this.l.removeCallbacks(this.f);
        this.l.removeCallbacks(this.h);
        this.l.removeCallbacks(this.g);
        this.l.removeCallbacks(this.i);
        this.l.removeCallbacks(this.j);
    }
    
    public final Runnable a(final boolean b, final boolean b2) {
        return new jlg(this, b, b2, 0);
    }
    
    public final void b() {
        final Animator p = this.p;
        if (p != null) {
            p.cancel();
            this.p = null;
        }
        final AnimatorSet k = this.k;
        if (k != null) {
            k.cancel();
            this.k = null;
        }
    }
    
    public final void c() {
        this.h();
        this.b();
        this.m.a(2132018833);
        this.m.setBackgroundColor(this.b);
        this.l.post(this.f);
    }
    
    public final void d() {
        this.h();
        this.m.a(2132017563);
        this.m.setBackgroundColor(this.b);
        this.l.post(this.h);
    }
    
    public final void e() {
        final LayoutTransition n = this.n;
        final SlimStatusBar m = this.m;
        n.setAnimator(3, (Animator)ObjectAnimator.ofPropertyValuesHolder((Object)m, new PropertyValuesHolder[] { PropertyValuesHolder.ofInt("top", new int[] { m.getTop(), m.getBottom() }) }));
    }
    
    public final void f(final boolean b, final boolean b2) {
        this.l.setLayoutTransition(this.n);
        final int o = this.o;
        if (o != 0) {
            if (o != 1) {
                if (o != 2) {
                    if (o != 3 && o != 4) {
                        if (!b) {
                            this.h();
                            this.c();
                            return;
                        }
                        if (!b2) {
                            this.h();
                            this.l.post(this.j);
                            return;
                        }
                        this.d();
                    }
                    else {
                        if (!b) {
                            this.h();
                            this.c();
                            return;
                        }
                        if (b2) {
                            this.d();
                        }
                    }
                }
                else {
                    this.h();
                    if (!b) {
                        this.c();
                        return;
                    }
                    this.h();
                    this.b();
                    this.o = 3;
                    this.m.a(2132018834);
                    (this.p = jfi.l((View)this.m, this.b, this.a, 250L)).addListener((Animator$AnimatorListener)new gsu(this, 3));
                    this.p.start();
                    this.l.post(this.e);
                    if (b2) {
                        this.l.postDelayed(this.i, 2000L);
                        return;
                    }
                    this.l.postDelayed(this.j, 2000L);
                }
            }
            else if (b) {
                this.h();
                this.o = 0;
                if (b2) {
                    this.d();
                }
            }
        }
        else {
            this.h();
            if (!b) {
                this.o = 1;
                this.l.postDelayed(this.g, 3000L);
                return;
            }
            if (b2) {
                this.d();
            }
        }
    }
}
