import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class db extends dd
{
    private final mrs g;
    
    public db(final int n, final int n2, final mrs g, final ajl ajl, final byte[] array, final byte[] array2) {
        super(n, n2, (br)g.b, ajl);
        this.g = g;
    }
    
    public final void a() {
        super.a();
        this.g.g();
    }
    
    public final void b() {
        final int f = super.f;
        if (f == 2) {
            final Object b = this.g.b;
            final br br = (br)b;
            final View focus = br.O.findFocus();
            if (focus != null) {
                br.ah(focus);
                if (cl.W(2)) {
                    final StringBuilder sb = new StringBuilder("requestFocus: Saved focused view ");
                    sb.append(focus);
                    sb.append(" for Fragment ");
                    sb.append(b);
                }
            }
            final View mj = super.a.mJ();
            if (mj.getParent() == null) {
                this.g.d();
                mj.setAlpha(0.0f);
            }
            if (mj.getAlpha() == 0.0f && mj.getVisibility() == 0) {
                mj.setVisibility(4);
            }
            final bo r = br.R;
            float l;
            if (r == null) {
                l = 1.0f;
            }
            else {
                l = r.l;
            }
            mj.setAlpha(l);
            return;
        }
        if (f == 3) {
            final Object b2 = this.g.b;
            final View mj2 = ((br)b2).mJ();
            if (cl.W(2)) {
                final StringBuilder sb2 = new StringBuilder("Clearing focus ");
                sb2.append(mj2.findFocus());
                sb2.append(" on view ");
                sb2.append(mj2);
                sb2.append(" for Fragment ");
                sb2.append(b2);
            }
            mj2.clearFocus();
        }
    }
}
