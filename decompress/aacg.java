import java.util.Map;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aacg implements aach
{
    private vgw a;
    
    public aacg(final vgw a) {
        a.getClass();
        this.a = a;
    }
    
    public final double a(final String s) {
        synchronized (this) {
            return this.r(s);
        }
    }
    
    public final int b(final String s) {
        synchronized (this) {
            return this.c(s, 0);
        }
    }
    
    public final int c(String c, final int n) {
        synchronized (this) {
            c = this.a.c(c);
            if (c == null) {
                return n;
            }
            try {
                return Integer.parseInt(c);
            }
            catch (final NumberFormatException ex) {
                return n;
            }
        }
    }
    
    public final long d(final String s) {
        synchronized (this) {
            return this.e(s, 0L);
        }
    }
    
    public final long e(String c, final long n) {
        synchronized (this) {
            c = this.a.c(c);
            if (c == null) {
                return n;
            }
            try {
                return Long.parseLong(c);
            }
            catch (final NumberFormatException ex) {
                return n;
            }
        }
    }
    
    public final vgw f() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public final String g(String h) {
        synchronized (this) {
            h = this.h(h, null);
            return h;
        }
    }
    
    public final String h(String c, final String s) {
        synchronized (this) {
            if (!this.a.b.a(c)) {
                return s;
            }
            c = this.a.c(c);
            return c;
        }
    }
    
    public final void i(final String s, final boolean b) {
        synchronized (this) {
            final aefs e = this.a.e();
            e.bO(s, Boolean.toString(b));
            this.a = e.bN();
        }
    }
    
    public final void j(final String s, final byte[] array) {
        synchronized (this) {
            final aefs e = this.a.e();
            s.getClass();
            array.getClass();
            try {
                ((ahcr)e.a).aL(s, ahbt.x(array));
                this.a = e.bN();
            }
            catch (final IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    public final void k(final String s, final double n) {
        synchronized (this) {
            final aefs e = this.a.e();
            e.bO(s, Double.toString(n));
            this.a = e.bN();
        }
    }
    
    public final void l(final String s, final int n) {
        synchronized (this) {
            final aefs e = this.a.e();
            e.bO(s, Integer.toString(n));
            this.a = e.bN();
        }
    }
    
    public final void m(final String s, final long n) {
        synchronized (this) {
            final aefs e = this.a.e();
            e.bO(s, Long.toString(n));
            this.a = e.bN();
        }
    }
    
    public final void n(final String s, final String s2) {
        synchronized (this) {
            final aefs e = this.a.e();
            e.bO(s, s2);
            this.a = e.bN();
        }
    }
    
    public final boolean o(final String s) {
        synchronized (this) {
            return this.p(s, false);
        }
    }
    
    public final boolean p(String c, final boolean b) {
        synchronized (this) {
            c = this.a.c(c);
            if (c == null) {
                return b;
            }
            return Boolean.parseBoolean(c);
        }
    }
    
    public final byte[] q(String i) {
        synchronized (this) {
            final vgw a = this.a;
            if (!a.b.a((String)i)) {
                i = null;
                return (byte[])i;
            }
            try {
                final ajsa b = a.b;
                ahbt b2 = ahbt.b;
                i.getClass();
                final ahej b3 = b.b;
                if (((Map)b3).containsKey(i)) {
                    b2 = (ahbt)((Map)b3).get(i);
                }
                i = b2.I();
                return (byte[])i;
            }
            catch (final IOException ex) {
                throw new IllegalStateException(String.format("You might have accessed value with wrong marshaller for key %s", i), ex);
            }
        }
    }
    
    public final double r(String c) {
        synchronized (this) {
            c = this.a.c(c);
            if (c == null) {
                return 0.0;
            }
            try {
                return Double.parseDouble(c);
            }
            catch (final NumberFormatException ex) {
                return 0.0;
            }
        }
    }
    
    public final String s() {
        return afbj.e(this.h("transfer_nonce", ""));
    }
}
