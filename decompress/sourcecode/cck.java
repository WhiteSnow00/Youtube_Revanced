import java.util.Iterator;
import java.util.Collection;
import java.lang.ref.WeakReference;
import android.os.Message;
import java.util.List;
import java.util.ArrayList;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cck extends Handler
{
    final /* synthetic */ cco a;
    private final ArrayList b;
    private final List c;
    
    public cck(final cco a) {
        this.a = a;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }
    
    public final void a(final int n, final Object o) {
        this.obtainMessage(n, o).sendToTarget();
    }
    
    public final void b(final int n, final Object o, final int arg1) {
        final Message obtainMessage = this.obtainMessage(n, o);
        obtainMessage.arg1 = arg1;
        obtainMessage.sendToTarget();
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        final Object obj = message.obj;
        final int arg1 = message.arg1;
        int n = what;
        if (what == 259) {
            if (this.a.e().c.equals(((ccs)obj).c)) {
                this.a.p(true);
            }
            n = 259;
        }
        if (n != 262) {
            if (n != 264) {
                switch (n) {
                    case 259: {
                        final cdt c = this.a.c;
                        final ccs ccs = (ccs)obj;
                        if (ccs.c() == c) {
                            break;
                        }
                        final cdp cdp = (cdp)c;
                        final int p = cdp.p(ccs);
                        if (p >= 0) {
                            cdp.A((cdo)cdp.q.get(p));
                            break;
                        }
                        break;
                    }
                    case 258: {
                        this.a.c.u((ccs)obj);
                        break;
                    }
                    case 257: {
                        this.a.c.t((ccs)obj);
                        break;
                    }
                }
            }
            else {
                final ccs ccs2 = (ccs)((akp)obj).b;
                this.c.add(ccs2);
                this.a.c.t(ccs2);
                this.a.c.v(ccs2);
            }
        }
        else {
            final ccs ccs3 = (ccs)((akp)obj).b;
            this.a.c.v(ccs3);
            if (this.a.n != null && ccs3.j()) {
                final Iterator iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    this.a.c.u((ccs)iterator.next());
                }
                this.c.clear();
            }
        }
        try {
            int size = this.a.f.size();
            while (--size >= 0) {
                final dmk dmk = this.a.f.get(size).get();
                if (dmk == null) {
                    this.a.f.remove(size);
                }
                else {
                    this.b.addAll((Collection)dmk.b);
                }
            }
            for (int size2 = this.b.size(), i = 0; i < size2; ++i) {
                final adge adge = this.b.get(i);
                final Object d = adge.d;
                final Object c2 = adge.c;
                final int n2 = 0xFF00 & n;
                if (n2 != 256) {
                    if (n2 != 512) {
                        if (n2 == 768) {
                            if (n == 769) {
                                ((bkt)c2).n((ccz)obj);
                            }
                        }
                    }
                    else {
                        final ccr ccr = (ccr)obj;
                        switch (n) {
                            case 515: {
                                ((bkt)c2).g();
                                break;
                            }
                            case 514: {
                                ((bkt)c2).h();
                                break;
                            }
                            case 513: {
                                ((bkt)c2).f();
                                break;
                            }
                        }
                    }
                }
                else {
                    ccs ccs4;
                    if (n != 264 && n != 262) {
                        ccs4 = (ccs)obj;
                    }
                    else {
                        ccs4 = (ccs)((akp)obj).b;
                    }
                    ccs ccs5;
                    if (n != 264 && n != 262) {
                        ccs5 = null;
                    }
                    else {
                        ccs5 = (ccs)((akp)obj).a;
                    }
                    if (ccs4 != null) {
                        int n3;
                        if ((adge.a & 0x2) == 0x0 && !ccs4.n((ccj)adge.e)) {
                            if (!dmk.u() || !ccs4.j() || n != 262) {
                                continue;
                            }
                            n3 = 3;
                            if (arg1 != 3 || ccs5 == null || ccs5.j()) {
                                continue;
                            }
                        }
                        else {
                            n3 = arg1;
                        }
                        switch (n) {
                            case 264: {
                                ((bkt)c2).o(ccs4, n3);
                                break;
                            }
                            case 263: {
                                ((bkt)c2).q(ccs4, n3);
                                break;
                            }
                            case 262: {
                                ((bkt)c2).o(ccs4, n3);
                                break;
                            }
                            case 260: {
                                ((bkt)c2).m(ccs4);
                                break;
                            }
                            case 259: {
                                ((bkt)c2).j(ccs4);
                                break;
                            }
                            case 258: {
                                ((bkt)c2).k(ccs4);
                                break;
                            }
                            case 257: {
                                ((bkt)c2).i(ccs4);
                                break;
                            }
                        }
                    }
                }
            }
            this.b.clear();
        }
        finally {
            this.b.clear();
            while (true) {}
        }
    }
}
