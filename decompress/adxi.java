import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class adxi extends akx
{
    final int a;
    final boolean b;
    final adxj d;
    
    public adxi(final adxj d, final int a, final boolean b) {
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public final void c(final View view, final aon aon) {
        super.c(view, aon);
        final adxj d = this.d;
        final int a = this.a;
        int i = 0;
        int n = a;
        while (i < a) {
            int n2 = n;
            if (d.g.e.d(i) == 2) {
                n2 = n - 1;
            }
            ++i;
            n = n2;
        }
        int n3 = n;
        if (d.g.b.getChildCount() == 0) {
            n3 = n - 1;
        }
        aon.u((Object)bx.J(n3, 1, 1, 1, this.b, view.isSelected()));
    }
}
