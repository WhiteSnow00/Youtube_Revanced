import android.net.Uri;
import android.net.ProxyInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucn
{
    public static final aucn a;
    public final String b;
    public final int c;
    public final String d;
    public final String[] e;
    
    static {
        a = new aucn("", 0, "", new String[0]);
    }
    
    public aucn(final String b, final int c, final String d, final String[] e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static aucn a(final ProxyInfo proxyInfo) {
        String string = null;
        if (proxyInfo == null) {
            return null;
        }
        String host;
        if ((host = proxyInfo.getHost()) == null) {
            host = "";
        }
        final Uri pacFileUrl = proxyInfo.getPacFileUrl();
        final int port = proxyInfo.getPort();
        if (!Uri.EMPTY.equals((Object)pacFileUrl)) {
            string = pacFileUrl.toString();
        }
        return new aucn(host, port, string, proxyInfo.getExclusionList());
    }
}
