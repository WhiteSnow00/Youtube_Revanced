import android.os.Bundle;
import java.util.regex.Matcher;
import android.os.Parcelable;
import android.util.Log;
import android.os.Messenger;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import android.content.Intent;
import android.os.Message;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

final class mok extends aeke
{
    final /* synthetic */ mol a;
    
    public mok(final mol a, final Looper looper) {
        this.a = a;
        super(looper, (byte[])null);
    }
    
    public final void handleMessage(Message c) {
        final mol a = this.a;
        if (c != null && c.obj instanceof Intent) {
            final Intent intent = (Intent)c.obj;
            intent.setExtrasClassLoader((ClassLoader)new moc());
            if (intent.hasExtra("google.messenger")) {
                final Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof CloudMessagingMessengerCompat) {
                    a.e = (CloudMessagingMessengerCompat)parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    a.d = (Messenger)parcelableExtra;
                }
            }
            final Intent intent2 = (Intent)c.obj;
            if ("com.mgoogle.android.c2dm.intent.REGISTRATION".equals(intent2.getAction())) {
                String s;
                if ((s = intent2.getStringExtra("registration_id")) == null) {
                    s = intent2.getStringExtra("unregistered");
                }
                if (s == null) {
                    final String stringExtra = intent2.getStringExtra("error");
                    if (stringExtra == null) {
                        Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(String.valueOf(intent2.getExtras()))));
                        return;
                    }
                    if (stringExtra.startsWith("|")) {
                        final String[] split = stringExtra.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            final String s2 = split[2];
                            String substring;
                            final String s3 = substring = split[3];
                            if (s3.startsWith(":")) {
                                substring = s3.substring(1);
                            }
                            a.c(s2, intent2.putExtra("error", substring).getExtras());
                            return;
                        }
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra));
                        return;
                    }
                    else {
                        c = (Message)a.c;
                        monitorenter(c);
                        int n = 0;
                        try {
                            while (true) {
                                final abn c2 = a.c;
                                if (n >= c2.d) {
                                    break;
                                }
                                a.c((String)c2.c(n), intent2.getExtras());
                                ++n;
                            }
                            return;
                        }
                        finally {
                            monitorexit(c);
                        }
                    }
                }
                final Matcher matcher = mol.b.matcher(s);
                if (matcher.matches()) {
                    final String group = matcher.group(1);
                    final String group2 = matcher.group(2);
                    if (group != null) {
                        final Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        a.c(group, extras);
                    }
                }
            }
            return;
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
