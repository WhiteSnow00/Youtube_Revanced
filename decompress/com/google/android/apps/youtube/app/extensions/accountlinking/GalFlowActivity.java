// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.accountlinking;

import android.accounts.Account;
import java.util.ArrayList;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import android.os.Bundle;
import android.content.Intent;

public class GalFlowActivity extends gql
{
    public gqh a;
    public trc b;
    public nph c;
    private rf e;
    
    public final void a(final Intent intent) {
        this.e.b((Object)intent);
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.e = ((qt)this).registerForActivityResult((rl)new ro(), ((qt)this).getActivityResultRegistry(), (rd)new gtz(this, 1));
    }
    
    protected final void onDestroy() {
        super.onDestroy();
        this.c.d();
    }
    
    public final void onStart() {
        super.onStart();
        final gqh a = this.a;
        final nph c = this.c;
        if (a.d) {
            return;
        }
        a.d = true;
        if (!a.a.t()) {
            a.a(this, gqg.e);
            return;
        }
        if (!this.getIntent().hasExtra("thirdPartyId")) {
            a.a(this, gqg.e);
            return;
        }
        final String stringExtra = this.getIntent().getStringExtra("thirdPartyId");
        final String stringExtra2 = this.getIntent().getStringExtra("consentLanguageKeys");
        final ArrayList stringArrayListExtra = this.getIntent().getStringArrayListExtra("galCapabilities");
        try {
            final Account f = a.e.F(a.a.c());
            final nqk c2 = c.c;
            final int a2 = nph.a();
            final ahaz builder = ((ahbh)agql.a).createBuilder();
            final agqi d = c2.d(a2);
            builder.copyOnWrite();
            final agql agql = (agql)builder.instance;
            d.getClass();
            agql.b = d;
            final ahaz builder2 = ((ahbh)agpu.a).createBuilder();
            builder2.copyOnWrite();
            final agpu agpu = (agpu)builder2.instance;
            stringExtra.getClass();
            agpu.b = stringExtra;
            final agpu c3 = (agpu)builder2.build();
            builder.copyOnWrite();
            final agql agql2 = (agql)builder.instance;
            c3.getClass();
            agql2.c = c3;
            teu.k(aftq.f((ListenableFuture)afvk.m(aftq.e(afsw.f(aftq.e((ListenableFuture)afvk.m(c2.c(f, (nqj)new nqi((agql)builder.build(), 0))), (aezf)nqd.c, (Executor)afum.a), (Class)Throwable.class, (aftz)grs.e, (Executor)afum.a), (aezf)lll.l, (Executor)afum.a)), (aftz)new gqf(a, stringArrayListExtra, stringExtra2, f, stringExtra, c, this), a.b), a.b, (tes)new etf(a, this, 5), (tet)new exe(a, this, 12));
        }
        catch (final RemoteException | mqg | mqh remoteException | mqg | mqh) {
            a.a(this, gqg.e);
        }
    }
    
    public final void onUserInteraction() {
        final trc b = this.b;
        if (b != null) {
            b.b();
        }
        super.onUserInteraction();
    }
}
