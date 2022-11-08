import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import java.util.HashSet;
import android.widget.ProgressBar;
import android.widget.ImageView;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kye
{
    public final xlv a;
    public final Set b;
    public final ImageView c;
    public final ProgressBar d;
    public final siu e;
    public int f;
    public kyc g;
    public boolean h;
    public final mri i;
    private boolean j;
    private boolean k;
    private int l;
    
    public kye(final ImageView c, final ProgressBar d, final mri i, final xlv a, final byte[] array) {
        this.l = 1;
        this.c = c;
        this.d = d;
        this.i = i;
        this.a = a;
        this.e = (siu)new kyd(this);
        this.b = new HashSet();
    }
    
    final void a(final aami aami) {
        final Set b = this.b;
        aami.getClass();
        b.add(aami);
    }
    
    final void b(final boolean j) {
        this.j = j;
        this.d();
    }
    
    final void c(final boolean k) {
        this.k = k;
        this.d();
    }
    
    final void d() {
        final kyc g = this.g;
        if (g == null) {
            return;
        }
        if (this.h) {
            g.a(this.l);
            return;
        }
        if (this.k) {
            g.a.setOnClickListener((View$OnClickListener)new kmk(g, 14));
            g.a.setEnabled(true);
            g.b.setVisibility(8);
            if (g.e == null) {
                g.e = agw.a(g.a.getContext(), 2131232988);
            }
            g.b(g.e, 2132019150);
            return;
        }
        if (this.j) {
            g.a.setOnClickListener((View$OnClickListener)new kmk(g, 13));
            g.a.setEnabled(true);
            g.b.setVisibility(0);
            if (g.f == null) {
                g.f = agw.a(g.a.getContext(), 2131231336);
            }
            final Drawable f = g.f;
            if (f != null) {
                g.b.setProgressDrawable(f);
            }
            if (g.d == null) {
                g.d = agw.a(g.a.getContext(), 2131231337);
            }
            g.b(g.d, 2132017531);
            return;
        }
        g.a(this.l);
    }
    
    public final void e(final int l) {
        this.l = l;
        this.d();
    }
}
