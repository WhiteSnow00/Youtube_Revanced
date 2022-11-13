// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.bedtime;

import java.util.concurrent.Executor;
import android.app.Activity;

public class DataReminderController extends eww implements thj
{
    public final Activity b;
    public final arkg c;
    public final asid d;
    public final gmx e;
    public final arkg f;
    public final arkg g;
    public final asid h;
    public final tmx i;
    private final Executor j;
    private final vai k;
    
    public DataReminderController(final Activity b, final wyv wyv, final arkg arkg, final arkg f, final arkg c, final arkg arkg2, final arkg g, final abpu abpu, final arkg arkg3, final arkg arkg4, final arkg arkg5, final asid h, final asid d, final Executor j, final gmx e, final vai k, final arkg arkg6, final tmx i, final arkg arkg7, final arkg arkg8) {
        super(b, wyv, arkg, f, c, arkg2, abpu, arkg3, arkg4, arkg5, h, j, arkg6, arkg7, true, arkg8);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.k = k;
        this.j = j;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    private final void s() {
        teu.i(this.i.b((aezf)bwo.d), teu.b);
    }
    
    public final thh g() {
        return thh.a;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final /* bridge */ void m() {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
        if (!this.k.bE()) {
            return;
        }
        this.j.execute(aeun.h((Runnable)new esl(this, 18)));
    }
    
    public final void my(final aun aun) {
    }
    
    public final /* bridge */ void o(final boolean b) {
    }
    
    public final void oN() {
        this.s();
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
        this.s();
    }
}
