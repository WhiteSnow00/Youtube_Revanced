// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet;

import j$.util.Optional;
import android.app.Activity;
import android.view.View$OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.v;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.View;
import android.view.View$OnLayoutChangeListener;
import android.os.Bundle;
import android.view.Window;
import android.content.Context;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class c extends fy
{
    public adtm a;
    public BottomSheetBehavior b;
    public boolean c;
    
    public c(final Context context) {
        super(context, 2132083239);
    }
    
    public final void a(final float dimAmount) {
        final Window window = this.getWindow();
        if (window != null) {
            window.setDimAmount(dimAmount);
        }
    }
    
    public final void b(final c c) {
        this.c = true;
        c.c = true;
        c.show();
        this.cancel();
    }
    
    public final void cancel() {
        final BottomSheetBehavior b = this.b;
        if (b.z == 5) {
            super.cancel();
            return;
        }
        final adtm a = this.a;
        if (a != null) {
            b.z(a);
        }
        this.b.H(5);
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Window window = this.getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }
    
    protected final void onStart() {
        super.onStart();
        final BottomSheetBehavior b = this.b;
        if (b != null) {
            b.F(true);
            this.b.H(4);
            this.b.G(0);
            final View viewById = this.findViewById(2131428832);
            if (viewById != null) {
                viewById.addOnLayoutChangeListener((View$OnLayoutChangeListener)new jcl(this, viewById, 5));
            }
        }
    }
    
    public final void setContentView(final View view) {
        final FrameLayout contentView = (FrameLayout)View.inflate(this.getContext(), 2131624383, (ViewGroup)null);
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)contentView.findViewById(2131428487);
        final FrameLayout frameLayout = (FrameLayout)coordinatorLayout.findViewById(2131428832);
        final BottomSheetBehavior b = new BottomSheetBehavior();
        this.b = b;
        final adtm a = this.a;
        if (a != null) {
            b.z(a);
        }
        ((aek)frameLayout.getLayoutParams()).b(this.b);
        frameLayout.addView(view);
        coordinatorLayout.findViewById(2131432169).setOnClickListener((View$OnClickListener)new v(this, 2));
        anb.N((View)frameLayout, new b(this));
        super.setContentView((View)contentView);
    }
    
    public final void show() {
        final Window window = this.getWindow();
        if (window != null) {
            window.setFlags(8, 8);
            final Optional r = kzr.r(this.getContext());
            if (r.isPresent()) {
                window.getDecorView().setSystemUiVisibility(((Activity)r.get()).getWindow().getDecorView().getSystemUiVisibility());
                super.show();
                window.clearFlags(8);
                return;
            }
            super.show();
        }
    }
}
