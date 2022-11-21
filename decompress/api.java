import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.widget.EdgeEffect;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class api
{
    public static Drawable a(final CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }
    
    public static float b(final EdgeEffect edgeEffect) {
        if (Build$VERSION.SDK_INT >= 31) {
            return apk.a(edgeEffect);
        }
        return 0.0f;
    }
    
    public static float c(final EdgeEffect edgeEffect, final float n, final float n2) {
        if (Build$VERSION.SDK_INT >= 31) {
            return apk.b(edgeEffect, n, n2);
        }
        apj.a(edgeEffect, n, n2);
        return n;
    }
    
    public static EdgeEffect d(final Context context, final AttributeSet set) {
        if (Build$VERSION.SDK_INT >= 31) {
            return apk.c(context, set);
        }
        return new EdgeEffect(context);
    }
}
