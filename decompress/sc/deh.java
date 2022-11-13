import java.net.URLConnection;
import java.util.Iterator;
import java.net.URISyntaxException;
import java.net.MalformedURLException;
import android.text.TextUtils;
import java.util.Map;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class deh implements ddy
{
    private final dhz a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;
    
    public deh(final dhz a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    private static int b(final HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        }
        catch (final IOException ex) {
            return -1;
        }
    }
    
    private final InputStream e(URL c, int contentLength, URL headerField, Map inputStream) {
        Label_0443: {
            if (contentLength >= 5) {
                break Label_0443;
            }
            while (true) {
                if (headerField == null) {
                    break Label_0039;
                }
                try {
                    if (!((URL)c).toURI().equals(headerField.toURI())) {
                        try {
                            final HttpURLConnection c2 = (HttpURLConnection)((URL)c).openConnection();
                            for (final Map.Entry<String, V> entry : ((Map)inputStream).entrySet()) {
                                c2.addRequestProperty(entry.getKey(), (String)entry.getValue());
                            }
                            c2.setConnectTimeout(this.b);
                            c2.setReadTimeout(this.b);
                            c2.setUseCaches(false);
                            c2.setDoInput(true);
                            c2.setInstanceFollowRedirects(false);
                            this.c = c2;
                            try {
                                c2.connect();
                                this.d = this.c.getInputStream();
                                if (this.e) {
                                    return null;
                                }
                                final int b = b(this.c);
                                final int n = b / 100;
                                if (n == 2) {
                                    c = (IOException)this.c;
                                    try {
                                        if (TextUtils.isEmpty((CharSequence)((URLConnection)c).getContentEncoding())) {
                                            contentLength = ((URLConnection)c).getContentLength();
                                            inputStream = ((URLConnection)c).getInputStream();
                                            this.d = (InputStream)new dow(inputStream, (long)contentLength);
                                        }
                                        else {
                                            this.d = ((URLConnection)c).getInputStream();
                                        }
                                        return this.d;
                                    }
                                    catch (final IOException ex) {
                                        throw new ddd("Failed to obtain InputStream", b((HttpURLConnection)c), (Throwable)ex);
                                    }
                                }
                                if (n == 3) {
                                    headerField = (URL)this.c.getHeaderField("Location");
                                    if (!TextUtils.isEmpty((CharSequence)headerField)) {
                                        try {
                                            final URL url = new URL((URL)c, (String)headerField);
                                            this.d();
                                            return this.e(url, contentLength + 1, (URL)c, (Map)inputStream);
                                        }
                                        catch (final MalformedURLException ex2) {
                                            throw new ddd("Bad redirect url: ".concat(String.valueOf(headerField)), b, (Throwable)ex2);
                                        }
                                    }
                                    throw new ddd("Received empty or null redirect url", b);
                                }
                                if (b == -1) {
                                    throw new ddd("Http request failed", -1);
                                }
                                try {
                                    throw new ddd(this.c.getResponseMessage(), b);
                                }
                                catch (final IOException ex3) {
                                    throw new ddd("Failed to get a response message", b, (Throwable)ex3);
                                }
                            }
                            catch (final IOException ex4) {
                                throw new ddd("Failed to connect or obtain data", b(this.c), (Throwable)ex4);
                            }
                        }
                        catch (final IOException c) {
                            throw new ddd("URL.openConnection threw", 0, (Throwable)c);
                        }
                        c = (IOException)new ddd("Too many (> 5) redirects!", -1);
                        throw c;
                    }
                    throw new ddd("In re-direct loop", -1);
                }
                catch (final URISyntaxException ex5) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final Class a() {
        return InputStream.class;
    }
    
    public final void d() {
        final InputStream d = this.d;
        if (d != null) {
            try {
                d.close();
            }
            catch (final IOException ex) {}
        }
        final HttpURLConnection c = this.c;
        if (c != null) {
            c.disconnect();
        }
        this.c = null;
    }
    
    public final void f(final dca dca, final ddx ddx) {
        dpc.b();
        try {
            try {
                final dhz a = this.a;
                if (a.b == null) {
                    a.b = new URL(a.c());
                }
                ddx.b((Object)this.e(a.b, 0, null, this.a.d()));
            }
            finally {}
        }
        catch (final IOException ex) {
            ddx.e((Exception)ex);
        }
    }
    
    public final int g() {
        return 2;
    }
    
    public final void lq() {
        this.e = true;
    }
}
