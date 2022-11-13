// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashSet;
import java.util.Set;

public class DefaultVideoStageMonitor implements thl, irz
{
    public final Set a;
    public aans b;
    private final asiq c;
    private final hzm d;
    
    public DefaultVideoStageMonitor(final hzm d, final byte[] array, final byte[] array2) {
        this.d = d;
        this.c = new asiq();
        this.a = new HashSet();
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final aans j() {
        return this.b;
    }
    
    public final String k() {
        final aans b = this.b;
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
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        this.c.b();
        this.c.c(((ashi)this.d.b).Y((asjr)iqm.f).an((asjm)new ihl(this, 16), (asjm)hot.q));
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        this.c.b();
    }
}
