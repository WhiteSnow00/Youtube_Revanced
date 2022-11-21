// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class ResourceLoaderCallback
{
    public abstract void resourcesProcessed(final ValidationResult p0, final Status p1);
}
