import android.text.Spanned;
import java.util.List;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itl implements acko, abhp
{
    public aiqj a;
    private final acgs b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final View$OnClickListener h;
    private abhq i;
    private wyw j;
    private byte[] k;
    private final int l;
    
    public itl(final Context context, final acgs b, final vcy vcy, final ViewGroup viewGroup, final int l) {
        this.l = l;
        this.b = b;
        final View inflate = LayoutInflater.from(context).inflate(2131624035, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView)inflate.findViewById(2131432009);
        this.e = (TextView)inflate.findViewById(2131432095);
        this.g = (TextView)inflate.findViewById(2131429861);
        this.f = (TextView)inflate.findViewById(2131428769);
        this.h = (View$OnClickListener)new hqd(this, vcy, 20);
    }
    
    public itl(final Context context, final acgs b, final vcy vcy, final ViewGroup viewGroup, final int l, final byte[] array) {
        this.l = l;
        this.b = b;
        final View inflate = LayoutInflater.from(context).inflate(2131624034, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView)inflate.findViewById(2131432009);
        this.g = (TextView)inflate.findViewById(2131432095);
        this.f = (TextView)inflate.findViewById(2131429861);
        this.e = (TextView)inflate.findViewById(2131432302);
        this.h = (View$OnClickListener)new hqd(this, vcy, 19, null);
    }
    
    private final void f(final int n) {
        if (n == 2) {
            this.c.setOnClickListener(this.h);
            anb.X(this.c, 0);
            final byte[] k = this.k;
            if (k != null) {
                final wyw j = this.j;
                if (j != null) {
                    j.t((wzz)new wyt(k), (alhi)null);
                }
            }
            return;
        }
        this.c.setOnClickListener((View$OnClickListener)null);
        this.c.setClickable(false);
        anb.X(this.c, 4);
    }
    
    private final void g(final int n) {
        if (n == 2) {
            anb.X(this.c, 0);
            this.c.setOnClickListener(this.h);
            final byte[] k = this.k;
            if (k != null) {
                final wyw j = this.j;
                if (j != null) {
                    j.t((wzz)new wyt(k), (alhi)null);
                }
            }
            return;
        }
        this.c.setOnClickListener((View$OnClickListener)null);
        this.c.setClickable(false);
        anb.X(this.c, 4);
    }
    
    public final View a() {
        if (this.l != 0) {
            return this.c;
        }
        return this.c;
    }
    
    public final void b(final int n, final int n2, final int n3) {
        if (this.l != 0) {
            this.g(n2);
            return;
        }
        this.f(n2);
    }
    
    public final void c(final acku acku) {
        if (this.l != 0) {
            final abhq i = this.i;
            if (i != null) {
                i.b((abhp)this);
            }
            return;
        }
        final abhq j = this.i;
        if (j != null) {
            j.b((abhp)this);
        }
    }
    
    public final void d(final float n, final boolean b) {
    }
    
    public final void mN(final ackm ackm, final Object o) {
        if (this.l != 0) {
            final ajos ajos = (ajos)o;
            this.j = ((wyy)ackm).a;
            this.k = ajos.i.I();
            final acgs b = this.b;
            final ImageView d = this.d;
            aotp aotp;
            if ((aotp = ajos.d) == null) {
                aotp = aotp.a;
            }
            b.g(d, aotp);
            final TextView g = this.g;
            ajut ajut;
            if ((ajut = ajos.c) == null) {
                ajut = ajut.a;
            }
            g.setText((CharSequence)acak.b(ajut));
            final TextView g2 = this.g;
            g2.setContentDescription(g2.getText());
            final TextView f = this.f;
            Spanned text;
            if ((ajos.b & 0x40) != 0x0) {
                ajut ajut2;
                if ((ajut2 = ajos.f) == null) {
                    ajut2 = ajut.a;
                }
                text = acak.b(ajut2);
            }
            else {
                ajut ajut3;
                if ((ajut3 = ajos.g) == null) {
                    ajut3 = ajut.a;
                }
                text = acak.b(ajut3);
            }
            f.setText((CharSequence)text);
            final TextView f2 = this.f;
            f2.setContentDescription(f2.getText());
            final TextView e = this.e;
            ajut ajut4;
            if ((ajut4 = ajos.h) == null) {
                ajut4 = ajut.a;
            }
            e.setText((CharSequence)acak.b(ajut4));
            this.e.setImportantForAccessibility(2);
            aiqj a;
            if ((a = ajos.e) == null) {
                a = aiqj.a;
            }
            this.a = a;
            final Object c = ackm.c("visibility_change_listener");
            if (c != null) {
                final abhq i = (abhq)c;
                if ((this.i = i) != null) {
                    i.a((abhp)this);
                }
                this.g(this.i.a);
                final float b2 = this.i.b;
            }
            return;
        }
        final ajot ajot = (ajot)o;
        this.j = ((wyy)ackm).a;
        this.k = ajot.k.I();
        final acgs b3 = this.b;
        final ImageView d2 = this.d;
        aotp aotp2;
        if ((aotp2 = ajot.d) == null) {
            aotp2 = aotp.a;
        }
        b3.g(d2, aotp2);
        final TextView e2 = this.e;
        ajut ajut5;
        if ((ajot.b & 0x8) != 0x0) {
            if ((ajut5 = ajot.f) == null) {
                ajut5 = ajut.a;
            }
        }
        else {
            ajut5 = null;
        }
        e2.setText((CharSequence)acak.b(ajut5));
        final TextView e3 = this.e;
        e3.setContentDescription(e3.getText());
        final TextView g3 = this.g;
        final int b4 = ajot.b;
        final int n = b4 & 0x20;
        Spanned text2;
        if (n != 0) {
            ajut ajut6;
            if (n != 0) {
                if ((ajut6 = ajot.h) == null) {
                    ajut6 = ajut.a;
                }
            }
            else {
                ajut6 = null;
            }
            text2 = acak.b(ajut6);
        }
        else {
            ajut ajut7;
            if ((b4 & 0x10) != 0x0) {
                if ((ajut7 = ajot.g) == null) {
                    ajut7 = ajut.a;
                }
            }
            else {
                ajut7 = null;
            }
            text2 = acak.b(ajut7);
        }
        g3.setText((CharSequence)text2);
        final TextView g4 = this.g;
        g4.setContentDescription(g4.getText());
        ezt.B(this.f, (CharSequence)null, (CharSequence)null, (List)ajot.e, (apfs)null);
        this.f.setImportantForAccessibility(2);
        aiqj a2;
        if ((a2 = ajot.j) == null) {
            a2 = aiqj.a;
        }
        this.a = a2;
        final Object c2 = ackm.c("visibility_change_listener");
        if (c2 != null) {
            final abhq j = (abhq)c2;
            if ((this.i = j) != null) {
                j.a((abhp)this);
            }
            this.f(this.i.a);
            final float b5 = this.i.b;
        }
    }
}
