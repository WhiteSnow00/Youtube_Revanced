import java.util.Iterator;
import java.util.logging.Level;
import java.util.Collections;
import java.util.Map;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.util.Locale;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import java.util.concurrent.ConcurrentMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzd
{
    public static final ConcurrentMap a;
    private static final Logger b;
    private static final AtomicReference c;
    private static final ConcurrentMap d;
    private static final ConcurrentMap e;
    private static final ConcurrentMap f;
    private static final ConcurrentMap g;
    
    static {
        b = Logger.getLogger(afzd.class.getName());
        c = new AtomicReference((V)new afyr());
        d = (ConcurrentMap)new ConcurrentHashMap();
        e = (ConcurrentMap)new ConcurrentHashMap();
        f = (ConcurrentMap)new ConcurrentHashMap();
        a = (ConcurrentMap)new ConcurrentHashMap();
        g = (ConcurrentMap)new ConcurrentHashMap();
    }
    
    private afzd() {
    }
    
    @Deprecated
    public static afyg a(final String s) {
        if (s == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        final afyg afyg = (afyg)afzd.f.get(s.toLowerCase(Locale.US));
        if (afyg == null) {
            String s3;
            final String s2 = s3 = String.format("no catalogue found for %s. ", s);
            if (s.toLowerCase(Locale.US).startsWith("tinkaead")) {
                s3 = String.valueOf(s2).concat("Maybe call AeadConfig.register().");
            }
            String s4;
            if (!s.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
                if (!s.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
                    if (!s.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") && !s.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
                        if (!s.toLowerCase(Locale.US).startsWith("tinkmac")) {
                            if (!s.toLowerCase(Locale.US).startsWith("tinkpublickeysign") && !s.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
                                s4 = s3;
                                if (s.toLowerCase(Locale.US).startsWith("tink")) {
                                    s4 = String.valueOf(s3).concat("Maybe call TinkConfig.register().");
                                }
                            }
                            else {
                                s4 = String.valueOf(s3).concat("Maybe call SignatureConfig.register().");
                            }
                        }
                        else {
                            s4 = String.valueOf(s3).concat("Maybe call MacConfig.register().");
                        }
                    }
                    else {
                        s4 = String.valueOf(s3).concat("Maybe call HybridConfig.register().");
                    }
                }
                else {
                    s4 = String.valueOf(s3).concat("Maybe call StreamingAeadConfig.register().");
                }
            }
            else {
                s4 = String.valueOf(s3).concat("Maybe call DeterministicAeadConfig.register().");
            }
            throw new GeneralSecurityException(s4);
        }
        return afyg;
    }
    
    public static afym b(final String s) {
        return afzd.c.get().b(s).b();
    }
    
    public static MessageLite c(final agfd agfd) {
        synchronized (afzd.class) {
            final afym b = b(agfd.b);
            if (afzd.e.get(agfd.b)) {
                return b.a(agfd.c);
            }
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(agfd.b)));
        }
    }
    
    public static Object d(final agfc agfc, final Class clazz) {
        return e(agfc.b, agfc.c, clazz);
    }
    
    public static Object e(final String s, final ahbt ahbt, final Class clazz) {
        return afzd.c.get().a(s, clazz).c(ahbt);
    }
    
    public static Object f(final String s, final MessageLite messageLite, final Class clazz) {
        return afzd.c.get().a(s, clazz).d(messageLite);
    }
    
    public static Object g(final String s, final byte[] array, final Class clazz) {
        return e(s, ahbt.x(array), clazz);
    }
    
    public static Map h() {
        synchronized (afzd.class) {
            return Collections.unmodifiableMap((Map<?, ?>)afzd.g);
        }
    }
    
    public static void i(final afym afym, final boolean b) {
        monitorenter(afzd.class);
        if (afym != null) {
            Label_0104: {
                try {
                    final AtomicReference c = afzd.c;
                    final afyr afyr = new afyr(c.get());
                    afyr.d(afym);
                    if (aewr.C(1)) {
                        final String e = afym.e();
                        n(e, Collections.emptyMap(), b);
                        afzd.e.put(e, b);
                        c.set(afyr);
                        monitorexit(afzd.class);
                        return;
                    }
                    throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                }
                finally {
                    break Label_0104;
                }
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            monitorexit(afzd.class);
        }
        throw new IllegalArgumentException("key manager must be non-null.");
    }
    
    public static void j(final afza afza) {
        monitorenter(afzd.class);
        if (afza != null) {
            Label_0164: {
                try {
                    final Class b = afza.b();
                    final ConcurrentMap a = afzd.a;
                    if (a.containsKey(b)) {
                        final afza afza2 = (afza)a.get(b);
                        if (!afza.getClass().getName().equals(afza2.getClass().getName())) {
                            afzd.b.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(b.toString()));
                            throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", b.getName(), afza2.getClass().getName(), afza.getClass().getName()));
                        }
                    }
                    a.put(b, afza);
                    monitorexit(afzd.class);
                    return;
                }
                finally {
                    break Label_0164;
                }
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            monitorexit(afzd.class);
        }
        throw new IllegalArgumentException("wrapper must be non-null");
    }
    
    public static void k(final agfd agfd) {
        synchronized (afzd.class) {
            final afym b = b(agfd.b);
            if (afzd.e.get(agfd.b)) {
                b.f(agfd.c);
                return;
            }
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(agfd.b)));
        }
    }
    
    public static void l(final agcj agcj, final agcc agcc) {
        synchronized (afzd.class) {
            final AtomicReference c = afzd.c;
            final afyr afyr = new afyr(c.get());
            afyr.c(agcj, agcc);
            final Map c2 = agcj.a().c();
            final String d = agcj.d();
            n(d, c2, true);
            final String d2 = agcc.d();
            n(d2, Collections.emptyMap(), false);
            if (!c.get().f(d)) {
                afzd.d.put(d, p());
                o(agcj.d(), agcj.a().c());
            }
            final ConcurrentMap e = afzd.e;
            e.put(d, true);
            e.put(d2, false);
            c.set(afyr);
        }
    }
    
    public static void m(final agcc agcc) {
        synchronized (afzd.class) {
            final AtomicReference c = afzd.c;
            final afyr afyr = new afyr(c.get());
            afyr.e(agcc);
            final Map c2 = agcc.a().c();
            final String d = agcc.d();
            n(d, c2, true);
            if (!c.get().f(d)) {
                afzd.d.put(d, p());
                o(d, agcc.a().c());
            }
            afzd.e.put(d, true);
            c.set(afyr);
        }
    }
    
    private static void n(String concat, final Map map, final boolean b) {
        monitorenter(afzd.class);
        Label_0278: {
            if (b) {
                try {
                    final ConcurrentMap e = afzd.e;
                    if (e.containsKey(concat) && !(boolean)e.get(concat)) {
                        concat = "New keys are already disallowed for key type ".concat(concat);
                        throw new GeneralSecurityException(concat);
                    }
                    if (afzd.c.get().f(concat)) {
                        Label_0126: {
                            for (final Map.Entry<Object, V> entry : map.entrySet()) {
                                if (afzd.g.containsKey(entry.getKey())) {
                                    continue;
                                }
                                break Label_0126;
                            }
                            break Label_0278;
                        }
                        final Map.Entry<Object, V> entry;
                        final String s = entry.getKey();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Attempted to register a new key template ");
                        sb.append(s);
                        sb.append(" from an existing key manager of type ");
                        sb.append(concat);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    for (final Map.Entry<Object, V> entry2 : map.entrySet()) {
                        if (!afzd.g.containsKey(entry2.getKey())) {
                            continue;
                        }
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf(entry2.getKey())));
                    }
                }
                finally {
                    monitorexit(afzd.class);
                }
            }
        }
        monitorexit(afzd.class);
    }
    
    private static void o(final String b, final Map map) {
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final ConcurrentMap g = afzd.g;
            final String s = entry.getKey();
            final byte[] byteArray = ((MessageLite)((arjd)entry.getValue()).b).toByteArray();
            int a = ((arjd)entry.getValue()).a;
            final ahcr builder = ((ahcz)agfd.a).createBuilder();
            builder.copyOnWrite();
            ((agfd)builder.instance).b = b;
            final ahbt x = ahbt.x(byteArray);
            builder.copyOnWrite();
            ((agfd)builder.instance).c = x;
            agfn agfn;
            if (--a != 0) {
                if (a != 1) {
                    agfn = agfn.d;
                }
                else {
                    agfn = agfn.c;
                }
            }
            else {
                agfn = agfn.b;
            }
            builder.copyOnWrite();
            ((agfd)builder.instance).d = agfn.getNumber();
            g.put(s, new agpb((agfd)builder.build()));
        }
    }
    
    private static aewr p() {
        return new aewr();
    }
}
