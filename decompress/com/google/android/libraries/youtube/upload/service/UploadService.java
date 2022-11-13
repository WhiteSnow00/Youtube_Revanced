// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.upload.service;

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public class UploadService extends Service
{
    public boolean a;
    private final admn b;
    
    public UploadService() {
        this.b = new admn(this);
        this.a = false;
    }
    
    public final IBinder onBind(final Intent intent) {
        return (IBinder)this.b;
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        return 1;
    }
}
