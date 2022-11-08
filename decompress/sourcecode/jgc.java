import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import android.view.ViewStub;
import android.view.View;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgc extends fzx
{
    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView g;
    private LinearLayout h;
    private final gfd i;
    private final Context j;
    
    public jgc(final acng acng, final Context j, final View view) {
        super(view);
        this.i = new gfd(j, acng);
        this.j = j;
    }
    
    public jgc(final acng acng, final Context j, final ViewStub viewStub) {
        super(viewStub);
        this.i = new gfd(j, acng);
        this.j = j;
    }
    
    public final void a(final ahys ahys) {
        final View f = super.f;
        if (ahys == null) {
            if (f != null) {
                f.setVisibility(8);
            }
            return;
        }
        final View c = this.c();
        c.setVisibility(0);
        this.b = (TextView)c.findViewById(2131427766);
        this.c = (TextView)c.findViewById(2131427770);
        this.g = (TextView)c.findViewById(2131427767);
        this.a = (ImageView)c.findViewById(2131427764);
        this.h = (LinearLayout)c.findViewById(2131427765);
        tmy.t(this.b, (CharSequence)ahys.c);
        tmy.t(this.c, (CharSequence)ahys.e);
        final TextView g = this.g;
        ajsq ajsq;
        if ((ajsq = ahys.f) == null) {
            ajsq = ajsq.a;
        }
        tmy.t(g, (CharSequence)abyh.b(ajsq));
        ahyt ahyt;
        if ((ahyt = ahys.g) == null) {
            ahyt = ahyt.a;
        }
        final int ar = aesy.aR(ahyt.b);
        if (ar != 0) {
            if (ar == 5) {
                if ((ahys.b & 0x2) != 0x0) {
                    final ImageView a = this.a;
                    final gfd i = this.i;
                    akbf akbf;
                    if ((akbf = ahys.d) == null) {
                        akbf = akbf.a;
                    }
                    akbe akbe;
                    if ((akbe = akbe.b(akbf.c)) == null) {
                        akbe = akbe.a;
                    }
                    a.setImageResource(i.a(akbe));
                }
                tmy.v((View)this.a, (ahys.b & 0x2) != 0x0);
                final ImageView a2 = this.a;
                Drawable b;
                if ((ahys.b & 0x1) != 0x0) {
                    b = b(this.j);
                }
                else {
                    b = null;
                }
                a2.setBackground(b);
                final LinearLayout h = this.h;
                Drawable b2;
                if ((ahys.b & 0x1) != 0x0) {
                    b2 = b(this.j);
                }
                else {
                    b2 = null;
                }
                h.setBackground(b2);
                this.b.setBackground((Drawable)null);
                if ((ahys.b & 0x1) != 0x0) {
                    this.b.setPadding(this.j.getResources().getDimensionPixelSize(2131169816), 0, this.j.getResources().getDimensionPixelSize(2131169816), 0);
                    this.b.setTextColor(tmy.cn(this.j, 2130970926));
                    return;
                }
                final int dimensionPixelSize = this.j.getResources().getDimensionPixelSize(2131169815);
                tmy.aF((View)this.a, tmy.an(new tsp[] { tmy.ay(0, 0, 0, 0), tmy.aE(dimensionPixelSize, dimensionPixelSize) }), (Class)ViewGroup$MarginLayoutParams.class);
            }
        }
    }
}
