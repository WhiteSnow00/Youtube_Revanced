// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.Parcelable;
import android.graphics.Bitmap;
import android.net.Uri;

final class c implements tcc
{
    final e a;
    private final String b;
    
    public c(final e a, final String b) {
        this.a = a;
        tvb.o(b, (Object)"videoId cannot be null or empty");
        this.b = b;
    }
    
    public final /* bridge */ void b(final Object o, final Object o2) {
        final Uri uri = (Uri)o;
        final Bitmap bitmap = (Bitmap)o2;
        final e a = this.a;
        final Object f = a.f;
        final String b = this.b;
        final boolean e = a.e();
        final boolean d = a.d();
        final Object a2 = ((elx)f).a;
        if (a2 == null) {
            return;
        }
        try {
            final Parcel qw = ((enz)a2).qW();
            eob.h(qw, (Parcelable)bitmap);
            qw.writeString(b);
            eob.f(qw, e);
            eob.f(qw, d);
            ((enz)a2).qY(1, qw);
        }
        catch (final RemoteException ex) {}
    }
    
    public final /* bridge */ void sd(final Object o, final Exception ex) {
        final Uri uri = (Uri)o;
        ttr.d("Error loading DefaultThumbnailLoader", (Throwable)ex);
        this.a.c();
    }
}
