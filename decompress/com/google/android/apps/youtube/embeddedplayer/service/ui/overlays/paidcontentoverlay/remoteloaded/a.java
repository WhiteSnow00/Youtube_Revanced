// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded;

import android.graphics.drawable.TransitionDrawable;
import j$.util.Optional;
import android.animation.AnimatorSet;
import com.google.android.youtube.api.jar.client.f;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b;

public final class a implements Runnable
{
    public final boolean a;
    public final Object b;
    private final int c;
    
    public a(final aapl b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final aarm b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final aast b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final aawr b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final arcx b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final b b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final ScreencastHostService b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final f b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final nhk b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final txx b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final tzx b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final wsr b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final xoj b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final xqs b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final ynp b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        int visibility = 8;
        switch (c) {
            default: {
                ((arcx)this.b).b.setVisibility(arcx.a(this.a));
                return;
            }
            case 19: {
                if (!this.a && ((arcx)this.b).h == null) {
                    return;
                }
                ((arcx)this.b).b().setVisibility(arcx.a(this.a));
                return;
            }
            case 18: {
                ((aehe)((f)this.b).a).Q(this.a);
                return;
            }
            case 17: {
                ((aawr)this.b).h(this.a);
                return;
            }
            case 16: {
                final aasr j = ((aast)this.b).j;
                if (!this.a) {
                    visibility = 0;
                }
                j.setVisibility(visibility);
                return;
            }
            case 15: {
                final Object b = this.b;
                final boolean a = this.a;
                final aarl k = ((aarm)b).k;
                if (!a) {
                    visibility = 0;
                }
                k.setVisibility(visibility);
                return;
            }
            case 14: {
                final Object b2 = this.b;
                final boolean a2 = this.a;
                final aapl aapl = (aapl)b2;
                final aapk i = aapl.k;
                if (i != null) {
                    if (!a2) {
                        i.setProgress(0);
                    }
                    final aapk l = aapl.k;
                    if (!a2) {
                        visibility = 0;
                    }
                    l.setVisibility(visibility);
                }
                return;
            }
            case 13: {
                ((ynp)this.b).y(this.a);
                return;
            }
            case 12: {
                final Object b3 = this.b;
                if (this.a) {
                    final xqs xqs = (xqs)b3;
                    final xrh h = xqs.h;
                    if (h != null) {
                        xqs.b.a(h.b, "canceled");
                        ttr.c("MDX.tvsignin.ExpressTvSignInDrawerController", "sending cancel message");
                    }
                }
                final xqs xqs2 = (xqs)b3;
                xqs2.e.m(b3);
                final rzv m = xqs2.k;
                if (m != null) {
                    qdt.h();
                    final pwz o = rzv.o((cl)m.a);
                    if (o != null) {
                        ((bi)o).dismiss();
                    }
                }
                xqs2.g = null;
                xqs2.i = false;
                xqs2.h = null;
                xqs2.k = null;
                return;
            }
            case 11: {
                ((xoj)this.b).e.d(this.a);
                return;
            }
            case 10: {
                tpe.v(((wsr)this.b).aC, this.a ^ true);
                return;
            }
            case 9: {
                tpe.v(((wsr)this.b).aC, this.a ^ true);
                return;
            }
            case 8: {
                final Object b4 = this.b;
                final boolean a3 = this.a;
                final ScreencastHostService screencastHostService = (ScreencastHostService)b4;
                final wpp l2 = screencastHostService.l;
                l2.b.f(a3);
                l2.c.p(a3);
                screencastHostService.l.j(wpf.b, screencastHostService.getString(2132019588));
                return;
            }
            case 7: {
                final Object b5 = this.b;
                final boolean a4 = this.a;
                final tzx tzx = (tzx)b5;
                if (tzx.e == a4) {
                    return;
                }
                tzx.e = a4;
                tzx.g = Optional.of((Object)vdh.aN((txq)tzx.d, a4, (AnimatorSet)tzx.g.orElse((Object)null)));
                return;
            }
            case 6: {
                final Object b6 = this.b;
                final boolean a5 = this.a;
                if (a5) {
                    ((tzx)b6).b.performHapticFeedback(1);
                }
                final tzx tzx2 = (tzx)b6;
                if (tzx2.c.getAnimation() != null && tzx2.c.getAnimation().hasStarted() && !tzx2.c.getAnimation().hasEnded()) {
                    tzx2.c.getAnimation().reset();
                }
                float n;
                if (!a5) {
                    n = 1.0f;
                }
                else {
                    n = 1.1667f;
                }
                tzx2.c.animate().scaleX(n).scaleY(n).setDuration(75L).start();
                final TransitionDrawable transitionDrawable = (TransitionDrawable)tzx2.c.getBackground();
                if (a5) {
                    transitionDrawable.startTransition(75);
                    tzx2.a.J(3, (wzz)new wyt(xaa.c(39104)), (alhi)null);
                    return;
                }
                transitionDrawable.reverseTransition(75);
                return;
            }
            case 5: {
                final Object b7 = this.b;
                if (this.a) {
                    final txx txx = (txx)b7;
                    txx.i();
                    ((uae)txx.a.a()).c(true);
                    return;
                }
                ((txx)b7).n();
                return;
            }
            case 4: {
                final boolean v = ((nhk)this.b).x.v();
                final boolean u = ((nhk)this.b).x.u();
                ((nhk)this.b).x.t(this.a);
                if (u == this.a) {
                    ((nhk)this.b).x.aA().k.b("Default data collection state already set to", (Object)this.a);
                }
                if (((nhk)this.b).x.v() == v || ((nhk)this.b).x.v() != ((nhk)this.b).x.u()) {
                    ((nhk)this.b).x.aA().h.c("Default data collection is different than actual status", (Object)this.a, (Object)v);
                }
                ((nhk)this.b).V();
                return;
            }
            case 3: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b)this.b).a.a((Object)this.a);
                return;
            }
            case 2: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b)this.b).a.m(this.a);
                return;
            }
            case 1: {
                ((b)this.b).a.b(this.a);
                return;
            }
            case 0: {
                ((b)this.b).a.d(this.a);
            }
        }
    }
}
