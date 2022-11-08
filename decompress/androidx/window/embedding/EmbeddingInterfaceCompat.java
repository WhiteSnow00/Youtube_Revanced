// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Set;
import android.app.Activity;

public interface EmbeddingInterfaceCompat
{
    void clearSplitAttributesCalculator();
    
    boolean isActivityEmbedded(final Activity p0);
    
    boolean isSplitAttributesCalculatorSupported();
    
    void setEmbeddingCallback(final EmbeddingInterfaceCompat$EmbeddingCallbackInterface p0);
    
    void setSplitAttributesCalculator(final SplitAttributesCalculator p0);
    
    void setSplitRules(final Set p0);
}
