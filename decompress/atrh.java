import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atrh
{
    public static void a(Object o, final String s) {
        String name;
        if (o == null) {
            name = "null";
        }
        else {
            name = o.getClass().getName();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(s);
        o = new ClassCastException(sb.toString());
        atqz.d((Throwable)o, atrh.class.getName());
        throw o;
    }
    
    public static boolean b(final Object o, final int n) {
        if (o instanceof atnc) {
            int arity;
            if (o instanceof atqw) {
                arity = ((atqw)o).getArity();
            }
            else if (o instanceof atps) {
                arity = 0;
            }
            else if (o instanceof atqd) {
                arity = 1;
            }
            else if (o instanceof atqh) {
                arity = 2;
            }
            else if (o instanceof atqi) {
                arity = 3;
            }
            else if (o instanceof atqj) {
                arity = 4;
            }
            else if (o instanceof atqk) {
                arity = 5;
            }
            else if (o instanceof atql) {
                arity = 6;
            }
            else if (o instanceof atqm) {
                arity = 7;
            }
            else if (o instanceof atqn) {
                arity = 8;
            }
            else if (o instanceof atqo) {
                arity = 9;
            }
            else if (o instanceof atpt) {
                arity = 10;
            }
            else if (o instanceof atpu) {
                arity = 11;
            }
            else if (o instanceof atpv) {
                arity = 12;
            }
            else if (o instanceof atpw) {
                arity = 13;
            }
            else if (o instanceof atpx) {
                arity = 14;
            }
            else if (o instanceof atpy) {
                arity = 15;
            }
            else if (o instanceof atpz) {
                arity = 16;
            }
            else if (o instanceof atqa) {
                arity = 17;
            }
            else if (o instanceof atqb) {
                arity = 18;
            }
            else if (o instanceof atqc) {
                arity = 19;
            }
            else if (o instanceof atqe) {
                arity = 20;
            }
            else if (o instanceof atqf) {
                arity = 21;
            }
            else if (o instanceof atqg) {
                arity = 22;
            }
            else {
                arity = -1;
            }
            if (arity == n) {
                return true;
            }
        }
        return false;
    }
    
    public static void c(final Object o, final int n) {
        if (!b(o, n)) {
            final StringBuilder sb = new StringBuilder("kotlin.jvm.functions.Function");
            sb.append(n);
            a(o, sb.toString());
        }
    }
    
    public static int d(final float n) {
        if (!Float.isNaN(n)) {
            return Math.round(n);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
    
    public static boolean e(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
}
