import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atqc
{
    public static final String a(final Object o) {
        o.getClass();
        return o.getClass().getSimpleName();
    }
    
    public static final String b(final Object o) {
        o.getClass();
        return Integer.toHexString(System.identityHashCode(o));
    }
    
    public static final String c(final atld atld) {
        String string;
        if (atld instanceof atup) {
            string = atld.toString();
        }
        else {
            Object o = null;
            try {
                final String b = b(atld);
                final StringBuilder sb = new StringBuilder();
                sb.append(atld);
                sb.append("@");
                sb.append(b);
                sb.toString();
            }
            finally {
                final Throwable t;
                o = arxj.g(t);
            }
            if (atjr.a(o) != null) {
                final String name = atld.getClass().getName();
                final String b2 = b(atld);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append("@");
                sb2.append(b2);
                o = sb2.toString();
            }
            string = (String)o;
        }
        return string;
    }
    
    public static final void d(final atqj atqj, atld o, final boolean b) {
        final Object k = atqj.k();
        final Throwable n = atqj.n(k);
        Object o2;
        if (n != null) {
            o2 = arxj.g(n);
        }
        else {
            o2 = atqj.j(k);
        }
        if (b) {
            final atup atup = (atup)o;
            o = atup.b;
            final Object d = atup.d;
            final atli context = ((atld)o).getContext();
            final Object b2 = atvm.b(context, d);
            if (b2 != atvm.a) {
                o = atpt.c((atld)o, context, b2);
            }
            else {
                o = null;
            }
            try {
                atup.b.resumeWith(o2);
                if (o != null && !((atry)o).M()) {
                    return;
                }
                atvm.c(context, b2);
                return;
            }
            finally {
                if (o == null || ((atry)o).M()) {
                    atvm.c(context, b2);
                }
            }
        }
        ((atld)o).resumeWith(o2);
    }
    
    public static final boolean e(final int n) {
        return n == 1 || n == 2;
    }
    
    public static final atjm f(final atma atma) {
        atma.getClass();
        return (atjm)new atjs(atma);
    }
}
