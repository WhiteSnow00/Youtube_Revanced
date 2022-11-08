import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import android.widget.ImageView$ScaleType;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class kdp
{
    private final int a;
    private final Context b;
    private final aceo c;
    private final acnj d;
    private final fvf e;
    private final View f;
    private View g;
    private TextView h;
    private TextView i;
    private View j;
    private ImageView k;
    private fve l;
    private acex m;
    private acex n;
    
    public kdp(final Context b, final aceo c, final fvf e, final acnj d, final View f, final int a) {
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    public final void a() {
        this.b();
        final View g = this.g;
        if (g != null) {
            g.setVisibility(8);
        }
    }
    
    public final void b() {
        final acex m = this.m;
        if (m != null) {
            m.a();
        }
        final acex n = this.n;
        if (n != null) {
            n.a();
        }
        final fve l = this.l;
        if (l != null) {
            l.f();
        }
    }
    
    public final void c(final aism aism, final acij acij) {
        final View g = this.g;
        final ameo ameo = null;
        if (g == null) {
            final View inflate = ((ViewStub)this.f.findViewById(this.a)).inflate();
            this.g = inflate;
            this.h = (TextView)inflate.findViewById(2131428153);
            this.i = (TextView)this.g.findViewById(2131431810);
            this.j = this.g.findViewById(2131428448);
            this.k = (ImageView)this.g.findViewById(2131427731);
            (this.m = actc.B((tni)this.c, (ImageView)this.g.findViewById(2131428086))).i(ImageView$ScaleType.CENTER_CROP);
            (this.n = actc.B((tni)this.c, (ImageView)this.g.findViewById(2131427753))).i(ImageView$ScaleType.CENTER_CROP);
            this.l = this.e.a((TextView)this.g.findViewById(2131431807), null);
        }
        this.g.setVisibility(0);
        final int layoutDirection = this.b.getResources().getConfiguration().getLayoutDirection();
        if (this.g.getLayoutDirection() != layoutDirection) {
            this.g.setLayoutDirection(layoutDirection);
        }
        final acex m = this.m;
        aorm aorm;
        if ((aorm = aism.g) == null) {
            aorm = aorm.a;
        }
        m.k(aorm);
        final acex n = this.n;
        aorm aorm2;
        if ((aorm2 = aism.f) == null) {
            aorm2 = aorm.a;
        }
        n.k(aorm2);
        final TextView h = this.h;
        ajsq ajsq;
        if ((aism.b & 0x1) != 0x0) {
            if ((ajsq = aism.c) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        h.setText((CharSequence)abyh.b(ajsq));
        final TextView i = this.i;
        ajsq ajsq2;
        if ((aism.b & 0x2) != 0x0) {
            if ((ajsq2 = aism.d) == null) {
                ajsq2 = ajsq.a;
            }
        }
        else {
            ajsq2 = null;
        }
        i.setText((CharSequence)abyh.b(ajsq2));
        aisn aisn;
        if ((aisn = aism.e) == null) {
            aisn = aisn.a;
        }
        aokb aokb;
        if ((aokb = aisn.c) == null) {
            aokb = aokb.a;
        }
        aisn aisn2;
        if ((aisn2 = aism.e) == null) {
            aisn2 = aisn.a;
        }
        aokb c = aokb;
        aism aism2 = aism;
        if ((aisn2.b & 0x1) != 0x0) {
            final Context b = this.b;
            final agza builder = ((agzi)aokb).toBuilder();
            ajsq ajsq3;
            if ((aism.b & 0x1) != 0x0) {
                if ((ajsq3 = aism.c) == null) {
                    ajsq3 = ajsq.a;
                }
            }
            else {
                ajsq3 = null;
            }
            feq.c(b, builder, (CharSequence)abyh.b(ajsq3));
            c = (aokb)builder.build();
            final agza builder2 = ((agzi)aism).toBuilder();
            aisn aisn3;
            if ((aisn3 = aism.e) == null) {
                aisn3 = aisn.a;
            }
            final agza builder3 = ((agzi)aisn3).toBuilder();
            builder3.copyOnWrite();
            final aisn aisn4 = (aisn)builder3.instance;
            c.getClass();
            aisn4.c = c;
            aisn4.b |= 0x1;
            builder2.copyOnWrite();
            final aism aism3 = (aism)builder2.instance;
            final aisn e = (aisn)builder3.build();
            e.getClass();
            aism3.e = e;
            aism3.b |= 0x4;
            aism2 = (aism)builder2.build();
        }
        this.l.j(c, ((wwx)acij).a);
        if (this.j != null && (aism2.b & 0x800) != 0x0) {
            final acij acij2 = new acij(acij);
            ((wwx)acij2).b = aism2.k.I();
            final acnj d = this.d;
            final View f = this.f;
            final View j = this.j;
            anss anss;
            if ((anss = aism2.l) == null) {
                anss = anss.a;
            }
            ameo ameo2 = ameo;
            if (((agzd)anss).rs((agyr)MenuRendererOuterClass.menuRenderer)) {
                anss anss2;
                if ((anss2 = aism2.l) == null) {
                    anss2 = anss.a;
                }
                ameo2 = (ameo)((agzd)anss2).rr((agyr)MenuRendererOuterClass.menuRenderer);
            }
            d.f(f, j, ameo2, aism2, ((wwx)acij2).a);
        }
        if (this.k != null && (aism2.b & 0x100) != 0x0) {
            final kdo imageDrawable = new kdo();
            final ImageView k = this.k;
            allu allu;
            if ((allu = aism2.j) == null) {
                allu = allu.a;
            }
            k.setColorFilter(allu.b, PorterDuff$Mode.SRC_IN);
            this.k.setImageDrawable((Drawable)imageDrawable);
        }
    }
}
