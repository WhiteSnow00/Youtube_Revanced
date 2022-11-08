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

public final class aruu
{
    private static final Logger c;
    private static aruu d;
    public final arun a;
    public String b;
    private final LinkedHashSet e;
    private afcw f;
    
    static {
        c = Logger.getLogger(aruu.class.getName());
    }
    
    public aruu() {
        this.a = (arun)new arus(this);
        this.b = "unknown";
        this.e = new LinkedHashSet();
        this.f = afgm.b;
    }
    
    public static aruu a() {
        monitorenter(aruu.class);
        try {
            if (aruu.d == null) {
                final ArrayList<Class<?>> list = new ArrayList<Class<?>>();
                try {
                    list.add(Class.forName("asac"));
                }
                catch (final ClassNotFoundException ex) {
                    aruu.c.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", ex);
                }
                final List q = arxi.q((Class)arur.class, (Iterable)Collections.unmodifiableList((List<?>)list), arur.class.getClassLoader(), (arvi)new arut(0));
                if (q.isEmpty()) {
                    aruu.c.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                aruu.d = new aruu();
                for (final arur arur : q) {
                    aruu.c.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(arur))));
                    arur.c();
                    aruu.d.c(arur);
                }
                aruu.d.d();
            }
            final aruu d = aruu.d;
            monitorexit(aruu.class);
            return d;
        }
        finally {
            monitorexit(aruu.class);
            while (true) {}
        }
    }
    
    private final void c(final arur arur) {
        synchronized (this) {
            arur.c();
            agot.v(true, (Object)"isAvailable() returned false");
            this.e.add(arur);
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
                final arur arur = (arur)iterator.next();
                final String b2 = arur.b();
                if (hashMap.get(b2) != null) {
                    arur.d();
                }
                else {
                    hashMap.put(b2, arur);
                }
                arur.d();
                if (n < 5) {
                    arur.d();
                    b = arur.b();
                }
                n = 5;
            }
            this.f = afcw.k((Map)hashMap);
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
            return (Map)this.f;
        }
    }
}
