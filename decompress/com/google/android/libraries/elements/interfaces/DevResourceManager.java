// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import com.youtube.android.libraries.elements.StatusOr;

public abstract class DevResourceManager
{
    public abstract StatusOr getTemplateDetails(final String p0);
    
    public abstract StatusOr getTemplateFixture(final String p0, final String p1);
    
    public abstract Status loadResource(final String p0);
    
    public abstract void logError(final String p0);
    
    public abstract String resolveIdentifier(final String p0);
    
    public abstract DevResourceSubscription subscribe(final String p0, final DevResourceObserver p1);
}
