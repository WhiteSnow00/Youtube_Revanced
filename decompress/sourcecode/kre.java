import java.util.Set;
import android.animation.Animator;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
import android.view.View;
import android.animation.Animator$AnimatorListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kre implements Animator$AnimatorListener
{
    public View a;
    public int b;
    final /* synthetic */ SwipeToContainerFrameLayout c;
    private boolean d;
    
    public kre(final SwipeToContainerFrameLayout c) {
        this.c = c;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.d = true;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final View a = this.a;
        if (a != null) {
            if (!this.d) {
                a.setVisibility(8);
                final SwipeToContainerFrameLayout c = this.c;
                final int b = this.b;
                c.c = b;
                this.a = null;
                final krd f = c.f;
                if (f != null) {
                    if (b == 1) {
                        final int d = c.d;
                        final krc krc = (krc)f;
                        krc.n = true;
                        krc.q(d, 1.0f);
                        if (krc.o == null) {
                            final krb j = krc.j;
                            final hhl q = j.e.q;
                            if (q != null) {
                                q.ax.B();
                            }
                            else {
                                j.b = true;
                            }
                        }
                        krc.i.tr((Object)new atvw(0, null, null));
                        krc.h.q(2);
                        return;
                    }
                    final krc krc2 = (krc)f;
                    krc2.n = false;
                    krc2.e.k(2);
                    final hdv v = krc2.v;
                    ((Set)v.a).remove(1);
                    v.h();
                    if (krc2.q != null) {
                        final ct i = krc2.c.i();
                        i.n((br)krc2.q);
                        i.a();
                        if (!krc2.p) {
                            final wwv q2 = ((hhl)krc2.q.ax.a).q();
                            if (q2 != null) {
                                q2.J(3, (wxz)new wws(wya.c(53010)), (alff)null);
                            }
                        }
                    }
                    krc2.j.a();
                    krc2.b.h(0);
                    krc2.u.f(krc2.r);
                    krc2.q = null;
                    krc2.i.tr((Object)new atvw(1, null, null));
                    krc2.h.g();
                    krc2.p = false;
                    krc2.o = null;
                }
            }
        }
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.d = false;
    }
}
