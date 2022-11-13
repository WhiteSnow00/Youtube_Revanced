// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded;

import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b;

public abstract class a extends zdt implements c
{
    private int a;
    private int b;
    private b c;
    
    public a(final Context context) {
        super(context);
    }
    
    public final void a(final int a, final int b) {
        this.a = a;
        this.b = b;
        this.requestLayout();
    }
    
    public final void b(final b c) {
        this.c = c;
    }
    
    public final void c() {
    }
    
    protected void onMeasure(int n, int n2) {
        final int defaultSize = getDefaultSize(this.a, n);
        final int defaultSize2 = getDefaultSize(this.b, n2);
        final int a = this.a;
        n2 = defaultSize;
        n = defaultSize2;
        if (a > 0) {
            final int b = this.b;
            n2 = defaultSize;
            n = defaultSize2;
            if (b > 0) {
                final float n3 = a / (float)b / (defaultSize / (float)defaultSize2) - 1.0f;
                if (n3 > 0.01f) {
                    n = b * defaultSize / a;
                    n2 = defaultSize;
                }
                else {
                    n2 = defaultSize;
                    n = defaultSize2;
                    if (n3 < -0.01f) {
                        n2 = a * defaultSize2 / b;
                        n = defaultSize2;
                    }
                }
            }
        }
        this.setMeasuredDimension(n2, n);
        final b c = this.c;
        if (c != null) {
            c.b.set(n2);
            c.c.set(n);
        }
    }
}
