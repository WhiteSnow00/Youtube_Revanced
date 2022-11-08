// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.Parcel;
import android.os.IBinder;

public final class g extends eny implements i
{
    public g(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarService");
    }
    
    public final void a(final int n) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        this.qS(1, qq);
    }
}
