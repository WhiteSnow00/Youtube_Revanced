// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.logging.interaction;

public final class AutoValue_InteractionLoggingScreen_VisualElementVisibilityKey extends InteractionLoggingScreen$VisualElementVisibilityKey
{
    private final apni a;
    private final aqqg b;
    
    public AutoValue_InteractionLoggingScreen_VisualElementVisibilityKey(final apni a, final aqqg b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final apni a() {
        return this.a;
    }
    
    @Override
    public final aqqg b() {
        return this.b;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof InteractionLoggingScreen$VisualElementVisibilityKey) {
            final InteractionLoggingScreen$VisualElementVisibilityKey interactionLoggingScreen$VisualElementVisibilityKey = (InteractionLoggingScreen$VisualElementVisibilityKey)o;
            interactionLoggingScreen$VisualElementVisibilityKey.describeContents();
            if (this.a.equals((Object)interactionLoggingScreen$VisualElementVisibilityKey.a()) && ((agzi)this.b).equals((Object)interactionLoggingScreen$VisualElementVisibilityKey.b())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xD5009D89) * 1000003 ^ ((agzi)this.b).hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final StringBuilder sb = new StringBuilder("VisualElementVisibilityKey{describeContents=0, ve=");
        sb.append(string);
        sb.append(", fvlCriteria=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
