import java.util.concurrent.TimeUnit;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyl extends fnh implements fwx, fjo
{
    public static final long a;
    public final acue b;
    public final oas c;
    public final aum d;
    public final elw e;
    public final c f;
    private final fjp g;
    
    static {
        a = TimeUnit.HOURS.toMillis(1L);
    }
    
    public kyl(final qv qv, final fjp g, final elw e, final oas c, final c f, final acue b, final aum d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(qv, (byte[])null, (byte[])null);
        this.g = g;
        this.e = e;
        this.c = c;
        this.f = f;
        this.b = b;
        this.d = d;
    }
    
    public final int c() {
        throw null;
    }
    
    public final void d() {
    }
    
    public final void e() {
        throw null;
    }
    
    public final void lV() {
        this.g.n((fjo)this);
    }
    
    public final void oL(final fkk fkk, final fkk fkk2) {
        if (fkk2 == fkk.c && fkk != fkk.a) {
            tcp.o(this.d, ((tku)this.f.a).a(), (trb)jpn.u, (trb)new kpx(this, 4));
        }
    }
    
    public final void qB() {
        this.g.l((fjo)this);
    }
}
