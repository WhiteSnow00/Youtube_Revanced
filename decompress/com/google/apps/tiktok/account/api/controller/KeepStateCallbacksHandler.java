// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.account.api.controller;

import java.util.Iterator;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class KeepStateCallbacksHandler implements atz
{
    public final aekf a;
    public aehq b;
    private final List c;
    private final aeoe d;
    
    public KeepStateCallbacksHandler(final aeoe d) {
        d.getClass();
        this.d = d;
        this.a = new aekf("KeepStateCallbacksHandler");
        this.c = new ArrayList();
        d.getLifecycle().b((aul)this);
        d.getSavedStateRegistry().c("tiktok_keep_state_callback_handler", (cgg)new cb(this, 15));
    }
    
    public final void g() {
        qcj.s();
        final aehq b = this.b;
        if (b == null) {
            return;
        }
        final int a = b.a;
        if (b.b == 1) {
            ((aehw)this.a.b(a)).a();
        }
        this.b = null;
    }
    
    public final void mq(final aum aum) {
        final boolean d = this.d.getSavedStateRegistry().d;
        final aehq aehq = null;
        Bundle a;
        if (d) {
            a = this.d.getSavedStateRegistry().a("tiktok_keep_state_callback_handler");
        }
        else {
            a = null;
        }
        if (a != null) {
            this.a.d(a);
            aehq b;
            if (!a.containsKey("KSCH$AC$callbacks_id")) {
                if (a.containsKey("KSCH$AC$callbacks_state")) {
                    throw new IllegalStateException("Check failed.");
                }
                b = aehq;
            }
            else {
                if (!a.containsKey("KSCH$AC$callbacks_state")) {
                    throw new IllegalStateException("Check failed.");
                }
                b = new aehq(a.getInt("KSCH$AC$callbacks_id"), a.getInt("KSCH$AC$callbacks_state"));
            }
            this.b = b;
        }
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            this.a.c((Object)iterator.next());
        }
        this.c.clear();
    }
}
