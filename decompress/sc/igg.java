import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

final class igg extends tpi
{
    final igh a;
    
    public igg(final igh a, final ImageView imageView) {
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