// 
// Decompiled by Procyon v0.6.0
// 

public final class acy
{
    static final boolean[] a;
    
    static {
        a = new boolean[3];
    }
    
    static void a(final acu acu, final acl acl, final act act) {
        act.p = -1;
        act.q = -1;
        if (acu.aq[0] != 2 && act.aq[0] == 4) {
            final acs j = act.J;
            final int f = j.f;
            final int n = acu.j() - act.L.f;
            j.h = acl.b(j);
            final acs l = act.L;
            l.h = acl.b(l);
            acl.f(act.J.h, f);
            acl.f(act.L.h, n);
            act.p = 2;
            act.Z = f;
            final int v = n - f;
            act.V = v;
            final int ac = act.ac;
            if (v < ac) {
                act.V = ac;
            }
        }
        if (acu.aq[1] != 2 && act.aq[1] == 4) {
            final acs k = act.K;
            final int f2 = k.f;
            final int n2 = acu.h() - act.M.f;
            k.h = acl.b(k);
            final acs m = act.M;
            m.h = acl.b(m);
            acl.f(act.K.h, f2);
            acl.f(act.M.h, n2);
            if (act.ab > 0 || act.ah == 8) {
                final acs n3 = act.N;
                n3.h = acl.b(n3);
                acl.f(act.N.h, act.ab + f2);
            }
            act.q = 2;
            act.aa = f2;
            final int w = n2 - f2;
            act.W = w;
            final int ad = act.ad;
            if (w < ad) {
                act.W = ad;
            }
        }
    }
    
    public static final boolean b(final int n, final int n2) {
        return (n & n2) == n2;
    }
}
