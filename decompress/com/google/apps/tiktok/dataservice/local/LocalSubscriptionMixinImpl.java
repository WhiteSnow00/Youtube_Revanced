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

public final class LocalSubscriptionMixinImpl extends aeod implements aua
{
    public final aui a;
    public aeok b;
    private final afcc c;
    private boolean d;
    private final Executor e;
    private final aeme f;
    private final aeme g;
    private final kkj h;
    private final aeea i;
    
    public LocalSubscriptionMixinImpl(final aui a, final aeea i, final Executor e, final byte[] array, final byte[] array2) {
        this.c = (afcc)afea.g();
        this.d = true;
        this.a = a;
        this.i = i;
        try {
            this.h = (kkj)((LifecycleMemoizingObserver)i.a).g(2131429034, (aeqg)aeog.b, (aeqf)aeoh.c);
            this.e = e;
            (this.f = aeme.c(e, true)).a();
            this.g = aeme.c(e, false);
            a.b((aum)this);
        }
        catch (final IllegalStateException ex) {
            throw new IllegalStateException("Both an unqualified and a `@ViewLifecycle LocalSubscriptionMixin` have been injectedin this Fragment scope. Only one of the two LocalSubscriptionMixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle`LocalSubscriptionMixin exclusively.", ex);
        }
    }
    
    public final aefb h(final aenx aenx, final aezp aezp) {
        qdt.h();
        final aeok b = this.b;
        final boolean b2 = true;
        adkp.Q(b == null);
        adkp.Q(this.c.put(aenx, this.i.d(2131427986, (aeqg)new aenz(aezp), (aeqf)aeoh.b)) == null && b2);
        return (aefb)new aeoa(this, aenx);
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        qdt.h();
        final aeok b = this.b;
        if (b != null) {
            qdt.h();
            b.c.execute(aeun.h((Runnable)new d(b, 15)));
        }
        this.h.a = false;
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        qdt.h();
        if (this.d) {
            adkp.Q(this.b == null);
            final Set<Map.Entry<Object, Object>> entrySet = this.c.entrySet();
            int size;
            if (entrySet instanceof Collection) {
                size = entrySet.size();
            }
            else {
                size = 4;
            }
            final afec afec = new afec(size);
            afec.e((Iterable)entrySet);
            this.b = new aeok(afec.a(), this.e, this.f, this.g);
            if (this.h.a && this.d) {
                final aeok b = this.b;
                qdt.h();
                b.c.execute(aeun.h((Runnable)new d(b, 11)));
            }
            else {
                final aeok b2 = this.b;
                qdt.h();
                b2.c.execute(aeun.h((Runnable)new d(b2, 13)));
            }
            this.c.clear();
            this.d = false;
        }
        final aeok b3 = this.b;
        qdt.h();
        b3.d.a();
    }
    
    public final void oX(final aun aun) {
        qdt.h();
        final aeok b = this.b;
        qdt.h();
        b.d.b();
    }
}
