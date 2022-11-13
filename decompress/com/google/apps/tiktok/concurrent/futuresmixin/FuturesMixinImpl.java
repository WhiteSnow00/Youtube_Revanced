// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.concurrent.futuresmixin;

import java.util.WeakHashMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public final class FuturesMixinImpl extends aemh implements aua
{
    private FuturesMixinViewModel a;
    private final atke b;
    private final avv c;
    private final aui d;
    private final aemj e;
    private boolean f;
    private boolean g;
    private final Set h;
    
    public FuturesMixinImpl(final atke b, final avv c, final aui d) {
        this.e = new aemj();
        this.f = false;
        this.g = false;
        this.h = new HashSet();
        this.b = b;
        this.c = c;
        d.b((aum)this);
        this.d = d;
    }
    
    private final void i() {
        final Iterator iterator = this.h.iterator();
        while (iterator.hasNext()) {
            this.a.b.c(iterator.next());
        }
        this.h.clear();
        this.g = true;
        qdt.k((Runnable)this.e);
        this.e.a.clear();
        this.f = true;
        final FuturesMixinViewModel a = this.a;
        a.e = true;
        final aemg b = a.b;
        qdt.h();
        for (final Map.Entry<K, Integer> entry : b.b.entrySet()) {
            adkp.T(((abo)b.a).containsKey((Object)entry.getValue()), "Did not restore a callback for %s. You must re-register all callbacks you previously had after a configuration change, so that you don't lose user state.", entry.getKey());
        }
        for (final ParcelableFuture parcelableFuture : a.c) {
            Label_0268: {
                if (!parcelableFuture.b) {
                    final aemi aemi = (aemi)a.b.b(parcelableFuture.a);
                    final aetf p = aeux.p("onPending FuturesMixin", aeti.a);
                    try {
                        final Object d = parcelableFuture.d;
                        p.close();
                        break Label_0268;
                    }
                    finally {
                        try {
                            p.close();
                        }
                        finally {
                            adkp.af((Throwable)a, (Throwable)parcelableFuture);
                        }
                    }
                }
                try {
                    a.b.b(parcelableFuture.a);
                    parcelableFuture.c(a);
                    continue;
                }
                catch (final NullPointerException ex) {
                    throw new IllegalStateException("future=".concat(String.valueOf(String.valueOf(parcelableFuture))), ex);
                }
            }
            break;
        }
    }
    
    @Override
    public final void g(final aemi aemi) {
        qdt.h();
        adkp.R(this.g ^ true, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        adkp.R(this.d.a().a(auh.d) ^ true, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        adkp.R(this.f ^ true, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        this.h.add(aemi);
    }
    
    @Override
    public final void h(final aeea aeea, final aeea aeea2, final aemi aemi) {
        qdt.h();
        adkp.R(((cl)this.b.a()).Z() ^ true, "Listen called outside safe window. State loss is possible.");
        final FuturesMixinViewModel a = this.a;
        final Object a2 = aeea.a;
        final Object a3 = aeea2.a;
        qdt.h();
        final WeakHashMap a4 = aeux.a;
        final ParcelableFuture parcelableFuture = new ParcelableFuture(a.b.a(aemi), a3, (ListenableFuture)a2);
        a.c.add(parcelableFuture);
        if (a.e) {
            parcelableFuture.c(a);
            ((ListenableFuture)a2).isDone();
        }
    }
    
    public final void lW(final aun aun) {
        if (!this.f) {
            this.i();
        }
    }
    
    public final void mM(final aun aun) {
        final FuturesMixinViewModel a = this.a;
        adkp.R(a.e ^ true, "FuturesMixinViewModel.stopCallbacks() must be called before it becomes detached from its parent.");
        final aemg b = a.b;
        qdt.h();
        ((abo)b.a).clear();
    }
    
    public final void mq(final aun aun) {
        this.a = (FuturesMixinViewModel)new aln(this.c).h((Class)FuturesMixinViewModel.class);
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        adkp.R(this.f ^ true, "FuturesMixin.onStart() was manually invoked, and is now re-running.");
        this.i();
    }
    
    public final void oX(final aun aun) {
        if (this.f) {
            final FuturesMixinViewModel a = this.a;
            a.e = false;
            final Iterator iterator = a.c.iterator();
            while (iterator.hasNext()) {
                ((ParcelableFuture)iterator.next()).c(null);
            }
            this.f = false;
        }
    }
}
