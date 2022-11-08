// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.proto;

import java.util.List;

public interface CardboardDevice$DeviceParamsOrBuilder extends ahax
{
    float getDistortionCoefficients(final int p0);
    
    int getDistortionCoefficientsCount();
    
    List getDistortionCoefficientsList();
    
    float getInterLensDistance();
    
    float getLeftEyeFieldOfViewAngles(final int p0);
    
    int getLeftEyeFieldOfViewAnglesCount();
    
    List getLeftEyeFieldOfViewAnglesList();
    
    String getModel();
    
    agyc getModelBytes();
    
    CardboardDevice$DeviceParams$ButtonType getPrimaryButton();
    
    float getScreenToLensDistance();
    
    float getTrayToLensDistance();
    
    String getVendor();
    
    agyc getVendorBytes();
    
    CardboardDevice$DeviceParams$VerticalAlignmentType getVerticalAlignment();
    
    boolean hasInterLensDistance();
    
    boolean hasModel();
    
    boolean hasPrimaryButton();
    
    boolean hasScreenToLensDistance();
    
    boolean hasTrayToLensDistance();
    
    boolean hasVendor();
    
    boolean hasVerticalAlignment();
}
