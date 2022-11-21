// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

final class ConsumerAdapter$ConsumerHandler implements InvocationHandler
{
    private final atrt clazz;
    private final atqd consumer;
    
    public ConsumerAdapter$ConsumerHandler(final atrt clazz, final atqd consumer) {
        clazz.getClass();
        consumer.getClass();
        this.clazz = clazz;
        this.consumer = consumer;
    }
    
    private final boolean isAccept(final Method method, final Object[] array) {
        return atqz.c(method.getName(), "accept") && array != null && array.length == 1;
    }
    
    private final boolean isEquals(final Method method, final Object[] array) {
        return atqz.c(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && array != null && array.length == 1;
    }
    
    private final boolean isHashCode(final Method method, final Object[] array) {
        return atqz.c(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && array == null;
    }
    
    private final boolean isToString(final Method method, final Object[] array) {
        return atqz.c(method.getName(), "toString") && method.getReturnType().equals(String.class) && array == null;
    }
    
    @Override
    public Object invoke(Object o, final Method method, final Object[] array) {
        o.getClass();
        method.getClass();
        final boolean accept = this.isAccept(method, array);
        final Object o2 = null;
        final Object o3 = null;
        boolean b = false;
        Object o4;
        if (accept) {
            final atrt clazz = this.clazz;
            o = o3;
            if (array != null) {
                o = array[0];
            }
            asbp.f(clazz, o);
            this.invokeAccept(o);
            o4 = atnn.a;
        }
        else if (this.isEquals(method, array)) {
            Object o5 = o2;
            if (array != null) {
                o5 = array[0];
            }
            if (o == o5) {
                b = true;
            }
            o4 = b;
        }
        else if (this.isHashCode(method, array)) {
            o4 = this.consumer.hashCode();
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
            o4 = this.consumer.toString();
        }
        return o4;
    }
    
    public final void invokeAccept(final Object o) {
        o.getClass();
        this.consumer.invoke(o);
    }
}
