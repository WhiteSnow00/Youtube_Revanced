import java.util.Map;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.view.LayoutInflater;
import android.support.constraint.ConstraintLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kis extends acld
{
    public final vcy a;
    public ajvi b;
    public ajuz c;
    public final ConstraintLayout d;
    public final mcb e;
    private final LayoutInflater f;
    private final acgs g;
    private final vdr h;
    private wyw i;
    private final View j;
    private final ImageView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final Button q;
    private final Button r;
    private final Button s;
    private final Button t;
    private final Button u;
    private final Button v;
    private final vai x;
    
    public kis(final Context context, final vcy a, final acgs g, final vdr h, final mcb e, final vai x, final byte[] array, final byte[] array2) {
        final LayoutInflater from = LayoutInflater.from(context);
        this.f = from;
        this.a = a;
        this.g = g;
        this.e = e;
        this.h = h;
        x.getClass();
        this.x = x;
        this.b = null;
        final View inflate = from.inflate(2131624449, (ViewGroup)null, false);
        this.j = inflate;
        this.k = (ImageView)inflate.findViewById(2131432107);
        this.l = (TextView)inflate.findViewById(2131432095);
        this.m = (TextView)inflate.findViewById(2131428624);
        this.n = (TextView)inflate.findViewById(2131428390);
        this.d = (ConstraintLayout)inflate.findViewById(2131428389);
        this.o = (TextView)inflate.findViewById(2131428695);
        this.p = (TextView)inflate.findViewById(2131431737);
        final Button q = (Button)inflate.findViewById(2131427738);
        this.q = q;
        final Button s = (Button)inflate.findViewById(2131427739);
        this.s = s;
        final Button u = (Button)inflate.findViewById(2131431809);
        this.u = u;
        final Button r = (Button)inflate.findViewById(2131431216);
        this.r = r;
        final Button t = (Button)inflate.findViewById(2131431217);
        this.t = t;
        final Button v = (Button)inflate.findViewById(2131431221);
        this.v = v;
        q.setOnClickListener((View$OnClickListener)new kgx(this, 7));
        r.setOnClickListener((View$OnClickListener)new kgx(this, 8));
        s.setOnClickListener((View$OnClickListener)new kgx(this, 6));
        t.setOnClickListener((View$OnClickListener)new kgx(this, 5));
        this.g(u);
        this.g(v);
    }
    
    private final void g(final Button button) {
        button.setOnClickListener((View$OnClickListener)new kir(this));
    }
    
    private final boolean h() {
        final ajuz c = this.c;
        if (c != null) {
            final int bs = adyf.bS(c.u);
            if (bs != 0) {
                if (bs == 2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final View a() {
        return this.j;
    }
    
    public final void c(final acku acku) {
        if ((this.c.b & 0x8000) != 0x0) {
            final veb e = ((vdw)this.h.b()).e();
            ((vfw)e).g(this.c.r);
            ((vfw)e).b().U();
        }
        final Object c = this.e.c;
        if (c != null) {
            ((ViewGroup)c).removeAllViews();
        }
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((ajuz)o).q.I();
    }
    
    public final void f() {
        final ajuz c = this.c;
        if (c != null) {
            anuv anuv;
            if ((anuv = c.o) == null) {
                anuv = anuv.a;
            }
            if (anuv.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
                anuv anuv2;
                if ((anuv2 = this.c.o) == null) {
                    anuv2 = anuv.a;
                }
                final aicz aicz = (aicz)anuv2.rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
                if ((aicz.b & 0x10000) != 0x0) {
                    final vcy a = this.a;
                    aiqj aiqj;
                    if ((aiqj = aicz.p) == null) {
                        aiqj = aiqj.a;
                    }
                    a.c(aiqj, (Map)null);
                }
                if ((aicz.b & 0x8000) != 0x0) {
                    final vcy a2 = this.a;
                    aiqj aiqj2;
                    if ((aiqj2 = aicz.o) == null) {
                        aiqj2 = aiqj.a;
                    }
                    a2.a(aiqj2);
                }
            }
        }
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final ajuz c = (ajuz)o;
        c.getClass();
        if ((c.b & 0x8000) != 0x0) {
            this.b = (ajvi)this.h.b().f(c.r).j(ajvi.class).af();
        }
        if (this.b != null) {
            final String r = c.r;
            this.h.b().h(r, false).af(asil.a()).aH((asjm)new ink(this, r, 8));
            this.i = ackm.a;
            this.c = c;
            anuv anuv;
            if ((anuv = c.o) == null) {
                anuv = anuv.a;
            }
            final boolean ry = anuv.ry((ahaq)ButtonRendererOuterClass.buttonRenderer);
            final ajut ajut = null;
            final ajut ajut2 = null;
            if (ry) {
                final wyw i = this.i;
                anuv anuv2;
                if ((anuv2 = this.c.o) == null) {
                    anuv2 = anuv.a;
                }
                i.t((wzz)new wyt(((aicz)anuv2.rx((ahaq)ButtonRendererOuterClass.buttonRenderer)).w), (alhi)null);
            }
            anuv anuv3;
            if ((anuv3 = this.c.p) == null) {
                anuv3 = anuv.a;
            }
            if (anuv3.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
                final wyw j = this.i;
                anuv anuv4;
                if ((anuv4 = this.c.p) == null) {
                    anuv4 = anuv.a;
                }
                j.t((wzz)new wyt(((aicz)anuv4.rx((ahaq)ButtonRendererOuterClass.buttonRenderer)).w), (alhi)null);
            }
            final ajuz c2 = this.c;
            if ((c2.b & 0x1) != 0x0) {
                final acgs g = this.g;
                final ImageView k = this.k;
                aotp aotp;
                if ((aotp = c2.c) == null) {
                    aotp = aotp.a;
                }
                g.g(k, aotp);
            }
            else if (this.h()) {
                this.k.setVisibility(8);
            }
            final TextView l = this.l;
            final ajuz c3 = this.c;
            ajut ajut3;
            if ((c3.b & 0x2) != 0x0) {
                if ((ajut3 = c3.d) == null) {
                    ajut3 = ajut.a;
                }
            }
            else {
                ajut3 = null;
            }
            tpe.t(l, (CharSequence)acak.b(ajut3));
            final TextView m = this.m;
            final ajuz c4 = this.c;
            ajut ajut4;
            if ((c4.b & 0x4) != 0x0) {
                if ((ajut4 = c4.e) == null) {
                    ajut4 = ajut.a;
                }
            }
            else {
                ajut4 = null;
            }
            tpe.t(m, (CharSequence)acak.b(ajut4));
            final TextView n = this.n;
            final ajuz c5 = this.c;
            ajut ajut5;
            if ((c5.b & 0x8) != 0x0) {
                if ((ajut5 = c5.f) == null) {
                    ajut5 = ajut.a;
                }
            }
            else {
                ajut5 = null;
            }
            n.setText((CharSequence)acak.b(ajut5));
            this.e.l((ViewGroup)this.d, this.c, this.b);
            final TextView o2 = this.o;
            final ajuz c6 = this.c;
            ajut ajut6;
            if ((c6.b & 0x10000) != 0x0) {
                if ((ajut6 = c6.s) == null) {
                    ajut6 = ajut.a;
                }
            }
            else {
                ajut6 = null;
            }
            tpe.t(o2, (CharSequence)vde.a(ajut6, this.a, false));
            final TextView p2 = this.p;
            final ajuz c7 = this.c;
            ajut ajut7;
            if ((c7.b & 0x20000) != 0x0) {
                if ((ajut7 = c7.t) == null) {
                    ajut7 = ajut.a;
                }
            }
            else {
                ajut7 = null;
            }
            tpe.t(p2, (CharSequence)acak.b(ajut7));
            anuv anuv5;
            if ((anuv5 = this.c.o) == null) {
                anuv5 = anuv.a;
            }
            if (anuv5.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
                anuv anuv6;
                if ((anuv6 = this.c.o) == null) {
                    anuv6 = anuv.a;
                }
                final aicz aicz = (aicz)anuv6.rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
                if (this.h()) {
                    if (this.x.aP()) {
                        this.q.setVisibility(8);
                        this.s.setVisibility(8);
                        this.r.setVisibility(8);
                        this.t.setVisibility(0);
                        final Button t = this.t;
                        ajut ajut8;
                        if ((aicz.b & 0x200) != 0x0) {
                            if ((ajut8 = aicz.i) == null) {
                                ajut8 = ajut.a;
                            }
                        }
                        else {
                            ajut8 = null;
                        }
                        t.setText((CharSequence)acak.b(ajut8));
                    }
                    else {
                        this.q.setVisibility(8);
                        this.r.setVisibility(8);
                        this.t.setVisibility(8);
                        this.s.setVisibility(0);
                        final Button s = this.s;
                        ajut ajut9;
                        if ((aicz.b & 0x200) != 0x0) {
                            if ((ajut9 = aicz.i) == null) {
                                ajut9 = ajut.a;
                            }
                        }
                        else {
                            ajut9 = null;
                        }
                        s.setText((CharSequence)acak.b(ajut9));
                    }
                }
                else if (this.x.aP()) {
                    this.q.setVisibility(8);
                    this.s.setVisibility(8);
                    this.t.setVisibility(8);
                    this.r.setVisibility(0);
                    final Button r2 = this.r;
                    ajut ajut10;
                    if ((aicz.b & 0x200) != 0x0) {
                        if ((ajut10 = aicz.i) == null) {
                            ajut10 = ajut.a;
                        }
                    }
                    else {
                        ajut10 = null;
                    }
                    r2.setText((CharSequence)acak.b(ajut10));
                }
                else {
                    this.s.setVisibility(8);
                    this.r.setVisibility(8);
                    this.t.setVisibility(8);
                    this.q.setVisibility(0);
                    final Button q = this.q;
                    ajut ajut11;
                    if ((aicz.b & 0x200) != 0x0) {
                        if ((ajut11 = aicz.i) == null) {
                            ajut11 = ajut.a;
                        }
                    }
                    else {
                        ajut11 = null;
                    }
                    q.setText((CharSequence)acak.b(ajut11));
                }
            }
            anuv anuv7;
            if ((anuv7 = this.c.p) == null) {
                anuv7 = anuv.a;
            }
            if (anuv7.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
                anuv anuv8;
                if ((anuv8 = this.c.p) == null) {
                    anuv8 = anuv.a;
                }
                final aicz aicz2 = (aicz)anuv8.rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
                if (this.x.aP()) {
                    this.u.setVisibility(8);
                    this.v.setVisibility(0);
                    final Button v = this.v;
                    ajut ajut12 = ajut2;
                    if ((aicz2.b & 0x200) != 0x0 && (ajut12 = aicz2.i) == null) {
                        ajut12 = ajut.a;
                    }
                    v.setText((CharSequence)acak.b(ajut12));
                    return;
                }
                this.v.setVisibility(8);
                this.u.setVisibility(0);
                final Button u = this.u;
                ajut ajut13 = ajut;
                if ((aicz2.b & 0x200) != 0x0 && (ajut13 = aicz2.i) == null) {
                    ajut13 = ajut.a;
                }
                u.setText((CharSequence)acak.b(ajut13));
            }
            return;
        }
        zlm.b(zll.b, zlk.a, "Lead Form Ads on Confirmation Page failed to read from Entity Store with id=".concat(String.valueOf(c.r)));
    }
}
