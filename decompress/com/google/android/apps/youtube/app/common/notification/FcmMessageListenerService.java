// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.notification;

import java.util.Iterator;
import android.app.Application;
import android.content.Context;
import com.google.protobuf.ExtensionRegistryLite;
import android.util.Base64;
import android.text.TextUtils;
import java.util.Map;
import android.os.Bundle;
import com.google.firebase.messaging.RemoteMessage;

public class FcmMessageListenerService extends fku
{
    public arkg a;
    public atke b;
    public atke c;
    public arwh d;
    
    @Override
    public final void a(RemoteMessage ahca) {
        final Application application = this.getApplication();
        zqz.c(this.b, "GCM_DATA_RECEIVED", this.d);
        final Bundle bundle = new Bundle();
        if (((RemoteMessage)ahca).b == null) {
            final Bundle a = ((RemoteMessage)ahca).a;
            final abh b = new abh();
            for (final String s : a.keySet()) {
                final Object value = a.get(s);
                if (value instanceof String) {
                    final String s2 = (String)value;
                    if (s.startsWith("google.") || s.startsWith("gcm.") || s.equals("from") || s.equals("message_type") || s.equals("collapse_key")) {
                        continue;
                    }
                    b.put((Object)s, (Object)s2);
                }
            }
            ((RemoteMessage)ahca).b = b;
        }
        for (final Map.Entry<String, V> entry : ((RemoteMessage)ahca).b.entrySet()) {
            bundle.putString((String)entry.getKey(), (String)entry.getValue());
        }
        final String string = ((RemoteMessage)ahca).a.getString("from");
        if (string != null) {
            bundle.putString("from", string);
        }
        final ktn ktn = (ktn)this.a.a();
        final String string2 = bundle.getString("from");
        final boolean empty = TextUtils.isEmpty((CharSequence)string2);
        final aljn aljn = null;
        String s3 = null;
        Label_0319: {
            if (!empty && !TextUtils.isEmpty((CharSequence)string2)) {
                s3 = string2;
                if (string2.startsWith("/topic")) {
                    break Label_0319;
                }
            }
            s3 = null;
        }
        final String string3 = bundle.getString("r");
        anqw anqw = null;
        Label_0397: {
            if (!TextUtils.isEmpty((CharSequence)string3)) {
                try {
                    try {
                        ahca = (ahca)(Object)Base64.decode(string3, 0);
                    }
                    catch (final ahca ahca) {}
                }
                catch (final IllegalArgumentException ex) {
                    ahca = (ahca)(Object)Base64.decode(string3, 8);
                }
                try {
                    anqw = (anqw)ahbh.parseFrom((ahbh)anqw.a, (byte[])(Object)ahca, ExtensionRegistryLite.getGeneratedRegistry());
                    break Label_0397;
                }
                catch (final IllegalArgumentException ex2) {}
                ttr.n("Could not convert base64-encoded byte stream into PushNotificationSupportedRenderers proto: ", (Throwable)ahca);
            }
            anqw = null;
        }
        aljn aljn2 = aljn;
        if (anqw != null) {
            aljn2 = aljn;
            if (anqw.b == 109268428) {
                aljm aljm;
                if ((aljm = ((aljo)anqw.c).c) == null) {
                    aljm = aljm.a;
                }
                aljn2 = aljn;
                if ((aljm.b & 0x2) != 0x0 && (aljn2 = aljm.d) == null) {
                    aljn2 = aljn.a;
                }
            }
        }
        if (!TextUtils.isEmpty((CharSequence)s3)) {
            zqz.c((atke)ktn.b, "GCM_TOPIC_RECEIVED", (arwh)ktn.c);
            ((zsq)ktn.i).d(s3, aljn2);
            return;
        }
        ktn.m((Context)application, anqw);
    }
    
    @Override
    public final void b(final String s) {
        ((zsg)this.c.a()).h(s);
    }
}
