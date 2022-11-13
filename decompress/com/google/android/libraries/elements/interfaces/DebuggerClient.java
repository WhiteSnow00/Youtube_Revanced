// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public abstract class DebuggerClient
{
    public static DebuggerClient create(final String s, final String s2, final String s3, final DebuggerCallback debuggerCallback) {
        return DebuggerClient$CppProxy.create(s, s2, s3, debuggerCallback);
    }
    
    public abstract long createEventId();
    
    public abstract boolean sendLog(final byte[] p0);
    
    public abstract boolean sendStoreSnapshot(final byte[] p0);
    
    public abstract boolean sendTimelineEvent(final byte[] p0);
    
    public abstract boolean traverseViewHierarchyResponse(final byte[] p0);
}
