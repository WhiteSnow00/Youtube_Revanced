// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;

public final class ApiPlayerService$$ExternalSyntheticLambda24 implements Runnable
{
    public final ApiPlayerService a;
    public final ConditionVariable b;
    
    public ApiPlayerService$$ExternalSyntheticLambda24(final ApiPlayerService a, final ConditionVariable b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final ApiPlayerService a = this.a;
        final ConditionVariable b = this.b;
        a.a.F();
        b.open();
    }
}
