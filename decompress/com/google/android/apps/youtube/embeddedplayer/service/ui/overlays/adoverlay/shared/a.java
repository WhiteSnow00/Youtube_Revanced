// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.FancyDismissibleDialogRendererWrapper;
import android.os.Parcelable;
import android.graphics.Bitmap;
import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;

public final class a extends enz implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
    }
    
    public final void a(final int n, final int n2, final int n3) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        qw.writeInt(n2);
        qw.writeInt(n3);
        this.qY(5, qw);
    }
    
    public final void b(final int n) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        this.qY(11, qw);
    }
    
    public final void g(final f f) {
        final Parcel qw = this.qW();
        eob.j(qw, (IInterface)f);
        this.qY(1, qw);
    }
    
    public final void h(final CharSequence charSequence) {
        final Parcel qw = this.qW();
        eob.g(qw, charSequence);
        this.qY(4, qw);
    }
    
    public final void i(final Bitmap bitmap) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)bitmap);
        this.qY(6, qw);
    }
    
    public final void j(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(7, qw);
    }
    
    public final void k(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(3, qw);
    }
    
    public final void l(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(10, qw);
    }
    
    public final void m(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(9, qw);
    }
    
    public final void n(final boolean b) {
        final Parcel qw = this.qW();
        eob.f(qw, b);
        this.qY(2, qw);
    }
    
    public final void o(final FancyDismissibleDialogRendererWrapper fancyDismissibleDialogRendererWrapper) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)fancyDismissibleDialogRendererWrapper);
        this.qY(12, qw);
    }
    
    public final void p(final CharSequence charSequence) {
        final Parcel qw = this.qW();
        eob.g(qw, charSequence);
        this.qY(8, qw);
    }
}
