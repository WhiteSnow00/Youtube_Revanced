import android.app.AlertDialog$Builder;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.RadioButton;
import android.content.DialogInterface$OnClickListener;
import android.widget.CheckBox;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import android.view.View;
import android.view.View$OnClickListener;
import android.content.Context;
import android.view.LayoutInflater;
import java.util.concurrent.TimeUnit;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.Activity;
import android.app.AlertDialog;
import android.widget.Switch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class exn implements acil
{
    public final Switch a;
    public final exe b;
    public boolean c;
    public jqd d;
    public jqe e;
    public AlertDialog f;
    public AlertDialog g;
    private final Activity h;
    private final acio i;
    private final TextView j;
    private final TextView k;
    private final asib l;
    private final int m;
    private anxs n;
    private boolean o;
    private boolean p;
    private final agfu q;
    private final blt r;
    private final aeby s;
    
    public exn(final Activity h, final exe b, final arud arud, final blt r, final giz i, final agfu q, final asho asho, final aeby s, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.i = (acio)i;
        this.h = h;
        this.p = false;
        this.r = r;
        this.s = s;
        final TimeUnit seconds = TimeUnit.SECONDS;
        final akak f = arud.f();
        alvs alvs;
        if ((alvs = f.e) == null) {
            alvs = alvs.a;
        }
        long seconds2;
        if ((alvs.e & 0x20) != 0x0) {
            alvs alvs2;
            if ((alvs2 = f.e) == null) {
                alvs2 = alvs.a;
            }
            seconds2 = alvs2.Z;
        }
        else {
            seconds2 = TimeUnit.MINUTES.toSeconds(15L);
        }
        this.m = Math.max(1, (int)seconds.toMinutes(seconds2));
        this.f(b.b());
        this.q = q;
        final View inflate = LayoutInflater.from((Context)h).inflate(2131625356, viewGroup, false);
        this.j = (TextView)inflate.findViewById(2131432092);
        this.k = (TextView)inflate.findViewById(2131431886);
        this.a = (Switch)inflate.findViewById(2131431917);
        i.c(inflate);
        i.d((View$OnClickListener)new jl(this, 12));
        final ashe af = ashe.v((ashg)new hyl(this, 1)).af();
        this.l = new asib(new asic[] { b.g().aa(asho).aB((asix)new erw(this, 10)), r.f().aa(asho).aB((asix)new erw(this, 11)), af.aa(asho).J((asjd)exd.c).aB((asix)new erw(this, 12)), af.aa(asho).aB((asix)new erw(this, 13)) });
    }
    
    private final void h(final boolean b, final boolean b2) {
        ajsq ajsq;
        if (b2) {
            ajsq = abyh.g(new String[] { this.h.getString(2132017548) });
        }
        else if ((ajsq = this.n.e) == null) {
            ajsq = ajsq.a;
        }
        if (!b) {
            if ((ajsq = this.n.k) == null) {
                ajsq = ajsq.a;
            }
        }
        tmy.t(this.k, (CharSequence)abyh.b(ajsq));
    }
    
    private final void i(final boolean checked) {
        final Switch a = this.a;
        if (a != null) {
            a.setChecked(checked);
        }
    }
    
    public final View a() {
        return ((giz)this.i).a;
    }
    
    public final asgn b() {
        final ewx a = ewx.a;
        return this.b.f(a.h, a.g);
    }
    
    public final void c(final acir acir) {
        this.l.b();
    }
    
    public final void d(final boolean o, final int n, final int n2, final boolean b) {
        this.o = o;
        if (o) {
            if (this.r.f().aG() == ext.e) {
                lzi.q(this.h);
            }
            this.b.n(b);
        }
        else {
            if (((ext)this.r.f().aG()).f) {
                lzi.r(this.h);
            }
            final exe b2 = this.b;
            final int m = this.m;
            tcp.m(b2.c((aexg)new zny(n * m, n2 * m, b, 1)), (tcn)new etg(2));
        }
        this.b().U();
    }
    
    public final void f(final ewx ewx) {
        final Activity h = this.h;
        final int d = ewx.d;
        final int e = ewx.e;
        final int m = this.m;
        final boolean f = ewx.f;
        final agza builder = ((agzi)anxs.a).createBuilder();
        final agzc agzc = (agzc)((agzi)anss.a).createBuilder();
        final agzg settingDialogRenderer = SettingRenderer.settingDialogRenderer;
        final agza builder2 = ((agzi)anxy.a).createBuilder();
        final ajsq h2 = abyh.h(((Context)h).getString(2132017545));
        builder2.copyOnWrite();
        final anxy anxy = (anxy)builder2.instance;
        h2.getClass();
        anxy.c = h2;
        anxy.b |= 0x1;
        final agzc agzc2 = (agzc)((agzi)anss.a).createBuilder();
        agzc2.e((agyr)SettingRenderer.settingSingleOptionMenuRenderer, (Object)fbp.c(d, m, ((Context)h).getString(2132017550)));
        builder2.bC(agzc2);
        final agzc agzc3 = (agzc)((agzi)anss.a).createBuilder();
        agzc3.e((agyr)SettingRenderer.settingSingleOptionMenuRenderer, (Object)fbp.c(e, m, ((Context)h).getString(2132017544)));
        builder2.bC(agzc3);
        final agzc agzc4 = (agzc)((agzi)anss.a).createBuilder();
        final agzg a = SettingRenderer.a;
        final agza builder3 = ((agzi)anxs.a).createBuilder();
        builder3.copyOnWrite();
        final anxs anxs = (anxs)builder3.instance;
        anxs.b |= 0x80;
        anxs.f = f;
        final ajsq g = abyh.g(new String[] { ((Context)h).getString(2132017551) });
        builder3.copyOnWrite();
        final anxs anxs2 = (anxs)builder3.instance;
        g.getClass();
        anxs2.d = g;
        anxs2.b |= 0x10;
        agzc4.e((agyr)a, (Object)builder3.build());
        builder2.bC(agzc4);
        agzc.e((agyr)settingDialogRenderer, (Object)builder2.build());
        final anss o = (anss)((agza)agzc).build();
        builder.copyOnWrite();
        final anxs anxs3 = (anxs)builder.instance;
        o.getClass();
        anxs3.o = o;
        anxs3.b |= 0x20000;
        final ajsq g2 = abyh.g(new String[] { ((Context)h).getString(2132017549) });
        builder.copyOnWrite();
        final anxs anxs4 = (anxs)builder.instance;
        g2.getClass();
        anxs4.d = g2;
        anxs4.b |= 0x10;
        final ajsq g3 = abyh.g(new String[] { ((Context)h).getString(2132017546) });
        builder.copyOnWrite();
        final anxs anxs5 = (anxs)builder.instance;
        g3.getClass();
        anxs5.k = g3;
        anxs5.b |= 0x2000;
        final ajsq g4 = abyh.g(new String[] { ((Context)h).getString(2132017547, new Object[] { fbp.d((Context)h, d), fbp.d((Context)h, e) }) });
        builder.copyOnWrite();
        final anxs anxs6 = (anxs)builder.instance;
        g4.getClass();
        anxs6.e = g4;
        anxs6.b |= 0x20;
        builder.copyOnWrite();
        final anxs anxs7 = (anxs)builder.instance;
        anxs7.c = 345;
        anxs7.b |= 0x1;
        this.n = (anxs)builder.build();
        this.o = ewx.j;
        anss anss;
        if ((anss = this.n.o) == null) {
            anss = anss.a;
        }
        if (((agzd)anss).rs((agyr)SettingRenderer.settingDialogRenderer)) {
            if (this.p) {
                anss anss2;
                if ((anss2 = this.n.o) == null) {
                    anss2 = anss.a;
                }
                final anxy anxy2 = (anxy)((agzd)anss2).rr((agyr)SettingRenderer.settingDialogRenderer);
                if (!this.c && this.d != null && this.f.isShowing()) {
                    final jqd d2 = this.d;
                    d2.a(anxy2);
                    final TimeRangeView b = d2.b;
                    b.getClass();
                    b.d(anxy2);
                }
                else if (this.c && this.e != null) {
                    final AlertDialog g5 = this.g;
                    agnj.A((Object)g5);
                    if (g5.isShowing()) {
                        final jqe e2 = this.e;
                        anxy2.getClass();
                        e2.a(anxy2);
                        final TimeRangeView a2 = e2.a;
                        a2.getClass();
                        a2.d(anxy2);
                    }
                }
                this.h(ewx.c, ewx.j);
                this.i(ewx.c);
            }
        }
    }
    
    public final void g() {
        if (this.d == null || !this.f.isShowing()) {
            if (this.e != null) {
                final AlertDialog g = this.g;
                agnj.A((Object)g);
                if (g.isShowing()) {
                    return;
                }
            }
            anss anss;
            if ((anss = this.n.o) == null) {
                anss = anss.a;
            }
            final anxy anxy = (anxy)((agzd)anss).rr((agyr)SettingRenderer.settingDialogRenderer);
            final boolean c = this.c;
            final boolean o = this.o;
            final AlertDialog alertDialog = null;
            final AlertDialog alertDialog2 = null;
            AlertDialog alertDialog3;
            if (!c) {
                final jqd d = new jqd((Context)this.h, this.s, null, null, null);
                this.d = d;
                final qpt qpt = new qpt(this);
                final View inflate = LayoutInflater.from(d.a).inflate(2131625352, (ViewGroup)null, false);
                d.c = (TextView)inflate.findViewById(2131428669);
                d.b = (TimeRangeView)inflate.findViewById(2131432071);
                d.d = (CheckBox)inflate.findViewById(2131428178);
                final TextView c2 = d.c;
                c2.getClass();
                ajsq ajsq;
                if ((ajsq = anxy.c) == null) {
                    ajsq = ajsq.a;
                }
                c2.setText((CharSequence)abyh.b(ajsq));
                d.a(anxy);
                final TimeRangeView b = d.b;
                b.getClass();
                if (!b.c(anxy, 24)) {
                    alertDialog3 = alertDialog2;
                }
                else {
                    final abyy af = d.e.af(d.a);
                    ((AlertDialog$Builder)af).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setView(inflate).setPositiveButton(2132018938, (DialogInterface$OnClickListener)new fbh(d, qpt, 12, null, null, null));
                    alertDialog3 = ((AlertDialog$Builder)af).create();
                }
                this.f = alertDialog3;
            }
            else {
                final jqe e = new jqe((Context)this.h, this.q, this.s, null, null, null);
                this.e = e;
                final qpt qpt2 = new qpt(this);
                final View inflate2 = LayoutInflater.from(e.b).inflate(2131625353, (ViewGroup)null, false);
                e.c = (TextView)inflate2.findViewById(2131428669);
                e.d = (RadioButton)inflate2.findViewById(2131432260);
                e.e = (RadioButton)inflate2.findViewById(2131432258);
                (e.f = inflate2.findViewById(2131429722)).setOnClickListener((View$OnClickListener)new jlq(e, 17));
                e.a = (TimeRangeView)inflate2.findViewById(2131432071);
                e.g = (CheckBox)inflate2.findViewById(2131428178);
                tmy.v(e.f, false);
                tmy.v((View)e.a, false);
                final RadioButton d2 = e.d;
                d2.getClass();
                d2.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new cfl(e, 8));
                e.e.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new cfl(e, 9));
                RadioButton radioButton;
                if (o) {
                    radioButton = e.d;
                }
                else {
                    radioButton = e.e;
                }
                radioButton.setChecked(true);
                final agfu h = e.h;
                if (h.a) {
                    h.b(e.d);
                    e.h.b(e.e);
                    final int n = (int)e.b.getResources().getDimension(2131169511);
                    e.d.setPaddingRelative(n, 0, 0, 0);
                    e.e.setPaddingRelative(n, 0, 0, 0);
                }
                final TextView c3 = e.c;
                c3.getClass();
                ajsq ajsq2;
                if ((ajsq2 = anxy.c) == null) {
                    ajsq2 = ajsq.a;
                }
                c3.setText((CharSequence)abyh.b(ajsq2));
                e.a(anxy);
                final TimeRangeView a = e.a;
                a.getClass();
                if (!a.c(anxy, 24)) {
                    alertDialog3 = alertDialog;
                }
                else {
                    final abyy af2 = e.i.af(e.b);
                    ((AlertDialog$Builder)af2).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setView(inflate2).setPositiveButton(2132018938, (DialogInterface$OnClickListener)new fbh(e, qpt2, 13, null, null, null));
                    alertDialog3 = ((AlertDialog$Builder)af2).create();
                }
                this.g = alertDialog3;
            }
            if (alertDialog3 != null) {
                alertDialog3.show();
            }
        }
    }
}
