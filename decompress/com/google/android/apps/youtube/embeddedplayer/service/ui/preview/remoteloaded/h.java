// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

import android.graphics.Bitmap;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.View$OnLayoutChangeListener;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.model.c;
import android.widget.TextView;

public final class h extends aazp
{
    public TextView a;
    public TextView b;
    public g c;
    public asic d;
    public c e;
    public asic f;
    public boolean g;
    private FrameLayout h;
    private boolean i;
    private final View$OnLayoutChangeListener j;
    
    public h(final Context context) {
        super(context);
        this.g = true;
        this.j = (View$OnLayoutChangeListener)new jbw(this, 13);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void m() {
        super.aa();
        this.Z(2);
    }
    
    public final aazs mj(final Context context) {
        final aazs mj = super.mj(context);
        mj.e = false;
        mj.b();
        mj.a();
        return mj;
    }
    
    public final void mk() {
        super.X();
        if (this.mn()) {
            this.a.setVisibility(8);
            this.b.setVisibility(8);
            final g c = this.c;
            c.a.clearAnimation();
            c.a.setVisibility(8);
        }
    }
    
    public final boolean mn() {
        return this.i && super.mn();
    }
    
    public final void n() {
        super.aa();
        this.Z(1);
    }
    
    public final boolean oU() {
        return this.e != null;
    }
    
    public final aazu ox() {
        return super.ox();
    }
}
