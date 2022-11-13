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

public final class izl implements sjq
{
    public ViewGroup a;
    public TextView b;
    public TextView c;
    public sjp d;
    public aopy e;
    final izm f;
    private final float g;
    private ViewGroup h;
    private ImageView i;
    private ImageView j;
    
    public izl(final izm f, final Context context) {
        this.f = f;
        this.g = context.getResources().getDisplayMetrics().density;
    }
    
    private final void d() {
        if (this.a != null) {
            return;
        }
        final izm f = this.f;
        f.g(f.j);
        final ViewGroup d = this.f.d;
        d.getClass();
        final ViewGroup a = (ViewGroup)((ViewStub)d.findViewById(2131431907)).inflate();
        this.a = a;
        this.j = (ImageView)a.findViewById(2131429441);
        final ViewGroup h = (ViewGroup)this.a.findViewById(2131429442);
        this.h = h;
        this.b = (TextView)h.findViewById(2131429446);
        this.c = (TextView)this.h.findViewById(2131429445);
        this.i = (ImageView)this.h.findViewById(2131429444);
        this.c.setOnClickListener((View$OnClickListener)new ixg(this, 17));
        this.a.setOnClickListener((View$OnClickListener)new ixg(this, 16));
        this.h.setOnClickListener((View$OnClickListener)ial.d);
    }
    
    public final void a() {
        this.e = null;
        this.c(false);
    }
    
    public final void b(final aopy e) {
        this.e = e;
        this.d();
        final TextView b = this.b;
        b.getClass();
        final int b2 = e.b;
        final ajut ajut = null;
        ajut ajut2;
        if ((b2 & 0x2) != 0x0) {
            if ((ajut2 = e.d) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        b.setText((CharSequence)acak.b(ajut2));
        final acgs b3 = this.f.b;
        final ImageView i = this.i;
        i.getClass();
        aotp aotp;
        if ((aotp = e.i) == null) {
            aotp = aotp.a;
        }
        b3.g(i, aotp);
        anuv anuv;
        if ((anuv = e.j) == null) {
            anuv = anuv.a;
        }
        final aott aott = (aott)aakt.v(anuv, (ahaq)ThumbnailsRenderer.thumbnailLandscapePortraitRenderer);
        if (aott != null) {
            final acgs b4 = this.f.b;
            final ImageView j = this.j;
            j.getClass();
            aotp aotp2;
            if ((aotp2 = aott.c) == null) {
                aotp2 = aotp.a;
            }
            b4.g(j, aotp2);
        }
        anuv anuv2;
        if ((anuv2 = e.h) == null) {
            anuv2 = anuv.a;
        }
        final ahlc ahlc = (ahlc)aakt.v(anuv2, (ahaq)AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        final TextView c = this.c;
        c.getClass();
        if (ahlc != null) {
            ajut ajut3 = ajut;
            if ((ahlc.b & 0x1) != 0x0 && (ajut3 = ahlc.e) == null) {
                ajut3 = ajut.a;
            }
            c.setText((CharSequence)acak.b(ajut3));
            if (this.c.getBackground().getCurrent() instanceof GradientDrawable) {
                final GradientDrawable background = (GradientDrawable)this.c.getBackground().getCurrent().mutate();
                int intValue;
                if (ahlc.c == 3) {
                    intValue = (int)ahlc.d;
                }
                else {
                    intValue = 0;
                }
                background.setColor(intValue);
                background.setCornerRadius(this.g * ahlc.i);
                background.setStroke(Math.round(this.g * ahlc.l), ahlc.j);
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
