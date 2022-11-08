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

public final class a extends eny implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayClient");
    }
    
    public final void A(final SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)subscriptionNotificationButtonData);
        this.qS(6, qq);
    }
    
    public final void B(final SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)subscriptionNotificationMenuData);
        this.qS(7, qq);
    }
    
    public final void C(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(10, qq);
    }
    
    public final void D(final Map map) {
        final Parcel qq = this.qQ();
        qq.writeMap(map);
        this.qS(30, qq);
    }
    
    public final void E(final long n, final long n2, final long n3, final long n4) {
        final Parcel qq = this.qQ();
        qq.writeLong(n);
        qq.writeLong(n2);
        qq.writeLong(n3);
        qq.writeLong(n4);
        this.qS(22, qq);
    }
    
    public final void F(final VideoDetails videoDetails) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)videoDetails);
        this.qS(4, qq);
    }
    
    public final void G(final VideoQuality[] array, final int n, final boolean b) {
        final Parcel qq = this.qQ();
        qq.writeTypedArray((Parcelable[])array, 0);
        qq.writeInt(n);
        eoa.f(qq, b);
        this.qS(11, qq);
    }
    
    public final void H(final WatchLaterButtonData watchLaterButtonData) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)watchLaterButtonData);
        this.qS(8, qq);
    }
    
    public final void I() {
        this.qS(16, this.qQ());
    }
    
    public final void J(final List list) {
        final Parcel qq = this.qQ();
        qq.writeTypedList(list);
        this.qS(32, qq);
    }
    
    public final void K() {
        this.qS(31, this.qQ());
    }
    
    public final void L(final int n, final KeyEvent keyEvent) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        eoa.h(qq, (Parcelable)keyEvent);
        final Parcel qr = this.qR(25, qq);
        eoa.k(qr);
        qr.recycle();
    }
    
    public final void M(final int n, final KeyEvent keyEvent) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        eoa.h(qq, (Parcelable)keyEvent);
        final Parcel qr = this.qR(26, qq);
        eoa.k(qr);
        qr.recycle();
    }
    
    public final void a() {
        this.qS(17, this.qQ());
    }
    
    public final void b() {
        this.qS(24, this.qQ());
    }
    
    public final void g() {
        this.qS(23, this.qQ());
    }
    
    public final void h(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(28, qq);
    }
    
    public final void i(final Bitmap bitmap) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)bitmap);
        this.qS(3, qq);
    }
    
    public final void j(final f f) {
        final Parcel qq = this.qQ();
        eoa.j(qq, (IInterface)f);
        this.qS(1, qq);
    }
    
    public final void k(final ControlsState controlsState) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)controlsState);
        this.qS(18, qq);
    }
    
    public final void l(final String s, final boolean b) {
        final Parcel qq = this.qQ();
        qq.writeString(s);
        eoa.f(qq, b);
        this.qS(19, qq);
    }
    
    public final void m(final PlayerErrorMessageRendererWrapper playerErrorMessageRendererWrapper, final boolean b) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)playerErrorMessageRendererWrapper);
        eoa.f(qq, b);
        this.qS(20, qq);
    }
    
    public final void n(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(12, qq);
    }
    
    public final void o(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(27, qq);
    }
    
    public final void p(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(14, qq);
    }
    
    public final void q(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(15, qq);
    }
    
    public final void r(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(35, qq);
    }
    
    public final void s(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(13, qq);
    }
    
    public final void t(final String s) {
        final Parcel qq = this.qQ();
        qq.writeString(s);
        this.qS(34, qq);
    }
    
    public final void u(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(21, qq);
    }
    
    public final void v(final SubtitleTrack subtitleTrack) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)subtitleTrack);
        this.qS(29, qq);
    }
    
    public final void w(final ShareButtonData shareButtonData) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)shareButtonData);
        this.qS(9, qq);
    }
    
    public final void x(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(33, qq);
    }
    
    public final void y(final ControlsOverlayStyle controlsOverlayStyle) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)controlsOverlayStyle);
        this.qS(2, qq);
    }
    
    public final void z(final SubscribeButtonData subscribeButtonData) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)subscribeButtonData);
        this.qS(5, qq);
    }
}
