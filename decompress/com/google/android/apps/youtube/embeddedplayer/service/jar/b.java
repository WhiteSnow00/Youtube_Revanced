// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.model.HotConfigData;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;

public final class b implements com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.b
{
    public static final b a;
    private final atjm b;
    private ajnf c;
    
    static {
        a = new b();
    }
    
    private b() {
        this.c = ajnf.a;
        this.b = atjm.e();
    }
    
    public final asir a(final asjm asjm) {
        return ((asht)this.b).aH(asjm);
    }
    
    public final void b(final BusSupported$Data busSupported$Data) {
        if (busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.c)) {
            if (busSupported$Data instanceof HotConfigData) {
                final ajnf a = ((HotConfigData)busSupported$Data).a;
                this.c = a;
                this.b.tu((Object)a);
            }
        }
    }
    
    public final asir c(final asjm asjm, final asjr asjr) {
        return ((asht)this.b).Z(asjr).A().aH(asjm);
    }
    
    public final void d() {
    }
}
