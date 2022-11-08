// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.account.api.controller;

import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import android.os.Bundle;

public final class AccountControllerImpl$AccountControllerLifecycleObserver implements atz, aehd
{
    public final /* synthetic */ aegq a;
    private boolean b;
    private boolean c;
    private Bundle d;
    
    public AccountControllerImpl$AccountControllerLifecycleObserver(final aegq a) {
        this.a = a;
        this.c = false;
    }
    
    public final ListenableFuture g() {
        final aegq a = this.a;
        a.n = true;
        if (!a.m && !a.b.h() && !this.a.b.g()) {
            return this.a.g();
        }
        return afva.m(null);
    }
    
    public final void lW(final aum aum) {
        this.a.n();
    }
    
    public final void mM(final aum aum) {
        this.a.f.b((aehd)this);
    }
    
    public final void mq(final aum aum) {
        this.a.b.d((rd)new aegn(this), (rd)new aego(this));
        final aegq a = this.a;
        if (a.k == null) {
            a.k = aehu.a().a();
        }
        if (this.a.b.a().hasExtra("$tiktok$for_requirement_activity")) {
            final afcr ak = this.a.q.ak();
            String concat;
            if (ak.isEmpty()) {
                concat = "";
            }
            else {
                concat = " Requirements: ".concat(String.valueOf(String.valueOf(ak)));
            }
            final IllegalStateException ex = new IllegalStateException("Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?".concat(concat));
            if (!this.a.h) {
                throw ex;
            }
            c.i(((afig)aegq.a).g(), "The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent", "com/google/apps/tiktok/account/api/controller/AccountControllerImpl$AccountControllerLifecycleObserver", "onCreate", '\u03d6', "AccountControllerImpl.java", (Throwable)ex);
        }
        Bundle a2;
        if (this.a.p.getSavedStateRegistry().d) {
            a2 = this.a.p.getSavedStateRegistry().a("tiktok_account_controller_saved_instance_state");
        }
        else {
            a2 = null;
        }
        this.d = a2;
        boolean b = false;
        Label_0235: {
            if (a2 != null) {
                final boolean g = this.a.g;
                b = false;
                if (g) {
                    break Label_0235;
                }
                b = b;
                if (!a2.getBoolean("tiktok_accounts_disabled")) {
                    break Label_0235;
                }
            }
            b = true;
        }
        if (this.b = b) {
            final aegq a3 = this.a;
            final agza builder = aegr.a.createBuilder();
            builder.copyOnWrite();
            final aegr aegr = (aegr)builder.instance;
            aegr.b |= 0x1;
            aegr.c = -1;
            a3.l = (aegr)builder.build();
            final aegq a4 = this.a;
            a4.o = a4.e();
        }
        else {
            this.a.l = (aegr)aeda.ar(this.d, "state_latest_operation", (MessageLite)aegr.a, ExtensionRegistryLite.a);
            this.a.m = this.d.getBoolean("state_pending_op");
        }
        final aegq a5 = this.a;
        a5.d.g(a5.j);
        this.a.f.a((aehd)this);
    }
    
    public final void oS(final aum aum) {
        if (this.c) {
            this.a.n();
            return;
        }
        this.c = true;
        if (this.b) {
            agot.v(true ^ this.a.c.i(), (Object)"Should not have account before initial start.");
            final aegq a = this.a;
            final ListenableFuture o = a.o;
            o.getClass();
            a.m(a.k.c, o, 0);
            this.a.o = null;
        }
        else {
            final ActivityAccountState c = this.a.c;
            AccountId.b(c.g());
            final ActivityAccountState c2 = this.a.c;
            qcj.s();
            final aehy d = c2.d;
            c.h();
            if (c.i()) {
                c.f.p(d);
            }
            this.a.n = this.d.getBoolean("state_do_not_revalidate");
            this.a.n();
        }
        final Bundle d2 = this.d;
        if (d2 != null && this.a.g && !d2.getBoolean("tiktok_accounts_disabled")) {
            this.a.c.k();
        }
        this.d = null;
    }
}
