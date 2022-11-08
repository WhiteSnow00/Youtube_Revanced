// 
// Decompiled by Procyon v0.6.0
// 

public class by
{
    private static final abn a;
    
    static {
        a = new abn();
    }
    
    public static Class a(final ClassLoader classLoader, final String s) {
        try {
            return d(classLoader, s);
        }
        catch (final ClassCastException ex) {
            final StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(s);
            sb.append(": make sure class is a valid subclass of Fragment");
            throw new bp(sb.toString(), (Exception)ex);
        }
        catch (final ClassNotFoundException ex2) {
            final StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(s);
            sb2.append(": make sure class name exists");
            throw new bp(sb2.toString(), (Exception)ex2);
        }
    }
    
    static boolean b(final ClassLoader classLoader, final String s) {
        try {
            return br.class.isAssignableFrom(d(classLoader, s));
        }
        catch (final ClassNotFoundException ex) {
            return false;
        }
    }
    
    private static Class d(final ClassLoader classLoader, final String s) {
        final abn a = by.a;
        abn abn;
        if ((abn = (abn)a.get((Object)classLoader)) == null) {
            abn = new abn();
            a.put((Object)classLoader, (Object)abn);
        }
        final Class clazz = (Class)abn.get((Object)s);
        if (clazz == null) {
            final Class<?> forName = Class.forName(s, false, classLoader);
            abn.put((Object)s, (Object)forName);
            return forName;
        }
        return clazz;
    }
    
    public br c(final String s) {
        throw null;
    }
}
