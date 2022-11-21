// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.Parcelable;
import android.graphics.Bitmap;
import android.net.Uri;

final class c implements tdg
{
    final e a;
    private final String b;
    
    public c(final e a, final String b) {
        this.a = a;
        twd.o(b, (Object)"videoId cannot be null or empty");
        this.b = b;
    }
    
    public final /* bridge */ void c(final Object o, final Exception ex) {
        final Uri uri = (Uri)o;
        tut.d("Error loading DefaultThumbnailLoader", (Throwable)ex);
        this.a.c();
    }
    
    public final /* bridge */ void d(final Object o, final Object o2) {
        final Uri uri = (Uri)o;
        final Bitmap bitmap = (Bitmap)o2;
        final e a = this.a;
        final Object f = a.f;
        final String b = this.b;
        final boolean e = a.e();
        final boolean d = a.d();
        final Object a2 = ((ema)f).a;
        if (a2 == null) {
            return;
        }
        try {
            final Parcel qv = ((eoc)a2).qV();
            eoe.h(qv, (Parcelable)bitmap);
            qv.writeString(b);
            eoe.f(qv, e);
            eoe.f(qv, d);
            ((eoc)a2).qX(1, qv);
        }
        catch (final RemoteException ex) {}
    }
}
