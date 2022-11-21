// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.s;
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

public final class e extends abcq implements View$OnClickListener, a, d
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
    public final slt s;
    public atky t;
    private FrameLayout u;
    private FrameLayout v;
    private YouTubeButton w;
    private boolean x;
    private boolean y;
    
    public e(final Context context, final c a, final slt s, final byte[] array) {
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
                        tqf.v((View)c, this.y);
                        tqf.v((View)this.w, this.x);
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
    
    public final View c(final Context context) {
        this.u = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.d(this, context);
        LayoutInflater.from(context).inflate(2131624393, (ViewGroup)this.u);
        this.v = (FrameLayout)this.u.findViewById(2131428839);
        this.c = (WatchLaterButton)this.u.findViewById(2131428840);
        this.w = (YouTubeButton)this.u.findViewById(2131428837);
        this.d = (ImageView)this.u.findViewById(2131428838);
        this.t = new atky((TouchImageView)this.u.findViewById(2131428836));
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.e a = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.e.a(context, this.v);
        this.b = a;
        a.d = this;
        a.e = this.f;
        a.f = this.g;
        a.ri(this.h);
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.e b = this.b;
        b.g = this.e;
        b.k(this.j);
        this.b.l(this.l);
        this.b.f(this.m);
        this.b.rh(this.n);
        this.b.z(this.o);
        this.b.A(this.p);
        this.c.setOnClickListener((View$OnClickListener)this);
        final WatchLaterButton c = this.c;
        c.b = this;
        c.a(this.q);
        this.w.setOnClickListener((View$OnClickListener)this);
        this.n(this.x);
        this.d.setImageBitmap(this.k.d);
        ((TouchImageView)this.t.b).setOnClickListener((View$OnClickListener)new kqc(this, context, 12));
        this.t.E(this.j);
        return (View)this.u;
    }
    
    public final /* bridge */ void e(final Context context, final View view) {
        final FrameLayout frameLayout = (FrameLayout)view;
    }
    
    public final void m() {
        this.Y();
        this.ow();
    }
    
    public final void n(final boolean x) {
        this.x = x;
        final YouTubeButton w = this.w;
        if (w != null) {
            tqf.v((View)w, x);
            if (this.x) {
                this.a.g();
            }
        }
    }
    
    public final boolean oW() {
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
        final s s = (s)this.a;
        final String b = s.q.b;
        if (s.o()) {
            return;
        }
        if (afbj.f(b)) {
            return;
        }
        final IEmbedFragmentService h = s.h;
        if (h == null) {
            return;
        }
        try {
            h.f();
        }
        catch (final RemoteException ex) {}
    }
}
