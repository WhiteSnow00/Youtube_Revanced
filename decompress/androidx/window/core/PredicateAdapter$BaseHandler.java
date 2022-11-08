// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

abstract class PredicateAdapter$BaseHandler implements InvocationHandler
{
    private final atob clazz;
    
    public PredicateAdapter$BaseHandler(final atob clazz) {
        clazz.getClass();
        this.clazz = clazz;
    }
    
    @Override
    public Object invoke(final Object o, final Method method, final Object[] array) {
        o.getClass();
        method.getClass();
        final boolean test = this.isTest(method, array);
        final Object o2 = null;
        final Object o3 = null;
        boolean b = false;
        Serializable s;
        if (test) {
            final atob clazz = this.clazz;
            Object o4 = o3;
            if (array != null) {
                o4 = array[0];
            }
            arxi.e(clazz, o4);
            s = this.invokeTest(o, o4);
        }
        else if (this.isEquals(method, array)) {
            Object o5 = o2;
            if (array != null) {
                o5 = array[0];
            }
            o5.getClass();
            if (o == o5) {
                b = true;
            }
            s = b;
        }
        else if (this.isHashCode(method, array)) {
            s = this.hashCode();
        }
        else {
            if (!this.isToString(method, array)) {
                final StringBuilder sb = new StringBuilder("Unexpected method call object:");
                sb.append(o);
                sb.append(", method: ");
                sb.append(method);
                sb.append(", args: ");
                sb.append(array);
                throw new UnsupportedOperationException(sb.toString());
            }
            s = this.toString();
        }
        return s;
    }
    
    public abstract boolean invokeTest(final Object p0, final Object p1);
    
    protected final boolean isEquals(final Method method, final Object[] array) {
        method.getClass();
        return atnh.c((Object)method.getName(), (Object)"equals") && method.getReturnType().equals(Boolean.TYPE) && array != null && array.length == 1;
    }
    
    protected final boolean isHashCode(final Method method, final Object[] array) {
        method.getClass();
        return atnh.c((Object)method.getName(), (Object)"hashCode") && method.getReturnType().equals(Integer.TYPE) && array == null;
    }
    
    protected final boolean isTest(final Method method, final Object[] array) {
        method.getClass();
        return atnh.c((Object)method.getName(), (Object)"test") && method.getReturnType().equals(Boolean.TYPE) && array != null && array.length == 1;
    }
    
    protected final boolean isToString(final Method method, final Object[] array) {
        method.getClass();
        return atnh.c((Object)method.getName(), (Object)"toString") && method.getReturnType().equals(String.class) && array == null;
    }
}
