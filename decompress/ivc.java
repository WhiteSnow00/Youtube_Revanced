import android.os.Bundle;
import com.google.android.libraries.youtube.ads.player.ui.AdProgressTextView;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Locale;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.Map;
import android.view.View;
import android.widget.ImageView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivc implements View$OnClickListener
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public ivc(final itu a, final wzz b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ivc(final ivf a, final aezp b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ivc(final ivf a, final pvh b, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ivc(final ivr b, final ImageView a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ivc(final iwf a, final sli b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ivc(final jbn a, final vcy b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ivc(final jdd a, final aiqj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ivc(final jdd a, final aonv b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ivc(final jfx a, final aaih b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ivc(final jfx a, final vcy b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ivc(final jgb a, final aaih b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ivc(final jgb a, final vcy b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ivc(final jgn b, final jgj a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ivc(final jip b, final jio a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ivc(final jki a, final vcy b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ivc(final jkv a, final vcy b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ivc(final jlc a, final aiqj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onClick(final View view) {
        switch (this.c) {
            default: {
                ((jlc)this.a).a.c((aiqj)this.b, (Map)null);
                return;
            }
            case 19: {
                final Object a = this.a;
                final Object b = this.b;
                final aiqj a2 = ((jkv)a).a;
                if (a2 != null) {
                    ((vcy)b).c(a2, (Map)null);
                }
                return;
            }
            case 18: {
                final Object a3 = this.a;
                final Object b2 = this.b;
                alxw alxw;
                if ((alxw = ((arwh)((jki)a3).a).f().e) == null) {
                    alxw = alxw.a;
                }
                final String ag = alxw.aG;
                final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
                final ahbf urlEndpoint = UrlEndpointOuterClass.urlEndpoint;
                final ahaz builder = ((ahbh)apis.a).createBuilder();
                final String language = Locale.getDefault().getLanguage();
                final String value = String.valueOf(ag);
                final String value2 = String.valueOf(language);
                builder.copyOnWrite();
                final apis apis = (apis)builder.instance;
                apis.b |= 0x1;
                apis.c = value.concat(value2);
                ahbb.e((ahaq)urlEndpoint, (Object)builder.build());
                ((vcy)b2).a((aiqj)((ahaz)ahbb).build());
                return;
            }
            case 17: {
                final pvh o = ((jip)this.b).o;
                if (o != null) {
                    final acyn f = ((jio)this.a).f;
                    final jih jih = (jih)o.a;
                    jih.af.e();
                    jih.aA.setText((CharSequence)f.b);
                    tpe.q(jih.aA);
                    jih.bs();
                }
                return;
            }
            case 16: {
                ((jgn)this.b).a.c(((jgj)this.a).a(), (Map)null);
                return;
            }
            case 15: {
                final Object a4 = this.a;
                final Object b3 = this.b;
                final anio k = ((jgb)a4).K;
                if (k != null) {
                    ((aaih)b3).b(k.h, aahz.a(false));
                }
                return;
            }
            case 14: {
                final Object a5 = this.a;
                final Object b4 = this.b;
                final aiqj n = ((jgb)a5).N;
                if (n != null) {
                    ((vcy)b4).a(n);
                }
                return;
            }
            case 13: {
                final Object a6 = this.a;
                final Object b5 = this.b;
                final anio i = ((jgb)a6).K;
                if (i != null) {
                    anuv anuv;
                    if ((anuv = i.S) == null) {
                        anuv = anuv.a;
                    }
                    aiqj aiqj;
                    if ((aiqj = ((aicz)((ahbc)anuv).rx((ahaq)ButtonRendererOuterClass.buttonRenderer)).p) == null) {
                        aiqj = aiqj.a;
                    }
                    ((vcy)b5).a(aiqj);
                }
                return;
            }
            case 12: {
                final Object a7 = this.a;
                final Object b6 = this.b;
                final aiqj m = ((jgb)a7).M;
                if (m != null) {
                    ((vcy)b6).a(m);
                }
                return;
            }
            case 11: {
                final Object a8 = this.a;
                final Object b7 = this.b;
                final aiqj l = ((jgb)a8).L;
                if (l != null) {
                    ((vcy)b7).a(l);
                }
                return;
            }
            case 10: {
                final Object a9 = this.a;
                final Object b8 = this.b;
                final anio e = ((jfx)a9).E;
                if (e != null) {
                    ((aaih)b8).b(e.h, aahz.a(false));
                }
                return;
            }
            case 9: {
                final Object a10 = this.a;
                final Object b9 = this.b;
                final anio e2 = ((jfx)a10).E;
                if (e2 != null) {
                    anuv anuv2;
                    if ((anuv2 = e2.S) == null) {
                        anuv2 = anuv.a;
                    }
                    aiqj aiqj2;
                    if ((aiqj2 = ((aicz)((ahbc)anuv2).rx((ahaq)ButtonRendererOuterClass.buttonRenderer)).p) == null) {
                        aiqj2 = aiqj.a;
                    }
                    ((vcy)b9).a(aiqj2);
                }
                return;
            }
            case 8: {
                final Object a11 = this.a;
                final Object b10 = this.b;
                final aiqj f2 = ((jfx)a11).F;
                if (f2 != null) {
                    ((vcy)b10).c(f2, (Map)null);
                }
                return;
            }
            case 7: {
                final Object a12 = this.a;
                aonx aonx;
                if ((aonx = ((aonv)this.b).g) == null) {
                    aonx = aonx.a;
                }
                if (((ahbc)aonx).ry((ahaq)aonu.b)) {
                    teu.m(((jdd)a12).d.b((aezf)iyl.e), (tes)jdb.a);
                }
                final jdd jdd = (jdd)a12;
                jdd.b.run();
                final wyw f3 = jdd.f;
                if (f3 == null) {
                    return;
                }
                f3.J(3, (wzz)new wyt(xaa.c(87958)), (alhi)null);
                return;
            }
            case 6: {
                final Object a13 = this.a;
                final Object b11 = this.b;
                final jdd jdd2 = (jdd)a13;
                jdd2.a.c((aiqj)b11, (Map)null);
                final aonv g = jdd2.g;
                Label_1010: {
                    if (g != null) {
                        final int j = g.j;
                        final int ax = aqsx.aX(j);
                        if (ax != 0) {
                            if (ax == 2) {
                                break Label_1010;
                            }
                        }
                        final int ax2 = aqsx.aX(j);
                        if (ax2 != 0) {
                            if (ax2 != 1) {
                                jdd2.b.run();
                            }
                        }
                    }
                }
                final pvh j2 = jdd2.j;
                if (j2 != null) {
                    j2.s();
                }
                final wyw f4 = jdd2.f;
                if (f4 != null) {
                    final ahab b12 = jdd2.b();
                    if (b12 != null) {
                        f4.J(3, (wzz)new wyt(b12), (alhi)null);
                    }
                }
                return;
            }
            case 5: {
                final Object a14 = this.a;
                final Object b13 = this.b;
                final aiqj a15 = ((jbn)a14).a;
                if (a15 != null) {
                    ((vcy)b13).c(a15, (Map)null);
                }
                return;
            }
            case 4: {
                final Object a16 = this.a;
                final Object b14 = this.b;
                final iwf iwf = (iwf)a16;
                iwf.j.getClass();
                final slh slh = (slh)b14;
                if (slh.e && ((AdProgressTextView)slh.c).a.a) {
                    final Bundle bundle = new Bundle();
                    bundle.putBoolean("menu_as_bottom_sheet", true);
                    iwf.j.a(bundle);
                }
                return;
            }
            case 3: {
                final Object b15 = this.b;
                final Object a17 = this.a;
                final ivr ivr = (ivr)b15;
                if (ivr.g.cK()) {
                    if (((ImageView)a17).isSelected()) {
                        ivr.e.l();
                    }
                    else {
                        ivr.e.k();
                    }
                }
                else {
                    ((kug)ivr.d.a()).p(((ImageView)a17).isSelected() ^ true);
                }
                Boolean b16;
                if (ivr.a.ba()) {
                    b16 = (Boolean)ivr.a.aX();
                }
                else {
                    b16 = null;
                }
                if (b16 != null && b16) {
                    return;
                }
                ivr.c.J(3, (wzz)new wyt(xaa.c(54319)), (alhi)null);
                return;
            }
            case 2: {
                ((ivf)this.a).c.a((aiqj)((aezp)this.b).c());
                return;
            }
            case 1: {
                final Object a18 = this.a;
                final Object b17 = this.b;
                final itu itu = (itu)a18;
                itu.c(true);
                ((wyw)itu.a.a()).J(3, (wzz)b17, (alhi)null);
                return;
            }
            case 0: {
                final Object a19 = this.a;
                final Object b18 = this.b;
                final ivf ivf = (ivf)a19;
                ivf.f ^= true;
                ivf.h();
                ((pvh)b18).s();
                final ahaz builder2 = ((ahbh)alhi.a).createBuilder();
                final ahaz builder3 = ((ahbh)alhq.a).createBuilder();
                final boolean f5 = ivf.f;
                builder3.copyOnWrite();
                final alhq alhq = (alhq)builder3.instance;
                alhq.b |= 0x1;
                alhq.c = f5;
                builder2.copyOnWrite();
                final alhi alhi = (alhi)builder2.instance;
                final alhq x = (alhq)builder3.build();
                x.getClass();
                alhi.x = x;
                alhi.c |= 0x1000;
                ivf.a.J(3, (wzz)new wyt(xaa.c(86640)), (alhi)builder2.build());
            }
        }
    }
}
