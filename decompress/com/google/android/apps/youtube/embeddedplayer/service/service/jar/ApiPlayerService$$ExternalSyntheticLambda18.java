// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ApiPlayerService$$ExternalSyntheticLambda18 implements Runnable
{
    public final ApiPlayerService a;
    public final AtomicBoolean b;
    public final ConditionVariable c;
    
    public ApiPlayerService$$ExternalSyntheticLambda18(final ApiPlayerService a, final AtomicBoolean b, final ConditionVariable c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final ApiPlayerService a = this.a;
        final AtomicBoolean b = this.b;
        final ConditionVariable c = this.c;
        b.set(a.a.J());
        c.open();
    }
}
