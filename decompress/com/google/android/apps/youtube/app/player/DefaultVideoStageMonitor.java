// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashSet;
import java.util.Set;

public class DefaultVideoStageMonitor implements tio, isi
{
    public final Set a;
    public aapp b;
    private final aslm c;
    private final cdr d;
    
    public DefaultVideoStageMonitor(final cdr d, final byte[] array) {
        this.d = d;
        this.c = new aslm();
        this.a = new HashSet();
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final aapp j() {
        return this.b;
    }
    
    public final String k() {
        final aapp b = this.b;
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
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.c.b();
        this.c.c(((aske)this.d.b).Y((asmn)iqv.g).an((asmi)new ihk(this, 18), (asmi)hoq.r));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.c.b();
    }
}
