// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.jar.e;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService;
import android.view.ViewGroup;
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
import com.google.android.apps.youtube.embeddedplayer.service.jar.h;
import com.google.android.apps.youtube.embeddedplayer.service.jar.a;
import java.lang.ref.WeakReference;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.b;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.c;

public final class t implements c, d, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c
{
    public static final int t = 0;
    public List a;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c b;
    public b c;
    public final Handler d;
    public final WeakReference e;
    public final a f;
    public h g;
    public IEmbedFragmentService h;
    public j i;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b j;
    public aehh k;
    public com.google.android.apps.youtube.embeddedplayer.service.model.d l;
    public final atjm m;
    public com.google.android.apps.youtube.embeddedplayer.service.jar.client.d n;
    public int o;
    public int p;
    public SimplePlaybackDescriptor q;
    public Bundle r;
    public int s;
    private String v;
    private boolean x;
    
    static {
        ttr.k("YouTubeAndroidPlayerAPI");
    }
    
    public t(final Context context, final a f) {
        this.j = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        this.k = (aehh)new aehg();
        this.l = com.google.android.apps.youtube.embeddedplayer.service.model.d.a;
        this.m = atjm.aW((Object)com.google.android.apps.youtube.embeddedplayer.service.model.c.a);
        this.s = 1;
        this.o = -1;
        this.e = new WeakReference((T)context);
        f.getClass();
        this.f = f;
        this.d = new Handler(context.getMainLooper());
    }
    
    public static int a(final boolean b) {
        if (b) {
            return 1;
        }
        return 0;
    }
    
    public static asie c(final asie asie, final asie asie2, final a a, final ViewGroup viewGroup, final IEmbedFragmentServiceFactoryService embedFragmentServiceFactoryService) {
        return asie.W((asih)asie.L(asil.a()), (asih)asie2.L(asil.a()), (asji)new q(a, viewGroup, 0)).L(atjj.a()).J((asjr)new e(embedFragmentServiceFactoryService, 2)).o();
    }
    
    public final Bundle b() {
        final Bundle bundle = new Bundle();
        if (this.q != null) {
            bundle.putBoolean("has_simple_start_descriptor", true);
            final SimplePlaybackDescriptor q = this.q;
            bundle.putInt("spd_descriptor_type", q.a);
            bundle.putString("spd_video_id", q.b);
            bundle.putString("spd_playlist_id", q.c);
            bundle.putStringArrayList("spd_video_ids_list", q.d);
            bundle.putInt("spd_start_index", q.f);
            bundle.putInt("spd_start_millis", q.g);
        }
        Bundle f;
        if (!this.o()) {
            f = this.g.f(this);
        }
        else {
            f = null;
        }
        Bundle r = f;
        if (f == null) {
            r = this.r;
        }
        if (r != null) {
            bundle.putBundle("saved_coordinator_state", r);
        }
        return bundle;
    }
    
    public final String d(String a) {
        try {
            a = this.k.a(a);
            return a;
        }
        catch (final RemoteException ex) {
            afse.o("Cannot get embed config, client disconnected.");
            return "";
        }
    }
    
    public final void e() {
        if (!this.o() && this.p == 8) {
            if (!this.x) {
                final Bundle r = this.r;
                if (r != null) {
                    this.g.r(this, r);
                    this.x = true;
                    return;
                }
                final SimplePlaybackDescriptor q = this.q;
                if (q != null) {
                    if (q.e != 0) {
                        this.g.q(this, q, this.l, false);
                        this.x = true;
                    }
                }
            }
        }
    }
    
    public final void f() {
        final h g = this.g;
        if (g != null) {
            g.i(this);
            this.g.j(this.v);
            this.g = null;
        }
        while (true) {
            try {
                final IEmbedFragmentService h = this.h;
                if (h != null) {
                    h.l();
                }
                this.n = null;
                final b c = this.c;
                c.c = null;
                c.b = null;
                c.f.dispose();
                final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e g2 = c.g;
                c.e.f();
                this.i = null;
                this.h = null;
                this.j = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
                this.o = -1;
                this.k = (aehh)new aehg();
                System.gc();
            }
            catch (final RemoteException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final void g() {
        final IEmbedFragmentService h = this.h;
        if (h == null) {
            return;
        }
        try {
            h.g();
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void h() {
        final IEmbedFragmentService h = this.h;
        if (h == null) {
            return;
        }
        try {
            h.h();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void i(final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        final IEmbedFragmentService h = this.h;
        if (h == null) {
            return;
        }
        try {
            h.i(subscriptionNotificationMenuItem);
        }
        catch (final RemoteException ex) {}
    }
    
    @Override
    public final void j() {
        final IEmbedFragmentService h = this.h;
        if (h == null) {
            return;
        }
        try {
            h.j();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void k() {
        final IEmbedFragmentService h = this.h;
        if (h == null) {
            return;
        }
        try {
            h.k();
        }
        catch (final RemoteException ex) {}
    }
    
    public final void l(final int n, final int n2) {
        this.d.post((Runnable)new r(this, n, n2, 0));
    }
    
    public final void m(final SimplePlaybackDescriptor q) {
        if (this.o()) {
            return;
        }
        this.n();
        this.s = 1;
        this.a.clear();
        this.q = q;
        final String b = q.b;
        if (!this.o()) {
            if (b != null && !b.equals(this.v)) {
                this.g.j(this.v);
                this.v = b;
                this.g.n(b, this);
            }
        }
        this.r = null;
        this.x = false;
        this.e();
        try {
            final IEmbedFragmentService h = this.h;
            if (h != null) {
                h.u(q);
            }
        }
        catch (final RemoteException ex) {}
    }
    
    public final void n() {
        if (!this.o()) {
            this.g.p(this);
        }
    }
    
    public final boolean o() {
        return this.g == null;
    }
}
