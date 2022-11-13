import com.google.android.apps.youtube.app.extensions.accountlinking.PlayBilling;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;
import android.view.TouchDelegate;
import android.graphics.Rect;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.List;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.protos.youtube.api.innertube.SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
import android.view.View$OnClickListener;
import java.util.concurrent.atomic.AtomicBoolean;
import android.support.v7.widget.RecyclerView;
import com.android.billingclient.api.SkuDetails;
import android.app.Activity;
import android.view.View;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.app.extensions.lens.OpenLensForFrameController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsi implements Runnable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public fsi(final abae b, final TimelineMarker a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsi(final ackq a, final ackp b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsi(final ViewGroup b, final SlimStatusBar a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsi(final ImageView b, final aix a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsi(final ActiveStateLifecycleController a, final gds b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsi(final InlinePlaybackLifecycleController a, final gey b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsi(final OpenLensForFrameController a, final Bitmap b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsi(final eyz a, final gbv b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsi(final fci b, final asid a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsi(final gam b, final acvq a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsi(final ggj a, final View b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsi(final gif a, final Activity b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsi(final gkc a, final SlimStatusBar b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsi(final gkc b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsi(final gkp a, final View b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsi(final gpx b, final aiqj a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsi(final gqr a, final SkuDetails b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsi(final gtk a, final RecyclerView b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsi(final gww b, final aiqj a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsi(final gww b, final uby a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsi(final AtomicBoolean a, final fss b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        int f = 0;
        switch (c) {
            default: {
                final Object b = this.b;
                final Object a = this.a;
                final gww gww = (gww)b;
                if (!gww.aX) {
                    break;
                }
                final gvw ae = gww.ae;
                if (ae != null) {
                    ae.a.setOnClickListener((View$OnClickListener)ae);
                    ae.g = (uby)a;
                    ae.e(true);
                    return;
                }
                break;
            }
            case 19: {
                final Object b2 = this.b;
                final Object a2 = this.a;
                final gww gww2 = (gww)b2;
                final CreationButtonView ak = gww2.ak;
                if ((ak != null && ak.isEnabled()) || gww2.bh) {
                    gww2.r.a((aiqj)a2);
                }
                return;
            }
            case 18: {
                final Object b3 = this.b;
                final Object a3 = this.a;
                final Object a4 = ((gpx)b3).a;
                final SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand n = (SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand)((ahbc)a3).rx((ahaq)SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.sfvAudioItemPlaybackCommand);
                final ahab c2 = ((aiqj)a3).c;
                final SfvAudioItemPlaybackController sfvAudioItemPlaybackController = (SfvAudioItemPlaybackController)a4;
                sfvAudioItemPlaybackController.n = n;
                if (!sfvAudioItemPlaybackController.m.h() || !n.g.equals(sfvAudioItemPlaybackController.m.c())) {
                    (sfvAudioItemPlaybackController.p = sfvAudioItemPlaybackController.k.c(almx.aZ)).e();
                    sfvAudioItemPlaybackController.c.x(sfvAudioItemPlaybackController.f.d, sfvAudioItemPlaybackController.g);
                    if (!((List)sfvAudioItemPlaybackController.n.e).isEmpty()) {
                        sfvAudioItemPlaybackController.o = sfvAudioItemPlaybackController.g((List)sfvAudioItemPlaybackController.n.e);
                    }
                    else {
                        sfvAudioItemPlaybackController.o = SfvAudioItemPlaybackController.b;
                    }
                    final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
                    final ahbf watchEndpoint = WatchEndpointOuterClass.watchEndpoint;
                    final ahaz builder = ((ahbh)apsk.a).createBuilder();
                    final String c3 = n.c;
                    builder.copyOnWrite();
                    final apsk apsk = (apsk)builder.instance;
                    c3.getClass();
                    apsk.b |= 0x1;
                    apsk.d = c3;
                    final String d = n.d;
                    builder.copyOnWrite();
                    final apsk apsk2 = (apsk)builder.instance;
                    d.getClass();
                    apsk2.b |= 0x800;
                    apsk2.m = d;
                    ahbb.e((ahaq)watchEndpoint, (Object)builder.build());
                    final aiqj a5 = (aiqj)((ahaz)ahbb).build();
                    final abjp d2 = PlaybackStartDescriptor.d();
                    d2.a = a5;
                    d2.l = sfvAudioItemPlaybackController.o.c;
                    d2.e();
                    final PlaybackStartDescriptor a6 = d2.a();
                    Label_0829: {
                        if ((n.b & 0x4) != 0x0) {
                            aiqj aiqj;
                            if ((aiqj = n.f) == null) {
                                aiqj = aiqj.a;
                            }
                            if (((ahbc)aiqj).ry((ahaq)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand)) {
                                final adfq i = sfvAudioItemPlaybackController.q.i(sfvAudioItemPlaybackController.h.c());
                                aiqj aiqj2;
                                if ((aiqj2 = n.f) == null) {
                                    aiqj2 = aiqj.a;
                                }
                                teu.k(i.j(aiqj2, sfvAudioItemPlaybackController.i), sfvAudioItemPlaybackController.j, (tes)new fwr(sfvAudioItemPlaybackController, c2, a6, 2), (tet)new gve(sfvAudioItemPlaybackController, n, a6, c2));
                                break Label_0829;
                            }
                        }
                        sfvAudioItemPlaybackController.i(c2, sfvAudioItemPlaybackController.o);
                        sfvAudioItemPlaybackController.d.d(a6);
                    }
                    sfvAudioItemPlaybackController.l = aezp.k((Object)n.c);
                    sfvAudioItemPlaybackController.m = aezp.k((Object)n.g);
                    sfvAudioItemPlaybackController.h(sfvAudioItemPlaybackController.l, sfvAudioItemPlaybackController.m, aobh.e).W((asjg)gex.g, (asjm)gpg.m);
                    return;
                }
                if (!sfvAudioItemPlaybackController.c.f()) {
                    final aoej o = sfvAudioItemPlaybackController.o;
                    if (o != null) {
                        sfvAudioItemPlaybackController.c.Z(o.c);
                    }
                    else {
                        sfvAudioItemPlaybackController.c.Z(0L);
                    }
                    sfvAudioItemPlaybackController.c.C();
                    return;
                }
                sfvAudioItemPlaybackController.j();
                return;
            }
            case 17: {
                ((OpenLensForFrameController)this.a).b.o((Bitmap)this.b);
                return;
            }
            case 16: {
                final Object a7 = this.a;
                final Object b4 = this.b;
                final gtk gtk = (gtk)a7;
                final gtw d3 = gtk.D;
                final gts gts = (gts)((RecyclerView)d3).m;
                if (gts != null) {
                    f = gts.f();
                }
                final long ak2 = d3.aK(f, d3.getMeasuredWidth() - (f + f));
                final float n2 = (float)gtk.b;
                final float n3 = (float)ak2;
                final float n4 = (float)Math.min(gtk.c, ak2);
                final float n5 = (float)gtk.D.aL();
                long n6 = gtk.C.g() - gtk.C.h();
                final float n7 = (float)(gtk.d + n6);
                final float j = n4 / n3;
                final float k = n2 / n3;
                if (n7 - n5 > n3) {
                    n6 = gtk.D.aM() - gtk.d;
                }
                final float max = Math.max((n6 - n5) / n3, 0.0f);
                final float n8 = (n6 + gtk.d - n5) / n3;
                final float l = 500.0f / n3;
                final float min = Math.min(1.0f, n8);
                final gth q = gtk.q;
                q.l = l;
                try {
                    final StringBuilder sb = new StringBuilder("minPercent is ");
                    sb.append(k);
                    gth.f(k, sb.toString());
                    final StringBuilder sb2 = new StringBuilder("maxPercent is ");
                    sb2.append(j);
                    gth.f(j, sb2.toString());
                    final StringBuilder sb3 = new StringBuilder("startPercent is ");
                    sb3.append(max);
                    gth.f(max, sb3.toString());
                    final StringBuilder sb4 = new StringBuilder("endPercent is ");
                    sb4.append(min);
                    gth.f(min, sb4.toString());
                    if (min < max) {
                        throw new IllegalArgumentException("endPercent must not be smaller than startPercent");
                    }
                    float n9 = min;
                    float n10 = max;
                    if (min - max < k) {
                        n10 = 1.0f - k;
                        n9 = 1.0f;
                    }
                    if (n9 - n10 > j) {
                        throw new IllegalArgumentException("The difference between endPercent and startPercent must not be greater than maxPercent");
                    }
                    q.k = k;
                    q.j = j;
                    q.e(Math.max(n10, 0.0f), Math.min(n9, 1.0f));
                    final gtg p = q.p;
                    if (p != null) {
                        final float q2 = q.q;
                        final float r = q.r;
                        ((gtk)p).s = q2;
                        ((gtk)p).t = r;
                        final gti f2 = ((gtk)p).f();
                        f2.e();
                        f2.g(true);
                        f2.f();
                        f2.d();
                    }
                    q.postInvalidate();
                }
                catch (final IllegalArgumentException ex) {
                    ttr.f("ClipCreationScrubberViewController", "problem setting starting clip creation bounds", (Throwable)ex);
                }
                final RecyclerView recyclerView = (RecyclerView)b4;
                final iw iw = (iw)a7;
                recyclerView.aH(iw);
                recyclerView.aE(iw);
                return;
            }
            case 15: {
                final Object a8 = this.a;
                final Object b5 = this.b;
                final gqr gqr = (gqr)a8;
                final long longValue = (long)gqr.g.get();
                final bu a9 = gqr.a;
                final PlayBilling b6 = gqr.b;
                teu.n((aun)a9, aftq.f((ListenableFuture)afvk.m(b6.g()), (aftz)new pin(b6, longValue, (SkuDetails)b5, 1), b6.b), (ttg)new goe(gqr, 3), (ttg)new goe(gqr, 4));
                gqr.h(7);
                return;
            }
            case 14: {
                ((ImageView)this.b).setImageDrawable((Drawable)this.a);
                return;
            }
            case 13: {
                final Object b7 = this.b;
                final Object a10 = this.a;
                final vlf vlf = (vlf)((fci)b7).a;
                ((ewp)vlf.b).g().C((asid)a10).V((asjg)new esa(vlf, 13, null, null));
                return;
            }
            case 12: {
                final Object a11 = this.a;
                final Object b8 = this.b;
                final int c4 = goq.c;
                ((ackq)a11).i((ackp)b8);
                return;
            }
            case 11: {
                ((gbu)((eyz)this.a).a).n((acwd)((gbv)this.b).a());
                return;
            }
            case 10: {
                ((gkp)this.a).c.removeView((View)this.b);
                return;
            }
            case 9: {
                final Object a12 = this.a;
                final Object b9 = this.b;
                final gkc gkc = (gkc)a12;
                final pvh z = gkc.z;
                z.getClass();
                final int c5 = gkc.c;
                final int d4 = gkc.d;
                final Object a13 = z.a;
                final AnimatorSet m = new AnimatorSet();
                final View view = (View)b9;
                final Animator r2 = fal.r(view, c5, d4, 400L);
                final Animator r3 = fal.r(view, d4, c5, 400L);
                r3.setStartDelay(200L);
                m.playSequentially(new Animator[] { r2, r3 });
                (gkc.j = m).start();
                return;
            }
            case 8: {
                ((gkc)this.b).q(false, (String)this.a);
                return;
            }
            case 7: {
                final Object b10 = this.b;
                final Object a14 = this.a;
                final View view2 = (View)a14;
                final ViewGroup viewGroup = (ViewGroup)b10;
                final int n11 = viewGroup.indexOfChild(view2) - 1;
                if (n11 < 0) {
                    return;
                }
                final View child = viewGroup.getChildAt(n11);
                final Rect rect = new Rect();
                child.getHitRect(rect);
                rect.bottom += ((SlimStatusBar)a14).getHeight();
                viewGroup.setTouchDelegate((TouchDelegate)new gkb(rect, child));
                return;
            }
            case 6: {
                final Object a15 = this.a;
                final Object b11 = this.b;
                final pvh d5 = ((gif)a15).D;
                if (d5 != null) {
                    ((DefaultPipController)d5.a).q = true;
                }
                ((Activity)b11).moveTaskToBack(false);
                return;
            }
            case 5: {
                final Object a16 = this.a;
                ((View)this.b).setVisibility(0);
                final ggj ggj = (ggj)a16;
                if (ggj.a) {
                    ((ggq)ggj.b).pF().t((wzz)new wyt(xaa.c(147757)), (alhi)null);
                }
                return;
            }
            case 4: {
                ((InlinePlaybackLifecycleController)this.a).s(0, (gey)this.b);
                return;
            }
            case 3: {
                ((ActiveStateLifecycleController)this.a).h((gds)this.b);
                return;
            }
            case 2: {
                ((gam)this.b).f((acvq)this.a, 2);
                return;
            }
            case 1: {
                ((fpe)((abae)this.b).a).z((TimelineMarker)this.a);
                return;
            }
            case 0: {
                final Object a17 = this.a;
                final Object b12 = this.b;
                if (!((AtomicBoolean)a17).get()) {
                    ((fss)b12).a(false);
                    break;
                }
                break;
            }
        }
    }
}
