import android.content.Context;
import android.webkit.JavascriptInterface;
import java.util.concurrent.Callable;
import android.webkit.WebViewClient;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.webkit.WebView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlt extends jlk
{
    public View a;
    public wwv ae;
    public wvu af;
    public gko ag;
    public lzi ah;
    private WebView ai;
    private qw aj;
    public View b;
    public asho c;
    public asho d;
    public zki e;
    
    public static jlt r(final String s) {
        final jlt jlt = new jlt();
        final Bundle bundle = new Bundle();
        bundle.putString("vaaConsentUrl", s);
        ((br)jlt).ag(bundle);
        return jlt;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        final View inflate = layoutInflater.inflate(2131625687, viewGroup, false);
        this.a = inflate;
        this.b = inflate.findViewById(2131430665);
        this.ai = (WebView)this.a.findViewById(2131432471);
        final View viewById = this.a.findViewById(2131428234);
        this.ae.l((wxz)new wws(wya.c(138902)));
        viewById.setOnClickListener((View$OnClickListener)new jlq(this, 0));
        this.ai.getSettings().setJavaScriptEnabled(true);
        if (this.ag.a() == gkm.b) {
            if (cls.b("FORCE_DARK")) {
                cjg.d(this.ai.getSettings(), 2);
            }
        }
        else if (cls.b("FORCE_DARK")) {
            cjg.d(this.ai.getSettings(), 0);
        }
        this.ai.addJavascriptInterface((Object)this, "gsa_youtube_ytvaa");
        this.ai.setWebViewClient((WebViewClient)new jlr(this));
        final Bundle m = ((br)this).m;
        String string;
        if (m != null) {
            string = m.getString("vaaConsentUrl");
        }
        else {
            string = null;
        }
        if (string != null) {
            ashp.F((Callable)new inm(this, 19)).O((Object)aewp.a).g((asjd)iuc.m).C((asjc)jch.g).C((asjc)new jax(string, 8)).w((asjc)new jax(this, 9)).ad((asix)new jcp(this.ai, 16), (asix)new jcp(this, 17));
        }
        else {
            trn.b("VaaConsentWebView was not provided a URL");
            this.s(3);
        }
        return this.a;
    }
    
    @JavascriptInterface
    public void consentError() {
        final wvu af = this.af;
        final aklo d = aklq.d();
        final apnm a = apnn.a();
        final apno c = apno.c;
        a.copyOnWrite();
        apnn.c((apnn)a.instance, c);
        ((agza)d).copyOnWrite();
        aklq.r((aklq)d.instance, (apnn)a.build());
        af.d((aklq)((agza)d).build());
        this.s(3);
    }
    
    @JavascriptInterface
    public void consentGiven() {
        this.ae.J(3, (wxz)new wws(wya.c(137833)), (alff)null);
        this.s(1);
    }
    
    @JavascriptInterface
    public void consentNotGiven() {
        this.ae.J(3, (wxz)new wws(wya.c(137834)), (alff)null);
        this.s(2);
    }
    
    @JavascriptInterface
    public void initialLoadCompleted() {
        (this.b = this.a.findViewById(2131430665)).setVisibility(4);
        this.ae.l((wxz)new wws(wya.c(137833)));
        this.ae.l((wxz)new wws(wya.c(137834)));
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.ae.l((wxz)new wws(wya.c(22156)));
        this.aj = new jls(this);
        final bu od = ((br)this).od();
        if (od != null) {
            ((qt)od).getOnBackPressedDispatcher().b((aum)this, this.aj);
        }
    }
    
    protected final wwv n() {
        return this.ae;
    }
    
    public final void nn() {
        super.nn();
        final qw aj = this.aj;
        if (aj != null) {
            aj.c();
        }
    }
    
    protected final wyb o() {
        return wya.b(137575);
    }
    
    public final void s(final int n) {
        final Bundle bundle = new Bundle();
        String s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    s = "CONSENT_CANCELED";
                }
                else {
                    s = "CONSENT_ERROR";
                }
            }
            else {
                s = "CONSENT_NOT_GIVEN";
            }
        }
        else {
            s = "CONSENT_GIVEN";
        }
        bundle.putString("VaaConsentResult", s);
        ((br)this).G().N("VaaConsentWebViewRequestKey", bundle);
    }
}
