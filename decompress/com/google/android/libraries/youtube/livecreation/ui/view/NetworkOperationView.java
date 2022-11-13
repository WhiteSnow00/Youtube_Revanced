// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.view;

import android.os.Parcelable;
import android.view.View$OnClickListener;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ProgressBar;
import android.widget.Button;
import android.widget.TextView;
import android.widget.FrameLayout;

public class NetworkOperationView extends FrameLayout
{
    public TextView a;
    public TextView b;
    public int c;
    private Button d;
    private Button e;
    private ProgressBar f;
    private WaitingIndicatorView g;
    private boolean h;
    
    public NetworkOperationView(final Context context) {
        super(context);
        this.c = -1;
        this.f(context);
    }
    
    public NetworkOperationView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = -1;
        this.f(context);
    }
    
    public NetworkOperationView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = -1;
        this.f(context);
    }
    
    private final void e() {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.b.setVisibility(8);
        this.b.setText((CharSequence)"");
    }
    
    private final void f(final Context context) {
        inflate(context, 2131624634, (ViewGroup)this);
        this.d = (Button)this.findViewById(2131427462);
        this.e = (Button)this.findViewById(2131427461);
        this.a = (TextView)this.findViewById(2131428917);
        this.f = (ProgressBar)this.findViewById(2131431627);
        this.b = (TextView)this.findViewById(2131430664);
        this.g = (WaitingIndicatorView)this.findViewById(2131430042);
        this.a(0);
    }
    
    private final void g() {
        if (this.h) {
            this.f.setVisibility(8);
            this.g.setVisibility(0);
            this.g.a();
        }
        else {
            this.g.d();
            this.g.setVisibility(8);
            this.f.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.b.getText())) {
            this.b.setVisibility(0);
        }
    }
    
    public final void a(final int c) {
        this.c = c;
        if (c == 0) {
            this.g();
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.a.setVisibility(8);
            return;
        }
        if (c == 1) {
            this.e();
            this.d.setVisibility(0);
            this.e.setVisibility(0);
            this.a.setVisibility(0);
            return;
        }
        if (c == 2) {
            this.e();
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.a.setVisibility(8);
            return;
        }
        if (c == 4) {
            this.g();
            this.b.setVisibility(8);
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.a.setVisibility(0);
            return;
        }
        final StringBuilder sb = new StringBuilder("Unknown currentMode: ");
        sb.append(c);
        throw new IllegalStateException(sb.toString());
    }
    
    public final void b(final View$OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }
    
    public final void c(final View$OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }
    
    public final void d() {
        this.h = true;
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof NetworkOperationView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final NetworkOperationView$SavedState networkOperationView$SavedState = (NetworkOperationView$SavedState)parcelable;
        super.onRestoreInstanceState(networkOperationView$SavedState.getSuperState());
        this.a(networkOperationView$SavedState.a);
    }
    
    protected final Parcelable onSaveInstanceState() {
        final NetworkOperationView$SavedState networkOperationView$SavedState = new NetworkOperationView$SavedState(super.onSaveInstanceState());
        networkOperationView$SavedState.a = this.c;
        return (Parcelable)networkOperationView$SavedState;
    }
}
