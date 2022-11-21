import android.graphics.drawable.Drawable;
import android.widget.ImageView$ScaleType;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.View$OnLayoutChangeListener;
import android.graphics.Bitmap;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abet extends abcq implements aber
{
    public ImageView a;
    private Bitmap b;
    private final View$OnLayoutChangeListener c;
    
    public abet(final Context context) {
        super(context);
        this.c = (View$OnLayoutChangeListener)new zgy(this, 2);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final /* bridge */ View c(final Context context) {
        (this.a = new ImageView(context)).setBackgroundColor(-16777216);
        this.a.setScaleType(ImageView$ScaleType.CENTER_CROP);
        this.a.addOnLayoutChangeListener(this.c);
        return (View)this.a;
    }
    
    public final /* bridge */ void e(final Context context, final View view) {
        final ImageView imageView = (ImageView)view;
        final Bitmap b = this.b;
        if (b == null) {
            imageView.setImageDrawable((Drawable)null);
            return;
        }
        imageView.setImageBitmap(b);
    }
    
    public final void n() {
        this.p(null);
    }
    
    public final boolean oW() {
        return this.b != null;
    }
    
    public final void p(final Bitmap b) {
        if (this.b == b) {
            return;
        }
        this.b = b;
        this.Y();
    }
}
