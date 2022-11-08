// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.util;

import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import java.util.List;
import com.google.android.libraries.youtube.creation.common.util.PresetTracker;

public class ReelPresetTracker extends PresetTracker
{
    public boolean a;
    
    public ReelPresetTracker(final aum aum, final unz unz, final aagm aagm, final byte[] array) {
        super(aum, unz, aagm, (byte[])null);
    }
    
    private static final boolean l(final String s, final List list) {
        return FilterMapTable$FilterDescriptor.a(list, s) != null;
    }
    
    protected final void g() {
        final String e = this.e;
        if (e != null) {
            tcp.m(this.i.c((aexg)new srt(e, 20), (Executor)afsl.a), (tcn)gnh.k);
        }
    }
    
    public final void i(final ugb ugb, final van van) {
        final String k = ugb.k;
        final List b = van.b();
        if (l(k, b)) {
            this.h = k;
            return;
        }
        if (this.a && l("AUTO", b)) {
            this.h = "AUTO";
            return;
        }
        this.h = "NORMAL";
    }
}
