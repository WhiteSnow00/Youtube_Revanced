// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import android.graphics.Rect;

public abstract class IntersectionEngine
{
    public static IntersectionEngine create() {
        return IntersectionEngine$CppProxy.create();
    }
    
    public abstract void checkProminence();
    
    public abstract void onEnter(final String p0, final Rect p1, final Rect p2, final Rect p3, final boolean p4);
    
    public abstract void onExit(final String p0, final Rect p1, final Rect p2, final Rect p3, final boolean p4);
    
    public abstract void onScroll(final String p0, final Rect p1, final Rect p2, final Rect p3, final int p4, final int p5);
    
    public abstract void onSizeChange(final String p0, final Rect p1, final Rect p2, final Rect p3, final boolean p4);
    
    public abstract void setEnableProminence(final boolean p0, final ProminenceAlgorithm p1);
    
    public abstract void setEnableProminenceForGroup(final String p0, final boolean p1);
    
    public abstract void setOcclusionEdge(final OcclusionEdge p0, final int p1, final String p2);
    
    public abstract void setOcclusionRect(final Rect p0, final String p1);
    
    public abstract void setRtl(final boolean p0);
    
    public abstract IntersectionSubscription subscribe(final String p0, final IntersectionObserver p1);
}
