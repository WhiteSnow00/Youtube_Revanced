// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import android.os.Parcel;
import android.os.IBinder;

public final class d extends eny implements f
{
    public d(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayServiceListener");
    }
    
    public final void A(final int n) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        this.qS(9, qq);
    }
    
    public final void B() {
        this.qS(21, this.qQ());
    }
    
    public final void a() {
        this.qS(10, this.qQ());
    }
    
    public final void b() {
        this.qS(12, this.qQ());
    }
    
    public final void g() {
        this.qS(7, this.qQ());
    }
    
    public final void h() {
        this.qS(24, this.qQ());
    }
    
    public final void i() {
        this.qS(2, this.qQ());
    }
    
    public final void j() {
        this.qS(1, this.qQ());
    }
    
    public final void k() {
        this.qS(17, this.qQ());
    }
    
    public final void l() {
        this.qS(8, this.qQ());
    }
    
    public final void m() {
        this.qS(5, this.qQ());
    }
    
    public final void n() {
        this.qS(4, this.qQ());
    }
    
    public final void o() {
        this.qS(15, this.qQ());
    }
    
    public final void p() {
        this.qS(14, this.qQ());
    }
    
    public final void q() {
        this.qS(3, this.qQ());
    }
    
    public final void r(final long n) {
        final Parcel qq = this.qQ();
        qq.writeLong(n);
        this.qS(6, qq);
    }
    
    public final void s() {
        this.qS(23, this.qQ());
    }
    
    public final void t() {
        this.qS(22, this.qQ());
    }
    
    public final void u() {
        this.qS(11, this.qQ());
    }
    
    public final void v() {
        this.qS(19, this.qQ());
    }
    
    public final void w(final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)subscriptionNotificationMenuItem);
        this.qS(20, qq);
    }
    
    public final void x() {
        this.qS(18, this.qQ());
    }
    
    public final void y(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(13, qq);
    }
    
    public final void z(final SubtitleTrack subtitleTrack) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)subtitleTrack);
        this.qS(16, qq);
    }
}
