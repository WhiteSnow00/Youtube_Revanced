// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.concurrent.Executor;
import android.app.Activity;
import java.util.Set;

public interface EmbeddingBackend
{
    void clearSplitAttributesCalculator();
    
    Set getSplitRules();
    
    boolean isActivityEmbedded(final Activity p0);
    
    boolean isSplitAttributesCalculatorSupported();
    
    boolean isSplitSupported();
    
    void registerRule(final EmbeddingRule p0);
    
    void registerSplitListenerForActivity(final Activity p0, final Executor p1, final akp p2);
    
    void setSplitAttributesCalculator(final SplitAttributesCalculator p0);
    
    void setSplitRules(final Set p0);
    
    void unregisterRule(final EmbeddingRule p0);
    
    void unregisterSplitListenerForActivity(final akp p0);
}
