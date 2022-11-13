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
    
    public ReelPresetTracker(final aun aun, final upw upw, final qqr qqr) {
        super(aun, upw, qqr);
    }
    
    public static void h() {
        ttr.b("Error saving most recent preset effect ID for Stories");
    }
    
    private static final boolean l(final String s, final List list) {
        return FilterMapTable$FilterDescriptor.a(list, s) != null;
    }
    
    protected final void g() {
        final String e = this.e;
        if (e != null) {
            teu.m(this.i.b((aezf)new uig(e, 0), (Executor)afum.a), (tes)gnn.k);
        }
    }
    
    public final void i(final uie uie, final vbs vbs) {
        final String k = uie.k;
        final List b = vbs.b();
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
