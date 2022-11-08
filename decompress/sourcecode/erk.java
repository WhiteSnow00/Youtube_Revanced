import android.content.Context;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class erk implements atjj
{
    private final eqv a;
    private final eqk b;
    private final erl c;
    private final int d;
    
    public erk(final eqv a, final eqk b, final erl c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final Object a() {
        final int d = this.d;
        if (d / 100 != 0) {
            Object o = null;
            switch (d) {
                default: {
                    throw new AssertionError(d);
                }
                case 105: {
                    o = aaiy.C(this.c.c);
                    break;
                }
                case 104: {
                    o = aais.j();
                    break;
                }
                case 103: {
                    o = aaiy.A((abxl)this.c.U.a());
                    break;
                }
                case 102: {
                    final ttj ttj = (ttj)this.c.Y.a();
                    final abtw abtw = (abtw)this.c.V.a();
                    final abxg abxg = (abxg)this.c.W.a();
                    o = wvl.j(ttj, abtw);
                    break;
                }
                case 101: {
                    o = aaiy.B((aboz)this.c.n.a());
                    break;
                }
                case 100: {
                    o = aazj.F((ttj)this.c.X.a());
                    break;
                }
            }
            return o;
        }
        Object o2 = null;
        switch (d) {
            default: {
                throw new AssertionError(d);
            }
            case 2:
            case 99: {
                return o2;
            }
            case 98: {
                final Executor executor = (Executor)this.a.g.a();
                final abxc b = this.c.b;
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
                final erl c = this.c;
                o2 = new abxl(oas2, (PlaybackStartDescriptor)((arje)c.T).a, c.a);
                return o2;
            }
            case 95: {
                final Context context = (Context)this.a.c.a();
                o2 = this.c.S.a();
                o2.getClass();
                return o2;
            }
            case 94: {
                final Context context2 = (Context)this.a.c.a();
                o2 = this.c.R.a();
                o2.getClass();
                return o2;
            }
            case 93: {
                final Context context3 = (Context)this.a.c.a();
                o2 = this.c.Q.a();
                o2.getClass();
                return o2;
            }
            case 92: {
                final Context context4 = (Context)this.a.c.a();
                o2 = this.c.P.a();
                o2.getClass();
                return o2;
            }
            case 91: {
                final Context context5 = (Context)this.a.c.a();
                o2 = this.c.O.a();
                o2.getClass();
                return o2;
            }
            case 90: {
                final Context context6 = (Context)this.a.c.a();
                o2 = this.c.N.a();
                o2.getClass();
                return o2;
            }
            case 89: {
                final Context context7 = (Context)this.a.c.a();
                o2 = this.c.M.a();
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
                o2 = this.c.L.a();
                o2.getClass();
                return o2;
            }
            case 80: {
                final Context context9 = (Context)this.a.c.a();
                o2 = this.c.K.a();
                o2.getClass();
                return o2;
            }
            case 79: {
                final Context context10 = (Context)this.a.c.a();
                o2 = this.c.J.a();
                o2.getClass();
                return o2;
            }
            case 78: {
                final Context context11 = (Context)this.a.c.a();
                o2 = this.c.I.a();
                o2.getClass();
                return o2;
            }
            case 77: {
                final Context context12 = (Context)this.a.c.a();
                o2 = this.c.m.a();
                o2.getClass();
                return o2;
            }
            case 76: {
                final Context context13 = (Context)this.a.c.a();
                o2 = this.c.E.a();
                o2.getClass();
                return o2;
            }
            case 75: {
                final Context context14 = (Context)this.a.c.a();
                o2 = this.c.H.a();
                o2.getClass();
                return o2;
            }
            case 74: {
                final Context context15 = (Context)this.a.c.a();
                o2 = this.c.G.a();
                o2.getClass();
                return o2;
            }
            case 73: {
                final Context context16 = (Context)this.a.c.a();
                o2 = this.c.F.a();
                o2.getClass();
                return o2;
            }
            case 72: {
                final Context context17 = (Context)this.a.c.a();
                o2 = this.c.g.a();
                o2.getClass();
                return o2;
            }
            case 71: {
                final Context context18 = (Context)this.a.c.a();
                o2 = this.c.D.a();
                o2.getClass();
                return o2;
            }
            case 70: {
                final Context context19 = (Context)this.a.c.a();
                o2 = this.c.C.a();
                o2.getClass();
                return o2;
            }
            case 69: {
                final Context context20 = (Context)this.a.c.a();
                o2 = this.c.B.a();
                o2.getClass();
                return o2;
            }
            case 68: {
                final Context context21 = (Context)this.a.c.a();
                o2 = this.c.i.a();
                o2.getClass();
                return o2;
            }
            case 67: {
                final Context context22 = (Context)this.a.c.a();
                o2 = this.c.A.a();
                o2.getClass();
                return o2;
            }
            case 66: {
                final Context context23 = (Context)this.a.c.a();
                o2 = this.c.z.a();
                o2.getClass();
                return o2;
            }
            case 65: {
                final Context context24 = (Context)this.a.c.a();
                o2 = this.c.k.a();
                o2.getClass();
                return o2;
            }
            case 64: {
                final Context context25 = (Context)this.a.c.a();
                o2 = this.c.y.a();
                o2.getClass();
                return o2;
            }
            case 63: {
                final Context context26 = (Context)this.a.c.a();
                o2 = this.c.x.a();
                o2.getClass();
                return o2;
            }
            case 62: {
                final Context context27 = (Context)this.a.c.a();
                o2 = this.c.w.a();
                o2.getClass();
                return o2;
            }
            case 61: {
                final Context context28 = (Context)this.a.c.a();
                o2 = this.c.v.a();
                o2.getClass();
                return o2;
            }
            case 60: {
                final Context context29 = (Context)this.a.c.a();
                o2 = this.c.u.a();
                o2.getClass();
                return o2;
            }
            case 59: {
                final Context context30 = (Context)this.a.c.a();
                o2 = this.c.t.a();
                o2.getClass();
                return o2;
            }
            case 58: {
                final Context context31 = (Context)this.a.c.a();
                o2 = this.c.s.a();
                o2.getClass();
                return o2;
            }
            case 57: {
                final Context context32 = (Context)this.a.c.a();
                o2 = this.c.q.a();
                o2.getClass();
                return o2;
            }
            case 56: {
                final Context context33 = (Context)this.a.c.a();
                o2 = this.c.o.a();
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
                o2 = ((asgt)this.c.K.a()).R();
                return o2;
            }
            case 52: {
                o2 = atig.aD();
                return o2;
            }
            case 51: {
                o2 = ((asgt)this.c.J.a()).R();
                return o2;
            }
            case 50: {
                o2 = atig.aD();
                return o2;
            }
            case 49: {
                o2 = ((asgt)this.c.I.a()).R();
                return o2;
            }
            case 48: {
                o2 = atig.aD();
                return o2;
            }
            case 47: {
                o2 = ((asgt)this.c.H.a()).R();
                return o2;
            }
            case 46: {
                o2 = atid.aD();
                return o2;
            }
            case 45: {
                o2 = ((asgt)this.c.G.a()).R();
                return o2;
            }
            case 44: {
                o2 = atid.aD();
                return o2;
            }
            case 43: {
                o2 = ((asgt)this.c.F.a()).R();
                return o2;
            }
            case 42: {
                o2 = atid.aD();
                return o2;
            }
            case 41: {
                o2 = ((asgt)this.c.E.a()).R();
                return o2;
            }
            case 40: {
                o2 = atid.aD();
                return o2;
            }
            case 39: {
                o2 = ((asgt)this.c.D.a()).R();
                return o2;
            }
            case 38: {
                o2 = atid.aD();
                return o2;
            }
            case 37: {
                o2 = ((asgt)this.c.C.a()).R();
                return o2;
            }
            case 36: {
                o2 = atid.aD();
                return o2;
            }
            case 35: {
                o2 = ((asgt)this.c.B.a()).R();
                return o2;
            }
            case 34: {
                o2 = atid.aD();
                return o2;
            }
            case 33: {
                o2 = ((asgt)this.c.A.a()).R();
                return o2;
            }
            case 32: {
                o2 = atid.aD();
                return o2;
            }
            case 31: {
                o2 = ((asgt)this.c.z.a()).R();
                return o2;
            }
            case 30: {
                o2 = atid.aD();
                return o2;
            }
            case 29: {
                o2 = ((asgt)this.c.y.a()).R();
                return o2;
            }
            case 28: {
                o2 = atid.aD();
                return o2;
            }
            case 27: {
                o2 = ((asgt)this.c.x.a()).R();
                return o2;
            }
            case 26: {
                o2 = atid.aD();
                return o2;
            }
            case 25: {
                o2 = ((asgt)this.c.w.a()).R();
                return o2;
            }
            case 24: {
                o2 = atid.aD();
                return o2;
            }
            case 23: {
                o2 = absy.d((atid)this.c.v.a());
                return o2;
            }
            case 22: {
                o2 = atid.aD();
                return o2;
            }
            case 21: {
                o2 = ((asgt)this.c.u.a()).R();
                return o2;
            }
            case 20: {
                o2 = atid.aD();
                return o2;
            }
            case 19: {
                o2 = ((asgt)this.c.t.a()).R();
                return o2;
            }
            case 18: {
                o2 = atid.aD();
                return o2;
            }
            case 17: {
                o2 = ((asgt)this.c.s.a()).R();
                return o2;
            }
            case 16: {
                o2 = atid.aD();
                return o2;
            }
            case 15: {
                o2 = ((asgt)this.c.r.a()).R();
                return o2;
            }
            case 14: {
                o2 = atid.aD();
                return o2;
            }
            case 13: {
                o2 = ((asgt)this.c.q.a()).R();
                return o2;
            }
            case 12: {
                o2 = aajk.a((asgt)this.c.p.a(), (agkb)this.b.d.a());
                return o2;
            }
            case 11: {
                o2 = atid.aD();
                return o2;
            }
            case 10: {
                o2 = ((asgt)this.c.o.a()).R();
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
                o2 = ((asgt)this.c.k.a()).R();
                return o2;
            }
            case 6: {
                o2 = atid.aD();
                return o2;
            }
            case 5: {
                o2 = ((asgt)this.c.i.a()).R();
                return o2;
            }
            case 4: {
                o2 = atid.aD();
                return o2;
            }
            case 3: {
                o2 = ((asgt)this.c.g.a()).R();
                return o2;
            }
            case 1: {
                o2 = new abpj((aafi)this.a.dI.a(), (thh)this.a.P.a(), (zgv)this.a.bj.a(), this.a.bN(), (Executor)this.a.r.a(), (aajj)this.a.qb.a(), (wvu)this.a.aw.a(), (arud)this.a.v.a(), this.a.bO(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                return o2;
            }
            case 0: {
                final abou abou = (abou)this.a.qa.a();
                final abpj abpj = (abpj)this.c.e.a();
                final abpe j = this.c.j();
                final abpn bo = this.a.bo();
                final erl c2 = this.c;
                final eqv d2 = c2.d;
                o2 = abjj.e(abou, abpj, j, bo, new abpj(d2.r, d2.P, d2.aw, d2.qc, d2.e, ((eqk)c2.Z).c, d2.dZ, c2.f, d2.eb), (arud)this.a.v.a(), (abpj)this.a.eb.a(), (asgt)this.c.h.a(), (abhr)this.b.a.a(), (asgt)this.c.j.a(), (asgt)this.c.l.a(), (ashp)this.c.m.a());
                ((aboz)o2).f();
                return o2;
            }
        }
    }
}
