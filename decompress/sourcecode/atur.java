import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atur
{
    private static final int a;
    private static final atuo b;
    
    static {
        a = c(Throwable.class, -1);
        atvo a3;
        try {
            if (!atus.a) {
                final atul a2 = atul.a;
            }
        }
        finally {
            a3 = atvo.a;
        }
        b = a3;
    }
    
    public static final Throwable a(Throwable a) {
        a.getClass();
        if (a instanceof atpr) {
            Object g;
            try {
                a = ((atpr)a).a();
            }
            finally {
                g = arxj.g(a);
            }
            Object o = g;
            if (g instanceof atjq) {
                o = null;
            }
            return (Throwable)o;
        }
        return (Throwable)atur.b.a(a.getClass()).invoke((Object)a);
    }
    
    public static final atml b(final Class clazz) {
        final atoq e = atoq.e;
        if (atur.a != c(clazz, 0)) {
            return (atml)e;
        }
        final Constructor[] constructors = clazz.getConstructors();
        final zox zox = new zox(19);
        constructors.getClass();
        final int length = constructors.length;
        Constructor[] array = constructors;
        if (length != 0) {
            final Constructor[] copy = Arrays.copyOf(constructors, length);
            copy.getClass();
            array = copy;
            if (copy.length > 1) {
                Arrays.sort(copy, (Comparator<? super Constructor>)zox);
                array = copy;
            }
        }
        for (final Constructor constructor : aqqn.w((Object[])array)) {
            final Class[] parameterTypes = constructor.getParameterTypes();
            final int length2 = parameterTypes.length;
            Object o;
            if (length2 != 0) {
                final atml atml = null;
                if (length2 != 1) {
                    if (length2 != 2) {
                        o = atml;
                    }
                    else {
                        o = atml;
                        if (atnh.c((Object)parameterTypes[0], (Object)String.class)) {
                            o = atml;
                            if (atnh.c((Object)parameterTypes[1], (Object)Throwable.class)) {
                                o = new atjw((Constructor)constructor, 6);
                            }
                        }
                    }
                }
                else {
                    final Class clazz2 = parameterTypes[0];
                    if (atnh.c((Object)clazz2, (Object)Throwable.class)) {
                        o = new atjw((Constructor)constructor, 7);
                    }
                    else {
                        o = atml;
                        if (atnh.c((Object)clazz2, (Object)String.class)) {
                            o = new atjw((Constructor)constructor, 8);
                        }
                    }
                }
            }
            else {
                o = new atjw((Constructor)constructor, 9);
            }
            if (o != null) {
                return (atml)o;
            }
        }
        return (atml)e;
    }
    
    private static final int c(Class clazz, final int n) {
        atno.b((Class)clazz);
        int n2 = 0;
        Object g = null;
        try {
            Class superclass;
            int n5;
            do {
                final Field[] declaredFields = clazz.getDeclaredFields();
                final int length = declaredFields.length;
                int i = 0;
                int n3 = 0;
                while (i < length) {
                    int n4 = n3;
                    if (!Modifier.isStatic(declaredFields[i].getModifiers())) {
                        n4 = n3 + 1;
                    }
                    ++i;
                    n3 = n4;
                }
                n5 = n2 + n3;
                superclass = clazz.getSuperclass();
                n2 = n5;
            } while ((clazz = superclass) != null);
            n5;
        }
        finally {
            final Throwable t;
            g = arxj.g(t);
        }
        Number value = (Number)g;
        if (g instanceof atjq) {
            value = n;
        }
        return value.intValue();
    }
}
