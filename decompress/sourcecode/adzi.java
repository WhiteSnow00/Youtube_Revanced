import java.util.HashMap;
import android.app.PendingIntent;
import java.io.File;
import android.content.Context;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class adzi extends adzl
{
    final /* synthetic */ adzj a;
    
    public adzi(final adzj a, final nmo nmo, final byte[] array) {
        this.a = a;
        new aeby("OnRequestInstallCallback", (byte[])null);
        super(a, nmo, (byte[])null);
    }
    
    public final void b(final Bundle bundle) {
        super.b(bundle);
        if (adzj.a(bundle) != 0) {
            this.c.d((Exception)new adzr(adzj.a(bundle)));
            return;
        }
        final nmo c = this.c;
        final adzj a = this.a;
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
        adcr.p(new File(((Context)a.d.a).getFilesDir(), "assetpacks"));
        final PendingIntent pendingIntent = (PendingIntent)bundle.getParcelable("blocking.intent");
        final PendingIntent pendingIntent2 = (PendingIntent)bundle.getParcelable("nonblocking.intent");
        final PendingIntent pendingIntent3 = (PendingIntent)bundle.getParcelable("blocking.destructive.intent");
        final PendingIntent pendingIntent4 = (PendingIntent)bundle.getParcelable("nonblocking.destructive.intent");
        final HashMap hashMap = new HashMap();
        hashMap.put("blocking.destructive.intent", adzj.d(bundle.getIntegerArrayList(adwd.R("blocking.destructive.intent"))));
        hashMap.put("nonblocking.destructive.intent", adzj.d(bundle.getIntegerArrayList(adwd.R("nonblocking.destructive.intent"))));
        hashMap.put("blocking.intent", adzj.d(bundle.getIntegerArrayList(adwd.R("blocking.intent"))));
        hashMap.put("nonblocking.intent", adzj.d(bundle.getIntegerArrayList(adwd.R("nonblocking.intent"))));
        c.e((Object)new adyz(int1, int2, pendingIntent, pendingIntent2));
    }
}
