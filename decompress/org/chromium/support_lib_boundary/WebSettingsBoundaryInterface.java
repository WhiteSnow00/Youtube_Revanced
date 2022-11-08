// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.support_lib_boundary;

import java.util.Set;

public interface WebSettingsBoundaryInterface
{
    int getDisabledActionModeMenuItems();
    
    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();
    
    int getForceDark();
    
    int getForceDarkBehavior();
    
    boolean getOffscreenPreRaster();
    
    Set getRequestedWithHeaderOriginAllowList();
    
    boolean getSafeBrowsingEnabled();
    
    int getWebAuthnSupport();
    
    boolean getWillSuppressErrorPage();
    
    boolean isAlgorithmicDarkeningAllowed();
    
    void setAlgorithmicDarkeningAllowed(final boolean p0);
    
    void setDisabledActionModeMenuItems(final int p0);
    
    void setEnterpriseAuthenticationAppLinkPolicyEnabled(final boolean p0);
    
    void setForceDark(final int p0);
    
    void setForceDarkBehavior(final int p0);
    
    void setOffscreenPreRaster(final boolean p0);
    
    void setRequestedWithHeaderOriginAllowList(final Set p0);
    
    void setSafeBrowsingEnabled(final boolean p0);
    
    void setWebAuthnSupport(final int p0);
    
    void setWillSuppressErrorPage(final boolean p0);
}
