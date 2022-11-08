import android.util.SparseArray;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

final class he implements Runnable
{
    final /* synthetic */ hf a;
    
    public he(final hf a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        for (hi hi = this.a.b.j(); hi != null; hi = this.a.b.j()) {
            final int b = hi.b;
            int i = 0;
            final rk rk = null;
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        final StringBuilder sb = new StringBuilder("Unsupported message, what=");
                        sb.append(hi.b);
                        Log.e("ThreadUtil", sb.toString());
                    }
                    else {
                        final hk a = this.a.a;
                        final int c = hi.c;
                        final int d = hi.d;
                        final gu gu = (gu)a;
                        if (gu.a(c)) {
                            final jjl m = gu.a.m;
                            final rk rk2 = (rk)((SparseArray)m.c).get(d);
                            if (m.b == rk2) {
                                m.b = null;
                            }
                            ((SparseArray)m.c).delete(d);
                            if (rk2 == null) {
                                final StringBuilder sb2 = new StringBuilder("tile not found @");
                                sb2.append(d);
                                Log.e("AsyncListUtil", sb2.toString());
                            }
                            else {
                                gu.a.d.d(rk2);
                            }
                        }
                    }
                }
                else {
                    final Object h = hi.h;
                    final hk a2 = this.a.a;
                    final int c2 = hi.c;
                    final gu gu2 = (gu)a2;
                    if (!gu2.a(c2)) {
                        gu2.a.d.d((rk)h);
                    }
                    else {
                        final jjl j = gu2.a.m;
                        final Object c3 = j.c;
                        final rk rk3 = (rk)h;
                        final int indexOfKey = ((SparseArray)c3).indexOfKey(rk3.b);
                        rk rk4;
                        if (indexOfKey < 0) {
                            ((SparseArray)j.c).put(rk3.b, h);
                            rk4 = rk;
                        }
                        else {
                            final rk rk5 = (rk)((SparseArray)j.c).valueAt(indexOfKey);
                            ((SparseArray)j.c).setValueAt(indexOfKey, h);
                            if (j.b == (rk4 = rk5)) {
                                j.b = h;
                                rk4 = rk5;
                            }
                        }
                        if (rk4 != null) {
                            final StringBuilder sb3 = new StringBuilder("duplicate tile @");
                            sb3.append(rk4.b);
                            Log.e("AsyncListUtil", sb3.toString());
                            gu2.a.d.d(rk4);
                        }
                        final int b2 = rk3.b;
                        final int a3 = rk3.a;
                        while (i < gu2.a.l.size()) {
                            final int key = gu2.a.l.keyAt(i);
                            if (rk3.b <= key && key < b2 + a3) {
                                gu2.a.l.removeAt(i);
                                ((nq)gu2.a.o.a).tc(key);
                            }
                            else {
                                ++i;
                            }
                        }
                    }
                }
            }
            else {
                final hk a4 = this.a.a;
                final int c4 = hi.c;
                final int d2 = hi.d;
                final gu gu3 = (gu)a4;
                if (gu3.a(c4)) {
                    final gw a5 = gu3.a;
                    a5.i = d2;
                    ((nq)a5.o.a).rT();
                    final gw a6 = gu3.a;
                    a6.j = a6.k;
                    for (int k = 0; k < ((SparseArray)gu3.a.m.c).size(); ++k) {
                        final gw a7 = gu3.a;
                        final hj d3 = a7.d;
                        final jjl l = a7.m;
                        rk rk6;
                        if (k >= 0 && k < ((SparseArray)l.c).size()) {
                            rk6 = (rk)((SparseArray)l.c).valueAt(k);
                        }
                        else {
                            rk6 = null;
                        }
                        d3.d(rk6);
                    }
                    ((SparseArray)gu3.a.m.c).clear();
                    final gw a8 = gu3.a;
                    a8.h = false;
                    a8.b();
                }
            }
        }
    }
}
