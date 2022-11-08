// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.dataservice.local;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

public final class LocalSubscriptionMixinResultPropagator extends aemd implements atz
{
    private final aemd a;
    private final aelv b;
    private final Executor c;
    private final Map d;
    
    public LocalSubscriptionMixinResultPropagator(final aemd a, final adcr adcr, final aelv b, final Executor c, final auh auh, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (Map)adcr.R(2131431182, (aeog)aemg.a, (aeof)aemh.a);
        auh.b((aul)this);
    }
    
    @Override
    public final ahbz h(final aelx aelx, final aexq aexq) {
        qcj.s();
        final ahbz h = this.a.h(aelx, aexq);
        final Map d = this.d;
        final Integer value = 2131427986;
        aemr aemr;
        if ((aemr = d.get(value)) == null) {
            aemr = new aemr(this.b, this.c);
            this.d.put(value, aemr);
            final xpb xpb = (xpb)((aexw)aexq).a;
            qcj.s();
            agot.D(aemr.e ^ true);
            final aemq c = aemr.c;
            if (c != null) {
                c.close();
                final aelv a = aemr.a;
                final aemq c2 = aemr.c;
                final xpb f = c2.f;
                a.b((Object)uhz.a, c2);
            }
            aemr.c = new aemq(aemr, xpb, aemr.b, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            final aelv a2 = aemr.a;
            final aemq c3 = aemr.c;
            final xpb f2 = c3.f;
            a2.a((Object)uhz.a, c3);
        }
        qcj.s();
        agot.D(aemr.e ^ true);
        aemr.f = h;
        final aemq c4 = aemr.c;
        if (c4 != null) {
            c4.a();
        }
        return new ahbz((byte[])null);
    }
    
    public final void mM(final aum aum) {
        qcj.s();
        for (final aemr aemr : this.d.values()) {
            qcj.s();
            agot.D(aemr.e ^ true);
            aemr.f = null;
        }
    }
    
    public final void oS(final aum aum) {
        qcj.s();
        for (final aemr aemr : this.d.values()) {
            qcj.s();
            aemr.d = true;
            final aemq c = aemr.c;
            if (c != null) {
                c.a();
            }
        }
    }
    
    public final void oW(final aum aum) {
        qcj.s();
        for (final aemr aemr : this.d.values()) {
            qcj.s();
            aemr.d = false;
        }
    }
}
