// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c;

public final class ApiPlayerService$$ExternalSyntheticLambda35 implements tui
{
    public final c a;
    
    public ApiPlayerService$$ExternalSyntheticLambda35(final c a) {
        this.a = a;
    }
    
    public final void a(final Object o) {
        final c a = this.a;
        final Boolean b = (Boolean)o;
        if (b == null) {
            return;
        }
        try {
            a.a(b);
        }
        catch (final RemoteException ex) {}
    }
}
