import android.text.Spanned;
import android.graphics.drawable.Drawable;
import android.view.View$OnTouchListener;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ker extends acja
{
    public final vax a;
    public final View b;
    public aioe c;
    private final aceo d;
    private final fve e;
    private final YouTubeTextView f;
    private final ImageView g;
    private final YouTubeTextView h;
    private final acek i;
    private final View$OnClickListener j;
    private final Context k;
    
    public ker(final Context k, final aceo d, final vax a, final fvf fvf, final hyc hyc, final adcr adcr, final byte[] array, final byte[] array2, final byte[] array3) {
        k.getClass();
        this.k = k;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        final View inflate = LayoutInflater.from(k).inflate(2131624433, (ViewGroup)null);
        this.b = inflate;
        final YouTubeTextView f = (YouTubeTextView)inflate.findViewById(2131432092);
        this.f = f;
        final YouTubeTextView h = (YouTubeTextView)inflate.findViewById(2131431810);
        this.h = h;
        final ImageView g = (ImageView)inflate.findViewById(2131428086);
        this.g = g;
        final acej b = d.b().b();
        b.b(2131232282);
        this.i = b.a();
        this.e = fvf.a((TextView)inflate.findViewById(2131431807), hyc.k(inflate.findViewById(2131431815)));
        this.j = (View$OnClickListener)new jtw(this, 19);
        if (adcr.d()) {
            final gby onTouchListener = new gby(this, 9);
            g.setOnTouchListener((View$OnTouchListener)onTouchListener);
            f.setOnTouchListener((View$OnTouchListener)onTouchListener);
            h.setOnTouchListener((View$OnTouchListener)onTouchListener);
        }
        inflate.setClickable(true);
        adcr.b(inflate, adcr.a(inflate, (Drawable)null));
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void c(final acir acir) {
        this.e.f();
    }
}
