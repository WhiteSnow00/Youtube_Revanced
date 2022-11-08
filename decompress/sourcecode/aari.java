import android.graphics.Bitmap;
import android.content.res.Resources;
import android.media.AudioManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aari extends aanu implements aaqi
{
    public final aaqj e;
    public final float f;
    private final aanu g;
    private final float[] h;
    private final AudioManager i;
    private final aara j;
    private final aara k;
    private final aara m;
    private float n;
    private boolean o;
    
    public aari(final Resources resources, final AudioManager i, final atjj atjj, final atjj atjj2, final aasb aasb) {
        super(new aapo(aasb.a(), 0.0f, 0.0f));
        this.i = i;
        final float[] h = new float[2];
        this.h = h;
        final aaqj e = new aaqj(atjj, new int[] { -1695465, -5723992 }, 8.0f, aasb.a(), (aaqi)this);
        this.e = e;
        final aarh aarh = new aarh(this);
        final aarc aarc = new aarc((aaqf)e, new float[] { 0.0f, 0.0f, 0.0f }, new float[] { 4.0f, 0.0f, 0.0f });
        this.j((aanm)aarh);
        this.j((aanm)aarc);
        final Bitmap d = aarz.d(resources, 2131951728);
        final float a = aarz.a((float)d.getWidth());
        final float a2 = aarz.a((float)d.getHeight());
        final aanu g = new aanu(new aapo(aasb.a(), a, a2));
        this.g = g;
        final aara aara = new aara(d, aasa.a(a, a2, aasa.c), aasb.a(), atjj2);
        ((aann)aara).a((aanm)new aapz((aapy)aara, 0.5f, 1.0f));
        final aara j = new aara(aarz.d(resources, 2131951726), aasa.a(a, a2, aasa.c), aasb.a(), atjj2);
        ((aann)(this.j = j)).a((aanm)new aapz((aapy)j, 0.5f, 1.0f));
        final aara k = new aara(aarz.d(resources, 2131951725), aasa.a(a, a2, aasa.c), aasb.a(), atjj2);
        ((aann)(this.k = k)).a((aanm)new aapz((aapy)k, 0.5f, 1.0f));
        final aara m = new aara(aarz.d(resources, 2131951727), aasa.a(a, a2, aasa.c), aasb.a(), atjj2);
        ((aann)(this.m = m)).a((aanm)new aapz((aapy)m, 0.5f, 1.0f));
        this.n = this.g();
        this.t();
        ((aapi)g).m((aaqf)aara);
        ((aapi)g).m((aaqf)j);
        ((aapi)g).m((aaqf)k);
        ((aapi)g).m((aaqf)m);
        ((aapi)g).k(-4.0f, 0.0f, 0.0f);
        ((aapi)e).k((-8.0f + a) / 2.0f, 0.0f, 0.0f);
        h[1] = 1.0f - (h[0] = this.g());
        e.g(h);
        this.l((this.f = e.h + a) + 1.0f, a2);
        ((aapi)this).m((aaqf)e);
        ((aapi)this).m((aaqf)g);
    }
    
    private final float g() {
        return this.i.getStreamVolume(3) / (float)this.i.getStreamMaxVolume(3);
    }
    
    private final void h() {
        int n;
        if (this.o) {
            n = 0;
        }
        else {
            n = (int)(this.n * this.i.getStreamMaxVolume(3));
        }
        this.i.setStreamVolume(3, n, 0);
    }
    
    private final void t() {
        final aara j = this.j;
        final boolean o = this.o;
        ((aaqh)j).l = (o || this.n < 0.25f);
        ((aaqh)this.k).l = (o || this.n < 0.75f);
        ((aaqh)this.m).l = (o ^ true);
        float n;
        if (o) {
            n = 0.0f;
        }
        else {
            n = this.n;
        }
        final float[] h = this.h;
        h[1] = 1.0f - (h[0] = n);
        this.e.g(h);
    }
    
    public final void a(final float n) {
    }
    
    public final void b() {
        this.t();
    }
    
    public final void c(final float n) {
        this.n = n;
        this.o = false;
        this.h();
        this.t();
    }
    
    public final void o(final foi foi) {
        super.o(foi);
        ((aapi)this.e).o(foi);
        if (((aapi)this.g).q(foi)) {
            this.o ^= true;
            this.t();
            this.h();
            this.t();
        }
    }
    
    public final void rL(final boolean b, final foi foi) {
        super.rL(b, foi);
        ((aapi)this.e).rL(b, foi);
    }
}
