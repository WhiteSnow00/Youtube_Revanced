import android.net.Uri;
import android.net.ProxyInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubv
{
    public static final aubv a;
    public final String b;
    public final int c;
    public final String d;
    public final String[] e;
    
    static {
        a = new aubv("", 0, "", new String[0]);
    }
    
    public aubv(final String b, final int c, final String d, final String[] e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static aubv a(final ProxyInfo proxyInfo) {
        String string = null;
        if (proxyInfo == null) {
            return null;
        }
        final String host = proxyInfo.getHost();
        final Uri pacFileUrl = proxyInfo.getPacFileUrl();
        String s;
        if ((s = host) == null) {
            s = "";
        }
        final int port = proxyInfo.getPort();
        if (!Uri.EMPTY.equals((Object)pacFileUrl)) {
            string = pacFileUrl.toString();
        }
        return new aubv(s, port, string, proxyInfo.getExclusionList());
    }
}
