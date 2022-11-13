// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.model.c;
import j$.util.Optional;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.f;
import com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.ShareButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayabilityStatusWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import android.os.Parcel;
import java.util.Iterator;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PermissionsWrapper;

public final class i extends eoa implements j
{
    private final t a;
    
    public i() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
    }
    
    public i(final t a) {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
        this.a = a;
    }
    
    public final String a(final String s) {
        return this.a.d(s);
    }
    
    public final void b(final PermissionsWrapper permissionsWrapper) {
        final t a = this.a;
        final boolean b = ((ajnl)permissionsWrapper.a).b;
        if (b && !a.a.isEmpty()) {
            for (final s s : a.a) {
                a.l(s.b(), s.a());
            }
        }
        a.d.post((Runnable)new dmv(a, b, 20));
        a.a.clear();
        int s2;
        if (!b) {
            s2 = 3;
        }
        else {
            s2 = 2;
        }
        a.s = s2;
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        boolean mn = false;
        switch (int1) {
            default: {
                return false;
            }
            case 14: {
                final CommandWrapper commandWrapper = (CommandWrapper)eob.a(parcel, CommandWrapper.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.g(commandWrapper);
                parcel2.writeNoException();
                break;
            }
            case 13: {
                final PermissionsWrapper permissionsWrapper = (PermissionsWrapper)eob.a(parcel, PermissionsWrapper.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.b(permissionsWrapper);
                parcel2.writeNoException();
                break;
            }
            case 12: {
                final e g = this.a.c.g;
                if (g != null) {
                    mn = ((abbk)g).mn();
                }
                parcel2.writeNoException();
                eob.f(parcel2, mn);
                break;
            }
            case 11: {
                final String string = parcel.readString();
                this.enforceNoDataAvail(parcel);
                final String a = this.a(string);
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            }
            case 10: {
                final PlayabilityStatusWrapper playabilityStatusWrapper = (PlayabilityStatusWrapper)eob.a(parcel, PlayabilityStatusWrapper.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.i(playabilityStatusWrapper);
                parcel2.writeNoException();
                break;
            }
            case 9: {
                final ShareButtonData shareButtonData = (ShareButtonData)eob.a(parcel, ShareButtonData.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.j(shareButtonData);
                parcel2.writeNoException();
                break;
            }
            case 8: {
                final WatchLaterButtonData watchLaterButtonData = (WatchLaterButtonData)eob.a(parcel, WatchLaterButtonData.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.q(watchLaterButtonData);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.n(int1);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                final SubscriptionNotificationMenuData subscriptionNotificationMenuData = (SubscriptionNotificationMenuData)eob.a(parcel, SubscriptionNotificationMenuData.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.m(subscriptionNotificationMenuData);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                final SubscriptionNotificationButtonData subscriptionNotificationButtonData = (SubscriptionNotificationButtonData)eob.a(parcel, SubscriptionNotificationButtonData.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.l(subscriptionNotificationButtonData);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                final SubscribeButtonData subscribeButtonData = (SubscribeButtonData)eob.a(parcel, SubscribeButtonData.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.k(subscribeButtonData);
                parcel2.writeNoException();
                break;
            }
            case 3: {
                final Bitmap bitmap = (Bitmap)eob.a(parcel, Bitmap.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.h(bitmap);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                final VideoDetails videoDetails = (VideoDetails)eob.a(parcel, VideoDetails.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.p(videoDetails);
                parcel2.writeNoException();
                break;
            }
            case 1: {
                final Bitmap bitmap2 = (Bitmap)eob.a(parcel, Bitmap.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.o(bitmap2);
                parcel2.writeNoException();
                break;
            }
        }
        return true;
    }
    
    public final void g(final CommandWrapper commandWrapper) {
        final t a = this.a;
        final aiqj aiqj = (aiqj)commandWrapper.a;
        if (!a.o()) {
            a.g.a(aiqj);
        }
    }
    
    public final void h(final Bitmap bitmap) {
        final t a = this.a;
        a.d.post((Runnable)new a(a, bitmap, 9));
    }
    
    public final void i(final PlayabilityStatusWrapper playabilityStatusWrapper) {
        final t a = this.a;
        final akwz akwz = (akwz)playabilityStatusWrapper.a;
        int cg;
        if ((cg = aqsx.cG(akwz.c)) == 0) {
            cg = 1;
        }
        if (cg != 1 && cg != 7) {
            ((f)a.b).b(akwz, false, Optional.empty());
            return;
        }
        a.b.a();
        a.d.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.jar.client.a(a, 6));
    }
    
    public final void j(final ShareButtonData shareButtonData) {
        final t a = this.a;
        a.d.post((Runnable)new a(a, shareButtonData, 5));
    }
    
    public final void k(final SubscribeButtonData subscribeButtonData) {
        final t a = this.a;
        a.d.post((Runnable)new a(a, subscribeButtonData, 6));
    }
    
    public final void l(final SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        final t a = this.a;
        a.d.post((Runnable)new a(a, subscriptionNotificationButtonData, 8));
    }
    
    public final void m(final SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        final t a = this.a;
        a.d.post((Runnable)new a(a, subscriptionNotificationMenuData, 11));
    }
    
    public final void n(final int n) {
        final t a = this.a;
        a.d.post((Runnable)new ccm(a, n, 18));
    }
    
    public final void o(final Bitmap bitmap) {
        final t a = this.a;
        final c c = (c)a.m.aX();
        if (c != null) {
            a.m.tu((Object)kzr.m(c.b, c.c, bitmap));
        }
    }
    
    public final void p(final VideoDetails videoDetails) {
        final t a = this.a;
        a.d.post((Runnable)new a(a, videoDetails, 7));
    }
    
    public final void q(final WatchLaterButtonData watchLaterButtonData) {
        final t a = this.a;
        a.d.post((Runnable)new a(a, watchLaterButtonData, 10));
    }
}
