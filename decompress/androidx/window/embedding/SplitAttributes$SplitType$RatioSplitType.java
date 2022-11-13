// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

public final class SplitAttributes$SplitType$RatioSplitType extends SplitAttributes$SplitType
{
    private final float ratio;
    
    public SplitAttributes$SplitType$RatioSplitType(final float ratio) {
        final StringBuilder sb = new StringBuilder("ratio:");
        sb.append(ratio);
        super(sb.toString(), ratio);
        this.ratio = ratio;
    }
    
    public final float getRatio() {
        return this.ratio;
    }
}
