import j$.util.Optional;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.app.RemoteAction;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghr
{
    public final String a;
    public final Runnable b;
    private final Context c;
    private final int d;
    private final int e;
    private final int f;
    private final wyb g;
    private RemoteAction h;
    
    public ghr(final Context c, final int d, final int e, final int f, final String a, final wyb g, final Runnable b) {
        c.getClass();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = a;
        this.g = g;
        this.b = b;
    }
    
    public final RemoteAction a() {
        if (this.h == null) {
            final Icon withResource = Icon.createWithResource(this.c, this.d);
            final String string = this.c.getString(this.e);
            final String string2 = this.c.getString(this.f);
            final Context c = this.c;
            final RemoteAction h = new RemoteAction(withResource, (CharSequence)string, (CharSequence)string2, PendingIntent.getBroadcast(c, 0, new Intent(this.a).setPackage(c.getPackageName()), 201326592));
            this.h = h;
            if (this.b == null) {
                h.setEnabled(false);
            }
        }
        return this.h;
    }
    
    public final Optional b() {
        return Optional.ofNullable((Object)this.g);
    }
}
