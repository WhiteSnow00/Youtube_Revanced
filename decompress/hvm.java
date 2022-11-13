import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvm implements vmj
{
    public final pvh a;
    private final vnu b;
    private final atke c;
    private final atke d;
    private final aezp f;
    private final wyw g;
    private final Optional h;
    private final vai i;
    private final arwh j;
    
    public hvm(final vnu b, final pvh a, final atke c, final arwh j, final atke d, final aezp f, final wyw g, final vai i, final Optional h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        b.getClass();
        this.b = b;
        this.a = a;
        c.getClass();
        this.c = c;
        this.j = j;
        this.d = d;
        this.f = f;
        this.g = g;
        this.i = i;
        this.h = h;
    }
    
    public final vls a(final acaa acaa) {
        final vns d = this.b.d(acaa);
        hzc.n(this.c, d);
        hzc.q(d, this.d, this.j);
        if (this.h.isPresent()) {
            ((vkk)d).v = (tlu)this.h.get();
        }
        final aezp f = this.f;
        if (f.h()) {
            ((syx)f.c()).a(d);
        }
        final InteractionLoggingScreen a = this.g.a();
        if (this.i.O() && a != null) {
            ((vkk)d).m(a.a);
        }
        return (vls)d;
    }
    
    public final void b(final vls vls, final vmi vmi, final zpf zpf) {
        this.b.b(vls, vmi, (zpf)new hvl(this, zpf, 0));
    }
}
