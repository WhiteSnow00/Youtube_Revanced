import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.view.ViewOutlineProvider;
import android.view.View$OnClickListener;
import app.revanced.integrations.patches.HideEndscreenCardsPatch;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class abaa extends aazy
{
    private FrameLayout p;
    private CircularImageView q;
    private acig y;
    private FrameLayout z;
    
    public abaa(final Context context, final CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, final ajrb ajrb, final vbs vbs) {
        super(context, creatorEndscreenOverlayPresenter, ajrb, vbs);
    }
    
    public final View c() {
        if (this.p == null) {
            final FrameLayout p = (FrameLayout)LayoutInflater.from(super.a).inflate(2131624404, (ViewGroup)super.c.f, false);
            HideEndscreenCardsPatch.hideEndscreen((View)p);
            (this.p = p).setOnClickListener((View$OnClickListener)this);
            (this.z = (FrameLayout)this.p.findViewById(2131429299)).addView((View)this.d(), 0);
            final FrameLayout z = this.z;
            aazy.e(z);
            z.setOutlineProvider((ViewOutlineProvider)new aazz());
            z.setClipToOutline(true);
            this.f((View)this.p);
        }
        return (View)this.p;
    }
    
    public final ImageView d() {
        if (this.q == null) {
            (this.q = new CircularImageView(super.a, null)).setBackgroundDrawable((Drawable)new ColorDrawable(agz.a(super.a, 2131099897)));
        }
        return this.q;
    }
    
    public void g(final abah abah) {
        super.g(abah);
        ((ImageView)abah.e).setVisibility(0);
        final acig y = this.y;
        if (y != null) {
            final Object e = abah.e;
            aowb aowb;
            if ((aowb = super.b.d) == null) {
                aowb = aowb.a;
            }
            y.g((ImageView)e, aowb);
        }
        ((ImageView)abah.d).setVisibility(8);
    }
    
    public final void h(final acig y) {
        super.h(y);
        this.y = y;
    }
    
    public final boolean i() {
        return true;
    }
}
