import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.ui.inline.DefaultInlinePlayerControls;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import com.google.android.material.appbar.AppBarLayout;
import android.widget.RadioButton;
import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivityV2;
import android.os.Bundle;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlv implements Runnable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public jlv(final View b, final RecyclerView a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jlv(final SuggestedActionsMainController a, final aonv b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlv(final VoiceSearchActivity b, final Bundle a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jlv(final VoiceSearchActivityV2 b, final Bundle a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jlv(final InlinePlaybackController a, final PlaybackStartDescriptor b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlv(final e a, final adgg b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlv(final AdsWebView a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlv(final hbr b, final aix a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jlv(final jng b, final RadioButton a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jlv(final jns a, final byte[] b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlv(final jvj a, final admv b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlv(final jvj a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlv(final jyi a, final jyx b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlv(final jyy b, final RecyclerView a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jlv(final jyy a, final AppBarLayout b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlv(final jzv b, final jyx a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jlv(final kaw b, final glm a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jlv(final kkp a, final ahlc b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlv(final kpn a, final ReelItemRendererOuterClass$ReelItemRenderer b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        switch (this.c) {
            default: {
                final Object a = this.a;
                final Object b = this.b;
                final kpn kpn = (kpn)a;
                final View e = kpn.e;
                if (e != null && e.isAttachedToWindow()) {
                    kpn.g((ReelItemRendererOuterClass$ReelItemRenderer)b);
                    return;
                }
                break;
            }
            case 19: {
                ((koa)((hbr)this.b).a).a.setImageDrawable((Drawable)this.a);
                return;
            }
            case 18: {
                kdt.c((AdsWebView)this.a).a(this.b);
                return;
            }
            case 17: {
                final Object a2 = this.a;
                final Object b2 = this.b;
                final kkp kkp = (kkp)a2;
                ((ftr)kkp.v).b(b2);
                kkp.w = false;
                return;
            }
            case 16: {
                final Object a3 = this.a;
                final Object b3 = this.b;
                final kkp kkp2 = (kkp)a3;
                ((ftr)kkp2.v).b(b3);
                kkp2.w = false;
                return;
            }
            case 15: {
                final Object b4 = this.b;
                final Object a4 = this.a;
                final Rect rect = new Rect();
                final View view = (View)b4;
                view.getDrawingRect(rect);
                final RecyclerView recyclerView = (RecyclerView)a4;
                recyclerView.offsetDescendantRectToMyCoords(view, rect);
                recyclerView.ah(0, rect.top);
                return;
            }
            case 14: {
                final Object a5 = this.a;
                final Object b5 = this.b;
                final InlinePlaybackController inlinePlaybackController = (InlinePlaybackController)a5;
                if (!((kbw)inlinePlaybackController.f.a()).a()) {
                    if (((fjv)inlinePlaybackController.d.a()).j().e()) {
                        final iru iru = (iru)((DefaultInlinePlayerControls)inlinePlaybackController.e.a()).f.b();
                        if (iru.u.R((PlaybackStartDescriptor)b5)) {
                            iru.p(false);
                        }
                        ((liq)inlinePlaybackController.c.a()).j(false);
                    }
                }
                return;
            }
            case 13: {
                final Object b6 = this.b;
                final String i = ((glm)this.a).i();
                final kaw kaw = (kaw)b6;
                if (TextUtils.equals((CharSequence)i, (CharSequence)kaw.d) && kaw.c != null) {
                    ((gek)b6).k();
                }
                return;
            }
            case 12: {
                final Object b7 = this.b;
                final Object a6 = this.a;
                try {
                    ((jzv)b7).g = ((jzv)b7).e.b.computeVerticalScrollOffset();
                    final int f = ((jzv)b7).f;
                    final View view2 = (View)((jzv)b7).d.a();
                    int n;
                    if (((jzv)b7).p()) {
                        n = 0;
                    }
                    else {
                        final afua afua = new afua();
                        asjv.b((AtomicReference)((jzv)b7).k.m(45367289L).aC(1.2).aa((asjm)new jzj(afua, 4)));
                        if (afua.intValue() == 0) {
                            n = 1200;
                        }
                        else {
                            n = (int)(afua.a() * 1000.0);
                        }
                    }
                    int k;
                    if (((jzv)b7).p()) {
                        k = 100;
                    }
                    else {
                        k = ((jzv)b7).k();
                    }
                    (((jzv)b7).l = new ttl(f, 0, view2, (jyx)a6, n, k, false)).n();
                }
                catch (final IllegalArgumentException ex) {
                    ttr.d("Error hiding search chip bar", (Throwable)ex);
                }
            }
            case 11: {
                ((AppBarLayout)this.b).k((adsp)this.a);
                return;
            }
            case 10: {
                ((RecyclerView)this.a).aH((iw)this.b);
                return;
            }
            case 9: {
                final Object a7 = this.a;
                final Object b8 = this.b;
                try {
                    (((jyi)a7).k = new ttl(((jyi)a7).i, 0, (View)((jyi)a7).g.a(), (jyx)b8, 1200, 400, true)).n();
                }
                catch (final IllegalArgumentException ex2) {
                    ttr.d("Error hiding feed filter bar", (Throwable)ex2);
                }
            }
            case 8: {
                final Object a8 = this.a;
                final admv admv = (admv)this.b;
                if (!admv.x && admv.w) {
                    return;
                }
                ((jvj)a8).a.h(admv);
                return;
            }
            case 7: {
                final Object a9 = this.a;
                final Object b9 = this.b;
                final jvj jvj = (jvj)a9;
                final glk d = jvj.a.d((String)b9, (String)null);
                if (d != null) {
                    d.b();
                    jvj.a.j(d);
                }
                return;
            }
            case 6: {
                final Object a10 = this.a;
                final Object b10 = this.b;
                final jns jns = (jns)a10;
                jns.ae.ts((Object)jns.o(-1).putExtra("RecognizedText", (byte[])b10));
                return;
            }
            case 5: {
                final Object b11 = this.b;
                final Object a11 = this.a;
                final VoiceSearchActivityV2 voiceSearchActivityV2 = (VoiceSearchActivityV2)b11;
                final jmv l = voiceSearchActivityV2.l;
                if (!voiceSearchActivityV2.isFinishing() && l != null) {
                    final ct j = voiceSearchActivityV2.c.i();
                    j.n((br)l);
                    j.a();
                    voiceSearchActivityV2.l = null;
                    voiceSearchActivityV2.h();
                    voiceSearchActivityV2.k.setVisibility(8);
                    final int f2 = jzg.F(((Bundle)a11).getString("VaaConsentResult", "CONSENT_CANCELED"));
                    final jnr m = voiceSearchActivityV2.j;
                    if (f2 == 1 || f2 == 2) {
                        m.b.c();
                    }
                    m.n();
                }
                return;
            }
            case 4: {
                final Object b12 = this.b;
                final Object a12 = this.a;
                final VoiceSearchActivity voiceSearchActivity = (VoiceSearchActivity)b12;
                final jmv y = voiceSearchActivity.Y;
                if (!voiceSearchActivity.isFinishing() && y != null) {
                    final int f3 = jzg.F(((Bundle)a12).getString("VaaConsentResult", "CONSENT_CANCELED"));
                    if (f3 == 1 || f3 == 2) {
                        voiceSearchActivity.m();
                    }
                    final ct i2 = voiceSearchActivity.j.i();
                    i2.n((br)y);
                    i2.d();
                    voiceSearchActivity.Y = null;
                    voiceSearchActivity.V.setVisibility(8);
                    voiceSearchActivity.w();
                }
                return;
            }
            case 3: {
                ((jng)this.b).an.scrollTo(0, Math.round(((RadioButton)this.a).getY()));
                return;
            }
            case 2: {
                final Object a13 = this.a;
                final ListenableFuture c = ((adgg)this.b).c();
                final e e2 = (e)a13;
                teu.k(c, (Executor)e2.e, (tes)new jdb(4), (tet)new hgd(e2, 18, (byte[])null));
                return;
            }
            case 1: {
                final Object a14 = this.a;
                final Object b13 = this.b;
                final SuggestedActionsMainController suggestedActionsMainController = (SuggestedActionsMainController)a14;
                if (suggestedActionsMainController.h == null) {
                    return;
                }
                final View a15 = suggestedActionsMainController.f.a();
                suggestedActionsMainController.j().addView(a15);
                final ashi o = suggestedActionsMainController.o;
                if (o != null) {
                    final jdd f4 = suggestedActionsMainController.f;
                    final asir i3 = f4.i;
                    if (i3 != null) {
                        athz.f((AtomicReference)i3);
                    }
                    f4.i = ashi.e((auke)o, (auke)f4.e, (asji)ivm.i).am((asjm)new jce(f4, 12));
                }
                suggestedActionsMainController.f.f(suggestedActionsMainController.a, (aonv)b13);
                final ViewGroup h = suggestedActionsMainController.h;
                if (h != null) {
                    h.post((Runnable)new iep(suggestedActionsMainController, a15, 19));
                }
                suggestedActionsMainController.n();
                suggestedActionsMainController.p(true, true);
                return;
            }
            case 0: {
                final Object a16 = this.a;
                final ListenableFuture b14 = ((adgg)this.b).b();
                final e e3 = (e)a16;
                teu.k(b14, (Executor)e3.e, (tes)new jdb(4), (tet)new hgd(e3, 18, (byte[])null));
                break;
            }
        }
    }
}
