// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import android.app.Activity;

public final class SplitInfo
{
    private final ActivityStack primaryActivityStack;
    private final ActivityStack secondaryActivityStack;
    private final SplitAttributes splitAttributes;
    
    public SplitInfo(final ActivityStack primaryActivityStack, final ActivityStack secondaryActivityStack, final SplitAttributes splitAttributes) {
        primaryActivityStack.getClass();
        secondaryActivityStack.getClass();
        splitAttributes.getClass();
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitAttributes = splitAttributes;
    }
    
    public final boolean contains(final Activity activity) {
        activity.getClass();
        return this.primaryActivityStack.contains(activity) || this.secondaryActivityStack.contains(activity);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SplitInfo)) {
            return false;
        }
        final ActivityStack primaryActivityStack = this.primaryActivityStack;
        final SplitInfo splitInfo = (SplitInfo)o;
        return atqz.c(primaryActivityStack, splitInfo.primaryActivityStack) && atqz.c(this.secondaryActivityStack, splitInfo.secondaryActivityStack) && atqz.c(this.splitAttributes, splitInfo.splitAttributes);
    }
    
    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }
    
    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }
    
    public final SplitAttributes getSplitAttributes() {
        return this.splitAttributes;
    }
    
    @Override
    public int hashCode() {
        return (this.primaryActivityStack.hashCode() * 31 + this.secondaryActivityStack.hashCode()) * 31 + this.splitAttributes.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SplitInfo:{");
        final StringBuilder sb2 = new StringBuilder("primaryActivityStack=");
        sb2.append(this.primaryActivityStack);
        sb2.append(',');
        sb.append(sb2.toString());
        final StringBuilder sb3 = new StringBuilder("secondaryActivityStack=");
        sb3.append(this.secondaryActivityStack);
        sb3.append(',');
        sb.append(sb3.toString());
        final StringBuilder sb4 = new StringBuilder("splitAttributes=");
        sb4.append(this.splitAttributes);
        sb4.append('}');
        sb.append(sb4.toString());
        return sb.toString();
    }
}
