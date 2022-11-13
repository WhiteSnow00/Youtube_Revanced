// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.notification;

import android.content.Context;

public final class NotificationOsSettingEntityController implements thk
{
    private final vdr a;
    private final Context b;
    private final zqe c;
    private final String d;
    
    public NotificationOsSettingEntityController(final vdr a, final Context b, final zqe c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = vgl.h(amsa.b.a(), "notification_os_setting_entity");
    }
    
    public final thh g() {
        return thh.c;
    }
    
    public final void lW(final aun aun) {
        final vdq b = this.a.b();
        final int n = xmm.D(this.b, this.c) - 1;
        amsb amsb = null;
        Label_0057: {
            if (n != 1) {
                if (n == 2) {
                    amsb = amsb.c;
                    break Label_0057;
                }
                if (n != 3) {
                    amsb = amsb.d;
                    break Label_0057;
                }
            }
            amsb = amsb.b;
        }
        final String d = this.d;
        d.getClass();
        adkp.R(d.isEmpty() ^ true, (Object)"key cannot be empty");
        final ahaz builder = ((ahbh)amsa.a).createBuilder();
        builder.copyOnWrite();
        final amsa amsa = (amsa)builder.instance;
        amsa.c |= 0x1;
        amsa.d = d;
        final amrx amrx = new amrx(builder);
        final ahaz a = amrx.a;
        a.copyOnWrite();
        final amsa amsa2 = (amsa)a.instance;
        amsa2.e = amsb.e;
        amsa2.c |= 0x2;
        final amrz b2 = amrx.b();
        final veb e = ((vdw)b).e();
        ((vfw)e).d((vfn)b2);
        ((vfw)e).b().U();
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.e((thk)this);
    }
    
    public final void oW() {
        tfg.d((thk)this);
    }
    
    public final void oX(final aun aun) {
    }
}
