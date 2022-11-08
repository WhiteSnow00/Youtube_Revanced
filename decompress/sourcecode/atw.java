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
public final class atw
{
    public final Map a;
    final Map b;
    
    public atw(final Map b) {
        this.b = b;
        this.a = new HashMap();
        for (final Map.Entry<K, auf> entry : b.entrySet()) {
            final auf auf = entry.getValue();
            List list;
            if ((list = this.a.get(auf)) == null) {
                list = new ArrayList();
                this.a.put(auf, list);
            }
            list.add(entry.getKey());
        }
    }
    
    public static void a(final List list, final aum aum, final auf auf, final Object o) {
        if (list != null) {
            int size = list.size();
            while (--size >= 0) {
                final atx atx = list.get(size);
                try {
                    final int a = atx.a;
                    if (a == 0) {
                        atx.b.invoke(o, new Object[0]);
                        continue;
                    }
                    if (a != 1) {
                        atx.b.invoke(o, aum, auf);
                        continue;
                    }
                    atx.b.invoke(o, aum);
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
