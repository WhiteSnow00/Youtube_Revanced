import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeua
{
    public static final WeakHashMap a;
    private static final WeakHashMap b;
    
    static {
        b = new WeakHashMap();
        a = new WeakHashMap();
    }
    
    public static void a(final Throwable t) {
        Object o = aeua.a;
        monitorenter(o);
        Object o2 = t;
        while (true) {
            Label_0030: {
                if (o2 == null) {
                    break Label_0030;
                }
                try {
                    if (aeua.a.containsKey(o2)) {
                        aeua.a.put(t, o2 != null);
                        monitorexit(o);
                        if (o2 == null) {
                            if (b(t) != null) {
                                return;
                            }
                            o = new ArrayList<aevk>();
                            for (o2 = aewp.a(); o2 != null; o2 = ((aevk)o2).a()) {
                                ((List<aevk>)o).add((aevk)o2);
                            }
                            o2 = afgh.h(((List)o).size());
                            final afgc h = afgh.h(((List)o).size());
                            o = agpx.R((List)o).iterator();
                            while (((Iterator)o).hasNext()) {
                                final aevk aevk = ((Iterator<aevk>)o).next();
                                h.h(aevk.b());
                                ((afgc)o2).h(aevk.g());
                            }
                            o = h.g();
                            ((afgc)o2).g();
                            o = new aevs((afgh)o);
                            o2 = aeua.b;
                            synchronized (o2) {
                                ((WeakHashMap<Throwable, afgh>)o2).put(t, (afgh)o);
                            }
                        }
                        return;
                    }
                    o2 = ((Throwable)o2).getCause();
                }
                finally {
                    monitorexit(o);
                    while (true) {}
                }
            }
        }
    }
    
    public static adgg b(final Throwable t) {
        adme.U(true, "Trace uncaught exception is disabled.");
        final WeakHashMap b = aeua.b;
        monitorenter(b);
        Throwable cause = t;
        while (true) {
            Label_0040: {
                if (cause == null) {
                    break Label_0040;
                }
                try {
                    if (aeua.b.containsKey(cause)) {
                        break Label_0040;
                    }
                    cause = cause.getCause();
                }
                finally {
                    monitorexit(b);
                    while (true) {}
                    iftrue(Label_0048:)(cause != null);
                    monitorexit(b);
                    return null;
                    final WeakHashMap b2;
                    Label_0048: {
                        b2 = aeua.b;
                    }
                    final aevs aevs = b2.get(cause);
                    b2.put(t, aevs);
                    monitorexit(b);
                    return new adgg(aevs);
                }
            }
        }
    }
}
