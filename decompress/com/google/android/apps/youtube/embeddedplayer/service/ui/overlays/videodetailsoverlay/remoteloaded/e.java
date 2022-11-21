// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.h;
import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import android.view.animation.Animation$AnimationListener;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import java.util.Iterator;
import android.view.animation.AnimationUtils;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.i;
import java.util.HashSet;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.animation.Animation;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.SubscriptionNotificationButton;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.remoteloaded.SubscribeButton;
import java.util.Set;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.f;
import android.view.View$OnClickListener;

public final class e implements View$OnClickListener, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.e, f, b, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.f
{
    public int a;
    public int b;
    public final FrameLayout c;
    public a d;
    public d e;
    public c f;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b g;
    private final CircularImageView i;
    private final TextView j;
    private final TextView k;
    private final Set l;
    private ahbt m;
    private final TextView n;
    private final TextView o;
    private final Set p;
    private ahbt q;
    private final SubscribeButton r;
    private final SubscriptionNotificationButton s;
    private final View t;
    private final Animation u;
    private final Animation v;
    private final cbl w;
    
    private e(final Context context, final FrameLayout c) {
        this.m = ahbt.b;
        this.q = ahbt.b;
        this.g = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        this.c = c;
        LayoutInflater.from(context).inflate(2131625712, (ViewGroup)c);
        this.i = (CircularImageView)c.findViewById(2131428150);
        final TextView j = (TextView)c.findViewById(2131428260);
        this.j = j;
        final TextView k = (TextView)c.findViewById(2131428259);
        this.k = k;
        final HashSet l = new HashSet();
        (this.l = l).add(j);
        l.add(k);
        final View viewById = c.findViewById(2131428961);
        this.t = viewById;
        final TextView n = (TextView)c.findViewById(2131428959);
        this.n = n;
        final TextView o = (TextView)c.findViewById(2131428958);
        this.o = o;
        final HashSet p2 = new HashSet();
        (this.p = p2).add(viewById);
        p2.add(n);
        p2.add(o);
        this.r = (SubscribeButton)c.findViewById(2131431811);
        final SubscriptionNotificationButton s = (SubscriptionNotificationButton)c.findViewById(2131431817);
        this.s = s;
        s.a = (h)new i(context);
        final int integer = context.getResources().getInteger(2131492906);
        final Animation loadAnimation = AnimationUtils.loadAnimation(context, 2130772037);
        this.u = loadAnimation;
        final long n2 = integer;
        loadAnimation.setDuration(n2);
        (this.v = AnimationUtils.loadAnimation(context, 2130772040)).setDuration(n2);
        this.w = new cbl(this, 12);
        this.a = 1;
        this.b = 1;
    }
    
    public static e a(final Context context, final FrameLayout frameLayout) {
        final e e = new e(context, frameLayout);
        e.i.setOnClickListener((View$OnClickListener)e);
        e.j.setOnClickListener((View$OnClickListener)e);
        e.k.setOnClickListener((View$OnClickListener)e);
        e.r.setOnClickListener((View$OnClickListener)e);
        e.r.f = e;
        return (e)(e.s.c = e);
    }
    
