// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.ShareButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayabilityStatusWrapper;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PermissionsWrapper;
import android.os.Parcel;
import android.os.IBinder;

public final class h extends enz implements j
{
    public h(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
    }
    
    public final String a(String string) {
        final Parcel qw = this.qW();
        qw.writeString(string);
        final Parcel qx = this.qX(11, qw);
        string = qx.readString();
        qx.recycle();
        return string;
    }
    
    public final void b(final PermissionsWrapper permissionsWrapper) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)permissionsWrapper);
        this.qY(13, qw);
    }
    
    public final void g(final CommandWrapper commandWrapper) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)commandWrapper);
        this.qY(14, qw);
    }
    
    public final void h(final Bitmap bitmap) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)bitmap);
        this.qY(3, qw);
    }
    
    public final void i(final PlayabilityStatusWrapper playabilityStatusWrapper) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)playabilityStatusWrapper);
        this.qY(10, qw);
    }
    
    public final void j(final ShareButtonData shareButtonData) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)shareButtonData);
        this.qY(9, qw);
    }
    
    public final void k(final SubscribeButtonData subscribeButtonData) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)subscribeButtonData);
        this.qY(4, qw);
    }
    
    public final void l(final SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)subscriptionNotificationButtonData);
        this.qY(5, qw);
    }
    
    public final void m(final SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)subscriptionNotificationMenuData);
        this.qY(6, qw);
    }
    
    public final void n(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        this.qY(7, qw);
    }
    
    public final void o(final Bitmap bitmap) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)bitmap);
        this.qY(1, qw);
    }
    
    public final void p(final VideoDetails videoDetails) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)videoDetails);
        this.qY(2, qw);
    }
    
    public final void q(final WatchLaterButtonData watchLaterButtonData) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)watchLaterButtonData);
        this.qY(8, qw);
    }
}
