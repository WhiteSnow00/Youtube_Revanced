import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import android.util.SparseIntArray;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

final class cap implements cak
{
    final caq a;
    private final SparseArray b;
    private final SparseIntArray c;
    private final int d;
    private final atlj e;
    
    public cap(final caq a, final int d) {
        this.a = a;
        this.e = new atlj(new byte[5], null);
        this.b = new SparseArray();
        this.c = new SparseIntArray();
        this.d = d;
    }
    
    @Override
    public final void a(final bat bat) {
        if (bat.i() != 2) {
            return;
        }
        bay bay = this.a.a.get(0);
        if ((bat.i() & 0x80) == 0x0) {
            return;
        }
        bat.H(1);
        final int m = bat.m();
        bat.H(3);
        bat.I(this.e, 2);
        this.e.o(3);
        this.a.h = this.e.g(13);
        bat.I(this.e, 2);
        this.e.o(4);
        bat.H(this.e.g(12));
        this.b.clear();
        this.c.clear();
        int i = bat.a();
        while (i > 0) {
            bat.I(this.e, 5);
            final int g = this.e.g(8);
            this.e.o(3);
            final int g2 = this.e.g(13);
            this.e.o(4);
            final int g3 = this.e.g(12);
            final int b = bat.b;
            final int n = b + g3;
            String s = null;
            int n2 = -1;
            List list = null;
            while (bat.b < n) {
                final int j = bat.i();
                final int n3 = bat.b + bat.i();
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
                                    final long q = bat.q();
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
                                        if (bat.i() != 21) {
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
                                            trim = bat.w(3).trim();
                                            break Label_0453;
                                        }
                                        if (j == 89) {
                                            list2 = new ArrayList();
                                            while (bat.b < n3) {
                                                final String trim2 = bat.w(3).trim();
                                                bat.i();
                                                final byte[] array = new byte[4];
                                                bat.B(array, 0, 4);
                                                list2.add(new eae(trim2, array));
                                            }
                                            n2 = 89;
                                            trim = s;
                                            break Label_0584;
                                        }
                                        final bay bay2 = bay;
                                        trim = s;
                                        list2 = list;
                                        bay = bay2;
                                        if (j == 111) {
                                            n2 = 257;
                                            bay = bay2;
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
                bat.H(n3 - bat.b);
                s = trim;
                list = list2;
            }
            bat.G(n);
            final adhr adhr = new adhr(n2, s, list, Arrays.copyOfRange(bat.a, b, n));
            int a;
            if (g == 6 || (a = g) == 5) {
                a = adhr.a;
            }
            i -= g3 + 5;
            if (this.a.c.get(g2)) {
                continue;
            }
            final avv k = this.a.i;
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
                                                                            o = new cah((bzs)new cad((String)adhr.b));
                                                                            break Label_1189;
                                                                        }
                                                                        case 16: {
                                                                            o = new cah((bzs)new bzx(k.r(adhr), null, null, null));
                                                                            break Label_1189;
                                                                        }
                                                                        case 15: {
                                                                            o = new cah((bzs)new bzp(false, (String)adhr.b));
                                                                            break Label_1189;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            o = new cah((bzs)new bzl((String)adhr.b));
                                                        }
                                                        else {
                                                            o = new cal(new cag("application/x-scte35"));
                                                        }
                                                    }
                                                    else {
                                                        o = new cal(new cag("application/vnd.dvb.ait"));
                                                    }
                                                }
                                                else {
                                                    o = new cah((bzs)new bzn((String)adhr.b));
                                                }
                                            }
                                            else {
                                                o = new cah((bzs)new bzq((String)adhr.b));
                                            }
                                        }
                                        else {
                                            o = new cah((bzs)new bzr((List)adhr.c));
                                        }
                                    }
                                    else {
                                        o = new cah((bzs)new cab(k.h(adhr), null, null));
                                    }
                                }
                                else {
                                    o = new cah((bzs)new bzz(k.h(adhr), null, null));
                                }
                            }
                            else {
                                o = new cah((bzs)new cac());
                            }
                            break Label_1189;
                        }
                        o = new cah((bzs)new cae((String)adhr.b));
                        break Label_1189;
                    }
                }
                o = new cah((bzs)new bzu(k.r(adhr), null, null, null));
            }
            this.c.put(g2, g2);
            this.b.put(g2, o);
        }
        final bay bay3 = bay;
        for (int size = this.c.size(), l = 0; l < size; ++l) {
            final int key = this.c.keyAt(l);
            final int value = this.c.valueAt(l);
            this.a.c.put(key, true);
            this.a.d.put(value, true);
            final cas cas = (cas)this.b.valueAt(l);
            if (cas != null) {
                cas.b(bay3, this.a.e, new car(m, key, 8192));
                this.a.b.put(value, (Object)cas);
            }
        }
        this.a.b.remove(this.d);
        final caq a2 = this.a;
        a2.f = 0;
        a2.e.r();
        this.a.g = true;
    }
    
    @Override
    public final void b(final bay bay, final btp btp, final car car) {
    }
}
