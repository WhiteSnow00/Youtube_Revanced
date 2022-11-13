// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded;

import android.os.RemoteException;
import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f;

public final class b implements sjr
{
    public f a;
    
    public b(final f a) {
        a.getClass();
        this.a = a;
    }
    
    public final void a(final Bundle bundle) {
        final f a = this.a;
        if (a != null) {
            try {
                a.a(bundle);
            }
            catch (final RemoteException ex) {
                mft.v(ex);
            }
        }
    }
    
    public final void b(final int[] array) {
        final f a = this.a;
        if (a != null) {
            try {
                a.b(array);
            }
            catch (final RemoteException ex) {
                mft.v(ex);
            }
        }
    }
    
    public final void c(final int n, final int n2) {
        final f a = this.a;
        if (a != null) {
            try {
                a.g(n, n2);
            }
            catch (final RemoteException ex) {
                mft.v(ex);
            }
        }
    }
}
