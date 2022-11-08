// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d;

public final class e extends enz implements f
{
    public aazw a;
    public abbl b;
    public abcl c;
    public abbd d;
    public d e;
    public c f;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c g;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c h;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d i;
    public volatile boolean j;
    private final Handler k;
    private final tdz l;
    private final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.e m;
    
    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayServiceListener");
    }
    
    public e(final Handler k, final tdz l, final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.e m) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayServiceListener");
        this.i = com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d.d;
        this.k = k;
        l.getClass();
        this.l = l;
        m.getClass();
        this.m = m;
    }
    
    public final void A(final int n) {
        this.k.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.e(this, n, 3));
    }
    
    public final void B() {
        this.k.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(this, 20));
    }
    
    public final void a() {
        this.k.post((Runnable)new a(this, 3));
    }
    
    public final void b() {
        this.k.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(this, 19));
    }
    
    public final void c(final abgz abgz) {
        if (this.j) {
            this.l.f((Object)abgz);
        }
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        switch (int1) {
            default: {
                return false;
            }
            case 24: {
                this.h();
                break;
            }
            case 23: {
                this.s();
                break;
            }
            case 22: {
                this.t();
                break;
            }
            case 21: {
                this.B();
                break;
            }
            case 20: {
                final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem = (SubscriptionNotificationMenuItem)eoa.a(parcel, SubscriptionNotificationMenuItem.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.w(subscriptionNotificationMenuItem);
                break;
            }
            case 19: {
                this.v();
                break;
            }
            case 18: {
                this.x();
                break;
            }
            case 17: {
                this.k();
                break;
            }
            case 16: {
                final SubtitleTrack subtitleTrack = (SubtitleTrack)eoa.a(parcel, SubtitleTrack.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.z(subtitleTrack);
                break;
            }
            case 15: {
                this.o();
                break;
            }
            case 14: {
                this.p();
                break;
            }
            case 13: {
                final boolean k = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.y(k);
                break;
            }
            case 12: {
                this.b();
                break;
            }
            case 11: {
                this.u();
                break;
            }
            case 10: {
                this.a();
                break;
            }
            case 9: {
                int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.A(int1);
                break;
            }
            case 8: {
                this.l();
                break;
            }
            case 7: {
                this.g();
                break;
            }
            case 6: {
                final long long1 = parcel.readLong();
                this.enforceNoDataAvail(parcel);
                this.r(long1);
                break;
            }
            case 5: {
                this.m();
                break;
            }
            case 4: {
                this.n();
                break;
            }
            case 3: {
                this.q();
                break;
            }
            case 2: {
                this.i();
                break;
            }
            case 1: {
                this.j();
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
    
    public final void g() {
        this.k.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(this, 17));
    }
    
    public final void h() {
        this.k.post((Runnable)new a(this, 0));
    }
    
    public final void i() {
        this.k.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(this, 15));
    }
    
    public final void j() {
        this.k.post((Runnable)new a(this, 7));
    }
    
    public final void k() {
        this.k.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(this, 18));
    }
    
    public final void l() {
        this.k.post((Runnable)new a(this, 8));
    }
    
    public final void m() {
        this.k.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(this, 16));
        this.m.p(wya.c(28239));
    }
    
    public final void n() {
        this.k.post((Runnable)new a(this, 4));
        this.m.p(wya.c(28240));
    }
    
    public final void o() {
        this.k.post((Runnable)new a(this, 6));
    }
    
    public final void p() {
        this.k.post((Runnable)new a(this, 5));
    }
    
    public final void q() {
        this.k.post((Runnable)new a(this, 9));
    }
    
    public final void r(final long n) {
        this.k.post((Runnable)new gtg(this, n, 7));
    }
    
    public final void s() {
        this.i.t();
    }
    
    public final void t() {
        this.i.u();
    }
    
    public final void u() {
        this.k.post((Runnable)new a(this, 1));
        this.m.p(wya.c(28666));
        this.m.p(wya.c(23851));
    }
    
    public final void v() {
        this.k.post((Runnable)new a(this, 2));
    }
    
    public final void w(final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        this.k.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, subscriptionNotificationMenuItem, 18));
    }
    
    public final void x() {
        this.e.j();
    }
    
    public final void y(final boolean b) {
        this.k.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.a(this, b, 16));
    }
    
    public final void z(final SubtitleTrack subtitleTrack) {
        this.k.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, subtitleTrack, 17));
    }
}
