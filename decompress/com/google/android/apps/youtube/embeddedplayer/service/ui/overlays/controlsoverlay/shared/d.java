// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import android.os.Parcel;
import android.os.IBinder;

public final class d extends eoc implements f
{
    public d(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayServiceListener");
    }
    
    public final void A(final int n) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        this.qX(9, qv);
    }
    
    public final void B() {
        this.qX(21, this.qV());
    }
    
    public final void a() {
        this.qX(10, this.qV());
    }
    
    public final void b() {
        this.qX(12, this.qV());
    }
    
    public final void g() {
        this.qX(7, this.qV());
    }
    
    public final void h() {
        this.qX(24, this.qV());
    }
    
    public final void i() {
        this.qX(2, this.qV());
    }
    
    public final void j() {
        this.qX(1, this.qV());
    }
    
    public final void k() {
        this.qX(17, this.qV());
    }
    
    public final void l() {
        this.qX(8, this.qV());
    }
    
    public final void m() {
        this.qX(5, this.qV());
    }
    
    public final void n() {
        this.qX(4, this.qV());
    }
    
    public final void o() {
        this.qX(15, this.qV());
    }
    
    public final void p() {
        this.qX(14, this.qV());
    }
    
    public final void q() {
        this.qX(3, this.qV());
    }
    
    public final void r(final long n) {
        final Parcel qv = this.qV();
        qv.writeLong(n);
        this.qX(6, qv);
    }
    
    public final void s() {
        this.qX(23, this.qV());
    }
    
    public final void t() {
        this.qX(22, this.qV());
    }
    
    public final void u() {
        this.qX(11, this.qV());
    }
    
    public final void v() {
        this.qX(19, this.qV());
    }
    
    public final void w(final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)subscriptionNotificationMenuItem);
        this.qX(20, qv);
    }
    
    public final void x() {
        this.qX(18, this.qV());
    }
    
    public final void y(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(13, qv);
    }
    
    public final void z(final SubtitleTrack subtitleTrack) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)subtitleTrack);
        this.qX(16, qv);
    }
}
