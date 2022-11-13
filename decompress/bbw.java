import java.net.URLConnection;
import android.net.Uri;
import java.util.List;
import java.io.InterruptedIOException;
import java.util.zip.GZIPInputStream;
import java.net.NoRouteToHostException;
import java.net.MalformedURLException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.net.URL;
import java.io.InputStream;
import java.net.HttpURLConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbw extends bbd implements bcf
{
    private final int b;
    private final int c;
    private final String d;
    private final boolean e;
    private aezs f;
    private bbp g;
    private HttpURLConnection h;
    private InputStream i;
    private boolean j;
    private int k;
    private long l;
    private long m;
    private final bki n;
    private final bki o;
    
    @Deprecated
    public bbw() {
        this(null, 8000, 8000, null, null, false, null);
    }
    
    public bbw(final String d, final int b, final int c, final bki n, final aezs f, final boolean e, final byte[] array) {
        super(true);
        this.d = d;
        this.b = b;
        this.c = c;
        this.n = n;
        this.f = f;
        this.o = new bki((byte[])null);
        this.e = e;
    }
    
    private final HttpURLConnection n(final URL url, final int n, final byte[] array, final long n2, final long n3, final boolean b, final boolean instanceFollowRedirects, final Map map) {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        final HashMap hashMap = new HashMap();
        hashMap.putAll(this.n.d());
        hashMap.putAll(this.o.d());
        hashMap.putAll(map);
        for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), (String)entry.getValue());
        }
        final String c = bcg.c(n2, n3);
        if (c != null) {
            httpURLConnection.setRequestProperty("Range", c);
        }
        final String d = this.d;
        if (d != null) {
            httpURLConnection.setRequestProperty("User-Agent", d);
        }
        final boolean b2 = true;
        String s;
        if (!b) {
            s = "identity";
        }
        else {
            s = "gzip";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", s);
        httpURLConnection.setInstanceFollowRedirects(instanceFollowRedirects);
        httpURLConnection.setDoOutput(array != null && b2);
        httpURLConnection.setRequestMethod(bbp.f(n));
        if (array != null) {
            httpURLConnection.setFixedLengthStreamingMode(array.length);
            httpURLConnection.connect();
            final OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(array);
            outputStream.close();
        }
        else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }
    
    private final void o() {
        final HttpURLConnection h = this.h;
        if (h != null) {
            try {
                h.disconnect();
            }
            catch (final Exception ex) {
                bap.b("DefaultHttpDataSource", "Unexpected error while disconnecting", (Throwable)ex);
            }
            this.h = null;
        }
    }
    
    private static final URL p(final URL url, String protocol, final bbp bbp) {
        if (protocol != null) {
            try {
                final URL url2 = new URL(url, protocol);
                protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new bcc("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), bbp, 2001, 1);
                }
                if (protocol.equals(url.getProtocol())) {
                    return url2;
                }
                final String protocol2 = url.getProtocol();
                final StringBuilder sb = new StringBuilder("Disallowed cross-protocol redirect (");
                sb.append(protocol2);
                sb.append(" to ");
                sb.append(protocol);
                sb.append(")");
                throw new bcc(sb.toString(), bbp, 2001, 1);
            }
            catch (final MalformedURLException ex) {
                throw new bcc((IOException)ex, bbp, 2001, 1);
            }
        }
        throw new bcc("Null location redirect", bbp, 2001, 1);
    }
    
    public final int a(final byte[] array, int n, int a) {
        if (a == 0) {
            n = 0;
            return n;
        }
        try {
            final long l = this.l;
            int n2 = a;
            Label_0058: {
                if (l == -1L) {
                    break Label_0058;
                }
                final long n3 = l - this.m;
                if (n3 != 0L) {
                    n2 = (int)Math.min(a, n3);
                    break Label_0058;
                }
                n = -1;
                return n;
            }
            final InputStream i = this.i;
            a = bax.a;
            n = i.read(array, n, n2);
            if (n == -1) {
                return -1;
            }
            this.m += n;
            this.g(n);
            return n;
        }
        catch (final IOException ex) {
            final bbp g = this.g;
            n = bax.a;
            throw bcc.sM(ex, g, 2);
        }
    }
    
    public final long b(final bbp g) {
        this.g = g;
        this.m = 0L;
        this.l = 0L;
        this.i(g);
        Object h = null;
        Label_0998: {
            try {
                URL url = new URL(g.a.toString());
                int c = g.c;
                h = g.d;
                final long g2 = g.g;
                final long h2 = g.h;
                final boolean g3 = g.g(1);
                Label_0298: {
                    if (!this.e) {
                        final Map e = g.e;
                        try {
                            h = this.n(url, c, (byte[])h, g2, h2, g3, true, e);
                            break Label_0298;
                        }
                        catch (final IOException h) {
                            break Label_0998;
                        }
                    }
                    int n = 0;
                    int n2 = 0;
                    Label_0934: {
                        HttpURLConnection n3;
                        while (true) {
                            n2 = n + 1;
                            if (n > 20) {
                                break Label_0934;
                            }
                            n3 = this.n(url, c, (byte[])h, g2, h2, g3, false, g.e);
                            final int responseCode = n3.getResponseCode();
                            final String headerField = n3.getHeaderField("Location");
                            if (c != 1) {
                                if (c != 2) {
                                    break;
                                }
                                int n4 = responseCode;
                                if (responseCode != 300 && (n4 = responseCode) != 301 && (n4 = responseCode) != 302) {
                                    if (responseCode != 303) {
                                        break;
                                    }
                                    n4 = 303;
                                }
                                n3.disconnect();
                                if (this.e && n4 == 302) {
                                    c = 2;
                                }
                                else {
                                    h = null;
                                    c = 1;
                                }
                                url = p(url, headerField, g);
                            }
                            else {
                                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                                    break;
                                }
                                n3.disconnect();
                                url = p(url, headerField, g);
                                c = 1;
                            }
                            n = n2;
                        }
                        h = n3;
                        break Label_0298;
                    }
                    h = new StringBuilder();
                    ((StringBuilder)h).append("Too many redirects: ");
                    ((StringBuilder)h).append(n2);
                    throw new bcc((IOException)new NoRouteToHostException(((StringBuilder)h).toString()), g, 2001, 1);
                }
                this.h = (HttpURLConnection)h;
                this.k = ((HttpURLConnection)h).getResponseCode();
                ((HttpURLConnection)h).getResponseMessage();
                final int k = this.k;
                long l = -1L;
                if (k >= 200) {
                    if (k <= 299) {
                        final String contentType = ((URLConnection)h).getContentType();
                        final aezs f = this.f;
                        if (f != null && !f.a((Object)contentType)) {
                            this.o();
                            throw new bcd(contentType, g);
                        }
                        long g4;
                        if (this.k != 200 || (g4 = g.g) == 0L) {
                            g4 = 0L;
                        }
                        final boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(((URLConnection)h).getHeaderField("Content-Encoding"));
                        if (!equalsIgnoreCase) {
                            final long h3 = g.h;
                            if (h3 != -1L) {
                                this.l = h3;
                            }
                            else {
                                final long a = bcg.a(((URLConnection)h).getHeaderField("Content-Length"), ((URLConnection)h).getHeaderField("Content-Range"));
                                if (a != -1L) {
                                    l = a - g4;
                                }
                                this.l = l;
                            }
                        }
                        else {
                            this.l = g.h;
                        }
                        try {
                            this.i = ((URLConnection)h).getInputStream();
                            if (equalsIgnoreCase) {
                                this.i = new GZIPInputStream(this.i);
                            }
                            this.j = true;
                            this.j(g);
                            Label_0697: {
                                if (g4 == 0L) {
                                    break Label_0697;
                                }
                                try {
                                    final byte[] array = new byte[4096];
                                    while (g4 > 0L) {
                                        final int n5 = (int)Math.min(g4, 4096L);
                                        final InputStream i = this.i;
                                        final int a2 = bax.a;
                                        final int read = i.read(array, 0, n5);
                                        if (Thread.currentThread().isInterrupted()) {
                                            throw new bcc((IOException)new InterruptedIOException(), g, 2000, 1);
                                        }
                                        if (read == -1) {
                                            throw new bcc(g, 2008, 1);
                                        }
                                        g4 -= read;
                                        this.g(read);
                                    }
                                    return this.l;
                                }
                                catch (final IOException ex) {
                                    this.o();
                                    if (ex instanceof bcc) {
                                        throw (bcc)ex;
                                    }
                                    throw new bcc(ex, g, 2000, 1);
                                }
                            }
                        }
                        catch (final IOException h) {
                            this.o();
                            throw new bcc((IOException)h, g, 2000, 1);
                        }
                    }
                }
                final Map<String, List<String>> headerFields = ((URLConnection)h).getHeaderFields();
                if (this.k == 416 && g.g == bcg.b(((URLConnection)h).getHeaderField("Content-Range"))) {
                    this.j = true;
                    this.j(g);
                    final long h4 = g.h;
                    if (h4 != -1L) {
                        return h4;
                    }
                    return 0L;
                }
                else {
                    h = ((HttpURLConnection)h).getErrorStream();
                    while (true) {
                        if (h != null) {
                            Label_0862: {
                                try {
                                    bax.ak((InputStream)h);
                                    break Label_0862;
                                    final int a3 = bax.a;
                                }
                                catch (final IOException h) {
                                    final int a4 = bax.a;
                                }
                            }
                            this.o();
                            if (this.k == 416) {
                                h = new bbm(2008);
                            }
                            else {
                                h = null;
                            }
                            throw new bce(this.k, (IOException)h, (Map)headerFields, g);
                        }
                        continue;
                    }
                }
            }
            catch (final IOException ex2) {}
        }
        this.o();
        throw bcc.sM((IOException)h, g, 1);
    }
    
    public final Uri c() {
        final HttpURLConnection h = this.h;
        if (h == null) {
            return null;
        }
        return Uri.parse(h.getURL().toString());
    }
    
    public final Map d() {
        final HttpURLConnection h = this.h;
        if (h == null) {
            return afim.b;
        }
        return (Map)new bbv((Map)h.getHeaderFields());
    }
    
    public final void f() {
        try {
            final InputStream i = this.i;
            if (i != null) {
                if (this.h != null) {
                    final int a = bax.a;
                }
                try {
                    i.close();
                }
                catch (final IOException ex) {
                    final bbp g = this.g;
                    final int a2 = bax.a;
                    throw new bcc(ex, g, 2000, 3);
                }
            }
        }
        finally {
            this.i = null;
            this.o();
            if (this.j) {
                this.j = false;
                this.h();
            }
        }
    }
    
    public final int k() {
        if (this.h != null) {
            final int k = this.k;
            if (k > 0) {
                return k;
            }
        }
        return -1;
    }
    
    public final void l() {
        this.o.e();
    }
    
    public final void m(final String s, final String s2) {
        dk.d((Object)s);
        dk.d((Object)s2);
        this.o.f(s, s2);
    }
}
