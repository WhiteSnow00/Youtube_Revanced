// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.actionbar;

abstract class $AutoValue_ActionBarColor_ColorIntActionBarColor extends ActionBarColor$ColorIntActionBarColor
{
    public final int a;
    
    public $AutoValue_ActionBarColor_ColorIntActionBarColor(final int a) {
        this.a = a;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof ActionBarColor$ColorIntActionBarColor && this.a == ((ActionBarColor$ColorIntActionBarColor)o).a());
    }
    
    public final int hashCode() {
        return this.a ^ 0xF4243;
    }
    
    public final String toString() {
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("ColorIntActionBarColor{colorInt=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
