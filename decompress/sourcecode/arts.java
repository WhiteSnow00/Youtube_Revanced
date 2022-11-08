import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arts
{
    private static final Logger a;
    private static arts b;
    private static final Iterable c;
    private final LinkedHashSet d;
    private final LinkedHashMap e;
    
    static {
        a = Logger.getLogger(arts.class.getName());
        final ArrayList list = new ArrayList();
        try {
            list.add(Class.forName("asda"));
        }
        catch (final ClassNotFoundException ex) {
            arts.a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", ex);
        }
        try {
            list.add(Class.forName("asgh"));
        }
        catch (final ClassNotFoundException ex2) {
            arts.a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", ex2);
        }
        c = Collections.unmodifiableList((List<?>)list);
    }
    
    public arts() {
        this.d = new LinkedHashSet();
        this.e = new LinkedHashMap();
    }
    
    public static arts b() {
        monitorenter(arts.class);
        try {
            if (arts.b == null) {
                final List q = arxi.q((Class)artr.class, arts.c, artr.class.getClassLoader(), (arvi)new arut(1));
                arts.b = new arts();
                for (final artr artr : q) {
                    arts.a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(artr))));
                    artr.e();
                    arts.b.c(artr);
                }
                arts.b.d();
            }
            final arts b = arts.b;
            monitorexit(arts.class);
            return b;
        }
        finally {
            monitorexit(arts.class);
            while (true) {}
        }
    }
    
    private final void c(final artr artr) {
        synchronized (this) {
            artr.e();
            agot.v(true, (Object)"isAvailable() returned false");
            this.d.add(artr);
        }
    }
    
    private final void d() {
        monitorenter(this);
        try {
            this.e.clear();
            for (final artr artr : this.d) {
                final String b = artr.b();
                if (this.e.get(b) != null) {
                    artr.d();
                }
                else {
                    this.e.put(b, artr);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final artr a(final String s) {
        synchronized (this) {
            return this.e.get(s);
        }
    }
}
