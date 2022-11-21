// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared;

import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.e;
import android.os.IInterface;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a;
import android.os.Handler;

public final class b extends eod implements c
{
    public final sks a;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.b b;
    private final Handler c;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayClient");
    }
    
    public b(final sks a, final Handler c) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayClient");
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public final void a() {
        final Handler c = this.c;
        final sks a = this.a;
        a.getClass();
        c.post((Runnable)new a(a, 15));
    }
    
    public final void b() {
        final Handler c = this.c;
        final sks a = this.a;
        a.getClass();
        c.post((Runnable)new a(a, 13));
    }
    
    public final void c() {
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.b b = this.b;
        if (b != null) {
            b.a = null;
            this.b = null;
        }
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        switch (int1) {
            default: {
                return false;
            }
            case 7: {
                this.a();
                break;
            }
            case 6: {
                int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.k(int1);
                break;
            }
            case 5: {
                this.i();
                break;
            }
            case 4: {
                final String string = parcel.readString();
                final ArrayList stringArrayList = parcel.createStringArrayList();
                final boolean k = eoe.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.j(string, stringArrayList, k);
                break;
            }
            case 3: {
                final boolean i = eoe.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.h(i);
                break;
            }
            case 2: {
                this.b();
                break;
            }
            case 1: {
                final IBinder strongBinder = parcel.readStrongBinder();
                f f;
                if (strongBinder == null) {
                    f = null;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayServiceListener");
                    if (queryLocalInterface instanceof f) {
                        f = (f)queryLocalInterface;
                    }
                    else {
                        f = new d(strongBinder);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.g(f);
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
    
    public final void g(final f f) {
        this.c.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.a(this, f, 6));
    }
    
    public final void h(final boolean b) {
        this.c.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a(this, b, 2));
    }
    
    public final void i() {
        final Handler c = this.c;
        final sks a = this.a;
        a.getClass();
        c.post((Runnable)new a(a, 14));
    }
    
    public final void j(final String s, final List list, final boolean b) {
        this.c.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.a(this, s, list, b, 0));
    }
    
    public final void k(final int n) {
        this.c.post((Runnable)new e(this, n, 4));
    }
}
