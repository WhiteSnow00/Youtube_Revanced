// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.manager;

import androidx.lifecycle.OnLifecycleEvent;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class LifecycleLifecycle implements dmg, aul
{
    private final Set a;
    private final auh b;
    
    public LifecycleLifecycle(final auh b) {
        this.a = new HashSet();
        (this.b = b).b((aul)this);
    }
    
    @Override
    public final void a(final dmh dmh) {
        this.a.add(dmh);
        if (this.b.a() == aug.a) {
            dmh.k();
            return;
        }
        if (this.b.a().a(aug.d)) {
            dmh.l();
            return;
        }
        dmh.m();
    }
    
    @Override
    public final void e(final dmh dmh) {
        this.a.remove(dmh);
    }
    
    @OnLifecycleEvent(a = auf.ON_DESTROY)
    public void onDestroy(final aum aum) {
        final Iterator iterator = dpg.i(this.a).iterator();
        while (iterator.hasNext()) {
            ((dmh)iterator.next()).k();
        }
        aum.getLifecycle().c((aul)this);
    }
    
    @OnLifecycleEvent(a = auf.ON_START)
    public void onStart(final aum aum) {
        final Iterator iterator = dpg.i(this.a).iterator();
        while (iterator.hasNext()) {
            ((dmh)iterator.next()).l();
        }
    }
    
    @OnLifecycleEvent(a = auf.ON_STOP)
    public void onStop(final aum aum) {
        final Iterator iterator = dpg.i(this.a).iterator();
        while (iterator.hasNext()) {
            ((dmh)iterator.next()).m();
        }
    }
}
