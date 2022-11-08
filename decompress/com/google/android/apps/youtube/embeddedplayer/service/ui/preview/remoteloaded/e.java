// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.u;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b;
import android.widget.ImageView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.WatchLaterButton;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.a;
import android.view.View$OnClickListener;

public final class e extends aazp implements View$OnClickListener, a, d
{
    public final c a;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.e b;
    public WatchLaterButton c;
    public ImageView d;
    public b e;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d f;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c g;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c h;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c i;
    public int j;
    public com.google.android.apps.youtube.embeddedplayer.service.model.c k;
    public VideoDetails l;
    public Bitmap m;
    public SubscribeButtonData n;
    public SubscriptionNotificationButtonData o;
    public SubscriptionNotificationMenuData p;
    public WatchLaterButtonData q;
    public boolean r;
    public final sin s;
    public athj t;
    private FrameLayout u;
    private FrameLayout v;
    private YouTubeButton w;
    private boolean x;
    private boolean y;
    
    public e(final Context context, final c a, final sin s, final byte[] array) {
        super(context);
        this.e = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        this.f = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d.u;
        this.g = com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c.w;
        this.h = com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c.w;
        this.i = com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c.w;
        this.k = com.google.android.apps.youtube.embeddedplayer.service.model.c.a;
        this.l = VideoDetails.a;
        this.n = SubscribeButtonData.a;
        this.o = SubscriptionNotificationButtonData.a;
        this.p = SubscriptionNotificationMenuData.a;
        this.q = WatchLaterButtonData.a;
        this.a = a;
        this.s = s;
    }
    
    public final void J(final int n) {
        final WatchLaterButton c = this.c;
        if (c != null) {
            if (this.w != null) {
                if (n != 1) {
                    if (n != 2) {
                        if (n == 3) {
                            c.setVisibility(8);
                            this.w.setVisibility(8);
                            return;
                        }
                        throw new AssertionError((Object)"VideoDetailsView in invalid state");
                    }
                    else {
                        tmy.v((View)c, this.y);
                        tmy.v((View)this.w, this.x);
                        if (this.x) {
                            this.a.g();
                        }
                    }
                }
            }
        }
    }
    
    public final void K(int n) {
        Label_0043: {
            if (n != 0) {
                final int n2 = 1;
                if (n != 1) {
                    if (n == 2) {
                        this.y = true;
                        n = n2;
                        break Label_0043;
                    }
                    throw new AssertionError((Object)"Watch later button in invalid state.");
                }
            }
            this.y = false;
            n = 0;
        }
        final WatchLaterButton c = this.c;
        if (c != null && n != 0) {
            c.setVisibility(0);
            this.e.d(this.c.a.I());
        }
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void m() {
        this.Y();
        this.mm();
    }
    
    public final void n(final boolean x) {
        this.x = x;
        final YouTubeButton w = this.w;
        if (w != null) {
            tmy.v((View)w, x);
            if (this.x) {
                this.a.g();
            }
        }
    }
    
    public final boolean oU() {
        return this.r && !this.l.equals(VideoDetails.a);
    }
    
    public final void onClick(final View view) {
        if (view == this.c) {
            this.i.k();
            this.e.b(this.c.a.I());
        }
        if (view != this.w) {
            return;
        }
        final u u = (u)this.a;
        final String b = u.q.b;
        if (u.o()) {
            return;
        }
        if (aexs.f(b)) {
            return;
        }
        final IEmbedFragmentService h = u.h;
        if (h == null) {
            return;
        }
        try {
            h.f();
        }
        catch (final RemoteException ex) {}
    }
}
