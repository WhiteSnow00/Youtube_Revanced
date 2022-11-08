// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.Parcelable;
import android.graphics.Bitmap;
import android.net.Uri;

final class c implements szx
{
    final /* synthetic */ e a;
    private final String b;
    
    public c(final e a, final String b) {
        this.a = a;
        tsx.o(b, (Object)"videoId cannot be null or empty");
        this.b = b;
    }
}
