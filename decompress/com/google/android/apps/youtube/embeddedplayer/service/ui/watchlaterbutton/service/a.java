// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service;

import java.util.Iterator;
import java.util.List;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import android.net.Uri$Builder;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.c;

public final class a implements c
{
    public final vax a;
    private final zki b;
    private aibb c;
    private b d;
    private String e;
    private agyc f;
    private int g;
    private boolean h;
    private final aaca i;
    
    public a(final vax a, final zki b, final aaca i, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = aibb.a;
        this.d = com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b.S;
        this.f = agyc.b;
        this.a = a;
        this.b = b;
        this.i = i;
    }
    
    private final void d(final int n) {
        final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.a e = WatchLaterButtonData.e();
        e.b(n);
        e.c(this.f);
        if (n != 0 && n != 1) {
            final String e2 = this.e;
            e.a = e2;
            e.b = e2;
        }
        else {
            e.a = null;
            e.b = null;
        }
        this.d.F(e.a());
    }
    
    public final int a() {
        szc.f();
        return this.g;
    }
    
    public final void b(final aibb c, final b d) {
        szc.f();
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        final int b = this.c.b;
        if ((b & 0x200) != 0x0 && (b & 0x40) != 0x0 && (b & 0x4000) != 0x0) {
            ajsq ajsq;
            if ((ajsq = c.i) == null) {
                ajsq = ajsq.a;
            }
            this.e = abyh.b(ajsq).toString();
            this.f = c.w;
            if (c.h) {
                this.g = 1;
            }
            else {
                this.g = 2;
            }
            this.d(this.a());
            return;
        }
        this.g = 0;
        this.d(this.a());
    }
    
    public final void k() {
        szc.f();
        if (this.a() != 1) {
            if (this.a() != 0) {
                if (this.h) {
                    return;
                }
                if (!this.b.t()) {
                    aioe aioe;
                    if ((aioe = this.c.n) == null) {
                        aioe = aioe.a;
                    }
                    while (true) {
                        for (final anfw anfw : ((PlaylistEditEndpointOuterClass$PlaylistEditEndpoint)((agzd)aioe).rr((agyr)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint)).d) {
                            if ((anfw.b & 0x2) != 0x0) {
                                final Optional optional = Optional.of((Object)anfw.d);
                                Optional optional2;
                                if (optional.isEmpty()) {
                                    optional2 = Optional.empty();
                                }
                                else {
                                    final String string = new Uri$Builder().scheme("https").authority("www.youtube.com").appendPath("watch").appendQueryParameter("v", (String)optional.get()).toString();
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
                                    optional2 = Optional.of((Object)((agza)agzc).build());
                                }
                                if (optional2.isEmpty()) {
                                    return;
                                }
                                this.a.a((aioe)optional2.get());
                                return;
                            }
                        }
                        final Optional optional = Optional.empty();
                        continue;
                    }
                }
                aioe aioe2;
                if ((aioe2 = this.c.n) == null) {
                    aioe2 = aioe.a;
                }
                final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint)((agzd)aioe2).rr((agyr)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
                final vse k = this.i.k();
                ((vii)k).j(aioe2.c);
                k.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.c;
                k.w((List)playlistEditEndpointOuterClass$PlaylistEditEndpoint.d);
                k.c = playlistEditEndpointOuterClass$PlaylistEditEndpoint.g;
                this.h = true;
                this.i.l((vjn)k, (znj)new fcd(this, 15));
            }
        }
    }
}
