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

public final class jhe extends gaf
{
    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView g;
    private LinearLayout h;
    private final gfl i;
    private final Context j;
    
    public jhe(final acpk acpk, final Context j, final View view) {
        super(view);
        this.i = new gfl(j, acpk);
        this.j = j;
    }
    
    public jhe(final acpk acpk, final Context j, final ViewStub viewStub) {
        super(viewStub);
        this.i = new gfl(j, acpk);
        this.j = j;
    }
    
    public final void a(final aiaq aiaq) {
        final View f = super.f;
        if (aiaq == null) {
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
        tpe.t(this.b, (CharSequence)aiaq.c);
        tpe.t(this.c, (CharSequence)aiaq.e);
        final TextView g = this.g;
        ajut ajut;
        if ((ajut = aiaq.f) == null) {
            ajut = ajut.a;
        }
        tpe.t(g, (CharSequence)acak.b(ajut));
        aiar aiar;
        if ((aiar = aiaq.g) == null) {
            aiar = aiar.a;
        }
        final int an = aefb.an(aiar.b);
        if (an != 0) {
            if (an == 5) {
                if ((aiaq.b & 0x2) != 0x0) {
                    final ImageView a = this.a;
                    final gfl i = this.i;
                    akdi akdi;
                    if ((akdi = aiaq.d) == null) {
                        akdi = akdi.a;
                    }
                    akdh akdh;
                    if ((akdh = akdh.b(akdi.c)) == null) {
                        akdh = akdh.a;
                    }
                    a.setImageResource(i.a(akdh));
                }
                tpe.v((View)this.a, (aiaq.b & 0x2) != 0x0);
                final ImageView a2 = this.a;
                Drawable b;
                if ((aiaq.b & 0x1) != 0x0) {
                    b = b(this.j);
                }
                else {
                    b = null;
                }
                a2.setBackground(b);
                final LinearLayout h = this.h;
                Drawable b2;
                if ((aiaq.b & 0x1) != 0x0) {
                    b2 = b(this.j);
                }
                else {
                    b2 = null;
                }
                h.setBackground(b2);
                this.b.setBackground((Drawable)null);
                if ((aiaq.b & 0x1) != 0x0) {
                    this.b.setPadding(this.j.getResources().getDimensionPixelSize(2131169817), 0, this.j.getResources().getDimensionPixelSize(2131169817), 0);
                    this.b.setTextColor(tpe.cr(this.j, 2130970926));
                    return;
                }
                final int dimensionPixelSize = this.j.getResources().getDimensionPixelSize(2131169816);
                tpe.aF((View)this.a, tpe.an(new tut[] { tpe.ay(0, 0, 0, 0), tpe.aE(dimensionPixelSize, dimensionPixelSize) }), (Class)ViewGroup$MarginLayoutParams.class);
            }
        }
    }
}
