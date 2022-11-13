import java.util.Set;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;
import android.graphics.PorterDuff$Mode;

// 
// Decompiled by Procyon v0.6.0
// 

public class abn
{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private final sk h;
    private final bx i;
    
    public abn() {
        this(6);
    }
    
    public abn(final int a) {
        this.a = a;
        if (a > 0) {
            this.i = new bx((byte[])null, (byte[])null, (byte[])null);
            this.h = new sk();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
    
    public static int h(final int n, final PorterDuff$Mode porterDuff$Mode) {
        return (n + 31) * 31 + porterDuff$Mode.hashCode();
    }
    
    private final int j(final Object o, final Object o2) {
        final int a = this.a(o, o2);
        if (a >= 0) {
            return a;
        }
        final StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(o);
        sb.append('=');
        sb.append(o2);
        throw new IllegalStateException(sb.toString());
    }
    
    protected int a(final Object o, final Object o2) {
        o.getClass();
        o2.getClass();
        return 1;
    }
    
    protected Object b(final Object o) {
        return null;
    }
    
    public final Object c(Object o) {
        o.getClass();
        Object o2 = this.h;
        synchronized (o2) {
            final Object value = ((LinkedHashMap)this.i.a).get(o);
            if (value != null) {
                ++this.f;
                return value;
            }
            ++this.g;
            monitorexit(o2);
            final Object b = this.b(o);
            if (b == null) {
                return null;
            }
            synchronized (this.h) {
                ++this.d;
                o2 = this.i.z(o, b);
                if (o2 != null) {
                    this.i.z(o, o2);
                }
                else {
                    this.b += this.j(o, b);
                }
                monitorexit(this.h);
                if (o2 != null) {
                    this.f(false, o, b, o2);
                    o = o2;
                }
                else {
                    this.g(this.a);
                    o = b;
                }
                return o2;
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        o.getClass();
        o2.getClass();
        synchronized (this.h) {
            ++this.c;
            this.b += this.j(o, o2);
            final Object z = this.i.z(o, o2);
            if (z != null) {
                this.b -= this.j(o, z);
            }
            monitorexit(this.h);
            if (z != null) {
                this.f(false, o, z, o2);
            }
            this.g(this.a);
            return z;
        }
    }
    
    public final Map e() {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final sk h = this.h;
        monitorenter(h);
        try {
            for (final Map.Entry<Object, V> entry : this.i.B()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            monitorexit(h);
            return linkedHashMap;
        }
        finally {
            monitorexit(h);
            while (true) {}
        }
    }
    
    protected void f(final boolean b, final Object o, final Object o2, final Object o3) {
        o.getClass();
        o2.getClass();
    }
    
    public final void g(final int n) {
        while (true) {
            final sk h = this.h;
            monitorenter(h);
            try {
                if (this.b < 0 || (this.i.C() && this.b != 0)) {
                    throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                }
                if (this.b <= n || this.i.C()) {
                    monitorexit(h);
                    return;
                }
                final Set b = this.i.B();
                Object o = null;
                Label_0123: {
                    if (b instanceof List) {
                        final List list = (List)b;
                        if (!list.isEmpty()) {
                            o = list.get(0);
                            break Label_0123;
                        }
                    }
                    else {
                        final Iterator iterator = b.iterator();
                        if (iterator.hasNext()) {
                            o = iterator.next();
                            break Label_0123;
                        }
                    }
                    o = null;
                }
                final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)o;
                if (entry == null) {
                    monitorexit(h);
                    return;
                }
                final Object key = entry.getKey();
                final V value = entry.getValue();
                this.i.A(key);
                this.b -= this.j(key, value);
                ++this.e;
                monitorexit(h);
                this.f(true, key, value, null);
            }
            finally {
                monitorexit(h);
                while (true) {}
            }
        }
    }
    
    public final void i(final Object o) {
        o.getClass();
        synchronized (this.h) {
            final Object a = this.i.A(o);
            if (a != null) {
                this.b -= this.j(o, a);
            }
            monitorexit(this.h);
            if (a != null) {
                this.f(false, o, a, null);
            }
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this.h) {
            final int f = this.f;
            final int n = this.g + f;
            int n2;
            if (n != 0) {
                n2 = f * 100 / n;
            }
            else {
                n2 = 0;
            }
            final StringBuilder sb = new StringBuilder("LruCache[maxSize=");
            sb.append(this.a);
            sb.append(",hits=");
            sb.append(this.f);
            sb.append(",misses=");
            sb.append(this.g);
            sb.append(",hitRate=");
            sb.append(n2);
            sb.append("%]");
            return sb.toString();
        }
    }
}
