// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.ArrayList;

public abstract class IntersectionObserver
{
    public abstract Status criteriaMatched(final ArrayList p0);
    
    public abstract ArrayList getCriteriaList();
    
    public abstract String getGroupId();
}
