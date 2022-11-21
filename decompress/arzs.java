import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arzs
{
    private static final Logger c;
    private static arzs d;
    public final arzl a;
    public String b;
    private final LinkedHashSet e;
    private afgm f;
    
    static {
        c = Logger.getLogger(arzs.class.getName());
    }
    
    public arzs() {
        this.a = (arzl)new arzq(this);
        this.b = "unknown";
        this.e = new LinkedHashSet();
        this.f = afkc.b;
    }
    
    public static arzs a() {
        monitorenter(arzs.class);
        try {
            if (arzs.d == null) {
                final ArrayList<Class<?>> list = new ArrayList<Class<?>>();
                try {
                    list.add(Class.forName("aseg"));
                }
                catch (final ClassNotFoundException ex) {
                    arzs.c.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", ex);
                }
                final List i = arxu.i(arzp.class, Collections.unmodifiableList((List<?>)list), arzp.class.getClassLoader(), (arzy)new arzr(0));
                if (i.isEmpty()) {
                    arzs.c.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                arzs.d = new arzs();
                for (final arzp arzp : i) {
                    arzs.c.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(arzp))));
                    arzp.c();
                    arzs.d.c(arzp);
                }
                arzs.d.d();
            }
            final arzs d = arzs.d;
            monitorexit(arzs.class);
            return d;
        }
        finally {
            monitorexit(arzs.class);
            while (true) {}
        }
    }
    
    private final void c(final arzp arzp) {
        synchronized (this) {
            arzp.c();
            adme.L(true, "isAvailable() returned false");
            this.e.add(arzp);
        }
    }
    
    private final void d() {
        monitorenter(this);
        try {
            final HashMap hashMap = new HashMap();
            final Iterator iterator = this.e.iterator();
            String b = "unknown";
            int n = Integer.MIN_VALUE;
            while (iterator.hasNext()) {
                final arzp arzp = (arzp)iterator.next();
                final String b2 = arzp.b();
                if (hashMap.get(b2) != null) {
                    arzp.d();
                }
                else {
                    hashMap.put(b2, arzp);
                }
                arzp.d();
                if (n < 5) {
                    arzp.d();
                    b = arzp.b();
                }
                n = 5;
            }
            this.f = afgm.k(hashMap);
            this.b = b;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final Map b() {
        synchronized (this) {
            return this.f;
        }
    }
}
