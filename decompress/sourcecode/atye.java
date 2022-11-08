import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atye
{
    public static int a(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static int b(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static Object c(final atlf atlf, final Object o, final atmp atmp) {
        atmp.getClass();
        return atmp.invoke(o, (Object)atlf);
    }
    
    public static atlf d(final atlf atlf, final atlg atlg) {
        atlg.getClass();
        if (atnh.c((Object)atlf.getKey(), (Object)atlg)) {
            atlf.getClass();
            return atlf;
        }
        return null;
    }
    
    public static atli e(final atlf atlf, final atlg atlg) {
        atlg.getClass();
        Object a = atlf;
        if (atnh.c((Object)atlf.getKey(), (Object)atlg)) {
            a = atlj.a;
        }
        return (atli)a;
    }
    
    public static atli f(final atlf atlf, final atli atli) {
        atli.getClass();
        return atxk.c((atli)atlf, atli);
    }
}