    private final void o() {
        final Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            ((View)iterator.next()).setVisibility(8);
        }
    }
    
    private final void p() {
        final Iterator iterator = this.p.iterator();
        while (iterator.hasNext()) {
            ((View)iterator.next()).setVisibility(0);
        }
        final SubscribeButton r = this.r;
        final int e = r.e;
        if (e != 0 && e != 1) {
            if (e != 2 && e != 3) {
                throw new AssertionError((Object)"Subscribe button in invalid state.");
            }
            r.setVisibility(0);
            this.g.d(this.r.d.I());
        }
        else {
            r.setVisibility(8);
        }
        final SubscriptionNotificationButton s = this.s;
        if (s.e.equals(SubscriptionNotificationButtonData.a) || s.f.equals(SubscriptionNotificationMenuData.a)) {
            this.s.setVisibility(8);
            return;
        }
        final int e2 = this.r.e;
        if (e2 == 0 || e2 == 1 || e2 == 2) {
            this.s.setVisibility(8);
            return;
        }
        if (e2 == 3) {
            this.s.setVisibility(0);
            this.g.d(this.s.e.c().I());
            return;
        }
        throw new AssertionError((Object)"Subscribe button in invalid state.");
    }
    
    private static final void q(final View view, final Animation animation) {
        if (view.getVisibility() == 0) {
            view.startAnimation(animation);
        }
    }
    
    public final void A(final SubscriptionNotificationMenuData f) {
        final SubscriptionNotificationButton s = this.s;
        s.f = f;
        s.setOnClickListener((View$OnClickListener)s);
        s.c.d();
    }
    
    public final void b() {
        final Iterator iterator = this.p.iterator();
        while (iterator.hasNext()) {
            ((View)iterator.next()).setVisibility(8);
        }
        this.r.setVisibility(8);
        this.s.setVisibility(8);
    }
    
    public final void c() {
        if (this.b == 3) {
            this.p();
        }
    }
    
    public final void d() {
        this.c();
    }
    
    public final void e() {
        this.n(1);
        this.f(null);
        this.h(null);
        this.g(null);
        this.j(null);
        this.i(null);
    }
    
    public final void f(final Bitmap imageBitmap) {
        this.i.setImageBitmap(imageBitmap);
    }
    
    public final void g(final CharSequence text) {
        this.k.setText(text);
    }
    
    public final void h(final CharSequence text) {
        this.j.setText(text);
    }
    
    public final void i(final CharSequence text) {
        this.o.setText(text);
    }
    
    public final void j(final CharSequence text) {
        this.n.setText(text);
    }
    
    public final void k(final int a) {
        final SubscribeButton r = this.r;
        r.a = a;
        r.a();
    }
    
    public final void l(final VideoDetails videoDetails) {
        if (videoDetails == null) {
            return;
        }
        if (videoDetails.equals(VideoDetails.a)) {
            this.e();
            return;
        }
        this.h(videoDetails.a().c());
        this.g(videoDetails.a().b());
        this.m = videoDetails.a().a();
        this.j(videoDetails.b().c());
        this.i(videoDetails.b().b());
        this.q = videoDetails.b().a();
        this.n(2);
    }
    
    public final void m() {
        final Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            ((View)iterator.next()).setVisibility(0);
        }
    }
    
    public final void n(final int b) {
        final int b2 = this.b;
        if (b2 != b) {
            this.a = b2;
            if ((this.b = b) != 2) {
                if (b != 3) {
                    this.i.setVisibility(8);
                    this.o();
                    this.b();
                }
                else {
                    this.g.d(this.q.I());
                    this.i.setVisibility(0);
                    this.o();
                    this.p();
                    this.u.setAnimationListener((Animation$AnimationListener)this.w);
                    final Iterator iterator = this.p.iterator();
                    while (iterator.hasNext()) {
                        q((View)iterator.next(), this.u);
                    }
                    q((View)this.r, this.u);
                    q((View)this.s, this.u);
                }
            }
            else {
                this.g.d(this.m.I());
                this.i.setVisibility(0);
                if (b2 == 3) {
                    this.v.setAnimationListener((Animation$AnimationListener)this.w);
                    final Iterator iterator2 = this.p.iterator();
                    while (iterator2.hasNext()) {
                        q((View)iterator2.next(), this.v);
                    }
                    q((View)this.r, this.v);
                    q((View)this.s, this.v);
                    return;
                }
                this.b();
                this.m();
            }
            final a d = this.d;
            if (d != null) {
                d.J(this.b);
            }
        }
    }
    
    public final void onClick(final View view) {
        if (view == null) {
            return;
        }
        if (view == this.i) {
            final int b = this.b;
            if (b == 3) {
                this.n(2);
                return;
            }
            if (b == 2) {
                this.n(3);
            }
        }
        else {
            if (view != this.j && view != this.k) {
                if (view == this.r) {
                    final c f = this.f;
                    if (f != null) {
                        f.h();
                        this.g.b(this.r.d.I());
                    }
                }
                return;
            }
            final d e = this.e;
            if (e != null) {
                e.j();
                this.g.b(this.m.I());
            }
        }
    }
    
    public final void rh(final SubscribeButtonData subscribeButtonData) {
        final SubscribeButton r = this.r;
        r.e = subscribeButtonData.a();
        r.b = subscribeButtonData.d();
        r.c = subscribeButtonData.c();
        r.d = subscribeButtonData.b();
        r.a();
        final f f = r.f;
        if (f != null) {
            ((e)f).c();
        }
    }
    
    public final void ri(final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c b) {
        this.s.b = b;
    }
    
    public final void w(final c f) {
        this.f = f;
    }
    
    public final void z(final SubscriptionNotificationButtonData e) {
        final SubscriptionNotificationButton s = this.s;
        s.e = e;
        s.setContentDescription((CharSequence)e.d());
        final int a = e.a();
        Drawable imageDrawable;
        if (a != 1) {
            if (a != 2) {
                if (a != 3) {
                    imageDrawable = null;
                }
                else {
                    imageDrawable = s.getResources().getDrawable(2131232551);
                }
            }
            else {
                imageDrawable = s.getResources().getDrawable(2131232555);
            }
        }
        else {
            imageDrawable = s.getResources().getDrawable(2131232554);
        }
        s.setImageDrawable(imageDrawable);
        s.c.d();
    }
}
