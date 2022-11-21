// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.c;
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
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b b, final ajtu a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b b, final f a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b b, final CharSequence a, final int c) {
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
    
    @Override
    public final void run() {
        switch (this.c) {
            default: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)this.b).g.i((SubscriptionNotificationMenuItem)this.a);
                return;
            }
            case 19: {
                final Object b = this.b;
                final Object a = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e e = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e)b;
                e.b.ra((SubtitleTrack)a);
                e.j = false;
                return;
            }
            case 18: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).a.s((CharSequence)this.a);
                return;
            }
            case 17: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).e.D((VideoDetails)this.b);
                return;
            }
            case 16: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).a.oV((ControlsOverlayStyle)this.a);
                return;
            }
            case 15: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).f.rh((SubscribeButtonData)this.a);
                return;
            }
            case 14: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).b.q((List)this.a);
                return;
            }
            case 13: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).g.A((SubscriptionNotificationMenuData)this.a);
                return;
            }
            case 12: {
                final Object b2 = this.b;
                final c k = new c((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f)this.a);
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b b3 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)b2;
                b3.k = k;
                b3.a.pm((abcx)b3.k);
                b3.b.l((aben)b3.k);
                b3.c.rk((abfl)b3.k);
                b3.d.rd((abed)b3.k);
                b3.e.C(b3.k);
                b3.f.w(b3.k);
                b3.g.ri(b3.k);
                b3.h.E(b3.k);
                b3.i.t(b3.k);
                b3.j.re(b3.k);
                return;
            }
            case 11: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.a).e.p((Bitmap)this.b);
                return;
            }
            case 10: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).b.j((SubtitleTrack)this.a);
                return;
            }
            case 9: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).i.rf((ShareButtonData)this.a);
                return;
            }
            case 8: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).a.f((ControlsState)this.a);
                return;
            }
            case 7: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).h.F((WatchLaterButtonData)this.a);
                return;
            }
            case 6: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).a.u((Map)this.a);
                return;
            }
            case 5: {
                ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b)this.b).g.z((SubscriptionNotificationButtonData)this.a);
                return;
            }
            case 4: {
                ((e)this.a).a.a((Bundle)this.b);
                return;
            }
            case 3: {
                final Object b4 = this.b;
                final Object a2 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b b5 = (com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b)b4;
                if (b5.a != null) {
                    b5.b = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c((f)a2);
                    ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.g)b5.a).b = (smo)b5.b;
                }
                return;
            }
            case 2: {
                final Object b6 = this.b;
                final Object a3 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g a4 = ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b)b6).a;
                if (a4 != null) {
                    a4.z((ajtu)a3);
                }
                return;
            }
            case 1: {
                final Object b7 = this.b;
                final Object a5 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g a6 = ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b)b7).a;
                if (a6 != null) {
                    a6.A((CharSequence)a5);
                }
                return;
            }
            case 0: {
                final Object b8 = this.b;
                final Object a7 = this.a;
                final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g a8 = ((com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b)b8).a;
                if (a8 != null) {
                    a8.p((CharSequence)a7);
                }
            }
        }
    }
}
