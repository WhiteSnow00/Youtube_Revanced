// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import androidx.window.core.Logger;
import androidx.window.core.SpecificationComputer$Companion;
import androidx.window.core.VerificationMode;
import androidx.window.core.SpecificationComputer;

public final class SplitAttributes$SplitType$Companion
{
    private SplitAttributes$SplitType$Companion() {
    }
    
    public final SplitAttributes$SplitType buildSplitTypeFromValue$window_release(final float n) {
        Object o;
        if (n == ((SplitAttributes$SplitType)SplitAttributes$SplitType.access$getEXPAND_CONTAINERS$cp()).getValue$window_release()) {
            o = this.expandContainers();
        }
        else {
            o = this.ratio(n);
        }
        return (SplitAttributes$SplitType)o;
    }
    
    public final SplitAttributes$SplitType$ExpandContainersSplitType expandContainers() {
        return SplitAttributes$SplitType.access$getEXPAND_CONTAINERS$cp();
    }
    
    public final SplitAttributes$SplitType$RatioSplitType ratio(final float n) {
        final SpecificationComputer$Companion companion = SpecificationComputer.Companion;
        final String access$getTAG$cp = SplitAttributes.access$getTAG$cp();
        access$getTAG$cp.getClass();
        final Object compute = SpecificationComputer$Companion.startSpecification$default(companion, n, access$getTAG$cp, VerificationMode.STRICT, null, 4, null).require("Ratio must be in range (0.0, 1.0). Use SplitType.expandContainers() instead of 0 or 1.", (atml)new SplitAttributes$SplitType$Companion$ratio$checkedRatio$1(n)).compute();
        compute.getClass();
        return new SplitAttributes$SplitType$RatioSplitType(((Number)compute).floatValue());
    }
    
    public final SplitAttributes$SplitType$HingeSplitType splitByHinge(final SplitAttributes$SplitType splitAttributes$SplitType) {
        splitAttributes$SplitType.getClass();
        final SpecificationComputer$Companion companion = SpecificationComputer.Companion;
        final String access$getTAG$cp = SplitAttributes.access$getTAG$cp();
        access$getTAG$cp.getClass();
        final Object compute = SpecificationComputer$Companion.startSpecification$default(companion, splitAttributes$SplitType, access$getTAG$cp, VerificationMode.STRICT, null, 4, null).require("FallbackSplitType must be a RatioSplitType or ExpandContainerSplitType", (atml)new SplitAttributes$SplitType$Companion$splitByHinge$checkedType$1(splitAttributes$SplitType)).compute();
        compute.getClass();
        return new SplitAttributes$SplitType$HingeSplitType((SplitAttributes$SplitType)compute);
    }
    
    public final SplitAttributes$SplitType$RatioSplitType splitEqually() {
        return this.ratio(0.5f);
    }
}
