// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import android.os.Parcel;

public abstract class b extends enz implements c
{
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.ISelectableItemRegistryService");
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final SelectableItemKey selectableItemKey = (SelectableItemKey)eoa.a(parcel, SelectableItemKey.CREATOR);
            this.enforceNoDataAvail(parcel);
            this.a(selectableItemKey);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
