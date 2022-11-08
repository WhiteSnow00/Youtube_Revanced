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
import android.graphics.Bitmap;
import android.view.KeyEvent;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import android.os.IInterface;

public interface c extends IInterface
{
    void A(final SubscriptionNotificationButtonData p0);
    
    void B(final SubscriptionNotificationMenuData p0);
    
    void C(final boolean p0);
    
    void D(final Map p0);
    
    void E(final long p0, final long p1, final long p2, final long p3);
    
    void F(final VideoDetails p0);
    
    void G(final VideoQuality[] p0, final int p1, final boolean p2);
    
    void H(final WatchLaterButtonData p0);
    
    void I();
    
    void J(final List p0);
    
    void K();
    
    void L(final int p0, final KeyEvent p1);
    
    void M(final int p0, final KeyEvent p1);
    
    void a();
    
    void b();
    
    void g();
    
    void h(final boolean p0);
    
    void i(final Bitmap p0);
    
    void j(final f p0);
    
    void k(final ControlsState p0);
    
    void l(final String p0, final boolean p1);
    
    void m(final PlayerErrorMessageRendererWrapper p0, final boolean p1);
    
    void n(final boolean p0);
    
    void o(final boolean p0);
    
    void p(final boolean p0);
    
    void q(final boolean p0);
    
    void r(final boolean p0);
    
    void s(final boolean p0);
    
    void t(final String p0);
    
    void u(final boolean p0);
    
    void v(final SubtitleTrack p0);
    
    void w(final ShareButtonData p0);
    
    void x(final boolean p0);
    
    void y(final ControlsOverlayStyle p0);
    
    void z(final SubscribeButtonData p0);
}
