// 
// Decompiled by Procyon v0.6.0
// 

public final class abgu implements abkd
{
    public aexq a;
    private final tku b;
    private aexq c;
    private final arud d;
    
    public abgu(final arud d, final tku b, final byte[] array, final byte[] array2) {
        this.d = d;
        this.b = b;
        final aewp a = aewp.a;
        this.c = a;
        this.a = a;
    }
    
    private final void c() {
        synchronized (this) {
            if (!this.c.h()) {
                return;
            }
            ((asic)this.c.c()).dispose();
            final aewp a = aewp.a;
            this.c = a;
            this.a = a;
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (this.c.h()) {
                return;
            }
            this.c = aexq.k((Object)this.b.d().R().al((asix)new abgn(this, 4)));
        }
    }
    
    public final void sA(final abkg abkg) {
        amdv amdv;
        if ((amdv = this.d.f().i) == null) {
            amdv = amdv.a;
        }
        amdw amdw;
        if ((amdw = amdv.j) == null) {
            amdw = amdw.a;
        }
        if (amdw.g > 0) {
            if (!this.c.h()) {
                this.b();
            }
        }
        else if (this.c.h()) {
            this.c();
        }
        if (this.c.h() && this.a.h()) {
            final aqnz aqnz = (aqnz)this.a.d((aeyr)ypg.l);
            final agza builder = ((agzi)akvd.a).createBuilder();
            aply aply;
            if ((aply = aply.b(aqnz.j)) == null) {
                aply = aply.a;
            }
            builder.copyOnWrite();
            final akvd akvd = (akvd)builder.instance;
            akvd.d = aply.e;
            akvd.b |= 0x2;
            aply aply2;
            if ((aply2 = aply.b(aqnz.i)) == null) {
                aply2 = aply.a;
            }
            builder.copyOnWrite();
            final akvd akvd2 = (akvd)builder.instance;
            akvd2.c = aply2.e;
            akvd2.b |= 0x1;
            final long k = aqnz.k;
            builder.copyOnWrite();
            final akvd akvd3 = (akvd)builder.instance;
            akvd3.b |= 0x4;
            akvd3.e = k;
            final akvd d = (akvd)builder.build();
            abkg.D = d;
            abkg.w((abkf)new abgt(d, 0));
        }
    }
}
