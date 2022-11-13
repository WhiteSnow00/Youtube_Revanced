import java.util.Iterator;
import java.util.function.Consumer;
import android.media.AudioDeviceInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iuc implements asjm
{
    public final iuh a;
    
    public iuc(final iuh a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final iuh a = this.a;
        final iuf iuf = (iuf)o;
        final ahaz builder = andb.a.createBuilder();
        final boolean c = a.f.c();
        builder.copyOnWrite();
        final andb andb = (andb)builder.instance;
        final int b = andb.b;
        int n = 1;
        andb.b = (b | 0x1);
        andb.c = c;
        final boolean d = a.f.d();
        builder.copyOnWrite();
        final andb andb2 = (andb)builder.instance;
        andb2.b |= 0x2;
        andb2.d = d;
        final andb f = (andb)builder.build();
        final iue a2 = iuf.a();
        final ahaz builder2 = andc.a.createBuilder();
        final boolean d2 = a2.a.d;
        builder2.copyOnWrite();
        final andc andc = (andc)builder2.instance;
        andc.b |= 0x1;
        andc.c = d2;
        final boolean i = a.e.i;
        builder2.copyOnWrite();
        final andc andc2 = (andc)builder2.instance;
        andc2.b |= 0x2;
        andc2.d = i;
        final boolean e = a2.a.e;
        builder2.copyOnWrite();
        final andc andc3 = (andc)builder2.instance;
        andc3.b |= 0x4;
        andc3.e = e;
        builder2.copyOnWrite();
        final andc andc4 = (andc)builder2.instance;
        f.getClass();
        andc4.f = f;
        andc4.b |= 0x8;
        final int b2 = a2.b;
        if (b2 != 0) {
            switch (b2) {
                case 10: {
                    n = 11;
                    break;
                }
                case 9: {
                    n = 10;
                    break;
                }
                case 8: {
                    n = 9;
                    break;
                }
                case 7: {
                    n = 8;
                    break;
                }
                case 6: {
                    n = 7;
                    break;
                }
                case 5: {
                    n = 6;
                    break;
                }
                case 4: {
                    n = 5;
                    break;
                }
                case 3: {
                    n = 4;
                    break;
                }
                case 2: {
                    n = 3;
                    break;
                }
            }
        }
        else {
            n = 2;
        }
        builder2.copyOnWrite();
        final andc andc5 = (andc)builder2.instance;
        andc5.h = n - 1;
        andc5.b |= 0x20;
        final boolean powerSaveMode = a.d.isPowerSaveMode();
        builder2.copyOnWrite();
        final andc andc6 = (andc)builder2.instance;
        andc6.b |= 0x80;
        andc6.j = powerSaveMode;
        Label_0667: {
            if (a.i) {
                while (true) {
                    for (final AudioDeviceInfo audioDeviceInfo : a2.a.b) {
                        andg andg;
                        if (audioDeviceInfo.getType() != 3 && audioDeviceInfo.getType() != 4 && audioDeviceInfo.getType() != 22) {
                            if (audioDeviceInfo.getType() != 8 && audioDeviceInfo.getType() != 7) {
                                continue;
                            }
                            andg = andg.d;
                        }
                        else {
                            andg = andg.c;
                        }
                        builder2.copyOnWrite();
                        final andc andc7 = (andc)builder2.instance;
                        andc7.g = andg.e;
                        andc7.b |= 0x10;
                        break Label_0667;
                    }
                    andg andg = andg.b;
                    continue;
                }
            }
            a2.a.a.ifPresent((Consumer)new inj(builder2, 5));
        }
        final boolean deviceIdleMode = a.d.isDeviceIdleMode();
        builder2.copyOnWrite();
        final andc andc8 = (andc)builder2.instance;
        andc8.b |= 0x40;
        andc8.i = deviceIdleMode;
        final andd a3 = iuf.b().a();
        final ajdz f2 = a.b.f();
        ((ahaz)a3).copyOnWrite();
        ande.f((ande)a3.instance, f2);
        ((ahaz)a3).copyOnWrite();
        ande.e((ande)a3.instance, (andc)builder2.build());
        final String c2 = a2.a.c;
        if (c2 != null) {
            ((ahaz)a3).copyOnWrite();
            ande.g((ande)a3.instance, c2);
        }
        final aknr d3 = aknt.d();
        ((ahaz)d3).copyOnWrite();
        aknt.bi((aknt)d3.instance, (ande)((ahaz)a3).build());
        a.a.d((aknt)((ahaz)d3).build());
    }
}
