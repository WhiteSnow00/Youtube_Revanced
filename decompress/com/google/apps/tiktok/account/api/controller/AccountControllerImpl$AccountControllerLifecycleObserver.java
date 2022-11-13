// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.account.api.controller;

import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import android.os.Bundle;

public final class AccountControllerImpl$AccountControllerLifecycleObserver implements aua, aeje
{
    public final aeir a;
    private boolean b;
    private boolean c;
    private Bundle d;
    
    public AccountControllerImpl$AccountControllerLifecycleObserver(final aeir a) {
        this.a = a;
        this.c = false;
    }
    
    public final ListenableFuture g() {
        final aeir a = this.a;
        a.n = true;
        if (!a.m && !a.b.h() && !this.a.b.g()) {
            return this.a.g();
        }
        return afwm.m((Object)null);
    }
    
    public final void lW(final aun aun) {
        this.a.n();
    }
    
    public final void mM(final aun aun) {
        this.a.f.b((aeje)this);
    }
    
    public final void mq(final aun aun) {
        this.a.b.d((rd)new aeio(this), (rd)new aeip(this));
        final aeir a = this.a;
        if (a.k == null) {
            a.k = aejv.a().a();
        }
        if (this.a.b.a().hasExtra("$tiktok$for_requirement_activity")) {
            final afeq ai = this.a.q.ai();
            String concat;
            if (ai.isEmpty()) {
                concat = "";
            }
            else {
                concat = " Requirements: ".concat(String.valueOf(String.valueOf(ai)));
            }
            final IllegalStateException ex = new IllegalStateException("Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?".concat(concat));
            if (!this.a.h) {
                throw ex;
            }
            c.i(((afkg)aeir.a).g(), "The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent", "com/google/apps/tiktok/account/api/controller/AccountControllerImpl$AccountControllerLifecycleObserver", "onCreate", '\u03d6', "AccountControllerImpl.java", (Throwable)ex);
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
        Label_0234: {
            if (a2 != null) {
                final boolean g = this.a.g;
                b = false;
                if (g) {
                    break Label_0234;
                }
                b = b;
                if (!a2.getBoolean("tiktok_accounts_disabled")) {
                    break Label_0234;
                }
            }
            b = true;
        }
        if (this.b = b) {
            final aeir a3 = this.a;
            final ahaz builder = ((ahbh)aeis.a).createBuilder();
            builder.copyOnWrite();
            final aeis aeis = (aeis)builder.instance;
            aeis.b |= 0x1;
            aeis.c = -1;
            a3.l = (aeis)builder.build();
            final aeir a4 = this.a;
            a4.o = a4.e();
        }
        else {
            this.a.l = (aeis)adyf.aw(this.d, "state_latest_operation", (MessageLite)aeis.a, ExtensionRegistryLite.a);
            this.a.m = this.d.getBoolean("state_pending_op");
        }
        final aeir a5 = this.a;
        a5.d.g(a5.j);
        this.a.f.a((aeje)this);
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        if (this.c) {
            this.a.n();
            return;
        }
        this.c = true;
        if (this.b) {
            adkp.I(true ^ this.a.c.i(), "Should not have account before initial start.");
            final aeir a = this.a;
            final ListenableFuture o = a.o;
            o.getClass();
            a.m(a.k.c, o, 0);
            this.a.o = null;
        }
        else {
            final ActivityAccountState c = this.a.c;
            AccountId.b(c.g());
            final ActivityAccountState c2 = this.a.c;
            qdt.h();
            final aejz d = c2.d;
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
    
    public final void oX(final aun aun) {
    }
}
