// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.util;

import android.nfc.NfcAdapter$OnNdefPushCompleteCallback;
import android.nfc.NfcAdapter$CreateNdefMessageCallback;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.Context;
import java.util.concurrent.Executor;
import android.nfc.NfcAdapter;
import android.app.Activity;

public class NfcHelper implements aua
{
    private final Activity a;
    private final NfcAdapter b;
    private final Executor c;
    private final atke d;
    
    public NfcHelper(final Activity a, final Executor c, final atke d) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = NfcAdapter.getDefaultAdapter((Context)a);
        final IntentFilter intentFilter = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
        intentFilter.addAction("android.nfc.action.TECH_DISCOVERED");
        intentFilter.addAction("android.nfc.action.TAG_DISCOVERED");
        final Intent intent = new Intent("android.nfc.action.NDEF_DISCOVERED");
        intent.setPackage(a.getPackageName());
        PendingIntent.getActivity((Context)a, 0, intent, 67108864);
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
        if (this.b != null) {
            final glu glu = new glu(this.d, this.c);
            this.b.setNdefPushMessageCallback((NfcAdapter$CreateNdefMessageCallback)glu, this.a, new Activity[0]);
            this.b.setOnNdefPushCompleteCallback((NfcAdapter$OnNdefPushCompleteCallback)glu, this.a, new Activity[0]);
        }
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
