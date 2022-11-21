// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared;

import java.util.List;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

public final class a extends eoc implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayClient");
    }
    
    public final void a() {
        this.qX(7, this.qV());
    }
    
    public final void b() {
        this.qX(2, this.qV());
    }
    
    public final void g(final f f) {
        final Parcel qv = this.qV();
        eoe.j(qv, (IInterface)f);
        this.qX(1, qv);
    }
    
    public final void h(final boolean b) {
        final Parcel qv = this.qV();
        eoe.f(qv, b);
        this.qX(3, qv);
    }
    
    public final void i() {
        this.qX(5, this.qV());
    }
    
    public final void j(final String s, final List list, final boolean b) {
        final Parcel qv = this.qV();
        qv.writeString(s);
        qv.writeStringList(list);
        eoe.f(qv, b);
        this.qX(4, qv);
    }
    
    public final void k(final int n) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        this.qX(6, qv);
    }
}
