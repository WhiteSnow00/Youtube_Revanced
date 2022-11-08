// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.panel.ui.cinematics;

import android.content.Context;

public class WatchCinematicSettingsController implements tfg
{
    public final Context a;
    public final ftc b;
    public final asgt c;
    private final atjj d;
    private final asib e;
    
    public WatchCinematicSettingsController(final Context a, final atjj d, final tku tku, final ftc b) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = tku.d().L((asjc)lfp.h).W((Object)true).p().ax().aD();
        this.e = new asib();
    }
    
    public final void lW(final aum aum) {
        if (!((lft)this.d.a()).m()) {
            this.b.a("menu_item_cinematic_lighting", false);
            return;
        }
        this.b.a("menu_item_cinematic_lighting", true);
        this.e.c(this.c.al((asix)new ldk(this, 15)));
    }
    
    public final void my(final aum aum) {
        this.e.b();
    }
}
