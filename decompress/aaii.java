import com.google.vr.sdk.base.GvrView$StereoRenderer;
import com.google.vr.sdk.base.GvrView$Renderer;
import android.os.Handler;
import android.view.View;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;
import java.util.List;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaii implements Runnable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public aaii(final aaij a, final aadf b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaii(final aaij b, final Map a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaii(final aail a, final aadf b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaii(final aamh b, final abpx a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaii(final aarv b, final CountDownLatch a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaii(final aarz b, final CountDownLatch a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaii(final aasp a, final aaso b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaii(final aasp b, final aavb a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaii(final aasp b, final aavk a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaii(final aaud a, final FrameLayout$LayoutParams b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaii(final aaud b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaii(final aawm a, final ViewGroup$LayoutParams b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaii(final aawm b, final SubtitlesStyle a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaii(final aawm b, final List a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaii(final OfflineTransferService a, final aadf b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        switch (this.c) {
            default: {
                final aawl k = ((aawm)this.a).k;
                final ViewGroup$LayoutParams viewGroup$LayoutParams = (ViewGroup$LayoutParams)this.b;
                tqf.aG((View)k, (atnb)new aawk(viewGroup$LayoutParams, 0), tqf.aE(viewGroup$LayoutParams.width, ((ViewGroup$LayoutParams)this.b).height), (Class)ViewGroup$LayoutParams.class);
                return;
            }
            case 19: {
                ((aawm)this.b).k.i((SubtitlesStyle)this.a);
                return;
            }
            case 18: {
                ((aawm)this.b).k.c((List)this.a);
                return;
            }
            case 17: {
                ((aaud)this.b).j.setText((CharSequence)this.a);
                return;
            }
            case 16: {
                final aaub j = ((aaud)this.a).j;
                final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)this.b;
                tqf.aG((View)j, (atnb)new aawk(frameLayout$LayoutParams, 1), tqf.aE(frameLayout$LayoutParams.width, ((FrameLayout$LayoutParams)this.b).height), (Class)ViewGroup$LayoutParams.class);
                return;
            }
            case 15: {
                final Object a = this.a;
                final Object b = this.b;
                final aasp aasp = (aasp)a;
                final aaux g = aasp.g;
                if (g != null) {
                    final aaut i = aasp.i;
                    if (i != null) {
                        ((aaso)b).rT(g, i);
                    }
                }
                return;
            }
            case 14: {
                final Object b2 = this.b;
                final Object a2 = this.a;
                final aasp aasp2 = (aasp)b2;
                final aaux g2 = aasp2.g;
                if (g2 != null) {
                    try {
                        g2.b.a((aavk)a2);
                        final aaxk a3 = g2.a;
                        final aavk a4 = a3.a;
                        a3.a = (aavk)a2;
                        if (a4.a() != ((aavk)a2).a()) {
                            a3.e();
                            a3.d();
                        }
                    }
                    catch (final aavb aavb) {
                        aasp2.r(aavb);
                    }
                }
                return;
            }
            case 13: {
                final Object b3 = this.b;
                final Object a5 = this.a;
                final aasp aasp3 = (aasp)b3;
                final Handler m = aasp3.m;
                if (m != null) {
                    m.obtainMessage(4, 1, 0, a5).sendToTarget();
                }
                final aavg n = aasp3.n;
                if (n != null) {
                    final aaya aaya = (aaya)n;
                    aaya.c();
                    final aaxy e = aaya.e;
                    if (e != null) {
                        e.b(false);
                    }
                }
                return;
            }
            case 12: {
                final GvrView$Renderer d = ((aarz)this.b).d;
                if (d != null) {
                    d.onRendererShutdown();
                }
                ((CountDownLatch)this.a).countDown();
                return;
            }
            case 11: {
                final aaru b4 = ((aarv)this.b).b;
                if (b4.b) {
                    final GvrView$StereoRenderer a6 = b4.a;
                    if (a6 != null) {
                        a6.onRendererShutdown();
                    }
                }
                ((aarv)this.b).a.onDestroy();
                ((CountDownLatch)this.a).countDown();
                return;
            }
            case 10: {
                ((aami)((aamh)this.b).f.a()).a((abpx)this.a);
                return;
            }
            case 9: {
                final Object a7 = this.a;
                final aadf aadf = (aadf)this.b;
                if (aahc.ac(aadf.f)) {
                    final aozk b5 = aadf.b;
                    if (b5 == aozk.g) {
                        ((aads)((OfflineTransferService)a7).j.a()).A(aadf);
                        return;
                    }
                    if (b5 == aozk.f) {
                        ((aads)((OfflineTransferService)a7).j.a()).B(aadf);
                        return;
                    }
                    if (b5 == aozk.b) {
                        if (aahc.ae(aadf)) {
                            ((OfflineTransferService)a7).q(aadf, false);
                        }
                    }
                }
                return;
            }
            case 8: {
                ((aads)((OfflineTransferService)this.a).j.a()).z((aadf)this.b);
                return;
            }
            case 7: {
                final Object a8 = this.a;
                final aadf aadf2 = (aadf)this.b;
                if (aahc.ac(aadf2.f)) {
                    final aozk b6 = aadf2.b;
                    if (b6 == aozk.g) {
                        ((aads)((aail)a8).f.a()).A(aadf2);
                        return;
                    }
                    if (b6 == aozk.f) {
                        ((aads)((aail)a8).f.a()).B(aadf2);
                        return;
                    }
                    if (b6 == aozk.b) {
                        if (aahc.ae(aadf2)) {
                            ((aail)a8).n(aadf2, false);
                        }
                    }
                }
                return;
            }
            case 6: {
                ((aads)((aail)this.a).f.a()).z((aadf)this.b);
                return;
            }
            case 5: {
                ((aaij)this.a).a.h((aadf)this.b);
                return;
            }
            case 4: {
                ((aaij)this.b).a.d((Map)this.a);
                return;
            }
            case 3: {
                ((aaij)this.a).a.i((aadf)this.b);
                return;
            }
            case 2: {
                ((aaij)this.a).a.m((aadf)this.b);
                return;
            }
            case 1: {
                ((aaij)this.a).a.e((aadf)this.b);
                return;
            }
            case 0: {
                ((aaij)this.a).a.f((aadf)this.b);
            }
        }
    }
}
