// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.watch.player;

import android.view.View;
import android.view.View$MeasureSpec;
import android.util.Size;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.libraries.youtube.player.ui.PlayerView;

public class ReelPlayerView extends PlayerView
{
    public boolean a;
    public boolean b;
    
    public ReelPlayerView(final Context context) {
        super(context);
    }
    
    public ReelPlayerView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    protected final void onMeasure(int measuredWidth, int measuredHeight) {
        super.onMeasure(measuredWidth, measuredHeight);
        final View m = ((abvo)this).m;
        if (m == null) {
            return;
        }
        measuredWidth = this.getMeasuredWidth();
        measuredHeight = this.getMeasuredHeight();
        final int measuredWidth2 = m.getMeasuredWidth();
        final int measuredHeight2 = m.getMeasuredHeight();
        Size size;
        if (this.b) {
            int n = measuredWidth;
            int n2 = measuredHeight;
            if (measuredWidth > 0) {
                n = measuredWidth;
                n2 = measuredHeight;
                if (measuredWidth2 > 0) {
                    final double n3 = measuredHeight;
                    final double n4 = measuredWidth;
                    final double n5 = measuredHeight2;
                    final double n6 = measuredWidth2;
                    Double.isNaN(n3);
                    Double.isNaN(n4);
                    final double n7 = n3 / n4;
                    Double.isNaN(n5);
                    Double.isNaN(n6);
                    final double n8 = n5 / n6;
                    if (n7 < n8 && n8 != 0.0) {
                        Double.isNaN(n3);
                        n = (int)(n3 / n8);
                        n2 = measuredHeight;
                    }
                    else {
                        n = measuredWidth;
                        n2 = measuredHeight;
                        if (n7 > n8) {
                            Double.isNaN(n4);
                            n2 = (int)(n4 * n8);
                            n = measuredWidth;
                        }
                    }
                }
            }
            size = new Size(n, n2);
        }
        else if (this.a) {
            int n9 = measuredWidth;
            int n10 = measuredHeight;
            if (measuredWidth2 > 0) {
                final double n11 = measuredHeight2;
                final double n12 = measuredWidth2;
                Double.isNaN(n11);
                Double.isNaN(n12);
                final double n13 = n11 / n12;
                if (n13 > 1.5) {
                    final double n14 = measuredHeight;
                    Double.isNaN(n14);
                    n9 = (int)(n14 / n13);
                    if (n9 < measuredWidth) {
                        final double n15 = measuredWidth;
                        final double n16 = n9;
                        Double.isNaN(n15);
                        Double.isNaN(n16);
                        final double n17 = n15 / n16;
                        Double.isNaN(n14);
                        n10 = (int)(n14 * n17);
                        Double.isNaN(n16);
                        n9 = (int)(n16 * n17);
                    }
                    else {
                        n10 = measuredHeight;
                    }
                }
                else {
                    final double n18 = measuredWidth;
                    Double.isNaN(n18);
                    n10 = (int)(n18 * n13);
                    n9 = measuredWidth;
                }
            }
            size = new Size(n9, n10);
        }
        else {
            int n19 = measuredWidth;
            int n20 = measuredHeight;
            if (measuredWidth > 0) {
                n19 = measuredWidth;
                n20 = measuredHeight;
                if (measuredWidth2 > 0) {
                    final double n21 = measuredHeight;
                    final double n22 = measuredWidth;
                    final double n23 = measuredHeight2;
                    final double n24 = measuredWidth2;
                    Double.isNaN(n21);
                    Double.isNaN(n22);
                    final double n25 = n21 / n22;
                    Double.isNaN(n23);
                    Double.isNaN(n24);
                    final double n26 = n23 / n24;
                    if (n25 > n26 && n26 != 0.0) {
                        Double.isNaN(n21);
                        n19 = (int)(n21 / n26);
                        n20 = measuredHeight;
                    }
                    else {
                        n19 = measuredWidth;
                        n20 = measuredHeight;
                        if (n25 < n26) {
                            Double.isNaN(n22);
                            n20 = (int)(n22 * n26);
                            n19 = measuredWidth;
                        }
                    }
                }
            }
            size = new Size(n19, n20);
        }
        m.measure(View$MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(size.getHeight(), 1073741824));
    }
}
