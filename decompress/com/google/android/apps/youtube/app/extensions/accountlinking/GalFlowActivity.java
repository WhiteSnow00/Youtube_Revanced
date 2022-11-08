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

public class GalFlowActivity extends gqf
{
    public gqb a;
    public tox b;
    public nod c;
    private rf e;
    
    public final void a(final Intent intent) {
        this.e.b((Object)intent);
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.e = ((qt)this).registerForActivityResult((rl)new ro(), ((qt)this).getActivityResultRegistry(), (rd)new gtr(this, 1));
    }
    
    protected final void onDestroy() {
        super.onDestroy();
        this.c.d();
    }
    
    public final void onStart() {
        super.onStart();
        final gqb a = this.a;
        final nod c = this.c;
        if (a.d) {
            return;
        }
        a.d = true;
        if (!a.a.t()) {
            a.a(this, gqa.e);
            return;
        }
        if (!this.getIntent().hasExtra("thirdPartyId")) {
            a.a(this, gqa.e);
            return;
        }
        final String stringExtra = this.getIntent().getStringExtra("thirdPartyId");
        final String stringExtra2 = this.getIntent().getStringExtra("consentLanguageKeys");
        final ArrayList stringArrayListExtra = this.getIntent().getStringArrayListExtra("galCapabilities");
        try {
            final Account o = a.e.o(a.a.c());
            final npf c2 = c.c;
            final int a2 = nod.a();
            final agza builder = ((agzi)agom.a).createBuilder();
            final agoj d = c2.d(a2);
            builder.copyOnWrite();
            final agom agom = (agom)builder.instance;
            d.getClass();
            agom.b = d;
            final agza builder2 = ((agzi)agnv.a).createBuilder();
            builder2.copyOnWrite();
            final agnv agnv = (agnv)builder2.instance;
            stringExtra.getClass();
            agnv.b = stringExtra;
            final agnv c3 = (agnv)builder2.build();
            builder.copyOnWrite();
            final agom agom2 = (agom)builder.instance;
            c3.getClass();
            agom2.c = c3;
            tcp.k(afrp.f((ListenableFuture)aftj.m(afrp.e(afqv.f(afrp.e((ListenableFuture)aftj.m(c2.c(o, (npe)new npc((agom)builder.build(), 0))), (aexg)npd.a, (Executor)afsl.a), Throwable.class, (afry)grl.e, (Executor)afsl.a), (aexg)lkj.k, (Executor)afsl.a)), (afry)new gpz(a, stringArrayListExtra, stringExtra2, o, stringExtra, c, this), a.b), a.b, (tcn)new etc(a, this, 5), (tco)new exa(a, this, 12));
        }
        catch (final RemoteException | mpb | mpc remoteException | mpb | mpc) {
            a.a(this, gqa.e);
        }
    }
    
    public final void onUserInteraction() {
        final tox b = this.b;
        if (b != null) {
            b.b();
        }
        super.onUserInteraction();
    }
}
