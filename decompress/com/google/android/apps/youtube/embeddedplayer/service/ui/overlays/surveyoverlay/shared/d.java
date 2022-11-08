// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

public final class d extends eny implements f
{
    public d(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayServiceListener");
    }
    
    public final void a(final Bundle bundle) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)bundle);
        this.qS(3, qq);
    }
    
    public final void b(final int[] array) {
        final Parcel qq = this.qQ();
        qq.writeIntArray(array);
        this.qS(2, qq);
    }
    
    public final void g(final int n, final int n2) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        qq.writeInt(n2);
        this.qS(1, qq);
    }
}
