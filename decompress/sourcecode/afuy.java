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

final class afuy
{
    private static final Logger a;
    private final ConcurrentMap b;
    
    static {
        a = Logger.getLogger(afuy.class.getName());
    }
    
    public afuy() {
        this.b = (ConcurrentMap)new ConcurrentHashMap();
    }
    
    public afuy(final afuy afuy) {
        this.b = (ConcurrentMap)new ConcurrentHashMap((Map)afuy.b);
    }
    
    private static afux g(final afyj afyj) {
        return new afuv(afyj, 0);
    }
    
    private final void h(final afux afux, final boolean b) {
        synchronized (this) {
            final String e = afux.b().e();
            final afux afux2 = (afux)this.b.get(e);
            if (afux2 != null && !afux2.c().equals(afux.c())) {
                afuy.a.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(e));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", e, afux2.c().getName(), afux.c().getName()));
            }
            if (!b) {
                this.b.putIfAbsent(e, afux);
                return;
            }
            this.b.put(e, afux);
        }
    }
    
    public final afut a(String value, final Class clazz) {
        final afux b = this.b(value);
        if (b.e().contains(clazz)) {
            return b.a(clazz);
        }
        final String name = clazz.getName();
        value = String.valueOf(b.c());
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
    
    public final afux b(final String s) {
        synchronized (this) {
            if (this.b.containsKey(s)) {
                return (afux)this.b.get(s);
            }
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(s)));
        }
    }
    
    final void c(final afyq afyq, final afyj afyj) {
        synchronized (this) {
            final int f = afyj.f();
            if (!aesy.ao(((afyj)afyq).f())) {
                final String value = String.valueOf(afyq.getClass());
                final StringBuilder sb = new StringBuilder("failed to register key manager ");
                sb.append(value);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            }
            if (aesy.ao(f)) {
                final String d = afyq.d();
                final String d2 = afyj.d();
                if (this.b.containsKey(d) && ((afux)this.b.get(d)).d() != null) {
                    final Class d3 = ((afux)this.b.get(d)).d();
                    if (d3 != null) {
                        if (!d3.getName().equals(afyj.getClass().getName())) {
                            final Logger a = afuy.a;
                            final Level warning = Level.WARNING;
                            final StringBuilder sb2 = new StringBuilder("Attempted overwrite of a registered key manager for key type ");
                            sb2.append(d);
                            sb2.append(" with inconsistent public key type ");
                            sb2.append(d2);
                            a.logp(warning, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", sb2.toString());
                            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", afyq.getClass().getName(), d3.getName(), afyj.getClass().getName()));
                        }
                    }
                }
                this.h(new afuw(afyq, afyj), true);
                this.h(g(afyj), false);
                return;
            }
            final String value2 = String.valueOf(afyj.getClass());
            final StringBuilder sb3 = new StringBuilder("failed to register key manager ");
            sb3.append(value2);
            sb3.append(" as it is not FIPS compatible.");
            throw new GeneralSecurityException(sb3.toString());
        }
    }
    
    final void d(final afut afut) {
        synchronized (this) {
            if (aesy.ao(1)) {
                this.h(new afuv(afut, 1), false);
                return;
            }
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
    }
    
    final void e(final afyj afyj) {
        synchronized (this) {
            if (aesy.ao(afyj.f())) {
                this.h(g(afyj), false);
                return;
            }
            final String value = String.valueOf(afyj.getClass());
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
