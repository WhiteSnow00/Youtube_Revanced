import java.util.Queue;
import java.util.Iterator;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agji extends agiy implements agjx
{
    private static final aglh c;
    public final Map a;
    public final AtomicReference b;
    private final Map d;
    private final Map e;
    private final List f;
    private final agjn g;
    
    static {
        c = (aglh)agjs.b;
    }
    
    public agji(Executor executor, Iterable iterator, final Collection collection) {
        this.a = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.b = new AtomicReference();
        final agjn g = new agjn(executor);
        this.g = g;
        final ArrayList list = new ArrayList();
        int i = 0;
        list.add(agjb.e((Object)g, (Class)agjn.class, new Class[] { agkp.class, agko.class }));
        list.add(agjb.e((Object)this, (Class)agjx.class, new Class[0]));
        for (final agjb agjb : collection) {
            if (agjb != null) {
                list.add(agjb);
            }
        }
        final ArrayList<aglh> f = (ArrayList<aglh>)new ArrayList<Object>();
        final Iterator<aglh> iterator3 = ((Iterable<aglh>)iterator).iterator();
        while (iterator3.hasNext()) {
            f.add(iterator3.next());
        }
        this.f = f;
        executor = (Executor)new ArrayList();
        monitorenter(this);
        try {
            iterator = f.iterator();
            while (iterator.hasNext()) {
                final aglh aglh = iterator.next();
                try {
                    final agje agje = (agje)aglh.a();
                    if (agje == null) {
                        continue;
                    }
                    list.addAll(agje.getComponents());
                    iterator.remove();
                }
                catch (final agjo agjo) {
                    iterator.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", (Throwable)agjo);
                }
            }
            if (this.a.isEmpty()) {
                aevy.k((List)list);
            }
            else {
                final ArrayList list2 = new ArrayList(this.a.keySet());
                list2.addAll(list);
                aevy.k((List)list2);
            }
            for (final agjb agjb2 : list) {
                this.a.put(agjb2, new agjp((aglh)new agjg(this, agjb2, 0)));
            }
            final ArrayList<agjf> list3 = new ArrayList<agjf>();
            for (final agjb agjb3 : list) {
                if (agjb3.f()) {
                    final aglh aglh2 = this.a.get(agjb3);
                    for (final Class clazz : agjb3.a) {
                        if (!this.d.containsKey(clazz)) {
                            this.d.put(clazz, aglh2);
                        }
                        else {
                            list3.add(new agjf((agjt)this.d.get(clazz), aglh2, 0));
                        }
                    }
                }
            }
            ((List<Object>)executor).addAll(list3);
            final ArrayList<agjf> list4 = new ArrayList<agjf>();
            final HashMap hashMap = new HashMap();
            for (final Map.Entry<agjb, V> entry : this.a.entrySet()) {
                final agjb agjb4 = entry.getKey();
                if (!agjb4.f()) {
                    final aglh aglh3 = (aglh)entry.getValue();
                    for (final Class clazz2 : agjb4.a) {
                        if (!hashMap.containsKey(clazz2)) {
                            hashMap.put(clazz2, new HashSet());
                        }
                        ((Set<aglh>)hashMap.get(clazz2)).add(aglh3);
                    }
                }
            }
            for (final Map.Entry<Object, V> entry2 : hashMap.entrySet()) {
                if (!this.e.containsKey(entry2.getKey())) {
                    this.e.put(entry2.getKey(), agjq.b((Collection)entry2.getValue()));
                }
                else {
                    final agjq agjq = this.e.get(entry2.getKey());
                    final Iterator iterator10 = ((Set)entry2.getValue()).iterator();
                    while (iterator10.hasNext()) {
                        list4.add(new agjf(agjq, (aglh)iterator10.next(), 2));
                    }
                }
            }
            ((List<Object>)executor).addAll(list4);
            for (final agjb agjb5 : this.a.keySet()) {
                for (final agjk agjk : agjb5.b) {
                    if (agjk.f() && !this.e.containsKey(agjk.a)) {
                        this.e.put(agjk.a, agjq.b(Collections.emptySet()));
                    }
                    else {
                        if (this.d.containsKey(agjk.a)) {
                            continue;
                        }
                        if (agjk.b == 1) {
                            throw new agjr(String.format("Unsatisfied dependency for component %s: %s", agjb5, agjk.a));
                        }
                        if (agjk.f()) {
                            continue;
                        }
                        this.d.put(agjk.a, new agjt(agjt.a));
                    }
                }
            }
            monitorexit(this);
            while (i < ((List)executor).size()) {
                ((Runnable)((List<Object>)executor).get(i)).run();
                ++i;
            }
            final Boolean b = this.b.get();
            if (b != null) {
                this.e(this.a, b);
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final aglh c(final Class clazz) {
        synchronized (this) {
            return this.d.get(clazz);
        }
    }
    
    public final aglh d(final Class clazz) {
        synchronized (this) {
            final agjq agjq = this.e.get(clazz);
            if (agjq != null) {
                return (aglh)agjq;
            }
            return agji.c;
        }
    }
    
    public final void e(final Map map, final boolean b) {
        for (final Map.Entry<agjb, V> entry : map.entrySet()) {
            final agjb agjb = entry.getKey();
            final aglh aglh = (aglh)entry.getValue();
            final int c = agjb.c;
            if (c != 1) {
                if (c != 2 || !b) {
                    continue;
                }
            }
            aglh.a();
        }
        final agjn g = this.g;
        monitorenter(g);
        try {
            Queue a = g.a;
            if (a != null) {
                g.a = null;
            }
            else {
                a = null;
            }
            monitorexit(g);
            if (a != null) {
                for (agkm agkm : a) {
                    agpc.B(agkm);
                    synchronized (g) {
                        final Queue a2 = g.a;
                        if (a2 != null) {
                            a2.add(agkm);
                            continue;
                        }
                        monitorexit(g);
                        for (final Map.Entry<K, Executor> entry2 : g.a(agkm)) {
                            entry2.getValue().execute((Runnable)new agjf((Map.Entry)entry2, agkm, 3));
                        }
                        continue;
                    }
                    break;
                }
            }
        }
        finally {
            monitorexit(g);
            while (true) {}
        }
    }
}
