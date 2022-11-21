// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared;

import java.util.List;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import android.os.Parcel;
import android.os.IBinder;

public final class a extends eoc implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.ISubtitlesOverlayClient");
    }
    
    public final void a() {
        this.qX(2, this.qV());
    }
    
    public final void b() {
        this.qX(3, this.qV());
    }
    
    public final void g(final float n) {
        final Parcel qv = this.qV();
        qv.writeFloat(n);
        this.qX(4, qv);
    }
    
    public final void h(final int n, final int n2) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        qv.writeInt(0);
        this.qX(6, qv);
    }
    
    public final void i(final SubtitlesStyle subtitlesStyle) {
        final Parcel qv = this.qV();
        eoe.h(qv, (Parcelable)subtitlesStyle);
        this.qX(5, qv);
    }
    
    public final void j(final List list) {
        final Parcel qv = this.qV();
        qv.writeTypedList(list);
        this.qX(1, qv);
    }
}
