import android.view.View$OnClickListener;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.ViewGroup;
import android.graphics.Typeface;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jhx extends acja
{
    protected final acng a;
    public final TextView b;
    protected final ImageView c;
    protected final View d;
    protected final ImageView e;
    public jhw f;
    public Object g;
    protected final Context h;
    private int i;
    private final Typeface j;
    
    public jhx(final Context h, final acng a, final Typeface j) {
        this.i = 0;
        this.a = a;
        this.f = null;
        this.g = null;
        this.h = h;
        this.j = j;
        final View inflate = View.inflate(h, 2131625853, (ViewGroup)null);
        (this.d = inflate).setPaddingRelative(0, 0, 0, 0);
        this.e = (ImageView)inflate.findViewById(2131428793);
        this.b = (TextView)inflate.findViewById(2131431950);
        this.c = (ImageView)inflate.findViewById(2131431307);
    }
    
    public final View a() {
        return this.d;
    }
    
    public final void c(final acir acir) {
    }
    
    protected final Spanned f(final Spanned spanned) {
        final SpannableString spannableString = new SpannableString((CharSequence)spanned.toString());
        for (final StyleSpan styleSpan : (StyleSpan[])spanned.getSpans(0, spanned.length(), (Class)StyleSpan.class)) {
            if (styleSpan.getStyle() == 1) {
                spannableString.setSpan((Object)new abyd(this.j), spanned.getSpanStart((Object)styleSpan), spanned.getSpanEnd((Object)styleSpan), 33);
                int j;
                if ((j = this.i) == 0) {
                    j = tmy.ct(this.h, 2130970924).orElse(0);
                    this.i = j;
                }
                spannableString.setSpan((Object)new ForegroundColorSpan(j), spanned.getSpanStart((Object)styleSpan), spanned.getSpanEnd((Object)styleSpan), 33);
            }
        }
        return (Spanned)spannableString;
    }
    
    public abstract Spanned g(final Object p0);
    
    protected abstract akbf h(final Object p0);
    
    public void lR(final acij acij, final Object g) {
        this.g = g;
        this.d.setOnClickListener((View$OnClickListener)new jfv(this, 12));
        this.e.setOnClickListener((View$OnClickListener)new jfv(this, 13));
        this.f = (jhw)acij.c("SEARCH_SUGGESTION_PRESENTER_EVENT_LISTENER");
        final Spanned g2 = this.g(g);
        this.b.setTextColor(tmy.ct(this.h, 2130970924).orElse(0));
        this.b.setText((CharSequence)g2);
        this.e.setContentDescription((CharSequence)this.h.getString(2132017385, new Object[] { g2 }));
        final akbf h = this.h(g);
        final ImageView c = this.c;
        final acng a = this.a;
        akbe akbe;
        if (h != null) {
            if ((akbe = akbe.b(h.c)) == null) {
                akbe = akbe.a;
            }
        }
        else {
            akbe = akbe.a;
        }
        c.setImageResource(a.a(akbe));
        this.c.setVisibility(0);
        this.b.setPaddingRelative(tmy.aZ(this.h.getResources().getDisplayMetrics(), 12), 0, tmy.aZ(this.h.getResources().getDisplayMetrics(), 0), 0);
    }
}
