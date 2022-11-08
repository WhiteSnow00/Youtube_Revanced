import android.content.res.ColorStateList;
import android.widget.TextView;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.setupcompat.internal.TemplateLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aedw implements aedi
{
    public final TemplateLayout a;
    
    public aedw(final TemplateLayout a, final AttributeSet set, final int n) {
        this.a = a;
        final TypedArray obtainStyledAttributes = a.getContext().obtainStyledAttributes(set, aedq.d, n, 0);
        final CharSequence text = obtainStyledAttributes.getText(0);
        if (text != null) {
            final TextView a2 = this.a();
            if (a2 != null) {
                a2.setText(text);
                final TextView a3 = this.a();
                if (a3 != null) {
                    a3.setVisibility(0);
                }
            }
        }
        final ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null) {
            final TextView a4 = this.a();
            if (a4 != null) {
                a4.setTextColor(colorStateList);
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    public final TextView a() {
        return (TextView)this.a.h(2131431866);
    }
}
