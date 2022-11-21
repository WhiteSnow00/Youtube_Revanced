import android.widget.ImageView$ScaleType;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View$OnClickListener;
import app.revanced.integrations.patches.HideEndscreenCardsPatch;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class abag extends aazy
{
    private acig A;
    private FrameLayout B;
    public ViewGroup p;
    public TextView q;
    private FrameLayout y;
    private ImageView z;
    
    public abag(final Context context, final CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, final ajrb ajrb, final vbs vbs) {
        super(context, creatorEndscreenOverlayPresenter, ajrb, vbs);
    }
    
    public final View c() {
        if (this.y == null) {
            final FrameLayout y = (FrameLayout)LayoutInflater.from(super.a).inflate(2131624405, (ViewGroup)super.c.f, false);
            HideEndscreenCardsPatch.hideEndscreen((View)y);
            (this.y = y).setOnClickListener((View$OnClickListener)this);
            aazy.e(this.B = (FrameLayout)this.y.findViewById(2131429299));
            this.B.addView((View)this.d());
            this.p = (ViewGroup)this.y.findViewById(2131429274);
            this.q = (TextView)this.y.findViewById(2131428559);
            this.j();
            this.f((View)this.y);
        }
        return (View)this.y;
    }
    
    public void g(final abah abah) {
        super.g(abah);
        ((ImageView)abah.d).setVisibility(0);
        final acig a = this.A;
        if (a != null) {
            final Object d = abah.d;
            aowb aowb;
            if ((aowb = super.b.d) == null) {
                aowb = aowb.a;
            }
            a.g((ImageView)d, aowb);
        }
        ((ImageView)abah.e).setVisibility(8);
    }
    
    public final void h(final acig a) {
        super.h(a);
        this.A = a;
        final ImageView k = this.k();
        aowb aowb;
        if ((aowb = super.b.e) == null) {
            aowb = aowb.a;
        }
        a.g(k, aowb);
    }
    
    public final boolean i() {
        return true;
    }
    
    public void j() {
        this.p.addView((View)this.k());
        this.k().setBackgroundColor(0);
    }
    
    public final ImageView k() {
        if (this.z == null) {
            (this.z = new ImageView(super.a)).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
            this.z.setScaleType(ImageView$ScaleType.FIT_CENTER);
        }
        return this.z;
    }
}
