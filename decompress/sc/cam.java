import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import android.util.SparseIntArray;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

final class cam implements cah
{
    final can a;
    private final SparseArray b;
    private final SparseIntArray c;
    private final int d;
    private final atim e;
    
    public cam(final can a, final int d) {
        this.a = a;
        this.e = new atim(new byte[5], (byte[])null);
        this.b = new SparseArray();
        this.c = new SparseIntArray();
        this.d = d;
    }
    
    public final void a(final bas bas) {
        if (bas.i() != 2) {
            return;
        }
        baw baw = this.a.a.get(0);
        if ((bas.i() & 0x80) == 0x0) {
            return;
        }
        bas.H(1);
        final int m = bas.m();
        bas.H(3);
        bas.I(this.e, 2);
        this.e.o(3);
        this.a.h = this.e.g(13);
        bas.I(this.e, 2);
        this.e.o(4);
        bas.H(this.e.g(12));
        this.b.clear();
        this.c.clear();
        int i = bas.a();
        while (i > 0) {
            bas.I(this.e, 5);
            final int g = this.e.g(8);
            this.e.o(3);
            final int g2 = this.e.g(13);
            this.e.o(4);
            final int g3 = this.e.g(12);
            final int b = bas.b;
            final int n = b + g3;
            String s = null;
            int n2 = -1;
            List list = null;
            while (bas.b < n) {
                final int j = bas.i();
                final int n3 = bas.b + bas.i();
                if (n3 > n) {
                    break;
                }
                String trim = null;
                List list2 = null;
                Label_0584: {
                    Label_0453: {
                        Label_0376: {
                            Label_0354: {
                                if (j == 5) {
                                    final long q = bas.q();
                                    if (q == 1094921523L) {
                                        break Label_0354;
                                    }
                                    if (q == 1161904947L) {
                                        break Label_0376;
                                    }
                                    if (q != 1094921524L) {
                                        trim = s;
                                        if (q == 1212503619L) {
                                            n2 = 36;
                                            trim = s;
                                            list2 = list;
                                            break Label_0584;
                                        }
                                        break Label_0453;
                                    }
                                }
                                else {
                                    if (j == 106) {
                                        break Label_0354;
                                    }
                                    if (j == 122) {
                                        break Label_0376;
                                    }
                                    if (j == 127) {
                                        trim = s;
                                        if (bas.i() != 21) {
                                            break Label_0453;
                                        }
                                    }
                                    else {
                                        if (j == 123) {
                                            n2 = 138;
                                            trim = s;
                                            list2 = list;
                                            break Label_0584;
                                        }
                                        if (j == 10) {
                                            trim = bas.w(3).trim();
                                            break Label_0453;
                                        }
                                        if (j == 89) {
                                            list2 = new ArrayList();
                                            while (bas.b < n3) {
                                                final String trim2 = bas.w(3).trim();
                                                bas.i();
                                                final byte[] array = new byte[4];
                                                bas.B(array, 0, 4);
                                                list2.add(new eab(trim2, array));
                                            }
                                            n2 = 89;
                                            trim = s;
                                            break Label_0584;
                                        }
                                        final baw baw2 = baw;
                                        trim = s;
                                        list2 = list;
                                        baw = baw2;
                                        if (j == 111) {
                                            n2 = 257;
                                            baw = baw2;
                                            list2 = list;
                                            trim = s;
                                        }
                                        break Label_0584;
                                    }
                                }
                                n2 = 172;
                                trim = s;
                                list2 = list;
                                break Label_0584;
                            }
                            n2 = 129;
                            trim = s;
                            list2 = list;
                            break Label_0584;
                        }
                        n2 = 135;
                        trim = s;
                        list2 = list;
                        break Label_0584;
                    }
                    list2 = list;
                }
                bas.H(n3 - bas.b);
                s = trim;
                list = list2;
            }
            bas.G(n);
            final adge adge = new adge(n2, s, list, Arrays.copyOfRange(bas.a, b, n));
            int a;
            if (g == 6 || (a = g) == 5) {
                a = adge.a;
            }
            i -= g3 + 5;
            if (this.a.c.get(g2)) {
                continue;
            }
            final avu k = this.a.i;
            Object o = null;
            Label_1189: {
                Label_1163: {
                    if (a != 2) {
                        if (a != 3 && a != 4) {
                            if (a != 21) {
                                if (a != 27) {
                                    if (a != 36) {
                                        if (a != 89) {
                                            if (a != 138) {
                                                if (a != 172) {
                                                    if (a != 257) {
                                                        if (a != 134) {
                                                            Label_0914: {
                                                                if (a != 135) {
                                                                    switch (a) {
                                                                        default: {
                                                                            switch (a) {
                                                                                default: {
                                                                                    o = null;
                                                                                    break Label_1189;
                                                                                }
                                                                                case 129: {
                                                                                    break Label_0914;
                                                                                }
                                                                                case 128: {
                                                                                    break Label_1163;
                                                                                }
                                                                            }
                                                                            break;
                                                                        }
                                                                        case 17: {
                                                                            o = new cae((bzp)new caa((String)adge.b));
                                                                            break Label_1189;
                                                                        }
                                                                        case 16: {
                                                                            o = new cae((bzp)new bzu(k.r(adge), null, null, null));
                                                                            break Label_1189;
                                                                        }
                                                                        case 15: {
                                                                            o = new cae((bzp)new bzm(false, (String)adge.b));
                                                                            break Label_1189;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            o = new cae((bzp)new bzi((String)adge.b));
                                                        }
                                                        else {
                                                            o = new cai((cah)new cad("application/x-scte35"));
                                                        }
                                                    }
                                                    else {
                                                        o = new cai((cah)new cad("application/vnd.dvb.ait"));
                                                    }
                                                }
                                                else {
                                                    o = new cae((bzp)new bzk((String)adge.b));
                                                }
                                            }
                                            else {
                                                o = new cae((bzp)new bzn((String)adge.b));
                                            }
                                        }
                                        else {
                                            o = new cae((bzp)new bzo((List)adge.c));
                                        }
                                    }
                                    else {
                                        o = new cae((bzp)new bzy(k.h(adge), null, null));
                                    }
                                }
                                else {
                                    o = new cae((bzp)new bzw(k.h(adge), null, null));
                                }
                            }
                            else {
                                o = new cae((bzp)new bzz());
                            }
                            break Label_1189;
                        }
                        o = new cae((bzp)new cab((String)adge.b));
                        break Label_1189;
                    }
                }
                o = new cae((bzp)new bzr(k.r(adge), null, null, null));
            }
            this.c.put(g2, g2);
            this.b.put(g2, o);
        }
        final baw baw3 = baw;
        for (int size = this.c.size(), l = 0; l < size; ++l) {
            final int key = this.c.keyAt(l);
            final int value = this.c.valueAt(l);
            this.a.c.put(key, true);
            this.a.d.put(value, true);
            final cap cap = (cap)this.b.valueAt(l);
            if (cap != null) {
                cap.b(baw3, this.a.e, new cao(m, key, 8192));
                this.a.b.put(value, (Object)cap);
            }
        }
        this.a.b.remove(this.d);
        final can a2 = this.a;
        a2.f = 0;
        a2.e.r();
        this.a.g = true;
    }
    
    public final void b(final baw baw, final btm btm, final cao cao) {
    }
}
