// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.bedtime;

import java.util.concurrent.Executor;
import android.app.Activity;

public class DataReminderController extends ewy implements tim
{
    public final Activity b;
    public final arna c;
    public final askz d;
    public final gnd e;
    public final arna f;
    public final arna g;
    public final askz h;
    public final tnz i;
    private final Executor j;
    private final vbs k;
    
    public DataReminderController(final Activity b, final xaa xaa, final arna arna, final arna f, final arna c, final arna arna2, final arna g, final abqz abqz, final arna arna3, final arna arna4, final arna arna5, final askz h, final askz d, final Executor j, final gnd e, final vbs k, final arna arna6, final tnz i, final arna arna7, final arna arna8) {
        super(b, xaa, arna, f, c, arna2, abqz, arna3, arna4, arna5, h, j, arna6, arna7, true, arna8);
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
        tfx.i(this.i.b((afax)bwr.d), tfx.b);
    }
    
    public final tik g() {
        return tik.a;
    }
    
    public final void lW(final aup aup) {
    }
    
    public final /* bridge */ void m() {
    }
    
    public final void mp(final aup aup) {
        if (!this.k.bI()) {
            return;
        }
        this.j.execute(aewf.h((Runnable)new esn(this, 18)));
    }
    
    public final void mx(final aup aup) {
    }
    
    public final /* bridge */ void o(final boolean b) {
    }
    
    public final void oN() {
        this.s();
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
    }
    
    public final void oU() {
        tgj.h((tim)this);
    }
    
    public final void oX() {
        tgj.g((tim)this);
    }
    
    public final void oY(final aup aup) {
    }
    
    public final void p() {
        super.p();
        this.s();
    }
}
