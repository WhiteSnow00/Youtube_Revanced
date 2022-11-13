// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

public abstract class CommandRunContext
{
    public abstract ByteStore byteStore();
    
    public abstract DebuggerClient debuggerClient();
    
    public abstract boolean enableV2();
    
    public abstract SenderStateOuterClass$SenderState senderState();
}
