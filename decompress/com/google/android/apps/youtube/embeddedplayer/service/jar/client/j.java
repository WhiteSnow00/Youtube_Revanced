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
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PermissionsWrapper;
import android.os.IInterface;

public interface j extends IInterface
{
    String a(final String p0);
    
    void b(final PermissionsWrapper p0);
    
    void g(final CommandWrapper p0);
    
    void h(final Bitmap p0);
    
    void i(final PlayabilityStatusWrapper p0);
    
    void j(final ShareButtonData p0);
    
    void k(final SubscribeButtonData p0);
    
    void l(final SubscriptionNotificationButtonData p0);
    
    void m(final SubscriptionNotificationMenuData p0);
    
    void n(final int p0);
    
    void o(final Bitmap p0);
    
    void p(final VideoDetails p0);
    
    void q(final WatchLaterButtonData p0);
}
