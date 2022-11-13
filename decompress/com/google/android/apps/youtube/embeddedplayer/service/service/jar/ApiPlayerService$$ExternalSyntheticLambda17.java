// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicReference;

public final class ApiPlayerService$$ExternalSyntheticLambda17 implements Runnable
{
    public ApiPlayerService a;
    public AtomicReference b;
    public ConditionVariable c;
    
    public ApiPlayerService$$ExternalSyntheticLambda17(final ApiPlayerService a, final AtomicReference b, final ConditionVariable c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final ApiPlayerService a = this.a;
        final AtomicReference b = this.b;
        final ConditionVariable c = this.c;
        b.set(a.a.c());
        c.open();
    }
}
