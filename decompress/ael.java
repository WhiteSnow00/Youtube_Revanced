import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ael
{
    public final Object a;
    public final Object b;
    public final List c;
    public final Object d;
    
    public ael() {
        this.a = new aks(10);
        this.b = new abo();
        this.c = new ArrayList();
        this.d = new HashSet();
    }
    
    public ael(final List c, final List list, final List list2, final List list3, final List list4, final yv b) {
        this.c = c;
        this.a = Collections.unmodifiableList((List<?>)list);
        this.d = Collections.unmodifiableList((List<?>)list2);
        Collections.unmodifiableList((List<?>)list3);
        Collections.unmodifiableList((List<?>)list4);
        this.b = b;
    }
    
    public final ArrayList a(final Object o) {
        return (ArrayList)((abo)this.b).get(o);
    }
    
    public final void b(final Object o) {
        if (!((abo)this.b).containsKey(o)) {
            ((abo)this.b).put(o, null);
        }
    }
    
    public final void c(final Object o, final ArrayList list, final HashSet set) {
        if (list.contains(o)) {
            return;
        }
        if (!set.contains(o)) {
            set.add(o);
            final ArrayList list2 = (ArrayList)((abo)this.b).get(o);
            if (list2 != null) {
                for (int size = list2.size(), i = 0; i < size; ++i) {
                    this.c(list2.get(i), list, set);
                }
            }
            set.remove(o);
            list.add(o);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
    
    public final yy d() {
        return ((yv)this.b).d;
    }
}
