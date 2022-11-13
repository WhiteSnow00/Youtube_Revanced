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

public final class SubscriptionMixinViewModel extends avp
{
    private final Map a;
    private final aeme b;
    
    public SubscriptionMixinViewModel(final Executor executor) {
        this.a = new HashMap();
        new aemg("SubscriptionMixinVM");
        (this.b = aeme.c(executor, true)).b();
    }
    
    public final void d() {
        final Iterator iterator = this.a.values().iterator();
        if (!iterator.hasNext()) {
            final aeme b = this.b;
            synchronized (b.a) {
                adkp.R(b.b, "Executor may only be drained when it is suspended.");
                final ArrayDeque arrayDeque = new ArrayDeque(b.a);
                b.a.clear();
                monitorexit(b.a);
                arrayDeque.clear();
                return;
            }
        }
        final adyf adyf = (adyf)iterator.next();
        throw null;
    }
}
