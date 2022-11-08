import java.lang.reflect.Field;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefv extends enz implements aefw
{
    private final Object a;
    
    public aefv() {
        super("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
    }
    
    private aefv(final Object a) {
        super("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
        this.a = a;
    }
    
    public static aefw a(final Object o) {
        return (aefw)new aefv(o);
    }
    
    public static Object b(final aefw aefw) {
        if (aefw instanceof aefv) {
            return ((aefv)aefw).a;
        }
        final IBinder binder = aefw.asBinder();
        final Field[] declaredFields = binder.getClass().getDeclaredFields();
        final int length = declaredFields.length;
        int i = 0;
        Field field = null;
        int n = 0;
        while (i < length) {
            final Field field2 = declaredFields[i];
            int n2 = n;
            if (!field2.isSynthetic()) {
                n2 = n + 1;
                field = field2;
            }
            ++i;
            n = n2;
        }
        if (n != 1) {
            final int length2 = declaredFields.length;
            final StringBuilder sb = new StringBuilder("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(binder);
                }
                catch (final IllegalAccessException ex) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", ex);
                }
                catch (final NullPointerException ex2) {
                    throw new IllegalArgumentException("Binder object is null.", ex2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new NullPointerException("null reference");
    }
}
