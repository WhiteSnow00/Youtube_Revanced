// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared;

import java.util.Map;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.RemoteEmbedExceptionData;
import android.os.IBinder;

public final class a extends enz implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.IEmbedsErrorLoggingService");
    }
    
    public final void a(final int n, final int n2, final RemoteEmbedExceptionData remoteEmbedExceptionData, final String s) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        qw.writeInt(n2);
        eob.h(qw, (Parcelable)remoteEmbedExceptionData);
        qw.writeString(s);
        this.qZ(3, qw);
    }
    
    public final void b(final int n, final int n2, final RemoteEmbedExceptionData remoteEmbedExceptionData, final String s, final Map map) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        qw.writeInt(n2);
        eob.h(qw, (Parcelable)remoteEmbedExceptionData);
        qw.writeString(s);
        qw.writeMap(map);
        this.qZ(4, qw);
    }
    
    public final void c(final RemoteEmbedExceptionData remoteEmbedExceptionData) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)remoteEmbedExceptionData);
        this.qZ(1, qw);
    }
    
    public final void d(final int n, final int n2, final String s) {
        throw null;
    }
    
    public final void e(final int n, final int n2, final String s, final String s2) {
        final Parcel qw = this.qW();
        qw.writeInt(n);
        qw.writeInt(n2);
        qw.writeString(s);
        qw.writeString((String)null);
        this.qZ(5, qw);
    }
}
