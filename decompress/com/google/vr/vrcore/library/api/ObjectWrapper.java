// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.library.api;

import java.lang.reflect.Field;
import android.os.IBinder;

public final class ObjectWrapper extends arbk
{
    private final Object wrappedObject;
    
    private ObjectWrapper(final Object wrappedObject) {
        this.wrappedObject = wrappedObject;
    }
    
    public static arbl a(final Object o) {
        return (arbl)new ObjectWrapper(o);
    }
    
    public static Object b(final arbl arbl, final Class clazz) {
        if (arbl == null) {
            return null;
        }
        if (arbl instanceof ObjectWrapper) {
            return ((ObjectWrapper)arbl).wrappedObject;
        }
        final IBinder binder = arbl.asBinder();
        final Field[] declaredFields = binder.getClass().getDeclaredFields();
        final int length = declaredFields.length;
        int n = 0;
        Field field = null;
        Field field2;
        while (true) {
            field2 = field;
            if (n >= length) {
                break;
            }
            final Field field3 = declaredFields[n];
            if (!field3.isSynthetic()) {
                if (field != null) {
                    field2 = null;
                    break;
                }
                field = field3;
            }
            ++n;
        }
        if (field2 != null) {
            if (!field2.isAccessible()) {
                field2.setAccessible(true);
                try {
                    final Object value = field2.get(binder);
                    if (value == null) {
                        return null;
                    }
                    if (clazz.isInstance(value)) {
                        return clazz.cast(value);
                    }
                    throw new IllegalArgumentException("remoteBinder is the wrong class.");
                }
                catch (final IllegalAccessException ex) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", ex);
                }
                catch (final IllegalArgumentException ex2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", ex2);
                }
                catch (final NullPointerException ex3) {
                    throw new IllegalArgumentException("Binder object is null.", ex3);
                }
            }
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
