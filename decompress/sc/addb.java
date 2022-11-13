import android.graphics.drawable.Drawable;
import android.graphics.Color;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addb implements acko
{
    public aiqj a;
    public aiqj b;
    public aiqj c;
    public ajut d;
    private final vcy e;
    private final acpk f;
    private final View g;
    private final achb h;
    private final TextView i;
    private final TextView j;
    private final ImageView k;
    
    public addb(final Context context, final acgs acgs, final vcy e, final acpk f, final adda adda) {
        this.e = e;
        this.f = f;
        final View inflate = View.inflate(context, 2131625370, (ViewGroup)null);
        this.g = inflate;
        this.h = new achb((tpo)acgs, (ImageView)inflate.findViewById(2131430676), true);
        this.i = (TextView)inflate.findViewById(2131430678);
        (this.j = (TextView)inflate.findViewById(2131427541)).setOnClickListener((View$OnClickListener)new zgi(this, e, 13));
        (this.k = (ImageView)inflate.findViewById(2131428234)).setOnClickListener((View$OnClickListener)new wcu(this, e, adda, 8));
        addn.e(inflate);
    }
    
    public final View a() {
        return this.g;
    }
    
    public final void c(final acku acku) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final aozv aozv = (aozv)o;
        final boolean empty = aozv.c.isEmpty();
        int a = 0;
        if (!empty) {
            this.g.setBackgroundColor(Color.parseColor(aozv.c));
        }
        else {
            this.g.setBackgroundColor(0);
        }
        final achb h = this.h;
        aotp aotp;
        if ((aotp = aozv.h) == null) {
            aotp = aotp.a;
        }
        h.k(aotp);
        final TextView i = this.i;
        ajut ajut;
        if ((aozv.b & 0x40) != 0x0) {
            if ((ajut = aozv.i) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        i.setText((CharSequence)acak.b(ajut));
        aida aida;
        if ((aida = aozv.j) == null) {
            aida = aida.a;
        }
        aicz aicz;
        if ((aicz = aida.c) == null) {
            aicz = aicz.a;
        }
        final TextView j = this.j;
        ajut ajut2;
        if ((aicz.b & 0x200) != 0x0) {
            if ((ajut2 = aicz.i) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        tpe.t(j, (CharSequence)vde.a(ajut2, this.e, false));
        aiqj a2;
        if ((aicz.b & 0x4000) != 0x0) {
            if ((a2 = aicz.n) == null) {
                a2 = aiqj.a;
            }
        }
        else {
            a2 = null;
        }
        this.a = a2;
        aiqj b;
        if ((aicz.b & 0x8000) != 0x0) {
            if ((b = aicz.o) == null) {
                b = aiqj.a;
            }
        }
        else {
            b = null;
        }
        this.b = b;
        if ((aozv.b & 0x2) != 0x0) {
            final acpk f = this.f;
            akdi akdi;
            if ((akdi = aozv.d) == null) {
                akdi = akdi.a;
            }
            akdh akdh;
            if ((akdh = akdh.b(akdi.c)) == null) {
                akdh = akdh.a;
            }
            a = f.a(akdh);
        }
        if (a != 0) {
            this.k.setImageResource(a);
        }
        else {
            this.k.setImageDrawable((Drawable)null);
        }
        aiqj c;
        if ((c = aozv.e) == null) {
            c = aiqj.a;
        }
        this.c = c;
        ajut d;
        if ((d = aozv.f) == null) {
            d = ajut.a;
        }
        this.d = d;
    }
}
