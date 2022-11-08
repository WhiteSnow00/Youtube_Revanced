// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.engagementpanel;

import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Map;

public class ShowPlaylistEngagementPanelOnUiReadyHandler implements glw, tff
{
    public final vax a;
    public aavz b;
    public aavy c;
    private final aawb d;
    private final arhr e;
    private Runnable f;
    private aioe g;
    private aioe h;
    
    public ShowPlaylistEngagementPanelOnUiReadyHandler(final aawb d, final vax a, final arhr e) {
        this.c = aavy.a;
        this.a = a;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean j(final aioe g, final Map map, final alcj alcj) {
        if (!vem.A((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)((agzd)g).rr((agyr)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint))) {
            return false;
        }
        this.f = null;
        if (((utk)this.e.a()).z()) {
            if (this.h != g) {
                this.f = new juf(this, g, map, 6);
                this.h = null;
                this.g = g;
                this.k();
            }
        }
        return true;
    }
    
    public final void k() {
        if (this.f != null) {
            if (this.c.a(aavy.d)) {
                final Runnable f = this.f;
                f.getClass();
                f.run();
                this.h = this.g;
                this.g = null;
                this.f = null;
            }
        }
    }
    
    public final void mM(final aum aum) {
        final aavz b = this.b;
        if (b != null) {
            this.d.q(b);
        }
    }
    
    public final void mq(final aum aum) {
        final aavz b = this.b;
        if (b != null) {
            this.d.i(b);
        }
    }
}
