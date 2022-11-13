// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

public abstract class CommandHandlerResolver
{
    public static CommandHandlerResolver create(final CommandHandler commandHandler, final ExecutorRegistry executorRegistry) {
        return CommandHandlerResolver$CppProxy.create(commandHandler, executorRegistry);
    }
    
    public abstract CommandHandler commandHandlerForExtension(final int p0);
    
    public abstract Integer handleCommand(final CommandOuterClass$Command p0, final CommandRunContext p1, final CommandRunCompletionCallback p2);
    
    public abstract void handleCommandWithPlatformFallback(final CommandOuterClass$Command p0, final CommandRunContext p1, final CommandRunCompletionCallback p2);
    
    public abstract boolean hasCustomHandlerForExtension(final int p0);
    
    public abstract void registerCommandHandler(final CommandHandler p0, final int p1, final CommandThread p2);
}
