// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.bedtime;

import java.util.concurrent.Executor;

public class SystemBedtimeEduController$1 implements thk
{
    final fzw a;
    
    public SystemBedtimeEduController$1(final fzw a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public final thh g() {
        return thh.c;
    }
    
    public final void lW(final aun aun) {
        final fzw a = this.a;
        final exi exi = (exi)((arkg)a.b).a();
        final blu blu = (blu)((arkg)a.a).a();
        if ((exi.j() && exi.l()) || blu.f().aM() != exx.e) {
            return;
        }
        ((Executor)blu.a).execute(new esl(blu, 20, null, null));
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.e((thk)this);
    }
    
    public final void oW() {
        tfg.d((thk)this);
    }
    
    public final void oX(final aun aun) {
    }
}
