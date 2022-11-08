import android.app.AlertDialog$Builder;
import android.view.View;
import android.text.method.LinkMovementMethod;
import android.content.DialogInterface$OnClickListener;
import android.widget.TextView;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.content.res.Resources;
import android.text.Spanned;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqe extends abyt
{
    public final vax a;
    public final wwv b;
    public final acng c;
    public aibb d;
    public aibb e;
    public Map f;
    public final aeby g;
    private final aceo k;
    
    public gqe(final vax a, final wwv b, final acng c, final aceo k, final aeby aeby, final aeby g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(a, aeby, (Object)null, (String)null, (byte[])null, (byte[])null, (byte[])null);
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
        this.k = k;
        this.g = g;
    }
    
    public static CharSequence b(final aibb aibb) {
        final CharSequence charSequence = null;
        ajsq ajsq = null;
        Object b;
        if (aibb == null) {
            b = charSequence;
        }
        else {
            if ((aibb.b & 0x200) != 0x0 && (ajsq = aibb.i) == null) {
                ajsq = ajsq.a;
            }
            b = abyh.b(ajsq);
        }
        return (CharSequence)b;
    }
    
    public static CharSequence c(final List list, final vax vax) {
        final boolean empty = list.isEmpty();
        final CharSequence charSequence = null;
        if (empty) {
            return null;
        }
        final CharSequence concat = TextUtils.concat(new CharSequence[] { System.getProperty("line.separator"), System.getProperty("line.separator") });
        final Iterator iterator = list.iterator();
        Object concat2 = charSequence;
        while (iterator.hasNext()) {
            final Spanned a = vbd.a((ajsq)iterator.next(), vax, false);
            if (concat2 != null) {
                concat2 = TextUtils.concat(new CharSequence[] { (CharSequence)concat2, concat, (CharSequence)a });
            }
            else {
                concat2 = a;
            }
        }
        return (CharSequence)concat2;
    }
    
    protected final Map d() {
        final Map d = super.d();
        final Map f = this.f;
        if (f != null) {
            d.putAll(f);
        }
        return d;
    }
    
    protected final void e() {
        final aibb e = this.e;
        if (e != null) {
            if ((e.b & 0x800000) != 0x0) {
                this.b.J(3, (wxz)new wws(e.w), (alff)null);
            }
            final aibb e2 = this.e;
            final int b = e2.b;
            if ((0x8000 & b) != 0x0) {
                final vax h = super.h;
                aioe aioe;
                if ((aioe = e2.o) == null) {
                    aioe = aioe.a;
                }
                h.c(aioe, this.d());
                return;
            }
            if ((b & 0x10000) != 0x0) {
                final vax h2 = super.h;
                aioe aioe2;
                if ((aioe2 = e2.p) == null) {
                    aioe2 = aioe.a;
                }
                h2.c(aioe2, this.d());
            }
        }
    }
    
    public final void f() {
        final aibb d = this.d;
        if (d != null) {
            if ((d.b & 0x800000) != 0x0) {
                this.b.J(3, (wxz)new wws(d.w), (alff)null);
            }
            final aibb d2 = this.d;
            if ((d2.b & 0x10000) != 0x0) {
                final vax h = super.h;
                aioe aioe;
                if ((aioe = d2.p) == null) {
                    aioe = aioe.a;
                }
                h.c(aioe, this.d());
            }
        }
    }
    
    public final void g(final Resources resources, final ImageView imageView, final aorm aorm) {
        final Uri d = actc.D(aorm);
        if (d == null) {
            return;
        }
        this.k.k(d, (szx)new gqd(resources, imageView, 0));
    }
    
    public final void h(final Context context, int orElse, final Spanned spanned, final List list, final aorm aorm, final aorm aorm2, final aorm aorm3, final akbf akbf, final boolean b) {
        final View inflate = LayoutInflater.from(context).inflate(orElse, (ViewGroup)null);
        final abyy af = this.g.af(context);
        ((AlertDialog$Builder)af).setView(inflate);
        final tnw tnw = new tnw(context);
        orElse = tmy.ct(context, 2130970852).orElse(0);
        if (aorm != null && aorm.c.size() > 0) {
            new acex((tni)this.k, (ImageView)inflate.findViewById(2131429196)).k(aorm);
            final View viewById = inflate.findViewById(2131429555);
            if (aorm2 != null && aorm3 != null && akbf != null) {
                this.g(context.getResources(), (ImageView)inflate.findViewById(2131432261), aorm3);
                this.g(context.getResources(), (ImageView)inflate.findViewById(2131431998), aorm2);
                final ImageView imageView = (ImageView)inflate.findViewById(2131429554);
                final acng c = this.c;
                akbe akbe;
                if ((akbe = akbe.b(akbf.c)) == null) {
                    akbe = akbe.a;
                }
                imageView.setImageResource(c.a(akbe));
                tnw.b(viewById.getBackground(), orElse);
            }
            else {
                viewById.setVisibility(8);
            }
        }
        else {
            inflate.findViewById(2131429202).setVisibility(8);
        }
        if (b) {
            inflate.findViewById(2131428234).setOnClickListener((View$OnClickListener)new fuh(this, 13));
            final View viewById2 = inflate.findViewById(2131429553);
            viewById2.setOnClickListener((View$OnClickListener)new fuh(this, 14));
            viewById2.setOnTouchListener((View$OnTouchListener)acsy.c());
            final TextView textView = (TextView)inflate.findViewById(2131429552);
            tnw.b(textView.getBackground(), orElse);
            textView.setTextColor(tmy.ct(context, 2130970857).orElse(0));
            textView.setText(b(this.d));
            ((AlertDialog$Builder)af).setNegativeButton((CharSequence)null, (DialogInterface$OnClickListener)this);
            ((AlertDialog$Builder)af).setPositiveButton((CharSequence)null, (DialogInterface$OnClickListener)this);
        }
        else {
            ((AlertDialog$Builder)af).setNegativeButton(b(this.e), (DialogInterface$OnClickListener)this);
            ((AlertDialog$Builder)af).setPositiveButton(b(this.d), (DialogInterface$OnClickListener)this);
        }
        tmy.t((TextView)inflate.findViewById(2131432092), (CharSequence)spanned);
        final TextView textView2 = (TextView)inflate.findViewById(2131429843);
        textView2.setText(c(list, this.a));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        this.j(((AlertDialog$Builder)af).create());
        this.k();
        final aibb e = this.e;
        if (e != null && (e.b & 0x800000) != 0x0) {
            this.b.D((wxz)new wws(e.w));
        }
    }
}
