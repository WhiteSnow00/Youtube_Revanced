import java.util.Iterator;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class atz
{
    public static final atz a;
    public final Map b;
    private final Map c;
    
    static {
        a = new atz();
    }
    
    public atz() {
        this.c = new HashMap();
        this.b = new HashMap();
    }
    
    private static final void d(final Map map, final aty aty, final aug aug, final Class clazz) {
        final aug aug2 = map.get(aty);
        if (aug2 != null && aug != aug2) {
            final Method b = aty.b;
            final StringBuilder sb = new StringBuilder("Method ");
            sb.append(b.getName());
            sb.append(" in ");
            sb.append(clazz.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(aug2);
            sb.append(", new value ");
            sb.append(aug);
            throw new IllegalArgumentException(sb.toString());
        }
        if (aug2 == null) {
            map.put(aty, aug);
        }
    }
    
    public final atx a(final Class clazz, final Method[] array) {
        final Class superclass = clazz.getSuperclass();
        final HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(this.b(superclass).b);
        }
        final Class[] interfaces = clazz.getInterfaces();
        for (int length = interfaces.length, i = 0; i < length; ++i) {
            for (final Map.Entry<aty, V> entry : this.b(interfaces[i]).b.entrySet()) {
                d(hashMap, entry.getKey(), (aug)entry.getValue(), clazz);
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
                    if (!aun.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    n = 1;
                }
                else {
                    n = 0;
                }
                final aug a = onLifecycleEvent.a();
                if (length3 > 1) {
                    if (!aug.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (a != aug.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    n = 2;
                }
                if (length3 > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                d(hashMap, new aty(n, method), a, clazz);
                b = true;
            }
            ++j;
        }
        final atx atx = new atx(hashMap);
        this.c.put(clazz, atx);
        this.b.put(clazz, b);
        return atx;
    }
    
    public final atx b(final Class clazz) {
        final atx atx = this.c.get(clazz);
        if (atx != null) {
            return atx;
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
