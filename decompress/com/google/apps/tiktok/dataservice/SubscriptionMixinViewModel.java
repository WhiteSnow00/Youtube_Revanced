// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.dataservice;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.Map;

public final class SubscriptionMixinViewModel extends avo
{
    private final Map a;
    private final aekd b;
    
    public SubscriptionMixinViewModel(final Executor executor) {
        this.a = new HashMap();
        new aekf("SubscriptionMixinVM");
        (this.b = aekd.c(executor, true)).b();
    }
    
    public final void d() {
        final Iterator iterator = this.a.values().iterator();
        if (!iterator.hasNext()) {
            final aekd b = this.b;
            synchronized (b.a) {
                agot.E(b.b, (Object)"Executor may only be drained when it is suspended.");
                final ArrayDeque arrayDeque = new ArrayDeque(b.a);
                b.a.clear();
                monitorexit(b.a);
                arrayDeque.clear();
                return;
            }
        }
        final agot agot = (agot)iterator.next();
        throw null;
    }
}
