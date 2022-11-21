import java.util.HashMap;
import android.app.PendingIntent;
import java.io.File;
import android.content.Context;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aedc extends aedf
{
    final aedd a;
    
    public aedc(final aedd a, final noj noj, final byte[] array) {
        this.a = a;
        new aefs("OnRequestInstallCallback", null);
        super(a, noj, (byte[])null);
    }
    
    public final void b(final Bundle bundle) {
        super.b(bundle);
        if (aedd.a(bundle) != 0) {
            this.c.c((Exception)new aedl(aedd.a(bundle)));
            return;
        }
        final noj c = this.c;
        final aedd a = this.a;
        bundle.getInt("version.code", -1);
        final int int1 = bundle.getInt("update.availability");
        final int int2 = bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) != -1) {
            bundle.getInt("client.version.staleness");
        }
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        bundle.getLong("additional.size.required");
        aefs.m(new File(((Context)a.e.a).getFilesDir(), "assetpacks"));
        final PendingIntent pendingIntent = (PendingIntent)bundle.getParcelable("blocking.intent");
        final PendingIntent pendingIntent2 = (PendingIntent)bundle.getParcelable("nonblocking.intent");
        final PendingIntent pendingIntent3 = (PendingIntent)bundle.getParcelable("blocking.destructive.intent");
        final PendingIntent pendingIntent4 = (PendingIntent)bundle.getParcelable("nonblocking.destructive.intent");
        final HashMap hashMap = new HashMap();
        hashMap.put("blocking.destructive.intent", aedd.d(bundle.getIntegerArrayList(adzw.w("blocking.destructive.intent"))));
        hashMap.put("nonblocking.destructive.intent", aedd.d(bundle.getIntegerArrayList(adzw.w("nonblocking.destructive.intent"))));
        hashMap.put("blocking.intent", aedd.d(bundle.getIntegerArrayList(adzw.w("blocking.intent"))));
        hashMap.put("nonblocking.intent", aedd.d(bundle.getIntegerArrayList(adzw.w("nonblocking.intent"))));
        c.d((Object)new aect(int1, int2, pendingIntent, pendingIntent2));
    }
}
