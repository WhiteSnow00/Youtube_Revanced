import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import android.content.Context;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class che
{
    public static volatile che a;
    public static final Object b;
    final Map c;
    final Set d;
    final Context e;
    
    static {
        b = new Object();
    }
    
    public che(final Context context) {
        this.e = context.getApplicationContext();
        this.d = new HashSet();
        this.c = new HashMap();
    }
    
    public final void a(final Class clazz, final Set set) {
        Label_0011: {
            if (!cer.b()) {
                break Label_0011;
            }
            try {
                clazz.getSimpleName();
                if (!set.contains(clazz)) {
                    if (!this.c.containsKey(clazz)) {
                        set.add(clazz);
                        try {
                            final chg chg = clazz.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                            final List b = chg.b();
                            if (!b.isEmpty()) {
                                for (final Class clazz2 : b) {
                                    if (!this.c.containsKey(clazz2)) {
                                        this.a(clazz2, set);
                                    }
                                }
                            }
                            final Object a = chg.a(this.e);
                            set.remove(clazz);
                            this.c.put(clazz, a);
                            return;
                        }
                        finally {
                            final Throwable t;
                            throw new chh(t);
                        }
                    }
                    this.c.get(clazz);
                    return;
                }
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", clazz.getName()));
            }
            finally {
                while (true) {}
            }
        }
    }
}
