// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.command.androidshareintent;

import android.content.ComponentName;
import java.util.Locale;
import com.google.protos.youtube.api.innertube.AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint;
import com.google.protobuf.ExtensionRegistryLite;
import android.content.Intent;
import android.content.Context;

public class ShareLoggingBroadcastReceiver extends fcb
{
    public wyw a;
    
    public final void onReceive(final Context context, final Intent intent) {
        this.a(context);
        if (!intent.hasExtra("YTShare_Logging_Share_Intent_Endpoint_Byte_Array")) {
            return;
        }
        final byte[] byteArrayExtra = intent.getByteArrayExtra("YTShare_Logging_Share_Intent_Endpoint_Byte_Array");
        Object o = null;
        AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint = null;
        Label_0081: {
            if (byteArrayExtra != null) {
                try {
                    o = ahbh.parseFrom((ahbh)aiqj.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry());
                    androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint = (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint)((ahbc)o).rx((ahaq)AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.androidShareIntentEndpoint);
                    break Label_0081;
                }
                catch (final ahca ahca) {
                    ttr.c("ShareLoggingBroadcastReceiver", String.format(Locale.US, "Failed to parse command byte array ", (Object[])ahca.getStackTrace()));
                    return;
                }
            }
            o = null;
            androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint = null;
        }
        final ComponentName componentName = (ComponentName)intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        if (componentName != null && androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint != null && (androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.b & 0x4) != 0x0) {
            final wyt wyt = new wyt(xaa.c(134792));
            this.a.G(xaa.b(146176), wzr.b, (aiqj)o);
            this.a.l((wzz)wyt);
            final wyw a = this.a;
            final String packageName = componentName.getPackageName();
            final String className = componentName.getClassName();
            final StringBuilder sb = new StringBuilder();
            sb.append(packageName);
            sb.append("/");
            sb.append(className);
            final String string = sb.toString();
            final String f = androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.f;
            final ahaz builder = ((ahbh)alhi.a).createBuilder();
            final ahaz builder2 = ((ahbh)alhu.a).createBuilder();
            builder2.copyOnWrite();
            final alhu alhu = (alhu)builder2.instance;
            f.getClass();
            alhu.b |= 0x1;
            alhu.c = f;
            final alhu m = (alhu)builder2.build();
            builder.copyOnWrite();
            final alhi alhi = (alhi)builder.instance;
            m.getClass();
            alhi.M = m;
            alhi.d |= 0x1;
            final ahaz builder3 = ((ahbh)alho.a).createBuilder();
            builder3.copyOnWrite();
            final alho alho = (alho)builder3.instance;
            alho.b |= 0x1;
            alho.c = string;
            final alho j = (alho)builder3.build();
            builder.copyOnWrite();
            final alhi alhi2 = (alhi)builder.instance;
            j.getClass();
            alhi2.j = j;
            alhi2.b |= 0x20;
            a.J(3, (wzz)wyt, (alhi)builder.build());
        }
    }
}
