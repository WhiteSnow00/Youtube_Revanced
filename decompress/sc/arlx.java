import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arlx implements arls
{
    public static final arls a;
    private final List b;
    private final List c;
    
    static {
        a = arlt.b(Collections.emptySet());
    }
    
    public arlx(final List b, final List c) {
        this.b = b;
        this.c = c;
    }
    
    public static arls b() {
        return arlx.a;
    }
    
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final Set c() {
        int size = this.b.size();
        final ArrayList list = new ArrayList(this.c.size());
        final int size2 = this.c.size();
        final int n = 0;
        for (int i = 0; i < size2; ++i) {
            final Collection collection = (Collection)this.c.get(i).a();
            size += collection.size();
            list.add(collection);
        }
        final HashSet set = new HashSet(aqsz.i(size));
        for (int size3 = this.b.size(), j = 0; j < size3; ++j) {
            final Object a = this.b.get(j).a();
            a.getClass();
            set.add(a);
        }
        for (int size4 = list.size(), k = n; k < size4; ++k) {
            for (final Object next : (Collection)list.get(k)) {
                next.getClass();
                set.add(next);
            }
        }
        return Collections.unmodifiableSet((Set<?>)set);
    }
}
