// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.prewarm.service;

import com.google.android.apps.youtube.embeddedplayer.service.innertube.m;
import j$.time.Duration;

public final class a
{
    public static final Duration a;
    public static final abjx b;
    public final m c;
    public final com.google.android.apps.youtube.embeddedplayer.service.innertube.a d;
    public final com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a e;
    public ahfw f;
    public asir g;
    public final vaf h;
    public final vai i;
    public final arwh j;
    public final acid k;
    public final msr l;
    
    static {
        a = Duration.ofSeconds(2L);
        final abjw a2 = abjx.a();
        a2.c = 9;
        b = a2.a();
    }
    
    public a(final acid k, final m c, final com.google.android.apps.youtube.embeddedplayer.service.innertube.a d, final msr l, final com.google.android.apps.youtube.embeddedplayer.service.hostappverification.a e, final arwh j, final vaf h, final vai i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.g = asfn.c();
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
