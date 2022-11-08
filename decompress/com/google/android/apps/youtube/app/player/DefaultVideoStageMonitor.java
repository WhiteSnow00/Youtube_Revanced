// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashSet;
import java.util.Set;

public class DefaultVideoStageMonitor implements tfh, ira
{
    public final Set a;
    public aaly b;
    private final asib c;
    private final hyq d;
    
    public DefaultVideoStageMonitor(final hyq d, final byte[] array, final byte[] array2) {
        this.d = d;
        this.c = new asib();
        this.a = new HashSet();
    }
    
    public final aaly j() {
        return this.b;
    }
    
    public final String k() {
        final aaly b = this.b;
        PlayerResponseModel playerResponseModel = null;
        Label_0054: {
            if (b != null) {
                if (b.c().h() && b.a() != null) {
                    playerResponseModel = b.a();
                    break Label_0054;
                }
                if (!b.c().h()) {
                    playerResponseModel = b.b();
                    break Label_0054;
                }
            }
            playerResponseModel = null;
        }
        if (playerResponseModel != null) {
            return playerResponseModel.K();
        }
        return null;
    }
    
    public final void oS(final aum aum) {
        this.c.b();
        this.c.c(((asgt)this.d.b).Y((asjc)iqc.d).am((asix)new ign(this, 17), (asix)hnn.r));
    }
    
    public final void oW(final aum aum) {
        this.c.b();
    }
}
