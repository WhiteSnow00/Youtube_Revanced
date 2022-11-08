// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.e;
import android.os.Handler;

public final class h extends enz implements i
{
    public final lzi a;
    private final Handler b;
    
    public h() {
        super("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarService");
    }
    
    public h(final Handler b, final lzi a, final byte[] array, final byte[] array2) {
        super("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarService");
        this.b = b;
        this.a = a;
    }
    
    public final void a(final int n) {
        this.b.post((Runnable)new e(this, n, 6));
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        if (int1 == 1) {
            int1 = parcel.readInt();
            this.enforceNoDataAvail(parcel);
            this.a(int1);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
