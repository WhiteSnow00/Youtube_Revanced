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

public final class a extends eoc implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
    }
    
    public final void a(final int n, final int n2, final int n3) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        qv.writeInt(n2);
        qv.writeInt(n3);
        this.qX(5, qv);
    }
    
    public final void b(final int n) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        this.qX(11, qv);
    }
    
    public final void g(final f f) {
        final Parcel qv = this.qV();
        eoe.j(qv, (IInterface)f);
        this.qX(1, qv);
    }
    
    public final void h(final CharSequence charSequence) {
        final Parcel qv = this.qV();
        eoe.g(qv, charSequence);
        this.qX(4, qv);
    }
    
    public final void i(final Bitmap bitmap) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)bitmap);
        this.qX(6, qv);
    }
    
    public final void j(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(7, qv);
    }
    
    public final void k(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(3, qv);
    }
    
    public final void l(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(10, qv);
    }
    
    public final void m(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(9, qv);
    }
    
    public final void n(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(2, qv);
    }
    
    public final void o(final FancyDismissibleDialogRendererWrapper fancyDismissibleDialogRendererWrapper) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)fancyDismissibleDialogRendererWrapper);
        this.qX(12, qv);
    }
    
    public final void p(final CharSequence charSequence) {
        final Parcel qv = this.qV();
        eoe.g(qv, charSequence);
        this.qX(8, qv);
    }
}
