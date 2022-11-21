// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;

public final class ApiPlayerService$$ExternalSyntheticLambda23 implements Runnable
{
    public final ApiPlayerService a;
    public final PlaybackServiceState b;
    public final ConditionVariable c;
    
    public ApiPlayerService$$ExternalSyntheticLambda23(final ApiPlayerService a, final PlaybackServiceState b, final ConditionVariable c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final ApiPlayerService a = this.a;
        final PlaybackServiceState b = this.b;
        final ConditionVariable c = this.c;
        a.a.t(b);
        c.open();
    }
}
