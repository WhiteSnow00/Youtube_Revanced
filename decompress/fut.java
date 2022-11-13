import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fut extends acld
{
    public final tgd a;
    public final vcy b;
    public ajxm c;
    private final acgs d;
    private final acpk e;
    private final LayoutInflater f;
    private final Resources g;
    private final ViewGroup h;
    private fus i;
    
    public fut(final Context context, final acgs d, final tgd a, final vcy b, final acpk e) {
        context.getClass();
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        e.getClass();
        this.e = e;
        this.f = LayoutInflater.from(context);
        this.g = context.getResources();
        this.h = (ViewGroup)new FrameLayout(context);
    }
    
    public final View a() {
        return (View)this.h;
    }
    
    public final void c(final acku acku) {
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((ajxm)o).j.I();
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        this.c = (ajxm)o;
        final fus i = this.i;
        final int n = 0;
        if (i == null) {
            int n2;
            if (!this.g.getBoolean(2131034124)) {
                n2 = 2131624488;
            }
            else {
                n2 = 2131624487;
            }
            this.i = new fus(this, this.f.inflate(n2, this.h, false));
        }
        final fus j = this.i;
        final ajxm c = this.c;
        c.getClass();
        final TextView b = j.b;
        final int b2 = c.b;
        final ajut ajut = null;
        ajut ajut2;
        if ((b2 & 0x1) != 0x0) {
            if ((ajut2 = c.c) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        b.setText((CharSequence)acak.b(ajut2));
        final TextView c2 = j.c;
        ajut ajut3 = ajut;
        if ((c.b & 0x2) != 0x0 && (ajut3 = c.d) == null) {
            ajut3 = ajut.a;
        }
        c2.setText((CharSequence)acak.b(ajut3));
        if ((c.b & 0x40) != 0x0) {
            j.d.setVisibility(0);
        }
        else {
            j.d.setVisibility(8);
        }
        final acgs d = this.d;
        final ImageView e = j.e;
        aotp aotp;
        if ((aotp = c.h) == null) {
            aotp = aotp.a;
        }
        d.g(e, aotp);
        aida aida;
        if ((aida = c.e) == null) {
            aida = aida.a;
        }
        aicz aicz;
        if ((aicz = aida.c) == null) {
            aicz = aicz.a;
        }
        if ((aicz.b & 0x200) != 0x0) {
            final Button g = j.g;
            aida aida2;
            if ((aida2 = c.e) == null) {
                aida2 = aida.a;
            }
            aicz aicz2;
            if ((aicz2 = aida2.c) == null) {
                aicz2 = aicz.a;
            }
            ajut ajut4;
            if ((ajut4 = aicz2.i) == null) {
                ajut4 = ajut.a;
            }
            g.setText((CharSequence)acak.b(ajut4));
        }
        else {
            j.g.setVisibility(8);
        }
        int a;
        if ((c.b & 0x10) != 0x0) {
            final acpk e2 = this.e;
            akdi akdi;
            if ((akdi = c.g) == null) {
                akdi = akdi.a;
            }
            akdh akdh;
            if ((akdh = akdh.b(akdi.c)) == null) {
                akdh = akdh.a;
            }
            a = e2.a(akdh);
        }
        else {
            a = 0;
        }
        if (a != 0) {
            this.d.d(j.f);
            j.f.setBackgroundResource(a);
        }
        else {
            aotp aotp2;
            if ((aotp2 = c.f) == null) {
                aotp2 = aotp.a;
            }
            this.d.g(j.f, aotp2);
            final ImageView f = j.f;
            int visibility = n;
            if (!aald.S(aotp2)) {
                visibility = 8;
            }
            f.setVisibility(visibility);
        }
        this.h.removeAllViews();
        this.h.addView(j.a);
    }
}
