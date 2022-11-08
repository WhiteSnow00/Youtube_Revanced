// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera;

import android.util.AttributeSet;
import android.content.Context;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;

public class ShortsCameraToolbarMicButton extends CreationButtonView
{
    public int a;
    private final String h;
    private final String i;
    
    public ShortsCameraToolbarMicButton(final Context context) {
        super(context);
        this.a = 2;
        this.h = context.getResources().getString(2132017592);
        this.i = context.getResources().getString(2132017591);
    }
    
    public ShortsCameraToolbarMicButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 2;
        this.h = context.getResources().getString(2132017592);
        this.i = context.getResources().getString(2132017591);
    }
    
    public final void a(final int a) {
        this.a = a;
        if (a - 1 != 0) {
            this.b(2131233818);
            this.e(this.i);
            return;
        }
        this.b(2131233820);
        this.e(this.h);
    }
}
