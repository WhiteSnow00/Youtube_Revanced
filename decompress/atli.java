// 
// Decompiled by Procyon v0.6.0
// 

public enum atli
{
    a;
    
    private static final atli[] b;
    
    public static Object a(final asln asln) {
        return new atlf(asln);
    }
    
    public static Object b(final Throwable t) {
        return new atlg(t);
    }
    
    public static Object c(final aunb aunb) {
        return new atlh(aunb);
    }
    
    public static Throwable d(final Object o) {
        return ((atlg)o).a;
    }
    
    public static boolean e(final Object o, final asku asku) {
        if (o == atli.a) {
            asku.tw();
            return true;
        }
        if (o instanceof atlg) {
            asku.b(((atlg)o).a);
            return true;
        }
        asku.tt(o);
        return false;
    }
    
    public static boolean f(final Object o, final asku asku) {
        if (o == atli.a) {
            asku.tw();
            return true;
        }
        if (o instanceof atlg) {
            asku.b(((atlg)o).a);
            return true;
        }
        if (o instanceof atlf) {
            asku.d(((atlf)o).a);
            return false;
        }
        asku.tt(o);
        return false;
    }
    
    public static boolean g(final Object o) {
        return o == atli.a;
    }
    
    public static boolean h(final Object o) {
        return o instanceof atlg;
    }
    
    @Override
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
