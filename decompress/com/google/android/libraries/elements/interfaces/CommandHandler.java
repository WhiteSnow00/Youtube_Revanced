// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

public abstract class CommandHandler
{
    public abstract void run(final CommandOuterClass$Command p0, final CommandRunContext p1, final CommandRunCompletionCallback p2);
}
