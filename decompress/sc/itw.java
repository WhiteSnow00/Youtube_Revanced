import android.util.DisplayMetrics;
import app.revanced.integrations.patches.BrandingWaterMarkPatch;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.widget.ImageView;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itw extends abbk
{
    public boolean a;
    public Bitmap b;
    public int c;
    public int d;
    private final int e;
    private boolean f;
    private ImageView g;
    
    public itw(final Context context) {
        super(context);
        this.e = context.getResources().getInteger(2131492903);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final View c(final Context context) {
        final View inflate = LayoutInflater.from(context).inflate(2131625835, (ViewGroup)null);
        this.g = (ImageView)inflate.findViewById(2131427902);
        return inflate;
    }
    
    public final void e(final Context context, final View view) {
        if (this.ab(1)) {
            final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            final int width = (int)TypedValue.applyDimension(1, (float)this.c, displayMetrics);
            final int height = (int)TypedValue.applyDimension(1, (float)this.d, displayMetrics);
            this.g.getLayoutParams().width = width;
            this.g.getLayoutParams().height = height;
            this.g.setImageBitmap(this.b);
        }
        if (this.ab(2)) {
            tpe.v((View)this.g, BrandingWaterMarkPatch.isBrandingWatermarkShown());
        }
        this.b = null;
    }
    
    public final void k(final boolean b) {
        if (b != this.f) {
            return;
        }
        final boolean f = b ^ true;
        this.f = f;
        if (f) {
            this.mk();
            return;
        }
        this.mm();
    }
    
    protected final abbn mj(final Context context) {
        final abbn mj = super.mj(context);
        final int e = this.e;
        mj.b = e;
        mj.a = e;
        return mj;
    }
    
    public final String mr() {
        return "player_overlay_in_video_programming";
    }
    
    public final boolean oV() {
        return this.a && !this.f;
    }
}
