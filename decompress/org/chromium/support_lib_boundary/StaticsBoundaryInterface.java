// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.support_lib_boundary;

import java.util.List;
import java.util.Set;
import android.webkit.ValueCallback;
import android.content.Context;
import android.net.Uri;

public interface StaticsBoundaryInterface
{
    Uri getSafeBrowsingPrivacyPolicyUrl();
    
    String getVariationsHeader();
    
    void initSafeBrowsing(final Context p0, final ValueCallback p1);
    
    boolean isMultiProcessEnabled();
    
    void setSafeBrowsingAllowlist(final Set p0, final ValueCallback p1);
    
    void setSafeBrowsingWhitelist(final List p0, final ValueCallback p1);
}
