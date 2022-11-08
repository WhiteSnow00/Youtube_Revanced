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

public final class FuturesMixinImpl extends aekg implements atz
{
    private FuturesMixinViewModel a;
    private final atjj b;
    private final avu c;
    private final auh d;
    private final aeki e;
    private boolean f;
    private boolean g;
    private final Set h;
    
    public FuturesMixinImpl(final atjj b, final avu c, final auh d) {
        this.e = new aeki();
        this.f = false;
        this.g = false;
        this.h = new HashSet();
        this.b = b;
        this.c = c;
        d.b((aul)this);
        this.d = d;
    }
    
    private final void i() {
        final Iterator iterator = this.h.iterator();
        while (iterator.hasNext()) {
            this.a.b.c((Object)iterator.next());
        }
        this.h.clear();
        this.g = true;
        qcj.v((Runnable)this.e);
        this.e.a.clear();
        this.f = true;
        final FuturesMixinViewModel a = this.a;
        a.e = true;
        final aekf b = a.b;
        qcj.s();
        for (final Map.Entry<K, Integer> entry : b.b.entrySet()) {
            agot.G(b.a.containsKey((Object)entry.getValue()), "Did not restore a callback for %s. You must re-register all callbacks you previously had after a configuration change, so that you don't lose user state.", (Object)entry.getKey());
        }
        for (final ParcelableFuture parcelableFuture : a.c) {
            Label_0268: {
                if (!parcelableFuture.b) {
                    final aekh aekh = (aekh)a.b.b(parcelableFuture.a);
                    final aere p = aesw.p("onPending FuturesMixin", aerh.a);
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
                            agot.R((Throwable)a, (Throwable)parcelableFuture);
                        }
                    }
                }
                try {
                    a.b.b(parcelableFuture.a);
                    parcelableFuture.c((aekk)a);
                    continue;
                }
                catch (final NullPointerException ex) {
                    throw new IllegalStateException("future=".concat(String.valueOf(String.valueOf(parcelableFuture))), ex);
                }
            }
            break;
        }
    }
    
    public final void g(final aekh aekh) {
        qcj.s();
        agot.E(this.g ^ true, (Object)"FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        agot.E(this.d.a().a(aug.d) ^ true, (Object)"FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        agot.E(this.f ^ true, (Object)"FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        this.h.add(aekh);
    }
    
    public final void h(final adcr adcr, final aeby aeby, final aekh aekh) {
        qcj.s();
        agot.E(((cl)this.b.a()).Z() ^ true, (Object)"Listen called outside safe window. State loss is possible.");
        final FuturesMixinViewModel a = this.a;
        final Object a2 = adcr.a;
        final Object a3 = aeby.a;
        qcj.s();
        final WeakHashMap a4 = aesw.a;
        final ParcelableFuture parcelableFuture = new ParcelableFuture(a.b.a((Object)aekh), a3, (ListenableFuture)a2);
        a.c.add(parcelableFuture);
        if (a.e) {
            parcelableFuture.c((aekk)a);
            ((ListenableFuture)a2).isDone();
        }
    }
    
    public final void lW(final aum aum) {
        if (!this.f) {
            this.i();
        }
    }
    
    public final void mM(final aum aum) {
        final FuturesMixinViewModel a = this.a;
        agot.E(a.e ^ true, (Object)"FuturesMixinViewModel.stopCallbacks() must be called before it becomes detached from its parent.");
        final aekf b = a.b;
        qcj.s();
        b.a.clear();
    }
    
    public final void mq(final aum aum) {
        this.a = (FuturesMixinViewModel)new alm(this.c).h((Class)FuturesMixinViewModel.class);
    }
    
    public final void oS(final aum aum) {
        agot.E(this.f ^ true, (Object)"FuturesMixin.onStart() was manually invoked, and is now re-running.");
        this.i();
    }
    
    public final void oW(final aum aum) {
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
