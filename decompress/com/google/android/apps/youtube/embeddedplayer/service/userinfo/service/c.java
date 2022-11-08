// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import java.util.function.Consumer;
import j$.util.Optional;

public final class c implements ashj
{
    public Optional a;
    public asic b;
    
    public c() {
        this.a = Optional.empty();
        this.b = arxj.a();
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.ifPresent((Consumer)lka.g);
    }
    
    @Override
    public final void d(final asic b) {
        this.b = b;
    }
    
    @Override
    public final void tu() {
        this.b.dispose();
        this.a = Optional.empty();
    }
}
