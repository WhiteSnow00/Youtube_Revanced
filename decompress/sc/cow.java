import androidx.work.impl.background.systemjob.SystemJobService;
import android.content.Context;
import android.content.ComponentName;

// 
// Decompiled by Procyon v0.6.0
// 

final class cow
{
    public final ComponentName a;
    
    static {
        cms.b("SystemJobInfoConverter");
    }
    
    public cow(final Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class)SystemJobService.class);
    }
}
