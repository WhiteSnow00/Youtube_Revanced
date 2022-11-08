// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared;

import android.os.IInterface;
import android.os.Parcelable;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.IBinder;

public final class a extends eny implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayClient");
    }
    
    public final int a() {
        final Parcel qr = this.qR(6, this.qQ());
        final int int1 = qr.readInt();
        qr.recycle();
        return int1;
    }
    
    public final int b() {
        final Parcel qr = this.qR(5, this.qQ());
        final int int1 = qr.readInt();
        qr.recycle();
        return int1;
    }
    
    public final void g() {
        this.qS(4, this.qQ());
    }
    
    public final void h(final Bitmap bitmap) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)bitmap);
        this.qS(7, qq);
    }
    
    public final void i(final f f) {
        final Parcel qq = this.qQ();
        eoa.j(qq, (IInterface)f);
        this.qS(1, qq);
    }
    
    public final void j(final CharSequence charSequence, final CharSequence charSequence2, final boolean b, final CharSequence charSequence3, final int n, final CharSequence charSequence4, final int n2) {
        final Parcel qq = this.qQ();
        eoa.g(qq, charSequence);
        eoa.g(qq, charSequence2);
        eoa.f(qq, b);
        eoa.g(qq, charSequence3);
        qq.writeInt(n);
        eoa.g(qq, charSequence4);
        qq.writeInt(n2);
        this.qS(2, qq);
    }
    
    public final void k(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        final Parcel qq = this.qQ();
        eoa.g(qq, charSequence);
        eoa.g(qq, charSequence2);
        eoa.g(qq, charSequence3);
        this.qS(3, qq);
    }
}
