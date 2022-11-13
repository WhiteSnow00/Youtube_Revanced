// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ac;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.model.d;
import android.view.Window;
import android.app.ActionBar;
import com.google.android.apps.youtube.embeddedplayer.service.jar.a;

public final class c implements tqp
{
    public final a a;
    public final tqm b;
    public final ActionBar c;
    public final Window d;
    public d e;
    public boolean f;
    public boolean g;
    public final pvh h;
    
    public c(final Context context, final a a, final pvh h, final tqm b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = com.google.android.apps.youtube.embeddedplayer.service.model.d.a;
        context.getClass();
        this.a = a;
        this.h = h;
        this.c = a.c();
        this.d = a.d();
        this.b = b;
        this.f = true;
    }
    
    public final void y() {
        if (this.f && this.g) {
            final Object a = this.h.a;
            if (((ac)a).f()) {
                try {
                    ((ac)a).d.J();
                    return;
                }
                catch (final RemoteException ex) {
                    mft.v(ex);
                    return;
                }
            }
            mft.w();
        }
    }
}
