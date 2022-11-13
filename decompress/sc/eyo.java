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

public final class eyo implements eyi
{
    public final bu a;
    public final tqd b;
    public final vot c;
    public final Handler d;
    public final Executor e;
    public final Executor f;
    public EditText g;
    public AlertDialog h;
    public aijd i;
    public Pattern j;
    public TextWatcher k;
    public vfp l;
    public Runnable m;
    public ListenableFuture n;
    public final vwa o;
    private final zmf p;
    private final vdr q;
    private final acaf r;
    private final atke s;
    private final boolean t;
    private View u;
    private TextInputLayout v;
    private LinearLayout w;
    private Drawable x;
    private asir y;
    private final aeea z;
    
    public eyo(final bu a, final tqd b, final zmf p15, final vdr q, final acnc r, final atke s, final vot c, final Handler d, final Executor e, final Executor f, final aeea z, final vai vai, final byte[] array, final byte[] array2, final byte[] array3) {
        this.o = vwa.Z((tvo)eyj.a);
        this.m = null;
        this.n = null;
        this.a = a;
        this.b = b;
        this.p = p15;
        this.q = q;
        this.r = (acaf)r;
        this.s = s;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.z = z;
        this.t = vai.s();
    }
    
    private final void g() {
        this.v.o((CharSequence)null);
    }
    
    private final void h() {
        this.v.r((CharSequence)null);
    }
    
    private final void i(final aijd i) {
        this.e();
        this.i = i;
        try {
            aihm aihm;
            if ((aihm = i.i) == null) {
                aihm = aihm.a;
            }
            final String g = aihm.g;
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
            zlm.b(zll.a, zlk.I, "[ChannelProfileHandleEditorControllerImpl] ChannelHandleStaticValidationParams.validValueRegexp is invalid");
        }
        final TextInputLayout v = this.v;
        ajut ajut;
        if ((ajut = this.i.d) == null) {
            ajut = ajut.a;
        }
        v.t((CharSequence)acak.b(ajut));
        this.g.setText((CharSequence)this.i.c);
        this.v.l((Drawable)null);
        this.g();
        this.w.removeAllViews();
        for (final akff akff : this.i.j) {
            final fai fai = (fai)this.s.a();
            new ackm();
            fai.b(akff);
            this.w.addView((View)fai.a);
        }
        if (this.i.j.size() > 0) {
            this.w.setVisibility(0);
        }
        else {
            this.w.setVisibility(8);
        }
        this.y = this.l.i(this.i.f).af(asil.a()).aH(new erz(this, 16));
    }
    
    public final void a(final aijd aijd) {
        if (this.h == null) {
            this.k = (TextWatcher)new eyl(this, 0);
            this.l = (vfp)this.q.a(this.p.c());
            final View inflate = LayoutInflater.from((Context)this.a).inflate(2131624166, (ViewGroup)null);
            this.u = inflate;
            final TextInputLayout v = (TextInputLayout)inflate.findViewById(2131429176);
            this.v = v;
            v.a.c((CharSequence)"@");
            final TextView textView = (TextView)this.v.findViewById(2131431993);
            textView.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-2, -1));
            textView.setGravity(17);
            this.v.M();
            this.x = (Drawable)new pee(this.a.getResources().getDimension(2131165738), this.a.getResources().getDimensionPixelSize(2131165739), 0, new int[] { tpe.cr((Context)this.a, 2130970864) });
            this.v.p(true);
            this.v.q(ColorStateList.valueOf(tpe.cr((Context)this.a, 2130970856)));
            this.v.s(true);
            this.g = (EditText)this.v.findViewById(2131429174);
            this.w = (LinearLayout)this.u.findViewById(2131429376);
            final acba al = this.z.al((Context)this.a);
            final View u = this.u;
            u.getClass();
            final AlertDialog$Builder setView = al.setView(u);
            final bu a = this.a;
            int n;
            if (!this.t) {
                n = 17039370;
            }
            else {
                n = 2132017689;
            }
            (this.h = setView.setPositiveButton((CharSequence)a.getString(n), (DialogInterface$OnClickListener)null).setNegativeButton((CharSequence)this.a.getString(17039360), (DialogInterface$OnClickListener)null).create()).setOnShowListener((DialogInterface$OnShowListener)new eyk(this, 0));
            this.h.setOnDismissListener((DialogInterface$OnDismissListener)new fap(this, 1));
        }
        this.i(aijd);
        this.h.show();
        final Window window = this.h.getWindow();
        if (window != null) {
            window.setLayout((int)this.a.getResources().getDimension(2131165737), -2);
        }
    }
    
    public final void b(final pvh pvh) {
        this.o.H((Object)pvh);
    }
    
    public final void c(final pvh pvh) {
        this.o.I((Object)pvh);
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
        final asir y = this.y;
        if (y != null) {
            asjv.b((AtomicReference)y);
            this.y = null;
        }
    }
    
    public final void f(final ttl ttl) {
        final int n = ttl.a - 1;
        if (n != 0) {
            if (n == 1) {
                this.v.l((Drawable)null);
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
                this.v.l((Drawable)null);
                this.h();
                final Spanned c = acak.c((ajut)ttl.b, this.r);
                ((TextView)this.v.findViewById(2131431990)).setMovementMethod(LinkMovementMethod.getInstance());
                this.v.o((CharSequence)c);
                this.h.getButton(-1).setEnabled(false);
                return;
            }
        }
        this.v.l((Drawable)null);
        this.g();
        this.v.r((CharSequence)acak.c((ajut)ttl.c, this.r));
        this.h.getButton(-1).setEnabled(true);
    }
}
