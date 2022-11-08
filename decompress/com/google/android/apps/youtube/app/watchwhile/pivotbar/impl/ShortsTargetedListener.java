// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watchwhile.pivotbar.impl;

import j$.time.Instant;
import j$.time.temporal.TemporalAmount;
import j$.time.Duration;

public class ShortsTargetedListener implements tfh
{
    public final atjj a;
    public final atix b;
    private final afqr c;
    private final zki d;
    private final hyj e;
    private final vbq f;
    private final asib g;
    private final uyi h;
    
    public ShortsTargetedListener(final uyi h, final afqr c, final zki d, final atjj a, final hyj e, final vbq f) {
        this.h = h;
        this.c = c;
        this.d = d;
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = new asib();
        this.b = atix.e();
    }
    
    public final lkw j(lkw lkw, final vdm vdm) {
        final String d = lkw.d;
        final aodf aodf = (aodf)vdm;
        if (!d.equals(aodf.e())) {
            return lkw;
        }
        final Instant a = this.c.a();
        ahca ahca;
        if ((ahca = lkw.i) == null) {
            ahca = ahca.a;
        }
        if (a.isBefore(aeda.an(ahca))) {
            return lkw;
        }
        final agza builder = ((agzi)lkw).toBuilder();
        ahca ahca2;
        if ((ahca2 = lkw.e) == null) {
            ahca2 = ahca.a;
        }
        final Instant an = aeda.an(ahca2);
        final ahca al = aeda.al(a.plus((TemporalAmount)Duration.ofMinutes((long)aodf.getStartToShortsDurationMinutes())));
        builder.copyOnWrite();
        final lkw lkw2 = (lkw)builder.instance;
        al.getClass();
        lkw2.e = al;
        lkw2.b |= 0x4;
        if (!a.isBefore(an)) {
            builder.copyOnWrite();
            lkw = (lkw)builder.instance;
            lkw.b |= 0x8;
            lkw.f = 0;
            builder.copyOnWrite();
            lkw = (lkw)builder.instance;
            lkw.i = null;
            lkw.b &= 0xFFFFFFBF;
        }
        if ((aodf.b.b & 0x4) != 0x0) {
            final aoij startToShortsPauseConfig = aodf.getStartToShortsPauseConfig();
            final int b = startToShortsPauseConfig.b;
            builder.copyOnWrite();
            lkw = (lkw)builder.instance;
            lkw.b |= 0x10;
            lkw.g = b;
            final int c = startToShortsPauseConfig.c;
            builder.copyOnWrite();
            lkw = (lkw)builder.instance;
            lkw.b |= 0x20;
            lkw.h = c;
        }
        else {
            builder.copyOnWrite();
            lkw = (lkw)builder.instance;
            lkw.i = null;
            lkw.b &= 0xFFFFFFBF;
        }
        return (lkw)builder.build();
    }
    
    public final vdo k() {
        return (vdo)this.f.a(this.d.c());
    }
    
    public final void oS(final aum aum) {
        if (this.h.bW()) {
            this.g.f(new asic[] { this.e.a().W((asjc)lkr.g).ag(1L).M((asjc)new let(this, 15)).aB((asix)lei.m), this.k().g((Class)aodf.class).aB((asix)new lkg(this, 11)) });
        }
    }
    
    public final void oW(final aum aum) {
        this.g.b();
        this.b.tr((Object)0);
    }
}
