// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.dataservice.local;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import com.google.android.youtube.api.jar.client.d;
import com.google.apps.tiktok.lifecycle.LifecycleMemoizingObserver;
import java.util.concurrent.Executor;

public final class LocalSubscriptionMixinImpl extends aemd implements atz
{
    public final auh a;
    public aemk b;
    private final afad c;
    private boolean d;
    private final Executor e;
    private final aekd f;
    private final aekd g;
    private final kji h;
    private final adcr i;
    
    public LocalSubscriptionMixinImpl(final auh a, final adcr i, final Executor e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = (afad)afcb.g();
        this.d = true;
        this.a = a;
        this.i = i;
        try {
            this.h = (kji)((LifecycleMemoizingObserver)i.a).g(2131429034, (aeog)aemg.b, (aeof)aemh.c);
            this.e = e;
            (this.f = aekd.c(e, true)).a();
            this.g = aekd.c(e, false);
            a.b((aul)this);
        }
        catch (final IllegalStateException ex) {
            throw new IllegalStateException("Both an unqualified and a `@ViewLifecycle LocalSubscriptionMixin` have been injectedin this Fragment scope. Only one of the two LocalSubscriptionMixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle`LocalSubscriptionMixin exclusively.", ex);
        }
    }
    
    @Override
    public final ahbz h(final aelx aelx, final aexq aexq) {
        qcj.s();
        final aemk b = this.b;
        final boolean b2 = true;
        agot.D(b == null);
        agot.D(this.c.put((Object)aelx, (Object)this.i.R(2131427986, (aeog)new aelz(aexq), (aeof)aemh.b)) == null && b2);
        return new aema(this, aelx);
    }
    
    public final void mM(final aum aum) {
        qcj.s();
        final aemk b = this.b;
        if (b != null) {
            qcj.s();
            b.c.execute(aesm.h((Runnable)new d(b, 14)));
        }
        this.h.a = false;
    }
    
    public final void oS(final aum aum) {
        qcj.s();
        if (this.d) {
            agot.D(this.b == null);
            final Set<Map.Entry<Object, Object>> entrySet = ((Map<Object, Object>)this.c).entrySet();
            int size;
            if (entrySet instanceof Collection) {
                size = entrySet.size();
            }
            else {
                size = 4;
            }
            final afcd afcd = new afcd(size);
            afcd.e((Iterable)entrySet);
            this.b = new aemk(afcd.a(), this.e, (Executor)this.f, this.g);
            if (this.h.a && this.d) {
                final aemk b = this.b;
                qcj.s();
                b.c.execute(aesm.h((Runnable)new d(b, 10)));
            }
            else {
                final aemk b2 = this.b;
                qcj.s();
                b2.c.execute(aesm.h((Runnable)new d(b2, 12)));
            }
            this.c.clear();
            this.d = false;
        }
        final aemk b3 = this.b;
        qcj.s();
        b3.d.a();
    }
    
    public final void oW(final aum aum) {
        qcj.s();
        final aemk b = this.b;
        qcj.s();
        b.d.b();
    }
}
