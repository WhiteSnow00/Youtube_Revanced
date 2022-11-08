// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

final class SplitAttributes$SplitType$Companion$splitByHinge$checkedType$1 extends atni implements atml
{
    final /* synthetic */ SplitAttributes$SplitType $fallbackSplitType;
    
    public SplitAttributes$SplitType$Companion$splitByHinge$checkedType$1(final SplitAttributes$SplitType $fallbackSplitType) {
        this.$fallbackSplitType = $fallbackSplitType;
        super(1);
    }
    
    public final Boolean invoke(SplitAttributes$SplitType $fallbackSplitType) {
        $fallbackSplitType.getClass();
        $fallbackSplitType = this.$fallbackSplitType;
        final boolean b = $fallbackSplitType instanceof SplitAttributes$SplitType$RatioSplitType;
        boolean b2 = true;
        if (!b) {
            b2 = ($fallbackSplitType instanceof SplitAttributes$SplitType$ExpandContainersSplitType && b2);
        }
        return b2;
    }
}
