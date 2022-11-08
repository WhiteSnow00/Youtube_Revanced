import android.app.NotificationManager;
import android.content.res.Resources;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbf
{
    public final Context a;
    public final Resources b;
    public final aceo c;
    public final NotificationManager d;
    public final fa e;
    public final zki f;
    public final zjy g;
    public int h;
    public String i;
    public volatile String j;
    public afp k;
    public afp l;
    public boolean m;
    public final arud n;
    
    public fbf(final Context a, final aceo c, final arud n, final fa e, final zki f, final zjy g, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        this.n = n;
        this.e = e;
        this.f = f;
        this.g = g;
        this.b = a.getResources();
        this.d = (NotificationManager)a.getSystemService("notification");
        this.m = false;
    }
    
    public final void a() {
        this.d.cancel(1005);
        this.m = false;
    }
}
