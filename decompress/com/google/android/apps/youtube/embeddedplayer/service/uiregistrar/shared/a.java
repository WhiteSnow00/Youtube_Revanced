// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import android.os.IBinder;

public final class a extends eny implements c
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.ISelectableItemRegistryService");
    }
    
    public final void a(final SelectableItemKey selectableItemKey) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)selectableItemKey);
        this.qS(1, qq);
    }
}
