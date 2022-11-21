import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import android.os.Message;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axd extends Handler
{
    final axe a;
    private final oqz b;
    
    public axd(final axe a) {
        this.a = a;
        this.b = new oqz(a);
    }
    
    public final void a(final Runnable runnable) {
        if (Thread.currentThread() == this.getLooper().getThread()) {
            runnable.run();
            return;
        }
        this.post(runnable);
    }
    
    public final void handleMessage(final Message message) {
        final Bundle data = message.getData();
        switch (message.what) {
            default: {
                final StringBuilder sb = new StringBuilder("Unhandled message: ");
                sb.append(message);
                sb.append("\n  Service version: 2\n  Client version: ");
                sb.append(message.arg1);
                Log.w("MBServiceCompat", sb.toString());
                return;
            }
            case 9: {
                final Bundle bundle = data.getBundle("data_custom_action_extras");
                eg.c(bundle);
                final oqz b = this.b;
                final String string = data.getString("data_custom_action");
                final ResultReceiver resultReceiver = (ResultReceiver)data.getParcelable("data_result_receiver");
                final bhy bhy = new bhy(message.replyTo);
                if (TextUtils.isEmpty((CharSequence)string)) {
                    break;
                }
                if (resultReceiver == null) {
                    break;
                }
                ((axe)b.a).c.a(new axc(b, bhy, string, bundle, resultReceiver, 0, null, null, null, null, null, null, null));
                return;
            }
            case 8: {
                eg.c(data.getBundle("data_search_extras"));
                final oqz b2 = this.b;
                final String string2 = data.getString("data_search_query");
                final ResultReceiver resultReceiver2 = (ResultReceiver)data.getParcelable("data_result_receiver");
                final bhy bhy2 = new bhy(message.replyTo);
                if (!TextUtils.isEmpty((CharSequence)string2) && resultReceiver2 != null) {
                    ((axe)b2.a).c.a((Runnable)new tv(b2, bhy2, string2, resultReceiver2, 7, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                    return;
                }
                break;
            }
            case 7: {
                final oqz b3 = this.b;
                ((axe)b3.a).c.a((Runnable)new vt(b3, new bhy(message.replyTo), 19, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                return;
            }
            case 6: {
                eg.c(data.getBundle("data_root_hints"));
                final oqz b4 = this.b;
                ((axe)b4.a).c.a(new axb(b4, new bhy(message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), 0, null, null, null, null, null, null, null));
                return;
            }
            case 5: {
                final oqz b5 = this.b;
                final String string3 = data.getString("data_media_item_id");
                final ResultReceiver resultReceiver3 = (ResultReceiver)data.getParcelable("data_result_receiver");
                final bhy bhy3 = new bhy(message.replyTo);
                if (!TextUtils.isEmpty((CharSequence)string3) && resultReceiver3 != null) {
                    ((axe)b5.a).c.a((Runnable)new tv(b5, bhy3, string3, resultReceiver3, 6, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                    break;
                }
                break;
            }
            case 4: {
                final oqz b6 = this.b;
                ((axe)b6.a).c.a((Runnable)new tv(b6, new bhy(message.replyTo), data.getString("data_media_item_id"), afc.a(data, "data_callback_token"), 5, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                return;
            }
            case 3: {
                final Bundle bundle2 = data.getBundle("data_options");
                eg.c(bundle2);
                final oqz b7 = this.b;
                ((axe)b7.a).c.a(new axc(b7, new bhy(message.replyTo), data.getString("data_media_item_id"), afc.a(data, "data_callback_token"), bundle2, 1, null, null, null, null, null, null, null));
                return;
            }
            case 2: {
                final oqz b8 = this.b;
                ((axe)b8.a).c.a((Runnable)new vt(b8, new bhy(message.replyTo), 18, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                return;
            }
            case 1: {
                eg.c(data.getBundle("data_root_hints"));
                final oqz b9 = this.b;
                final String string4 = data.getString("data_package_name");
                final int int1 = data.getInt("data_calling_pid");
                final int int2 = data.getInt("data_calling_uid");
                final bhy bhy4 = new bhy(message.replyTo);
                final Object a = b9.a;
                if (string4 != null) {
                    final String[] packagesForUid = ((axe)a).getPackageManager().getPackagesForUid(int2);
                    for (int length = packagesForUid.length, i = 0; i < length; ++i) {
                        if (packagesForUid[i].equals(string4)) {
                            ((axe)b9.a).c.a(new axb(b9, bhy4, string4, int1, int2, 1, null, null, null, null, null, null, null));
                            return;
                        }
                    }
                }
                final StringBuilder sb2 = new StringBuilder("Package/uid mismatch: uid=");
                sb2.append(int2);
                sb2.append(" package=");
                sb2.append(string4);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }
    
    public final boolean sendMessageAtTime(final Message message, final long n) {
        final Bundle data = message.getData();
        data.setClassLoader(di.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        final int callingPid = Binder.getCallingPid();
        if (callingPid > 0) {
            data.putInt("data_calling_pid", callingPid);
        }
        else if (!data.containsKey("data_calling_pid")) {
            data.putInt("data_calling_pid", -1);
        }
        return super.sendMessageAtTime(message, n);
    }
}
