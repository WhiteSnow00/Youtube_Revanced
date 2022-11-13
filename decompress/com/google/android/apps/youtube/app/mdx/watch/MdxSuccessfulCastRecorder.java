// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.watch;

import android.content.SharedPreferences$Editor;
import j$.time.Instant;
import android.content.SharedPreferences;

public class MdxSuccessfulCastRecorder implements xnr, thj
{
    private final SharedPreferences a;
    private final arkg b;
    
    public MdxSuccessfulCastRecorder(final SharedPreferences a, final arkg b) {
        this.a = a;
        this.b = b;
    }
    
    public final thh g() {
        return thh.a;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        ((xnt)this.b.a()).k((xnr)this);
    }
    
    public final void mq(final aun aun) {
        ((xnt)this.b.a()).i((xnr)this);
    }
    
    public final void my(final aun aun) {
    }
    
    public final void o(final xnm xnm) {
        final SharedPreferences$Editor edit = this.a.edit();
        final afsr a = afsr.a;
        edit.putLong("on_device_mdx_successful_cast_time", Instant.now().toEpochMilli()).apply();
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
    
    public final void p(final xnm xnm) {
    }
    
    public final void q(final xnm xnm) {
    }
}
