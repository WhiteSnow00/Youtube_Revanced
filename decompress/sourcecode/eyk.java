import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import java.util.concurrent.atomic.AtomicReference;
import android.view.Window;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;
import android.content.DialogInterface$OnClickListener;
import android.content.res.ColorStateList;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.regex.PatternSyntaxException;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import android.text.TextWatcher;
import java.util.regex.Pattern;
import android.app.AlertDialog;
import android.widget.EditText;
import java.util.concurrent.Executor;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyk implements eyf
{
    public final bu a;
    public final tny b;
    public final vmp c;
    public final Handler d;
    public final Executor e;
    public final Executor f;
    public EditText g;
    public AlertDialog h;
    public aihf i;
    public Pattern j;
    public TextWatcher k;
    public vdo l;
    public Runnable m;
    public ListenableFuture n;
    public final vup o;
    private final zki p;
    private final vbq q;
    private final abyc r;
    private final atjj s;
    private final boolean t;
    private View u;
    private TextInputLayout v;
    private LinearLayout w;
    private Drawable x;
    private asic y;
    private final aeby z;
    
    public eyk(final bu a, final tny b, final zki p15, final vbq q, final ackz r, final atjj s, final vmp c, final Handler d, final Executor e, final Executor f, final aeby z, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3) {
        this.o = vup.P((ttk)eyg.a);
        this.m = null;
        this.n = null;
        this.a = a;
        this.b = b;
        this.p = p15;
        this.q = q;
        this.r = (abyc)r;
        this.s = s;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.z = z;
        this.t = uyi.s();
    }
    
    private final void g() {
        this.v.o(null);
    }
    
    private final void h() {
        this.v.r(null);
    }
    
    private final void i(final aihf i) {
        this.e();
        this.i = i;
        try {
            aifo aifo;
            if ((aifo = i.i) == null) {
                aifo = aifo.a;
            }
            final String g = aifo.g;
            Pattern compile;
            if (g.length() > 0) {
                final StringBuilder sb = new StringBuilder("^");
                sb.append(g);
                sb.append("$");
                compile = Pattern.compile(sb.toString());
            }
            else {
                compile = null;
            }
            this.j = compile;
        }
        catch (final PatternSyntaxException ex) {
            this.j = null;
            zjp.b(zjo.a, zjn.I, "[ChannelProfileHandleEditorControllerImpl] ChannelHandleStaticValidationParams.validValueRegexp is invalid");
        }
        final TextInputLayout v = this.v;
        ajsq ajsq;
        if ((ajsq = this.i.d) == null) {
            ajsq = ajsq.a;
        }
        v.t((CharSequence)abyh.b(ajsq));
        this.g.setText((CharSequence)this.i.c);
        this.v.l(null);
        this.g();
        this.w.removeAllViews();
        for (final akdc akdc : this.i.j) {
            final fae fae = (fae)this.s.a();
            new acij();
            fae.b(akdc);
            this.w.addView((View)fae.a);
        }
        if (this.i.j.size() > 0) {
            this.w.setVisibility(0);
        }
        else {
            this.w.setVisibility(8);
        }
        this.y = this.l.i(this.i.f).aa(ashw.a()).aB((asix)new erw(this, 16));
    }
    
    @Override
    public final void a(final aihf aihf) {
        if (this.h == null) {
            this.k = (TextWatcher)new eyi(this, 0);
            this.l = (vdo)this.q.a(this.p.c());
            final View inflate = LayoutInflater.from((Context)this.a).inflate(2131624167, (ViewGroup)null);
            this.u = inflate;
            final TextInputLayout v = (TextInputLayout)inflate.findViewById(2131429176);
            this.v = v;
            v.a.c("@");
            final TextView textView = (TextView)this.v.findViewById(2131431990);
            textView.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-2, -1));
            textView.setGravity(17);
            this.v.M();
            this.x = (Drawable)new pct(this.a.getResources().getDimension(2131165738), this.a.getResources().getDimensionPixelSize(2131165739), 0, new int[] { tmy.cn((Context)this.a, 2130970864) });
            this.v.p(true);
            this.v.q(ColorStateList.valueOf(tmy.cn((Context)this.a, 2130970856)));
            this.v.s(true);
            this.g = (EditText)this.v.findViewById(2131429174);
            this.w = (LinearLayout)this.u.findViewById(2131429376);
            final abyy af = this.z.af((Context)this.a);
            final View u = this.u;
            u.getClass();
            final AlertDialog$Builder setView = af.setView(u);
            final bu a = this.a;
            int n;
            if (!this.t) {
                n = 17039370;
            }
            else {
                n = 2132017689;
            }
            (this.h = setView.setPositiveButton((CharSequence)a.getString(n), (DialogInterface$OnClickListener)null).setNegativeButton((CharSequence)this.a.getString(17039360), (DialogInterface$OnClickListener)null).create()).setOnShowListener((DialogInterface$OnShowListener)new eyh(this, 0));
            this.h.setOnDismissListener((DialogInterface$OnDismissListener)new fal(this, 1));
        }
        this.i(aihf);
        this.h.show();
        final Window window = this.h.getWindow();
        if (window != null) {
            window.setLayout((int)this.a.getResources().getDimension(2131165737), -2);
        }
    }
    
    @Override
    public final void b(final qpt qpt) {
        this.o.D((Object)qpt);
    }
    
    @Override
    public final void c(final qpt qpt) {
        this.o.E((Object)qpt);
    }
    
    public final void d() {
        final Runnable m = this.m;
        if (m != null) {
            this.d.removeCallbacks(m);
            this.m = null;
        }
        final ListenableFuture n = this.n;
        if (n != null) {
            n.cancel(true);
            this.n = null;
        }
    }
    
    public final void e() {
        final asic y = this.y;
        if (y != null) {
            asjg.b((AtomicReference)y);
            this.y = null;
        }
    }
    
    public final void f(final trg trg) {
        final int n = trg.a - 1;
        if (n != 0) {
            if (n == 1) {
                this.v.l(null);
                this.h();
                this.g();
                this.h.getButton(-1).setEnabled(false);
                return;
            }
            if (n == 2) {
                this.v.l(this.x);
                this.h();
                this.g();
                this.h.getButton(-1).setEnabled(false);
                return;
            }
            if (n != 3) {
                this.v.l(null);
                this.h();
                final Spanned c = abyh.c((ajsq)trg.b, this.r);
                ((TextView)this.v.findViewById(2131431987)).setMovementMethod(LinkMovementMethod.getInstance());
                this.v.o((CharSequence)c);
                this.h.getButton(-1).setEnabled(false);
                return;
            }
        }
        this.v.l(null);
        this.g();
        this.v.r((CharSequence)abyh.c((ajsq)trg.c, this.r));
        this.h.getButton(-1).setEnabled(true);
    }
}
