import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aapt extends aanu implements aaqy
{
    private static final float f;
    public boolean e;
    private final aanx g;
    private final aaqz h;
    private float i;
    private final aepj j;
    
    static {
        f = aarz.a(5.0f);
    }
    
    public aapt(final Resources resources, final atjj atjj, final acga acga, final aasb aasb, final acvj acvj, final aepj j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(new aapo(aasb.a(), 0.0f, 0.0f));
        this.j = j;
        final aaqz p10 = acga.p(aasb.a(), 0.0f, 0.0f);
        (this.h = p10).g((aaqy)this);
        p10.B(true, true);
        p10.y(resources.getString(2132018383));
        final float f = aapt.f;
        final aasa c = aasa.c(f);
        final aanx g = new aanx(c, aasb.a(), aanx.s(aanx.h(-1695465), c.f), atjj);
        ((aann)(this.g = g)).k(-f / 2.0f - 0.4f, 0.0f, 0.0f);
        ((aann)p10).k((f + 0.4f) / 2.0f, 0.0f, 0.0f);
        ((aapi)this).m((aaqf)p10);
        ((aapi)this).m((aaqf)g);
        super.c = (aanv)new aapp(this, acvj, 2, (byte[])null);
        this.c();
    }
    
    public final void a(float i, final float n) {
        final float j = this.i;
        this.i = i;
        ((aann)this.g).k((j - i) / 2.0f, 0.0f, 0.0f);
        this.l(this.i, n);
        final aepj k = this.j;
        i = this.i;
        ((aapi)((aasx)k.a).b).k((i - j) / 2.0f, 0.0f, 0.0f);
        ((aasx)k.a).b();
    }
    
    public final float b() {
        return this.i + aapt.f + 0.4f;
    }
    
    public final void c() {
        if (this.e) {
            this.g.g(-1695465);
            return;
        }
        this.g.g(-5723992);
    }
}
