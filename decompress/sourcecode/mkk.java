import java.util.Collection;
import java.util.Iterator;
import android.os.Looper;
import java.util.Collections;
import j$.util.DesugarCollections;
import java.util.HashMap;
import android.content.Context;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mkk extends bkt
{
    public static final mnb h;
    public final mkj i;
    public final Map j;
    public final LinkedHashSet k;
    private final Set l;
    private final oia m;
    
    static {
        h = new mnb("MRDiscoveryCallback");
    }
    
    public mkk(final Context context) {
        this.m = new oia(context);
        this.j = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.k = new LinkedHashSet();
        this.l = Collections.synchronizedSet(new LinkedHashSet<Object>());
        this.i = new mkj(this, 0);
    }
    
    public final void i(final ccs ccs) {
        this.w(ccs, true);
    }
    
    public final void j(final ccs ccs) {
        this.w(ccs, true);
    }
    
    public final void k(final ccs ccs) {
        this.w(ccs, false);
    }
    
    public final void t() {
        this.k.size();
        String.valueOf(this.j.keySet());
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.u();
            return;
        }
        new aeke(Looper.getMainLooper(), (byte[])null).post((Runnable)new mkn(this, 1));
    }
    
    final void u() {
        this.m.d((bkt)this);
        final LinkedHashSet k = this.k;
        monitorenter(k);
        try {
            for (final String s : this.k) {
                final elw elw = new elw();
                elw.o(jyg.y(s));
                final ccj m = elw.m();
                if (this.j.get(s) == null) {
                    this.j.put(s, new lzg(m));
                }
                jyg.y(s);
                this.m.j().H(m, this, 4);
            }
            monitorexit(k);
            String.valueOf(this.j.keySet());
        }
        finally {
            monitorexit(k);
            while (true) {}
        }
    }
    
    public final void v() {
        this.m.d((bkt)this);
    }
    
    public final void w(final ccs ccs, final boolean b) {
        final Map j = this.j;
        monitorenter(j);
        try {
            String.valueOf(this.j.keySet());
            final Iterator iterator = this.j.entrySet().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final Map.Entry<String, V> entry = (Map.Entry<String, V>)iterator.next();
                final String s = entry.getKey();
                final lzg lzg = (lzg)entry.getValue();
                if (ccs.n((ccj)lzg.a)) {
                    if (b) {
                        final boolean b2 = (n = (((LinkedHashSet)lzg.b).add(ccs) ? 1 : 0)) != 0;
                        if (b2) {
                            continue;
                        }
                        final mnb h = mkk.h;
                        final String string = ccs.toString();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Route ");
                        sb.append(string);
                        sb.append(" already exists for appId ");
                        sb.append(s);
                        h.d(sb.toString(), new Object[0]);
                        n = (b2 ? 1 : 0);
                    }
                    else {
                        final boolean b3 = (n = (((LinkedHashSet)lzg.b).remove(ccs) ? 1 : 0)) != 0;
                        if (b3) {
                            continue;
                        }
                        final mnb h2 = mkk.h;
                        final String string2 = ccs.toString();
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Route ");
                        sb2.append(string2);
                        sb2.append(" already removed from appId ");
                        sb2.append(s);
                        h2.d(sb2.toString(), new Object[0]);
                        n = (b3 ? 1 : 0);
                    }
                }
            }
            monitorexit(j);
            if (n != 0) {
                synchronized (this.l) {
                    final HashMap<String, Set> hashMap = new HashMap<String, Set>();
                    synchronized (this.j) {
                        for (final String s2 : this.j.keySet()) {
                            final lzg lzg2 = this.j.get(aeda.x(s2));
                            Object o;
                            if (lzg2 == null) {
                                o = afgq.a;
                            }
                            else {
                                o = afdu.p((Collection)lzg2.b);
                            }
                            if (!((Set)o).isEmpty()) {
                                hashMap.put(s2, (Set)o);
                            }
                        }
                        monitorexit(this.j);
                        afcw.k((Map)hashMap);
                        final Iterator iterator3 = this.l.iterator();
                        while (iterator3.hasNext()) {
                            ((mjo)iterator3.next()).a();
                        }
                    }
                }
            }
        }
        finally {
            monitorexit(j);
            while (true) {}
        }
    }
}
