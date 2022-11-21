import android.content.res.Resources$Theme;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build$VERSION;
import android.content.res.Resources$NotFoundException;
import android.app.Notification;
import org.json.JSONArray;
import java.util.Iterator;
import android.content.res.Resources;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import org.json.JSONException;
import android.os.Parcelable;
import android.content.ComponentName;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.app.NotificationChannel;
import android.text.TextUtils;
import android.app.NotificationManager;
import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnw
{
    private static final AtomicInteger a;
    
    static {
        a = new AtomicInteger((int)SystemClock.elapsedRealtime());
    }
    
    public static agnv a(final Context context, final agpb agpb) {
        final PackageManager packageManager = context.getPackageManager();
        final String packageName = context.getPackageName();
        Bundle bundle = null;
        Label_0070: {
            try {
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    bundle = applicationInfo.metaData;
                    break Label_0070;
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: ".concat(ex.toString()));
            }
            bundle = Bundle.EMPTY;
        }
        final String i = agpb.i("gcm.n.android_channel_id");
        String s = null;
        Label_0313: {
            try {
                if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                    final NotificationManager notificationManager = (NotificationManager)context.getSystemService((Class)NotificationManager.class);
                    if (!TextUtils.isEmpty((CharSequence)i)) {
                        s = i;
                        if (notificationManager.getNotificationChannel(i) != null) {
                            break Label_0313;
                        }
                        final StringBuilder sb = new StringBuilder("Notification Channel requested (");
                        sb.append(i);
                        sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                        Log.w("FirebaseMessaging", sb.toString());
                    }
                    final String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty((CharSequence)string)) {
                        s = string;
                        if (notificationManager.getNotificationChannel(string) != null) {
                            break Label_0313;
                        }
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    else {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    }
                    s = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        final int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                        String string2;
                        if (identifier == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string2 = "Misc";
                        }
                        else {
                            string2 = context.getString(identifier);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", (CharSequence)string2, 3));
                        s = s;
                    }
                    break Label_0313;
                }
            }
            catch (final PackageManager$NameNotFoundException ex2) {}
            s = null;
        }
        final String packageName2 = context.getPackageName();
        final Resources resources = context.getResources();
        final PackageManager packageManager2 = context.getPackageManager();
        final afr afr = new afr(context, s);
        final String h = agpb.h(resources, packageName2, "gcm.n.title");
        if (!TextUtils.isEmpty((CharSequence)h)) {
            afr.j((CharSequence)h);
        }
        final String h2 = agpb.h(resources, packageName2, "gcm.n.body");
        if (!TextUtils.isEmpty((CharSequence)h2)) {
            afr.i((CharSequence)h2);
            final afp afp = new afp();
            afp.c((CharSequence)h2);
            afr.r((afv)afp);
        }
        final String j = agpb.i("gcm.n.icon");
        int n = 0;
        Label_0605: {
            if (!TextUtils.isEmpty((CharSequence)j)) {
                n = resources.getIdentifier(j, "drawable", packageName2);
                if (n != 0 && e(resources, n)) {
                    break Label_0605;
                }
                n = resources.getIdentifier(j, "mipmap", packageName2);
                if (n != 0 && e(resources, n)) {
                    break Label_0605;
                }
                final StringBuilder sb2 = new StringBuilder("Icon resource ");
                sb2.append(j);
                sb2.append(" not found. Notification will use default icon.");
                Log.w("FirebaseMessaging", sb2.toString());
            }
            int n2 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            Label_0587: {
                if (n2 != 0) {
                    if (e(resources, n2)) {
                        break Label_0587;
                    }
                }
                try {
                    n2 = packageManager2.getApplicationInfo(packageName2, 0).icon;
                }
                catch (final PackageManager$NameNotFoundException ex3) {
                    Log.w("FirebaseMessaging", "Couldn't get own application info: ".concat(ex3.toString()));
                }
            }
            if (n2 != 0) {
                n = n2;
                if (e(resources, n2)) {
                    break Label_0605;
                }
            }
            n = 17301651;
        }
        afr.q(n);
        String s2;
        if (TextUtils.isEmpty((CharSequence)(s2 = agpb.i("gcm.n.sound2")))) {
            s2 = agpb.i("gcm.n.sound");
        }
        Uri sound;
        if (TextUtils.isEmpty((CharSequence)s2)) {
            sound = null;
        }
        else if (!"default".equals(s2) && resources.getIdentifier(s2, "raw", packageName2) != 0) {
            final StringBuilder sb3 = new StringBuilder("android.resource://");
            sb3.append(packageName2);
            sb3.append("/raw/");
            sb3.append(s2);
            sound = Uri.parse(sb3.toString());
        }
        else {
            sound = RingtoneManager.getDefaultUri(2);
        }
        if (sound != null) {
            afr.H.sound = sound;
            afr.H.audioStreamType = -1;
            afr.H.audioAttributes = afq.e(afq.d(afq.b(afq.a(), 4), 5));
        }
        final String k = agpb.i("gcm.n.click_action");
        Intent intent;
        if (!TextUtils.isEmpty((CharSequence)k)) {
            intent = new Intent(k);
            intent.setPackage(packageName2);
            intent.setFlags(268435456);
        }
        else {
            String s3;
            if (TextUtils.isEmpty((CharSequence)(s3 = agpb.i("gcm.n.link_android")))) {
                s3 = agpb.i("gcm.n.link");
            }
            Uri parse;
            if (!TextUtils.isEmpty((CharSequence)s3)) {
                parse = Uri.parse(s3);
            }
            else {
                parse = null;
            }
            if (parse != null) {
                final Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setPackage(packageName2);
                intent2.setData(parse);
                intent = intent2;
            }
            else {
                final Intent launchIntentForPackage = packageManager2.getLaunchIntentForPackage(packageName2);
                if ((intent = launchIntentForPackage) == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                    intent = launchIntentForPackage;
                }
            }
        }
        PendingIntent activity;
        if (intent == null) {
            activity = null;
        }
        else {
            intent.addFlags(67108864);
            final Bundle bundle2 = new Bundle((Bundle)agpb.a);
            for (final String s4 : ((Bundle)agpb.a).keySet()) {
                if (s4.startsWith("google.c.") || s4.startsWith("gcm.n.") || s4.startsWith("gcm.notification.")) {
                    bundle2.remove(s4);
                }
            }
            intent.putExtras(bundle2);
            if (b(agpb)) {
                intent.putExtra("gcm.n.analytics_data", agpb.e());
            }
            activity = PendingIntent.getActivity(context, c(), intent, 1140850688);
        }
        afr.g = activity;
        PendingIntent broadcast;
        if (!b(agpb)) {
            broadcast = null;
        }
        else {
            broadcast = PendingIntent.getBroadcast(context, c(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", (Parcelable)new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(agpb.e())), 1140850688);
        }
        if (broadcast != null) {
            afr.l(broadcast);
        }
        final Integer d = d(context, agpb.i("gcm.n.color"), bundle);
        if (d != null) {
            afr.y = d;
        }
        afr.f(agpb.l("gcm.n.sticky") ^ true);
        afr.v = agpb.l("gcm.n.local_only");
        final String l = agpb.i("gcm.n.ticker");
        if (l != null) {
            afr.t((CharSequence)l);
        }
        final Integer f = agpb.f("gcm.n.notification_priority");
        Integer n3 = null;
        Label_1357: {
            if (f != null) {
                if (f >= -2) {
                    n3 = f;
                    if (f <= 2) {
                        break Label_1357;
                    }
                }
                final StringBuilder sb4 = new StringBuilder("notificationPriority is invalid ");
                sb4.append(f);
                sb4.append(". Skipping setting notificationPriority.");
                Log.w("FirebaseMessaging", sb4.toString());
            }
            n3 = null;
        }
        if (n3 != null) {
            afr.k = n3;
        }
        final Integer f2 = agpb.f("gcm.n.visibility");
        Integer n4 = null;
        Label_1450: {
            if (f2 != null) {
                if (f2 >= -1) {
                    n4 = f2;
                    if (f2 <= 1) {
                        break Label_1450;
                    }
                }
                final StringBuilder sb5 = new StringBuilder("visibility is invalid: ");
                sb5.append(f2);
                sb5.append(". Skipping setting visibility.");
                Log.w("NotificationParams", sb5.toString());
            }
            n4 = null;
        }
        if (n4 != null) {
            afr.z = n4;
        }
        final Integer f3 = agpb.f("gcm.n.notification_count");
        Integer n5 = null;
        Label_1532: {
            if (f3 != null) {
                n5 = f3;
                if (f3 >= 0) {
                    break Label_1532;
                }
                final StringBuilder sb6 = new StringBuilder("notificationCount is invalid: ");
                sb6.append(f3);
                sb6.append(". Skipping setting notificationCount.");
                Log.w("FirebaseMessaging", sb6.toString());
            }
            n5 = null;
        }
        if (n5 != null) {
            afr.j = n5;
        }
        final String m = agpb.i("gcm.n.event_time");
        Long value = null;
        Label_1641: {
            if (!TextUtils.isEmpty((CharSequence)m)) {
                try {
                    value = Long.parseLong(m);
                    break Label_1641;
                }
                catch (final NumberFormatException ex4) {
                    final String j2 = agpb.j("gcm.n.event_time");
                    final StringBuilder sb7 = new StringBuilder("Couldn't parse value of ");
                    sb7.append(j2);
                    sb7.append("(");
                    sb7.append(m);
                    sb7.append(") into a long");
                    Log.w("NotificationParams", sb7.toString());
                }
            }
            value = null;
        }
        if (value != null) {
            afr.l = true;
            afr.v((long)value);
        }
        final JSONArray k2 = agpb.k("gcm.n.vibrate_timings");
        long[] array2 = null;
        Label_1786: {
            Label_1674: {
                if (k2 != null) {
                    try {
                        if (k2.length() <= 1) {
                            throw new JSONException("vibrateTimings have invalid length");
                        }
                        final int length = k2.length();
                        final long[] array = new long[length];
                        int n6 = 0;
                        while (true) {
                            array2 = array;
                            if (n6 >= length) {
                                break;
                            }
                            array[n6] = k2.optLong(n6);
                            ++n6;
                        }
                    }
                    catch (final JSONException | NumberFormatException ex5) {
                        final String string3 = k2.toString();
                        final StringBuilder sb8 = new StringBuilder("User defined vibrateTimings is invalid: ");
                        sb8.append(string3);
                        sb8.append(". Skipping setting vibrateTimings.");
                        Log.w("NotificationParams", sb8.toString());
                        break Label_1674;
                    }
                    break Label_1786;
                }
            }
            array2 = null;
        }
        if (array2 != null) {
            afr.u(array2);
        }
        final JSONArray k3 = agpb.k("gcm.n.light_settings");
        int[] array3 = null;
        Label_2019: {
            Label_1810: {
                if (k3 != null) {
                    try {
                        if (k3.length() != 3) {
                            throw new JSONException("lightSettings don't have all three fields");
                        }
                        final int color = Color.parseColor(k3.optString(0));
                        if (color == -16777216) {
                            throw new IllegalArgumentException("Transparent color is invalid");
                        }
                        array3 = new int[] { color, k3.optInt(1), k3.optInt(2) };
                    }
                    catch (final IllegalArgumentException ex6) {
                        final String string4 = k3.toString();
                        final String message = ex6.getMessage();
                        final StringBuilder sb9 = new StringBuilder("LightSettings is invalid: ");
                        sb9.append(string4);
                        sb9.append(". ");
                        sb9.append(message);
                        sb9.append(". Skipping setting LightSettings");
                        Log.w("NotificationParams", sb9.toString());
                        break Label_1810;
                    }
                    catch (final JSONException ex7) {
                        final String string5 = k3.toString();
                        final StringBuilder sb10 = new StringBuilder("LightSettings is invalid: ");
                        sb10.append(string5);
                        sb10.append(". Skipping setting LightSettings");
                        Log.w("NotificationParams", sb10.toString());
                        break Label_1810;
                    }
                    break Label_2019;
                }
            }
            array3 = null;
        }
        if (array3 != null) {
            final int ledARGB = array3[0];
            final int ledOnMS = array3[1];
            final int ledOffMS = array3[2];
            afr.H.ledARGB = ledARGB;
            afr.H.ledOnMS = ledOnMS;
            afr.H.ledOffMS = ledOffMS;
            final boolean b = afr.H.ledOnMS != 0 && afr.H.ledOffMS != 0;
            final Notification h3 = afr.H;
            h3.flags = ((h3.flags & 0xFFFFFFFE) | (b ? 1 : 0));
        }
        int l2;
        final int n7 = l2 = (agpb.l("gcm.n.default_sound") ? 1 : 0);
        if (agpb.l("gcm.n.default_vibrate_timings")) {
            l2 = (n7 | 0x2);
        }
        int n8 = l2;
        if (agpb.l("gcm.n.default_light_settings")) {
            n8 = (l2 | 0x4);
        }
        afr.k(n8);
        String s5;
        if (TextUtils.isEmpty((CharSequence)(s5 = agpb.i("gcm.n.tag")))) {
            final long uptimeMillis = SystemClock.uptimeMillis();
            final StringBuilder sb11 = new StringBuilder("FCM-Notification:");
            sb11.append(uptimeMillis);
            s5 = sb11.toString();
        }
        return new agnv(afr, s5);
    }
    
    static boolean b(final agpb agpb) {
        return agpb.l("google.c.a.e");
    }
    
    private static int c() {
        return agnw.a.incrementAndGet();
    }
    
    private static Integer d(final Context context, final String s, final Bundle bundle) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            try {
                return Color.parseColor(s);
            }
            catch (final IllegalArgumentException ex) {
                final StringBuilder sb = new StringBuilder("Color is invalid: ");
                sb.append(s);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        final int int1 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (int1 != 0) {
            try {
                return agz.a(context, int1);
            }
            catch (final Resources$NotFoundException ex2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }
    
    private static boolean e(final Resources resources, final int n) {
        if (Build$VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (resources.getDrawable(n, (Resources$Theme)null) instanceof AdaptiveIconDrawable) {
                final StringBuilder sb = new StringBuilder("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
                sb.append(n);
                Log.e("FirebaseMessaging", sb.toString());
                return false;
            }
            return true;
        }
        catch (final Resources$NotFoundException ex) {
            final StringBuilder sb2 = new StringBuilder("Couldn't find resource ");
            sb2.append(n);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }
}
