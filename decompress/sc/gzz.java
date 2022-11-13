import android.view.View;
import android.widget.ImageView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzz implements View$OnClickListener
{
    public final txz a;
    public final ImageView b;
    public final String c;
    public final String d;
    private final gzs e;
    private final View f;
    
    public gzz(final gzs e, final txz a, final msr msr, final View view, final byte[] array, final byte[] array2) {
        this.e = e;
        this.a = a;
        this.c = view.getResources().getString(2132019351);
        this.d = view.getResources().getString(2132019349);
        final ImageView b = (ImageView)view.findViewById(2131430416);
        anb.N((View)(this.b = b), new gzy(this));
        b.setOnClickListener((View$OnClickListener)this);
        (this.f = view.findViewById(2131428725)).setOnClickListener((View$OnClickListener)this);
        this.a();
        a.M().q(tpe.cl(msr.K())).aH(new gyi(this, 10));
    }
    
    public final void a() {
        this.b.setSelected(this.a.ah());
    }
    
    public final void onClick(final View view) {
        if (view == this.f) {
            this.e.d(xaa.c(116664));
            this.e.b();
            this.a.X();
            return;
        }
        if (view == this.b) {
            if (this.a.ah()) {
                this.a.W();
                return;
            }
            this.a.X();
        }
    }
}
