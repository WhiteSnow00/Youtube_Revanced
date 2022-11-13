import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfm implements ovh
{
    public final ahaq a() {
        return (ahaq)aovu.b;
    }
    
    public final /* bridge */ void b(final dsx dsx, final Object o, final ovg ovg) {
        final aovu aovu = (aovu)o;
        if (!aovu.d) {
            return;
        }
        final acve a = acve.a(dsx.b);
        a.b = ovg.d;
        final int c = aovu.c;
        if ((c & 0x2) != 0x0) {
            a.a = aovu.e;
        }
        if ((c & 0x4) != 0x0) {
            a.c(aovu.f);
        }
        ovg.d = (Drawable)a.b();
    }
}
