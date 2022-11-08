import android.graphics.Bitmap;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aapq extends aanu
{
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;
    public String i;
    private final Resources j;
    private final aara k;
    private final aanx m;
    private final aarb n;
    private final aapz o;
    
    public aapq(final Resources j, final atjj atjj, final atjj atjj2, final acga acga, final aasb aasb, final aepj aepj, final byte[] array, final byte[] array2, final byte[] array3) {
        super(new aapo(aasb.a(), 0.0f, 0.0f));
        this.j = j;
        final Bitmap d = aarz.d(j, 2131951716);
        final float a = aarz.a((float)d.getWidth());
        final float a2 = aarz.a((float)d.getHeight());
        final aara k = new aara(d, aasa.a(a, a2, aasa.c), aasb.a(), atjj);
        ((aann)(this.k = k)).a((aanm)(this.o = new aapz((aapy)k, 0.5f, 1.0f)));
        final aasa a3 = aasa.a(a, aaqj.c, aasa.c);
        final aanx m = new aanx(a3, aasb.a(), aanx.s(aanx.h(-1695465), a3.f), atjj2);
        ((aann)(this.m = m)).k(0.0f, -a2 * 7.0f / 12.0f, 0.0f);
        ((aann)m).c((aanm)new aaqe((aaqd)m, new float[] { 0.0f, 1.0f, 1.0f }, new float[] { 1.0f, 1.0f, 1.0f }));
        final aarb n = new aarb(acga, aasb.a(), atjj2, (aann)k, (a2 + a2) / 3.0f, (byte[])null, (byte[])null);
        this.n = n;
        ((aapi)this).m((aaqf)k);
        ((aapi)this).m((aaqf)m);
        ((aapi)this).m((aaqf)n);
        this.l(a, a2);
        super.c = (aanv)new aapp(this, aepj, 0, (byte[])null, (byte[])null, (byte[])null);
        this.a();
    }
    
    public final void a() {
        final boolean f = this.e || this.g;
        this.f = f;
        final aapz o = this.o;
        float a;
        if (!f) {
            a = 0.5f;
        }
        else {
            a = 1.0f;
        }
        o.a = a;
        final aanx m = this.m;
        final boolean g = this.g;
        ((aann)m).h = g;
        String s = null;
        Label_0107: {
            if (f) {
                if ((s = this.i) != null) {
                    break Label_0107;
                }
            }
            else if ((s = this.h) != null) {
                break Label_0107;
            }
            s = "";
        }
        int n;
        if (!g) {
            n = 2132020167;
        }
        else {
            n = 2132020172;
        }
        this.n.a.y(this.j.getString(n, new Object[] { s }));
    }
}
