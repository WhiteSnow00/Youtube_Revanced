import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.support.v7.widget.Toolbar;
import android.view.View$OnClickListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import com.google.android.apps.youtube.app.offline.ui.UploadArrowView;
import java.util.function.Consumer;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import j$.util.Optional;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsf implements asjm
{
    public final Object a;
    private final int b;
    
    public hsf(final Activity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hsf(final EditVideoActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hsf(final fet a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hsf(final hsg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hsf(final htr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hsf(final huc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hsf(final hvi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hsf(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hsf(final hyi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hsf(final iae a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hsf(final qcy a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public hsf(final tgd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object a) {
        final int b = this.b;
        final aiqj aiqj = null;
        final boolean b2 = true;
        switch (b) {
            default: {
                final Object a2 = this.a;
                final wbb wbb = (wbb)a;
                final iae iae = (iae)a2;
                final boolean d = iae.a.l() ^ true;
                if (iae.f != null) {
                    final ahaz builder = ((ahbh)alhi.a).createBuilder();
                    final ahaz builder2 = ((ahbh)alin.a).createBuilder();
                    builder2.copyOnWrite();
                    final alin alin = (alin)builder2.instance;
                    alin.c = 1;
                    alin.b |= 0x1;
                    builder2.copyOnWrite();
                    final alin alin2 = (alin)builder2.instance;
                    alin2.b |= 0x2;
                    alin2.d = d;
                    builder.copyOnWrite();
                    final alhi alhi = (alhi)builder.instance;
                    final alin j = (alin)builder2.build();
                    j.getClass();
                    alhi.J = j;
                    alhi.c |= 0x8000000;
                    iae.d.J(3, (wzz)new wyt(iae.f.w.I()), (alhi)builder.build());
                }
                aiqj aiqj2 = aiqj;
                if (d) {
                    final aidi f = iae.f;
                    aiqj2 = aiqj;
                    if ((f.b & 0x200) != 0x0 && (aiqj2 = f.k) == null) {
                        aiqj2 = aiqj.a;
                    }
                }
                aiqj aiqj3 = aiqj2;
                if (!d) {
                    final aidi f2 = iae.f;
                    aiqj3 = aiqj2;
                    if ((f2.b & 0x8000) != 0x0 && (aiqj3 = f2.p) == null) {
                        aiqj3 = aiqj.a;
                    }
                }
                iae.c.c(aiqj3, iae.a());
                return;
            }
            case 19: {
                final Object a3 = this.a;
                final vqu vqu = (vqu)a;
                vqu.getClass();
                ((fet)a3).a().e((Object)vqu);
                return;
            }
            case 18: {
                ((tgd)this.a).d((Object)a);
                return;
            }
            case 17: {
                ((tgd)this.a).d((Object)a);
                return;
            }
            case 16: {
                ((tgd)this.a).d((Object)a);
                return;
            }
            case 15: {
                final Object a4 = this.a;
                final Boolean b3 = (Boolean)a;
                final hyi hyi = (hyi)a4;
                if (!((Optional)hyi.e.a()).isEmpty()) {
                    hyi.e();
                    if (b3) {
                        final PanelsConfiguration panelsConfiguration = (PanelsConfiguration)((Optional)hyi.e.a()).get();
                        hyi.d.aK(panelsConfiguration.a, hyi.b);
                        hyi.d.aK(panelsConfiguration.b, hyi.c);
                    }
                    if (hyi.i()) {
                        hyi.d.aM(hyi.b, hyi.g);
                    }
                    if (hyi.h()) {
                        hyi.d.aM(hyi.c, hyi.h);
                    }
                }
                return;
            }
            case 14: {
                final Object a5 = this.a;
                final aicn aicn = (aicn)a;
                final hwl hwl = (hwl)a5;
                final kau r = hwl.r();
                if (r == null) {
                    return;
                }
                ((acns)r).mA(anul.a, (ttg)new fdc(hwl, aicn, 20), (acpa)new hwc(0), (aiqj)null);
                return;
            }
            case 13: {
                final Object a6 = this.a;
                final hwk hwk = (hwk)a;
                final hwl hwl2 = (hwl)a6;
                final hvr hvr = new hvr(hwl2, 0);
                final hvr hvr2 = new hvr(hwl2, 2);
                hwk.a.ifPresent((Consumer)hvr);
                hwk.b.ifPresent((Consumer)hvr2);
                return;
            }
            case 12: {
                final Object a7 = this.a;
                final Boolean b4 = (Boolean)a;
                ((hwl)a7).bB();
                return;
            }
            case 11: {
                final Object a8 = this.a;
                final frj frj = (frj)a;
                ((hwl)a8).bG.g(true);
                return;
            }
            case 10: {
                final Object a9 = this.a;
                final frj frj2 = (frj)a;
                final hwl hwl3 = (hwl)a9;
                final ffc b5 = hwl3.b;
                if (b5 != null) {
                    if (b5.a) {
                        b5.c.s(36);
                        b5.d.d((Object)new fin());
                        b5.d();
                    }
                    return;
                }
                hwl3.am.dispose();
                return;
            }
            case 9: {
                final Object a10 = this.a;
                final frj frj3 = (frj)a;
                ((hwl)a10).be.v();
                return;
            }
            case 8: {
                final Object a11 = this.a;
                final hwd hwd = (hwd)a;
                final aiqj b6 = hwd.b;
                final hwl hwl4 = (hwl)a11;
                hwl4.bI(b6);
                hwl4.bx();
                if (hwl4.cj.Q() && hwd.c) {
                    hwl4.bt();
                }
                return;
            }
            case 7: {
                final Object a12 = this.a;
                final hvc hvc = (hvc)a;
                if (hvc instanceof hvf) {
                    ((hvi)a12).g();
                    return;
                }
                if (hvc instanceof hvg) {
                    final hvg hvg = (hvg)hvc;
                    final Object a13 = ((hvi)a12).i.a();
                    final float a14 = hvg.a;
                    final UploadArrowView uploadArrowView = (UploadArrowView)a13;
                    uploadArrowView.setVisibility(0);
                    ((ioh)a13).m(a14);
                    tpe.v((View)uploadArrowView.f, false);
                    final LottieAnimationView i = uploadArrowView.i;
                    if (i != null) {
                        i.setVisibility(0);
                        if (!i.q()) {
                            i.e();
                        }
                    }
                }
                else if (hvc instanceof hvd) {
                    final Object a15 = ((hvi)a12).i.a();
                    final UploadArrowView uploadArrowView2 = (UploadArrowView)a15;
                    uploadArrowView2.setVisibility(0);
                    ((ioh)a15).l();
                    final int l = uploadArrowView2.l;
                    final int cr = tpe.cr(uploadArrowView2.getContext(), 2130970852);
                    uploadArrowView2.a(l);
                    final TintableImageView f3 = uploadArrowView2.f;
                    if (f3 != null) {
                        f3.a(ColorStateList.valueOf(cr));
                    }
                }
                else if (hvc instanceof hve) {
                    a = ((hvi)a12).i.a();
                    final UploadArrowView uploadArrowView3 = (UploadArrowView)a;
                    uploadArrowView3.setVisibility(0);
                    ((ioh)a).l();
                    uploadArrowView3.a(uploadArrowView3.m);
                }
                return;
            }
            case 6: {
                final Object a16 = this.a;
                final hur hur = (hur)a;
                if (hur != hur.d) {
                    final qcy qcy = (qcy)a16;
                    final Object d2 = qcy.d;
                    final gbv d3 = gbx.d();
                    d3.c(0);
                    final int ordinal = hur.ordinal();
                    String s;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                s = "";
                            }
                            else {
                                s = ((Context)qcy.a).getString(2132020090);
                            }
                        }
                        else {
                            s = ((Context)qcy.a).getString(2132020092);
                        }
                    }
                    else {
                        s = ((Context)qcy.a).getString(2132020091);
                    }
                    d3.k((CharSequence)s);
                    ((acwc)d3).m((CharSequence)((Context)qcy.a).getString(2132020089), (View$OnClickListener)new hrb(qcy, 15, null, null, null));
                    ((gbu)d2).n((acwd)d3.a());
                }
                return;
            }
            case 5: {
                final Object a17 = this.a;
                final amhq amhq = (amhq)a;
                final boolean b7 = amhq.b;
                final huc huc = (huc)a17;
                huc.ac = b7;
                huc.ad = amhq.c;
                huc.r();
                return;
            }
            case 4: {
                final Object a18 = this.a;
                final Boolean b8 = (Boolean)a;
                final htu c = ((EditVideoActivity)a18).C;
                final huc huc2 = (huc)a18;
                boolean b9 = false;
                Label_1434: {
                    if (!huc2.ad) {
                        b9 = b2;
                        if (b8) {
                            break Label_1434;
                        }
                        if (huc2.ac) {
                            b9 = b2;
                            break Label_1434;
                        }
                    }
                    b9 = false;
                }
                c.b(b9);
                return;
            }
            case 3: {
                final Object a19 = this.a;
                final boolean booleanValue = (boolean)a;
                final htr htr = (htr)a19;
                htr.a = booleanValue;
                htr.b();
                return;
            }
            case 2: {
                final Object a20 = this.a;
                final Boolean b10 = (Boolean)a;
                final Toolbar toolbar = (Toolbar)((Activity)a20).findViewById(2131432125);
                if (b10 && toolbar != null) {
                    final Context context = (Context)a20;
                    toolbar.A(context, tpe.cs(context, 2130970917));
                }
                return;
            }
            case 1: {
                ((hsg)this.a).f((akqn)a);
                return;
            }
            case 0: {
                final Object a21 = this.a;
                final Throwable t = (Throwable)a;
                dbj dbj;
                if (t instanceof dbj) {
                    dbj = (dbj)t;
                }
                else {
                    dbj = new dbj(t);
                }
                ((hsg)a21).a(dbj);
            }
        }
    }
}
