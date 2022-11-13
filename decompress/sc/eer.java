import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class eer extends iw
{
    public eem a;
    public nw b;
    private final ecf c;
    private View d;
    private int e;
    
    public eer(final ecf c) {
        this.e = -1;
        this.c = c;
    }
    
    @Override
    public final void py(final RecyclerView recyclerView, int i, int c) {
        c = ((eeb)this.c).e.c();
        if (c != -1) {
            i = c;
            while (true) {
                while (i >= 0) {
                    if (this.c.f(i)) {
                        final ComponentTree a = this.c.a(c);
                        final View d = this.d;
                        if (d != null && a != null && d != a.getLithoView()) {
                            d.setTranslationY(0.0f);
                            this.d = null;
                        }
                        if (i == -1 || a == null) {
                            this.a.o();
                            this.e = -1;
                            return;
                        }
                        if (c == i) {
                            final dvu lithoView = a.getLithoView();
                            if (lithoView == null) {
                                final boolean ar = this.a.l.ar();
                                final String e = a.e();
                                final boolean q = a.q;
                                final boolean s = a.s();
                                final StringBuilder sb = new StringBuilder("First visible sticky header item is null, RV.hasPendingAdapterUpdates: ");
                                sb.append(ar);
                                sb.append(", first visible component: ");
                                sb.append(e);
                                sb.append(", hasMounted: ");
                                sb.append(q);
                                sb.append(", isReleased: ");
                                sb.append(s);
                                coz.d(2, "StickyHeaderControllerImpl:FirstVisibleStickyHeaderNull", sb.toString());
                            }
                            else {
                                final ecf c2 = this.c;
                                ++i;
                                if (!c2.m(i) || !this.c.f(i)) {
                                    lithoView.setTranslationY((float)(-lithoView.getTop()));
                                }
                            }
                            this.d = (View)lithoView;
                            this.a.o();
                            this.e = -1;
                            return;
                        }
                        final int visibility = this.a.k.getVisibility();
                        final int n = 0;
                        Label_0438: {
                            if (visibility != 8) {
                                if (i == this.e) {
                                    break Label_0438;
                                }
                            }
                            final ComponentTree a2 = this.c.a(i);
                            final dvu lithoView2 = a2.getLithoView();
                            if (lithoView2 != null) {
                                if (lithoView2.getWindowToken() != null) {
                                    lithoView2.onStartTemporaryDetach();
                                }
                            }
                            final eem a3 = this.a;
                            if (a2.getLithoView() != null) {
                                final dvu lithoView3 = a2.getLithoView();
                                lithoView3.o = lithoView3.j;
                            }
                            a3.k.B(a2);
                            a3.r(a3.getWidth());
                            final eem a4 = this.a;
                            ((ComponentHost)a4.k).setVisibility(0);
                            a4.k.t();
                        }
                        final int e2 = ((eeb)this.c).e.e();
                        int min;
                        while (true) {
                            min = n;
                            if (c > e2) {
                                break;
                            }
                            if (this.c.f(c)) {
                                min = Math.min(this.b.T(c).getTop() - this.a.k.getBottom() + this.a.getPaddingTop(), 0);
                                break;
                            }
                            ++c;
                        }
                        this.a.k.setTranslationY((float)min);
                        this.e = i;
                        return;
                    }
                    else {
                        --i;
                    }
                }
                i = -1;
                continue;
            }
        }
    }
}
