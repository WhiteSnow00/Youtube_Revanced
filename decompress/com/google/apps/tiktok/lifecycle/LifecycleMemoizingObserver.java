// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.lifecycle;

import java.util.Iterator;
import android.os.Looper;
import java.util.Map;
import java.util.Set;

public final class LifecycleMemoizingObserver extends avo implements atz
{
    public auh a;
    private final Set b;
    private final Map c;
    private boolean d;
    
    public LifecycleMemoizingObserver() {
        this.b = (Set)new abi();
        this.c = new abg();
        this.d = false;
    }
    
    private final void h() {
        agot.D(Looper.getMainLooper().getThread() == Thread.currentThread());
        this.d = true;
        final Set keySet = this.c.keySet();
        final Set b = this.b;
        keySet.getClass();
        final afhb afhb = new afhb((Set)keySet, b);
        agot.G(((Set)afhb).isEmpty(), "This lifecycle didn't call `memoize()` for the following IDs: %s Each memoized value must be retrieved exactly once each lifecycle, before the Lifecycle reaches STARTED. Is the calling code conditionally memoizing a value?", (Object)afhb);
    }
    
    public final void d() {
        for (final aseo aseo : this.c.values()) {
            ((aeof)aseo.a).a(aseo.b);
        }
    }
    
    public final Object g(final int n, final aeog aeog, final aeof aeof) {
        final Thread thread = Looper.getMainLooper().getThread();
        final Thread currentThread = Thread.currentThread();
        final boolean b = true;
        agot.D(thread == currentThread);
        final aug b2 = ((aun)this.a).b;
        agot.G(b2 == aug.b, "Values may only be memoized during the INITIALIZED part of the LifecycleOwner's lifecycle. Each lifecycle must call memoize() for each and only each value that the first LifecycleOwner instance called memoize() for, exactly once. The current lifecycle state is %s", (Object)b2);
        if (this.d) {
            final Set b3 = this.b;
            final Integer value = n;
            agot.F(b3.add(value), "A value was previously memoized for idRes %s. Each lifecycle must call memoize() for each value that the first lifecycle instance called memoize() for, exactly once.", n);
            agot.F(this.c.containsKey(value), "The first lifecycle didn't memoize a value for idRes %s. Is the LifecycleOwner memoizing a value inside a conditional?", n);
            return ((aseo)this.c.get(value)).b;
        }
        final Object a = aeog.a();
        final Map c = this.c;
        final Integer value2 = n;
        agot.F(c.put(value2, new aseo(a, aeof)) == null && b, "Input id %s was previously used. Each ID must be used exactly once each lifecycle.", n);
        agot.F(this.b.add(value2), "A value was previously memoized for idRes %s. Each lifecycle must call memoize() for each value that the first lifecycle instance called memoize() for, exactly once.", n);
        return a;
    }
    
    public final void mM(final aum aum) {
        this.h();
        this.b.clear();
        this.a.c((aul)this);
        this.a = null;
    }
    
    public final void oS(final aum aum) {
        this.h();
    }
}
