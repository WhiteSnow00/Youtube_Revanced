import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawi extends aass
{
    public final aatt a;
    public final aaue b;
    public final aarq c;
    public final float[] e;
    public final Bitmap f;
    public long g;
    public long h;
    public float i;
    public float j;
    public ControlsOverlayStyle k;
    public boolean m;
    
    public aawi(final atnb atnb, final atnb atnb2, final aavf aavf, final adzx adzx, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = new float[3];
        final aatt a = new aatt(atnb, new int[] { -1695465, -5723992, -1 }, 38.0f, aavf.a(), (aats)new aawh(this, adzx, (byte[])null, (byte[])null, (byte[])null));
        this.a = a;
        final Bitmap c = aavd.c();
        aavd.h(this.f = c, twd.j(this.g / 1000L));
        final aaue b = new aaue(c, aave.a(aavd.a(71.0f), aavd.a(30.0f), aave.c), aavf.a(), atnb2);
        (this.b = b).a((aarg)new aatj((aati)b, 0.0f, 1.0f));
        b.k(-a.h / 2.0f, aavd.a(35.0f), 0.0f);
        final aave c2 = aave.c(aavd.a(8.0f));
        final aarq c3 = new aarq(c2, aavf.a(), aarq.s(aarq.h(-1695465), c2.f), atnb);
        (this.c = c3).k(-a.h / 2.0f, 0.0f, 0.0f);
        c3.a((aarg)new aatj((aati)c3, 0.0f, 1.0f));
        c3.a((aarg)new aato((aatn)c3, aato.b(0.0f), aato.b(1.0f)));
        this.m((aatp)a);
        this.m((aatp)c3);
        this.m((aatp)b);
    }
    
    public final boolean a() {
        return this.m && this.k != ControlsOverlayStyle.k;
    }
    
    public final void p(final foq foq) {
        super.p(foq);
        final boolean i = this.a.i();
        this.b.b = i;
        this.c.b = i;
    }
}
