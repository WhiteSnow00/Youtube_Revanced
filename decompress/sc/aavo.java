import android.graphics.Bitmap$Config;
import java.util.List;
import android.graphics.Bitmap;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavo implements tcc
{
    final Object a;
    private final int b;
    
    public aavo(final aavp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavo(final abnf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavo(final abum a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aavo(final tcc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void b(Object a, final Object o) {
        final int b = this.b;
        final boolean b2 = true;
        if (b == 0) {
            final Uri uri = (Uri)a;
            final Bitmap i = (Bitmap)o;
            final aasu b3 = ((aavp)this.a).b;
            if (i == null) {
                ttr.b("Cannot set null bitmap.");
            }
            else {
                boolean j = b2;
                if (b3.i.getWidth() == i.getWidth()) {
                    j = (b3.i.getHeight() != i.getHeight() && b2);
                }
                b3.j = j;
                b3.i = i;
                b3.g();
            }
            final float n = (float)i.getWidth();
            final float n2 = (float)i.getHeight();
            ((aapi)((aavp)this.a).b).sZ(1.0f, 1.0f, 1.0f);
            final float n3 = n / n2;
            if (n3 != 1.7777778f) {
                ((aapi)((aavp)this.a).b).sZ(1.0f / n3, 1.0f, 1.0f);
            }
            ((aasb)((aavp)this.a).b).l = false;
            return;
        }
        if (b == 1) {
            final aujg aujg = (aujg)a;
            final aujg aujg2 = (aujg)o;
            a = this.a;
            ((tcc)a).b((Object)ziy.au(aujg), (Object)new aujg(aaan.b((List)aujg2.c), (byte[])aujg2.a, (aaij)aujg2.b, (byte[])null));
            return;
        }
        if (b == 2) {
            final Void void1 = (Void)a;
            ((abnf)this.a).e.loadUrl((String)o);
            return;
        }
        if (b != 3) {
            final Uri uri2 = (Uri)a;
            final akq akq = (akq)o;
            if (uri2.equals((Object)((abum)this.a).b)) {
                ((abum)this.a).b((Bitmap)akq.a, (Bitmap)akq.b);
                abum.c((abum)this.a);
            }
            return;
        }
        final Uri uri3 = (Uri)a;
        final Bitmap bitmap = (Bitmap)o;
        if (bitmap != null) {
            final float density = ((abum)this.a).a.getResources().getDisplayMetrics().density;
            final tcc a2 = ((abum)this.a).a();
            final float n4 = (float)bitmap.getWidth();
            final float n5 = (float)bitmap.getHeight();
            final float n6 = (float)(int)(density * 64.0f);
            final float min = Math.min(n6 / n4, n6 / n5);
            final Bitmap bitmap2 = Bitmap.createBitmap((int)(bitmap.getWidth() * min), (int)(bitmap.getHeight() * min), Bitmap$Config.ARGB_8888);
            tpe.C(bitmap, bitmap2);
            a2.b((Object)uri3, (Object)new akq((Object)bitmap, (Object)bitmap2));
        }
    }
    
    public final void sd(final Object o, final Exception ex) {
        final int b = this.b;
        if (b == 0) {
            final Uri uri = (Uri)o;
            ttr.b("Error requesting bitmap for autonav video thumbnail:".concat(String.valueOf(String.valueOf(ex))));
            return;
        }
        if (b == 1) {
            ((tcc)this.a).sd((Object)ziy.au((aujg)o), ex);
            return;
        }
        if (b == 2) {
            final Void void1 = (Void)o;
            ((abnf)this.a).c();
            return;
        }
        if (b != 3) {
            if (((Uri)o).equals((Object)((abum)this.a).b)) {
                ((abum)this.a).b(null, null);
                abum.c((abum)this.a);
            }
            return;
        }
        ((abum)this.a).a().sd((Object)o, ex);
    }
}
