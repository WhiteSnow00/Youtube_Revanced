// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.command.modal;

import android.widget.TextView;
import android.view.View;
import android.app.AlertDialog;
import android.content.Context;

public class ModalDialogController implements thj
{
    public final Context a;
    public final acaf b;
    public final wyv c;
    public final abpq d;
    public AlertDialog e;
    public View f;
    public TextView g;
    public acsx h;
    public acsx i;
    public boolean j;
    public final ziy k;
    public final aeea l;
    
    public ModalDialogController(final Context a, final acnc b, final wyv c, final ziy k, final abpq d, final aeea l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = (acaf)b;
        this.c = c;
        this.k = k;
        this.d = d;
        this.l = l;
    }
    
    public final thh g() {
        return thh.a;
    }
    
    public final void j() {
        final AlertDialog e = this.e;
        if (e != null) {
            e.dismiss();
        }
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        this.j();
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.g((thj)this);
    }
    
    public final void oW() {
        tfg.f((thj)this);
    }
    
    public final void oX(final aun aun) {
    }
}
