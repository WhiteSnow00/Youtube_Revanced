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

public final class aghg extends aggx implements aghw
{
    private static final agjg c;
    public final Map a;
    public final AtomicReference b;
    private final Map d;
    private final Map e;
    private final List f;
    private final aghm g;
    
    static {
        c = (agjg)aghr.b;
    }
    
    public aghg(Executor executor, Iterable iterator, final Collection collection) {
        this.a = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.b = new AtomicReference();
        final aghm g = new aghm(executor);
        this.g = g;
        final ArrayList list = new ArrayList();
        int i = 0;
        list.add(agha.e((Object)g, (Class)aghm.class, new Class[] { agio.class, agin.class }));
        list.add(agha.e((Object)this, (Class)aghw.class, new Class[0]));
        for (final agha agha : collection) {
            if (agha != null) {
                list.add(agha);
            }
        }
        final ArrayList<agjg> f = (ArrayList<agjg>)new ArrayList<Object>();
        final Iterator<agjg> iterator3 = ((Iterable<agjg>)iterator).iterator();
        while (iterator3.hasNext()) {
            f.add(iterator3.next());
        }
        this.f = f;
        executor = (Executor)new ArrayList();
        monitorenter(this);
        try {
            iterator = f.iterator();
            while (iterator.hasNext()) {
                final agjg agjg = iterator.next();
                try {
                    final aghd aghd = (aghd)agjg.a();
                    if (aghd == null) {
                        continue;
                    }
                    list.addAll(aghd.getComponents());
                    iterator.remove();
                }
                catch (final aghn aghn) {
                    iterator.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", (Throwable)aghn);
                }
            }
            if (this.a.isEmpty()) {
                aety.j((List)list);
            }
            else {
                final ArrayList list2 = new ArrayList(this.a.keySet());
                list2.addAll(list);
                aety.j((List)list2);
            }
            for (final agha agha2 : list) {
                this.a.put(agha2, new agho((agjg)new aghe(this, agha2, 0)));
            }
            final ArrayList<adpd> list3 = new ArrayList<adpd>();
            for (final agha agha3 : list) {
                if (agha3.f()) {
                    final agjg agjg2 = this.a.get(agha3);
                    for (final Class clazz : agha3.a) {
                        if (!this.d.containsKey(clazz)) {
                            this.d.put(clazz, agjg2);
                        }
                        else {
                            list3.add(new adpd((aghs)this.d.get(clazz), agjg2, 20));
                        }
                    }
                }
            }
            ((List<Object>)executor).addAll(list3);
            final ArrayList<aghl> list4 = new ArrayList<aghl>();
            final HashMap hashMap = new HashMap();
            for (final Map.Entry<agha, V> entry : this.a.entrySet()) {
                final agha agha4 = entry.getKey();
                if (!agha4.f()) {
                    final agjg agjg3 = (agjg)entry.getValue();
                    for (final Class clazz2 : agha4.a) {
                        if (!hashMap.containsKey(clazz2)) {
                            hashMap.put(clazz2, new HashSet());
                        }
                        ((Set<agjg>)hashMap.get(clazz2)).add(agjg3);
                    }
                }
            }
            for (final Map.Entry<Object, V> entry2 : hashMap.entrySet()) {
                if (!this.e.containsKey(entry2.getKey())) {
                    this.e.put(entry2.getKey(), aghp.b((Collection)entry2.getValue()));
                }
                else {
                    final aghp aghp = this.e.get(entry2.getKey());
                    final Iterator iterator10 = ((Set)entry2.getValue()).iterator();
                    while (iterator10.hasNext()) {
                        list4.add(new aghl(aghp, (agjg)iterator10.next(), 1));
                    }
                }
            }
            ((List<Object>)executor).addAll(list4);
            for (final agha agha5 : this.a.keySet()) {
                for (final aghi aghi : agha5.b) {
                    if (aghi.f() && !this.e.containsKey(aghi.a)) {
                        this.e.put(aghi.a, aghp.b((Collection)Collections.emptySet()));
                    }
                    else {
                        if (this.d.containsKey(aghi.a)) {
                            continue;
                        }
                        if (aghi.b == 1) {
                            throw new aghq(String.format("Unsatisfied dependency for component %s: %s", agha5, aghi.a));
                        }
                        if (aghi.f()) {
                            continue;
                        }
                        this.d.put(aghi.a, new aghs(aghs.a));
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
    
    public final agjg c(final Class clazz) {
        synchronized (this) {
            return this.d.get(clazz);
        }
    }
    
    public final agjg d(final Class clazz) {
        synchronized (this) {
            final aghp aghp = this.e.get(clazz);
            if (aghp != null) {
                return (agjg)aghp;
            }
            return aghg.c;
        }
    }
    
    public final void e(final Map map, final boolean b) {
        for (final Map.Entry<agha, V> entry : map.entrySet()) {
            final agha agha = entry.getKey();
            final agjg agjg = (agjg)entry.getValue();
            final int c = agha.c;
            if (c != 1) {
                if (c != 2 || !b) {
                    continue;
                }
            }
            agjg.a();
        }
        final aghm g = this.g;
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
                for (agil agil : a) {
                    aety.h((Object)agil);
                    synchronized (g) {
                        final Queue a2 = g.a;
                        if (a2 != null) {
                            a2.add(agil);
                            continue;
                        }
                        monitorexit(g);
                        for (final Map.Entry<K, Executor> entry2 : g.a(agil)) {
                            entry2.getValue().execute((Runnable)new aghl((Map.Entry)entry2, agil, 0));
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
