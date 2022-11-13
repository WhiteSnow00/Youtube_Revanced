// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import android.os.ConditionVariable;
import com.google.android.apps.youtube.embeddedplayer.service.model.IpcCompatiblePlaybackState;

public final class ApiPlayerService$$ExternalSyntheticLambda22 implements Runnable
{
    public ApiPlayerService a;
    public IpcCompatiblePlaybackState b;
    public ConditionVariable c;
    
    public ApiPlayerService$$ExternalSyntheticLambda22(final ApiPlayerService a, final IpcCompatiblePlaybackState b, final ConditionVariable c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final ApiPlayerService a = this.a;
        final IpcCompatiblePlaybackState b = this.b;
        final ConditionVariable c = this.c;
        final lor a2 = a.a;
        if (b != null) {
            final ApiPlayerStateCache h = a2.h;
            final int b2 = b.b;
            final PlaybackServiceState a3 = h.a;
            PlaybackServiceState a4;
            final PlaybackServiceState playbackServiceState = a4 = null;
            if (a3 != null) {
                a4 = playbackServiceState;
                if (b2 == a3.hashCode()) {
                    a4 = h.a;
                }
            }
            if (a4 != null) {
                a2.t(a4);
            }
            else {
                final PlaybackStartDescriptor c2 = b.c;
                if (c2 != null) {
                    a2.l(c2, b.a, a2.f);
                }
            }
        }
        c.open();
    }
}
