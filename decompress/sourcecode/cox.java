import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.lang.reflect.Field;
import java.lang.annotation.Annotation;
import android.net.Uri;
import android.app.job.JobParameters;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cox
{
    public static Uri[] a(final JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }
    
    public static String[] b(final JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }
    
    public static final cqp c(final cqv cqv, final int n) {
        return new cqp(cqv.a, cqv.b, n);
    }
    
    public static dvl d(final dsw dsw, final Exception ex) {
        if (ex instanceof dvl) {
            return (dvl)ex;
        }
        return new dvl(dsw, (Throwable)ex);
    }
    
    public static void e(final dsw dsw, final duj duj) {
        final dum e = dsw.e();
        if (e != null) {
            e.ls(duj);
        }
    }
    
    public static void f(final dsw dsw, final Exception a) {
        final duj duj = new duj();
        duj.a = a;
        e(dsw, duj);
    }
    
    public static void g(final dsw dsw, final Exception ex) {
        try {
            f(dsw, ex);
        }
        catch (final Exception ex) {
            throw d(dsw, ex);
        }
        catch (final dwk dwk) {
            throw d(dsw, ex);
        }
    }
    
    public static void h(Exception a) {
        if (a instanceof dwk) {
            a = ((dwk)a).a;
            h(null);
            return;
        }
        if (a instanceof RuntimeException) {
            throw (RuntimeException)a;
        }
        throw new RuntimeException(a);
    }
    
    public static boolean i(final Object o, final Object o2) {
        if (o.getClass() == o2.getClass()) {
            final Field[] declaredFields = o.getClass().getDeclaredFields();
            final int length = declaredFields.length;
            int i = 0;
            while (i < length) {
                final Field field = declaredFields[i];
                Label_0106: {
                    if (!field.isAnnotationPresent(dyh.class)) {
                        break Label_0106;
                    }
                    final Class<?> type = field.getType();
                    try {
                        field.setAccessible(true);
                        final Object value = field.get(o);
                        final Object value2 = field.get(o2);
                        field.setAccessible(false);
                        final boolean a = dyo.a;
                        if (!o(field, type, value, value2)) {
                            return false;
                        }
                        ++i;
                        continue;
                    }
                    catch (final IllegalAccessException ex) {
                        throw new IllegalStateException("Unable to get fields by reflection.", ex);
                    }
                }
                break;
            }
            return true;
        }
        throw new IllegalArgumentException("The input is invalid.");
    }
    
    public static boolean j(final dwq dwq, final dwq dwq2) {
        return (dwq == null && dwq2 == null) || (dwq != null && dwq2 != null && i(dwq, dwq2));
    }
    
    public static boolean k(final dss dss, final dss dss2) {
        return dss == dss2 || (dss != null && dss2 != null && dss.getClass().equals(dss2.getClass()));
    }
    
    public static String l(final dss dss) {
        if (dss == null) {
            return null;
        }
        return dss.D(dss);
    }
    
    public static String m(final dsw dsw) {
        if (dsw == null) {
            return "ComponentContext is null";
        }
        final dto d = dto.d(dsw.h);
        if (d == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        p(d, 0, sb);
        return sb.toString();
    }
    
    private static boolean n(final int n, final Collection collection, final Collection collection2) {
        if (n <= 0) {
            throw new IllegalArgumentException("Level cannot be < 1");
        }
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection != null && collection2 != null && collection.size() == collection2.size()) {
            final Iterator iterator = collection.iterator();
            final Iterator iterator2 = collection2.iterator();
            while (iterator.hasNext() && iterator2.hasNext()) {
                if (n == 1) {
                    if (!((dss)iterator.next()).f((dss)iterator2.next())) {
                        return false;
                    }
                    continue;
                }
                else {
                    if (!n(n - 1, (Collection)iterator.next(), (Collection)iterator2.next())) {
                        return false;
                    }
                    continue;
                }
            }
            return true;
        }
        return false;
    }
    
    private static boolean o(final Field field, final Class clazz, final Object o, final Object o2) {
        try {
            final int a = field.getAnnotation(dyh.class).a();
            switch (a) {
                case 15: {
                    if (o != null) {
                        if (((dui)o).a(o2)) {
                            break;
                        }
                    }
                    else if (o2 == null) {
                        break;
                    }
                    return false;
                }
                case 13: {
                    if (o != null) {
                        if (o.equals(o2)) {
                            break;
                        }
                    }
                    else if (o2 == null) {
                        break;
                    }
                    return false;
                }
                case 11:
                case 12: {
                    if (o != null) {
                        if (((dum)o).c((dum)o2)) {
                            break;
                        }
                    }
                    else if (o2 == null) {
                        break;
                    }
                    return false;
                }
                case 10: {
                    if (o != null) {
                        if (((dss)o).f((dss)o2)) {
                            break;
                        }
                    }
                    else if (o2 == null) {
                        break;
                    }
                    return false;
                }
                case 6:
                case 7:
                case 8:
                case 9: {
                    if (!n(a - 5, (Collection)o, (Collection)o2)) {
                        return false;
                    }
                    break;
                }
                case 5: {
                    final Collection collection = (Collection)o;
                    final Collection collection2 = (Collection)o2;
                    if (collection != null) {
                        if (collection.equals(collection2)) {
                            break;
                        }
                    }
                    else if (collection2 == null) {
                        break;
                    }
                    return false;
                }
                case 4: {
                    if (!((dzj)o).a((dzj)o2)) {
                        return false;
                    }
                    break;
                }
                case 3: {
                    if (!o.equals(o2)) {
                        return false;
                    }
                    break;
                }
                case 2: {
                    final Class componentType = clazz.getComponentType();
                    if (Byte.TYPE.isAssignableFrom(componentType)) {
                        if (Arrays.equals((byte[])o, (byte[])o2)) {
                            break;
                        }
                    }
                    else if (Short.TYPE.isAssignableFrom(componentType)) {
                        if (Arrays.equals((short[])o, (short[])o2)) {
                            break;
                        }
                    }
                    else if (Character.TYPE.isAssignableFrom(componentType)) {
                        if (Arrays.equals((char[])o, (char[])o2)) {
                            break;
                        }
                    }
                    else if (Integer.TYPE.isAssignableFrom(componentType)) {
                        if (Arrays.equals((int[])o, (int[])o2)) {
                            break;
                        }
                    }
                    else if (Long.TYPE.isAssignableFrom(componentType)) {
                        if (Arrays.equals((long[])o, (long[])o2)) {
                            break;
                        }
                    }
                    else if (Float.TYPE.isAssignableFrom(componentType)) {
                        if (Arrays.equals((float[])o, (float[])o2)) {
                            break;
                        }
                    }
                    else if (Double.TYPE.isAssignableFrom(componentType)) {
                        if (Arrays.equals((double[])o, (double[])o2)) {
                            break;
                        }
                    }
                    else if (Boolean.TYPE.isAssignableFrom(componentType)) {
                        if (Arrays.equals((boolean[])o, (boolean[])o2)) {
                            break;
                        }
                    }
                    else if (Arrays.equals((Object[])o, (Object[])o2)) {
                        break;
                    }
                    return false;
                }
                case 1: {
                    if (Double.compare((double)o, (double)o2) != 0) {
                        return false;
                    }
                    break;
                }
                case 0: {
                    if (Float.compare((float)o, (float)o2) != 0) {
                        return false;
                    }
                    break;
                }
            }
            return true;
        }
        catch (final IncompatibleClassChangeError | NullPointerException ex) {
            return false;
        }
    }
    
    private static void p(dto dto, final int n, final StringBuilder sb) {
        if (dto == null) {
            return;
        }
        sb.append(dto.b().q());
        sb.append('{');
        final dvt f = dto.f();
        final bhu n2 = dto.n();
        String s;
        if (f != null && f.getVisibility() == 0) {
            s = "V";
        }
        else {
            s = "H";
        }
        sb.append(s);
        if (n2 != null && n2.m() != null) {
            sb.append(" [clickable]");
        }
        if (n2 != null) {
            sb.append(" ");
            final eha as = ((duz)n2.a).as();
            final float n3 = -1.0f;
            float b;
            if (as != null) {
                b = as.b();
            }
            else {
                b = -1.0f;
            }
            sb.append(b);
            sb.append("x");
            final eha as2 = ((duz)n2.a).as();
            float a = n3;
            if (as2 != null) {
                a = as2.a();
            }
            sb.append(a);
        }
        sb.append('}');
        final Iterator iterator = dto.k().iterator();
        while (iterator.hasNext()) {
            dto = (dto)iterator.next();
            sb.append("\n");
            for (int i = 0; i <= n; ++i) {
                sb.append("  ");
            }
            p(dto, n + 1, sb);
        }
    }
}
