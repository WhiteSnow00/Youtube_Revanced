// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service;

import java.util.List;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import android.net.Uri$Builder;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c;

public final class a implements c
{
    public final vax a;
    public aokb b;
    public int c;
    private final thh d;
    private final zki e;
    private e f;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.a g;
    private String h;
    private String i;
    private agyc j;
    private boolean k;
    private final aaca l;
    
    public a(final vax a, final thh d, final zki e, final aaca l, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = aokb.a;
        this.f = com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.e.S;
        this.j = agyc.b;
        this.a = a;
        this.d = d;
        this.e = e;
        this.l = l;
    }
    
    public final int a() {
        szc.f();
        return this.c;
    }
    
    public final void b(final aokb b, final e f, final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.a g, final b c) {
        szc.f();
        b.getClass();
        this.b = b;
        f.getClass();
        this.f = f;
        this.g = g;
        final int b2 = this.b.b;
        if ((b2 & 0x4) != 0x0 && (b2 & 0x8) != 0x0 && (b2 & 0x1000) != 0x0 && (b2 & 0x400) != 0x0) {
            ajsq ajsq;
            if ((ajsq = b.h) == null) {
                ajsq = ajsq.a;
            }
            this.h = abyh.b(ajsq).toString();
            ajsq ajsq2;
            if ((ajsq2 = b.g) == null) {
                ajsq2 = ajsq.a;
            }
            this.i = abyh.b(ajsq2).toString();
            this.j = b.D;
            if (!b.n) {
                this.c = 1;
            }
            else {
                int c2;
                if (!b.l) {
                    c2 = 2;
                }
                else {
                    c2 = 3;
                }
                this.c = c2;
            }
            this.c(this.a());
            if (g != null && c != null) {
                aojz aojz;
                if ((aojz = b.p) == null) {
                    aojz = aojz.a;
                }
                aokt a;
                if (aojz.b == 136076983) {
                    a = (aokt)aojz.c;
                }
                else {
                    a = aokt.a;
                }
                szc.f();
                g.c = c;
                g.d(a);
            }
            return;
        }
        this.c = 0;
        this.c(this.a());
    }
    
    public final void c(final int n) {
        final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.a e = SubscribeButtonData.e();
        e.e(n);
        e.f(this.j);
        Label_0069: {
            String h;
            if (n != 0 && n != 1) {
                if (n != 2) {
                    final String i = this.i;
                    e.a = i;
                    e.b = i;
                    break Label_0069;
                }
                h = this.h;
            }
            else {
                h = null;
            }
            e.a = h;
            e.b = h;
        }
        this.f.rc(e.d());
    }
    
    public final void d(final aokt aokt) {
        final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.a g = this.g;
        if (g != null) {
            g.d(aokt);
        }
    }
    
    public final void h() {
        szc.f();
        if (this.a() != 1) {
            if (this.a() != 0) {
                if (this.k) {
                    return;
                }
                if (!this.e.t()) {
                    final vax a = this.a;
                    final String string = new Uri$Builder().scheme("https").authority("www.youtube.com").appendPath("channel").appendPath(this.b.f).toString();
                    final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
                    final agzg androidIntentActionEndpoint = AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint;
                    final agza builder = ahqm.a.createBuilder();
                    builder.copyOnWrite();
                    ahqm.b((ahqm)builder.instance);
                    builder.copyOnWrite();
                    final ahqm ahqm = (ahqm)builder.instance;
                    string.getClass();
                    ahqm.b |= 0x4;
                    ahqm.e = string;
                    builder.copyOnWrite();
                    ahqm.a((ahqm)builder.instance);
                    agzc.e((agyr)androidIntentActionEndpoint, (Object)builder.build());
                    a.a((aioe)((agza)agzc).build());
                    return;
                }
                if (this.a() == 2) {
                    aioe a2 = aioe.a;
                    SubscribeEndpointOuterClass$SubscribeEndpoint a3 = SubscribeEndpointOuterClass$SubscribeEndpoint.a;
                    for (final aioe aioe : this.b.x) {
                        if (((agzd)aioe).rs((agyr)SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint)) {
                            a3 = (SubscribeEndpointOuterClass$SubscribeEndpoint)((agzd)aioe).rr((agyr)SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint);
                            a2 = aioe;
                        }
                    }
                    final vub f = this.l.f();
                    ((vii)f).j(a2.c);
                    final Iterator<Object> iterator2 = ((List<Object>)a3.b).iterator();
                    while (iterator2.hasNext()) {
                        f.w((String)iterator2.next());
                    }
                    f.b = a3.d;
                    this.k = true;
                    if (this.d.p()) {
                        this.c(3);
                    }
                    this.l.i(f, (znj)new fcd(this, 12));
                    return;
                }
                if (this.a() == 3) {
                    aioe a4 = aioe.a;
                    UnsubscribeEndpointOuterClass$UnsubscribeEndpoint a5 = UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.a;
                    for (final aioe aioe2 : this.b.x) {
                        if (((agzd)aioe2).rs((agyr)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)) {
                            a5 = (UnsubscribeEndpointOuterClass$UnsubscribeEndpoint)((agzd)aioe2).rr((agyr)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint);
                            a4 = aioe2;
                        }
                    }
                    final vud g = this.l.g();
                    ((vii)g).j(a4.c);
                    final Iterator<Object> iterator4 = ((List<Object>)a5.c).iterator();
                    while (iterator4.hasNext()) {
                        g.w((String)iterator4.next());
                    }
                    g.b = a5.e;
                    this.k = true;
                    if (this.d.p()) {
                        final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.a g2 = this.g;
                        if (g2 != null) {
                            g2.c();
                        }
                        this.c(2);
                    }
                    this.l.j(g, (znj)new fcd(this, 13));
                }
            }
        }
    }
}
