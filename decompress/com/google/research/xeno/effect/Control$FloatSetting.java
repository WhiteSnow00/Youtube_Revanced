// 
// Decompiled by Procyon v0.6.0
// 

package com.google.research.xeno.effect;

import android.util.Pair;

public class Control$FloatSetting
{
    public final Pair a;
    private final long b;
    
    private Control$FloatSetting(final long b) {
        this.b = b;
        this.a = Control.nativeGetFloatRange(b);
    }
    
    public final float a() {
        return Control.nativeGetFloatValue(this.b);
    }
    
    public final void b(final float n) {
        Control.nativeSetFloatValue(this.b, n);
    }
}
