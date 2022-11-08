// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.logging.interaction;

public class ScreenLoggingLifecycleObserver implements atz
{
    private final wxv a;
    
    public ScreenLoggingLifecycleObserver(final wxv a) {
        this.a = a;
    }
    
    public final void mM(final aum aum) {
        if (this.a.n() != null) {
            this.a.n().s();
        }
    }
    
    public final void mq(final aum aum) {
        if (this.a.n() != null) {
            this.a.n().c(wya.b(this.a.p()), this.a.aK(), this.a.aU(), this.a.aN(), this.a.aM());
        }
    }
}
