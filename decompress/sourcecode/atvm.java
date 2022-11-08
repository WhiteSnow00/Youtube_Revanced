// 
// Decompiled by Procyon v0.6.0
// 

public final class atvm
{
    public static final atvj a;
    private static final atmp b;
    private static final atmp c;
    private static final atmp d;
    
    static {
        a = new atvj("NO_THREAD_ELEMENTS");
        b = (atmp)atlh.g;
        c = (atmp)atlh.h;
        d = (atmp)atlh.i;
    }
    
    public static final Object a(final atli atli) {
        atli.getClass();
        final Object fold = atli.fold((Object)0, atvm.b);
        fold.getClass();
        return fold;
    }
    
    public static final Object b(final atli atli, final Object o) {
        atli.getClass();
        Object a = o;
        if (o == null) {
            a = a(atli);
        }
        Object o2;
        if (a == Integer.valueOf(0)) {
            o2 = atvm.a;
        }
        else if (a instanceof Integer) {
            o2 = atli.fold((Object)new atvn(atli, ((Number)a).intValue()), atvm.d);
        }
        else {
            o2 = ((atru)a).tG(atli);
        }
        return o2;
    }
    
    public static final void c(final atli atli, final Object o) {
        atli.getClass();
        if (o == atvm.a) {
            return;
        }
        if (o instanceof atvn) {
            final atvn atvn = (atvn)o;
            int n = atvn.c.length - 1;
            if (n >= 0) {
                while (true) {
                    final int n2 = n - 1;
                    final atru atru = atvn.c[n];
                    atru.getClass();
                    atru.tH(atvn.b[n]);
                    if (n2 < 0) {
                        break;
                    }
                    n = n2;
                }
            }
            return;
        }
        final Object fold = atli.fold((Object)null, atvm.c);
        fold.getClass();
        ((atru)fold).tH(o);
    }
}
