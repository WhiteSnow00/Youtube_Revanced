// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import android.view.View;
import android.os.RemoteException;

public final class l implements asjm
{
    public final int a;
    private final int b;
    
    public l(final int a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        if (b == 0) {
            final int a = this.a;
            final t t = (t)o;
            final SimplePlaybackDescriptor q = t.q;
            if ((q == null || q.e != 2) && !t.o()) {
                final ac a2 = t.g.a;
                if (!a2.f()) {
                    mft.w();
                    return;
                }
                try {
                    a2.d.E(a);
                }
                catch (final RemoteException ex) {
                    mft.v(ex);
                }
            }
            return;
        }
        if (b == 1) {
            final int a3 = this.a;
            final View view = (View)o;
            final int cu = hwl.cU;
            view.setPadding(a3, 0, a3, 0);
            return;
        }
        if (b != 2) {
            final int a4 = this.a;
            final t t2 = (t)o;
            t2.p = a4;
            if (!t2.o()) {
                final int p = t2.p;
                if (p == 8) {
                    t2.g.w(t2);
                    t2.g.k();
                    t2.e();
                    return;
                }
                if (p == 11) {
                    t2.g.x(t2, t2.f.e());
                    return;
                }
                if (p == 13) {
                    t2.f();
                }
            }
            return;
        }
        final int a5 = this.a;
        final t t3 = (t)o;
        final SimplePlaybackDescriptor q2 = t3.q;
        if ((q2 == null || q2.e != 2) && !t3.o()) {
            final ac a6 = t3.g.a;
            if (!a6.f()) {
                mft.w();
                return;
            }
            try {
                a6.d.F(a5);
            }
            catch (final RemoteException ex2) {
                mft.v(ex2);
            }
        }
    }
}
