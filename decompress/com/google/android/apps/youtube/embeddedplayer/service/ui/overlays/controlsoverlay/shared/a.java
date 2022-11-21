// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared;

import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.ShareButtonData;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayerErrorMessageRendererWrapper;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import android.os.IInterface;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import android.os.IBinder;

public final class a extends eoc implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayClient");
    }
    
    public final void A(final SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)subscriptionNotificationButtonData);
        this.qX(6, qv);
    }
    
    public final void B(final SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)subscriptionNotificationMenuData);
        this.qX(7, qv);
    }
    
    public final void C(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(10, qv);
    }
    
    public final void D(final Map map) {
        final Parcel qv = this.qV();
        qv.writeMap(map);
        this.qX(30, qv);
    }
    
    public final void E(final long n, final long n2, final long n3, final long n4) {
        final Parcel qv = this.qV();
        qv.writeLong(n);
        qv.writeLong(n2);
        qv.writeLong(n3);
        qv.writeLong(n4);
        this.qX(22, qv);
    }
    
    public final void F(final VideoDetails videoDetails) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)videoDetails);
        this.qX(4, qv);
    }
    
    public final void G(final VideoQuality[] array, final int n, final boolean b) {
        final Parcel qv = this.qV();
        qv.writeTypedArray((Parcelable[])array, 0);
        qv.writeInt(n);
        eoe.f(qv, b);
        this.qX(11, qv);
    }
    
    public final void H(final WatchLaterButtonData watchLaterButtonData) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)watchLaterButtonData);
        this.qX(8, qv);
    }
    
    public final void I() {
        this.qX(16, this.qV());
    }
    
    public final void J(final List list) {
        final Parcel qv = this.qV();
        qv.writeTypedList(list);
        this.qX(32, qv);
    }
    
    public final void K() {
        this.qX(31, this.qV());
    }
    
    public final void L(final int n, final KeyEvent keyEvent) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        eoe.h(qv, (Parcelable)keyEvent);
        final Parcel qw = this.qW(25, qv);
        eoe.k(qw);
        qw.recycle();
    }
    
    public final void M(final int n, final KeyEvent keyEvent) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        eoe.h(qv, (Parcelable)keyEvent);
        final Parcel qw = this.qW(26, qv);
        eoe.k(qw);
        qw.recycle();
    }
    
    public final void a() {
        this.qX(17, this.qV());
    }
    
    public final void b() {
        this.qX(24, this.qV());
    }
    
    public final void g() {
        this.qX(23, this.qV());
    }
    
    public final void h(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(28, qv);
    }
    
    public final void i(final Bitmap bitmap) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)bitmap);
        this.qX(3, qv);
    }
    
    public final void j(final f f) {
        final Parcel qv = this.qV();
        eoe.j(qv, (IInterface)f);
        this.qX(1, qv);
    }
    
    public final void k(final ControlsState controlsState) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)controlsState);
        this.qX(18, qv);
    }
    
    public final void l(final String s, final boolean b) {
        final Parcel qv = this.qV();
        qv.writeString(s);
        eoe.f(qv, b);
        this.qX(19, qv);
    }
    
    public final void m(final PlayerErrorMessageRendererWrapper playerErrorMessageRendererWrapper, final boolean b) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)playerErrorMessageRendererWrapper);
        eoe.f(qv, b);
        this.qX(20, qv);
    }
    
    public final void n(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(12, qv);
    }
    
    public final void o(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(27, qv);
    }
    
    public final void p(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(14, qv);
    }
    
    public final void q(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(15, qv);
    }
    
    public final void r(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(35, qv);
    }
    
    public final void s(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(13, qv);
    }
    
    public final void t(final String s) {
        final Parcel qv = this.qV();
        qv.writeString(s);
        this.qX(34, qv);
    }
    
    public final void u(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(21, qv);
    }
    
    public final void v(final SubtitleTrack subtitleTrack) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)subtitleTrack);
        this.qX(29, qv);
    }
    
    public final void w(final ShareButtonData shareButtonData) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)shareButtonData);
        this.qX(9, qv);
    }
    
    public final void x(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(33, qv);
    }
    
    public final void y(final ControlsOverlayStyle controlsOverlayStyle) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)controlsOverlayStyle);
        this.qX(2, qv);
    }
    
    public final void z(final SubscribeButtonData subscribeButtonData) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)subscribeButtonData);
        this.qX(5, qv);
    }
}
