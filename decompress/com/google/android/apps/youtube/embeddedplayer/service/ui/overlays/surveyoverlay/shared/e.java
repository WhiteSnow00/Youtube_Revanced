// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.q;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.a;
import android.os.Bundle;
import android.os.Handler;

public final class e extends eod implements f
{
    public skr a;
    private final Handler b;
    
    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayServiceListener");
    }
    
    public e(final Handler b) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayServiceListener");
        this.b = b;
    }
    
    public final void a(final Bundle bundle) {
        this.b.post((Runnable)new a(this, bundle, 7));
    }
    
    public final void b(final int[] array) {
        this.b.post((Runnable)new a(this, array, 8));
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, int int2) {
        if (int1 != 1) {
            if (int1 != 2) {
                if (int1 != 3) {
                    return false;
                }
                final Bundle bundle = (Bundle)eoe.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a(bundle);
            }
            else {
                final int[] intArray = parcel.createIntArray();
                this.enforceNoDataAvail(parcel);
                this.b(intArray);
            }
        }
        else {
            int1 = parcel.readInt();
            int2 = parcel.readInt();
            this.enforceNoDataAvail(parcel);
            this.g(int1, int2);
        }
        parcel2.writeNoException();
        return true;
    }
    
    public final void g(final int n, final int n2) {
        this.b.post((Runnable)new q(this, n, n2, 6));
    }
}
