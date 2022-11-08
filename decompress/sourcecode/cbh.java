import java.util.Iterator;
import androidx.mediarouter.app.OverlayListView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.a;
import android.widget.TextView;
import android.view.View;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.libraries.youtube.mdx.smartremote.MicrophoneView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.k;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbh implements Animation$AnimationListener
{
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public cbh(final aawv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final aaxg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final SwipeRefreshLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final cbn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final EffectsFeatureDescriptionView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final k a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final e a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final MicrophoneView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final com.google.android.libraries.youtube.search.voice.MicrophoneView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final gcw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final gdb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final isv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final juv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final tnc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final uuf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final wor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cbh(final wov a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animation animation) {
        switch (this.b) {
            default: {
                ((com.google.android.libraries.youtube.search.voice.MicrophoneView)this.a).a.setAlpha(0.0f);
                ((com.google.android.libraries.youtube.search.voice.MicrophoneView)this.a).g();
                return;
            }
            case 19: {
                ((aaxg)this.a).b();
                return;
            }
            case 18: {
                final View c = ((aawv)this.a).c();
                if (c.getParent() != null) {
                    ((ViewGroup)c.getParent()).removeView(c);
                }
                return;
            }
            case 17: {
                ((MicrophoneView)this.a).b.setAlpha(0.0f);
                ((MicrophoneView)this.a).c();
                return;
            }
            case 16: {
                ((wov)this.a).al.setBackgroundColor(0);
                return;
            }
            case 15: {
                ((wor)this.a).e.setBackgroundColor(0);
                return;
            }
            case 14: {
                final TextView f = ((uuf)this.a).f;
                if (f == null) {
                    return;
                }
                f.post((Runnable)new upe(this, 11, (byte[])null));
                return;
            }
            case 13: {
                ((tnc)this.a).c();
                if (((tnc)this.a).b.hasOverlappingRendering()) {
                    ((tnc)this.a).b.setLayerType(0, (Paint)null);
                }
                return;
            }
            case 12: {
                final e e = (e)this.a;
                if (e.b == 2) {
                    e.b();
                    ((e)this.a).m();
                    final e e2 = (e)this.a;
                    if (e2.a == 3) {
                        final a d = e2.d;
                        if (d != null) {
                            d.J(e2.b);
                        }
                    }
                }
                return;
            }
            case 11: {
                final k k = (k)this.a;
                if (animation == k.A) {
                    k.oE();
                    return;
                }
                if (animation == k.B) {
                    k.t.setVisibility(4);
                    ((k)this.a).I = true;
                }
                return;
            }
            case 10: {
                ((juv)this.a).d.clearAnimation();
                ((juv)this.a).d.setVisibility(8);
                return;
            }
            case 9: {
                ((juv)this.a).d.clearAnimation();
                ((juv)this.a).d.setVisibility(0);
                return;
            }
            case 8: {
                final isv isv = (isv)this.a;
                if (isv.mn()) {
                    isv.c.setVisibility(8);
                    final aepj e3 = ((isv)this.a).e;
                    if (e3 != null) {
                        final uwy uwy = (uwy)e3.a;
                        uwy.h = false;
                        uwy.i();
                    }
                }
                return;
            }
            case 7: {
                final EffectsFeatureDescriptionView effectsFeatureDescriptionView = (EffectsFeatureDescriptionView)this.a;
                effectsFeatureDescriptionView.e = false;
                effectsFeatureDescriptionView.setVisibility(8);
                return;
            }
            case 6: {
                final gdb gdb = (gdb)this.a;
                if (gdb.c != null) {
                    gdb.i();
                }
                return;
            }
            case 5: {
                return;
            }
            case 4: {
                ((gcw)this.a).a = false;
                return;
            }
            case 3: {
                ((SwipeRefreshLayout)this.a).m(null);
                return;
            }
            case 2: {
                final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout)this.a;
                if (swipeRefreshLayout.b) {
                    swipeRefreshLayout.h.setAlpha(255);
                    ((SwipeRefreshLayout)this.a).h.start();
                    final SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout)this.a;
                    if (swipeRefreshLayout2.i) {
                        final chq a = swipeRefreshLayout2.a;
                        if (a != null) {
                            a.a();
                        }
                    }
                    final SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout)this.a;
                    swipeRefreshLayout3.c = swipeRefreshLayout3.d.getTop();
                    return;
                }
                swipeRefreshLayout.b();
                return;
            }
            case 1: {
                ((cbn)this.a).m(true);
            }
            case 0: {}
        }
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
        switch (this.b) {
            default: {
                ((com.google.android.libraries.youtube.search.voice.MicrophoneView)this.a).a.setAlpha(1.0f);
                return;
            }
            case 18:
            case 19: {
                return;
            }
            case 17: {
                ((MicrophoneView)this.a).b.setAlpha(1.0f);
                return;
            }
            case 16: {
                ((wov)this.a).al.setBackgroundColor(-1);
                return;
            }
            case 15: {
                ((wor)this.a).e.setBackgroundColor(-1);
            }
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14: {
                return;
            }
            case 7: {
                final EffectsFeatureDescriptionView effectsFeatureDescriptionView = (EffectsFeatureDescriptionView)this.a;
                effectsFeatureDescriptionView.e = true;
                effectsFeatureDescriptionView.setAlpha(1.0f);
                ((EffectsFeatureDescriptionView)this.a).setVisibility(0);
            }
            case 6: {
                return;
            }
            case 5: {
                ((gdb)this.a).a.m(fxr.f, ((gdb)this.a).b.getHeight());
                return;
            }
            case 4: {
                ((gcw)this.a).a = true;
            }
            case 1:
            case 2:
            case 3: {
                return;
            }
            case 0: {
                final OverlayListView n = ((cbn)this.a).n;
                for (final cbr cbr : n.a) {
                    if (!cbr.k) {
                        cbr.j = n.getDrawingTime();
                        cbr.k = true;
                    }
                }
                final cbn cbn = (cbn)this.a;
                cbn.n.postDelayed(cbn.U, (long)cbn.P);
            }
        }
    }
}
