// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded;

import android.graphics.drawable.TransitionDrawable;
import j$.util.Optional;
import android.animation.AnimatorSet;
import com.google.android.youtube.api.jar.client.e;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b;

public final class a implements Runnable
{
    public final boolean a;
    public final Object b;
    private final int c;
    
    public a(final aark b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final aatc b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final aaud b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final aaya b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final arft b, final boolean a, final int c) {
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
    
    public a(final e b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final nib b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final tyy b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final ubb b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final wtx b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final xpv b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final xsb b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public a(final ypn b, final boolean a, final int c) {
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
                ((arft)this.b).b.setVisibility(arft.a(this.a));
                return;
            }
            case 19: {
                if (!this.a && ((arft)this.b).h == null) {
                    return;
                }
                ((arft)this.b).b().setVisibility(arft.a(this.a));
                return;
            }
            case 18: {
                ((aeix)((e)this.b).a).Q(this.a);
                return;
            }
            case 17: {
                ((aaya)this.b).h(this.a);
                return;
            }
            case 16: {
                final aaub j = ((aaud)this.b).j;
                if (!this.a) {
                    visibility = 0;
                }
                j.setVisibility(visibility);
                return;
            }
            case 15: {
                final Object b = this.b;
                final boolean a = this.a;
                final aatb k = ((aatc)b).k;
                if (!a) {
                    visibility = 0;
                }
                k.setVisibility(visibility);
                return;
            }
            case 14: {
                final Object b2 = this.b;
                final boolean a2 = this.a;
                final aark aark = (aark)b2;
                final aarj i = aark.k;
                if (i != null) {
                    if (!a2) {
                        i.setProgress(0);
                    }
                    final aarj l = aark.k;
                    if (!a2) {
                        visibility = 0;
                    }
                    l.setVisibility(visibility);
                }
                return;
            }
            case 13: {
                ((ypn)this.b).y(this.a);
                return;
            }
            case 12: {
                final Object b3 = this.b;
                if (this.a) {
                    final xsb xsb = (xsb)b3;
                    final xsq h = xsb.h;
                    if (h != null) {
                        xsb.b.a(h.b, "canceled");
                        tut.c("MDX.tvsignin.ExpressTvSignInDrawerController", "sending cancel message");
                    }
                }
                final xsb xsb2 = (xsb)b3;
                xsb2.e.m(b3);
                final saw m = xsb2.k;
                if (m != null) {
                    qem.r();
                    final pxs n = saw.n((cl)m.a);
                    if (n != null) {
                        ((bi)n).dismiss();
                    }
                }
                xsb2.g = null;
                xsb2.i = false;
                xsb2.h = null;
                xsb2.k = null;
                return;
            }
            case 11: {
                ((xpv)this.b).e.d(this.a);
                return;
            }
            case 10: {
                tqf.v(((wtx)this.b).aC, this.a ^ true);
                return;
            }
            case 9: {
                tqf.v(((wtx)this.b).aC, this.a ^ true);
                return;
            }
            case 8: {
                final Object b4 = this.b;
                final boolean a3 = this.a;
                final ScreencastHostService screencastHostService = (ScreencastHostService)b4;
                final wqu l2 = screencastHostService.l;
                l2.b.f(a3);
                l2.c.p(a3);
                screencastHostService.l.j(wqk.b, screencastHostService.getString(2132019590));
                return;
            }
            case 7: {
                final Object b5 = this.b;
                final boolean a4 = this.a;
                final ubb ubb = (ubb)b5;
                if (ubb.e == a4) {
                    return;
                }
                ubb.e = a4;
                ubb.g = Optional.of((Object)ume.B((tyr)ubb.d, a4, (AnimatorSet)ubb.g.orElse((Object)null)));
                return;
            }
            case 6: {
                final Object b6 = this.b;
                final boolean a5 = this.a;
                if (a5) {
                    ((ubb)b6).b.performHapticFeedback(1);
                }
                final ubb ubb2 = (ubb)b6;
                if (ubb2.c.getAnimation() != null && ubb2.c.getAnimation().hasStarted() && !ubb2.c.getAnimation().hasEnded()) {
                    ubb2.c.getAnimation().reset();
                }
                float n2;
                if (!a5) {
                    n2 = 1.0f;
                }
                else {
                    n2 = 1.1667f;
                }
                ubb2.c.animate().scaleX(n2).scaleY(n2).setDuration(75L).start();
                final TransitionDrawable transitionDrawable = (TransitionDrawable)ubb2.c.getBackground();
                if (a5) {
                    transitionDrawable.startTransition(75);
                    ubb2.a.J(3, (xbe)new wzy(xbf.c(39104)), (alji)null);
                    return;
                }
                transitionDrawable.reverseTransition(75);
                return;
            }
            case 5: {
                final Object b7 = this.b;
                if (this.a) {
                    final tyy tyy = (tyy)b7;
                    tyy.i();
                    ((ubi)tyy.a.a()).c(true);
                    return;
                }
                ((tyy)b7).n();
                return;
            }
            case 4: {
                final boolean v = ((nib)this.b).x.v();
                final boolean u = ((nib)this.b).x.u();
                ((nib)this.b).x.t(this.a);
                if (u == this.a) {
                    ((nib)this.b).x.aA().k.b("Default data collection state already set to", (Object)this.a);
                }
                if (((nib)this.b).x.v() == v || ((nib)this.b).x.v() != ((nib)this.b).x.u()) {
                    ((nib)this.b).x.aA().h.c("Default data collection is different than actual status", (Object)this.a, (Object)v);
                }
                ((nib)this.b).V();
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
