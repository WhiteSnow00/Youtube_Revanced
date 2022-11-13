// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.user.profile.photopicker.common.view.error;

import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.v;
import android.view.View;
import android.view.ViewGroup;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class FullscreenErrorView extends quz
{
    public pba d;
    public MaterialTextView e;
    public MaterialButton f;
    public MaterialButton g;
    public pja h;
    private AppCompatImageView j;
    
    public FullscreenErrorView(Context context, final AttributeSet set) {
        super(context, set);
        if (!super.i) {
            for (context = this.getContext(); !(context instanceof arkk) && context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {}
            ((arkk)context).f().s(this);
        }
        if (!arrm.i()) {
            inflate(this.getContext(), 2131624995, (ViewGroup)this);
        }
        else {
            inflate(this.getContext(), 2131624996, (ViewGroup)this);
        }
        this.j = (AppCompatImageView)this.findViewById(2131430331);
        this.e = (MaterialTextView)this.findViewById(2131430332);
        this.f = (MaterialButton)this.findViewById(2131430349);
        ((pbg)this.h.b).a(110128).a((View)this);
        ((pbg)this.h.b).a(97066).a((View)this.f);
        if (!arrm.i()) {
            (this.g = (MaterialButton)this.findViewById(2131430351)).setOnClickListener((View$OnClickListener)new v(this, 18));
            ((pbg)this.h.b).a(104981).a((View)this.g);
        }
    }
    
    public final void d(final int n) {
        final Drawable b = fc.b(this.getContext(), n);
        aiq.f(b, this.getResources().getColor(2131100810));
        this.j.setImageDrawable(b);
    }
    
    public final void e(final View$OnClickListener view$OnClickListener) {
        this.f.setOnClickListener((View$OnClickListener)new qvy(this, view$OnClickListener, 1));
    }
    
    public final void f() {
        this.d(2131232516);
        this.e.setText(2132019046);
        this.f.setVisibility(8);
        if (!arrm.i()) {
            this.g.setVisibility(8);
        }
    }
    
    public final void g() {
        this.d(2131232516);
        this.e.setText(2132019046);
        this.f.setVisibility(0);
        if (!arrm.i()) {
            this.g.setVisibility(8);
        }
    }
}
