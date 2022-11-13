// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public final class EntitiesObserverConfig
{
    final Integer observerPriority;
    final boolean suppressNotificationIfEntityValueUnchanged;
    
    public EntitiesObserverConfig(final boolean suppressNotificationIfEntityValueUnchanged, final Integer observerPriority) {
        this.suppressNotificationIfEntityValueUnchanged = suppressNotificationIfEntityValueUnchanged;
        this.observerPriority = observerPriority;
    }
    
    public Integer getObserverPriority() {
        return this.observerPriority;
    }
    
    public boolean getSuppressNotificationIfEntityValueUnchanged() {
        return this.suppressNotificationIfEntityValueUnchanged;
    }
    
    @Override
    public String toString() {
        final boolean suppressNotificationIfEntityValueUnchanged = this.suppressNotificationIfEntityValueUnchanged;
        final Integer observerPriority = this.observerPriority;
        final StringBuilder sb = new StringBuilder("EntitiesObserverConfig{suppressNotificationIfEntityValueUnchanged=");
        sb.append(suppressNotificationIfEntityValueUnchanged);
        sb.append(",observerPriority=");
        sb.append(observerPriority);
        sb.append("}");
        return sb.toString();
    }
}
