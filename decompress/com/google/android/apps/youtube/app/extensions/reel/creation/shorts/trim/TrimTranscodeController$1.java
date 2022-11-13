// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;

public class TrimTranscodeController$1 implements aua
{
    final cgi a;
    final hfx b;
    
    public TrimTranscodeController$1(final hfx b, final cgi a) {
        this.b = b;
        this.a = a;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        final hfx b = this.b;
        b.a(false);
        final txk g = b.g;
        if (g != null) {
            g.b();
        }
    }
    
    public final void mq(final aun aun) {
        final hfx b = this.b;
        final Bundle a = this.a.a("KEY_TRIM_TRANSCODE_CONTROLLER");
        if (a != null) {
            b.i = hij.h("pending_clip_edit_metadata", a);
        }
    }
    
    public final void my(final aun aun) {
        final hfx b = this.b;
        b.h = null;
        final BroadcastReceiver c = b.c;
        if (c != null) {
            agoe.u(c, (Context)b.a);
        }
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
