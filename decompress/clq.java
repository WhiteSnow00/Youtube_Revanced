import java.util.concurrent.Executor;
import android.webkit.WebViewRenderProcessClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebView;
import android.webkit.WebSettings;

// 
// Decompiled by Procyon v0.6.0
// 

public class clq
{
    @Deprecated
    public static int a(final WebSettings webSettings) {
        return webSettings.getForceDark();
    }
    
    public static WebViewRenderProcess b(final WebView webView) {
        return webView.getWebViewRenderProcess();
    }
    
    public static WebViewRenderProcessClient c(final WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }
    
    @Deprecated
    public static void d(final WebSettings webSettings, final int forceDark) {
        webSettings.setForceDark(forceDark);
    }
    
    public static void e(final WebView webView, final cld cld) {
        cmb webViewRenderProcessClient;
        if (cld != null) {
            webViewRenderProcessClient = new cmb(cld);
        }
        else {
            webViewRenderProcessClient = null;
        }
        webView.setWebViewRenderProcessClient((WebViewRenderProcessClient)webViewRenderProcessClient);
    }
    
    public static void f(final WebView webView, final Executor executor, final cld cld) {
        cmb cmb;
        if (cld != null) {
            cmb = new cmb(cld);
        }
        else {
            cmb = null;
        }
        webView.setWebViewRenderProcessClient(executor, (WebViewRenderProcessClient)cmb);
    }
    
    public static boolean g(final WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
    
    public static dpe h(final dpe dpe) {
        return (dpe)new dpd(dpe);
    }
}
