import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

final class kfg extends acdu
{
    final /* synthetic */ jzv a;
    final /* synthetic */ kfh b;
    
    public kfg(final kfh b, final jzv a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final ImageView imageView) {
        this.a.a(this.b.D);
    }
    
    public final void b(final ImageView imageView) {
        final Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            this.b.F = ((BitmapDrawable)drawable).getBitmap();
            final jzv a = this.a;
            final kfh b = this.b;
            a.b(b.D, b.F);
            return;
        }
        this.a.a(this.b.D);
    }
}
