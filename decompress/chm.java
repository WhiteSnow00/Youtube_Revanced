import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.content.Context;
import android.view.animation.Animation$AnimationListener;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chm extends ImageView
{
    public Animation$AnimationListener a;
    private int b;
    
    public chm(final Context context) {
        super(context);
        final float density = this.getContext().getResources().getDisplayMetrics().density;
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(chl.a);
        this.b = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        final ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new OvalShape());
        anc.U((View)this, density * 4.0f);
        shapeDrawable.getPaint().setColor(this.b);
        anc.Q((View)this, (Drawable)shapeDrawable);
    }
    
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        final Animation$AnimationListener a = this.a;
        if (a != null) {
            a.onAnimationEnd(this.getAnimation());
        }
    }
    
    public final void onAnimationStart() {
        super.onAnimationStart();
        final Animation$AnimationListener a = this.a;
        if (a != null) {
            a.onAnimationStart(this.getAnimation());
        }
    }
    
    public final void setBackgroundColor(final int n) {
        if (this.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable)this.getBackground()).getPaint().setColor(n);
            this.b = n;
        }
    }
}
