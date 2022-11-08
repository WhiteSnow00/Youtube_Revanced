// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.directboot;

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public final class DirectBootHelperService extends Service
{
    private DirectBootHelperService() {
    }
    
    public final IBinder onBind(final Intent intent) {
        return null;
    }
}
