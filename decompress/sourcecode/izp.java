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

public final class izp implements View$OnClickListener
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public izp(final izr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izp(final izu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izp(final izv a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public izp(final izv a, final int b, final char[] array) {
        this.b = b;
        this.a = a;
    }
    
    public izp(final izv a, final int b, final int[] array) {
        this.b = b;
        this.a = a;
    }
    
    public izp(final izv a, final int b, final short[] array) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View view) {
        switch (this.b) {
            default: {
                final jez jez = (jez)this.a;
                if (jez.R.bR()) {
                    break;
                }
                final fyn d = jez.d;
                if (d != null) {
                    d.onClick(view);
                    final fyj fyj = new fyj();
                    fyj.y((View)jez.v);
                    ciq.b((ViewGroup)jez.f, (cim)fyj);
                    jez.h();
                    return;
                }
                break;
            }
            case 19: {
                ((jez)this.a).A.performClick();
                return;
            }
            case 18: {
                final jez jez2 = (jez)this.a;
                final aioe o = jez2.O;
                if (o != null) {
                    jez2.a.a(o);
                }
                return;
            }
            case 17: {
                ((jez)this.a).B.performClick();
                return;
            }
            case 16: {
                final jev jev = (jev)this.a;
                jev.d.onClick(view);
                final fyj fyj2 = new fyj();
                fyj2.y((View)jev.u);
                ciq.b((ViewGroup)jev.f, (cim)fyj2);
                jev.f();
                return;
            }
            case 15: {
                ((jev)this.a).z.performClick();
                return;
            }
            case 14: {
                ((jep)this.a).dismiss();
                return;
            }
            case 13: {
                final jau jau = (jau)this.a;
                jau.a.J(3, (wxz)new wws(wya.c(51992)), (alff)null);
                final jas b = jau.b;
                if (b != null) {
                    final FullscreenEngagementViewPresenter fullscreenEngagementViewPresenter = (FullscreenEngagementViewPresenter)b;
                    if (fullscreenEngagementViewPresenter.b.b.d()) {
                        fullscreenEngagementViewPresenter.b.e(1);
                    }
                }
                return;
            }
            case 12: {
                final jaf jaf = (jaf)this.a;
                final RecyclerView o2 = jaf.o;
                if (o2 != null) {
                    o2.an();
                }
                jaf.e.g(true, true);
                jaf.j.J(3, (wxz)jaf.d, (alff)null);
                return;
            }
            case 11: {
                final jaf jaf2 = (jaf)this.a;
                final RecyclerView o3 = jaf2.o;
                if (o3 != null) {
                    o3.an();
                }
                final arcv t = jaf2.t;
                final long a = t.a;
                if (a != -1L) {
                    ((abno)t.b).aa(a);
                }
                jaf2.e.g(true, true);
                jaf2.j.J(3, (wxz)jaf.c, (alff)null);
                return;
            }
            case 10: {
                ((jad)this.a).a(false);
                return;
            }
            case 9: {
                final soy i = ((izv)this.a).I;
                if (i != null) {
                    i.b();
                }
                return;
            }
            case 8: {
                final soy j = ((izv)this.a).I;
                if (j != null) {
                    j.b();
                }
                return;
            }
            case 7: {
                final soy k = ((izv)this.a).I;
                if (k != null) {
                    k.b();
                }
                return;
            }
            case 6: {
                final izv izv = (izv)this.a;
                final soy l = izv.I;
                if (l != null) {
                    final int q = izv.q;
                    final int r = izv.r;
                    final sha sha = (sha)l.a;
                    sha.c.j(q, r);
                    sha.b(sau.d);
                }
                return;
            }
            case 5: {
                final soy m = ((izv)this.a).I;
                if (m != null) {
                    final sha sha2 = (sha)m.a;
                    sha2.d(sha2.h);
                }
                return;
            }
            case 4: {
                final soy i2 = ((izv)this.a).I;
                if (i2 != null) {
                    final sha sha3 = (sha)i2.a;
                    sha3.d(sha3.g);
                }
                return;
            }
            case 3: {
                final soy i3 = ((izv)this.a).I;
                if (i3 != null) {
                    final sha sha4 = (sha)i3.a;
                    sha4.d(sha4.f);
                }
                return;
            }
            case 2: {
                final izu izu = (izu)this.a;
                final izt d2 = izu.d;
                if (d2 != null) {
                    final int i4 = izu.i;
                    final int j2 = izu.j;
                    final izk izk = (izk)d2;
                    izk.b.j(i4, j2);
                    izk.a(sau.d);
                }
                return;
            }
            case 1: {
                final Object r2 = ((izr)this.a).r;
                if (r2 != null) {
                    ainw ainw;
                    if ((ainw = ((ainv)r2).d) == null) {
                        ainw = ainw.a;
                    }
                    anss anss;
                    if ((anss = ainw.c) == null) {
                        anss = anss.a;
                    }
                    if (((agzd)anss).rs((agyr)AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
                        ainw ainw2;
                        if ((ainw2 = ((ainv)((izr)this.a).r).d) == null) {
                            ainw2 = ainw.a;
                        }
                        anss anss2;
                        if ((anss2 = ainw2.c) == null) {
                            anss2 = anss.a;
                        }
                        final ahje ahje = (ahje)((agzd)anss2).rr((agyr)AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                        final ArrayList list = new ArrayList((Collection<?>)ahje.n);
                        if ((ahje.b & 0x200) != 0x0) {
                            aioe aioe;
                            if ((aioe = ahje.m) == null) {
                                aioe = aioe.a;
                            }
                            list.add((Object)aioe);
                        }
                        ((izo)this.a).a((Object)ahje, (List)list);
                    }
                }
                return;
            }
            case 0: {
                final Object r3 = ((izr)this.a).r;
                if (r3 == null) {
                    break;
                }
                ainu ainu;
                if ((ainu = ((ainv)r3).e) == null) {
                    ainu = ainu.a;
                }
                anss anss3;
                if ((anss3 = ainu.b) == null) {
                    anss3 = anss.a;
                }
                if (((agzd)anss3).rs((agyr)AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
                    ainu ainu2;
                    if ((ainu2 = ((ainv)((izr)this.a).r).e) == null) {
                        ainu2 = ainu.a;
                    }
                    anss anss4;
                    if ((anss4 = ainu2.b) == null) {
                        anss4 = anss.a;
                    }
                    final ahje ahje2 = (ahje)((agzd)anss4).rr((agyr)AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                    final ArrayList list2 = new ArrayList((Collection<?>)ahje2.n);
                    if ((ahje2.b & 0x200) != 0x0) {
                        aioe aioe2;
                        if ((aioe2 = ahje2.m) == null) {
                            aioe2 = aioe.a;
                        }
                        list2.add((Object)aioe2);
                    }
                    ((izo)this.a).a((Object)ahje2, (List)list2);
                    break;
                }
                break;
            }
        }
    }
}
