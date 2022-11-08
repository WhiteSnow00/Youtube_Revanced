import java.util.List;
import android.view.View$OnClickListener;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import android.widget.TextView;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irg extends fxp implements irf, foa
{
    public final wwv d;
    public final vax e;
    private final asib f;
    private final abns g;
    private final aceo h;
    private ImageView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private DurationBadgeView m;
    private View n;
    private final uyi o;
    private final qv p;
    
    public irg(final qv p8, final abns g, final wwv d, final vax e, final aceo h, final uyi o, final byte[] array, final byte[] array2) {
        p8.getClass();
        this.p = p8;
        g.getClass();
        this.g = g;
        this.d = d;
        this.e = e;
        h.getClass();
        this.h = h;
        this.o = o;
        this.f = new asib();
    }
    
    public final ViewGroup$LayoutParams a() {
        final ViewStub c = super.c;
        final View j = this.j();
        ViewGroup$LayoutParams layoutParams;
        if (c != null) {
            layoutParams = c.getLayoutParams();
        }
        else {
            if (j != null) {
                return j.getLayoutParams();
            }
            layoutParams = null;
        }
        return layoutParams;
    }
    
    public final void b(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final ViewStub c = super.c;
        final View j = this.j();
        if (c != null) {
            c.setLayoutParams(viewGroup$LayoutParams);
            return;
        }
        if (j != null) {
            j.setLayoutParams(viewGroup$LayoutParams);
        }
    }
    
    protected final void l() {
        final View j = this.j();
        j.getClass();
        this.i = (ImageView)j.findViewById(2131432006);
        this.j = (TextView)j.findViewById(2131432092);
        this.k = (TextView)j.findViewById(2131432344);
        this.l = (TextView)j.findViewById(2131427946);
        this.m = (DurationBadgeView)j.findViewById(2131428769);
        this.n = j.findViewById(2131432164);
        if (this.o.aR()) {
            j.findViewById(2131427743).setBackgroundResource(2131230997);
            this.n.setBackgroundResource(2131231001);
            this.i.setClipToOutline(true);
            this.i.setBackgroundResource(2131231035);
            this.m.setBackgroundResource(2131231291);
        }
    }
    
    public final void lV() {
        this.f.b();
    }
    
    protected final void q() {
        final anec anec = (anec)super.b;
        if (anec == null) {
            return;
        }
        if (this.j() != null) {
            final ImageView i = this.i;
            if (i != null && this.j != null && this.k != null && this.l != null && this.m != null) {
                if (this.n != null) {
                    final aceo h = this.h;
                    aorm aorm;
                    if ((anec.b & 0x400) != 0x0) {
                        if ((aorm = anec.j) == null) {
                            aorm = aorm.a;
                        }
                    }
                    else {
                        aorm = null;
                    }
                    h.g(i, aorm);
                    final TextView j = this.j;
                    ajsq ajsq;
                    if ((anec.b & 0x1) != 0x0) {
                        if ((ajsq = anec.c) == null) {
                            ajsq = ajsq.a;
                        }
                    }
                    else {
                        ajsq = null;
                    }
                    j.setText((CharSequence)abyh.b(ajsq));
                    final TextView k = this.j;
                    k.setContentDescription(k.getText());
                    final TextView l = this.k;
                    ajsq ajsq2;
                    if ((anec.b & 0x2) != 0x0) {
                        if ((ajsq2 = anec.d) == null) {
                            ajsq2 = ajsq.a;
                        }
                    }
                    else {
                        ajsq2 = null;
                    }
                    l.setText((CharSequence)abyh.b(ajsq2));
                    final TextView m = this.k;
                    m.setContentDescription(m.getText());
                    final TextView l2 = this.l;
                    ajsq ajsq3;
                    if ((anec.b & 0x4) != 0x0) {
                        if ((ajsq3 = anec.e) == null) {
                            ajsq3 = ajsq.a;
                        }
                    }
                    else {
                        ajsq3 = null;
                    }
                    l2.setText((CharSequence)abyh.b(ajsq3));
                    final TextView l3 = this.l;
                    l3.setContentDescription(l3.getText());
                    final aibb b = aaiy.b(anec);
                    if (b != null && (b.b & 0x8000) != 0x0) {
                        this.n.setOnClickListener((View$OnClickListener)new hpi(this, b, 17));
                    }
                    else {
                        this.n.setOnClickListener((View$OnClickListener)null);
                        this.n.setClickable(false);
                    }
                    ezp.B((TextView)this.m, null, null, (List)anec.k, null);
                }
            }
        }
    }
    
    public final void qB() {
        this.f.b();
        final asib f = this.f;
        asic asic;
        if (((uyi)this.g.cd().h).bx()) {
            asic = this.g.R().am((asix)new iqv(this, 6), (asix)irb.d);
        }
        else {
            asic = this.g.Q().R().P(ashw.a()).am((asix)new iqv(this, 6), (asix)irb.d);
        }
        f.c(asic);
    }
    
    protected final void s() {
        if (this.p.b) {
            this.qB();
        }
        this.p.c((foa)this);
    }
}
