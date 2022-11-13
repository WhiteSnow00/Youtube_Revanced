import android.support.v7.widget.RecyclerView;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.FullscreenEngagementViewPresenter;
import android.view.ViewGroup;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jan implements View$OnClickListener
{
    final Object a;
    private final int b;
    
    public jan(final jap a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jan(final jas a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jan(final jat a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jan(final jat a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public jan(final jat a, final int b, final char[] array) {
        this.b = b;
        this.a = a;
    }
    
    public jan(final jat a, final int b, final int[] array) {
        this.b = b;
        this.a = a;
    }
    
    public jan(final jat a, final int b, final short[] array) {
        this.b = b;
        this.a = a;
    }
    
    public jan(final jbb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jan(final jbd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jan(final jbt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jan(final jfq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jan(final jfx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jan(final jgb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View view) {
        switch (this.b) {
            default: {
                final jgb jgb = (jgb)this.a;
                if (jgb.R.bR()) {
                    break;
                }
                final fyv d = jgb.d;
                if (d != null) {
                    d.onClick(view);
                    final fyr fyr = new fyr();
                    ((cin)fyr).y((View)jgb.v);
                    cir.b((ViewGroup)jgb.f, (cin)fyr);
                    jgb.h();
                    return;
                }
                break;
            }
            case 19: {
                ((jgb)this.a).A.performClick();
                return;
            }
            case 18: {
                final jgb jgb2 = (jgb)this.a;
                final aiqj o = jgb2.O;
                if (o != null) {
                    jgb2.a.a(o);
                }
                return;
            }
            case 17: {
                ((jgb)this.a).B.performClick();
                return;
            }
            case 16: {
                final jfx jfx = (jfx)this.a;
                jfx.d.onClick(view);
                final fyr fyr2 = new fyr();
                ((cin)fyr2).y((View)jfx.u);
                cir.b((ViewGroup)jfx.f, (cin)fyr2);
                jfx.f();
                return;
            }
            case 15: {
                ((jfx)this.a).z.performClick();
                return;
            }
            case 14: {
                ((jfq)this.a).dismiss();
                return;
            }
            case 13: {
                final jbt jbt = (jbt)this.a;
                jbt.a.J(3, (wzz)new wyt(xaa.c(51992)), (alhi)null);
                final jbr b = jbt.b;
                if (b != null) {
                    final FullscreenEngagementViewPresenter fullscreenEngagementViewPresenter = (FullscreenEngagementViewPresenter)b;
                    if (fullscreenEngagementViewPresenter.b.b.d()) {
                        fullscreenEngagementViewPresenter.b.e(1);
                    }
                }
                return;
            }
            case 12: {
                final jbd jbd = (jbd)this.a;
                final RecyclerView o2 = jbd.o;
                if (o2 != null) {
                    o2.an();
                }
                jbd.e.g(true, true);
                jbd.j.J(3, (wzz)jbd.d, (alhi)null);
                return;
            }
            case 11: {
                final jbd jbd2 = (jbd)this.a;
                final RecyclerView o3 = jbd2.o;
                if (o3 != null) {
                    o3.an();
                }
                final arfk t = jbd2.t;
                final long a = t.a;
                if (a != -1L) {
                    ((abpq)t.b).Z(a);
                }
                jbd2.e.g(true, true);
                jbd2.j.J(3, (wzz)jbd.c, (alhi)null);
                return;
            }
            case 10: {
                ((jbb)this.a).a(false);
                return;
            }
            case 9: {
                final tan i = ((jat)this.a).I;
                if (i != null) {
                    i.e();
                }
                return;
            }
            case 8: {
                final tan j = ((jat)this.a).I;
                if (j != null) {
                    j.e();
                }
                return;
            }
            case 7: {
                final tan k = ((jat)this.a).I;
                if (k != null) {
                    k.e();
                }
                return;
            }
            case 6: {
                final jat jat = (jat)this.a;
                final tan l = jat.I;
                if (l != null) {
                    final int q = jat.q;
                    final int r = jat.r;
                    final sjf sjf = (sjf)l.a;
                    sjf.c.j(q, r);
                    sjf.b(scz.d);
                }
                return;
            }
            case 5: {
                final tan m = ((jat)this.a).I;
                if (m != null) {
                    final sjf sjf2 = (sjf)m.a;
                    sjf2.d(sjf2.h);
                }
                return;
            }
            case 4: {
                final tan i2 = ((jat)this.a).I;
                if (i2 != null) {
                    final sjf sjf3 = (sjf)i2.a;
                    sjf3.d(sjf3.g);
                }
                return;
            }
            case 3: {
                final tan i3 = ((jat)this.a).I;
                if (i3 != null) {
                    final sjf sjf4 = (sjf)i3.a;
                    sjf4.d(sjf4.f);
                }
                return;
            }
            case 2: {
                final jas jas = (jas)this.a;
                final jar d2 = jas.d;
                if (d2 != null) {
                    final int i4 = jas.i;
                    final int j2 = jas.j;
                    final jai jai = (jai)d2;
                    jai.b.j(i4, j2);
                    jai.a(scz.d);
                }
                return;
            }
            case 1: {
                final Object r2 = ((jap)this.a).r;
                if (r2 != null) {
                    aiqb aiqb;
                    if ((aiqb = ((aiqa)r2).d) == null) {
                        aiqb = aiqb.a;
                    }
                    anuv anuv;
                    if ((anuv = aiqb.c) == null) {
                        anuv = anuv.a;
                    }
                    if (anuv.ry((ahaq)AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
                        aiqb aiqb2;
                        if ((aiqb2 = ((aiqa)((jap)this.a).r).d) == null) {
                            aiqb2 = aiqb.a;
                        }
                        anuv anuv2;
                        if ((anuv2 = aiqb2.c) == null) {
                            anuv2 = anuv.a;
                        }
                        final ahlc ahlc = (ahlc)anuv2.rx((ahaq)AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                        final ArrayList list = new ArrayList((Collection<?>)ahlc.n);
                        if ((ahlc.b & 0x200) != 0x0) {
                            aiqj aiqj;
                            if ((aiqj = ahlc.m) == null) {
                                aiqj = aiqj.a;
                            }
                            list.add((Object)aiqj);
                        }
                        ((jam)this.a).a((Object)ahlc, (List)list);
                    }
                }
                return;
            }
            case 0: {
                final Object r3 = ((jap)this.a).r;
                if (r3 == null) {
                    break;
                }
                aipz aipz;
                if ((aipz = ((aiqa)r3).e) == null) {
                    aipz = aipz.a;
                }
                anuv anuv3;
                if ((anuv3 = aipz.b) == null) {
                    anuv3 = anuv.a;
                }
                if (anuv3.ry((ahaq)AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
                    aipz aipz2;
                    if ((aipz2 = ((aiqa)((jap)this.a).r).e) == null) {
                        aipz2 = aipz.a;
                    }
                    anuv anuv4;
                    if ((anuv4 = aipz2.b) == null) {
                        anuv4 = anuv.a;
                    }
                    final ahlc ahlc2 = (ahlc)anuv4.rx((ahaq)AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                    final ArrayList list2 = new ArrayList((Collection<?>)ahlc2.n);
                    if ((ahlc2.b & 0x200) != 0x0) {
                        aiqj aiqj2;
                        if ((aiqj2 = ahlc2.m) == null) {
                            aiqj2 = aiqj.a;
                        }
                        list2.add((Object)aiqj2);
                    }
                    ((jam)this.a).a((Object)ahlc2, (List)list2);
                    break;
                }
                break;
            }
        }
    }
}
