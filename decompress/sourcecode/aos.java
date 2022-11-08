import android.view.accessibility.AccessibilityRecord;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aos
{
    public final AccessibilityRecord a;
    
    @Deprecated
    public aos(final Object o) {
        this.a = (AccessibilityRecord)o;
    }
    
    @Deprecated
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof aos)) {
            return false;
        }
        final aos aos = (aos)o;
        final AccessibilityRecord a = this.a;
        if (a == null) {
            return aos.a == null;
        }
        return a.equals(aos.a);
    }
    
    @Deprecated
    @Override
    public final int hashCode() {
        final AccessibilityRecord a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
}
