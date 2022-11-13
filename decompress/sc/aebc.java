import java.util.Iterator;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aebc extends aebx
{
    public aebc(final Context context) {
        new adet("AppUpdateListenerRegistry");
        super(new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }
    
    protected final void a(final Context context, final Intent intent) {
        if (context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            final Iterator iterator = intent.getExtras().keySet().iterator();
            while (iterator.hasNext()) {
                intent.getExtras().get((String)iterator.next());
            }
            intent.getIntExtra("install.status", 0);
            intent.getIntExtra("error.code", 0);
            this.d((Object)new aebs(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name")));
            return;
        }
        intent.getStringExtra("package.name");
    }
}
