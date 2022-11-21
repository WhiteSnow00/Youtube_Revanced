// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.prewarm.service;

import com.google.android.apps.youtube.embeddedplayer.service.innertube.m;
import j$.time.Duration;

public final class a
{
    public static final Duration a;
    public static final able b;
    public final m c;
    public final com.google.android.apps.youtube.embeddedplayer.service.innertube.a d;
    public final com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a e;
    public ahho f;
    public asln g;
    public final vbo h;
    public final vbs i;
    public final arzb j;
    public final acjq k;
    public final aefs l;
    
    static {
        a = Duration.ofSeconds(2L);
        final abld a2 = able.a();
        a2.c = 9;
        b = a2.a();
    }
    
    public a(final acjq k, final m c, final com.google.android.apps.youtube.embeddedplayer.service.innertube.a d, final aefs l, final com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a e, final arzb j, final vbo h, final vbs i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.g = asjv.b();
        this.k = k;
        this.c = c;
        this.d = d;
        this.l = l;
        this.e = e;
        this.j = j;
        this.h = h;
        this.i = i;
    }
}
