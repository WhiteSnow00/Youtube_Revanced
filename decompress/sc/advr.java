import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class advr extends akw
{
    final int a;
    final boolean b;
    final advs d;
    
    public advr(final advs d, final int a, final boolean b) {
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public final void c(final View view, final aom aom) {
        super.c(view, aom);
        final advs d = this.d;
        final int a = this.a;
        int i = 0;
        int n = a;
        while (i < a) {
            int n2 = n;
            if (((nq)d.g.e).d(i) == 2) {
                n2 = n - 1;
            }
            ++i;
            n = n2;
        }
        int n3 = n;
        if (d.g.b.getChildCount() == 0) {
            n3 = n - 1;
        }
        aom.t(bx.J(n3, 1, 1, 1, this.b, view.isSelected()));
    }
}
