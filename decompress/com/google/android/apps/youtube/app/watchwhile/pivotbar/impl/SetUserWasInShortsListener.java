// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watchwhile.pivotbar.impl;

import java.util.function.Consumer;
import j$.util.Optional;

public final class SetUserWasInShortsListener implements tfg
{
    public final atjj a;
    private final ggv b;
    private Optional c;
    
    public SetUserWasInShortsListener(final ggv b, final atjj a) {
        this.c = Optional.empty();
        this.b = b;
        this.a = a;
    }
    
    public final void lW(final aum aum) {
        this.c.ifPresent((Consumer)lka.e);
        this.c = Optional.of((Object)this.b.b().ae().W((asjc)lkr.d).z().aB((asix)new lkg(this, 5)));
    }
    
    public final void my(final aum aum) {
        this.c.ifPresent((Consumer)lka.e);
        this.c = Optional.empty();
    }
}
