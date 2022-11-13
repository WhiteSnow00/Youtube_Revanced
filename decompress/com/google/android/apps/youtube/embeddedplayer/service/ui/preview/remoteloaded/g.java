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

public final class g extends abbk
{
    public TextView a;
    public TextView b;
    public f c;
    public asir d;
    public c e;
    public asir f;
    public boolean g;
    private FrameLayout h;
    private boolean i;
    private final View$OnLayoutChangeListener j;
    
    public g(final Context context) {
        super(context);
        this.g = true;
        this.j = (View$OnLayoutChangeListener)new jcy(this, 13);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final /* bridge */ View c(final Context context) {
        this.h = new FrameLayout(context);
        final LayoutInflater from = LayoutInflater.from(context);
        Label_0082: {
            if (this.g) {
                try {
                    from.inflate(2131625099, (ViewGroup)this.h);
                    break Label_0082;
                }
                catch (final RuntimeException ex) {
                    com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c.a().c(com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.b, "Unable to inflate LazyPreviewThumbnailOverlay", (Throwable)ex);
                    afse.o("Unable to inflate LazyPreviewThumbnailOverlay: ".concat(ex.toString()));
                    final FrameLayout frameLayout = this.h;
                    return (View)frameLayout;
                }
            }
            from.inflate(2131625099, (ViewGroup)this.h);
        }
        this.i = true;
        this.a = (TextView)this.h.findViewById(2131428843);
        this.b = (TextView)this.h.findViewById(2131428842);
        final ImageView imageView = (ImageView)this.h.findViewById(2131428838);
        final Animation loadAnimation = AnimationUtils.loadAnimation(context, 2130772076);
        final f f = new f(imageView, loadAnimation);
        loadAnimation.setAnimationListener((Animation$AnimationListener)f);
        this.c = f;
        this.h.addOnLayoutChangeListener(this.j);
        this.mk();
        final FrameLayout frameLayout = this.h;
        return (View)frameLayout;
    }
    
    public final void e(final Context context, final View view) {
        final FrameLayout frameLayout = (FrameLayout)view;
        if (this.mn()) {
            this.a.setText(this.e.b);
            this.b.setText(this.e.c);
            final Bitmap d = this.e.d;
            if (d != null) {
                this.c.a.setImageBitmap(d);
            }
            if (this.ab(2)) {
                this.a.setVisibility(0);
                this.b.setVisibility(0);
            }
            if (this.ab(1)) {
                final f c = this.c;
                c.a.clearAnimation();
                c.a.setAlpha(c.c);
                c.a.setVisibility(0);
            }
        }
    }
    
    public final void m() {
        super.aa();
        this.Z(2);
    }
    
    public final abbn mj(final Context context) {
        final abbn mj = super.mj(context);
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
            final f c = this.c;
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
    
    public final boolean oV() {
        return this.e != null;
    }
    
    public final abbp ox() {
        return super.ox();
    }
}
