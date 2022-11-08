// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared;

import java.util.List;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import android.os.Parcel;
import android.os.IBinder;

public final class a extends eny implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.ISubtitlesOverlayClient");
    }
    
    public final void a() {
        this.qS(2, this.qQ());
    }
    
    public final void b() {
        this.qS(3, this.qQ());
    }
    
    public final void g(final float n) {
        final Parcel qq = this.qQ();
        qq.writeFloat(n);
        this.qS(4, qq);
    }
    
    public final void h(final int n, final int n2) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        qq.writeInt(0);
        this.qS(6, qq);
    }
    
    public final void i(final SubtitlesStyle subtitlesStyle) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)subtitlesStyle);
        this.qS(5, qq);
    }
    
    public final void j(final List list) {
        final Parcel qq = this.qQ();
        qq.writeTypedList(list);
        this.qS(1, qq);
    }
}
