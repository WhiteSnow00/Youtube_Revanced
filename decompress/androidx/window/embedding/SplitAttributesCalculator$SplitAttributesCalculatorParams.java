// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowLayoutInfo;
import android.content.res.Configuration;

public final class SplitAttributesCalculator$SplitAttributesCalculatorParams
{
    private final SplitAttributes defaultSplitAttributes;
    private final boolean isDefaultMinSizeSatisfied;
    private final Configuration parentConfiguration;
    private final WindowLayoutInfo parentWindowLayoutInfo;
    private final WindowMetrics parentWindowMetrics;
    private final String splitRuleTag;
    
    public SplitAttributesCalculator$SplitAttributesCalculatorParams(final WindowMetrics parentWindowMetrics, final Configuration parentConfiguration, final SplitAttributes defaultSplitAttributes, final boolean isDefaultMinSizeSatisfied, final WindowLayoutInfo parentWindowLayoutInfo, final String splitRuleTag) {
        parentWindowMetrics.getClass();
        parentConfiguration.getClass();
        defaultSplitAttributes.getClass();
        parentWindowLayoutInfo.getClass();
        this.parentWindowMetrics = parentWindowMetrics;
        this.parentConfiguration = parentConfiguration;
        this.defaultSplitAttributes = defaultSplitAttributes;
        this.isDefaultMinSizeSatisfied = isDefaultMinSizeSatisfied;
        this.parentWindowLayoutInfo = parentWindowLayoutInfo;
        this.splitRuleTag = splitRuleTag;
    }
    
    public final SplitAttributes getDefaultSplitAttributes() {
        return this.defaultSplitAttributes;
    }
    
    public final Configuration getParentConfiguration() {
        return this.parentConfiguration;
    }
    
    public final WindowLayoutInfo getParentWindowLayoutInfo() {
        return this.parentWindowLayoutInfo;
    }
    
    public final WindowMetrics getParentWindowMetrics() {
        return this.parentWindowMetrics;
    }
    
    public final String getSplitRuleTag() {
        return this.splitRuleTag;
    }
    
    public final boolean isDefaultMinSizeSatisfied() {
        return this.isDefaultMinSizeSatisfied;
    }
}
