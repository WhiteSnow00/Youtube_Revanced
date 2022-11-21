// 
// Decompiled by Procyon v0.6.0
// 

package androidx.browser.browseractions;

import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout
{
    private final int a;
    private final int b;
    
    public BrowserActionsFallbackMenuView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = this.getResources().getDimensionPixelOffset(2131165554);
        this.b = this.getResources().getDimensionPixelOffset(2131165553);
    }
    
    protected final void onMeasure(int widthPixels, final int n) {
        widthPixels = this.getResources().getDisplayMetrics().widthPixels;
        final int a = this.a;
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(Math.min(widthPixels - (a + a), this.b), 1073741824), n);
    }
}
