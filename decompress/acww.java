import android.content.res.Resources$NotFoundException;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acww
{
    private static final afgm a;
    
    static {
        final afgj afgj = new afgj();
        final aouq b = aouq.b;
        final Integer value = 2130970843;
        afgj.g(b, value);
        afgj.g(aouq.c, 2130970856);
        afgj.g(aouq.d, 2130970857);
        afgj.g(aouq.f, 2130970895);
        afgj.g(aouq.g, 2130970852);
        afgj.g(aouq.h, 2130970922);
        afgj.g(aouq.i, 2130970924);
        final aouq j = aouq.j;
        final Integer value2 = 2130970920;
        afgj.g(j, value2);
        afgj.g(aouq.k, 2130970894);
        afgj.g(aouq.o, 2130970848);
        afgj.g(aouq.q, 2130970899);
        afgj.g(aouq.w, 2130970900);
        afgj.g(aouq.r, 2130970907);
        afgj.g(aouq.s, 2130970904);
        afgj.g(aouq.t, 2130970906);
        afgj.g(aouq.u, 2130970905);
        afgj.g(aouq.x, 2130970860);
        afgj.g(aouq.y, 2130970861);
        afgj.g(aouq.z, 2130970846);
        afgj.g(aouq.A, 2130970845);
        afgj.g(aouq.B, 2130970859);
        afgj.g(aouq.E, 2130970834);
        afgj.g(aouq.F, 2130970835);
        afgj.g(aouq.G, 2130970837);
        afgj.g(aouq.H, 2130970838);
        afgj.g(aouq.I, 2130970903);
        afgj.g(aouq.M, 2130968629);
        afgj.g(aouq.N, 2130968626);
        afgj.g(aouq.O, 2130968624);
        afgj.g(aouq.P, 2130968625);
        afgj.g(aouq.Q, 2130968630);
        afgj.g(aouq.R, 2130968634);
        afgj.g(aouq.S, 2130968635);
        afgj.g(aouq.T, 2130968636);
        afgj.g(aouq.U, 2130968637);
        afgj.g(aouq.V, 2130968631);
        afgj.g(aouq.C, 2130970863);
        afgj.g(aouq.l, value2);
        afgj.g(aouq.D, 2130970864);
        afgj.g(aouq.n, 2130970923);
        afgj.g(aouq.J, 2130970909);
        afgj.g(aouq.e, 2130970853);
        afgj.g(aouq.p, value);
        afgj.g(aouq.K, 2130970938);
        afgj.g(aouq.L, 2130970939);
        afgj.g(aouq.ag, 2130970871);
        afgj.g(aouq.ah, 2130970872);
        afgj.g(aouq.ai, 2130970844);
        a = afgj.c();
    }
    
    public static int a(final Context context, final aouq aouq, final int n) {
        final afgm a = acww.a;
        if (a.containsKey(aouq)) {
            return tqf.cx(context, (int)a.get(aouq)).orElse(n);
        }
        return n;
    }
    
    public static afbh b(final Context context, final aouq aouq) {
        final afgm a = acww.a;
        if (a.containsKey(aouq)) {
            try {
                return afbh.k(tqf.cr(context, (int)a.get(aouq)));
            }
            catch (final Resources$NotFoundException | UnsupportedOperationException ex) {
                return afag.a;
            }
        }
        return afag.a;
    }
}
