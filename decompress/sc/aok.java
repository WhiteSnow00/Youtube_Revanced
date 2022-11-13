import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class aok implements AccessibilityManager$TouchExplorationStateChangeListener
{
    final aoj a;
    
    public aok(final aoj a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof aok && this.a.equals(((aok)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final void onTouchExplorationStateChanged(final boolean b) {
        this.a.a(b);
    }
}
