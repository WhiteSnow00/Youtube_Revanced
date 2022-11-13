// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.apps.youtube.embeddedplayer.service.model.IpcCompatiblePlaybackState;
import j$.util.Optional;
import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicReference;

public final class ApiPlayerService$$ExternalSyntheticLambda4 implements Runnable
{
    public ApiPlayerService a;
    public AtomicReference b;
    public ConditionVariable c;
    
    public ApiPlayerService$$ExternalSyntheticLambda4(final ApiPlayerService a, final AtomicReference b, final ConditionVariable c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final ApiPlayerService a = this.a;
        final AtomicReference b = this.b;
        final ConditionVariable c = this.c;
        final lor a2 = a.a;
        final PlaybackServiceState c2 = a2.c();
        final int hashCode = c2.hashCode();
        a2.h.a = c2;
        Optional empty = Optional.empty();
        final PlaybackStartDescriptor e = a2.e;
        PlaybackStartDescriptor playbackStartDescriptor;
        if (e != null) {
            final Optional of = Optional.of((Object)e.B(a2.Y));
            final PlaybackStartDescriptor a3 = a2.e.e().a();
            final abvx p = a2.i.p();
            empty = of;
            playbackStartDescriptor = a3;
            if (p != null) {
                a3.p(p.c());
                empty = of;
                playbackStartDescriptor = a3;
            }
        }
        else {
            playbackStartDescriptor = null;
        }
        final boolean i = a2.I(empty);
        boolean b3;
        final boolean b2 = b3 = true;
        if (!i) {
            final int g = a2.g;
            b3 = b2;
            if (g != 2) {
                b3 = (g == 4 && b2);
            }
        }
        b.set(new IpcCompatiblePlaybackState(hashCode, playbackStartDescriptor, b3));
        c.open();
    }
}
