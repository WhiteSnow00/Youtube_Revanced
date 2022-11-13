// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.lifecycle;

import java.util.Iterator;
import android.os.Looper;
import java.util.Map;
import java.util.Set;

public final class LifecycleMemoizingObserver extends avp implements aua
{
    public aui a;
    private final Set b;
    private final Map c;
    private boolean d;
    
    public LifecycleMemoizingObserver() {
        this.b = (Set)new abj();
        this.c = (Map)new abh();
        this.d = false;
    }
    
    private final void h() {
        adkp.Q(Looper.getMainLooper().getThread() == Thread.currentThread());
        this.d = true;
        final Set keySet = this.c.keySet();
        final Set b = this.b;
        keySet.getClass();
        final afjb afjb = new afjb((Set)keySet, b);
        adkp.T(((Set)afjb).isEmpty(), "This lifecycle didn't call `memoize()` for the following IDs: %s Each memoized value must be retrieved exactly once each lifecycle, before the Lifecycle reaches STARTED. Is the calling code conditionally memoizing a value?", afjb);
    }
    
    public final void d() {
        for (final arzp arzp : this.c.values()) {
            ((aeqf)arzp.b).a(arzp.a);
        }
    }
    
    public final Object g(final int n, final aeqg aeqg, final aeqf aeqf) {
        final Thread thread = Looper.getMainLooper().getThread();
        final Thread currentThread = Thread.currentThread();
        final boolean b = true;
        adkp.Q(thread == currentThread);
        final auh b2 = ((auo)this.a).b;
        adkp.T(b2 == auh.b, "Values may only be memoized during the INITIALIZED part of the LifecycleOwner's lifecycle. Each lifecycle must call memoize() for each and only each value that the first LifecycleOwner instance called memoize() for, exactly once. The current lifecycle state is %s", b2);
        if (this.d) {
            final Set b3 = this.b;
            final Integer value = n;
            adkp.S(b3.add(value), "A value was previously memoized for idRes %s. Each lifecycle must call memoize() for each value that the first lifecycle instance called memoize() for, exactly once.", n);
            adkp.S(this.c.containsKey(value), "The first lifecycle didn't memoize a value for idRes %s. Is the LifecycleOwner memoizing a value inside a conditional?", n);
            return ((arzp)this.c.get(value)).a;
        }
        final Object a = aeqg.a();
        final Map c = this.c;
        final Integer value2 = n;
        adkp.S(c.put(value2, new arzp(a, aeqf)) == null && b, "Input id %s was previously used. Each ID must be used exactly once each lifecycle.", n);
        adkp.S(this.b.add(value2), "A value was previously memoized for idRes %s. Each lifecycle must call memoize() for each value that the first lifecycle instance called memoize() for, exactly once.", n);
        return a;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        this.h();
        this.b.clear();
        this.a.c((aum)this);
        this.a = null;
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        this.h();
    }
    
    public final void oX(final aun aun) {
    }
}
