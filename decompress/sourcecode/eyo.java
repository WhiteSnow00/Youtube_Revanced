import android.view.Window;
import java.util.Iterator;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnShowListener;
import android.content.DialogInterface$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import android.view.View;
import android.app.AlertDialog;
import android.widget.EditText;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyo implements eym
{
    public final bu a;
    public final zki b;
    public final vja c;
    public final vmh d;
    public final Executor e;
    public EditText f;
    public EditText g;
    public AlertDialog h;
    public aihg i;
    public final vup j;
    private final tny k;
    private final vax l;
    private final atjj m;
    private final akv n;
    private final boolean o;
    private View p;
    private TextInputLayout q;
    private TextInputLayout r;
    private TextView s;
    private LinearLayout t;
    private final aeby u;
    
    public eyo(final bu a, final tny k, final zki b, final vja c, final vax l, final atjj m, final vmh d, final Executor e, final aeby u, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3) {
        this.j = vup.P((ttk)eyg.c);
        this.a = a;
        this.k = k;
        this.b = b;
        this.c = c;
        this.l = l;
        this.m = m;
        this.u = u;
        this.n = new eyn();
        this.d = d;
        this.e = e;
        this.o = uyi.s();
    }
    
    @Override
    public final void a(final aihg i) {
        final AlertDialog h = this.h;
        final ajsq ajsq = null;
        if (h == null) {
            this.p = LayoutInflater.from((Context)this.a).inflate(2131624168, (ViewGroup)null);
            final abyy af = this.u.af((Context)this.a);
            final View p = this.p;
            p.getClass();
            final AlertDialog$Builder setView = af.setView(p);
            final bu a = this.a;
            int n;
            if (!this.o) {
                n = 17039370;
            }
            else {
                n = 2132017689;
            }
            this.h = setView.setPositiveButton((CharSequence)a.getString(n), (DialogInterface$OnClickListener)null).setNegativeButton((CharSequence)this.a.getString(17039360), (DialogInterface$OnClickListener)null).create();
            final View p2 = this.p;
            p2.getClass();
            this.q = (TextInputLayout)p2.findViewById(2131429131);
            final View p3 = this.p;
            p3.getClass();
            this.f = (EditText)p3.findViewById(2131429130);
            final View p4 = this.p;
            p4.getClass();
            this.r = (TextInputLayout)p4.findViewById(2131428986);
            final View p5 = this.p;
            p5.getClass();
            this.g = (EditText)p5.findViewById(2131428985);
            final View p6 = this.p;
            p6.getClass();
            this.s = (TextView)p6.findViewById(2131430013);
            final View p7 = this.p;
            p7.getClass();
            this.t = (LinearLayout)p7.findViewById(2131430012);
            final AlertDialog h2 = this.h;
            h2.getClass();
            h2.setOnShowListener((DialogInterface$OnShowListener)new eyh(this, 2));
        }
        (this.i = i).getClass();
        final TextInputLayout q = this.q;
        q.getClass();
        final EditText f = this.f;
        f.getClass();
        final TextInputLayout r = this.r;
        r.getClass();
        final EditText g = this.g;
        g.getClass();
        final TextView s = this.s;
        s.getClass();
        final LinearLayout t = this.t;
        t.getClass();
        aihd aihd;
        if ((aihd = i.c) == null) {
            aihd = aihd.a;
        }
        ajse a2;
        if (aihd.b == 91739437) {
            a2 = (ajse)aihd.c;
        }
        else {
            a2 = ajse.a;
        }
        final agza builder = ((agzi)a2).toBuilder();
        ajsq ajsq2;
        if ((ajsq2 = ((ajse)builder.instance).c) == null) {
            ajsq2 = ajsq.a;
        }
        q.t((CharSequence)abyh.b(ajsq2));
        q.p(false);
        q.o(null);
        ana.N((View)q, this.n);
        f.setText((CharSequence)((ajse)builder.instance).d);
        f.setSelection(0, ((ajse)builder.instance).d.length());
        if ((i.b & 0x2) == 0x0) {
            if ((((ajse)builder.instance).b & 0x8) != 0x0) {
                q.i(true);
                q.j(((ajse)builder.instance).e);
            }
        }
        agza builder2;
        if ((i.b & 0x2) != 0x0) {
            aihd aihd2;
            if ((aihd2 = i.d) == null) {
                aihd2 = aihd.a;
            }
            ajse a3;
            if (aihd2.b == 91739437) {
                a3 = (ajse)aihd2.c;
            }
            else {
                a3 = ajse.a;
            }
            builder2 = ((agzi)a3).toBuilder();
        }
        else {
            builder2 = null;
        }
        if (builder2 != null) {
            ajsq ajsq3;
            if ((ajsq3 = ((ajse)builder2.instance).c) == null) {
                ajsq3 = ajsq.a;
            }
            r.t((CharSequence)abyh.b(ajsq3));
            r.p(false);
            r.o(null);
            ana.N((View)r, this.n);
            g.setText((CharSequence)((ajse)builder2.instance).d);
            r.setVisibility(0);
        }
        else {
            r.setVisibility(8);
        }
        if ((i.b & 0x8) != 0x0) {
            aihb aihb;
            if ((aihb = i.e) == null) {
                aihb = aihb.a;
            }
            final int b = aihb.b;
            if (b == 141083272) {
                final aiha aiha = (aiha)aihb.c;
                ajsq ajsq4 = ajsq;
                if ((aiha.b & 0x1) != 0x0 && (ajsq4 = aiha.c) == null) {
                    ajsq4 = ajsq.a;
                }
                s.setText((CharSequence)vbd.a(ajsq4, this.l, false));
                s.setVisibility(0);
            }
            else if (b == 356957023) {
                final aigz aigz = (aigz)aihb.c;
                t.removeAllViews();
                for (final akdc akdc : aigz.b) {
                    if ((akdc.b & 0x2) != 0x0) {
                        final fae fae = (fae)this.m.a();
                        new acij();
                        fae.b(akdc);
                        t.addView((View)fae.a);
                    }
                }
                t.setVisibility(0);
            }
        }
        final AlertDialog h3 = this.h;
        h3.getClass();
        h3.show();
        final Window window = h3.getWindow();
        if (window != null) {
            window.setLayout((int)this.a.getResources().getDimension(2131165737), -2);
        }
    }
    
    @Override
    public final void b(final qpt qpt) {
        this.j.D((Object)qpt);
    }
    
    public final void c(int n, final String s) {
        final TextInputLayout q = this.q;
        q.getClass();
        final TextInputLayout r = this.r;
        r.getClass();
        if (--n == 1) {
            q.o(s);
            return;
        }
        if (n != 2) {
            this.k.d(s);
            return;
        }
        r.o(s);
    }
}
