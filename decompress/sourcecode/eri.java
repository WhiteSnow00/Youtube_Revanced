import android.content.Context;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class eri implements atjj
{
    private final eqv a;
    private final eqn b;
    private final int c;
    private final erl d;
    
    public eri(final eqv a, final eqn b, final erl d, final int c, final byte[] array) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    @Override
    public final Object a() {
        final int c = this.c;
        if (c / 100 != 0) {
            Object o = null;
            switch (c) {
                default: {
                    throw new AssertionError(c);
                }
                case 105: {
                    o = aaiy.C(this.d.c);
                    break;
                }
                case 104: {
                    o = aais.j();
                    break;
                }
                case 103: {
                    o = aaiy.A((abxl)this.d.U.a());
                    break;
                }
                case 102: {
                    final ttj ttj = (ttj)this.d.Y.a();
                    final abtw abtw = (abtw)this.d.V.a();
                    final abxg abxg = (abxg)this.d.W.a();
                    o = wvl.j(ttj, abtw);
                    break;
                }
                case 101: {
                    o = aaiy.B((aboz)this.d.n.a());
                    break;
                }
                case 100: {
                    o = aazj.F((ttj)this.d.X.a());
                    break;
                }
            }
            return o;
        }
        Object o2 = null;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 2:
            case 99: {
                return o2;
            }
            case 98: {
                final Executor executor = (Executor)this.a.g.a();
                final abxc b = this.d.b;
                final oas oas = (oas)this.a.e.a();
                final arud arud = (arud)this.a.v.a();
                o2 = new abxg(executor, b, oas);
                return o2;
            }
            case 97: {
                o2 = aaiy.D();
                return o2;
            }
            case 96: {
                final oas oas2 = (oas)this.a.e.a();
                final erl d = this.d;
                o2 = new abxl(oas2, (PlaybackStartDescriptor)((arje)d.T).a, d.a);
                return o2;
            }
            case 95: {
                final Context context = (Context)this.a.c.a();
                o2 = this.d.S.a();
                o2.getClass();
                return o2;
            }
            case 94: {
                final Context context2 = (Context)this.a.c.a();
                o2 = this.d.R.a();
                o2.getClass();
                return o2;
            }
            case 93: {
                final Context context3 = (Context)this.a.c.a();
                o2 = this.d.Q.a();
                o2.getClass();
                return o2;
            }
            case 92: {
                final Context context4 = (Context)this.a.c.a();
                o2 = this.d.P.a();
                o2.getClass();
                return o2;
            }
            case 91: {
                final Context context5 = (Context)this.a.c.a();
                o2 = this.d.O.a();
                o2.getClass();
                return o2;
            }
            case 90: {
                final Context context6 = (Context)this.a.c.a();
                o2 = this.d.N.a();
                o2.getClass();
                return o2;
            }
            case 89: {
                final Context context7 = (Context)this.a.c.a();
                o2 = this.d.M.a();
                o2.getClass();
                return o2;
            }
            case 88: {
                o2 = atid.aD();
                return o2;
            }
            case 87: {
                o2 = atid.aD();
                return o2;
            }
            case 86: {
                o2 = atid.aD();
                return o2;
            }
            case 85: {
                o2 = atid.aD();
                return o2;
            }
            case 84: {
                o2 = atid.aD();
                return o2;
            }
            case 83: {
                o2 = atid.aD();
                return o2;
            }
            case 82: {
                o2 = atid.aD();
                return o2;
            }
            case 81: {
                final Context context8 = (Context)this.a.c.a();
                o2 = this.d.L.a();
                o2.getClass();
                return o2;
            }
            case 80: {
                final Context context9 = (Context)this.a.c.a();
                o2 = this.d.K.a();
                o2.getClass();
                return o2;
            }
            case 79: {
                final Context context10 = (Context)this.a.c.a();
                o2 = this.d.J.a();
                o2.getClass();
                return o2;
            }
            case 78: {
                final Context context11 = (Context)this.a.c.a();
                o2 = this.d.I.a();
                o2.getClass();
                return o2;
            }
            case 77: {
                final Context context12 = (Context)this.a.c.a();
                o2 = this.d.m.a();
                o2.getClass();
                return o2;
            }
            case 76: {
                final Context context13 = (Context)this.a.c.a();
                o2 = this.d.E.a();
                o2.getClass();
                return o2;
            }
            case 75: {
                final Context context14 = (Context)this.a.c.a();
                o2 = this.d.H.a();
                o2.getClass();
                return o2;
            }
            case 74: {
                final Context context15 = (Context)this.a.c.a();
                o2 = this.d.G.a();
                o2.getClass();
                return o2;
            }
            case 73: {
                final Context context16 = (Context)this.a.c.a();
                o2 = this.d.F.a();
                o2.getClass();
                return o2;
            }
            case 72: {
                final Context context17 = (Context)this.a.c.a();
                o2 = this.d.g.a();
                o2.getClass();
                return o2;
            }
            case 71: {
                final Context context18 = (Context)this.a.c.a();
                o2 = this.d.D.a();
                o2.getClass();
                return o2;
            }
            case 70: {
                final Context context19 = (Context)this.a.c.a();
                o2 = this.d.C.a();
                o2.getClass();
                return o2;
            }
            case 69: {
                final Context context20 = (Context)this.a.c.a();
                o2 = this.d.B.a();
                o2.getClass();
                return o2;
            }
            case 68: {
                final Context context21 = (Context)this.a.c.a();
                o2 = this.d.i.a();
                o2.getClass();
                return o2;
            }
            case 67: {
                final Context context22 = (Context)this.a.c.a();
                o2 = this.d.A.a();
                o2.getClass();
                return o2;
            }
            case 66: {
                final Context context23 = (Context)this.a.c.a();
                o2 = this.d.z.a();
                o2.getClass();
                return o2;
            }
            case 65: {
                final Context context24 = (Context)this.a.c.a();
                o2 = this.d.k.a();
                o2.getClass();
                return o2;
            }
            case 64: {
                final Context context25 = (Context)this.a.c.a();
                o2 = this.d.y.a();
                o2.getClass();
                return o2;
            }
            case 63: {
                final Context context26 = (Context)this.a.c.a();
                o2 = this.d.x.a();
                o2.getClass();
                return o2;
            }
            case 62: {
                final Context context27 = (Context)this.a.c.a();
                o2 = this.d.w.a();
                o2.getClass();
                return o2;
            }
            case 61: {
                final Context context28 = (Context)this.a.c.a();
                o2 = this.d.v.a();
                o2.getClass();
                return o2;
            }
            case 60: {
                final Context context29 = (Context)this.a.c.a();
                o2 = this.d.u.a();
                o2.getClass();
                return o2;
            }
            case 59: {
                final Context context30 = (Context)this.a.c.a();
                o2 = this.d.t.a();
                o2.getClass();
                return o2;
            }
            case 58: {
                final Context context31 = (Context)this.a.c.a();
                o2 = this.d.s.a();
                o2.getClass();
                return o2;
            }
            case 57: {
                final Context context32 = (Context)this.a.c.a();
                o2 = this.d.q.a();
                o2.getClass();
                return o2;
            }
            case 56: {
                final Context context33 = (Context)this.a.c.a();
                o2 = this.d.o.a();
                o2.getClass();
                return o2;
            }
            case 55: {
                o2 = atid.aD();
                return o2;
            }
            case 54: {
                o2 = atig.aD();
                return o2;
            }
            case 53: {
                o2 = ((asgt)this.d.K.a()).R();
                return o2;
            }
            case 52: {
                o2 = atig.aD();
                return o2;
            }
            case 51: {
                o2 = ((asgt)this.d.J.a()).R();
                return o2;
            }
            case 50: {
                o2 = atig.aD();
                return o2;
            }
            case 49: {
                o2 = ((asgt)this.d.I.a()).R();
                return o2;
            }
            case 48: {
                o2 = atig.aD();
                return o2;
            }
            case 47: {
                o2 = ((asgt)this.d.H.a()).R();
                return o2;
            }
            case 46: {
                o2 = atid.aD();
                return o2;
            }
            case 45: {
                o2 = ((asgt)this.d.G.a()).R();
                return o2;
            }
            case 44: {
                o2 = atid.aD();
                return o2;
            }
            case 43: {
                o2 = ((asgt)this.d.F.a()).R();
                return o2;
            }
            case 42: {
                o2 = atid.aD();
                return o2;
            }
            case 41: {
                o2 = ((asgt)this.d.E.a()).R();
                return o2;
            }
            case 40: {
                o2 = atid.aD();
                return o2;
            }
            case 39: {
                o2 = ((asgt)this.d.D.a()).R();
                return o2;
            }
            case 38: {
                o2 = atid.aD();
                return o2;
            }
            case 37: {
                o2 = ((asgt)this.d.C.a()).R();
                return o2;
            }
            case 36: {
                o2 = atid.aD();
                return o2;
            }
            case 35: {
                o2 = ((asgt)this.d.B.a()).R();
                return o2;
            }
            case 34: {
                o2 = atid.aD();
                return o2;
            }
            case 33: {
                o2 = ((asgt)this.d.A.a()).R();
                return o2;
            }
            case 32: {
                o2 = atid.aD();
                return o2;
            }
            case 31: {
                o2 = ((asgt)this.d.z.a()).R();
                return o2;
            }
            case 30: {
                o2 = atid.aD();
                return o2;
            }
            case 29: {
                o2 = ((asgt)this.d.y.a()).R();
                return o2;
            }
            case 28: {
                o2 = atid.aD();
                return o2;
            }
            case 27: {
                o2 = ((asgt)this.d.x.a()).R();
                return o2;
            }
            case 26: {
                o2 = atid.aD();
                return o2;
            }
            case 25: {
                o2 = ((asgt)this.d.w.a()).R();
                return o2;
            }
            case 24: {
                o2 = atid.aD();
                return o2;
            }
            case 23: {
                o2 = absy.d((atid)this.d.v.a());
                return o2;
            }
            case 22: {
                o2 = atid.aD();
                return o2;
            }
            case 21: {
                o2 = ((asgt)this.d.u.a()).R();
                return o2;
            }
            case 20: {
                o2 = atid.aD();
                return o2;
            }
            case 19: {
                o2 = ((asgt)this.d.t.a()).R();
                return o2;
            }
            case 18: {
                o2 = atid.aD();
                return o2;
            }
            case 17: {
                o2 = ((asgt)this.d.s.a()).R();
                return o2;
            }
            case 16: {
                o2 = atid.aD();
                return o2;
            }
            case 15: {
                o2 = ((asgt)this.d.r.a()).R();
                return o2;
            }
            case 14: {
                o2 = atid.aD();
                return o2;
            }
            case 13: {
                o2 = ((asgt)this.d.q.a()).R();
                return o2;
            }
            case 12: {
                o2 = aajk.a((asgt)this.d.p.a(), (agkb)this.b.d.a());
                return o2;
            }
            case 11: {
                o2 = atid.aD();
                return o2;
            }
            case 10: {
                o2 = ((asgt)this.d.o.a()).R();
                return o2;
            }
            case 9: {
                o2 = atjd.af();
                return o2;
            }
            case 8: {
                o2 = atid.aD();
                return o2;
            }
            case 7: {
                o2 = ((asgt)this.d.k.a()).R();
                return o2;
            }
            case 6: {
                o2 = atid.aD();
                return o2;
            }
            case 5: {
                o2 = ((asgt)this.d.i.a()).R();
                return o2;
            }
            case 4: {
                o2 = atid.aD();
                return o2;
            }
            case 3: {
                o2 = ((asgt)this.d.g.a()).R();
                return o2;
            }
            case 1: {
                o2 = new abpj((aafi)this.a.dI.a(), (thh)this.a.P.a(), (zgv)this.a.bj.a(), this.a.bN(), (Executor)this.a.r.a(), (aajj)this.a.qb.a(), (wvu)this.a.aw.a(), (arud)this.a.v.a(), this.a.bO(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                return o2;
            }
            case 0: {
                final abou abou = (abou)this.a.qa.a();
                final abpj abpj = (abpj)this.d.e.a();
                final abpe j = this.d.j();
                final abpn bo = this.a.bo();
                final erl d2 = this.d;
                final eqv d3 = d2.d;
                o2 = abjj.e(abou, abpj, j, bo, new abpj(d3.r, d3.P, d3.aw, d3.qc, d3.e, ((eqn)d2.Z).a, d3.dZ, d2.f, d3.eb), (arud)this.a.v.a(), (abpj)this.a.eb.a(), (asgt)this.d.h.a(), (abhr)this.b.b.a(), (asgt)this.d.j.a(), (asgt)this.d.l.a(), (ashp)this.d.m.a());
                ((aboz)o2).f();
                return o2;
            }
        }
    }
}
