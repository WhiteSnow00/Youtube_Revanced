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

public final class afvl
{
    public static final ConcurrentMap a;
    private static final Logger b;
    private static final AtomicReference c;
    private static final ConcurrentMap d;
    private static final ConcurrentMap e;
    private static final ConcurrentMap f;
    private static final ConcurrentMap g;
    
    static {
        b = Logger.getLogger(afvl.class.getName());
        c = new AtomicReference((V)new afuy());
        d = (ConcurrentMap)new ConcurrentHashMap();
        e = (ConcurrentMap)new ConcurrentHashMap();
        f = (ConcurrentMap)new ConcurrentHashMap();
        a = (ConcurrentMap)new ConcurrentHashMap();
        g = (ConcurrentMap)new ConcurrentHashMap();
    }
    
    private afvl() {
    }
    
    @Deprecated
    public static afun a(final String s) {
        if (s == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        final afun afun = (afun)afvl.f.get(s.toLowerCase(Locale.US));
        if (afun == null) {
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
        return afun;
    }
    
    public static afut b(final String s) {
        return afvl.c.get().b(s).b();
    }
    
    public static MessageLite c(final agbk agbk) {
        synchronized (afvl.class) {
            final afut b = b(agbk.b);
            if (afvl.e.get(agbk.b)) {
                return b.a(agbk.c);
            }
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(agbk.b)));
        }
    }
    
    public static Object d(final agbj agbj, final Class clazz) {
        return e(agbj.b, agbj.c, clazz);
    }
    
    public static Object e(final String s, final agyc agyc, final Class clazz) {
        return afvl.c.get().a(s, clazz).c(agyc);
    }
    
    public static Object f(final String s, final MessageLite messageLite, final Class clazz) {
        return afvl.c.get().a(s, clazz).d(messageLite);
    }
    
    public static Object g(final String s, final byte[] array, final Class clazz) {
        return e(s, agyc.x(array), clazz);
    }
    
    static Map h() {
        synchronized (afvl.class) {
            return Collections.unmodifiableMap((Map<?, ?>)afvl.g);
        }
    }
    
    public static void i(final afut afut, final boolean b) {
        monitorenter(afvl.class);
        if (afut != null) {
            Label_0104: {
                try {
                    final AtomicReference c = afvl.c;
                    final afuy afuy = new afuy(c.get());
                    afuy.d(afut);
                    if (aesy.ao(1)) {
                        final String e = afut.e();
                        n(e, Collections.emptyMap(), b);
                        afvl.e.put(e, b);
                        c.set(afuy);
                        monitorexit(afvl.class);
                        return;
                    }
                    throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                }
                finally {
                    break Label_0104;
                }
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            monitorexit(afvl.class);
        }
        throw new IllegalArgumentException("key manager must be non-null.");
    }
    
    public static void j(final afvi afvi) {
        monitorenter(afvl.class);
        if (afvi != null) {
            Label_0164: {
                try {
                    final Class b = afvi.b();
                    final ConcurrentMap a = afvl.a;
                    if (a.containsKey(b)) {
                        final afvi afvi2 = (afvi)a.get(b);
                        if (!afvi.getClass().getName().equals(afvi2.getClass().getName())) {
                            afvl.b.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(b.toString()));
                            throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", b.getName(), afvi2.getClass().getName(), afvi.getClass().getName()));
                        }
                    }
                    a.put(b, afvi);
                    monitorexit(afvl.class);
                    return;
                }
                finally {
                    break Label_0164;
                }
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            monitorexit(afvl.class);
        }
        throw new IllegalArgumentException("wrapper must be non-null");
    }
    
    public static void k(final agbk agbk) {
        synchronized (afvl.class) {
            final afut b = b(agbk.b);
            if (afvl.e.get(agbk.b)) {
                b.f(agbk.c);
                return;
            }
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(agbk.b)));
        }
    }
    
    public static void l(final afyq afyq, final afyj afyj) {
        synchronized (afvl.class) {
            final AtomicReference c = afvl.c;
            final afuy afuy = new afuy(c.get());
            afuy.c(afyq, afyj);
            final String d = afyq.d();
            final String d2 = afyj.d();
            n(d, ((afyj)afyq).a().c(), true);
            n(d2, Collections.emptyMap(), false);
            if (!c.get().f(d)) {
                afvl.d.put(d, p());
                o(afyq.d(), ((afyj)afyq).a().c());
            }
            final ConcurrentMap e = afvl.e;
            e.put(d, true);
            e.put(d2, false);
            c.set(afuy);
        }
    }
    
    public static void m(final afyj afyj) {
        synchronized (afvl.class) {
            final AtomicReference c = afvl.c;
            final afuy afuy = new afuy(c.get());
            afuy.e(afyj);
            final String d = afyj.d();
            n(d, afyj.a().c(), true);
            if (!c.get().f(d)) {
                afvl.d.put(d, p());
                o(d, afyj.a().c());
            }
            afvl.e.put(d, true);
            c.set(afuy);
        }
    }
    
    private static void n(final String s, final Map map, final boolean b) {
        monitorenter(afvl.class);
        Label_0271: {
            if (b) {
                try {
                    final ConcurrentMap e = afvl.e;
                    if (e.containsKey(s) && !(boolean)e.get(s)) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(s));
                    }
                    if (afvl.c.get().f(s)) {
                        Label_0124: {
                            for (final Map.Entry<Object, V> entry : map.entrySet()) {
                                if (afvl.g.containsKey(entry.getKey())) {
                                    continue;
                                }
                                break Label_0124;
                            }
                            break Label_0271;
                        }
                        final Map.Entry<Object, V> entry;
                        final String s2 = entry.getKey();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Attempted to register a new key template ");
                        sb.append(s2);
                        sb.append(" from an existing key manager of type ");
                        sb.append(s);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    for (final Map.Entry<Object, V> entry2 : map.entrySet()) {
                        if (!afvl.g.containsKey(entry2.getKey())) {
                            continue;
                        }
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf(entry2.getKey())));
                    }
                }
                finally {
                    monitorexit(afvl.class);
                }
            }
        }
        monitorexit(afvl.class);
    }
    
    private static void o(final String b, final Map map) {
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final ConcurrentMap g = afvl.g;
            final String s = entry.getKey();
            final byte[] byteArray = ((MessageLite)((ardu)entry.getValue()).b).toByteArray();
            int a = ((ardu)entry.getValue()).a;
            final agza builder = agbk.a.createBuilder();
            builder.copyOnWrite();
            ((agbk)builder.instance).b = b;
            final agyc x = agyc.x(byteArray);
            builder.copyOnWrite();
            ((agbk)builder.instance).c = x;
            agbu agbu;
            if (--a != 0) {
                if (a != 1) {
                    agbu = agbu.d;
                }
                else {
                    agbu = agbu.c;
                }
            }
            else {
                agbu = agbu.b;
            }
            builder.copyOnWrite();
            ((agbk)builder.instance).d = agbu.getNumber();
            g.put(s, new agli((agbk)builder.build()));
        }
    }
    
    private static aesy p() {
        return new aesy();
    }
}
