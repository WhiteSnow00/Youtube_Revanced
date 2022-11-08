// 
// Decompiled by Procyon v0.6.0
// 

public enum atht
{
    a;
    
    public static Object a(final asic asic) {
        return new athq(asic);
    }
    
    public static Object b(final Throwable t) {
        return new athr(t);
    }
    
    public static Object c(final aujq aujq) {
        return new aths(aujq);
    }
    
    public static Throwable d(final Object o) {
        return ((athr)o).a;
    }
    
    public static boolean e(final Object o, final ashj ashj) {
        if (o == atht.a) {
            ashj.tu();
            return true;
        }
        if (o instanceof athr) {
            ashj.b(((athr)o).a);
            return true;
        }
        ashj.tr(o);
        return false;
    }
    
    public static boolean f(final Object o, final ashj ashj) {
        if (o == atht.a) {
            ashj.tu();
            return true;
        }
        if (o instanceof athr) {
            ashj.b(((athr)o).a);
            return true;
        }
        if (o instanceof athq) {
            ashj.d(((athq)o).a);
            return false;
        }
        ashj.tr(o);
        return false;
    }
    
    public static boolean g(final Object o) {
        return o == atht.a;
    }
    
    public static boolean h(final Object o) {
        return o instanceof athr;
    }
    
    @Override
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
