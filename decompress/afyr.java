import java.util.Iterator;
import java.util.Set;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

final class afyr
{
    private static final Logger a;
    private final ConcurrentMap b;
    
    static {
        a = Logger.getLogger(afyr.class.getName());
    }
    
    public afyr() {
        this.b = (ConcurrentMap)new ConcurrentHashMap();
    }
    
    public afyr(final afyr afyr) {
        this.b = (ConcurrentMap)new ConcurrentHashMap((Map)afyr.b);
    }
    
    private static afyq g(final agcc agcc) {
        return new afyo(agcc, 0);
    }
    
    private final void h(final afyq afyq, final boolean b) {
        synchronized (this) {
            final String e = afyq.b().e();
            final afyq afyq2 = (afyq)this.b.get(e);
            if (afyq2 != null && !afyq2.c().equals(afyq.c())) {
                afyr.a.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(e));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", e, afyq2.c().getName(), afyq.c().getName()));
            }
            if (!b) {
                this.b.putIfAbsent(e, afyq);
                return;
            }
            this.b.put(e, afyq);
        }
    }
    
    public final afym a(String name, final Class clazz) {
        final afyq b = this.b(name);
        if (b.e().contains(clazz)) {
            return b.a(clazz);
        }
        name = clazz.getName();
        final String value = String.valueOf(b.c());
        final Set e = b.e();
        final StringBuilder sb = new StringBuilder();
        final Iterator iterator = e.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Class clazz2 = (Class)iterator.next();
            if (n == 0) {
                sb.append(", ");
            }
            sb.append(clazz2.getCanonicalName());
            n = 0;
        }
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder("Primitive type ");
        sb2.append(name);
        sb2.append(" not supported by key manager of type ");
        sb2.append(value);
        sb2.append(", supported primitives: ");
        sb2.append(string);
        throw new GeneralSecurityException(sb2.toString());
    }
    
    public final afyq b(String value) {
        synchronized (this) {
            if (this.b.containsKey(value)) {
                return (afyq)this.b.get(value);
            }
            value = String.valueOf(value);
            throw new GeneralSecurityException("No key manager found for key type ".concat(value));
        }
    }
    
    final void c(final agcj agcj, final agcc agcc) {
        synchronized (this) {
            if (!aewr.C(agcj.f())) {
                final String value = String.valueOf(agcj.getClass());
                final StringBuilder sb = new StringBuilder("failed to register key manager ");
                sb.append(value);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            }
            if (aewr.C(agcc.f())) {
                final String d = agcj.d();
                final String d2 = agcc.d();
                if (this.b.containsKey(d) && ((afyq)this.b.get(d)).d() != null) {
                    final Class d3 = ((afyq)this.b.get(d)).d();
                    if (d3 != null) {
                        if (!d3.getName().equals(agcc.getClass().getName())) {
                            final Logger a = afyr.a;
                            final Level warning = Level.WARNING;
                            final StringBuilder sb2 = new StringBuilder("Attempted overwrite of a registered key manager for key type ");
                            sb2.append(d);
                            sb2.append(" with inconsistent public key type ");
                            sb2.append(d2);
                            a.logp(warning, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", sb2.toString());
                            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", agcj.getClass().getName(), d3.getName(), agcc.getClass().getName()));
                        }
                    }
                }
                this.h(new afyp(agcj, agcc), true);
                this.h(g(agcc), false);
                return;
            }
            final String value2 = String.valueOf(agcc.getClass());
            final StringBuilder sb3 = new StringBuilder("failed to register key manager ");
            sb3.append(value2);
            sb3.append(" as it is not FIPS compatible.");
            throw new GeneralSecurityException(sb3.toString());
        }
    }
    
    final void d(final afym afym) {
        synchronized (this) {
            if (aewr.C(1)) {
                this.h(new afyo(afym, 1), false);
                return;
            }
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
    }
    
    final void e(final agcc agcc) {
        synchronized (this) {
            if (aewr.C(agcc.f())) {
                this.h(g(agcc), false);
                return;
            }
            final String value = String.valueOf(agcc.getClass());
            final StringBuilder sb = new StringBuilder("failed to register key manager ");
            sb.append(value);
            sb.append(" as it is not FIPS compatible.");
            throw new GeneralSecurityException(sb.toString());
        }
    }
    
    final boolean f(final String s) {
        return this.b.containsKey(s);
    }
}
