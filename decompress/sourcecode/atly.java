// 
// Decompiled by Procyon v0.6.0
// 

public final class atly
{
    static {
        final String property = System.getProperty("java.specification.version");
        final int n = 65542;
        int n2;
        if (property == null) {
            n2 = n;
        }
        else {
            final int k = aubt.k(property, '.', 0, 6);
            if (k < 0) {
                try {
                    n2 = Integer.parseInt(property) * 65536;
                }
                catch (final NumberFormatException ex) {
                    n2 = n;
                }
            }
            else {
                final int n3 = k + 1;
                int n4;
                if ((n4 = aubt.k(property, '.', n3, 4)) < 0) {
                    n4 = property.length();
                }
                final String substring = property.substring(0, k);
                substring.getClass();
                final String substring2 = property.substring(n3, n4);
                substring2.getClass();
                n2 = Integer.parseInt(substring) * 65536 + Integer.parseInt(substring2);
            }
        }
        Label_0351: {
            if (n2 < 65544) {
                if (n2 >= 65536) {
                    break Label_0351;
                }
            }
            try {
                final Object instance = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                instance.getClass();
                try {
                    final atlx atlx = (atlx)instance;
                    return;
                }
                catch (final ClassCastException ex2) {
                    final ClassLoader classLoader = ((atlx)instance).getClass().getClassLoader();
                    final ClassLoader classLoader2 = atlx.class.getClassLoader();
                    if (!atnh.c(classLoader, classLoader2)) {
                        final StringBuilder sb = new StringBuilder("Instance class was loaded from a different classloader: ");
                        sb.append(classLoader);
                        sb.append(", base type classloader: ");
                        sb.append(classLoader2);
                        throw new ClassNotFoundException(sb.toString(), ex2);
                    }
                    throw ex2;
                }
            }
            catch (final ClassNotFoundException ex3) {
                try {
                    final Object instance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    instance2.getClass();
                    try {
                        final atlx atlx2 = (atlx)instance2;
                        return;
                    }
                    catch (final ClassCastException ex4) {
                        final ClassLoader classLoader3 = ((atlx)instance2).getClass().getClassLoader();
                        final ClassLoader classLoader4 = atlx.class.getClassLoader();
                        if (!atnh.c(classLoader3, classLoader4)) {
                            final StringBuilder sb2 = new StringBuilder("Instance class was loaded from a different classloader: ");
                            sb2.append(classLoader3);
                            sb2.append(", base type classloader: ");
                            sb2.append(classLoader4);
                            throw new ClassNotFoundException(sb2.toString(), ex4);
                        }
                        throw ex4;
                    }
                }
                catch (final ClassNotFoundException ex5) {}
            }
        }
        if (n2 < 65543) {
            if (n2 >= 65536) {
                return;
            }
        }
        try {
            final Object instance3 = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
            instance3.getClass();
            try {
                final atlx atlx3 = (atlx)instance3;
            }
            catch (final ClassCastException ex6) {
                final ClassLoader classLoader5 = ((atlx)instance3).getClass().getClassLoader();
                final ClassLoader classLoader6 = atlx.class.getClassLoader();
                if (!atnh.c(classLoader5, classLoader6)) {
                    final StringBuilder sb3 = new StringBuilder("Instance class was loaded from a different classloader: ");
                    sb3.append(classLoader5);
                    sb3.append(", base type classloader: ");
                    sb3.append(classLoader6);
                    throw new ClassNotFoundException(sb3.toString(), ex6);
                }
                throw ex6;
            }
        }
        catch (final ClassNotFoundException ex7) {
            try {
                final Object instance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                instance4.getClass();
                try {
                    final atlx atlx4 = (atlx)instance4;
                }
                catch (final ClassCastException ex8) {
                    final ClassLoader classLoader7 = ((atlx)instance4).getClass().getClassLoader();
                    final ClassLoader classLoader8 = atlx.class.getClassLoader();
                    if (!atnh.c(classLoader7, classLoader8)) {
                        final StringBuilder sb4 = new StringBuilder("Instance class was loaded from a different classloader: ");
                        sb4.append(classLoader7);
                        sb4.append(", base type classloader: ");
                        sb4.append(classLoader8);
                        throw new ClassNotFoundException(sb4.toString(), ex8);
                    }
                    throw ex8;
                }
            }
            catch (final ClassNotFoundException ex9) {}
        }
    }
}
