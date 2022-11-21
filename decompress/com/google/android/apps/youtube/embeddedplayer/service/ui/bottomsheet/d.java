// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet;

import j$.util.Optional;
import android.app.Activity;
import android.view.View$OnClickListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.View;
import android.view.View$OnLayoutChangeListener;
import android.os.Bundle;
import android.view.Window;
import android.content.Context;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class d extends fz
{
    public advd a;
    public BottomSheetBehavior b;
    public boolean c;
    
    public d(final Context context) {
        super(context, 2132083239);
    }
    
    public final void a(final float dimAmount) {
        final Window window = this.getWindow();
        if (window != null) {
            window.setDimAmount(dimAmount);
        }
    }
    
    public final void b(final d d) {
        this.c = true;
        d.c = true;
        d.show();
        this.cancel();
    }
    
    public final void cancel() {
        final BottomSheetBehavior b = this.b;
        if (b.z == 5) {
            super.cancel();
            return;
        }
        final advd a = this.a;
        if (a != null) {
            b.A(a);
        }
        this.b.I(5);
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
            b.G(true);
            this.b.I(4);
            this.b.H(0);
            final View viewById = this.findViewById(2131428832);
            if (viewById != null) {
                viewById.addOnLayoutChangeListener((View$OnLayoutChangeListener)new jcu(this, viewById, 4));
            }
        }
    }
    
    public final void setContentView(final View view) {
        final FrameLayout contentView = (FrameLayout)View.inflate(this.getContext(), 2131624384, (ViewGroup)null);
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)contentView.findViewById(2131428487);
        final FrameLayout frameLayout = (FrameLayout)coordinatorLayout.findViewById(2131428832);
        final BottomSheetBehavior b = new BottomSheetBehavior();
        this.b = b;
        final advd a = this.a;
        if (a != null) {
            b.A(a);
        }
        ((ael)frameLayout.getLayoutParams()).b((aej)this.b);
        frameLayout.addView(view);
        coordinatorLayout.findViewById(2131432170).setOnClickListener((View$OnClickListener)new a(this, 0));
        anc.N((View)frameLayout, new c(this));
        super.setContentView((View)contentView);
    }
    
    public final void show() {
        final Window window = this.getWindow();
        if (window != null) {
            window.setFlags(8, 8);
            final Optional l = lma.l(this.getContext());
            if (l.isPresent()) {
                window.getDecorView().setSystemUiVisibility(((Activity)l.get()).getWindow().getDecorView().getSystemUiVisibility());
                super.show();
                window.clearFlags(8);
                return;
            }
            super.show();
        }
    }
}
