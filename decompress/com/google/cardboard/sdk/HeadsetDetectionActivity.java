// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.sdk;

import android.os.Bundle;
import android.content.Context;
import android.widget.Toast;
import com.google.cardboard.sdk.qrcode.CardboardParamsUtils;
import android.content.Intent;
import android.net.Uri$Builder;
import android.net.Uri;

public class HeadsetDetectionActivity extends fa
{
    private static final String URI_HOST_LEGACY_CARDBOARD = "v1.0.0";
    private static final Uri URI_ORIGINAL_CARDBOARD_NFC;
    private static final String URI_SCHEME_LEGACY_CARDBOARD = "cardboard";
    
    static {
        URI_ORIGINAL_CARDBOARD_NFC = new Uri$Builder().scheme("cardboard").authority("v1.0.0").build();
    }
    
    private void processStartupIntent(final Intent intent) {
        if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction()) && intent.getData() != null) {
            if (HeadsetDetectionActivity.URI_ORIGINAL_CARDBOARD_NFC.equals((Object)intent.getData())) {
                CardboardParamsUtils.saveCardboardV1DeviceParams(this.getApplicationContext());
            }
            Toast.makeText((Context)this, R$string.viewer_detected, 0).show();
        }
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (this.getIntent() != null) {
            this.processStartupIntent(this.getIntent());
        }
        this.finish();
    }
}
