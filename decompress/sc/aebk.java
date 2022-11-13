import java.util.HashMap;
import android.app.PendingIntent;
import java.io.File;
import android.content.Context;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aebk extends aebn
{
    final aebl a;
    
    public aebk(final aebl a, final nns nns, final byte[] array) {
        this.a = a;
        new adet("OnRequestInstallCallback");
        super(a, nns, (byte[])null);
    }
    
    public final void b(final Bundle bundle) {
        super.b(bundle);
        if (aebl.a(bundle) != 0) {
            this.c.c((Exception)new aebt(aebl.a(bundle)));
            return;
        }
        final nns c = this.c;
        final aebl a = this.a;
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
        adet.o(new File(((Context)a.e.a).getFilesDir(), "assetpacks"));
        final PendingIntent pendingIntent = (PendingIntent)bundle.getParcelable("blocking.intent");
        final PendingIntent pendingIntent2 = (PendingIntent)bundle.getParcelable("nonblocking.intent");
        final PendingIntent pendingIntent3 = (PendingIntent)bundle.getParcelable("blocking.destructive.intent");
        final PendingIntent pendingIntent4 = (PendingIntent)bundle.getParcelable("nonblocking.destructive.intent");
        final HashMap hashMap = new HashMap();
        hashMap.put("blocking.destructive.intent", aebl.d(bundle.getIntegerArrayList(adyf.x("blocking.destructive.intent"))));
        hashMap.put("nonblocking.destructive.intent", aebl.d(bundle.getIntegerArrayList(adyf.x("nonblocking.destructive.intent"))));
        hashMap.put("blocking.intent", aebl.d(bundle.getIntegerArrayList(adyf.x("blocking.intent"))));
        hashMap.put("nonblocking.intent", aebl.d(bundle.getIntegerArrayList(adyf.x("nonblocking.intent"))));
        c.d((Object)new aebb(int1, int2, pendingIntent, pendingIntent2));
    }
}
