// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import io.grpc.Status;

public abstract class FetchResultHandler
{
    public abstract Status onError(final Status p0);
    
    public abstract Status onSuccess(final ArrayList p0);
}
