// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import android.os.RemoteException;
import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f;

public final class d implements sji
{
    public f a;
    
    public d(final f a) {
        a.getClass();
        this.a = a;
    }
    
    public final void a(final Bundle bundle) {
        final f a = this.a;
        if (a != null) {
            try {
                a.a(null);
            }
            catch (final RemoteException ex) {
                jfi.ak(ex);
            }
        }
    }
    
    public final void b() {
        final f a = this.a;
        if (a != null) {
            try {
                a.b();
            }
            catch (final RemoteException ex) {
                jfi.ak(ex);
            }
        }
    }
    
    public final void c(final boolean b) {
    }
    
    public final void d() {
        final f a = this.a;
        if (a != null) {
            try {
                a.d();
            }
            catch (final RemoteException ex) {
                jfi.ak(ex);
            }
        }
    }
    
    public final void e(final int n, final int n2) {
        final f a = this.a;
        if (a != null) {
            try {
                a.e(n, n2);
            }
            catch (final RemoteException ex) {
                jfi.ak(ex);
            }
        }
    }
}
