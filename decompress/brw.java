import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public class brw
{
    private static final Comparator e;
    private static final Comparator f;
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    private final int g;
    private final brv[] h;
    private int i;
    
    static {
        e = aas.l;
        f = aas.m;
    }
    
    public brw(final int g) {
        this.g = g;
        this.h = new brv[5];
        this.a = new ArrayList();
        this.b = -1;
    }
    
    public final float a(final float n) {
        final int b = this.b;
        int i = 0;
        if (b != 0) {
            Collections.sort((List<Object>)this.a, brw.f);
            this.b = 0;
        }
        final float n2 = (float)this.d;
        int n3 = 0;
        while (i < this.a.size()) {
            final brv brv = this.a.get(i);
            n3 += brv.b;
            if (n3 >= n * n2) {
                return brv.c;
            }
            ++i;
        }
        if (this.a.isEmpty()) {
            return Float.NaN;
        }
        final ArrayList a = this.a;
        return ((brv)a.get(a.size() - 1)).c;
    }
    
    public final void k(int b, final float c) {
        if (this.b != 1) {
            Collections.sort((List<Object>)this.a, brw.e);
            this.b = 1;
        }
        int i = this.i;
        brv brv;
        if (i > 0) {
            final brv[] h = this.h;
            --i;
            this.i = i;
            brv = h[i];
        }
        else {
            brv = new brv();
        }
        brv.a = this.c++;
        brv.b = b;
        brv.c = c;
        this.a.add(brv);
        this.d += b;
        while (true) {
            final int d = this.d;
            final int g = this.g;
            if (d <= g) {
                break;
            }
            final brv brv2 = this.a.get(0);
            b = brv2.b;
            final int n = d - g;
            if (b <= n) {
                this.d -= b;
                this.a.remove(0);
                b = this.i;
                if (b >= 5) {
                    continue;
                }
                final brv[] h2 = this.h;
                this.i = b + 1;
                h2[b] = brv2;
            }
            else {
                brv2.b = b - n;
                this.d -= n;
            }
        }
    }
}
