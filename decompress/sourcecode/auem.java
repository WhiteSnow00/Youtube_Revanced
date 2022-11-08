import java.net.ProtocolException;
import java.io.OutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import android.os.Build$VERSION;
import android.net.TrafficStats;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest$Callback;
import org.chromium.net.ExperimentalUrlRequest$Builder;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Collections;
import java.util.AbstractMap;
import android.util.Pair;
import java.util.ArrayList;
import java.net.URL;
import java.util.Map;
import java.util.List;
import org.chromium.net.CronetEngine;
import java.io.IOException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.UrlRequest;
import java.net.HttpURLConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auem extends HttpURLConnection
{
    public final auer a;
    public UrlRequest b;
    public final aueo c;
    public auep d;
    public UrlResponseInfo e;
    public IOException f;
    public boolean g;
    private final CronetEngine h;
    private final List i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;
    private boolean n;
    private List o;
    private Map p;
    
    public auem(final URL url, final CronetEngine h) {
        super(url);
        this.h = h;
        this.a = new auer();
        this.c = new aueo(this);
        this.i = new ArrayList();
    }
    
    private final int g(final String s) {
        for (int i = 0; i < this.i.size(); ++i) {
            if (((String)((Pair)this.i.get(i)).first).equalsIgnoreCase(s)) {
                return i;
            }
        }
        return -1;
    }
    
    private final List h() {
        final List o = this.o;
        if (o != null) {
            return o;
        }
        this.o = new ArrayList();
        for (final Map.Entry<String, V> entry : this.e.getAllHeadersAsList()) {
            if (!entry.getKey().equalsIgnoreCase("Content-Encoding")) {
                this.o.add(new AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        return this.o = Collections.unmodifiableList((List<?>)this.o);
    }
    
    private final Map.Entry i(final int n) {
        try {
            this.k();
            final List h = this.h();
            if (n >= h.size()) {
                return null;
            }
            return (Map.Entry)h.get(n);
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    private final Map j() {
        final Map p = this.p;
        if (p != null) {
            return p;
        }
        final TreeMap treeMap = new TreeMap((Comparator<? super K>)String.CASE_INSENSITIVE_ORDER);
        for (final Map.Entry<Object, String> entry : this.h()) {
            final ArrayList list = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                list.addAll((Collection)treeMap.get(entry.getKey()));
            }
            list.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList((List<?>)list));
        }
        return this.p = Collections.unmodifiableMap((Map<?, ?>)treeMap);
    }
    
    private final void k() {
        final auep d = this.d;
        if (d != null) {
            d.b();
            if (this.n()) {
                this.d.close();
            }
        }
        if (!this.n) {
            this.m();
            this.a.a();
        }
        if (!this.n) {
            throw new IllegalStateException("No response.");
        }
        final IOException f = this.f;
        if (f != null) {
            throw f;
        }
        if (this.e != null) {
            return;
        }
        throw new NullPointerException("Response info is null when there is no exception.");
    }
    
    private final void l(final String s, final String s2, final boolean b) {
        if (!this.connected) {
            final int g = this.g(s);
            if (g >= 0) {
                if (!b) {
                    final StringBuilder sb = new StringBuilder("Cannot add multiple headers of the same key, ");
                    sb.append(s);
                    sb.append(". crbug.com/432719.");
                    throw new UnsupportedOperationException(sb.toString());
                }
                this.i.remove(g);
            }
            this.i.add(Pair.create((Object)s, (Object)s2));
            return;
        }
        throw new IllegalStateException("Cannot modify request property after connection is made.");
    }
    
    private final void m() {
        if (this.connected) {
            return;
        }
        final ExperimentalUrlRequest$Builder experimentalUrlRequest$Builder = (ExperimentalUrlRequest$Builder)this.h.newUrlRequestBuilder(this.getURL().toString(), (UrlRequest$Callback)new auel(this), (Executor)this.a);
        if (this.doOutput) {
            if (this.method.equals("GET")) {
                this.method = "POST";
            }
            final auep d = this.d;
            if (d != null) {
                experimentalUrlRequest$Builder.setUploadDataProvider(d.a(), (Executor)this.a);
                if (this.getRequestProperty("Content-Length") == null && !this.n()) {
                    this.addRequestProperty("Content-Length", Long.toString(this.d.a().getLength()));
                }
                this.d.c();
            }
            else if (this.getRequestProperty("Content-Length") == null) {
                this.addRequestProperty("Content-Length", "0");
            }
            if (this.getRequestProperty("Content-Type") == null) {
                this.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            }
        }
        for (final Pair pair : this.i) {
            experimentalUrlRequest$Builder.addHeader((String)pair.first, (String)pair.second);
        }
        if (!this.getUseCaches()) {
            experimentalUrlRequest$Builder.disableCache();
        }
        experimentalUrlRequest$Builder.setHttpMethod(this.method);
        Label_0294: {
            if (!this.j) {
                final int threadStatsTag = TrafficStats.getThreadStatsTag();
                if (threadStatsTag != -1) {
                    this.k = threadStatsTag;
                    this.j = true;
                }
                if (!this.j) {
                    break Label_0294;
                }
            }
            experimentalUrlRequest$Builder.setTrafficStatsTag(this.k);
        }
        Label_0350: {
            if (!this.l) {
                if (Build$VERSION.SDK_INT < 28) {
                    break Label_0350;
                }
                final int threadStatsUid = TrafficStats.getThreadStatsUid();
                if (threadStatsUid != -1) {
                    this.m = threadStatsUid;
                    this.l = true;
                }
                if (!this.l) {
                    break Label_0350;
                }
            }
            experimentalUrlRequest$Builder.setTrafficStatsUid(this.m);
        }
        (this.b = (UrlRequest)experimentalUrlRequest$Builder.build()).start();
        this.connected = true;
    }
    
    private final boolean n() {
        return this.chunkLength > 0;
    }
    
    @Override
    public final void addRequestProperty(final String s, final String s2) {
        this.l(s, s2, false);
    }
    
    public final void b(final int k) {
        if (!this.connected) {
            this.j = true;
            this.k = k;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
    }
    
    @Override
    public final void connect() {
        this.getOutputStream();
        this.m();
    }
    
    @Override
    public final void disconnect() {
        if (this.connected) {
            this.b.cancel();
        }
    }
    
    @Override
    public final InputStream getErrorStream() {
        InputStream c = null;
        try {
            this.k();
            if (this.e.getHttpStatusCode() >= 400) {
                c = this.c;
            }
            return c;
        }
        catch (final IOException ex) {
            return c;
        }
    }
    
    @Override
    public final String getHeaderField(final int n) {
        final Map.Entry i = this.i(n);
        if (i == null) {
            return null;
        }
        return i.getValue();
    }
    
    @Override
    public final String getHeaderField(final String s) {
        try {
            this.k();
            final Map j = this.j();
            if (!j.containsKey(s)) {
                return null;
            }
            final List list = j.get(s);
            return (String)list.get(list.size() - 1);
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    @Override
    public final String getHeaderFieldKey(final int n) {
        final Map.Entry i = this.i(n);
        if (i == null) {
            return null;
        }
        return i.getKey();
    }
    
    @Override
    public final Map getHeaderFields() {
        try {
            this.k();
            return this.j();
        }
        catch (final IOException ex) {
            return Collections.emptyMap();
        }
    }
    
    @Override
    public final InputStream getInputStream() {
        this.k();
        if (!this.instanceFollowRedirects && this.g) {
            throw new IOException("Cannot read response body of a redirect.");
        }
        if (this.e.getHttpStatusCode() < 400) {
            return this.c;
        }
        throw new FileNotFoundException(this.url.toString());
    }
    
    @Override
    public final OutputStream getOutputStream() {
        if (this.d == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            if (this.n()) {
                this.d = (auep)new auei(this.chunkLength, this.a);
                this.m();
            }
            else {
                long fixedContentLengthLong = this.fixedContentLength;
                if (this.fixedContentLengthLong != -1L) {
                    fixedContentLengthLong = this.fixedContentLengthLong;
                }
                if (fixedContentLengthLong != -1L) {
                    this.d = (auep)new auek(fixedContentLengthLong, this.a);
                    this.m();
                }
                else {
                    final String requestProperty = this.getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.d = (auep)new aueg();
                    }
                    else {
                        this.d = (auep)new aueg(Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.d;
    }
    
    @Override
    public final Map getRequestProperties() {
        if (!this.connected) {
            final TreeMap treeMap = new TreeMap((Comparator<? super K>)String.CASE_INSENSITIVE_ORDER);
            for (final Pair pair : this.i) {
                if (treeMap.containsKey(pair.first)) {
                    throw new IllegalStateException("Should not have multiple values.");
                }
                final ArrayList list = new ArrayList();
                list.add(pair.second);
                treeMap.put(pair.first, Collections.unmodifiableList((List<?>)list));
            }
            return Collections.unmodifiableMap((Map<?, ?>)treeMap);
        }
        throw new IllegalStateException("Cannot access request headers after connection is set.");
    }
    
    @Override
    public final String getRequestProperty(final String s) {
        final int g = this.g(s);
        if (g >= 0) {
            return (String)((Pair)this.i.get(g)).second;
        }
        return null;
    }
    
    @Override
    public final int getResponseCode() {
        this.k();
        return this.e.getHttpStatusCode();
    }
    
    @Override
    public final String getResponseMessage() {
        this.k();
        return this.e.getHttpStatusText();
    }
    
    @Override
    public final void setConnectTimeout(final int n) {
    }
    
    @Override
    public final void setRequestProperty(final String s, final String s2) {
        this.l(s, s2, true);
    }
    
    @Override
    public final boolean usingProxy() {
        return false;
    }
}
