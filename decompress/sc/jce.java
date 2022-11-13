import android.widget.FrameLayout;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.function.Consumer;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;
import j$.util.Optional;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.view.View;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.player.overlay.transientoverlay.DefaultTransientOverlayController;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jce implements asjm
{
    public final Object a;
    private final int b;
    
    public jce(final SuggestedActionsMainController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final DefaultTransientOverlayController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final jcf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final jck a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final jcm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final jcp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final jcs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final jcv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final jcw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final jdd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final jdh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final jdk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final jds a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jce(final pvh a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        final boolean b2 = false;
        boolean b3 = true;
        switch (b) {
            default: {
                final Object a = this.a;
                final aans aans = (aans)o;
                final abke c = aans.c();
                final String e = aans.e();
                if (c.h() || !c.c(abke.g) || c == abke.j) {
                    b3 = false;
                }
                final jds jds = (jds)a;
                if (jds.f == b3 && TextUtils.equals((CharSequence)e, (CharSequence)jds.m)) {
                    return;
                }
                jds.f = b3;
                ((jdo)jds.d).d = b3;
                ((jdo)jds.e).d = jds.f;
                if (!TextUtils.equals((CharSequence)e, (CharSequence)jds.m)) {
                    jds.m = e;
                    jds.c.d = false;
                }
                jds.u();
                return;
            }
            case 19: {
                final Object a2 = this.a;
                final aukg aukg = (aukg)o;
                ((jdk)a2).d.c.tu((Object)true);
                return;
            }
            case 18: {
                final Object a3 = this.a;
                final fwv fwv = (fwv)o;
                final iyf a4 = ((DefaultTransientOverlayController)a3).a;
                final Object b4 = fwv.b;
                if (fwv.a) {
                    final long b5 = ((jdk)b4).b;
                    a4.e = b5;
                    a4.a = true;
                    a4.b(b5);
                    a4.c(true);
                    return;
                }
                final long c2 = ((jdk)b4).c;
                a4.c = c2;
                a4.a = false;
                a4.a(c2);
                a4.c(true);
                return;
            }
            case 17: {
                final Object a5 = this.a;
                final Throwable t = (Throwable)o;
                ((jdk)a5).d.b();
                return;
            }
            case 16: {
                final Object a6 = this.a;
                final aani aani = (aani)o;
                boolean b6;
                if (aani.c() != abkb.e) {
                    b6 = b2;
                }
                else {
                    final WatchNextResponseModel a7 = aani.a();
                    if (a7 == null) {
                        b6 = b2;
                    }
                    else {
                        final angl i = a7.i;
                        b6 = b2;
                        if (i != null) {
                            b6 = b2;
                            if ((i.b & 0x20000000) != 0x0) {
                                anuv anuv;
                                if ((anuv = i.v) == null) {
                                    anuv = anuv.a;
                                }
                                if (!((ahbc)anuv).ry((ahaq)ElementRendererOuterClass.elementRenderer)) {
                                    b6 = b2;
                                }
                                else {
                                    anuv anuv2;
                                    if ((anuv2 = i.v) == null) {
                                        anuv2 = anuv.a;
                                    }
                                    final ajmo ajmo = (ajmo)((ahbc)anuv2).rx((ahaq)ElementRendererOuterClass.elementRenderer);
                                    final ackm ackm = new ackm();
                                    final jdh jdh = (jdh)a6;
                                    ((wyy)ackm).a(jdh.d);
                                    jdh.c.b(ackm, ((accf)jdh.b.a()).d(ajmo));
                                    jdh.a.removeAllViews();
                                    jdh.a.addView(jdh.c.a());
                                    b6 = true;
                                }
                            }
                        }
                    }
                }
                tpe.v((View)((jdh)a6).a, b6);
                return;
            }
            case 15: {
                final Object a8 = this.a;
                final jcq jcq = (jcq)o;
                if (jcq.e()) {
                    final SuggestedActionsMainController suggestedActionsMainController = (SuggestedActionsMainController)a8;
                    if (!suggestedActionsMainController.d.contains(jcq.d())) {
                        if (suggestedActionsMainController.h == null) {
                            final atke m = suggestedActionsMainController.m;
                            if (m == null) {
                                return;
                            }
                            suggestedActionsMainController.p = (toz)m.a();
                            suggestedActionsMainController.h = (ViewGroup)suggestedActionsMainController.p.a;
                            suggestedActionsMainController.n();
                        }
                        final ViewGroup h = suggestedActionsMainController.h;
                        if (h != null && h.getChildCount() == 0) {
                            suggestedActionsMainController.m(jcq.d());
                            return;
                        }
                        if (suggestedActionsMainController.f.a().getTag() != jcq.d()) {
                            suggestedActionsMainController.c.add(jcq.d());
                        }
                    }
                    return;
                }
                final SuggestedActionsMainController suggestedActionsMainController2 = (SuggestedActionsMainController)a8;
                if (suggestedActionsMainController2.f.a().getTag() == jcq.d()) {
                    suggestedActionsMainController2.l((Runnable)null);
                    suggestedActionsMainController2.k();
                    return;
                }
                suggestedActionsMainController2.c.remove(jcq.d());
                return;
            }
            case 14: {
                ((SuggestedActionsMainController)this.a).p((boolean)o ^ true, false);
                return;
            }
            case 13: {
                final Object a9 = this.a;
                final aany aany = (aany)o;
                if (aany != null) {
                    if (aany.a() != null) {
                        final String aa = aany.a().aa();
                        final SuggestedActionsMainController suggestedActionsMainController3 = (SuggestedActionsMainController)a9;
                        if (!TextUtils.equals((CharSequence)suggestedActionsMainController3.n, (CharSequence)aa)) {
                            suggestedActionsMainController3.n = aa;
                            suggestedActionsMainController3.o();
                        }
                    }
                }
                return;
            }
            case 12: {
                final Object a10 = this.a;
                final int intValue = (int)o;
                final jdd jdd = (jdd)a10;
                if (intValue == jdd.h) {
                    return;
                }
                jdd.h = intValue;
                jdd.g(jdd.g);
                return;
            }
            case 11: {
                final Object a11 = this.a;
                final aani aani2 = (aani)o;
                ((jcw)a11).c();
                return;
            }
            case 10: {
                final Object a12 = this.a;
                final Long n = (Long)o;
                final jcv jcv = (jcv)a12;
                jcv.e = true;
                jcv.c();
                return;
            }
            case 9: {
                final Object a13 = this.a;
                final aani aani3 = (aani)o;
                final jcv jcv2 = (jcv)a13;
                if (jcv2.f == aani3.c().b(abkb.e)) {
                    return;
                }
                jcv2.f = true;
                jcv2.d();
                return;
            }
            case 8: {
                ttr.d("Failed to update suggested action dismissal count for ".concat(String.valueOf(this.a)), (Throwable)o);
                return;
            }
            case 7: {
                ((jcs)this.a).a.tu((Object)afev.m("listen-first", o));
                return;
            }
            case 6: {
                final Object a14 = this.a;
                final int intValue2 = (int)o;
                final FrameLayout f = ((jcp)a14).f;
                if (f == null) {
                    return;
                }
                tpe.aF((View)f, tpe.aw(intValue2), (Class)ViewGroup$MarginLayoutParams.class);
                return;
            }
            case 5: {
                final Object a15 = this.a;
                final aazx aazx = (aazx)o;
                final jcm jcm = (jcm)a15;
                if (!jcm.d.d.isPresent()) {
                    return;
                }
                if (!jcm.c) {
                    jcm.c = true;
                    jcm.d.c.D((wzz)new wyt(xaa.c(140127)));
                }
                jcm.d.c.J(3, (wzz)new wyt(xaa.c(140127)), (alhi)null);
                return;
            }
            case 4: {
                final Object a16 = this.a;
                final Optional optional = (Optional)o;
                final jcm jcm2 = (jcm)a16;
                if (jcm2.d.d.isPresent()) {
                    if (optional.isPresent()) {
                        ((TextView)((toz)jcm2.d.d.get()).a).setText(((aazx)optional.get()).a);
                        final int a17 = jcm2.d.a.a(((aazx)optional.get()).b);
                        Object a19 = null;
                        Label_1423: {
                            if (a17 != 0) {
                                final Drawable a18 = agx.a(jcm2.d.b, a17);
                                if (a18 != null) {
                                    final Bitmap bitmap = ((BitmapDrawable)a18).getBitmap();
                                    if (jcm2.a == null || jcm2.b != a17) {
                                        final int dimensionPixelSize = jcm2.d.b.getResources().getDimensionPixelSize(2131166861);
                                        (jcm2.a = new BitmapDrawable(jcm2.d.b.getResources(), Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, true))).setAntiAlias(true);
                                        jcm2.b = a17;
                                    }
                                    a19 = jcm2.a;
                                    break Label_1423;
                                }
                            }
                            a19 = null;
                        }
                        ((TextView)((toz)jcm2.d.d.get()).a).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)a19, (Drawable)null, (Drawable)null, (Drawable)null);
                        ((toz)jcm2.d.d.get()).l(true, false);
                        jcm2.a(true);
                    }
                    else {
                        ((toz)jcm2.d.d.get()).l(false, false);
                        jcm2.a(false);
                    }
                    jcm2.d.d();
                }
                return;
            }
            case 3: {
                final Object a20 = this.a;
                final Optional f2 = (Optional)o;
                final jcn jcn = (jcn)((pvh)a20).a;
                jcn.f = f2;
                jcn.c();
                return;
            }
            case 2: {
                ((jck)this.a).c = ((aanf)o).d();
                return;
            }
            case 1: {
                final Object a21 = this.a;
                final jcg jcg = (jcg)o;
                final ajb d = ((jcf)a21).d;
                if (d != null) {
                    ((YouTubeTextView)d.a).setText((CharSequence)jcg.a);
                    ((YouTubeTextView)d.c).setText((CharSequence)jcg.b);
                }
                return;
            }
            case 0: {
                final Object a22 = this.a;
                final ggj ggj = (ggj)o;
                final jcf jcf = (jcf)a22;
                final ajb d2 = jcf.d;
                final Object b7 = ggj.b;
                final boolean a23 = ggj.a;
                if (d2 == null) {
                    return;
                }
                if (a23) {
                    ((toz)d2.b).b(true);
                    ((jcg)b7).a(jcf.a, true).ifPresent((Consumer)new inj(jcf, 16));
                    return;
                }
                ((toz)d2.b).a(true);
                ((jcg)b7).a(jcf.a, false).ifPresent((Consumer)new inj(jcf, 17));
            }
        }
    }
}
