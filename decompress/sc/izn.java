import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.view.View;
import android.support.v7.widget.AppCompatImageView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

final class izn extends gr
{
    final izp e;
    
    public izn(final izp e) {
        this.e = e;
    }
    
    public final int a() {
        return super.a.e.size();
    }
    
    public final on g(final ViewGroup viewGroup, final int n) {
        return new on((View)new AppCompatImageView(this.e.a));
    }
    
    public final /* bridge */ void q(final on on, final int n) {
        final ImageView imageView = (ImageView)on.a;
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView$ScaleType.FIT_CENTER);
        new sle(imageView, new achb((tpo)this.e.b, imageView), imageView.getBackground(), 1.0f).d(new vgy((aotp)super.a.e.get(n)));
    }
}
