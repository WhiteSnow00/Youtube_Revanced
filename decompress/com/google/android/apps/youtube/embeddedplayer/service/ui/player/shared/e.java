// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared;

import android.os.Parcel;
import android.os.Handler;

public final class e extends eod implements f
{
    private final Handler a;
    private final Runnable b;
    
    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiServiceListener");
    }
    
    public e(final Handler a, final Runnable b) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiServiceListener");
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        this.a.post(this.b);
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            this.a();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
