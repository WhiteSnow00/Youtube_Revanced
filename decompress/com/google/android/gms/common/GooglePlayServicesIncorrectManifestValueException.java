// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common;

public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException
{
    public GooglePlayServicesIncorrectManifestValueException(final int n) {
        final int c = mor.c;
        final StringBuilder sb = new StringBuilder("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
        sb.append(c);
        sb.append(" but found ");
        sb.append(n);
        sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(sb.toString());
    }
}
