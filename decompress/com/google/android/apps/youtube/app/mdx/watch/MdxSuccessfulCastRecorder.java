// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.watch;

import android.content.SharedPreferences$Editor;
import j$.time.Instant;
import android.content.SharedPreferences;

public class MdxSuccessfulCastRecorder implements xpd, tim
{
    private final SharedPreferences a;
    private final arna b;
    
    public MdxSuccessfulCastRecorder(final SharedPreferences a, final arna b) {
        this.a = a;
        this.b = b;
    }
    
    public final tik g() {
        return tik.a;
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
        ((xpf)this.b.a()).i((xpd)this);
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void o(final xoy xoy) {
        final SharedPreferences$Editor edit = this.a.edit();
        final afuh a = afuh.a;
        edit.putLong("on_device_mdx_successful_cast_time", Instant.now().toEpochMilli()).apply();
    }
    
    public final void oO(final aup aup) {
        ((xpf)this.b.a()).k((xpd)this);
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
    
    public final void p(final xoy xoy) {
    }
    
    public final void q(final xoy xoy) {
    }
}
