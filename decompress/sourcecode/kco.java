import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class kco
{
    public final View a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final acqt e;
    public final TextView f;
    public final acqt g;
    public final ImageView h;
    public final ImageView i;
    public final aceo j;
    public final int k;
    final /* synthetic */ kcp l;
    
    public kco(final kcp l, final View a, final aceo j, final int k) {
        this.l = l;
        this.a = a;
        this.j = j;
        this.k = k;
        this.b = (TextView)a.findViewById(2131432092);
        this.c = (TextView)a.findViewById(2131427819);
        final TextView d = (TextView)a.findViewById(2131427916);
        this.d = d;
        this.e = (acqt)l.e.g(d);
        final TextView f = (TextView)a.findViewById(2131431317);
        this.f = f;
        this.g = (acqt)l.e.g(f);
        this.h = (ImageView)a.findViewById(2131429270);
        this.i = (ImageView)a.findViewById(2131432006);
    }
    
    public final void a() {
        this.b(this.l.a.getResources().getDimensionPixelSize(2131165490));
        this.c(this.l.a.getResources().getDimensionPixelSize(kcp.f(this.l.a)));
    }
    
    public final void b(final int n) {
        final TextView c = this.c;
        c.setPadding(c.getPaddingLeft(), n, this.c.getPaddingRight(), this.c.getPaddingBottom());
    }
    
    public final void c(final int n) {
        final View a = this.a;
        a.setPadding(a.getPaddingLeft(), this.a.getPaddingTop(), this.a.getPaddingRight(), n);
    }
}
