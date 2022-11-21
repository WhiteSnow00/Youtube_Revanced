import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bai implements Iterable
{
    private final Object a;
    private final Map b;
    private Set c;
    private List d;
    
    public bai() {
        this.a = new Object();
        this.b = new HashMap();
        this.c = Collections.emptySet();
        this.d = Collections.emptyList();
    }
    
    public final int a(final Object o) {
        synchronized (this.a) {
            int intValue;
            if (this.b.containsKey(o)) {
                intValue = this.b.get(o);
            }
            else {
                intValue = 0;
            }
            return intValue;
        }
    }
    
    public final Set b() {
        synchronized (this.a) {
            return this.c;
        }
    }
    
    public final void c(final Object o) {
        synchronized (this.a) {
            final ArrayList list = new ArrayList(this.d);
            list.add(o);
            this.d = Collections.unmodifiableList((List<?>)list);
            final Integer n = this.b.get(o);
            if (n == null) {
                final HashSet set = new HashSet(this.c);
                set.add(o);
                this.c = Collections.unmodifiableSet((Set<?>)set);
            }
            final Map b = this.b;
            int n2 = 1;
            if (n != null) {
                n2 = 1 + n;
            }
            b.put(o, n2);
        }
    }
    
    public final void d(final Object o) {
        synchronized (this.a) {
            final Integer n = this.b.get(o);
            if (n == null) {
                return;
            }
            final ArrayList list = new ArrayList(this.d);
            list.remove(o);
            this.d = Collections.unmodifiableList((List<?>)list);
            if (n == 1) {
                this.b.remove(o);
                final HashSet set = new HashSet(this.c);
                set.remove(o);
                this.c = Collections.unmodifiableSet((Set<?>)set);
            }
            else {
                this.b.put(o, n - 1);
            }
        }
    }
    
    @Override
    public final Iterator iterator() {
        synchronized (this.a) {
            return this.d.iterator();
        }
    }
}
