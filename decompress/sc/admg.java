import android.graphics.Bitmap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class admg extends ttt
{
    final adml a;
    
    public admg(final adml a) {
        this.a = a;
        super("NotificationBuilderLazy");
    }
    
    protected final /* bridge */ Object b() {
        final adml a = this.a;
        final Context a2 = a.a;
        tfg.m(a2, "UploadNotifications", a2.getString(2132020071));
        if (a.c == null) {
            a.c = "";
        }
        if (a.d == null) {
            a.d = "";
        }
        if (a.e == null) {
            a.e = "";
        }
        a.b = null;
        a.f = -2;
        final int color = a.a.getResources().getColor(2131102304);
        final afq afq = new afq(a.a);
        afq.q(2131233028);
        afq.p(0, 0, true);
        afq.y = color;
        afq.h((CharSequence)"");
        afq.i((CharSequence)"");
        afq.j((CharSequence)"");
        afq.l = true;
        final Bitmap b = a.b;
        if (b != null) {
            afq.m(b);
        }
        afq.D = "UploadNotifications";
        return afq;
    }
}
