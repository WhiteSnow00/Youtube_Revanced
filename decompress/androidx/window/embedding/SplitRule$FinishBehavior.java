// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

public final class SplitRule$FinishBehavior
{
    public static final SplitRule$FinishBehavior ADJACENT;
    public static final SplitRule$FinishBehavior ALWAYS;
    public static final SplitRule$FinishBehavior$Companion Companion;
    public static final SplitRule$FinishBehavior NEVER;
    private final String description;
    private final int value;
    
    static {
        Companion = new SplitRule$FinishBehavior$Companion(null);
        NEVER = new SplitRule$FinishBehavior("NEVER", 0);
        ALWAYS = new SplitRule$FinishBehavior("ALWAYS", 1);
        ADJACENT = new SplitRule$FinishBehavior("ADJACENT", 2);
    }
    
    private SplitRule$FinishBehavior(final String description, final int value) {
        this.description = description;
        this.value = value;
    }
    
    public static final SplitRule$FinishBehavior getFinishBehaviorFromValue$window_release(final int n) {
        return SplitRule$FinishBehavior.Companion.getFinishBehaviorFromValue$window_release(n);
    }
    
    public final int getValue$window_release() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return this.description;
    }
}
