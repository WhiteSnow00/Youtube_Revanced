import java.util.Iterator;
import android.view.View;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apj
{
    public static ColorStateList a(final ImageView imageView) {
        return imageView.getImageTintList();
    }
    
    public static PorterDuff$Mode b(final ImageView imageView) {
        return imageView.getImageTintMode();
    }
    
    public static void c(final ImageView imageView, final ColorStateList imageTintList) {
        imageView.setImageTintList(imageTintList);
    }
    
    public static void d(final ImageView imageView, final PorterDuff$Mode imageTintMode) {
        imageView.setImageTintMode(imageTintMode);
    }
    
    public static final void e(final View view) {
        final Iterator a = arxi.c((atmp)new anf(view, (atld)null)).a();
        while (a.hasNext()) {
            f((View)a.next()).f();
        }
    }
    
    public static final avt f(final View view) {
        avt avt;
        if ((avt = (avt)view.getTag(2131430512)) == null) {
            avt = new avt((byte[])null);
            view.setTag(2131430512, (Object)avt);
        }
        return avt;
    }
}
