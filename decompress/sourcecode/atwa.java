import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwa
{
    public static int a(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static final Object b(final atvh atvh, Object o, final atmp atmp) {
        atpm atpm;
        try {
            atnp.c((Object)atmp, 2);
            o = atmp.invoke(o, (Object)atvh);
        }
        finally {
            final Throwable t;
            atpm = new atpm(t);
        }
        final atlk a = atlk.a;
        Object o2;
        if (atpm == a) {
            o2 = a;
        }
        else {
            o = ((atrk)atvh).x((Object)atpm);
            if (o == atrl.b) {
                o2 = atlk.a;
            }
            else if (o instanceof atpm) {
                final Throwable b = ((atpm)o).b;
                final atld e = atvh.e;
                if (atqb.b && e instanceof atlq) {
                    throw atvi.a(b, (atlq)e);
                }
                throw b;
            }
            else {
                o2 = atrl.b(o);
            }
        }
        return o2;
    }
    
    public static final int c(final Comparable comparable, final Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
