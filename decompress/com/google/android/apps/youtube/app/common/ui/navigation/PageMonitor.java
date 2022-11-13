// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.navigation;

import java.util.concurrent.atomic.AtomicReference;

public class PageMonitor implements aua
{
    public final vyb a;
    public final vai b;
    private final asht c;
    private asir d;
    
    public PageMonitor(final vai b, final ghb ghb, final lag lag, final msr msr, final vyb a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
        this.c = asht.p((ashw)msr.M(), (ashw)lag.a.ai().Z((asjr)gcz.j), (ashw)ghb.i().Z((asjr)gcz.k).Z((asjr)gcz.l), (asjn)exk.f);
    }
    
    public static void g(final vyb vyb, final aoru aoru) {
        final aidz a = aieb.a();
        final aied a2 = aiee.a();
        ((ahaz)a2).copyOnWrite();
        aiee.e((aiee)a2.instance, aoru);
        ((ahaz)a).copyOnWrite();
        aieb.f((aieb)a.instance, (aiee)((ahaz)a2).build());
        vyb.a((aieb)((ahaz)a).build());
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        final asir d = this.d;
        if (d != null) {
            asjv.b((AtomicReference)d);
        }
    }
    
    public final void mq(final aun aun) {
        if (!this.b.bt()) {
            return;
        }
        this.d = this.c.aQ().K((asjs)fma.e).aI((asjm)new gao(this, 13), (asjm)fua.m);
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
