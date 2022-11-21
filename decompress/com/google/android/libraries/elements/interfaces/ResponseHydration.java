// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;

public abstract class ResponseHydration
{
    public static ResponseHydration create(final ResourceMetadataTracker resourceMetadataTracker, final CertificateTracker certificateTracker, final JSModuleBytesProvider jsModuleBytesProvider) {
        return ResponseHydration$CppProxy.create(resourceMetadataTracker, certificateTracker, jsModuleBytesProvider);
    }
    
    public abstract StatusOr rehydrateResponse(final byte[] p0);
}
