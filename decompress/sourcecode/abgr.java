import android.net.Uri;
import android.graphics.Rect;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public class abgr
{
    protected final int a;
    protected final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    private final int g;
    private final long h;
    private final String i;
    private final String j;
    private final String k;
    private final SparseArray l;
    
    public abgr(final String k, int int1, final String s, final long f) {
        final boolean b = false;
        agot.u(k != null);
        agot.u(s != null);
        agot.u(int1 >= 0);
        agot.u(true);
        this.k = k;
        this.e = int1;
        this.f = f;
        final String[] split = s.split("#", -1);
        agot.u(split.length == 8);
        int1 = Integer.parseInt(split[0]);
        this.a = int1;
        final int int2 = Integer.parseInt(split[1]);
        this.b = int2;
        final int int3 = Integer.parseInt(split[2]);
        this.g = int3;
        final int int4 = Integer.parseInt(split[3]);
        this.c = int4;
        final int int5 = Integer.parseInt(split[4]);
        this.d = int5;
        this.h = Long.parseLong(split[5]);
        this.i = split[6];
        this.j = split[7];
        agot.u(int1 > 0);
        agot.u(int2 > 0);
        if (f > 0L) {
            agot.u(int3 > 0);
        }
        agot.u(int4 > 0);
        boolean b2 = b;
        if (int5 > 0) {
            b2 = true;
        }
        agot.u(b2);
        this.l = new SparseArray();
    }
    
    private final int h() {
        return this.c * this.d;
    }
    
    public int a(final long n) {
        final int c = this.c();
        final long h = this.h;
        int n2;
        if (h == 0L) {
            n2 = Math.round(this.c() * (n / (float)this.f));
        }
        else {
            n2 = Math.round(n / (float)h);
        }
        return Math.max(0, Math.min(c - 1, n2));
    }
    
    public final int b(final int n) {
        return (int)Math.floor(n / this.h());
    }
    
    public int c() {
        return this.g;
    }
    
    public int d() {
        if (this.c() > 0) {
            return (int)Math.ceil(this.c() / (float)this.h());
        }
        return 0;
    }
    
    public final long e() {
        long h;
        if ((h = this.h) == 0L) {
            h = this.f / this.c();
        }
        return h;
    }
    
    public final Rect f(int b) {
        final int h = this.h();
        final int d = this.d;
        final int n = b % h / d;
        final int a = this.a;
        final int n2 = b % d * a;
        b = this.b;
        final int n3 = n * b;
        return new Rect(n2, n3, a + n2 - 1, b + n3 - 1);
    }
    
    public final String g(final int n) {
        if (n >= 0 && n < this.d()) {
            String string;
            if ((string = (String)this.l.get(n)) == null) {
                final String replace = this.k.replace("$N", this.i);
                final int e = this.e;
                final StringBuilder sb = new StringBuilder();
                sb.append(e);
                final String replace2 = replace.replace("$L", sb.toString());
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(n);
                final tte b = tte.b(Uri.parse(replace2.replace("$M", sb2.toString())));
                b.h("sigh", this.j);
                string = b.a().toString();
                this.l.put(n, (Object)string);
            }
            return string;
        }
        return null;
    }
}
