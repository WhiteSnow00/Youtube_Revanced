import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import android.widget.RelativeLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khf extends acld
{
    protected final RelativeLayout a;
    private final acgs b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final View f;
    private final acpn g;
    private final ImageView h;
    private final ackr i;
    private final ackk j;
    
    public khf(final Context context, final acgs b, final gjh i, final vcy vcy, final acpn g) {
        this.j = new ackk(vcy, (ackr)i);
        context.getClass();
        b.getClass();
        this.b = b;
        i.getClass();
        this.i = (ackr)i;
        g.getClass();
        this.g = g;
        final RelativeLayout a = (RelativeLayout)View.inflate(context, 2131625167, (ViewGroup)null);
        this.a = a;
        this.c = (TextView)a.findViewById(2131432095);
        this.d = (TextView)a.findViewById(2131430592);
        this.e = (TextView)a.findViewById(2131429090);
        this.h = (ImageView)a.findViewById(2131432009);
        this.f = a.findViewById(2131428448);
        i.c((View)a);
    }
    
    public final View a() {
        return ((gjh)this.i).a;
    }
    
    public final void c(final acku acku) {
        this.j.c();
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((anqv)o).i.I();
    }
    
    protected final void lR(final ackm ackm, final Object o) {
        final anqv anqv = (anqv)o;
        final ackk j = this.j;
        final wyw a = ackm.a;
        final int b = anqv.b;
        final amgs amgs = null;
        aiqj aiqj;
        if ((b & 0x8) != 0x0) {
            if ((aiqj = anqv.f) == null) {
                aiqj = aiqj.a;
            }
        }
        else {
            aiqj = null;
        }
        j.a(a, aiqj, ackm.e());
        final TextView c = this.c;
        ajut ajut;
        if ((anqv.b & 0x2) != 0x0) {
            if ((ajut = anqv.d) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        tpe.t(c, (CharSequence)acak.b(ajut));
        final TextView d = this.d;
        ajut ajut2;
        if ((anqv.b & 0x4) != 0x0) {
            if ((ajut2 = anqv.e) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        tpe.t(d, (CharSequence)acak.b(ajut2));
        final TextView e = this.e;
        ajut ajut3;
        if ((anqv.b & 0x20) != 0x0) {
            if ((ajut3 = anqv.g) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        tpe.t(e, (CharSequence)acak.b(ajut3));
        if ((anqv.b & 0x1) != 0x0) {
            final acgs b2 = this.b;
            final ImageView h = this.h;
            aotp aotp;
            if ((aotp = anqv.c) == null) {
                aotp = aotp.a;
            }
            b2.g(h, aotp);
        }
        else {
            this.b.d(this.h);
        }
        this.f.setVisibility(0);
        final acpn g = this.g;
        final View a2 = ((gjh)this.i).a;
        final View f = this.f;
        amgv amgv;
        if ((amgv = anqv.h) == null) {
            amgv = amgv.a;
        }
        amgs amgs2 = amgs;
        if ((amgv.b & 0x1) != 0x0) {
            amgv amgv2;
            if ((amgv2 = anqv.h) == null) {
                amgv2 = amgv.a;
            }
            if ((amgs2 = amgv2.c) == null) {
                amgs2 = amgs.a;
            }
        }
        g.f(a2, f, amgs2, (Object)anqv, ackm.a);
        this.i.e(ackm);
    }
}
