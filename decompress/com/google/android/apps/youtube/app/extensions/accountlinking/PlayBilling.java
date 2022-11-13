// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.accountlinking;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;

public class PlayBilling implements dai, dac, aua
{
    public final bu a;
    public final Executor b;
    public Optional c;
    public Optional d;
    public Optional e;
    public Optional f;
    private final arkg g;
    private final Executor h;
    private asir i;
    
    public PlayBilling(final bu a, final arkg g, final Executor b, final Executor h) {
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.i = (asir)asjw.a;
        this.a = a;
        this.g = g;
        this.b = b;
        this.h = h;
    }
    
    public static String i(int n, final int n2) {
        String s;
        if (--n != 1) {
            if (n != 2) {
                s = "PURCHASE";
            }
            else {
                s = "QUERY_SKU_DETAILS";
            }
        }
        else {
            s = "CONNECT";
        }
        String s2 = null;
        switch (n2) {
            default: {
                return "UNKNOWN_ERROR";
            }
            case 8: {
                s2 = "ITEM_NOT_OWNED";
                break;
            }
            case 7: {
                s2 = "ITEM_ALREADY_OWNED";
                break;
            }
            case 6: {
                s2 = "ERROR";
                break;
            }
            case 5: {
                s2 = "DEVELOPER_ERROR";
                break;
            }
            case 4: {
                s2 = "ITEM_UNAVAILABLE";
                break;
            }
            case 3: {
                s2 = "BILLING_UNAVAILABLE";
                break;
            }
            case 2: {
                s2 = "SERVICE_UNAVAILABLE";
                break;
            }
            case 1: {
                s2 = "USER_CANCELED";
                break;
            }
            case 0: {
                s2 = "OK";
                break;
            }
            case -1: {
                s2 = "SERVICE_DISCONNECTED";
                break;
            }
            case -2: {
                s2 = "FEATURE_NOT_SUPPORTED";
                break;
            }
            case -3: {
                s2 = "SERVICE_TIMEOUT";
                break;
            }
        }
        return String.format("%s_%s", s, s2);
    }
    
    @Override
    public final void a() {
        ttr.l("Billing service disconnected");
    }
    
    @Override
    public final void b(final daf daf) {
        if (this.e.isPresent()) {
            ((acc)this.e.get()).c((Object)daf);
            this.e = Optional.empty();
        }
    }
    
    @Override
    public final void d(final daf daf) {
        if (this.d.isPresent()) {
            ((acc)this.d.get()).c((Object)daf);
            this.d = Optional.empty();
        }
    }
    
    public final ListenableFuture g() {
        if (!this.c.isPresent()) {
            final czy a = czz.a((Context)this.a);
            a.b = this;
            a.b();
            this.c = Optional.of((Object)a.a());
            this.h.execute(aeun.h((Runnable)new ght(this, 19)));
            this.i = ((jet)this.g.a()).G().an((asjm)new gmf(this, 14), (asjm)gpg.g);
        }
        else if (((czz)this.c.get()).a == 2) {
            return afwm.m((Object)cjf.c(0, ""));
        }
        return sl.c((ace)new xp(this, 4));
    }
    
    public final void h() {
        if (this.c.isPresent()) {
            ((czz)this.c.get()).g();
            this.c = Optional.empty();
        }
        if (this.d.isPresent()) {
            ((acc)this.d.get()).b();
            this.d = Optional.empty();
        }
        if (this.f.isPresent()) {
            ((acc)this.f.get()).b();
            this.f = Optional.empty();
        }
        if (!this.i.tA()) {
            this.i.dispose();
        }
        ((dh)this.a).getLifecycle().c((aum)this);
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        this.h();
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
