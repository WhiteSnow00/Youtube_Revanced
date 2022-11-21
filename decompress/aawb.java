import android.graphics.Bitmap;
import android.media.AudioManager;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawb extends aass
{
    public final aaud a;
    public final aatd b;
    public final aaue c;
    public final aata e;
    public final aawi f;
    public float g;
    public long h;
    public boolean i;
    private final aaum j;
    private float k;
    
    public aawb(final Resources resources, final AudioManager audioManager, final aaux aaux, final acjq acjq, final aavf aavf, final adzx adzx, final adzx adzx2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final aaxk a = aaux.a;
        final atnb b = a.b();
        final atnb a2 = a.a();
        final aaud q = acjq.q(aavf.a(), 0.0f, aavd.a(40.0f));
        this.a = q;
        final float a3 = aavd.a(-40.0f);
        ((aarh)q).k(-19.0f, a3, 0.0f);
        q.h(17);
        q.g((aauc)new aawa(this, 0));
        q.B(true, false);
        final aawi f = new aawi(a2, b, aavf.a(), adzx, null, null, null);
        this.f = f;
        final aaum j = new aaum(resources, audioManager, a2, b, aavf);
        ((aass)(this.j = j)).k(0.0f, a3, 0.0f);
        final aatd b2 = new aatd(resources, a2, acjq, aavf.a(), new acyy(this, adzx, null, null, null), new adzx(this), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((aass)(this.b = b2)).k((b2.b() - 38.0f) / 2.0f, a3, 0.0f);
        final Bitmap d = aavd.d(resources, 2131951730);
        final float n = (float)d.getWidth();
        final float n2 = (float)d.getHeight();
        final float a4 = aavd.a(n);
        final float a5 = aavd.a(n2);
        final aaue c = new aaue(d, aave.a(a4, a5, aave.c), aavf.a(), aaux.a.b());
        c.k((38.0f - a4) / 2.0f, aavd.a(-40.0f), 0.0f);
        final aasy g = c.g;
        if (g == null) {
            c.g = new aasy(c.a, a4, a5);
        }
        else {
            g.a(a4, a5);
        }
        final aato aato = new aato((aatn)c, aato.b(0.5f), aato.b(1.0f));
        c.a((aarg)new aatj((aati)c, 0.75f, 1.0f));
        c.c((aarg)aato);
        c.e = (aaro)new aasz(c, aaux, 3);
        this.c = c;
        ((aatr)c).l = true;
        final aata e = new aata(resources, b, a2, acjq, aavf, adzx2, (byte[])null, (byte[])null, (byte[])null);
        ((aass)(this.e = e)).k(aavd.a(140.0f), a3, 0.0f);
        ((aatr)e).l = true;
        this.m((aatp)f);
        this.m((aatp)e);
        this.m((aatp)q);
        this.m((aatp)b2);
        this.m((aatp)j);
        this.m((aatp)c);
    }
    
    final void a(final boolean b) {
        ((aatr)this.e).l = (b ^ true);
    }
    
    public final void b() {
        float n;
        if (this.i) {
            n = this.b.b();
        }
        else {
            n = this.g;
        }
        final aaum j = this.j;
        final float k = (j.f - 38.0f) / 2.0f + n + 0.5f;
        ((aass)j).k(k - this.k, 0.0f, 0.0f);
        this.k = k;
    }
}
