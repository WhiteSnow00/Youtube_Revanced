// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import java.util.Iterator;
import java.util.List;
import android.accounts.Account;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.youtube.account.identity.$AutoValue_AccountIdentity;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.d;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import android.content.SharedPreferences;

public final class j implements rgh, rgm
{
    private final SharedPreferences a;
    private AccountIdentity b;
    private rgk c;
    private boolean d;
    
    public j(final SharedPreferences a, final d d, final uyi uyi) {
        if (uyi.f(45360719L)) {
            this.a = a;
        }
        else {
            a.getClass();
            this.a = (SharedPreferences)new i(a, d.a, uyi);
        }
        this.d = false;
    }
    
    public static String i(final String s, final String s2) {
        if (TextUtils.isEmpty((CharSequence)s2)) {
            return s;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s2);
        sb.append("_");
        sb.append(s);
        return sb.toString();
    }
    
    public final rgk a() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public final rgk b(final AccountIdentity accountIdentity) {
        synchronized (this) {
            final AccountIdentity b = this.b;
            if (b != null && (($AutoValue_AccountIdentity)b).a.equals(accountIdentity.d())) {
                return this.c;
            }
            return rgk.a;
        }
    }
    
    public final zkh c() {
        synchronized (this) {
            if (!this.d) {
                this.o();
            }
            final AccountIdentity b = this.b;
            if (b != null) {
                return (zkh)b;
            }
            return zkg.a;
        }
    }
    
    public final zkh d(final String s) {
        synchronized (this) {
            if ("".equals(s)) {
                return zkg.a;
            }
            final AccountIdentity b = this.b;
            if (b != null && (($AutoValue_AccountIdentity)b).a.equals(s)) {
                return (zkh)this.b;
            }
            return null;
        }
    }
    
    public final ListenableFuture e() {
        return aftm.a;
    }
    
    public final ListenableFuture f(final AccountIdentity accountIdentity) {
        synchronized (this) {
            this.a.edit().putString("user_account", accountIdentity.a()).putString("user_identity", accountIdentity.e()).putString("user_identity_id", accountIdentity.d()).putString("datasync_id", accountIdentity.b()).putBoolean("user_signed_out", false).apply();
            this.d = false;
            return aftm.a;
        }
    }
    
    public final ListenableFuture g(final String s) {
        return aftm.a;
    }
    
    public final ListenableFuture h(final boolean b) {
        synchronized (this) {
            this.a.edit().remove("user_account").remove("user_identity").remove("user_identity_id").remove("username").remove("datasync_id").putBoolean("user_signed_out", b).apply();
            this.d = false;
            return aftm.a;
        }
    }
    
    public final String j() {
        synchronized (this) {
            return this.a.getString("visitor_id", (String)null);
        }
    }
    
    public final String k() {
        return this.a.getString("visitor_id", (String)null);
    }
    
    public final List l(final Account[] array) {
        final AccountIdentity b = this.b;
        if (b != null) {
            final String b2 = (($AutoValue_AccountIdentity)b).b;
            for (int length = array.length, i = 0; i < length; ++i) {
                if (b2.equals(array[i].name)) {
                    return (List)afcr.q();
                }
            }
            return (List)afcr.r((Object)this.b);
        }
        return (List)afcr.q();
    }
    
    public final void m() {
        synchronized (this) {
            this.c = rgk.a;
        }
    }
    
    public final void n(final AccountIdentity accountIdentity) {
        final AccountIdentity b = this.b;
        if (b != null && (($AutoValue_AccountIdentity)b).a.equals(accountIdentity.d())) {
            this.c = rgk.a;
        }
    }
    
    protected final void o() {
        synchronized (this) {
            if (this.d) {
                return;
            }
            final SharedPreferences a = this.a;
            String s = null;
            final String string = a.getString("user_account", (String)null);
            final String string2 = this.a.getString("user_identity_id", (String)null);
            final String string3 = this.a.getString("datasync_id", (String)null);
            if (string != null && string2 != null) {
                final String string4 = this.a.getString("user_identity", (String)null);
                if (!"No +Page Delegate".equals(string4)) {
                    s = string4;
                }
                this.b = AccountIdentity.n(string2, string, s, string3);
            }
            else {
                this.b = null;
            }
            this.d = true;
        }
    }
    
    public final void p(final List list) {
        list.getClass();
        final AccountIdentity b = this.b;
        if (b == null) {
            return;
        }
        final String b2 = (($AutoValue_AccountIdentity)b).b;
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (b2.equals(((AccountIdentity)iterator.next()).a())) {
                this.h(false);
                break;
            }
        }
    }
    
    public final void q(final String s, final String s2) {
        if (!this.d) {
            this.o();
        }
        final AccountIdentity b = this.b;
        if (b != null) {
            final $AutoValue_AccountIdentity $AutoValue_AccountIdentity = ($AutoValue_AccountIdentity)b;
            if (s.equals($AutoValue_AccountIdentity.b)) {
                this.f(AccountIdentity.n($AutoValue_AccountIdentity.a, s2, $AutoValue_AccountIdentity.c, $AutoValue_AccountIdentity.g));
            }
        }
    }
    
    public final void r(final rgk c) {
        synchronized (this) {
            this.c = c;
        }
    }
    
    public final boolean s() {
        synchronized (this) {
            return this.a.getBoolean("user_signed_out", false);
        }
    }
    
    public final boolean t() {
        synchronized (this) {
            if (!this.d) {
                this.o();
            }
            final AccountIdentity b = this.b;
            monitorexit(this);
            return b != null;
        }
    }
}
