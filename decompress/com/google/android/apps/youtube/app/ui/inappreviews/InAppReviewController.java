// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.inappreviews;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.app.Activity;

public final class InAppReviewController implements tff, kzc
{
    public final Activity a;
    public long b;
    public final aeim c;
    private final kzd d;
    private final abns e;
    private final arhr f;
    private final oas g;
    private final aum h;
    private asic i;
    private final uyi j;
    private final arud k;
    
    public InAppReviewController(final Activity a, final arud k, final kzd d, final aeim c, final abns e, final arhr f, final oas g, final aum h, final uyi j, final byte[] array, final byte[] array2) {
        this.b = 0L;
        this.i = (asic)asjh.a;
        this.c = c;
        this.a = a;
        this.k = k;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = j;
    }
    
    private final long j() {
        return ((jzn)((tku)this.f.a()).c()).c;
    }
    
    private final void k(final long n) {
        tcp.n(this.h, ((tku)this.f.a()).b((aexg)new fmp(n, 7)), (trb)jpn.o, (trb)tcp.b);
    }
    
    public final void m(final int n) {
        final long c = this.g.c();
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = this.a.getPackageManager().getApplicationInfo("com.android.vending", 0);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            trn.c("Package not found", "com.android.vending");
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            alvs alvs;
            if ((alvs = this.k.f().e) == null) {
                alvs = alvs.a;
            }
            if (alvs.aF) {
                if (this.d.c() && this.b > 60000L && c - this.j() >= (long)this.j.n(45354931L).aG() && applicationInfo.enabled) {
                    this.k(c);
                    final aear aear = (aear)this.c.a;
                    Object o;
                    if (aear.a == null) {
                        aear.c.k("Play Store app is either not installed or not the official version", new Object[0]);
                        o = nmr.b((Exception)new aeao());
                    }
                    else {
                        final nmo nmo = new nmo();
                        aear.a.f((aeau)new aeap(aear, nmo, nmo, (byte[])null), nmo);
                        o = nmo.a;
                    }
                    final jzl jzl = new jzl(this, 0);
                    final nly nly = (nly)o;
                    nly.q((nlu)jzl);
                    nly.m((nls)jzm.b);
                    return;
                }
                if (c < this.j()) {
                    this.k(c);
                }
            }
        }
    }
    
    public final void mM(final aum aum) {
        this.i.dispose();
        this.d.b((kzc)this);
    }
    
    public final void mq(final aum aum) {
        this.i = ((asgt)this.e.q().e).al((asix)new jyo(this, 4));
        this.d.a((kzc)this);
    }
}
