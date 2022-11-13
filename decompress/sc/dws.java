import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dws
{
    public Map a;
    public Map b;
    public Map c;
    public Map d;
    public Map e;
    public HashSet f;
    public Map g;
    
    public dws() {
        this(null);
    }
    
    public dws(final dws dws) {
        if (dws == null) {
            return;
        }
        monitorenter(this);
        try {
            final Map e = dws.e();
            final Map c = dws.c();
            final Map b = dws.b();
            Label_0297: {
                if (e == null || e.isEmpty()) {
                    if (b == null) {
                        break Label_0297;
                    }
                    if (b.isEmpty()) {
                        break Label_0297;
                    }
                }
                this.q();
                if (e != null) {
                    try {
                        for (final String s : e.keySet()) {
                            this.a.put(s, o((List)e.get(s)));
                        }
                    }
                    finally {}
                }
                if (c != null) {
                    if (!c.isEmpty()) {
                        this.p();
                        for (final Map.Entry<String, V> entry : c.entrySet()) {
                            this.b.put(entry.getKey(), o((List)entry.getValue()));
                        }
                    }
                }
                if (b != null) {
                    for (final Map.Entry<String, V> entry2 : b.entrySet()) {
                        this.d.put(entry2.getKey(), o((List)entry2.getValue()));
                    }
                }
            }
            this.h(dws.f());
            this.i(dws.d());
            final Map g = dws.g;
            if (g != null) {
                this.g = new HashMap(g);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public static dws a(final dws dws) {
        return new dws(dws);
    }
    
    private static List o(final List list) {
        int size;
        if (list == null) {
            size = 4;
        }
        else {
            size = list.size();
        }
        final ArrayList list2 = new ArrayList(size);
        if (list != null) {
            list2.addAll(list);
        }
        return list2;
    }
    
    private final void p() {
        synchronized (this) {
            if (this.b == null) {
                this.b = new HashMap(4);
            }
        }
    }
    
    private final void q() {
        synchronized (this) {
            if (this.a == null) {
                this.a = new HashMap(4);
            }
            if (this.d == null) {
                this.d = new HashMap(4);
            }
        }
    }
    
    private static void r(final String s, final argj argj, final Map map) {
        List o;
        if ((o = map.get(s)) == null) {
            o = o(null);
            map.put(s, o);
        }
        o.add(argj);
    }
    
    public final Map b() {
        synchronized (this) {
            return this.d;
        }
    }
    
    final Map c() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final Map d() {
        synchronized (this) {
            return this.c;
        }
    }
    
    final Map e() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public final Map f() {
        synchronized (this) {
            return this.e;
        }
    }
    
    final Set g() {
        synchronized (this) {
            final HashSet set = new HashSet();
            final Map d = this.d;
            if (d != null) {
                set.addAll(d.keySet());
            }
            final Map a = this.a;
            if (a != null) {
                set.addAll(a.keySet());
            }
            return set;
        }
    }
    
    public final void h(final Map map) {
        if (map != null) {
            if (!map.isEmpty()) {
                synchronized (this) {
                    this.l();
                    this.e.clear();
                    this.e.putAll(map);
                }
            }
        }
    }
    
    public final void i(final Map map) {
        if (map != null) {
            if (!map.isEmpty()) {
                synchronized (this) {
                    this.k();
                    this.c.putAll(map);
                }
            }
        }
    }
    
    public final void j() {
        synchronized (this) {
            if (this.f == null) {
                this.f = new HashSet();
            }
        }
    }
    
    public final void k() {
        synchronized (this) {
            if (this.c == null) {
                this.c = new HashMap();
            }
        }
    }
    
    public final void l() {
        synchronized (this) {
            if (this.e == null) {
                this.e = new HashMap(4);
            }
        }
    }
    
    public final boolean m() {
        synchronized (this) {
            final Map a = this.a;
            return a != null && !a.isEmpty();
        }
    }
    
    public final void n(final String s, final argj argj, final boolean b) {
        synchronized (this) {
            this.q();
            r(s, argj, this.a);
            if (b) {
                this.p();
                r(s, argj, this.b);
            }
        }
    }
}
