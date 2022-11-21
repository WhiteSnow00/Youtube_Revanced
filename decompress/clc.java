import java.lang.reflect.InvocationHandler;
import java.util.Set;
import android.webkit.WebView;
import android.content.pm.PackageInfo;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clc
{
    static {
        Uri.parse("*");
        Uri.parse("");
    }
    
    public static PackageInfo a() {
        return clo.a();
    }
    
    public static void b(final WebView webView, final Set set, final acyy acyy) {
        if (((cln)clw.c).d()) {
            cly.a.a(webView).addWebMessageListener("youtubewebview", (String[])set.toArray(new String[0]), (InvocationHandler)new auif(new clu(acyy)));
            return;
        }
        throw clw.a();
    }
}
