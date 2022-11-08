// 
// Decompiled by Procyon v0.6.0
// 

package com.google.research.xeno.effect;

public class Control$IntSetting
{
    public final long a;
    
    private Control$IntSetting(final long a) {
        Control.nativeGetIntRange(this.a = a);
    }
}
