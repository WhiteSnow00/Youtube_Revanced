// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public abstract class ScrollableContainerTypeProxy
{
    public abstract PointProxy contentOffset();
    
    public abstract SizeProxy contentSize();
    
    public abstract ScrollableContainerTypeDirection direction();
    
    public abstract ScrollableContainerMarqueeConfigProxy marqueeConfig();
    
    public abstract ScrollableContainerTypeOverscrollMode overscrollMode();
    
    public abstract boolean showHorizontalIndicator();
    
    public abstract boolean showVerticalIndicator();
}
