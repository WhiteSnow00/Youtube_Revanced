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

public final class aryq
{
    private static final Logger a;
    private static aryq b;
    private static final Iterable c;
    private final LinkedHashSet d;
    private final LinkedHashMap e;
    
    static {
        a = Logger.getLogger(aryq.class.getName());
        final ArrayList list = new ArrayList();
        try {
            list.add(Class.forName("ashc"));
        }
        catch (final ClassNotFoundException ex) {
            aryq.a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", ex);
        }
        try {
            list.add(Class.forName("asjs"));
        }
        catch (final ClassNotFoundException ex2) {
            aryq.a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", ex2);
        }
        c = Collections.unmodifiableList((List<?>)list);
    }
    
    public aryq() {
        this.d = new LinkedHashSet();
        this.e = new LinkedHashMap();
    }
    
    public static aryq b() {
        monitorenter(aryq.class);
        try {
            if (aryq.b == null) {
                final List i = arxu.i(aryp.class, aryq.c, aryp.class.getClassLoader(), (arzy)new arzr(1));
                aryq.b = new aryq();
                for (final aryp aryp : i) {
                    aryq.a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(aryp))));
                    aryp.e();
                    aryq.b.c(aryp);
                }
                aryq.b.d();
            }
            final aryq b = aryq.b;
            monitorexit(aryq.class);
            return b;
        }
        finally {
            monitorexit(aryq.class);
            while (true) {}
        }
    }
    
    private final void c(final aryp aryp) {
        synchronized (this) {
            aryp.e();
            adme.L(true, "isAvailable() returned false");
            this.d.add(aryp);
        }
    }
    
    private final void d() {
        monitorenter(this);
        try {
            this.e.clear();
            for (final aryp aryp : this.d) {
                final String b = aryp.b();
                if (this.e.get(b) != null) {
                    aryp.d();
                }
                else {
                    this.e.put(b, aryp);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final aryp a(final String s) {
        synchronized (this) {
            return this.e.get(s);
        }
    }
}
