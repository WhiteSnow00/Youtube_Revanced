// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.sdk.qrcode;

import android.widget.Toast;
import com.google.cardboard.sdk.R$string;
import com.google.android.gms.vision.barcode.Barcode;
import android.content.Context;

public class QrCodeContentProcessor$ProcessAndSaveQrCodeTask extends AsyncTask
{
    private final Context context;
    final /* synthetic */ QrCodeContentProcessor this$0;
    
    public QrCodeContentProcessor$ProcessAndSaveQrCodeTask(final QrCodeContentProcessor this$0, final Context context) {
        this.this$0 = this$0;
        this.context = context;
    }
    
    protected CardboardParamsUtils$UriToParamsStatus doInBackground(final Barcode barcode) {
        return QrCodeContentProcessor.-$$Nest$smgetParamsFromQrCode(barcode, new UrlFactory());
    }
    
    protected void onPostExecute(final CardboardParamsUtils$UriToParamsStatus cardboardParamsUtils$UriToParamsStatus) {
        final int statusCode = cardboardParamsUtils$UriToParamsStatus.statusCode;
        boolean writeDeviceParams = false;
        if (statusCode == 1) {
            final int a = QrCodeContentProcessor.a;
            final int invalid_qr_code = R$string.invalid_qr_code;
            Toast.makeText(this.context, R$string.invalid_qr_code, 1).show();
        }
        else if (statusCode == 2) {
            final int a2 = QrCodeContentProcessor.a;
            final int connection_error = R$string.connection_error;
            Toast.makeText(this.context, R$string.connection_error, 1).show();
        }
        else {
            final byte[] params = cardboardParamsUtils$UriToParamsStatus.params;
            if (params != null) {
                writeDeviceParams = CardboardParamsUtils.writeDeviceParams(params, this.context);
                final int a3 = QrCodeContentProcessor.a;
            }
        }
        QrCodeContentProcessor.-$$Nest$fgetlistener(this.this$0).onQrCodeSaved(writeDeviceParams);
    }
}
