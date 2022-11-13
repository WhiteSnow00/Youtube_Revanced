// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.i;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import java.util.Map;
import java.util.List;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.ShareButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f;

public final class b implements Runnable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b b, final ajrv a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b b, final f a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final e a, final Bundle b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b a, final Bitmap b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b a, final VideoDetails b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b, final ShareButtonData a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b, final SubscribeButtonData a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b, final SubscriptionNotificationButtonData a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b, final SubscriptionNotificationMenuData a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b, final WatchLaterButtonData a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b, final ControlsOverlayStyle a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b, final ControlsState a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b, final SubtitleTrack a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b, final List a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b, final Map a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e b, final SubscriptionNotificationMenuItem a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e b, final SubtitleTrack a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e b, final i a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b a, final Bitmap b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        switch (this.c) {
            default: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b)this.a).a.p((Bitmap)this.b);
                return;
            }
            case 19: {
                final Object b = this.b;
                final Object a = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e e = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e)b;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c a2 = e.a;
                if (a2 != null) {
                    e.b = new a((i)a);
                    ((c)a2).a = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b)e.b;
                }
                return;
            }
            case 18: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)this.b).g.i((SubscriptionNotificationMenuItem)this.a);
                return;
            }
            case 17: {
                final Object b2 = this.b;
                final Object a3 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e e2 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)b2;
                e2.b.rb((SubtitleTrack)a3);
                e2.j = false;
                return;
            }
            case 16: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).a.s((CharSequence)this.a);
                return;
            }
            case 15: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).e.D((VideoDetails)this.b);
                return;
            }
            case 14: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).a.oU((ControlsOverlayStyle)this.a);
                return;
            }
            case 13: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).f.ri((SubscribeButtonData)this.a);
                return;
            }
            case 12: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).b.q((List)this.a);
                return;
            }
            case 11: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).g.A((SubscriptionNotificationMenuData)this.a);
                return;
            }
            case 10: {
                final Object b3 = this.b;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.c k = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.c((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f)this.a);
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b4 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)b3;
                b4.k = k;
                b4.a.pl((abbr)b4.k);
                b4.b.l((abdh)b4.k);
                b4.c.rk((abef)b4.k);
                b4.d.re((abcx)b4.k);
                b4.e.C((d)b4.k);
                b4.f.w((com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c)b4.k);
                b4.g.rj((com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c)b4.k);
                b4.h.E((com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c)b4.k);
                b4.i.t((com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d)b4.k);
                b4.j.rf((g)b4.k);
                return;
            }
            case 9: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).e.p((Bitmap)this.b);
                return;
            }
            case 8: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).b.j((SubtitleTrack)this.a);
                return;
            }
            case 7: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).i.rg((ShareButtonData)this.a);
                return;
            }
            case 6: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).a.f((ControlsState)this.a);
                return;
            }
            case 5: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).h.F((WatchLaterButtonData)this.a);
                return;
            }
            case 4: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).a.u((Map)this.a);
                return;
            }
            case 3: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).g.z((SubscriptionNotificationButtonData)this.a);
                return;
            }
            case 2: {
                ((e)this.a).a.a((Bundle)this.b);
                return;
            }
            case 1: {
                final Object b5 = this.b;
                final Object a4 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g a5 = ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b)b5).a;
                if (a5 != null) {
                    a5.z((ajrv)a4);
                }
                return;
            }
            case 0: {
                final Object b6 = this.b;
                final Object a6 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b b7 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b)b6;
                if (b7.a != null) {
                    b7.b = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c((f)a6);
                    ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.f)b7.a).b = (sln)b7.b;
                }
            }
        }
    }
}
