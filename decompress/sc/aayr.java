import android.widget.ImageView$ScaleType;
import app.revanced.integrations.patches.HideEndscreenCardsPatch;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.widget.ImageView;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation$AnimationListener;
import android.view.View;
import android.widget.TextView;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public class aayr extends abvy implements View$OnClickListener
{
    private static final int[] p;
    public final Context a;
    public final ajpc b;
    public final CreatorEndscreenOverlayPresenter c;
    public final aayq d;
    public FrameLayout e;
    public FrameLayout f;
    public TextView g;
    public View h;
    public View i;
    public boolean j;
    public final float k;
    public final Animation$AnimationListener l;
    public final AlphaAnimation m;
    public final AlphaAnimation n;
    public final vai o;
    private ImageView q;
    
    static {
        p = new int[] { 2130970232 };
    }
    
    public aayr(final Context a, final CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, final ajpc b, final vai o) {
        super(b.l, b.m, 1, 1, (String)null);
        final cbi cbi = new cbi(this, 18);
        this.l = (Animation$AnimationListener)cbi;
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = creatorEndscreenOverlayPresenter;
        this.d = (aayq)creatorEndscreenOverlayPresenter;
        this.o = o;
        (this.m = new AlphaAnimation(0.0f, 1.0f)).setDuration((long)a.getResources().getInteger(2131492902));
        final AlphaAnimation n = new AlphaAnimation(1.0f, 0.0f);
        (this.n = n).setDuration((long)a.getResources().getInteger(2131492902));
        n.setAnimationListener((Animation$AnimationListener)cbi);
        this.k = a.getResources().getDimension(2131166412) * 6.0f;
    }
    
    public static void e(final FrameLayout frameLayout) {
        final TypedArray obtainStyledAttributes = frameLayout.getContext().obtainStyledAttributes(aayr.p);
        final Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        frameLayout.setForeground(drawable);
    }
    
    protected final void a() {
        this.d.o(this);
    }
    
    public final void b(final boolean b, final boolean b2, final boolean b3) {
        this.d.v(this);
    }
    
    public View c() {
        if (this.e == null) {
            final FrameLayout e = (FrameLayout)LayoutInflater.from(this.a).inflate(2131624405, (ViewGroup)this.c.f, false);
            HideEndscreenCardsPatch.hideEndscreen((View)e);
            (this.e = e).setOnClickListener((View$OnClickListener)this);
            this.f = (FrameLayout)this.e.findViewById(2131429299);
            final ImageView d = this.d();
            final int au = aevy.au(this.b.c);
            Label_0124: {
                if (au != 0) {
                    if (au == 6) {
                        d.setScaleType(ImageView$ScaleType.FIT_CENTER);
                        d.setBackgroundColor(tpe.cx(this.a, 2130970908).orElse(0));
                        break Label_0124;
                    }
                }
                d.setScaleType(ImageView$ScaleType.CENTER_CROP);
            }
            this.f.addView((View)d, -1, -1);
            e(this.f);
            final TextView g = (TextView)this.e.findViewById(2131432112);
            this.g = g;
            final ajpc b = this.b;
            ajut ajut;
            if ((b.b & 0x1000) != 0x0) {
                if ((ajut = b.n) == null) {
                    ajut = ajut.a;
                }
            }
            else {
                ajut = null;
            }
            tpe.t(g, (CharSequence)acak.b(ajut));
            this.f((View)this.e);
            this.h = this.e.findViewById(2131432103);
            this.i = this.e.findViewById(2131428891);
            if (this.o.aS()) {
                final FrameLayout e2 = this.e;
                if (e2 != null) {
                    e2.setPadding(0, 0, 0, 0);
                    this.e.setClipToOutline(true);
                    this.e.setBackgroundResource(2131231313);
                }
                final FrameLayout f = this.f;
                if (f != null) {
                    f.setClipToOutline(true);
                    this.f.setBackgroundResource(2131233409);
                }
                final View h = this.h;
                if (h != null) {
                    h.setClipToOutline(true);
                    this.h.setBackgroundResource(2131231317);
                }
                final View i = this.i;
                if (i != null) {
                    i.setClipToOutline(true);
                    this.i.setBackgroundResource(2131231320);
                }
            }
        }
        return (View)this.e;
    }
    
    public ImageView d() {
        if (this.q == null) {
            this.q = new ImageView(this.a);
        }
        return this.q;
    }
    
    public void f(final View view) {
        final ajpc b = this.b;
        final int b2 = b.b;
        final ajut ajut = null;
        ajut ajut2;
        if ((b2 & 0x1000) != 0x0) {
            if ((ajut2 = b.n) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        Object contentDescription = acak.i(ajut2);
        if (contentDescription == null) {
            final ajpc b3 = this.b;
            ajut ajut3 = ajut;
            if ((b3.b & 0x1000) != 0x0 && (ajut3 = b3.n) == null) {
                ajut3 = ajut.a;
            }
            contentDescription = acak.b(ajut3);
        }
        view.setContentDescription((CharSequence)contentDescription);
    }
    
    public void g(final aaza aaza) {
        final Object f = aaza.f;
        final ajpc b = this.b;
        final int b2 = b.b;
        final ajut ajut = null;
        ajut ajut2;
        if ((b2 & 0x1000) != 0x0) {
            if ((ajut2 = b.n) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        tpe.t((TextView)f, (CharSequence)acak.b(ajut2));
        final Object g = aaza.g;
        final ajpc b3 = this.b;
        ajut ajut3;
        if ((b3.b & 0x2000) != 0x0) {
            if ((ajut3 = b3.o) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        tpe.t((TextView)g, (CharSequence)acak.b(ajut3));
        final Object h = aaza.h;
        final ajpc b4 = this.b;
        ajut ajut4;
        if ((b4.b & 0x20000) != 0x0) {
            if ((ajut4 = b4.r) == null) {
                ajut4 = ajut.a;
            }
        }
        else {
            ajut4 = null;
        }
        ((TextView)h).setText((CharSequence)acak.b(ajut4));
        final Object i = aaza.i;
        final ajpc b5 = this.b;
        ajut ajut5 = ajut;
        if ((b5.b & 0x40000) != 0x0 && (ajut5 = b5.s) == null) {
            ajut5 = ajut.a;
        }
        ((TextView)i).setText((CharSequence)acak.b(ajut5));
        final int au = aevy.au(this.b.c);
        if (au != 0) {
            if (au == 6) {
                ((ImageView)aaza.d).setScaleType(ImageView$ScaleType.FIT_CENTER);
            }
        }
    }
    
    public void h(final acgs acgs) {
        final ImageView d = this.d();
        aotp aotp;
        if ((aotp = this.b.d) == null) {
            aotp = aotp.a;
        }
        acgs.g(d, aotp);
    }
    
    public boolean i() {
        return false;
    }
    
    public final void onClick(final View view) {
        if (view == this.c()) {
            this.d.s(this);
        }
    }
}
