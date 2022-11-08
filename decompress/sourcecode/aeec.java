import android.view.View;
import android.widget.ProgressBar;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.setupcompat.internal.TemplateLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeec implements aedi
{
    public final TemplateLayout a;
    public final boolean b;
    
    public aeec(final TemplateLayout a, final AttributeSet set, int visibility) {
        this.a = a;
        boolean b = false;
        boolean boolean1 = false;
        if (set != null) {
            final TypedArray obtainStyledAttributes = a.getContext().obtainStyledAttributes(set, aedq.n, visibility, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                boolean1 = obtainStyledAttributes.getBoolean(0, false);
            }
            obtainStyledAttributes.recycle();
            final ProgressBar a2 = this.a();
            b = boolean1;
            if (a2 != null) {
                if (!this.b) {
                    visibility = 8;
                }
                else {
                    visibility = 4;
                }
                ((View)a2).setVisibility(visibility);
                b = boolean1;
            }
        }
        this.b = b;
    }
    
    public final ProgressBar a() {
        final TemplateLayout a = this.a;
        int n;
        if (!this.b) {
            n = 2131431862;
        }
        else {
            n = 2131431840;
        }
        return (ProgressBar)a.h(n);
    }
}
