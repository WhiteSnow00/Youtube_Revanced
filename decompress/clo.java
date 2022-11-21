import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.content.pm.PackageInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public class clo
{
    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }
    
    public static WebChromeClient b(final WebView webView) {
        return webView.getWebChromeClient();
    }
    
    public static WebViewClient c(final WebView webView) {
        return webView.getWebViewClient();
    }
    
    public static void d(final WebSettings webSettings, final boolean safeBrowsingEnabled) {
        webSettings.setSafeBrowsingEnabled(safeBrowsingEnabled);
    }
    
    public static boolean e(final WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }
    
    public static clo f() {
        return (clo)new cmr();
    }
    
    public static clo g() {
        return (clo)new cms();
    }
    
    public static clo h() {
        return (clo)new cmt(cml.a);
    }
    
    public static String i(final int n) {
        if (n == 1) {
            return "INITIALIZE";
        }
        if (n == 2) {
            return "RESOURCE_CACHE";
        }
        if (n == 3) {
            return "DATA_CACHE";
        }
        if (n == 4) {
            return "SOURCE";
        }
        if (n != 5) {
            return "FINISHED";
        }
        return "ENCODE";
    }
}
