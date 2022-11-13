import java.util.Iterator;
import java.util.HashSet;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwe
{
    public final View a;
    public uby b;
    public boolean c;
    private final ucb d;
    private final View e;
    private final View f;
    private final View g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private final aeea l;
    
    public gwe(final uby b, final ucb d, final aeea l, final View a, final View e, final View f, final View g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = b;
        this.d = d;
        this.l = l;
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    static boolean d(final boolean b, final boolean b2) {
        return b && b2;
    }
    
    private final void e(final boolean b, final boolean b2, final int n) {
        if (b != b2) {
            final twx cg = this.l.cG(xaa.c(n));
            cg.k(b2);
            cg.j();
        }
    }
    
    private final void f() {
        if (gyc.a(this.a)) {
            this.k = gyc.a(this.g);
            this.i = gyc.a(this.f);
            this.j = this.f.isEnabled();
            this.h = gyc.a(this.e);
        }
    }
    
    private final void g(final boolean b, final boolean b2) {
        final View e = this.e;
        final boolean d = d(b, b2);
        gxv.b(e, d);
        final View f = this.f;
        final boolean d2 = d(b, b2);
        gxv.b(f, d2);
        final ucb d3 = this.d;
        final int e2 = d3.e;
        final int b3 = d3.b;
        final View f2 = this.f;
        int n;
        if (e2 >= b3) {
            n = 1;
        }
        else {
            n = 0;
        }
        f2.setEnabled((boolean)(n != 0));
        this.f.findViewById(2131431438).setEnabled((boolean)(n != 0));
        this.b(b2);
        if (b2 && this.c) {
            this.e(this.h, d, 96642);
            final boolean i = this.i;
            final boolean j = this.j;
            if (i != d2 || (j ? 1 : 0) != n) {
                if (i) {
                    if (d2) {
                        if (n != 0) {
                            this.l.cG(xaa.c(98531)).f();
                            this.l.cG(xaa.c(96644)).h();
                            return;
                        }
                        this.l.cG(xaa.c(96644)).f();
                        this.l.cG(xaa.c(98531)).h();
                    }
                    else {
                        if (j) {
                            this.l.cG(xaa.c(96644)).f();
                            return;
                        }
                        this.l.cG(xaa.c(98531)).f();
                    }
                }
                else if (d2) {
                    if (n != 0) {
                        this.l.cG(xaa.c(96644)).h();
                        return;
                    }
                    this.l.cG(xaa.c(98531)).h();
                }
            }
        }
    }
    
    public final void a(final boolean b) {
        this.f();
        gxv.b(this.a, b);
        final uby b2 = this.b;
        boolean b3 = false;
        if (b2 != null) {
            b3 = b3;
            if (b2.U()) {
                b3 = true;
            }
        }
        this.g(b3, b);
    }
    
    public final void b(final boolean b) {
        final uby b2 = this.b;
        final boolean b3 = true;
        boolean b4 = false;
        Label_0078: {
            if (b2 != null) {
                final afeq r = b2.r();
                final HashSet set = new HashSet();
                set.add(arbl.b);
                set.add(arbl.d);
                if (r != null && !r.isEmpty() && vdh.aI(r, set)) {
                    b4 = true;
                    break Label_0078;
                }
            }
            b4 = false;
        }
        final boolean e = this.d.e();
        final uby b5 = this.b;
        boolean b6 = false;
        Label_0208: {
            if (!b4 && e && b) {
                b6 = b3;
                if (b5 == null) {
                    break Label_0208;
                }
                if (!b5.W()) {
                    final Iterator iterator = b5.d.iterator();
                    arbl arbl;
                    do {
                        b6 = b3;
                        if (!iterator.hasNext()) {
                            break Label_0208;
                        }
                        arbm arbm;
                        if ((arbm = ((arbk)iterator.next()).n) == null) {
                            arbm = arbm.a;
                        }
                        if ((arbl = arbl.b(arbm.h)) != null) {
                            continue;
                        }
                        arbl = arbl.a;
                    } while (arbl != arbl.c);
                }
            }
            b6 = false;
        }
        gxv.b(this.g, b6);
        if (b && this.c) {
            this.e(this.k, b6, 121257);
        }
    }
    
    public final void c(final boolean b) {
        this.f();
        this.g(b, gyc.a(this.a));
    }
}
