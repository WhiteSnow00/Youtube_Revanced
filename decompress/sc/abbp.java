import android.os.Looper;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Handler;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abbp
{
    public final Context a;
    public final abbm b;
    public final long c;
    public final boolean d;
    public View e;
    public int f;
    public abbl g;
    public toz h;
    private final long i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final StringBuilder n;
    private int o;
    private final trk p;
    private Handler q;
    private final Runnable r;
    private final ViewTreeObserver$OnGlobalLayoutListener s;
    
    public abbp(final Context a, final abbm b, final trk p10, final int n, final int n2, final boolean j, final boolean k, final boolean l, final boolean d, final boolean m) {
        this.n = new StringBuilder(140);
        this.r = new aavc(this, 12);
        this.a = a;
        this.b = b;
        this.p = p10;
        this.c = n;
        this.i = n2;
        this.j = j;
        this.k = k;
        this.l = l;
        this.d = d;
        this.m = m;
        this.s = (ViewTreeObserver$OnGlobalLayoutListener)new zfc(this, 2);
    }
    
    private final void n(final boolean b) {
        if (!b) {
            this.r.run();
            return;
        }
        if (this.j()) {
            anb.I(this.e, this.r);
        }
        else {
            if (this.q == null) {
                this.q = new Handler(Looper.getMainLooper());
            }
            this.q.post(this.r);
        }
        this.g(32);
    }
    
    public final void a(final int n) {
        this.o &= ~n;
    }
    
    public final void b() {
        if (!this.h(4)) {
            return;
        }
        this.a(28);
    }
    
    public final void c() {
        if (this.j()) {
            return;
        }
        this.g(1);
        final View c = ((abbo)this.b).c(this.a);
        c.getClass();
        this.e = c;
        if (this.d) {
            this.f();
        }
        final toz h = new toz(this.e);
        this.h = h;
        h.d = this.i;
        h.c = this.c;
        h.l(false, false);
        final trk p = this.p;
        if (p != null) {
            this.h.g(p);
        }
        final abbl g = this.g;
        if (g != null) {
            g.d(this.b, this.e);
        }
    }
    
    public final void d() {
        if (this.h(32)) {
            return;
        }
        final boolean h = this.h(4);
        boolean b = true;
        boolean b2 = true;
        if (h) {
            Label_0055: {
                if (this.h(8)) {
                    if (this.k) {
                        break Label_0055;
                    }
                }
                else if (this.j) {
                    break Label_0055;
                }
                b2 = false;
            }
            this.n(b2);
            return;
        }
        if (((abbo)this.b).oV() || !this.k()) {
            b = false;
        }
        boolean b3 = false;
        Label_0118: {
            if (!this.h(2)) {
                if (!b) {
                    return;
                }
            }
            else if (!b) {
                b3 = this.l;
                break Label_0118;
            }
            b3 = this.j;
        }
        this.n(b3);
    }
    
    public final void e(final int n) {
        Integer.toBinaryString(n);
        this.g(2);
        this.f |= n;
        this.d();
    }
    
    public final void f() {
        if (!this.h(64)) {
            this.e.getViewTreeObserver().addOnGlobalLayoutListener(this.s);
            this.g(64);
        }
    }
    
    public final void g(final int n) {
        this.o |= n;
    }
    
    public final boolean h(final int n) {
        return (this.o & n) == n;
    }
    
    public final boolean i() {
        final toz h = this.h;
        return h == null || h.c();
    }
    
    public final boolean j() {
        return this.h(1);
    }
    
    public final boolean k() {
        final toz h = this.h;
        return h != null && h.d();
    }
    
    public final boolean l(final int n) {
        return (this.f & n) == n;
    }
    
    public final boolean m() {
        final boolean j = this.j();
        final boolean b = j && anb.am(this.e);
        int n2;
        int n3;
        if (j) {
            int n;
            if (this.m) {
                n = this.e.getMeasuredWidth();
            }
            else {
                n = this.e.getWidth();
            }
            if (this.m) {
                final int measuredHeight = this.e.getMeasuredHeight();
                n2 = n;
                n3 = measuredHeight;
            }
            else {
                final int height = this.e.getHeight();
                n2 = n;
                n3 = height;
            }
        }
        else {
            n2 = 0;
            n3 = 0;
        }
        return j && b && n2 != 0 && n3 != 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder n = this.n;
        final int n2 = 0;
        n.setLength(0);
        final StringBuilder n3 = this.n;
        n3.append("Lazy@");
        n3.append(Integer.toHexString(this.hashCode()));
        n3.append(" view:");
        n3.append(this.e);
        n3.append(" status: ");
        final toz h = this.h;
        final StringBuilder n4 = this.n;
        final boolean h2 = this.h(64);
        final char c = '.';
        char c2;
        if (!h2) {
            c2 = '.';
        }
        else {
            c2 = 'L';
        }
        n4.append(c2);
        final StringBuilder n5 = this.n;
        char c3;
        if (!this.h(32)) {
            c3 = '.';
        }
        else {
            c3 = 'P';
        }
        n5.append(c3);
        final StringBuilder n6 = this.n;
        char c4;
        if (!this.h(16)) {
            c4 = '.';
        }
        else {
            c4 = 'A';
        }
        n6.append(c4);
        final StringBuilder n7 = this.n;
        char c5;
        if (!this.h(8)) {
            c5 = '.';
        }
        else {
            c5 = 'V';
        }
        n7.append(c5);
        final StringBuilder n8 = this.n;
        char c6;
        if (!this.h(4)) {
            c6 = '.';
        }
        else {
            c6 = 'R';
        }
        n8.append(c6);
        final StringBuilder n9 = this.n;
        char c7;
        if (!this.h(2)) {
            c7 = '.';
        }
        else {
            c7 = 'D';
        }
        n9.append(c7);
        final StringBuilder n10 = this.n;
        char c8;
        if (!this.h(1)) {
            c8 = '.';
        }
        else {
            c8 = 'C';
        }
        n10.append(c8);
        if (this.f != 0) {
            this.n.append(" user: ");
            for (int i = 7; i >= 0; --i) {
                final StringBuilder n11 = this.n;
                char c9;
                if (!this.l(1 << i)) {
                    c9 = '.';
                }
                else {
                    c9 = 'x';
                }
                n11.append(c9);
                if (i % 4 == 0 && i > 0) {
                    this.n.append(' ');
                }
            }
        }
        this.n.append(" {");
        final StringBuilder n12 = this.n;
        final abbm b = this.b;
        char c10;
        if (b != null && ((abbo)b).oV()) {
            c10 = '\u2713';
        }
        else {
            c10 = '.';
        }
        int n13 = n2;
        if (h != null) {
            n13 = 1;
        }
        n12.append(c10);
        final StringBuilder n14 = this.n;
        char c11;
        if (n13 != 0 && this.h.d()) {
            c11 = 'v';
        }
        else {
            c11 = '.';
        }
        n14.append(c11);
        final StringBuilder n15 = this.n;
        char c12 = c;
        if (n13 != 0) {
            c12 = c;
            if (this.h.c()) {
                c12 = 'h';
            }
        }
        n15.append(c12);
        this.n.append('}');
        return this.n.toString();
    }
}
