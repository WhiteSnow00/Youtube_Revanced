// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.missingsplits;

import android.content.Context;
import android.app.AlertDialog$Builder;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.content.Intent;
import android.content.DialogInterface$OnClickListener;
import android.app.Activity;

public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface$OnClickListener
{
    private final String a() {
        return this.getApplicationInfo().loadLabel(this.getPackageManager()).toString();
    }
    
    private final void b(final String s) {
        final StringBuilder sb = new StringBuilder("market://details?id=");
        sb.append(s);
        sb.append("&referrer=utm_source%3Dplay.core.missingsplits");
        final Intent setPackage = new Intent("android.intent.action.VIEW").setData(Uri.parse(sb.toString())).setPackage("com.android.vending");
        try {
            this.startActivity(setPackage);
        }
        catch (final ActivityNotFoundException ex) {
            new adet(this.getClass().getName()).k((Throwable)ex, "Couldn't start missing splits activity for %s", new Object[] { s });
        }
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        if (n == -1) {
            this.b(this.getPackageName());
        }
        this.finish();
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final AlertDialog$Builder setNeutralButton = new AlertDialog$Builder((Context)this).setTitle((CharSequence)"Installation failed").setCancelable(false).setNeutralButton((CharSequence)"Close", (DialogInterface$OnClickListener)this);
        if (aeeo.a((Context)this)) {
            final String a = this.a();
            final StringBuilder sb = new StringBuilder("The app ");
            sb.append(a);
            sb.append(" is missing required components and must be reinstalled from the Google Play Store.");
            setNeutralButton.setMessage((CharSequence)sb.toString()).setPositiveButton((CharSequence)"Reinstall", (DialogInterface$OnClickListener)this);
        }
        else {
            final String a2 = this.a();
            final StringBuilder sb2 = new StringBuilder("The app ");
            sb2.append(a2);
            sb2.append(" is missing required components and must be reinstalled from an official store.");
            setNeutralButton.setMessage((CharSequence)sb2.toString());
        }
        setNeutralButton.create().show();
    }
}
