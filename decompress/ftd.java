import java.util.concurrent.Executor;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftd implements omj
{
    public final Object a;
    private final int b;
    
    public ftd(final fsh a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public ftd(final hft a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public ftd(final hft a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
    }
    
    public ftd(final hft a, final int b, final char[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public ftd(final otc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ftd(final pvh a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = b;
        this.a = a;
    }
    
    public ftd(final zes a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final dsr a(final dsx dsx, final oti d, final MessageLite messageLite, final agnu agnu, final List a) {
        final int b = this.b;
        int f = 3;
        final CommandOuterClass$Command commandOuterClass$Command = null;
        final ovw ovw = null;
        final String s = null;
        final CommandOuterClass$Command commandOuterClass$Command2 = null;
        if (b == 0) {
            final Object a2 = this.a;
            final aqnx aqnx = (aqnx)messageLite;
            int f2;
            if ((aqnx.c & 0x8) != 0x0) {
                f2 = aqnx.f;
            }
            else {
                f2 = 1;
            }
            int intValue;
            if (aqnx.d == 2) {
                intValue = (int)aqnx.e;
            }
            else {
                intValue = 0;
            }
            final int c = aqnx.c;
            final boolean b2 = (c & 0x40) == 0x0 || aqnx.g;
            CommandOuterClass$Command g;
            if ((c & 0x80) != 0x0) {
                if ((g = aqnx.h) == null) {
                    g = CommandOuterClass$Command.getDefaultInstance();
                }
            }
            else {
                g = null;
            }
            String i = s;
            if ((aqnx.c & 0x100) != 0x0) {
                i = aqnx.i;
            }
            final fta fta = new fta();
            fta.c(fta, dsx, new ftb());
            fta.a.f = f2 - 1;
            fta.d.set(3);
            fta.a.c = intValue;
            fta.d.set(1);
            final ftb a3 = fta.a;
            a3.d = b2;
            final hft hft = (hft)a2;
            a3.b = (arkg)hft.b;
            fta.d.set(0);
            final ftb a4 = fta.a;
            a4.g = g;
            a4.e = (oum)hft.a;
            fta.d.set(2);
            fta.a.a = i;
            return (dsr)fta;
        }
        if (b == 1) {
            final Object a5 = this.a;
            final amly amly = (amly)messageLite;
            final hft hft2 = (hft)a5;
            final Object b3 = hft2.b;
            final Object a6 = hft2.a;
            final fst fst = new fst();
            fst.c(fst, dsx, new fsv());
            fst.a.a = (oby)b3;
            fst.d.set(0);
            fst.a.c = amly.c;
            fst.d.set(2);
            fst.a.b = (abpu)a6;
            fst.d.set(1);
            return (dsr)fst;
        }
        if (b != 2) {
            if (b == 3) {
                final Object a7 = this.a;
                final anck anck = (anck)messageLite;
                CommandOuterClass$Command d2;
                if ((anck.c & 0x8) != 0x0) {
                    if ((d2 = anck.d) == null) {
                        d2 = CommandOuterClass$Command.getDefaultInstance();
                    }
                }
                else {
                    d2 = null;
                }
                CommandOuterClass$Command c2 = commandOuterClass$Command;
                if ((anck.c & 0x10) != 0x0 && (c2 = anck.e) == null) {
                    c2 = CommandOuterClass$Command.getDefaultInstance();
                }
                fsx fsx;
                if (d2 != null && c2 != null) {
                    fsx = fsy.b(dsx);
                    final fsy a8 = fsx.a;
                    a8.d = d2;
                    a8.c = c2;
                    final hft hft3 = (hft)a7;
                    fsx.f((abpu)hft3.b);
                    fsx.d((arkg)hft3.a);
                    fsx.e(new asiq());
                }
                else {
                    fsx = fsy.b(dsx);
                    final hft hft4 = (hft)a7;
                    fsx.f((abpu)hft4.b);
                    fsx.d((arkg)hft4.a);
                    fsx.e(new asiq());
                }
                return (dsr)fsx;
            }
            if (b == 4) {
                final Object a9 = this.a;
                final aqmp aqmp = (aqmp)messageLite;
                final arjy arjy = new arjy();
                int as;
                if (mdp.q(agnu, arjy)) {
                    as = arjy.as();
                }
                else {
                    as = 0;
                }
                CommandOuterClass$Command e;
                if ((aqmp.c & 0x2) != 0x0) {
                    if ((e = aqmp.e) == null) {
                        e = CommandOuterClass$Command.getDefaultInstance();
                    }
                }
                else {
                    e = null;
                }
                CommandOuterClass$Command d3 = commandOuterClass$Command2;
                if ((aqmp.c & 0x1) != 0x0 && (d3 = aqmp.d) == null) {
                    d3 = CommandOuterClass$Command.getDefaultInstance();
                }
                final frr frr = new frr();
                frr.c(frr, dsx, new frs());
                final Object a10 = ((pvh)a9).a;
                final frs a11 = frr.a;
                a11.b = (arkg)a10;
                a11.a = a;
                frr.d.set(0);
                frr.a.c = d;
                frr.d.set(1);
                if (as != 1) {
                    if (as != 2) {
                        if (as != 4) {
                            f = 1;
                        }
                        else {
                            f = 2;
                        }
                    }
                    else {
                        f = 4;
                    }
                }
                frr.a.f = f;
                frr.d.set(2);
                final frs a12 = frr.a;
                a12.e = e;
                a12.d = d3;
                return (dsr)frr;
            }
            if (b != 5) {
                final Object a13 = this.a;
                final aqmr a14 = (aqmr)messageLite;
                final adfa adfa = new adfa();
                adfa.c(adfa, dsx, new adfb());
                adfa.a.a = a14;
                adfa.d.set(0);
                adfa.a.b = (otc)a13;
                adfa.d.set(1);
                return (dsr)adfa;
            }
            final Object a15 = this.a;
            final aqoa c3 = (aqoa)messageLite;
            final zeo zeo = new zeo();
            zeo.c(zeo, dsx, new zer());
            final zes zes = (zes)a15;
            zeo.a.a = zes.a;
            zeo.d.set(1);
            zeo.a.C = c3;
            zeo.d.set(15);
            CommandOuterClass$Command a16;
            if ((a16 = c3.f) == null) {
                a16 = CommandOuterClass$Command.getDefaultInstance();
            }
            zeo.a.A = a16;
            zeo.d.set(10);
            CommandOuterClass$Command b4;
            if ((b4 = c3.g) == null) {
                b4 = CommandOuterClass$Command.getDefaultInstance();
            }
            zeo.a.B = b4;
            zeo.d.set(11);
            CommandOuterClass$Command z;
            if ((z = c3.h) == null) {
                z = CommandOuterClass$Command.getDefaultInstance();
            }
            zeo.a.z = z;
            zeo.d.set(9);
            zeo.a.D = zes.b;
            zeo.d.set(17);
            zeo.a.g = zes.c;
            zeo.d.set(7);
            zeo.a.b = d;
            zeo.d.set(2);
            zeo.a.I = zes.m;
            zeo.d.set(12);
            zeo.a.H = zes.l;
            zeo.d.set(14);
            zeo.a.E = zes.d;
            zeo.d.set(18);
            zeo.a.J = zes.n;
            zeo.d.set(16);
            zeo.a.f = zes.e;
            zeo.d.set(6);
            zeo.a.c = zes.f;
            zeo.d.set(3);
            zeo.a.d = zes.g;
            zeo.d.set(4);
            zeo.a.e = zes.h;
            zeo.d.set(5);
            zeo.a.K = zes.o;
            zeo.d.set(0);
            zeo.a.F = zes.i;
            zeo.d.set(19);
            zeo.a.G = zes.k;
            zeo.d.set(13);
            zeo.a.y = zes.j;
            zeo.d.set(8);
            return (dsr)zeo;
        }
        else {
            final Object a17 = this.a;
            final aqgl b5 = (aqgl)messageLite;
            final fsh fsh = (fsh)a17;
            final Object b6 = fsh.b;
            final Object d4 = fsh.d;
            final Object a18 = fsh.a;
            final Object g2 = fsh.g;
            final Object f3 = fsh.f;
            final Object c4 = fsh.c;
            final Object e2 = fsh.e;
            if ((b5.c & 0x1) != 0x0) {
                aqgi aqgi;
                if ((aqgi = b5.d) == null) {
                    aqgi = aqgi.a;
                }
                final int j = aqsx.I(aqgi.f);
                ovw a19 = null;
                Label_1299: {
                    Label_1285: {
                        if (j != 0) {
                            if (j == 5) {
                                break Label_1285;
                            }
                        }
                        aqgi aqgi2;
                        if ((aqgi2 = b5.d) == null) {
                            aqgi2 = aqgi.a;
                        }
                        final int k = aqsx.I(aqgi2.f);
                        if (k == 0) {
                            a19 = ovw;
                            break Label_1299;
                        }
                        a19 = ovw;
                        if (k != 4) {
                            break Label_1299;
                        }
                    }
                    a19 = new ovw((CommandOuterClass$Command)null, (CommandOuterClass$Command)null, (otc)b6, (Object)b5);
                }
                final fru fru = new fru();
                fru.c(fru, dsx, new frw());
                fru.a.B = b5;
                fru.d.set(8);
                fru.a.z = (oum)d4;
                fru.d.set(7);
                fru.a.g = (acgs)a18;
                fru.d.set(5);
                fru.a.e = (Executor)g2;
                fru.d.set(3);
                fru.a.d = d;
                fru.d.set(2);
                fru.a.c = (otc)b6;
                fru.d.set(1);
                final frw a20 = fru.a;
                a20.a = a19;
                a20.A = (zjp)f3;
                a20.f = (acge)c4;
                fru.d.set(4);
                fru.a.b = (oby)e2;
                fru.d.set(0);
                fru.a.y = d.g;
                fru.d.set(6);
                return (dsr)fru;
            }
            throw new ouo("ImageZoomType.image missing");
        }
    }
}
