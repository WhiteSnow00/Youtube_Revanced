import java.io.IOException;
import java.util.Iterator;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqws implements aqwl
{
    private final String a;
    private final aqwl b;
    private aqwz c;
    private aqwz d;
    private aqwz e;
    private long f;
    private long g;
    private final long h;
    private final MessageDigest i;
    private boolean j;
    private int k;
    
    public aqws(final String a, final String s, final aqwo aqwo, final aqwl b, final MessageDigest i) {
        this.a = a;
        this.b = b;
        this.i = i;
        this.k = 1;
        this.f = 0L;
        this.g = 0L;
        final StringBuilder sb = new StringBuilder("--");
        sb.append(a);
        sb.append("\r\nContent-Type: text/plain\r\n\r\n");
        sb.append(s);
        sb.append("\r\n");
        this.c = new aqwz(sb.toString());
        final StringBuilder sb2 = new StringBuilder("--");
        sb2.append(a);
        sb2.append("\r\n");
        for (final String s2 : aqwo.c()) {
            sb2.append(s2);
            sb2.append(": ");
            sb2.append(aqwo.a(s2));
            sb2.append("\r\n");
        }
        if (this.b.a() >= 0L && aqwo.b("content-length").isEmpty()) {
            sb2.append("Content-Length: ");
            sb2.append(this.b.a());
            sb2.append("\r\n");
        }
        sb2.append("\r\n");
        this.d = new aqwz(sb2.toString());
        if (b.a() != -1L && i == null) {
            this.e = this.j();
            this.h = this.c.a() + this.d.a() + b.a() + this.e.a();
            return;
        }
        this.h = -1L;
    }
    
    private final aqwz j() {
        final StringBuilder sb = new StringBuilder("\r\n--");
        sb.append(this.a);
        final MessageDigest i = this.i;
        if (i != null && (i.getAlgorithm().equalsIgnoreCase("md5") || this.i.getAlgorithm().equalsIgnoreCase("sha-1"))) {
            sb.append("\r\n\r\nX-Goog-Hash:");
            if (this.i.getAlgorithm().equalsIgnoreCase("md5")) {
                sb.append(" md5=");
            }
            else {
                sb.append(" sha1=");
            }
            sb.append(afoy.d.i(this.i.digest()));
            sb.append("\r\n--");
            sb.append(this.a);
            sb.append("--");
            return new aqwz(sb.toString());
        }
        sb.append("--");
        return new aqwz(sb.toString());
    }
    
    public final long a() {
        return this.h;
    }
    
    public final int b(final byte[] array, final int n, final int n2) {
        if (this.j) {
            throw new IOException("Trying to read from an already-closed stream.");
        }
        adkp.I(array.length - n >= n2, (Object)"Buffer length must be greater than or equal to desired number of bytes.");
        if (n2 == 0) {
            return 0;
        }
        final long f = this.f;
        while (true) {
            final long f2 = this.f;
            if (f2 != f) {
                return (int)(f2 - f);
            }
            int k = this.k;
            final int n3 = k - 1;
            Object o = null;
            if (k == 0) {
                throw null;
            }
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 == 4) {
                                return 0;
                            }
                        }
                        else {
                            if (this.e == null) {
                                this.e = this.j();
                            }
                            o = this.e;
                            k = 5;
                        }
                    }
                    else {
                        o = this.b;
                        k = 4;
                    }
                }
                else {
                    o = this.d;
                    k = 3;
                }
            }
            else {
                o = this.c;
                k = 2;
            }
            this.f += ((aqwl)o).b(array, n, n2);
            if (((aqwl)o).d() < Long.MAX_VALUE) {
                ((aqwl)o).g();
            }
            if (((aqwl)o).i()) {
                continue;
            }
            this.k = k;
        }
    }
    
    public final long c() {
        return this.g;
    }
    
    public final void close() {
        this.j = true;
        this.b.close();
    }
    
    public final long d() {
        return Long.MAX_VALUE;
    }
    
    public final long e() {
        return this.f;
    }
    
    public final long f(final long n) {
        throw new UnsupportedOperationException("Cannot call skip.");
    }
    
    public final void g() {
        this.g = this.f;
    }
    
    public final void h() {
        throw new UnsupportedOperationException("Cannot call rewind.");
    }
    
    public final boolean i() {
        return this.k != 5;
    }
}
