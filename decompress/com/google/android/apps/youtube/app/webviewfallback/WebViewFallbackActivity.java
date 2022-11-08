// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.webviewfallback;

import android.view.ViewGroup;
import android.accounts.Account;
import android.net.Uri$Builder;
import android.webkit.WebSettings;
import android.app.Activity;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import java.util.concurrent.Executor;
import android.webkit.CookieManager;
import java.util.concurrent.ScheduledExecutorService;
import android.webkit.WebView;

public final class WebViewFallbackActivity extends lln
{
    public static final String b;
    public WebView c;
    public lls d;
    public llx e;
    public lmb f;
    public zki g;
    public tox h;
    public lmf i;
    public ScheduledExecutorService j;
    public CookieManager k;
    public atjj l;
    public Executor m;
    public c n;
    public lzi o;
    private final asib q;
    private final asib r;
    
    static {
        b = String.valueOf(WebViewFallbackActivity.class.getName()).concat("#FORCE_ON");
    }
    
    public WebViewFallbackActivity() {
        final asib q = new asib();
        this.q = q;
        this.r = new asib(new asic[] { (asic)q });
    }
    
    public final void b(final String s) {
        this.c.loadUrl(s);
    }
    
    public final void onBackPressed() {
        if (this.c.canGoBack()) {
            this.c.goBack();
            return;
        }
        super.onBackPressed();
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.c.getSettings().setJavaScriptEnabled(true);
        this.c.getSettings().setDomStorageEnabled(true);
        this.c.getSettings().setSupportMultipleWindows(false);
        final WebSettings settings = this.c.getSettings();
        final String userAgentString = this.c.getSettings().getUserAgentString();
        final String cz = tmy.cz((Context)this, tsi.d((Context)this), this.getClass().getSimpleName());
        String string = userAgentString;
        if (!userAgentString.contains(cz)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(userAgentString);
            sb.append(" ");
            sb.append(cz);
            string = sb.toString();
        }
        settings.setUserAgentString(string);
        this.c.setWebViewClient((WebViewClient)this.e);
        this.c.setWebChromeClient((WebChromeClient)this.d);
        this.c.getSettings().getUserAgentString();
        this.k.setAcceptCookie(true);
        final Uri$Builder buildUpon = Uri.parse(this.f.d()).buildUpon();
        buildUpon.appendQueryParameter("hl", ((fa)this).getResources().getConfiguration().locale.getLanguage());
        buildUpon.appendQueryParameter("override_hl", "1");
        final String string2 = buildUpon.toString();
        final Account p = this.o.p(this.g.c());
        if (!this.k.hasCookies() && p != null) {
            this.r.c(zke.a((Activity)this, p, string2).L(atio.b((Executor)this.j)).E(ashw.a()).aa((Object)string2).O((Object)string2).Z((asix)new lkg(this, 20)));
        }
        else {
            this.b(string2);
        }
        final asib r = this.r;
        final asom asom = new asom(this.f.c().B((asjd)lep.s));
        final asjc n = aulo.n;
        final asic ac = ((asgy)asom).E(atio.b(this.m)).ac((asix)new lkg(this, 19));
        final llx e = this.e;
        final asgt p2 = e.c.a().L((asjc)lkr.t).P(atio.b(e.f));
        final llt d = e.d;
        d.getClass();
        final asic al = p2.al((asix)new llp(d, 3));
        final asgt p3 = e.c.b().L((asjc)lkr.t).P(atio.b(e.f));
        final llt e2 = e.e;
        e2.getClass();
        final asib asib = new asib(new asic[] { al, p3.al((asix)new llp(e2, 3)) });
        final lmf i = this.i;
        r.f(new asic[] { ac, (asic)asib, (asic)new asib(new asic[] { i.e.al((asix)new llp(i, 4)), ((asgt)i.d.b).R().L((asjc)llz.d).al((asix)new llp(i.c, 5)) }) });
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.r.dispose();
    }
    
    protected final void onStart() {
        super.onStart();
        final asib q = this.q;
        final asib asib = new asib(new asic[] { ashp.I((Object)false).Z((asix)new lkg(this.n, 16, (byte[])null, (byte[])null)) });
        final lls d = this.d;
        final asic al = d.c().L((asjc)lkr.q).al((asix)new llp(d, 2));
        final asgt c = d.b().p().w((asix)new llp(d, 1)).C((asjc)lkr.l);
        final ViewGroup a = d.a;
        a.getClass();
        final asic al2 = c.al((asix)new llp(a, 0));
        final asgt l = d.a().au(2).B((asjd)lep.t).L((asjc)lkr.r);
        final lkr k = lkr.k;
        final int a2 = asgt.a;
        asjv.c(a2, "bufferSize");
        final aspg aspg = new aspg(l, (asjc)k, a2);
        final asjc j = aulo.j;
        final asib asib2 = new asib(new asic[] { al, al2, ((asgt)aspg).L((asjc)lkr.p).al((asix)lei.n) });
        final asic al3 = ((asgt)this.e.a).Q().L((asjc)lkr.j).al((asix)new lkg(this, 18));
        final asgt i = this.d.c().L((asjc)lkr.i);
        final WebView c2 = this.c;
        c2.getClass();
        q.f(new asic[] { (asic)asib, (asic)asib2, al3, i.al((asix)new lkg(c2, 17)) });
    }
    
    protected final void onStop() {
        super.onStop();
        this.k.flush();
        this.q.b();
    }
    
    public final void onUserInteraction() {
        final tox h = this.h;
        if (h != null) {
            h.b();
        }
        super.onUserInteraction();
    }
}
