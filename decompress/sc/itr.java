import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itr extends abhs implements View$OnLayoutChangeListener, aaol, fjq, fju, abdw
{
    public final uwb a;
    public boolean b;
    public final vai c;
    public final msr d;
    private final acql f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private final arwh l;
    
    public itr(final acql f, final arwh l, final vai c, final itq itq, final abhm abhm, final uwb a, final msr d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super((abho)itq, abhm);
        this.f = f;
        this.l = l;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    private final boolean l() {
        if (this.g) {
            return true;
        }
        if (this.i || this.h) {
            final akcn f = this.l.f();
            if (f != null) {
                alxw alxw;
                if ((alxw = f.e) == null) {
                    alxw = alxw.a;
                }
                if (alxw.A) {
                    return true;
                }
            }
        }
        return false;
    }
    
    protected final int b(final abke abke) {
        if (abke == abke.j && !this.g && !this.k) {
            return 2;
        }
        if (abke != null && abke.c(abke.g)) {
            return 1;
        }
        return 0;
    }
    
    protected final boolean c() {
        return !this.b && !this.l() && this.j && super.c();
    }
    
    public final void h(final int n, final long n2) {
        final boolean k = this.k;
        boolean i = true;
        if (n != 1) {
            i = (n == 2 && i);
        }
        if ((this.k = i) != k) {
            if (this.c() && this.k) {
                super.e.m(3);
                return;
            }
            this.k();
        }
    }
    
    public final void n(final fkr fkr) {
        final boolean j = this.j;
        final boolean c = fkr.c();
        boolean i = false;
        if (c) {
            i = i;
            if (!fkr.f()) {
                i = true;
            }
        }
        if ((this.j = i) != j) {
            this.k();
        }
    }
    
    public final void oK(final fkr fkr, final fkr fkr2) {
        fal.b((fju)this, fkr2);
    }
    
    public final void onLayoutChange(final View view, int n, int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        n2 = n4 - n2;
        n = n3 - n;
        if (n7 - n5 == n && n8 - n6 == n2) {
            return;
        }
        final boolean h = this.h;
        final boolean b = false;
        if (h != n2 > n || this.i != this.f.isInMultiWindowMode()) {
            final boolean l = this.l();
            boolean h2 = b;
            if (n2 > n) {
                h2 = true;
            }
            this.h = h2;
            this.i = this.f.isInMultiWindowMode();
            if (l != this.l()) {
                this.k();
            }
        }
    }
    
    public final void pd(final elx elx) {
        this.i();
    }
    
    public final void pf(final boolean g) {
        if (this.g != g) {
            this.g = g;
            this.k();
        }
    }
}
