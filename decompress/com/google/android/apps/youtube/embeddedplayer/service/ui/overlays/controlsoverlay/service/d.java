// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service;

import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayerErrorMessageRendererWrapper;
import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.ShareButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g;
import java.util.List;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b;

public final class d implements aazx, abbm, abcm, abbe, b, e, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b, h
{
    public c a;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e b;
    
    public d(final Handler handler, final tdz tdz, final c a, final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.e e) {
        this.a = a;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e b = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e(handler, tdz, e);
        this.b = b;
        try {
            a.j((f)b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void A(final SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.B(subscriptionNotificationMenuData);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void C(final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d e) {
        this.b.e = e;
    }
    
    public final void D(final VideoDetails videoDetails) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.F(videoDetails);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void E(final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c h) {
        this.b.h = h;
    }
    
    public final void F(final WatchLaterButtonData watchLaterButtonData) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.H(watchLaterButtonData);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void b(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.q(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void d() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.g();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void f(final ControlsState controlsState) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.k(controlsState);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void g(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.o(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void j(final SubtitleTrack subtitleTrack) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.v(subtitleTrack);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void k(final ControlsOverlayStyle controlsOverlayStyle) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.y(controlsOverlayStyle);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void l(final abbl b) {
        this.b.b = b;
    }
    
    public final void m(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.C(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void n(final long n, final long n2, final long n3, final long n4) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.E(n, n2, n3, n4);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void o(final VideoQuality[] array, final int n, final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.G(array, n, b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void oD(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.p(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void oE() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.a();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void oF() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.b();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void oG(final String s, final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.l(s, b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void oH(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.n(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final c a = this.a;
        if (a == null) {
            return true;
        }
        try {
            a.L(n, keyEvent);
            return true;
        }
        catch (final RemoteException ex) {
            return true;
        }
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        final c a = this.a;
        if (a == null) {
            return true;
        }
        try {
            a.M(n, keyEvent);
            return true;
        }
        catch (final RemoteException ex) {
            return true;
        }
    }
    
    public final void p(final Bitmap bitmap) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.i(bitmap);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void pj(final aazw a) {
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e b = this.b;
        a.getClass();
        b.a = a;
    }
    
    public final void pk(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.u(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void q(final List list) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.J(list);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void qW(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.h(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void qX(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.r(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void qY(final abbd d) {
        this.b.d = d;
    }
    
    public final void qZ(final g g) {
    }
    
    public final void r(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.s(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void ra(final ShareButtonData shareButtonData) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.w(shareButtonData);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void rb(final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.x(b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void rc(final SubscribeButtonData subscribeButtonData) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.z(subscribeButtonData);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void rd(final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c g) {
        this.b.g = g;
    }
    
    public final void re(final abcl c) {
        this.b.c = c;
    }
    
    public final void rf() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.K();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void s(final CharSequence charSequence) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.t(charSequence.toString());
        }
        catch (final RemoteException ex) {}
    }
    
    public final void t(final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d i) {
        this.b.i = i;
    }
    
    public final void u(final Map map) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.D(map);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void v() {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.I();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void w(final com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c f) {
        this.b.f = f;
    }
    
    public final void y(final ancs ancs, final boolean b) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.m(new PlayerErrorMessageRendererWrapper(ancs), b);
        }
        catch (final RemoteException ex) {}
    }
    
    public final void z(final SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        final c a = this.a;
        if (a == null) {
            return;
        }
        try {
            a.A(subscriptionNotificationButtonData);
        }
        catch (final RemoteException ex) {}
    }
}
