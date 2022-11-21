import android.graphics.Bitmap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class adnu extends tuv
{
    final adnz a;
    
    public adnu(final adnz a) {
        this.a = a;
        super("NotificationBuilderLazy");
    }
    
    protected final /* bridge */ Object b() {
        final adnz a = this.a;
        final Context a2 = a.a;
        tgj.n(a2, "UploadNotifications", a2.getString(2132020074));
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
        final int color = a.a.getResources().getColor(2131102300);
        final afr afr = new afr(a.a);
        afr.q(2131233028);
        afr.p(0, 0, true);
        afr.y = color;
        afr.h((CharSequence)"");
        afr.i((CharSequence)"");
        afr.j((CharSequence)"");
        afr.l = true;
        final Bitmap b = a.b;
        if (b != null) {
            afr.m(b);
        }
        afr.D = "UploadNotifications";
        return afr;
    }
}
