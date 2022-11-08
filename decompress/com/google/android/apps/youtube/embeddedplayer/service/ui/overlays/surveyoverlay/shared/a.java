// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared;

import java.util.List;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

public final class a extends eny implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayClient");
    }
    
    public final void a() {
        this.qS(7, this.qQ());
    }
    
    public final void b() {
        this.qS(2, this.qQ());
    }
    
    public final void g(final f f) {
        final Parcel qq = this.qQ();
        eoa.j(qq, (IInterface)f);
        this.qS(1, qq);
    }
    
    public final void h(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(3, qq);
    }
    
    public final void i() {
        this.qS(5, this.qQ());
    }
    
    public final void j(final String s, final List list, final boolean b) {
        final Parcel qq = this.qQ();
        qq.writeString(s);
        qq.writeStringList(list);
        eoa.f(qq, b);
        this.qS(4, qq);
    }
    
    public final void k(final int n) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        this.qS(6, qq);
    }
}
