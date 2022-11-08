import java.lang.reflect.Method;
import java.util.Arrays;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.lang.reflect.Field;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class as
{
    public static final Set a;
    public static final boolean b;
    
    static {
        a = new HashSet();
        final String property = System.getProperty("java.vm.version");
        boolean b3;
        final boolean b2 = b3 = false;
        while (true) {
            if (property == null) {
                break Label_0119;
            }
            final StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            final boolean hasMoreTokens = stringTokenizer.hasMoreTokens();
            String nextToken = null;
            String nextToken2;
            if (hasMoreTokens) {
                nextToken2 = stringTokenizer.nextToken();
            }
            else {
                nextToken2 = null;
            }
            if (stringTokenizer.hasMoreTokens()) {
                nextToken = stringTokenizer.nextToken();
            }
            b3 = b2;
            if (nextToken2 == null) {
                break Label_0119;
            }
            b3 = b2;
            if (nextToken == null) {
                break Label_0119;
            }
            try {
                final int int1 = Integer.parseInt(nextToken2);
                final int int2 = Integer.parseInt(nextToken);
                if (int1 <= 2) {
                    b3 = b2;
                    if (int1 != 2) {
                        break Label_0119;
                    }
                    b3 = b2;
                    if (int2 <= 0) {
                        break Label_0119;
                    }
                }
                b3 = true;
                b = b3;
            }
            catch (final NumberFormatException ex) {
                b3 = b2;
                continue;
            }
            break;
        }
    }
    
    public static Field a(Object o, final String s) {
        Class<?> clazz = o.getClass();
        while (clazz != null) {
            try {
                final Field declaredField = clazz.getDeclaredField(s);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            }
            catch (final NoSuchFieldException ex) {
                clazz = clazz.getSuperclass();
                continue;
            }
            break;
        }
        final StringBuilder sb = new StringBuilder("Field ");
        sb.append(s);
        sb.append(" not found in ");
        sb.append(o.getClass());
        o = new NoSuchFieldException(sb.toString());
        throw o;
    }
    
    public static void b(ClassLoader classLoader, File a, List array) {
        if (!((List)array).isEmpty()) {
            final Object value = a(classLoader, "pathList").get(classLoader);
            final ArrayList list = new ArrayList();
            Object componentType = new ArrayList((Collection<?>)array);
            array = new Class[] { ArrayList.class, File.class, ArrayList.class };
            classLoader = (ClassLoader)value.getClass();
            while (classLoader != null) {
                try {
                    final Method declaredMethod = ((Class)classLoader).getDeclaredMethod("makeDexElements", (Class<?>[])array);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    array = (Object[])declaredMethod.invoke(value, componentType, a, list);
                    classLoader = (ClassLoader)a(value, "dexElements");
                    a = (File)((Field)classLoader).get(value);
                    componentType = a.getClass().getComponentType();
                    final int length = a.length;
                    final int length2 = ((Class<?>[])array).length;
                    componentType = Array.newInstance((Class<?>)componentType, length + length2);
                    System.arraycopy(a, 0, componentType, 0, length);
                    System.arraycopy(array, 0, componentType, length, length2);
                    ((Field)classLoader).set(value, componentType);
                    if (list.size() > 0) {
                        for (int size = list.size(), i = 0; i < size; ++i) {
                            Log.w("MultiDex", "Exception in makeDexElement", (Throwable)list.get(i));
                        }
                        a = (File)a(value, "dexElementsSuppressedExceptions");
                        array = (IOException[])((Field)a).get(value);
                        if (array == null) {
                            classLoader = (ClassLoader)(Object)list.toArray(new IOException[list.size()]);
                        }
                        else {
                            final int size2 = list.size();
                            final int length3 = ((Class<?>[])array).length;
                            classLoader = (ClassLoader)(Object)new IOException[size2 + length3];
                            list.toArray((Object[])(Object)classLoader);
                            System.arraycopy(array, 0, classLoader, list.size(), length3);
                        }
                        ((Field)a).set(value, classLoader);
                        classLoader = (ClassLoader)new IOException("I/O exception during makeDexElement");
                        ((Throwable)classLoader).initCause((Throwable)list.get(0));
                        throw classLoader;
                    }
                    return;
                }
                catch (final NoSuchMethodException ex) {
                    classLoader = (ClassLoader)((Class<Object>)classLoader).getSuperclass();
                    continue;
                }
                break;
            }
            final StringBuilder sb = new StringBuilder("Method makeDexElements with parameters ");
            sb.append(Arrays.asList((Class<?>[])array));
            sb.append(" not found in ");
            sb.append(value.getClass());
            throw new NoSuchMethodException(sb.toString());
        }
    }
    
    public static void c(final File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            final File parentFile = file.getParentFile();
            if (parentFile == null) {
                final StringBuilder sb = new StringBuilder("Failed to create dir ");
                sb.append(file.getPath());
                sb.append(". Parent file is null.");
                Log.e("MultiDex", sb.toString());
            }
            else {
                final StringBuilder sb2 = new StringBuilder("Failed to create dir ");
                sb2.append(file.getPath());
                sb2.append(". parent file is a dir ");
                sb2.append(parentFile.isDirectory());
                sb2.append(", a file ");
                sb2.append(parentFile.isFile());
                sb2.append(", exists ");
                sb2.append(parentFile.exists());
                sb2.append(", readable ");
                sb2.append(parentFile.canRead());
                sb2.append(", writable ");
                sb2.append(parentFile.canWrite());
                Log.e("MultiDex", sb2.toString());
            }
            throw new IOException("Failed to create directory ".concat(String.valueOf(file.getPath())));
        }
    }
}
