// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.s;
import java.util.ArrayList;
import java.util.List;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a;
import android.os.Handler;

public final class b extends enz implements c
{
    public final abbh a;
    private final Handler b;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.ISubtitlesOverlayClient");
    }
    
    public b(final abbh a, final Handler b) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.ISubtitlesOverlayClient");
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final void a() {
        this.b.post((Runnable)new a(this, 15));
    }
    
    public final void b() {
        this.b.post((Runnable)new a(this, 16));
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, int int2) {
        switch (int1) {
            default: {
                return false;
            }
            case 6: {
                int2 = parcel.readInt();
                int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.h(int2, int1);
                break;
            }
            case 5: {
                final SubtitlesStyle subtitlesStyle = (SubtitlesStyle)eoa.a(parcel, SubtitlesStyle.CREATOR);
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
        this.b.post((Runnable)new hqh(this, n, 2));
    }
    
    public final void h(final int n, final int n2) {
        this.b.post((Runnable)new s(this, n, n2, 5));
    }
    
    public final void i(final SubtitlesStyle subtitlesStyle) {
        this.b.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a(this, subtitlesStyle, 3));
    }
    
    public final void j(final List list) {
        this.b.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a(this, list, 2));
    }
}
