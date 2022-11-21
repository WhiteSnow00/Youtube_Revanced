// 
// Decompiled by Procyon v0.6.0
// 

public final class atpq
{
    public static final int a = 0;
    
    static {
        final String property = System.getProperty("java.specification.version");
        final int n = 65542;
        int n2;
        if (property == null) {
            n2 = n;
        }
        else {
            final int s = auop.s((CharSequence)property, '.', 0, 6);
            if (s < 0) {
                try {
                    n2 = Integer.parseInt(property) * 65536;
                }
                catch (final NumberFormatException ex) {
                    n2 = n;
                }
            }
            else {
                final int n3 = s + 1;
                int n4;
                if ((n4 = auop.s((CharSequence)property, '.', n3, 4)) < 0) {
                    n4 = property.length();
                }
                final String substring = property.substring(0, s);
                substring.getClass();
                final String substring2 = property.substring(n3, n4);
                substring2.getClass();
                n2 = Integer.parseInt(substring) * 65536 + Integer.parseInt(substring2);
            }
        }
        Label_0374: {
            if (n2 < 65544) {
                if (n2 >= 65536) {
                    break Label_0374;
                }
            }
            try {
                final Object instance = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                instance.getClass();
                try {
                    final atpp atpp = (atpp)instance;
                    return;
                }
                catch (final ClassCastException ex2) {
                    final ClassLoader classLoader = ((atpp)instance).getClass().getClassLoader();
                    final ClassLoader classLoader2 = atpp.class.getClassLoader();
                    if (!atqz.c(classLoader, classLoader2)) {
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
                        final atpp atpp2 = (atpp)instance2;
                        return;
                    }
                    catch (final ClassCastException ex4) {
                        final ClassLoader classLoader3 = ((atpp)instance2).getClass().getClassLoader();
                        final ClassLoader classLoader4 = atpp.class.getClassLoader();
                        if (!atqz.c(classLoader3, classLoader4)) {
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
                final atpp atpp3 = (atpp)instance3;
            }
            catch (final ClassCastException ex6) {
                final ClassLoader classLoader5 = ((atpp)instance3).getClass().getClassLoader();
                final ClassLoader classLoader6 = atpp.class.getClassLoader();
                if (!atqz.c(classLoader5, classLoader6)) {
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
                    final atpp atpp4 = (atpp)instance4;
                }
                catch (final ClassCastException ex8) {
                    final ClassLoader classLoader7 = ((atpp)instance4).getClass().getClassLoader();
                    final ClassLoader classLoader8 = atpp.class.getClassLoader();
                    if (!atqz.c(classLoader7, classLoader8)) {
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
