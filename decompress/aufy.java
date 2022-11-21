import java.util.Map;
import java.io.File;
import org.chromium.net.CronetEngine$Builder$LibraryLoader;
import java.util.Iterator;
import android.util.Base64;
import java.util.HashMap;
import java.net.IDN;
import java.util.Date;
import java.util.Set;
import java.util.LinkedList;
import java.util.List;
import android.content.Context;
import java.util.regex.Pattern;
import org.chromium.net.ICronetEngineBuilder;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aufy extends ICronetEngineBuilder
{
    private static final Pattern n;
    public final Context a;
    public final List b;
    public final List c;
    public boolean d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public aufv j;
    public long k;
    public String l;
    public boolean m;
    private int o;
    
    static {
        n = Pattern.compile("^[0-9\\.]*$");
    }
    
    public aufy(final Context context) {
        this.b = new LinkedList();
        this.c = new LinkedList();
        this.o = 20;
        this.a = context.getApplicationContext();
        this.g = true;
        this.h = true;
        this.i = false;
        this.f(0, 0L);
        this.m = false;
        this.d = true;
    }
    
    public final int a() {
        return this.j.e;
    }
    
    public /* bridge */ ICronetEngineBuilder addPublicKeyPins(final String s, final Set set, final boolean b, final Date date) {
        this.d(s, set, b, date);
        return this;
    }
    
    public /* bridge */ ICronetEngineBuilder addQuicHint(final String s, final int n, final int n2) {
        this.e(s, n, n2);
        return this;
    }
    
    public final int b(final int n) {
        final int o = this.o;
        if (o == 20) {
            return n;
        }
        return o;
    }
    
    public auhm c() {
        return null;
    }
    
    public final void d(String s, final Set set, final boolean b, final Date date) {
        if (s == null) {
            throw new NullPointerException("The hostname cannot be null");
        }
        if (set == null) {
            throw new NullPointerException("The set of SHA256 pins cannot be null");
        }
        if (date == null) {
            throw new NullPointerException("The pin expiration date cannot be null");
        }
        if (!aufy.n.matcher(s).matches()) {
            if (s.length() <= 255) {
                try {
                    final String ascii = IDN.toASCII(s, 2);
                    s = (String)new HashMap();
                    for (final byte[] array : set) {
                        if (array == null || array.length != 32) {
                            throw new IllegalArgumentException("Public key pin is invalid");
                        }
                        ((Map<String, byte[]>)s).put(Base64.encodeToString(array, 0), array);
                    }
                    this.c.add(new aufw(ascii, ((Map<K, Object>)s).values().toArray(new byte[((Map)s).size()][]), b, date));
                    return;
                }
                catch (final IllegalArgumentException ex) {
                    final StringBuilder sb = new StringBuilder("Hostname ");
                    sb.append(s);
                    sb.append(" is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            final StringBuilder sb2 = new StringBuilder("Hostname ");
            sb2.append(s);
            sb2.append(" is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
            throw new IllegalArgumentException(sb2.toString());
        }
        final StringBuilder sb3 = new StringBuilder("Hostname ");
        sb3.append(s);
        sb3.append(" is illegal. A hostname should not consist of digits and/or dots only.");
        throw new IllegalArgumentException(sb3.toString());
    }
    
    public final void e(final String s, final int n, final int n2) {
        if (!s.contains("/")) {
            this.b.add(new aufx(s, n, n2));
            return;
        }
        throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(String.valueOf(s)));
    }
    
    public ICronetEngineBuilder enableBrotli(final boolean i) {
        this.i = i;
        return this;
    }
    
    public ICronetEngineBuilder enableHttp2(final boolean h) {
        this.h = h;
        return this;
    }
    
    public /* bridge */ ICronetEngineBuilder enableHttpCache(final int n, final long n2) {
        this.f(n, n2);
        return this;
    }
    
    public ICronetEngineBuilder enableNetworkQualityEstimator(final boolean m) {
        this.m = m;
        return this;
    }
    
    public ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(final boolean d) {
        this.d = d;
        return this;
    }
    
    public ICronetEngineBuilder enableQuic(final boolean g) {
        this.g = g;
        return this;
    }
    
    public /* bridge */ ICronetEngineBuilder enableSdch(final boolean b) {
        return this;
    }
    
    public final void f(final int n, final long k) {
        final aufv a = aufv.a(n);
        if (a.e == 1 && this.f == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.j = a;
        this.k = k;
    }
    
    public void g(final CronetEngine$Builder$LibraryLoader cronetEngine$Builder$LibraryLoader) {
    }
    
    public final String getDefaultUserAgent() {
        return auhk.a(this.a);
    }
    
    public final void h(final String f) {
        if (new File(f).isDirectory()) {
            this.f = f;
            return;
        }
        throw new IllegalArgumentException("Storage path must be set to existing directory");
    }
    
    public final void i(final int o) {
        if (o <= 19 && o >= -20) {
            this.o = o;
            return;
        }
        throw new IllegalArgumentException("Thread priority invalid");
    }
    
    public ICronetEngineBuilder setExperimentalOptions(final String l) {
        this.l = l;
        return this;
    }
    
    public /* bridge */ ICronetEngineBuilder setLibraryLoader(final CronetEngine$Builder$LibraryLoader cronetEngine$Builder$LibraryLoader) {
        this.g(cronetEngine$Builder$LibraryLoader);
        return this;
    }
    
    public /* bridge */ ICronetEngineBuilder setStoragePath(final String s) {
        this.h(s);
        return this;
    }
    
    public /* bridge */ ICronetEngineBuilder setThreadPriority(final int n) {
        this.i(n);
        return this;
    }
    
    public ICronetEngineBuilder setUserAgent(final String e) {
        this.e = e;
        return this;
    }
}
