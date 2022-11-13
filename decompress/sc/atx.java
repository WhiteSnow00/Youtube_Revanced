import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class atx
{
    public final Map a;
    final Map b;
    
    public atx(final Map b) {
        this.b = b;
        this.a = new HashMap();
        for (final Map.Entry<K, aug> entry : b.entrySet()) {
            final aug aug = entry.getValue();
            List list;
            if ((list = this.a.get(aug)) == null) {
                list = new ArrayList();
                this.a.put(aug, list);
            }
            list.add(entry.getKey());
        }
    }
    
    public static void a(final List list, final aun aun, final aug aug, final Object o) {
        if (list != null) {
            int size = list.size();
            while (--size >= 0) {
                final aty aty = list.get(size);
                try {
                    final int a = aty.a;
                    if (a == 0) {
                        aty.b.invoke(o, new Object[0]);
                        continue;
                    }
                    if (a != 1) {
                        aty.b.invoke(o, aun, aug);
                        continue;
                    }
                    aty.b.invoke(o, aun);
                    continue;
                }
                catch (final IllegalAccessException ex) {
                    throw new RuntimeException(ex);
                }
                catch (final InvocationTargetException ex2) {
                    throw new RuntimeException("Failed to call observer method", ex2.getCause());
                }
                break;
            }
        }
    }
}
