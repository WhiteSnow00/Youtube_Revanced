import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ablu implements vne
{
    public String a;
    public Object b;
    private final int c;
    
    public ablu(final int c) {
        this.c = c;
        this.a = "";
    }
    
    public ablu(final aske aske, final aske aske2, final int c) {
        this.c = c;
        final aslm aslm = new aslm();
        aslm.c(aana.o(aske, (afax)abej.o).an(new abkh(this, 12), (asmi)abgj.i));
        aslm.c(aske2.an(new abkh(this, 13), (asmi)abgj.i));
    }
    
    public final void b(final ahcr ahcr) {
        if (this.c != 0) {
            if (this.b != null) {
                akne akne;
                if ((akne = ((aknh)ahcr.instance).c) == null) {
                    akne = akne.a;
                }
                final ahcr builder = ((ahcz)akne).toBuilder();
                final Object b = this.b;
                b.getClass();
                builder.copyOnWrite();
                final akne akne2 = (akne)builder.instance;
                akne2.k = (alxi)b;
                akne2.b |= 0x400;
                ahcr.copyOnWrite();
                final aknh aknh = (aknh)ahcr.instance;
                final akne c = (akne)builder.build();
                c.getClass();
                aknh.c = c;
                aknh.b |= 0x1;
            }
            final String a = this.a;
            if (a != null && !TextUtils.isEmpty((CharSequence)a)) {
                akne akne3;
                if ((akne3 = ((aknh)ahcr.instance).c) == null) {
                    akne3 = akne.a;
                }
                final ahcr builder2 = ((ahcz)akne3).toBuilder();
                final String a2 = this.a;
                a2.getClass();
                builder2.copyOnWrite();
                final akne akne4 = (akne)builder2.instance;
                akne4.d |= 0x100000;
                akne4.S = a2;
                ahcr.copyOnWrite();
                final aknh aknh2 = (aknh)ahcr.instance;
                final akne c2 = (akne)builder2.build();
                c2.getClass();
                aknh2.c = c2;
                aknh2.b |= 0x1;
            }
            return;
        }
        final Object b2 = this.b;
        if (b2 != null) {
            final ahbt c3 = (ahbt)b2;
            if (!c3.H()) {
                final ahcr builder3 = ((ahcz)akmy.a).createBuilder();
                builder3.copyOnWrite();
                final akmy akmy = (akmy)builder3.instance;
                akmy.b |= 0x1;
                akmy.c = c3;
                final akmy akmy2 = (akmy)builder3.build();
                ahcr.copyOnWrite();
                final aknh aknh3 = (aknh)ahcr.instance;
                final aknh a3 = aknh.a;
                akmy2.getClass();
                final ahdp k = aknh3.k;
                if (!k.c()) {
                    aknh3.k = ahcz.mutableCopy(k);
                }
                aknh3.k.add((Object)akmy2);
            }
        }
    }
}
