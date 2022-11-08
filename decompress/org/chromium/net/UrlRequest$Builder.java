// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

import java.util.concurrent.Executor;

public abstract class UrlRequest$Builder
{
    public static final int REQUEST_PRIORITY_HIGHEST = 4;
    public static final int REQUEST_PRIORITY_IDLE = 0;
    public static final int REQUEST_PRIORITY_LOW = 2;
    public static final int REQUEST_PRIORITY_LOWEST = 1;
    public static final int REQUEST_PRIORITY_MEDIUM = 3;
    
    public abstract UrlRequest$Builder addHeader(final String p0, final String p1);
    
    public abstract UrlRequest$Builder allowDirectExecutor();
    
    public abstract UrlRequest build();
    
    public abstract UrlRequest$Builder disableCache();
    
    public abstract UrlRequest$Builder setHttpMethod(final String p0);
    
    public abstract UrlRequest$Builder setPriority(final int p0);
    
    public abstract UrlRequest$Builder setUploadDataProvider(final UploadDataProvider p0, final Executor p1);
}
