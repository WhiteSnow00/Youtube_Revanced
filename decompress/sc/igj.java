import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

final class igj extends tpi
{
    final igk a;
    
    public igj(final igk a, final ImageView imageView) {
        this.a = a;
        super(imageView, (tpk)new tpm(imageView.getContext()), (tpn)null);
    }
    
    public final void c() {
        super.c();
        final View f = this.a.f;
        f.getClass();
        f.setBackground((Drawable)null);
    }
}
