import android.graphics.Rect;
import android.view.View;
import android.content.Context;
import java.util.Locale;
import android.text.method.TransformationMethod;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gs implements TransformationMethod
{
    private final Locale a;
    
    public gs(final Context context) {
        this.a = context.getResources().getConfiguration().locale;
    }
    
    public final CharSequence getTransformation(final CharSequence charSequence, final View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.a);
        }
        return null;
    }
    
    public final void onFocusChanged(final View view, final CharSequence charSequence, final boolean b, final int n, final Rect rect) {
    }
}
