// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.HashSet;
import j$.util.Optional;
import java.util.Set;

public final class d
{
    private static final xbg[] j;
    final c a;
    final c b;
    final c c;
    final int d;
    final String e;
    public final Set f;
    public Optional g;
    public Optional h;
    public c i;
    private final Set k;
    
    static {
        j = new xbg[] { xbf.c(28240), xbf.c(28239), xbf.c(28244), xbf.c(28664), xbf.c(16499), xbf.c(70346), xbf.c(70347), xbf.c(23851), xbf.c(28666) };
    }
    
    public d(final atnb atnb, final int d, final String e) {
        this.f = new HashSet();
        this.k = new HashSet();
        this.g = Optional.empty();
        this.h = Optional.empty();
        final wzs wzs = (wzs)atnb;
        this.a = new c(this, (xab)wzs.b());
        this.b = new c(this, (xab)wzs.b());
        this.c = new c(this, (xab)wzs.b());
        this.d = d;
        this.e = e;
    }
    
    public static final boolean k(final Optional optional) {
        return optional.isEmpty() || TextUtils.isEmpty((CharSequence)optional.get());
    }
    
    final alji a(String e) {
        final ahcr builder = ((ahcz)alji.a).createBuilder();
        final ahcr builder2 = ((ahcz)aljp.a).createBuilder();
        if (e != null) {
            builder2.copyOnWrite();
            final aljp aljp = (aljp)builder2.instance;
            aljp.b |= 0x1;
            aljp.c = e;
        }
        e = this.e;
        builder2.copyOnWrite();
        final aljp aljp2 = (aljp)builder2.instance;
        e.getClass();
        aljp2.b |= 0x2;
        aljp2.d = e;
        builder.copyOnWrite();
        final alji alji = (alji)builder.instance;
        final aljp k = (aljp)builder2.build();
        k.getClass();
        alji.k = k;
        alji.b |= 0x40;
        return (alji)builder.build();
    }
    
    public final void b() {
        this.f.clear();
    }
    
    public final void c() {
        final Iterator iterator = this.k.iterator();
        while (iterator.hasNext()) {
            this.c.a((b)iterator.next(), (String)this.h.orElse((Object)null));
        }
        this.k.clear();
    }
    
    public final void d(final PlayerResponseModel playerResponseModel, final Optional optional) {
        if (playerResponseModel == null) {
            znh.b(zng.b, znf.d, "handlePlayerResponse called on empty player response");
            return;
        }
        this.g(optional, playerResponseModel.K());
        final b b = new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.a, playerResponseModel.Y());
        if (!this.j(b)) {
            this.i(b);
            final xbg[] j = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.d.j;
            final int length = j.length;
            for (int i = 0; i < 9; ++i) {
                final b b2 = new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.a, j[i]);
                if (!this.j(b2)) {
                    this.i(b2);
                }
            }
        }
    }
    
    public final void e(final b b) {
        final c b2 = this.b;
        if (!b2.a) {
            znh.b(zng.b, znf.d, "logChildRequestForPreview called without logNewEmbedPreviewPage");
            return;
        }
        b2.a(b, null);
    }
    
    public final void f(final Optional g) {
        this.c();
        this.b();
        final c c = this.c;
        c c2;
        if (c.a) {
            c2 = c;
        }
        else if (!(c2 = this.b).a) {
            c2 = this.a;
        }
        this.i = c;
        c2.d(g);
        this.c.b(xbf.b(27240), g, this.a(null));
        this.g = g;
        this.h = Optional.empty();
    }
    
    public final void g(final Optional optional, final String s) {
        if (!this.g.isEmpty()) {
            boolean b;
            if (optional.isEmpty()) {
                b = aexq.c(((apuw)((ahcu)this.g.get()).rx((ahci)WatchEndpointOuterClass.watchEndpoint)).d, s);
            }
            else {
                b = ((apuw)((ahcu)this.g.get()).rx((ahci)WatchEndpointOuterClass.watchEndpoint)).equals(((ahcu)optional.get()).rx((ahci)WatchEndpointOuterClass.watchEndpoint));
            }
            if (!(b ^ true)) {
                return;
            }
        }
        Optional ofNullable = optional;
        if (optional.isEmpty()) {
            ofNullable = Optional.ofNullable((Object)lma.i(s, 0L));
        }
        this.f(ofNullable);
    }
    
    public final void h(final xbg xbg) {
        final b b = new b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.c, xbg);
        if (!this.j(b)) {
            this.e(b);
        }
    }
    
    public final void i(final b b) {
        if (!this.c.a) {
            znh.c(zng.b, znf.d, "queueOrLogChildRequestForPlayback called before EmbedWatchPage is logged.", new Throwable());
            return;
        }
        this.f.add(b);
        if (k(this.h)) {
            this.k.add(b);
            return;
        }
        this.c.a(b, (String)this.h.get());
    }
    
    public final boolean j(final b b) {
        return this.f.contains(b);
    }
}
