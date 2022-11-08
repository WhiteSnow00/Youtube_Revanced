import android.util.Log;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.graphics.ColorFilter;
import android.widget.ImageView;
import android.view.View;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.graphics.PorterDuff$Mode;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jii extends acja
{
    private final Context a;
    private final aceo b;
    private final vax c;
    private final acnj d;
    private final acng e;
    private final int f;
    private final FrameLayout g;
    private acih h;
    
    public jii(final Context a, final aceo b, final vax c, final acnj d, final acng e) {
        this.a = a;
        this.b = b;
        d.getClass();
        this.d = d;
        this.c = c;
        this.e = e;
        this.g = new FrameLayout(a);
        this.f = tmy.ct(a, 2130970852).orElse(0);
    }
    
    private final void f(final TextView textView, int n, final int n2, final int n3) {
        final Drawable drawable = this.a.getResources().getDrawable(n);
        n = this.a.getResources().getDimensionPixelSize(2131166456);
        drawable.setBounds(0, 0, n2, n2);
        drawable.mutate().setColorFilter(n3, PorterDuff$Mode.SRC_IN);
        final jih jih = new jih(drawable, n);
        final SpannableString text = new SpannableString((CharSequence)String.valueOf(String.valueOf(textView.getText())).concat("  "));
        n = text.length();
        text.setSpan((Object)jih, n - 1, n, 33);
        textView.setText((CharSequence)text);
    }
    
    private final void g(final acij acij, final ajpq ajpq) {
        anss anss;
        if ((anss = ajpq.b) == null) {
            anss = anss.a;
        }
        if (((agzd)anss).rs((agyr)MenuRendererOuterClass.menuRenderer)) {
            final View viewById = this.g.findViewById(2131428448);
            anss anss2;
            if ((anss2 = ajpq.b) == null) {
                anss2 = anss.a;
            }
            this.d.f((View)this.g, viewById, (ameo)((agzd)anss2).rr((agyr)MenuRendererOuterClass.menuRenderer), ajpq, ((wwx)acij).a);
        }
        final ImageView imageView = (ImageView)this.g.findViewById(2131429296);
        final aceo b = this.b;
        aorm aorm;
        if ((aorm = ajpq.c) == null) {
            aorm = aorm.a;
        }
        b.g(imageView, aorm);
        imageView.setColorFilter((ColorFilter)null);
        final YouTubeTextView youTubeTextView = (YouTubeTextView)this.g.findViewById(2131427896);
        ajsq ajsq;
        if ((ajsq = ajpq.d) == null) {
            ajsq = ajsq.a;
        }
        youTubeTextView.setText((CharSequence)abyh.b(ajsq));
        final YouTubeTextView youTubeTextView2 = (YouTubeTextView)this.g.findViewById(2131428205);
        ajsq ajsq2;
        if ((ajsq2 = ajpq.h) == null) {
            ajsq2 = ajsq.a;
        }
        youTubeTextView2.setText((CharSequence)abyh.b(ajsq2));
        final YouTubeTextView youTubeTextView3 = (YouTubeTextView)this.g.findViewById(2131430777);
        ajsq ajsq3;
        if ((ajsq3 = ajpq.j) == null) {
            ajsq3 = ajsq.a;
        }
        youTubeTextView3.setText((CharSequence)abyh.b(ajsq3));
    }
    
    private final void h(final akbe akbe, final int n) {
        final ImageView imageView = (ImageView)this.g.findViewById(2131427897);
        if (imageView != null) {
            imageView.setImageResource(this.e.a(akbe));
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().mutate().setColorFilter(tmy.ct(this.a, n).orElse(0), PorterDuff$Mode.SRC_IN);
            }
        }
    }
    
    public final View a() {
        return (View)this.g;
    }
    
    public final void c(final acir acir) {
        this.h.c();
    }
}
