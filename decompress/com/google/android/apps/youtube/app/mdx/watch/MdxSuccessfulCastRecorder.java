// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.watch;

import android.content.SharedPreferences$Editor;
import j$.time.Instant;
import android.content.SharedPreferences;

public class MdxSuccessfulCastRecorder implements xlt, tff
{
    private final SharedPreferences a;
    private final arhr b;
    
    public MdxSuccessfulCastRecorder(final SharedPreferences a, final arhr b) {
        this.a = a;
        this.b = b;
    }
    
    public final void mM(final aum aum) {
        ((xlv)this.b.a()).k((xlt)this);
    }
    
    public final void mq(final aum aum) {
        ((xlv)this.b.a()).i((xlt)this);
    }
    
    public final void o(final xlo xlo) {
        final SharedPreferences$Editor edit = this.a.edit();
        final afqq a = afqq.a;
        edit.putLong("on_device_mdx_successful_cast_time", Instant.now().toEpochMilli()).apply();
    }
    
    public final void p(final xlo xlo) {
    }
    
    public final void q(final xlo xlo) {
    }
}
