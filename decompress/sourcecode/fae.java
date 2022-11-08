import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.graphics.PorterDuff$Mode;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.support.v7.widget.AppCompatImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fae implements acil
{
    public final LinearLayout a;
    private final Context b;
    private final vax c;
    private final acng d;
    private final RelativeLayout e;
    private final YouTubeTextView f;
    private final AppCompatImageView g;
    
    public fae(final Context b, final vax c, final acng d) {
        this.b = b;
        this.c = c;
        this.d = d;
        final LinearLayout a = new LinearLayout(b);
        this.a = a;
        final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, -2);
        layoutParams.setMargins(0, (int)b.getResources().getDimension(2131165744), 0, 0);
        a.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        a.setOrientation(1);
        final RelativeLayout e = (RelativeLayout)LayoutInflater.from(b).inflate(2131624576, (ViewGroup)null);
        this.e = e;
        this.f = (YouTubeTextView)e.findViewById(2131429377);
        this.g = (AppCompatImageView)e.findViewById(2131429270);
        a.addView((View)e);
    }
    
    public final View a() {
        return (View)this.a;
    }
    
    public final void b(final akdc akdc) {
        final YouTubeTextView f = this.f;
        ajsq ajsq;
        if ((ajsq = akdc.d) == null) {
            ajsq = ajsq.a;
        }
        f.setText((CharSequence)vbd.a(ajsq, this.c, false));
        final Resources resources = this.b.getResources();
        final acng d = this.d;
        akbf akbf;
        if ((akbf = akdc.c) == null) {
            akbf = akbf.a;
        }
        akbe akbe;
        if ((akbe = akbe.b(akbf.c)) == null) {
            akbe = akbe.a;
        }
        final Drawable drawable = resources.getDrawable(d.a(akbe));
        final AppCompatImageView g = this.g;
        tnw.e(drawable, tmy.cn(this.b, 2130970924), PorterDuff$Mode.SRC_IN);
        g.setImageDrawable(drawable);
    }
    
    public final void c(final acir acir) {
    }
}
