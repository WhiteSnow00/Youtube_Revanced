import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ThumbnailsRenderer;
import android.view.View$OnClickListener;
import android.view.ViewStub;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iym implements shk
{
    public ViewGroup a;
    public TextView b;
    public TextView c;
    public shj d;
    public aonv e;
    final /* synthetic */ iyn f;
    private final float g;
    private ViewGroup h;
    private ImageView i;
    private ImageView j;
    
    public iym(final iyn f, final Context context) {
        this.f = f;
        this.g = context.getResources().getDisplayMetrics().density;
    }
    
    private final void d() {
        if (this.a != null) {
            return;
        }
        final iyn f = this.f;
        f.g(f.j);
        final ViewGroup d = this.f.d;
        d.getClass();
        final ViewGroup a = (ViewGroup)((ViewStub)d.findViewById(2131431904)).inflate();
        this.a = a;
        this.j = (ImageView)a.findViewById(2131429441);
        final ViewGroup h = (ViewGroup)this.a.findViewById(2131429442);
        this.h = h;
        this.b = (TextView)h.findViewById(2131429446);
        this.c = (TextView)this.h.findViewById(2131429445);
        this.i = (ImageView)this.h.findViewById(2131429444);
        this.c.setOnClickListener((View$OnClickListener)new iwh(this, 17));
        this.a.setOnClickListener((View$OnClickListener)new iwh(this, 16));
        this.h.setOnClickListener((View$OnClickListener)hzo.d);
    }
    
    public final void a() {
        this.e = null;
        this.c(false);
    }
    
    public final void b(final aonv e) {
        this.e = e;
        this.d();
        final TextView b = this.b;
        b.getClass();
        final int b2 = e.b;
        final ajsq ajsq = null;
        ajsq ajsq2;
        if ((b2 & 0x2) != 0x0) {
            if ((ajsq2 = e.d) == null) {
                ajsq2 = ajsq.a;
            }
        }
        else {
            ajsq2 = null;
        }
        b.setText((CharSequence)abyh.b(ajsq2));
        final aceo b3 = this.f.b;
        final ImageView i = this.i;
        i.getClass();
        aorm aorm;
        if ((aorm = e.i) == null) {
            aorm = aorm.a;
        }
        b3.g(i, aorm);
        anss anss;
        if ((anss = e.j) == null) {
            anss = anss.a;
        }
        final aorq aorq = (aorq)aaiy.w(anss, (agyr)ThumbnailsRenderer.thumbnailLandscapePortraitRenderer);
        if (aorq != null) {
            final aceo b4 = this.f.b;
            final ImageView j = this.j;
            j.getClass();
            aorm aorm2;
            if ((aorm2 = aorq.c) == null) {
                aorm2 = aorm.a;
            }
            b4.g(j, aorm2);
        }
        anss anss2;
        if ((anss2 = e.h) == null) {
            anss2 = anss.a;
        }
        final ahje ahje = (ahje)aaiy.w(anss2, (agyr)AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        final TextView c = this.c;
        c.getClass();
        if (ahje != null) {
            ajsq ajsq3 = ajsq;
            if ((ahje.b & 0x1) != 0x0 && (ajsq3 = ahje.e) == null) {
                ajsq3 = ajsq.a;
            }
            c.setText((CharSequence)abyh.b(ajsq3));
            if (this.c.getBackground().getCurrent() instanceof GradientDrawable) {
                final GradientDrawable background = (GradientDrawable)this.c.getBackground().getCurrent().mutate();
                int intValue;
                if (ahje.c == 3) {
                    intValue = (int)ahje.d;
                }
                else {
                    intValue = 0;
                }
                background.setColor(intValue);
                background.setCornerRadius(this.g * ahje.i);
                background.setStroke(Math.round(this.g * ahje.l), ahje.j);
                this.c.setBackground((Drawable)background);
            }
            this.c.setVisibility(0);
            return;
        }
        c.setVisibility(8);
    }
    
    public final void c(final boolean b) {
        if (b) {
            this.d();
        }
        final ViewGroup a = this.a;
        if (a != null) {
            int visibility;
            if (!b) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            a.setVisibility(visibility);
        }
    }
}
