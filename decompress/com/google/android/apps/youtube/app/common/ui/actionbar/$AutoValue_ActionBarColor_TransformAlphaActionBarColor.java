// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.actionbar;

abstract class $AutoValue_ActionBarColor_TransformAlphaActionBarColor extends ActionBarColor$TransformAlphaActionBarColor
{
    public final ActionBarColor a;
    public final int b;
    
    public $AutoValue_ActionBarColor_TransformAlphaActionBarColor(final ActionBarColor a, final int b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null color");
    }
    
    public final int a() {
        return this.b;
    }
    
    public final ActionBarColor b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ActionBarColor$TransformAlphaActionBarColor) {
            final ActionBarColor$TransformAlphaActionBarColor actionBarColor$TransformAlphaActionBarColor = (ActionBarColor$TransformAlphaActionBarColor)o;
            if (this.a.equals(actionBarColor$TransformAlphaActionBarColor.b()) && this.b == actionBarColor$TransformAlphaActionBarColor.a()) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    public final String toString() {
        final String string = this.a.toString();
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("TransformAlphaActionBarColor{color=");
        sb.append(string);
        sb.append(", alpha=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
