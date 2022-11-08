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

public final class a extends eny implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
    }
    
    public final void a(final int n, final int n2, final int n3) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        qq.writeInt(n2);
        qq.writeInt(n3);
        this.qS(5, qq);
    }
    
    public final void b(final int n) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        this.qS(11, qq);
    }
    
    public final void g(final f f) {
        final Parcel qq = this.qQ();
        eoa.j(qq, (IInterface)f);
        this.qS(1, qq);
    }
    
    public final void h(final CharSequence charSequence) {
        final Parcel qq = this.qQ();
        eoa.g(qq, charSequence);
        this.qS(4, qq);
    }
    
    public final void i(final Bitmap bitmap) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)bitmap);
        this.qS(6, qq);
    }
    
    public final void j(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(7, qq);
    }
    
    public final void k(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(3, qq);
    }
    
    public final void l(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(10, qq);
    }
    
    public final void m(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(9, qq);
    }
    
    public final void n(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(2, qq);
    }
    
    public final void o(final FancyDismissibleDialogRendererWrapper fancyDismissibleDialogRendererWrapper) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)fancyDismissibleDialogRendererWrapper);
        this.qS(12, qq);
    }
    
    public final void p(final CharSequence charSequence) {
        final Parcel qq = this.qQ();
        eoa.g(qq, charSequence);
        this.qS(8, qq);
    }
}
