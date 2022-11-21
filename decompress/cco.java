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

public final class cco extends Handler
{
    final ccs a;
    private final ArrayList b;
    private final List c;
    
    public cco(final ccs a) {
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
            if (this.a.e().c.equals(((ccw)obj).c)) {
                this.a.p(true);
            }
            n = 259;
        }
        if (n != 262) {
            if (n != 264) {
                switch (n) {
                    case 259: {
                        final cdx c = this.a.c;
                        final ccw ccw = (ccw)obj;
                        if (ccw.c() == c) {
                            break;
                        }
                        final cdt cdt = (cdt)c;
                        final int p = cdt.p(ccw);
                        if (p >= 0) {
                            cdt.A((cds)cdt.q.get(p));
                            break;
                        }
                        break;
                    }
                    case 258: {
                        this.a.c.u((ccw)obj);
                        break;
                    }
                    case 257: {
                        this.a.c.t((ccw)obj);
                        break;
                    }
                }
            }
            else {
                final ccw ccw2 = (ccw)((akr)obj).b;
                this.c.add(ccw2);
                this.a.c.t(ccw2);
                this.a.c.v(ccw2);
            }
        }
        else {
            final ccw ccw3 = (ccw)((akr)obj).b;
            this.a.c.v(ccw3);
            if (this.a.n != null && ccw3.j()) {
                final Iterator iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    this.a.c.u((ccw)iterator.next());
                }
                this.c.clear();
            }
        }
        try {
            int size = this.a.f.size();
            while (--size >= 0) {
                final dmo dmo = this.a.f.get(size).get();
                if (dmo == null) {
                    this.a.f.remove(size);
                }
                else {
                    this.b.addAll((Collection)dmo.b);
                }
            }
            for (int size2 = this.b.size(), i = 0; i < size2; ++i) {
                final adjw adjw = this.b.get(i);
                final Object d = adjw.d;
                final Object c2 = adjw.c;
                final int n2 = 0xFF00 & n;
                if (n2 != 256) {
                    if (n2 != 512) {
                        if (n2 == 768) {
                            if (n == 769) {
                                ((bkx)c2).l((cdd)obj);
                            }
                        }
                    }
                    else {
                        final ccv ccv = (ccv)obj;
                        switch (n) {
                            case 515: {
                                ((bkx)c2).e();
                                break;
                            }
                            case 514: {
                                ((bkx)c2).f();
                                break;
                            }
                            case 513: {
                                ((bkx)c2).d();
                                break;
                            }
                        }
                    }
                }
                else {
                    ccw ccw4;
                    if (n != 264 && n != 262) {
                        ccw4 = (ccw)obj;
                    }
                    else {
                        ccw4 = (ccw)((akr)obj).b;
                    }
                    ccw ccw5;
                    if (n != 264 && n != 262) {
                        ccw5 = null;
                    }
                    else {
                        ccw5 = (ccw)((akr)obj).a;
                    }
                    if (ccw4 != null) {
                        int n3;
                        if ((adjw.a & 0x2) == 0x0 && !ccw4.n((ccn)adjw.e)) {
                            if (!dmo.u() || !ccw4.j() || n != 262) {
                                continue;
                            }
                            n3 = 3;
                            if (arg1 != 3 || ccw5 == null || ccw5.j()) {
                                continue;
                            }
                        }
                        else {
                            n3 = arg1;
                        }
                        switch (n) {
                            case 264: {
                                ((bkx)c2).m(ccw4, n3);
                                break;
                            }
                            case 263: {
                                ((bkx)c2).o(ccw4, n3);
                                break;
                            }
                            case 262: {
                                ((bkx)c2).m(ccw4, n3);
                                break;
                            }
                            case 260: {
                                ((bkx)c2).k(ccw4);
                                break;
                            }
                            case 259: {
                                ((bkx)c2).h(ccw4);
                                break;
                            }
                            case 258: {
                                ((bkx)c2).i(ccw4);
                                break;
                            }
                            case 257: {
                                ((bkx)c2).g(ccw4);
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
