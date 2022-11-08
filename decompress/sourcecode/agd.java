import android.content.LocusId;
import android.app.Notification$BubbleMetadata;
import android.app.Notification$Builder;
import android.app.Notification$Action$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

final class agd
{
    static Notification$Action$Builder a(final Notification$Action$Builder notification$Action$Builder, final boolean contextual) {
        return notification$Action$Builder.setContextual(contextual);
    }
    
    static Notification$Builder b(final Notification$Builder notification$Builder, final boolean allowSystemGeneratedContextualActions) {
        return notification$Builder.setAllowSystemGeneratedContextualActions(allowSystemGeneratedContextualActions);
    }
    
    static Notification$Builder c(final Notification$Builder notification$Builder, final Notification$BubbleMetadata bubbleMetadata) {
        return notification$Builder.setBubbleMetadata(bubbleMetadata);
    }
    
    static Notification$Builder d(final Notification$Builder notification$Builder, final LocusId locusId) {
        return notification$Builder.setLocusId(locusId);
    }
}
