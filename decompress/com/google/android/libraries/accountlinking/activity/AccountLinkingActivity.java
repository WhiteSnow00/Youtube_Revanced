// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.accountlinking.activity;

import android.net.Uri;
import android.text.TextUtils;
import android.content.pm.PackageManager;
import android.content.Intent;
import java.util.List;
import android.accounts.Account;
import java.util.Set;
import java.util.Collection;
import android.os.Bundle;
import com.google.android.material.progressindicator.CircularProgressIndicator;

public class AccountLinkingActivity extends bu
{
    public static final afji a;
    public noq b;
    public CircularProgressIndicator c;
    public nou d;
    public noo e;
    
    static {
        a = nmr.o();
    }
    
    public final void a(final br br, final boolean b) {
        final br f = this.getSupportFragmentManager().f("flow_fragment");
        final ct i = this.getSupportFragmentManager().i();
        if (f != null) {
            i.n(f);
        }
        if (b) {
            i.r(2131427795, br, "flow_fragment");
            i.a();
            return;
        }
        i.s(br, "flow_fragment");
        i.a();
    }
    
    public final void b() {
        if (this.isTaskRoot()) {
            this.finishAndRemoveTask();
            return;
        }
        this.finish();
    }
    
    public final void onBackPressed() {
        ((afjf)((afjf)AccountLinkingActivity.a.l()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onBackPressed", 231, "AccountLinkingActivity.java")).r("accountlinkingactivity: onBackPressed");
        final br f = this.getSupportFragmentManager().f("flow_fragment");
        if (f instanceof nos) {
            ((nos)f).a();
            return;
        }
        super.onBackPressed();
    }
    
    @Override
    protected final void onCreate(final Bundle bundle) {
        final afji a = AccountLinkingActivity.a;
        ((afjf)((afjf)a.l()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onCreate", 56, "AccountLinkingActivity.java")).r("AccountLinkingActivity onCreate()");
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = bundle.getBundle("linking_arguments");
        }
        else {
            bundle2 = this.getIntent().getExtras();
        }
        if (bundle2 != null) {
            try {
                agot.u(bundle2.containsKey("session_id"));
                agot.u(bundle2.containsKey("scopes"));
                agot.u(bundle2.containsKey("capabilities"));
                final nop nop = new nop();
                nop.f((Set)afdu.p((Collection)bundle2.getStringArrayList("scopes")));
                nop.b((Set)afdu.p((Collection)bundle2.getStringArrayList("capabilities")));
                nop.c = (Account)bundle2.getParcelable("account");
                if (bundle2.getBoolean("using_custom_dependency_supplier")) {
                    nop.d = true;
                }
                nop.e = bundle2.getInt("session_id");
                nop.f = bundle2.getString("bucket");
                nop.g = bundle2.getString("service_host");
                nop.h = bundle2.getInt("service_port");
                nop.i = bundle2.getString("service_id");
                nop.d((List)afbm.d((Iterable)bundle2.getStringArrayList("flows")).f((aexg)lkj.q).g());
                nop.k = (agof)agzi.parseFrom(agof.a, bundle2.getByteArray("linking_session"));
                nop.e((Set)afdu.p((Collection)bundle2.getStringArrayList("google_scopes")));
                nop.m = bundle2.getBoolean("two_way_account_linking");
                nop.n = bundle2.getInt("account_linking_entry_point", 0);
                nop.c((List)afbm.d((Iterable)bundle2.getStringArrayList("data_usage_notices")).f((aexg)lkj.r).g());
                nop.p = bundle2.getString("consent_language_keys");
                nop.q = afcr.o((Collection)bundle2.getStringArrayList("experiment_server_tokens"));
                nop.r = noj.a(bundle2.getString("gal_color_scheme"));
                this.b = nop.a();
                final npi b = ((npk)new alm(this.getViewModelStore(), (avq)new npj(this.getApplication(), this.b)).h((Class)npk.class)).b;
                if (b == null) {
                    super.onCreate(null);
                    ((afjf)((afjf)((afig)a).h()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onCreate", 97, "AccountLinkingActivity.java")).r("Unable to create ManagedDependencySupplier. Shutting down AccountLinkingActivity.");
                    final ardu k = nmr.K(1, "Unable to create ManagedDependencySupplier.");
                    this.setResult(k.a, (Intent)k.b);
                    this.b();
                    return;
                }
                this.setContentView(2131623970);
                this.c = (CircularProgressIndicator)this.findViewById(2131427354);
                super.onCreate(bundle);
                this.e = (noo)new alm((avu)this, (avq)new non((cgj)this, bundle, this.getApplication(), this.b, b)).h((Class)noo.class);
                if (bundle != null) {
                    final Bundle bundle3 = bundle.getBundle("account_linking_view_model_bundle");
                    if (bundle3 == null) {
                        ((afjf)((afjf)((afig)a).h()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onCreate", 129, "AccountLinkingActivity.java")).r("accountLinkingViewModelBundle cannot be null when restoring AccountLinkingActivity.");
                        final ardu i = nmr.K(1, "accountLinkingViewModelBundle cannot be null when restoring AccountLinkingActivity");
                        this.setResult(i.a, (Intent)i.b);
                        this.b();
                        return;
                    }
                    final noo e = this.e;
                    ((afjf)((afjf)noo.b.l()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "recoverSavedState", 202, "AccountLinkingViewModel.java")).r("AccountLinkingModel: recoverSavedState");
                    e.k = bundle3.getInt("current_flow_index");
                    e.j = bundle3.getBoolean("is_streamlined_first_flow");
                    if (bundle3.containsKey("consent_language_key")) {
                        e.m = bundle3.getString("consent_language_key");
                    }
                    e.i = aheb.b(bundle3.getInt("current_client_state"));
                }
                ((auu)this.e.d).g((aum)this, (auy)new si(this, 7));
                ((auu)this.e.e).g((aum)this, (auy)new si(this, 8));
                ((auu)this.e.f).g((aum)this, (auy)new si(this, 9));
                ((auu)this.e.g).g((aum)this, (auy)new si(this, 10));
                final nou d = (nou)dg.c((bu)this).h((Class)nou.class);
                this.d = d;
                ((auu)d.a).g((aum)this, (auy)new nok(this));
                if (bundle == null) {
                    final noo e2 = this.e;
                    if (((auu)e2.d).c() != null) {
                        ((afjf)((afjf)noo.b.l()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 213, "AccountLinkingViewModel.java")).r("Account linking flows are already started");
                        return;
                    }
                    if (!e2.c.n.isEmpty() && ((auu)e2.e).c() != null) {
                        ((afjf)((afjf)noo.b.l()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 219, "AccountLinkingViewModel.java")).r("Account linking data usage notice is already started");
                        return;
                    }
                    if (e2.c.i.isEmpty()) {
                        ((afjf)((afjf)((afig)noo.b).h()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 224, "AccountLinkingViewModel.java")).r("No account linking flow is enabled by server");
                        e2.j(nmr.K(1, "Linking failed; No account linking flow is enabled by server"));
                        return;
                    }
                    final noi noi = (noi)e2.c.i.get(0);
                    noi noi2;
                    if ((noi2 = noi) == noi.a) {
                        final PackageManager packageManager = ((atv)e2).a.getPackageManager();
                        agnw agnw;
                        if ((agnw = e2.c.j.f) == null) {
                            agnw = agnw.a;
                        }
                        agnh agnh;
                        if ((agnh = agnw.b) == null) {
                            agnh = agnh.a;
                        }
                        final agzy b2 = agnh.b;
                        final afcr g = ((afci)e2.c.a).g();
                        agnw agnw2;
                        if ((agnw2 = e2.c.j.f) == null) {
                            agnw2 = agnw.a;
                        }
                        noi2 = noi;
                        if (!npl.a(packageManager, (List)b2, (List)g, agnw2.c).h()) {
                            ((afjf)((afjf)noo.b.l()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 244, "AccountLinkingViewModel.java")).r("3p app not installed");
                            e2.l = true;
                            if (e2.c.n.isEmpty()) {
                                e2.g(aheb.m);
                                e2.f(ahea.O);
                            }
                            if (++e2.k >= e2.c.i.size()) {
                                ((afjf)((afjf)noo.b.l()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 254, "AccountLinkingViewModel.java")).r("Attempted all flows but failed");
                                e2.j(nmr.K(1, "Linking failed; All account linking flows were attempted"));
                                return;
                            }
                            noi2 = (noi)e2.c.i.get(e2.k);
                            ((afjf)((afjf)noo.b.l()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 263, "AccountLinkingViewModel.java")).t("3p app not installed, move to next flow, %s ", (Object)noi2);
                        }
                    }
                    if (noi2 == noi.b) {
                        e2.j = true;
                    }
                    if ((noi2 != noi.a && noi2 != noi.d) || e2.c.n.isEmpty()) {
                        if (noi2 == noi.b && e2.c.n.contains((Object)noh.a)) {
                            ((aux)e2.e).k((Object)afcr.r((Object)noh.a));
                            return;
                        }
                        ((aux)e2.d).k((Object)noi2);
                    }
                    else {
                        ((aux)e2.e).k((Object)e2.c.n);
                    }
                }
                return;
            }
            catch (final Exception ex) {
                super.onCreate(null);
                ((afjf)((afjf)((afig)AccountLinkingActivity.a).h()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onCreate", 80, "AccountLinkingActivity.java")).r("Unable to parse arguments from bundle.");
                final ardu j = nmr.K(1, "Unable to parse arguments from bundle.");
                this.setResult(j.a, (Intent)j.b);
                this.b();
                return;
            }
        }
        super.onCreate(null);
        ((afjf)((afjf)((afig)a).h()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onCreate", 67, "AccountLinkingActivity.java")).r("linkingArgumentsBundle cannot be null.");
        final ardu l = nmr.K(1, "linkingArgumentsBundle cannot be null.");
        this.setResult(l.a, (Intent)l.b);
        this.b();
    }
    
    protected final void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.e.f(ahea.ae);
        final afji a = AccountLinkingActivity.a;
        ((afjf)((afjf)a.l()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onNewIntent", 215, "AccountLinkingActivity.java")).r("AccountLinkingActivity received onNewIntent()");
        final br f = this.getSupportFragmentManager().f("flow_fragment");
        if (f instanceof noz) {
            final noz noz = (noz)f;
            noz.af.f(ahea.af);
            ((afjf)((afjf)noz.a.l()).j("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "handleNewIntent", 218, "WebOAuthFragment.java")).r("WebOAuthFragment received handleNewIntent()");
            intent.getClass();
            noz.ag = true;
            final Uri data = intent.getData();
            not not;
            if (data == null) {
                ((afjf)((afjf)noz.a.l()).j("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "handleNewIntent", 224, "WebOAuthFragment.java")).r("Uri in new intent is null");
                not = noz.c;
                noz.af.f(ahea.ab);
            }
            else if (data.getQueryParameterNames().contains("error")) {
                final String queryParameter = data.getQueryParameter("error");
                ((afjf)((afjf)noz.a.l()).j("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "handleNewIntent", 229, "WebOAuthFragment.java")).t("WebOAuth received parameter error: %s", (Object)queryParameter);
                if (noz.d.containsKey((Object)queryParameter)) {
                    not = (not)noz.d.get((Object)queryParameter);
                }
                else {
                    not = noz.b;
                }
                noz.af.f((ahea)noz.e.getOrDefault((Object)queryParameter, (Object)ahea.aa));
            }
            else {
                final String queryParameter2 = data.getQueryParameter("redirect_state");
                ((afjf)((afjf)noz.a.l()).j("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "handleNewIntent", 240, "WebOAuthFragment.java")).t("WebOAuth received parameter state [hidden (isEmpty=%s)]", (Object)TextUtils.isEmpty((CharSequence)queryParameter2));
                if (TextUtils.isEmpty((CharSequence)queryParameter2)) {
                    not = noz.b;
                    noz.af.f(ahea.Z);
                }
                else {
                    not = not.a(2, queryParameter2);
                    noz.af.f(ahea.ac);
                }
            }
            noz.ae.a(not);
            return;
        }
        if (f instanceof nov) {
            final nov nov = (nov)f;
            intent.getClass();
            nov.ae = true;
            final Uri data2 = intent.getData();
            not not2;
            if (data2 == null) {
                nov.d.f(ahea.an);
                nov.d.i(4, 0, 0, (String)null, (String)null);
                not2 = not.b(14);
            }
            else if (data2.getQueryParameterNames().contains("error")) {
                final String queryParameter3 = data2.getQueryParameter("error");
                not2 = (not)nov.a.getOrDefault((Object)queryParameter3, (Object)not.c(2, 15));
                nov.d.f((ahea)nov.b.getOrDefault((Object)queryParameter3, (Object)ahea.S));
                final noo d = nov.d;
                int n;
                if (not2.e == 2) {
                    n = 3;
                }
                else {
                    n = 4;
                }
                d.i(5, n, 0, queryParameter3, data2.toString());
            }
            else if (!data2.getQueryParameterNames().contains("code")) {
                nov.d.f(ahea.R);
                nov.d.i(5, 6, 0, (String)null, data2.toString());
                not2 = not.b(15);
            }
            else if (data2.getQueryParameterNames().contains("code") && data2.getQueryParameterNames().contains("state")) {
                final String queryParameter4 = data2.getQueryParameter("state");
                if (queryParameter4 != null && queryParameter4.equals(nov.e)) {
                    final String queryParameter5 = data2.getQueryParameter("code");
                    if (queryParameter5 == null) {
                        nov.d.f(ahea.R);
                        nov.d.i(5, 6, 0, (String)null, data2.toString());
                        not2 = not.b(15);
                    }
                    else {
                        nov.d.f(ahea.P);
                        nov.d.i(3, 0, 0, (String)null, data2.toString());
                        not2 = not.a(2, queryParameter5);
                    }
                }
                else {
                    nov.d.f(ahea.R);
                    nov.d.i(5, 6, 0, (String)null, data2.toString());
                    not2 = not.b(15);
                }
            }
            else {
                nov.d.f(ahea.am);
                nov.d.i(5, 6, 0, (String)null, data2.toString());
                not2 = not.b(15);
            }
            nov.c.a(not2);
            return;
        }
        ((afjf)((afjf)((afig)a).h()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onNewIntent", 224, "AccountLinkingActivity.java")).r("Illegal state: there is no WebOAuthFragment when onNewIntent() is called");
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        ((afjf)((afjf)AccountLinkingActivity.a.l()).j("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onSaveInstanceState", 202, "AccountLinkingActivity.java")).r("AccountLinkingActivity: onSaveInstanceState()");
        super.onSaveInstanceState(bundle);
        bundle.putBundle("linking_arguments", this.b.a());
        final noo e = this.e;
        final Bundle bundle2 = new Bundle();
        bundle2.putInt("current_flow_index", e.k);
        bundle2.putBoolean("is_streamlined_first_flow", e.j);
        bundle2.putInt("current_client_state", e.i.getNumber());
        final String m = e.m;
        if (m != null) {
            bundle2.putString("consent_language_key", m);
        }
        bundle.putBundle("account_linking_view_model_bundle", bundle2);
    }
}
