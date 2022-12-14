import java.util.Locale;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import org.chromium.net.UrlResponseInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auhj extends UrlResponseInfo
{
    public final int a;
    public final boolean b;
    public final String c;
    private final List d;
    private final String e;
    private final String f;
    private final AtomicLong g;
    private final auhi h;
    
    public auhj(final List list, final int a, final String e, final List list2, final boolean b, final String c, final String f, final long n) {
        this.d = Collections.unmodifiableList((List<?>)list);
        this.a = a;
        this.e = e;
        this.h = new auhi(Collections.unmodifiableList((List<?>)list2));
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = new AtomicLong(n);
    }
    
    public final void a(final long n) {
        this.g.set(n);
    }
    
    public final Map getAllHeaders() {
        final auhi h = this.h;
        Map map = h.b;
        if (map == null) {
            final TreeMap treeMap = new TreeMap((Comparator<? super K>)String.CASE_INSENSITIVE_ORDER);
            for (final Map.Entry<Object, String> entry : h.a) {
                final ArrayList list = new ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    list.addAll((Collection)treeMap.get(entry.getKey()));
                }
                list.add(entry.getValue());
                treeMap.put(entry.getKey(), Collections.unmodifiableList((List<?>)list));
            }
            h.b = Collections.unmodifiableMap((Map<?, ?>)treeMap);
            map = h.b;
        }
        return map;
    }
    
    public final List getAllHeadersAsList() {
        return this.h.a;
    }
    
    public final int getHttpStatusCode() {
        return this.a;
    }
    
    public final String getHttpStatusText() {
        return this.e;
    }
    
    public final String getNegotiatedProtocol() {
        return this.c;
    }
    
    public final String getProxyServer() {
        return this.f;
    }
    
    public final long getReceivedByteCount() {
        return this.g.get();
    }
    
    public final String getUrl() {
        final List d = this.d;
        return (String)d.get(d.size() - 1);
    }
    
    public final List getUrlChain() {
        return this.d;
    }
    
    public final String toString() {
        return String.format(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", Integer.toHexString(System.identityHashCode(this)), this.getUrl(), this.d.toString(), this.a, this.e, this.getAllHeadersAsList().toString(), this.b, this.c, this.f, this.getReceivedByteCount());
    }
    
    public final boolean wasCached() {
        return this.b;
    }
}
