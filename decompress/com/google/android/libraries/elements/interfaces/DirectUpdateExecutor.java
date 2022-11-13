// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class DirectUpdateExecutor
{
    public abstract Status applyChangeStylePropertiesBackgroundColor(final long p0);
    
    public abstract Status applyChangeStylePropertiesOpacity(final float p0);
    
    public abstract Status applyChangeStylePropertiesRotation(final float p0);
    
    public abstract Status applyChangeStylePropertiesScale(final float p0);
    
    public abstract Status applyChangeStylePropertiesTranslation(final float p0, final float p1);
}
