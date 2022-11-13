// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.dataservice.local;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

public final class LocalSubscriptionMixinResultPropagator extends aeod implements aua
{
    private final aeod a;
    private final aenv b;
    private final Executor c;
    private final Map d;
    
    public LocalSubscriptionMixinResultPropagator(final aeod a, final aeea aeea, final aenv b, final Executor c, final aui aui, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (Map)aeea.d(2131431185, (aeqg)aeog.a, (aeqf)aeoh.a);
        aui.b((aum)this);
    }
    
    public final aefb h(final aenx aenx, final aezp aezp) {
        qdt.h();
        final aefb h = this.a.h(aenx, aezp);
        final Map d = this.d;
        final Integer value = 2131427986;
        aeor aeor;
        if ((aeor = d.get(value)) == null) {
            aeor = new aeor(this.b, this.c);
            this.d.put(value, aeor);
            final xra xra = (xra)((aezv)aezp).a;
            qdt.h();
            adkp.Q(aeor.e ^ true);
            final aeoq c = aeor.c;
            if (c != null) {
                c.close();
                final aenv a = aeor.a;
                final aeoq c2 = aeor.c;
                final xra f = c2.f;
                a.b(uka.a, c2);
            }
            aeor.c = new aeoq(aeor, xra, aeor.b, null, null, null);
            final aenv a2 = aeor.a;
            final aeoq c3 = aeor.c;
            final xra f2 = c3.f;
            a2.a(uka.a, c3);
        }
        qdt.h();
        adkp.Q(aeor.e ^ true);
        aeor.f = h;
        final aeoq c4 = aeor.c;
        if (c4 != null) {
            c4.a();
        }
        return new aefb((byte[])null);
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        qdt.h();
        for (final aeor aeor : this.d.values()) {
            qdt.h();
            adkp.Q(aeor.e ^ true);
            aeor.f = null;
        }
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        qdt.h();
        for (final aeor aeor : this.d.values()) {
            qdt.h();
            aeor.d = true;
            final aeoq c = aeor.c;
            if (c != null) {
                c.a();
            }
        }
    }
    
    public final void oX(final aun aun) {
        qdt.h();
        for (final aeor aeor : this.d.values()) {
            qdt.h();
            aeor.d = false;
        }
    }
}
