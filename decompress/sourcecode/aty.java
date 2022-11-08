import java.util.Iterator;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aty
{
    public static final aty a;
    public final Map b;
    private final Map c;
    
    static {
        a = new aty();
    }
    
    public aty() {
        this.c = new HashMap();
        this.b = new HashMap();
    }
    
    private static final void d(final Map map, final atx atx, final auf auf, final Class clazz) {
        final auf auf2 = map.get(atx);
        if (auf2 != null && auf != auf2) {
            final Method b = atx.b;
            final StringBuilder sb = new StringBuilder("Method ");
            sb.append(b.getName());
            sb.append(" in ");
            sb.append(clazz.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(auf2);
            sb.append(", new value ");
            sb.append(auf);
            throw new IllegalArgumentException(sb.toString());
        }
        if (auf2 == null) {
            map.put(atx, auf);
        }
    }
    
    public final atw a(final Class clazz, final Method[] array) {
        final Class superclass = clazz.getSuperclass();
        final HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(this.b(superclass).b);
        }
        final Class[] interfaces = clazz.getInterfaces();
        for (int length = interfaces.length, i = 0; i < length; ++i) {
            for (final Map.Entry<atx, V> entry : this.b(interfaces[i]).b.entrySet()) {
                d(hashMap, entry.getKey(), (auf)entry.getValue(), clazz);
            }
        }
        Method[] c;
        if ((c = array) == null) {
            c = this.c(clazz);
        }
        final int length2 = c.length;
        int j = 0;
        boolean b = false;
        while (j < length2) {
            final Method method = c[j];
            final OnLifecycleEvent onLifecycleEvent = method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                final Class<?>[] parameterTypes = method.getParameterTypes();
                final int length3 = parameterTypes.length;
                int n;
                if (length3 > 0) {
                    if (!aum.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    n = 1;
                }
                else {
                    n = 0;
                }
                final auf a = onLifecycleEvent.a();
                if (length3 > 1) {
                    if (!auf.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (a != auf.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    n = 2;
                }
                if (length3 > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                d(hashMap, new atx(n, method), a, clazz);
                b = true;
            }
            ++j;
        }
        final atw atw = new atw(hashMap);
        this.c.put(clazz, atw);
        this.b.put(clazz, b);
        return atw;
    }
    
    public final atw b(final Class clazz) {
        final atw atw = this.c.get(clazz);
        if (atw != null) {
            return atw;
        }
        return this.a(clazz, null);
    }
    
    public final Method[] c(final Class clazz) {
        try {
            return clazz.getDeclaredMethods();
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", noClassDefFoundError);
        }
    }
}
