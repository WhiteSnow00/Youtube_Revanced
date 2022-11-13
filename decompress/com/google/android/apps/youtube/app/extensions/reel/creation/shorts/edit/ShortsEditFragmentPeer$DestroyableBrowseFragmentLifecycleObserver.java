// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit;

public class ShortsEditFragmentPeer$DestroyableBrowseFragmentLifecycleObserver implements aua
{
    public txz a;
    public boolean b;
    private int c;
    
    public ShortsEditFragmentPeer$DestroyableBrowseFragmentLifecycleObserver(final txz a) {
        this.c = 0;
        this.a = a;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        ++this.c;
        final txz a = this.a;
        if (a != null && this.b) {
            a.W();
        }
    }
    
    public final void oX(final aun aun) {
        final int c = this.c - 1;
        this.c = c;
        if (c == 0) {
            final txz a = this.a;
            if (a != null && this.b) {
                a.X();
            }
        }
    }
}
