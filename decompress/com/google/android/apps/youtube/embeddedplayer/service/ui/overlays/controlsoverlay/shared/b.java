// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared;

import android.os.IInterface;
import android.os.IBinder;
import java.util.ArrayList;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.ShareButtonData;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayerErrorMessageRendererWrapper;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import android.os.Parcel;
import android.view.KeyEvent;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.e;

public final class b extends enz implements c
{
    public final aazx a;
    public final abbm b;
    public final abcm c;
    public final abbe d;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b e;
    public final e f;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b g;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b h;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b i;
    public final h j;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.c k;
    private final Handler l;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayClient");
    }
    
    public b(final aazx a, final abbm b, final abcm c, final abbe d, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b e, final e f, final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b g, final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b h, final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b i, final h j, final Handler l) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayClient");
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
        j.getClass();
        this.j = j;
        l.getClass();
        this.l = l;
    }
    
    public final void A(final SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, subscriptionNotificationButtonData, 3));
    }
    
    public final void B(final SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, subscriptionNotificationMenuData, 11));
    }
    
    public final void C(final boolean b) {
        this.l.post((Runnable)new a(this, b, 15));
    }
    
    public final void D(Map iterator) {
        final HashMap hashMap = new HashMap();
        iterator = ((Map)iterator).entrySet().iterator();
        while (iterator.hasNext()) {
            try {
                final Map.Entry entry = (Map.Entry)iterator.next();
                final abcg abcg = (abcg)entry.getKey();
                final Parcelable[] array = (Parcelable[])entry.getValue();
                if (array == null) {
                    continue;
                }
                final TimelineMarker[] array2 = new TimelineMarker[array.length];
                for (int i = 0; i < array.length; ++i) {
                    array2[i] = (TimelineMarker)array[i];
                }
                hashMap.put(abcg, array2);
            }
            catch (final ClassCastException ex) {}
        }
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, (Map)hashMap, 4));
    }
    
    public final void E(final long n, final long n2, final long n3, final long n4) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.a(this, n, n2, n3, n4));
    }
    
    public final void F(final VideoDetails videoDetails) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, videoDetails, 15));
    }
    
    public final void G(final VideoQuality[] array, final int n, final boolean b) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.b(this, array, n, b));
    }
    
    public final void H(final WatchLaterButtonData watchLaterButtonData) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, watchLaterButtonData, 5));
    }
    
    public final void I() {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(this, 12));
    }
    
    public final void J(final List list) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, list, 12));
    }
    
    public final void K() {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(this, 9));
    }
    
    public final void L(final int n, final KeyEvent keyEvent) {
        this.l.post((Runnable)new qo(this, n, keyEvent, 19));
    }
    
    public final void M(final int n, final KeyEvent keyEvent) {
        this.l.post((Runnable)new qo(this, n, keyEvent, 18));
    }
    
    public final void a() {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(this, 10));
    }
    
    public final void b() {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(this, 11));
    }
    
    public final void c() {
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.c k = this.k;
        if (k != null) {
            k.a = null;
            this.k = null;
        }
    }
    
    protected final boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return false;
            }
            case 35: {
                final boolean k = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.r(k);
                parcel2.writeNoException();
                break;
            }
            case 34: {
                final String string = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.t(string);
                parcel2.writeNoException();
                break;
            }
            case 33: {
                final boolean i = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.x(i);
                parcel2.writeNoException();
                break;
            }
            case 32: {
                final ArrayList typedArrayList = parcel.createTypedArrayList(SubtitleTrack.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.J(typedArrayList);
                parcel2.writeNoException();
                break;
            }
            case 31: {
                this.K();
                parcel2.writeNoException();
                break;
            }
            case 30: {
                final HashMap d = eoa.d(parcel);
                this.enforceNoDataAvail(parcel);
                this.D(d);
                parcel2.writeNoException();
                break;
            }
            case 29: {
                final SubtitleTrack subtitleTrack = (SubtitleTrack)eoa.a(parcel, SubtitleTrack.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.v(subtitleTrack);
                parcel2.writeNoException();
                break;
            }
            case 28: {
                final boolean j = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.h(j);
                parcel2.writeNoException();
                break;
            }
            case 27: {
                final boolean l = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.o(l);
                parcel2.writeNoException();
                break;
            }
            case 26: {
                n = parcel.readInt();
                final KeyEvent keyEvent = (KeyEvent)eoa.a(parcel, KeyEvent.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.M(n, keyEvent);
                parcel2.writeNoException();
                eoa.f(parcel2, true);
                break;
            }
            case 25: {
                n = parcel.readInt();
                final KeyEvent keyEvent2 = (KeyEvent)eoa.a(parcel, KeyEvent.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.L(n, keyEvent2);
                parcel2.writeNoException();
                eoa.f(parcel2, true);
                break;
            }
            case 24: {
                this.b();
                parcel2.writeNoException();
                break;
            }
            case 23: {
                this.g();
                parcel2.writeNoException();
                break;
            }
            case 22: {
                final long long1 = parcel.readLong();
                final long long2 = parcel.readLong();
                final long long3 = parcel.readLong();
                final long long4 = parcel.readLong();
                this.enforceNoDataAvail(parcel);
                this.E(long1, long2, long3, long4);
                parcel2.writeNoException();
                break;
            }
            case 21: {
                final boolean m = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.u(m);
                parcel2.writeNoException();
                break;
            }
            case 20: {
                final PlayerErrorMessageRendererWrapper playerErrorMessageRendererWrapper = (PlayerErrorMessageRendererWrapper)eoa.a(parcel, PlayerErrorMessageRendererWrapper.CREATOR);
                final boolean k2 = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.m(playerErrorMessageRendererWrapper, k2);
                parcel2.writeNoException();
                break;
            }
            case 19: {
                final String string2 = parcel.readString();
                final boolean k3 = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.l(string2, k3);
                parcel2.writeNoException();
                break;
            }
            case 18: {
                final ControlsState controlsState = (ControlsState)eoa.a(parcel, ControlsState.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.k(controlsState);
                parcel2.writeNoException();
                break;
            }
            case 17: {
                this.a();
                parcel2.writeNoException();
                break;
            }
            case 16: {
                this.I();
                parcel2.writeNoException();
                break;
            }
            case 15: {
                final boolean k4 = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.q(k4);
                parcel2.writeNoException();
                break;
            }
            case 14: {
                final boolean k5 = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.p(k5);
                parcel2.writeNoException();
                break;
            }
            case 13: {
                final boolean k6 = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.s(k6);
                parcel2.writeNoException();
                break;
            }
            case 12: {
                final boolean k7 = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.n(k7);
                parcel2.writeNoException();
                break;
            }
            case 11: {
                final VideoQuality[] array = (VideoQuality[])parcel.createTypedArray(VideoQuality.CREATOR);
                n = parcel.readInt();
                final boolean k8 = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.G(array, n, k8);
                parcel2.writeNoException();
                break;
            }
            case 10: {
                final boolean k9 = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.C(k9);
                parcel2.writeNoException();
                break;
            }
            case 9: {
                final ShareButtonData shareButtonData = (ShareButtonData)eoa.a(parcel, ShareButtonData.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.w(shareButtonData);
                parcel2.writeNoException();
                break;
            }
            case 8: {
                final WatchLaterButtonData watchLaterButtonData = (WatchLaterButtonData)eoa.a(parcel, WatchLaterButtonData.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.H(watchLaterButtonData);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                final SubscriptionNotificationMenuData subscriptionNotificationMenuData = (SubscriptionNotificationMenuData)eoa.a(parcel, SubscriptionNotificationMenuData.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.B(subscriptionNotificationMenuData);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                final SubscriptionNotificationButtonData subscriptionNotificationButtonData = (SubscriptionNotificationButtonData)eoa.a(parcel, SubscriptionNotificationButtonData.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.A(subscriptionNotificationButtonData);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                final SubscribeButtonData subscribeButtonData = (SubscribeButtonData)eoa.a(parcel, SubscribeButtonData.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.z(subscribeButtonData);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                final VideoDetails videoDetails = (VideoDetails)eoa.a(parcel, VideoDetails.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.F(videoDetails);
                parcel2.writeNoException();
                break;
            }
            case 3: {
                final Bitmap bitmap = (Bitmap)eoa.a(parcel, Bitmap.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.i(bitmap);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                final ControlsOverlayStyle controlsOverlayStyle = (ControlsOverlayStyle)eoa.a(parcel, ControlsOverlayStyle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.y(controlsOverlayStyle);
                parcel2.writeNoException();
                break;
            }
            case 1: {
                final IBinder strongBinder = parcel.readStrongBinder();
                Object o;
                if (strongBinder == null) {
                    o = null;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayServiceListener");
                    if (queryLocalInterface instanceof f) {
                        o = queryLocalInterface;
                    }
                    else {
                        o = new d(strongBinder);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.j((f)o);
                parcel2.writeNoException();
                break;
            }
        }
        return true;
    }
    
    public final void g() {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(this, 13));
    }
    
    public final void h(final boolean b) {
        this.l.post((Runnable)new a(this, b, 14));
    }
    
    public final void i(final Bitmap bitmap) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, bitmap, 9));
    }
    
    public final void j(final f f) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, f, 10));
    }
    
    public final void k(final ControlsState controlsState) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, controlsState, 6));
    }
    
    public final void l(final String s, final boolean b) {
        this.l.post((Runnable)new hrw(this, s, b, 5));
    }
    
    public final void m(final PlayerErrorMessageRendererWrapper playerErrorMessageRendererWrapper, final boolean b) {
        this.l.post((Runnable)new hrw(this, playerErrorMessageRendererWrapper, b, 6));
    }
    
    public final void n(final boolean b) {
        this.l.post((Runnable)new a(this, b, 9));
    }
    
    public final void o(final boolean b) {
        this.l.post((Runnable)new a(this, b, 8));
    }
    
    public final void p(final boolean b) {
        this.l.post((Runnable)new a(this, b, 6));
    }
    
    public final void q(final boolean b) {
        this.l.post((Runnable)new a(this, b, 11));
    }
    
    public final void r(final boolean b) {
        this.l.post((Runnable)new a(this, b, 7));
    }
    
    public final void s(final boolean b) {
        this.l.post((Runnable)new a(this, b, 12));
    }
    
    public final void t(final String s) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, s, 16));
    }
    
    public final void u(final boolean b) {
        this.l.post((Runnable)new a(this, b, 10));
    }
    
    public final void v(final SubtitleTrack subtitleTrack) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, subtitleTrack, 8));
    }
    
    public final void w(final ShareButtonData shareButtonData) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, shareButtonData, 7));
    }
    
    public final void x(final boolean b) {
        this.l.post((Runnable)new a(this, b, 13));
    }
    
    public final void y(final ControlsOverlayStyle controlsOverlayStyle) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, controlsOverlayStyle, 14));
    }
    
    public final void z(final SubscribeButtonData subscribeButtonData) {
        this.l.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, subscribeButtonData, 13));
    }
}
