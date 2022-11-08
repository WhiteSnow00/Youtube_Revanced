import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public class brs
{
    private static final Comparator e;
    private static final Comparator f;
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    private final int g;
    private final brr[] h;
    private int i;
    
    static {
        e = (Comparator)aaq.l;
        f = (Comparator)aaq.m;
    }
    
    public brs(final int g) {
        this.g = g;
        this.h = new brr[5];
        this.a = new ArrayList();
        this.b = -1;
    }
    
    public final float a(final float n) {
        final int b = this.b;
        int i = 0;
        if (b != 0) {
            Collections.sort((List<Object>)this.a, brs.f);
            this.b = 0;
        }
        final float n2 = (float)this.d;
        int n3 = 0;
        while (i < this.a.size()) {
            final brr brr = this.a.get(i);
            n3 += brr.b;
            if (n3 >= n * n2) {
                return brr.c;
            }
            ++i;
        }
        if (this.a.isEmpty()) {
            return Float.NaN;
        }
        final ArrayList a = this.a;
        return ((brr)a.get(a.size() - 1)).c;
    }
    
    public final void k(int b, final float c) {
        if (this.b != 1) {
            Collections.sort((List<Object>)this.a, brs.e);
            this.b = 1;
        }
        int i = this.i;
        brr brr;
        if (i > 0) {
            final brr[] h = this.h;
            --i;
            this.i = i;
            brr = h[i];
        }
        else {
            brr = new brr();
        }
        brr.a = this.c++;
        brr.b = b;
        brr.c = c;
        this.a.add(brr);
        this.d += b;
        while (true) {
            final int d = this.d;
            b = this.g;
            if (d <= b) {
                break;
            }
            b = d - b;
            final brr brr2 = this.a.get(0);
            final int b2 = brr2.b;
            if (b2 <= b) {
                this.d -= b2;
                this.a.remove(0);
                b = this.i;
                if (b >= 5) {
                    continue;
                }
                final brr[] h2 = this.h;
                this.i = b + 1;
                h2[b] = brr2;
            }
            else {
                brr2.b = b2 - b;
                this.d -= b;
            }
        }
    }
}
