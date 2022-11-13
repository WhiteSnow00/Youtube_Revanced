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

public final class eys implements eyq
{
    public final bu a;
    public final zmf b;
    public final vlf c;
    public final vol d;
    public final Executor e;
    public EditText f;
    public EditText g;
    public AlertDialog h;
    public aije i;
    public final vwa j;
    private final tqd k;
    private final vcy l;
    private final atke m;
    private final akw n;
    private final boolean o;
    private View p;
    private TextInputLayout q;
    private TextInputLayout r;
    private TextView s;
    private LinearLayout t;
    private final aeea u;
    
    public eys(final bu a, final tqd k, final zmf b, final vlf c, final vcy l, final atke m, final vol d, final Executor e, final aeea u, final vai vai, final byte[] array, final byte[] array2, final byte[] array3) {
        this.j = vwa.Z((tvo)eyj.c);
        this.a = a;
        this.k = k;
        this.b = b;
        this.c = c;
        this.l = l;
        this.m = m;
        this.u = u;
        this.n = (akw)new eyr();
        this.d = d;
        this.e = e;
        this.o = vai.s();
    }
    
    public final void a(final aije i) {
        final AlertDialog h = this.h;
        final ajut ajut = null;
        if (h == null) {
            this.p = LayoutInflater.from((Context)this.a).inflate(2131624167, (ViewGroup)null);
            final acba al = this.u.al((Context)this.a);
            final View p = this.p;
            p.getClass();
            final AlertDialog$Builder setView = al.setView(p);
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
            h2.setOnShowListener((DialogInterface$OnShowListener)new eyk(this, 2));
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
        aijb aijb;
        if ((aijb = i.c) == null) {
            aijb = aijb.a;
        }
        ajuh a2;
        if (aijb.b == 91739437) {
            a2 = (ajuh)aijb.c;
        }
        else {
            a2 = ajuh.a;
        }
        final ahaz builder = a2.toBuilder();
        ajut ajut2;
        if ((ajut2 = ((ajuh)builder.instance).c) == null) {
            ajut2 = ajut.a;
        }
        q.t((CharSequence)acak.b(ajut2));
        q.p(false);
        q.o((CharSequence)null);
        anb.N((View)q, this.n);
        f.setText((CharSequence)((ajuh)builder.instance).d);
        f.setSelection(0, ((ajuh)builder.instance).d.length());
        if ((i.b & 0x2) == 0x0) {
            if ((((ajuh)builder.instance).b & 0x8) != 0x0) {
                q.i(true);
                q.j(((ajuh)builder.instance).e);
            }
        }
        ahaz builder2;
        if ((i.b & 0x2) != 0x0) {
            aijb aijb2;
            if ((aijb2 = i.d) == null) {
                aijb2 = aijb.a;
            }
            ajuh a3;
            if (aijb2.b == 91739437) {
                a3 = (ajuh)aijb2.c;
            }
            else {
                a3 = ajuh.a;
            }
            builder2 = a3.toBuilder();
        }
        else {
            builder2 = null;
        }
        if (builder2 != null) {
            ajut ajut3;
            if ((ajut3 = ((ajuh)builder2.instance).c) == null) {
                ajut3 = ajut.a;
            }
            r.t((CharSequence)acak.b(ajut3));
            r.p(false);
            r.o((CharSequence)null);
            anb.N((View)r, this.n);
            g.setText((CharSequence)((ajuh)builder2.instance).d);
            r.setVisibility(0);
        }
        else {
            r.setVisibility(8);
        }
        if ((i.b & 0x8) != 0x0) {
            aiiz aiiz;
            if ((aiiz = i.e) == null) {
                aiiz = aiiz.a;
            }
            final int b = aiiz.b;
            if (b == 141083272) {
                final aiiy aiiy = (aiiy)aiiz.c;
                ajut ajut4 = ajut;
                if ((aiiy.b & 0x1) != 0x0 && (ajut4 = aiiy.c) == null) {
                    ajut4 = ajut.a;
                }
                s.setText((CharSequence)vde.a(ajut4, this.l, false));
                s.setVisibility(0);
            }
            else if (b == 356957023) {
                final aiix aiix = (aiix)aiiz.c;
                t.removeAllViews();
                for (final akff akff : aiix.b) {
                    if ((akff.b & 0x2) != 0x0) {
                        final fai fai = (fai)this.m.a();
                        new ackm();
                        fai.b(akff);
                        t.addView((View)fai.a);
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
    
    public final void b(final pvh pvh) {
        this.j.H((Object)pvh);
    }
    
    public final void c(int n, final String s) {
        final TextInputLayout q = this.q;
        q.getClass();
        final TextInputLayout r = this.r;
        r.getClass();
        if (--n == 1) {
            q.o((CharSequence)s);
            return;
        }
        if (n != 2) {
            this.k.d(s);
            return;
        }
        r.o((CharSequence)s);
    }
}
