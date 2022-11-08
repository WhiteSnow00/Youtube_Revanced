// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.mdx.manualpairing;

public class DeleteTvCodesController$1 implements atz
{
    final /* synthetic */ xdy a;
    
    public DeleteTvCodesController$1(final xdy a) {
        this.a = a;
    }
    
    public final void lW(final aum aum) {
        this.a.a();
    }
    
    public final void mq(final aum aum) {
        final xdy a = this.a;
        final br a2 = a.a;
        if (a2 != null) {
            final bi bi = (bi)a2.od().getSupportFragmentManager().f("confirmRemoveDialog");
            if (bi != null) {
                ((br)bi).aG(a.a);
            }
        }
    }
}
