// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.tvfilm;

import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

public class RentalActivationOverlay extends abtz implements fju, thl
{
    public YouTubeTextView a;
    private final fjv b;
    
    public RentalActivationOverlay(final Context context, final fjv b) {
        super(context);
        this.b = b;
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void j() {
        final YouTubeTextView a = this.a;
        if (a == null) {
            return;
        }
        a.setText((CharSequence)null);
        this.k();
    }
    
    public final void k() {
        if (this.b.j() != fkr.c) {
            final YouTubeTextView a = this.a;
            if (a != null && a.getText() != null) {
                this.setVisibility(0);
                return;
            }
        }
        this.setVisibility(8);
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void n(final fkr fkr) {
        this.k();
    }
    
    public final void oK(final fkr fkr, final fkr fkr2) {
        fal.b((fju)this, fkr2);
    }
    
    public final void oS(final aun aun) {
        this.b.l((fju)this);
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        this.b.n((fju)this);
    }
}
