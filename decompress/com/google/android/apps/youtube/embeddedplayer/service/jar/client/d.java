// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import java.util.Iterator;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class d
{
    private final List a;
    private long b;
    private boolean c;
    private int d;
    
    public d() {
        this.b = 0L;
        this.a = new ArrayList();
        this.d = 0;
    }
    
    private final void d() {
        final int d = this.d;
        if ((d != 2 && d != 3) || !this.c) {
            return;
        }
        for (final aeiq aeiq : this.a) {
            try {
                aeiq.a(this.b);
            }
            catch (final RemoteException ex) {
                aftr.k("Problem sending getDuration result to client.");
            }
        }
        this.a.clear();
    }
    
    public final void a(final long b) {
        synchronized (this) {
            this.b = b;
            this.c = true;
            this.d();
        }
    }
    
    public final void b(final int d) {
        synchronized (this) {
            this.d = d;
            if (d == 5) {
                this.c = false;
            }
            this.d();
        }
    }
    
    public final void c(final aeiq aeiq) {
        monitorenter(this);
        if (aeiq == null) {
            monitorexit(this);
            return;
        }
        try {
            this.a.add(aeiq);
            this.d();
        }
        finally {
            monitorexit(this);
        }
    }
}
