// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.bedtime;

import android.app.Activity;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.wellness.youtubetime.YoutubeTimeTimerController;

public class YoutubeTimeReminderController extends eww implements thj
{
    public final arkg b;
    public final asid c;
    public final YoutubeTimeTimerController d;
    public final arkg e;
    public final arkg f;
    public final asid g;
    private final Executor h;
    private final vai i;
    
    public YoutubeTimeReminderController(final Activity activity, final wyv wyv, final arkg arkg, final arkg e, final arkg b, final arkg arkg2, final arkg f, final abpu abpu, final arkg arkg3, final arkg arkg4, final arkg arkg5, final asid g, final asid c, final Executor h, final YoutubeTimeTimerController d, final vai i, final arkg arkg6, final arkg arkg7, final arkg arkg8) {
        super(activity, wyv, arkg, e, b, arkg2, abpu, arkg3, arkg4, arkg5, g, h, arkg6, arkg7, i.bN(), arkg8);
        this.b = b;
        this.c = c;
        this.h = h;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.i = i;
    }
    
    public final thh g() {
        return thh.a;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void m() {
        this.d.j();
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
        if (!this.i.bP()) {
            return;
        }
        this.h.execute(aeun.h((Runnable)new eym(this, 1)));
    }
    
    public final void my(final aun aun) {
    }
    
    public final void o(final boolean b) {
        this.d.j();
    }
    
    public final /* bridge */ void oN() {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.g((thj)this);
    }
    
    public final void oW() {
        tfg.f((thj)this);
    }
    
    public final void oX(final aun aun) {
    }
    
    public final void p() {
        super.p();
        this.d.j();
    }
}
