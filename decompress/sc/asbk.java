import java.net.UnknownHostException;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import java.net.URI;
import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Random;
import java.util.Set;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asbk extends arwu
{
    public static final Logger a;
    public static final Set b;
    static final boolean c;
    static final boolean d;
    protected static final boolean e;
    public static final asbj f;
    private static final String s;
    private static final String t;
    private static final String u;
    private static String v;
    private final boolean A;
    private ateg B;
    final arxc g;
    public final Random h;
    protected volatile asbd i;
    public final AtomicReference j;
    public final String k;
    public final int l;
    public final long m;
    public final arxk n;
    public final afam o;
    protected boolean p;
    public final arwt q;
    public boolean r;
    private final String w;
    private final asfo x;
    private boolean y;
    private Executor z;
    
    static {
        final Logger logger = a = Logger.getLogger(asbk.class.getName());
        b = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        final String s2 = s = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        final String s3 = t = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        final String s4 = u = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        c = Boolean.parseBoolean(s2);
        d = Boolean.parseBoolean(s3);
        e = Boolean.parseBoolean(s4);
        final ClassLoader classLoader = asbk.class.getClassLoader();
        asbj f2 = null;
        Label_0265: {
            try {
                final Class<? extends asbj> subclass = Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, classLoader).asSubclass(asbj.class);
                try {
                    final Constructor<? extends asbj> constructor = subclass.getConstructor((Class<?>[])new Class[0]);
                    try {
                        final asbj asbj = (asbj)constructor.newInstance(new Object[0]);
                        if (asbj.b() != null) {
                            logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", asbj.b());
                            break Label_0265;
                        }
                        f2 = asbj;
                    }
                    catch (final Exception ex) {
                        asbk.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", ex);
                    }
                }
                catch (final Exception ex2) {
                    asbk.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", ex2);
                }
            }
            catch (final ClassCastException ex3) {
                asbk.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", ex3);
            }
            catch (final ClassNotFoundException ex4) {
                asbk.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", ex4);
            }
        }
        f = f2;
    }
    
    protected asbk(String w, final arwp arwp, final asfo x, final afam o, final boolean b) {
        this.h = new Random();
        this.i = (asbd)asbf.a;
        this.j = new AtomicReference();
        arwp.getClass();
        this.x = x;
        w.getClass();
        final URI create = URI.create("//".concat(w));
        final String host = create.getHost();
        final boolean b2 = true;
        adkp.M(host != null, "Invalid DNS name: %s", (Object)w);
        w = create.getAuthority();
        w.getClass();
        this.w = w;
        this.k = create.getHost();
        if (create.getPort() == -1) {
            this.l = arwp.a;
        }
        else {
            this.l = create.getPort();
        }
        this.g = arwp.b;
        long m = 0L;
        if (!b) {
            w = System.getProperty("networkaddress.cache.ttl");
            final long n = m = 30L;
            if (w != null) {
                try {
                    m = Long.parseLong(w);
                }
                catch (final NumberFormatException ex) {
                    asbk.a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[] { "networkaddress.cache.ttl", w, 30L });
                    m = n;
                }
            }
            if (m > 0L) {
                m = TimeUnit.SECONDS.toNanos(m);
            }
        }
        this.m = m;
        this.o = o;
        this.n = arwp.c;
        final Executor e = arwp.e;
        this.z = e;
        this.A = (e == null && b2);
        this.q = arwp.d;
    }
    
    public static String e() {
        if (asbk.v == null) {
            try {
                asbk.v = InetAddress.getLocalHost().getHostName();
            }
            catch (final UnknownHostException ex) {
                throw new RuntimeException(ex);
            }
        }
        return asbk.v;
    }
    
    private final void f() {
        if (!this.r && !this.y) {
            if (this.p) {
                final long m = this.m;
                if (m != 0L && (m <= 0L || this.o.a(TimeUnit.NANOSECONDS) <= this.m)) {
                    return;
                }
            }
            this.r = true;
            this.z.execute((Runnable)new asbh(this, this.B, (byte[])null));
        }
    }
    
    public final String a() {
        return this.w;
    }
    
    public final void b() {
        adkp.R(this.B != null, (Object)"not started");
        this.f();
    }
    
    public final void c() {
        if (this.y) {
            return;
        }
        this.y = true;
        final Executor z = this.z;
        if (z != null && this.A) {
            asfp.d(this.x, z);
            this.z = null;
        }
    }
    
    public final void d(final ateg b) {
        adkp.R(this.B == null, (Object)"already started");
        if (this.A) {
            this.z = (Executor)asfp.a(this.x);
        }
        this.B = b;
        this.f();
    }
}
