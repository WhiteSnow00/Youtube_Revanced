// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

public final class SplitRule$FinishBehavior$Companion
{
    private SplitRule$FinishBehavior$Companion() {
    }
    
    public SplitRule$FinishBehavior$Companion(final atqv atqv) {
        this();
    }
    
    public final SplitRule$FinishBehavior getFinishBehaviorFromValue$window_release(final int n) {
        SplitRule$FinishBehavior splitRule$FinishBehavior;
        if (n == SplitRule$FinishBehavior.NEVER.getValue$window_release()) {
            splitRule$FinishBehavior = SplitRule$FinishBehavior.NEVER;
        }
        else if (n == SplitRule$FinishBehavior.ALWAYS.getValue$window_release()) {
            splitRule$FinishBehavior = SplitRule$FinishBehavior.ALWAYS;
        }
        else {
            if (n != SplitRule$FinishBehavior.ADJACENT.getValue$window_release()) {
                final StringBuilder sb = new StringBuilder("Unknown finish behavior:");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
            splitRule$FinishBehavior = SplitRule$FinishBehavior.ADJACENT;
        }
        return splitRule$FinishBehavior;
    }
}
