import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class dpc
{
    private final Map a;
    private final long b;
    private long c;
    
    public dpc(final long b) {
        this.a = new LinkedHashMap(100, 0.75f, true);
        this.b = b;
    }
    
    protected int a(final Object o) {
        return 1;
    }
    
    protected void c(final Object o, final Object o2) {
    }
    
    public final long e() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final Object f(Object b) {
        synchronized (this) {
            final ardu ardu = this.a.get(b);
            if (ardu != null) {
                b = ardu.b;
                return b;
            }
            return null;
        }
    }
    
    public final Object g(Object b, final Object o) {
        synchronized (this) {
            final int a = this.a(o);
            final long n = a;
            if (n >= this.b) {
                this.c(b, o);
                return null;
            }
            if (o != null) {
                this.c += n;
            }
            final Map a2 = this.a;
            ardu ardu;
            if (o == null) {
                ardu = null;
            }
            else {
                ardu = new ardu(o, a);
            }
            final ardu ardu2 = a2.put(b, ardu);
            if (ardu2 != null) {
                this.c -= ardu2.a;
                if (!ardu2.b.equals(o)) {
                    this.c(b, ardu2.b);
                }
            }
            this.j(this.b);
            if (ardu2 != null) {
                b = ardu2.b;
                return b;
            }
            return null;
        }
    }
    
    public final Object h(Object b) {
        synchronized (this) {
            final ardu ardu = this.a.remove(b);
            if (ardu == null) {
                return null;
            }
            this.c -= ardu.a;
            b = ardu.b;
            return b;
        }
    }
    
    public final void i() {
        this.j(0L);
    }
    
    public final void j(final long n) {
        monitorenter(this);
        try {
            while (this.c > n) {
                final Iterator iterator = this.a.entrySet().iterator();
                final Map.Entry<K, ardu> entry = (Map.Entry<K, ardu>)iterator.next();
                final ardu ardu = entry.getValue();
                this.c -= ardu.a;
                final K key = entry.getKey();
                iterator.remove();
                this.c(key, ardu.b);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
