import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URL;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eol implements eok
{
    private String a;
    private String b;
    
    public eol() {
    }
    
    public eol(String s, final String s2) {
        final boolean d = epf.d(s);
        final String s3 = null;
        if (d) {
            s = null;
        }
        else {
            s = s.trim();
        }
        this.a = s;
        if (epf.d(s2)) {
            s = s3;
        }
        else {
            s = s2.trim();
        }
        this.b = s;
    }
    
    public final void a(String o, Map urlConnection) {
        final String c = epf.c((String)o, (Map)urlConnection);
        Object o2;
        o = (o2 = System.getProperty("http.agent"));
        if (!epf.d(this.a)) {
            o2 = o;
            if (!epf.d(this.b)) {
                o2 = String.format("%s %s/%s", o, this.a, this.b);
            }
        }
        final Object o3 = o = null;
        try {
            try {
                o = o3;
                final URL url = new URL(c);
                o = o3;
                urlConnection = url.openConnection();
                try {
                    urlConnection.setRequestProperty("User-Agent", (String)o2);
                    ((HttpURLConnection)urlConnection).getResponseCode();
                    if (urlConnection != null) {
                        ((HttpURLConnection)urlConnection).disconnect();
                    }
                    return;
                }
                catch (final IOException o2) {}
                catch (final MalformedURLException o2) {}
                finally {
                    o = urlConnection;
                }
            }
            finally {}
        }
        catch (final IOException o2) {}
        catch (final MalformedURLException o2) {}
        final StringBuilder sb = new StringBuilder("wrong url format: ");
        sb.append(c);
        epf.e(sb.toString());
        throw new eoj(((Throwable)o2).getMessage());
        if (o != null) {
            ((HttpURLConnection)o).disconnect();
        }
    }
}
