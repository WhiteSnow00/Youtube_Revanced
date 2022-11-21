// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

public final class SplitAttributes
{
    public static final SplitAttributes$Companion Companion;
    private static final String TAG;
    private final SplitAttributes$LayoutDirection layoutDirection;
    private final SplitAttributes$SplitType splitType;
    
    static {
        Companion = new SplitAttributes$Companion(null);
        TAG = "SplitAttributes";
    }
    
    public SplitAttributes() {
        this(null, null, 3, null);
    }
    
    public SplitAttributes(final SplitAttributes$SplitType splitType, final SplitAttributes$LayoutDirection layoutDirection) {
        splitType.getClass();
        layoutDirection.getClass();
        this.splitType = splitType;
        this.layoutDirection = layoutDirection;
    }
    
    public SplitAttributes(SplitAttributes$SplitType splitEqually, SplitAttributes$LayoutDirection locale, final int n, final atqv atqv) {
        if ((n & 0x1) != 0x0) {
            splitEqually = (SplitAttributes$SplitType)SplitAttributes$SplitType.Companion.splitEqually();
        }
        if ((n & 0x2) != 0x0) {
            locale = SplitAttributes$LayoutDirection.LOCALE;
        }
        this(splitEqually, locale);
    }
    
    public static final String access$getTAG$cp() {
        return SplitAttributes.TAG;
    }
    
    public static final SplitAttributes buildSplitAttributesFromValue$window_release(final float n, final int n2) {
        return SplitAttributes.Companion.buildSplitAttributesFromValue$window_release(n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SplitAttributes)) {
            return false;
        }
        final SplitAttributes$SplitType splitType = this.splitType;
        final SplitAttributes splitAttributes = (SplitAttributes)o;
        return atqz.c(splitType, splitAttributes.splitType) && atqz.c(this.layoutDirection, splitAttributes.layoutDirection);
    }
    
    public final SplitAttributes$LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }
    
    public final SplitAttributes$SplitType getSplitType() {
        return this.splitType;
    }
    
    @Override
    public int hashCode() {
        return this.splitType.hashCode() * 31 + this.layoutDirection.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SplitAttributes:{splitType=");
        sb.append(this.splitType);
        sb.append(", layoutDir=");
        sb.append(this.layoutDirection);
        sb.append('}');
        return sb.toString();
    }
}
