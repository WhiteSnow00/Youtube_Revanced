// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.q;
import java.util.ArrayList;
import java.util.List;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a;
import android.os.Handler;

public final class b extends eod implements c
{
    public final abeh a;
    private final Handler b;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.ISubtitlesOverlayClient");
    }
    
    public b(final abeh a, final Handler b) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.ISubtitlesOverlayClient");
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final void a() {
        this.b.post((Runnable)new a(this, 11));
    }
    
    public final void b() {
        this.b.post((Runnable)new a(this, 12));
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, int int2) {
        switch (int1) {
            default: {
                return false;
            }
            case 6: {
                int1 = parcel.readInt();
                int2 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.h(int1, int2);
                break;
            }
            case 5: {
                final SubtitlesStyle subtitlesStyle = (SubtitlesStyle)eoe.a(parcel, SubtitlesStyle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.i(subtitlesStyle);
                break;
            }
            case 4: {
                final float float1 = parcel.readFloat();
                this.enforceNoDataAvail(parcel);
                this.g(float1);
                break;
            }
            case 3: {
                this.b();
                break;
            }
            case 2: {
                this.a();
                break;
            }
            case 1: {
                final ArrayList typedArrayList = parcel.createTypedArrayList(SubtitleWindowSnapshot.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.j(typedArrayList);
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
    
    public final void g(final float n) {
        this.b.post((Runnable)new hrk(this, n, 2));
    }
    
    public final void h(final int n, final int n2) {
        this.b.post((Runnable)new q(this, n, n2, 5));
    }
    
    public final void i(final SubtitlesStyle subtitlesStyle) {
        this.b.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.a(this, subtitlesStyle, 5));
    }
    
    public final void j(final List list) {
        this.b.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.a(this, list, 4));
    }
}
