// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.account.api.controller;

import java.util.Iterator;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class KeepStateCallbacksHandler implements aua
{
    public final aemg a;
    public aejr b;
    private final List c;
    private final aeqe d;
    
    public KeepStateCallbacksHandler(final aeqe d) {
        d.getClass();
        this.d = d;
        this.a = new aemg("KeepStateCallbacksHandler");
        this.c = new ArrayList();
        d.getLifecycle().b((aum)this);
        d.getSavedStateRegistry().c("tiktok_keep_state_callback_handler", (cgh)new cb(this, 15));
    }
    
    public final void g() {
        qdt.h();
        final aejr b = this.b;
        if (b == null) {
            return;
        }
        final int a = b.a;
        if (b.b == 1) {
            ((aejx)this.a.b(a)).a();
        }
        this.b = null;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
        final boolean d = this.d.getSavedStateRegistry().d;
        final aejr aejr = null;
        Bundle a;
        if (d) {
            a = this.d.getSavedStateRegistry().a("tiktok_keep_state_callback_handler");
        }
        else {
            a = null;
        }
        if (a != null) {
            this.a.d(a);
            aejr b;
            if (!a.containsKey("KSCH$AC$callbacks_id")) {
                if (a.containsKey("KSCH$AC$callbacks_state")) {
                    throw new IllegalStateException("Check failed.");
                }
                b = aejr;
            }
            else {
                if (!a.containsKey("KSCH$AC$callbacks_state")) {
                    throw new IllegalStateException("Check failed.");
                }
                b = new aejr(a.getInt("KSCH$AC$callbacks_id"), a.getInt("KSCH$AC$callbacks_state"));
            }
            this.b = b;
        }
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            this.a.c(iterator.next());
        }
        this.c.clear();
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
