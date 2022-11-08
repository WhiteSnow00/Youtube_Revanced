// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

public final class SplitAttributes$Builder
{
    private SplitAttributes$LayoutDirection layoutDirection;
    private SplitAttributes$SplitType splitType;
    
    public SplitAttributes$Builder() {
        this.splitType = (SplitAttributes$SplitType)SplitAttributes$SplitType.Companion.splitEqually();
        this.layoutDirection = SplitAttributes$LayoutDirection.LOCALE;
    }
    
    public final SplitAttributes build() {
        return new SplitAttributes(this.splitType, this.layoutDirection);
    }
    
    public final SplitAttributes$Builder setLayoutDirection(final SplitAttributes$LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        this.layoutDirection = layoutDirection;
        return this;
    }
    
    public final SplitAttributes$Builder setSplitType(final SplitAttributes$SplitType splitType) {
        splitType.getClass();
        this.splitType = splitType;
        return this;
    }
}
