// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.content.Context;

public class DialogTitle extends AppCompatTextView
{
    public DialogTitle(final Context context) {
        super(context);
    }
    
    public DialogTitle(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public DialogTitle(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        final Layout layout = this.getLayout();
        if (layout != null) {
            final int lineCount = layout.getLineCount();
            if (lineCount > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
                this.setSingleLine(false);
                this.setMaxLines(2);
                final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes((AttributeSet)null, gl.x, 16842817, 16973892);
                final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                if (dimensionPixelSize != 0) {
                    this.setTextSize(0, (float)dimensionPixelSize);
                }
                obtainStyledAttributes.recycle();
                super.onMeasure(n, n2);
            }
        }
    }
}
