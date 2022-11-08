// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

public final class d extends eny implements f
{
    public d(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarClient");
    }
    
    public final void a(final i i) {
        final Parcel qq = this.qQ();
        eoa.j(qq, (IInterface)i);
        this.qS(1, qq);
    }
    
    public final void b(final int n, final boolean b) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        eoa.f(qq, b);
        this.qS(2, qq);
    }
}
