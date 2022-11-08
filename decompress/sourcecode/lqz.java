import android.os.Message;
import android.util.Pair;
import android.util.Log;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import com.google.android.exoplayer.MediaFormat;
import java.util.List;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Handler;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqz implements Handler$Callback
{
    public final Handler a;
    public final AtomicInteger b;
    public int c;
    public long d;
    public volatile long e;
    public volatile long f;
    private final HandlerThread g;
    private final Handler h;
    private final lrq i;
    private final List j;
    private final MediaFormat[][] k;
    private final int[] l;
    private final long m;
    private final long n;
    private lrr[] o;
    private lrr p;
    private lrb q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private long w;
    private volatile long x;
    
    public lqz(final Handler h, final boolean s, final int[] array, int length, final int n) {
        this.c = 0;
        this.v = 0;
        this.h = h;
        this.s = s;
        this.m = length * 1000L;
        this.n = n * 1000L;
        length = array.length;
        this.l = Arrays.copyOf(array, length);
        this.u = 1;
        this.e = -1L;
        this.x = -1L;
        this.i = new lrq();
        this.b = new AtomicInteger();
        this.j = new ArrayList(length);
        this.k = new MediaFormat[length][];
        final lwh g = new lwh();
        (this.g = (HandlerThread)g).start();
        this.a = new Handler(((HandlerThread)g).getLooper(), (Handler$Callback)this);
    }
    
    private final void c(final lrr p3, final int n, final boolean b) {
        final long f = this.f;
        final int g = p3.g;
        final boolean b2 = false;
        jfi.U(g == 1);
        p3.g = 2;
        p3.D(n, f, b);
        this.j.add(p3);
        final lrb l = p3.l();
        if (l != null) {
            boolean b3 = b2;
            if (this.q == null) {
                b3 = true;
            }
            jfi.U(b3);
            this.q = l;
            this.p = p3;
        }
    }
    
    private final void d(final lrr lrr) {
        n(lrr);
        if (lrr.g == 2) {
            jfi.U(true);
            lrr.g = 1;
            lrr.m();
            if (lrr == this.p) {
                this.q = null;
                this.p = null;
            }
        }
    }
    
    private final void e() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        int n = 0;
        int n2 = 1;
        while (true) {
            final lrr[] o = this.o;
            if (n >= o.length) {
                break;
            }
            final lrr lrr = o[n];
            int n3 = n2;
            if (lrr.g == 0) {
                jfi.U(lrr.g == 0);
                final boolean j = lrr.j();
                lrr.g = (j ? 1 : 0);
                n3 = n2;
                if (!j) {
                    lrr.f();
                    n3 = 0;
                }
            }
            ++n;
            n2 = n3;
        }
        if (n2 != 0) {
            long max = 0L;
            int n4 = 0;
            int n5 = 1;
            int n6 = 1;
            while (true) {
                final lrr[] o2 = this.o;
                if (n4 >= o2.length) {
                    break;
                }
                final lrr lrr2 = o2[n4];
                final int m = lrr2.M();
                final MediaFormat[] array = new MediaFormat[m];
                for (int i = 0; i < m; ++i) {
                    array[i] = lrr2.d(i);
                }
                this.k[n4] = array;
                long n7 = max;
                int n8 = n5;
                boolean b = n6 != 0;
                if (m > 0) {
                    if (max != -1L) {
                        final long c = lrr2.c();
                        if (c == -1L) {
                            max = -1L;
                        }
                        else if (c != -2L) {
                            max = Math.max(max, c);
                        }
                    }
                    final int n9 = this.l[n4];
                    n7 = max;
                    n8 = n5;
                    b = (n6 != 0);
                    if (n9 >= 0) {
                        n7 = max;
                        n8 = n5;
                        b = (n6 != 0);
                        if (n9 < m) {
                            this.c(lrr2, n9, false);
                            final boolean b2 = n5 != 0 && lrr2.h();
                            if (n6 && this.m(lrr2)) {
                                b = true;
                                n7 = max;
                                n8 = (b2 ? 1 : 0);
                            }
                            else {
                                b = false;
                                n8 = (b2 ? 1 : 0);
                                n7 = max;
                            }
                        }
                    }
                }
                ++n4;
                max = n7;
                n5 = n8;
                n6 = (b ? 1 : 0);
            }
            this.e = max;
            int u;
            if (n5 != 0 && (max == -1L || max <= this.f)) {
                u = 5;
                this.u = 5;
            }
            else {
                if (n6 == 0) {
                    u = 3;
                }
                else {
                    u = 4;
                }
                this.u = u;
            }
            this.h.obtainMessage(1, u, 0, (Object)this.k).sendToTarget();
            if (this.s && this.u == 4) {
                this.i();
            }
            this.a.sendEmptyMessage(7);
            return;
        }
        this.g(2, elapsedRealtime, 10L);
    }
    
    private final void f() {
        this.a.removeMessages(7);
        this.a.removeMessages(2);
        this.t = false;
        this.i.c();
        if (this.o != null) {
            int n = 0;
            while (true) {
                final lrr[] o = this.o;
                if (n >= o.length) {
                    break;
                }
                final lrr lrr = o[n];
                try {
                    this.d(lrr);
                }
                catch (final RuntimeException ex) {
                    Log.e("ExoPlayerImplInternal", "Stop failed.", (Throwable)ex);
                }
                catch (final lqt lqt) {
                    Log.e("ExoPlayerImplInternal", "Stop failed.", (Throwable)lqt);
                }
                try {
                    final int g = lrr.g;
                    jfi.U(g != 2 && g != 3 && g != -1);
                    lrr.g = -1;
                    lrr.G();
                }
                catch (final RuntimeException ex2) {
                    Log.e("ExoPlayerImplInternal", "Release failed.", (Throwable)ex2);
                }
                catch (final lqt lqt2) {
                    Log.e("ExoPlayerImplInternal", "Release failed.", (Throwable)lqt2);
                }
                ++n;
            }
            this.o = null;
            this.q = null;
            this.p = null;
            this.j.clear();
        }
    }
    
    private final void g(final int n, long n2, final long n3) {
        n2 = n2 + n3 - SystemClock.elapsedRealtime();
        if (n2 <= 0L) {
            this.a.sendEmptyMessage(n);
            return;
        }
        this.a.sendEmptyMessageDelayed(n, n2);
    }
    
    private final void h(final int u) {
        if (this.u != u) {
            this.u = u;
            this.h.obtainMessage(2, u, 0).sendToTarget();
        }
    }
    
    private final void i() {
        final int n = 0;
        this.t = false;
        final lrq i = this.i;
        int j = n;
        if (!i.a) {
            i.a = true;
            i.c = lrq.d(i.b);
            j = n;
        }
        while (j < this.j.size()) {
            ((lrr)this.j.get(j)).I();
            ++j;
        }
    }
    
    private final void j() {
        this.f();
        this.h(1);
    }
    
    private final void k() {
        this.i.c();
        for (int i = 0; i < this.j.size(); ++i) {
            n((lrr)this.j.get(i));
        }
    }
    
    private final void l() {
        if (this.q != null && this.j.contains(this.p) && !this.p.h()) {
            this.f = this.q.a();
            this.i.b(this.f);
        }
        else {
            this.f = this.i.a();
        }
        this.w = SystemClock.elapsedRealtime() * 1000L;
    }
    
    private final boolean m(final lrr lrr) {
        final boolean h = lrr.h();
        final boolean b = true;
        if (h) {
            return true;
        }
        if (!lrr.i()) {
            return false;
        }
        if (this.u == 4) {
            return true;
        }
        final long c = lrr.c();
        final long b2 = lrr.b();
        long n;
        if (this.t) {
            n = this.n;
        }
        else {
            n = this.m;
        }
        boolean b3 = b;
        if (n > 0L) {
            b3 = b;
            if (b2 != -1L) {
                b3 = b;
                if (b2 != -3L) {
                    b3 = b;
                    if (b2 < this.f + n) {
                        if (c != -1L && c != -2L) {
                            if (b2 < c) {
                                return false;
                            }
                            b3 = b;
                        }
                        else {
                            b3 = false;
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    private static final void n(final lrr lrr) {
        if (lrr.g == 3) {
            jfi.U(true);
            lrr.g = 2;
            lrr.r();
        }
    }
    
    public final void a() {
        monitorenter(this);
        try {
            if (this.r) {
                monitorexit(this);
                return;
            }
            this.a.sendEmptyMessage(5);
            while (!this.r) {
                try {
                    this.wait();
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            this.g.quit();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b(final lqu lqu, final Object o) {
        monitorenter(this);
        try {
            if (this.r) {
                Log.w("ExoPlayerImplInternal", "Sent message(1) after release. Message ignored.");
                monitorexit(this);
                return;
            }
            final int n = this.c++;
            this.a.obtainMessage(9, 1, 0, (Object)Pair.create((Object)lqu, o)).sendToTarget();
            while (this.v <= n) {
                try {
                    this.wait();
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean handleMessage(Message o) {
        try {
            final int what = ((Message)o).what;
            int i = 0;
            final boolean b = false;
        Label_1176_Outer:
            while (true) {
                int arg1;
                Pair pair;
                int u;
                int arg2;
                int arg3;
                int u2;
                int g;
                boolean b2;
                boolean b3;
                boolean b4;
                boolean b5;
                int n;
                long min;
                long x;
                int a;
                long elapsedRealtime;
                long e;
                long c;
                long b6;
                long f;
                AtomicInteger atomicInteger;
                int u3;
                lrr lrr;
                int n2;
                int u4;
                int n3;
                boolean m;
                boolean s;
                int u5;
                Label_0651_Outer:Label_0551_Outer:
                while (true) {
                    switch (what) {
                        default: {
                            return false;
                        }
                        case 9: {
                            arg1 = ((Message)o).arg1;
                            o = (lqt)((Message)o).obj;
                            try {
                                pair = (Pair)o;
                                ((lqu)pair.first).k(arg1, pair.second);
                                u = this.u;
                                if (u != 1 && u != 2) {
                                    this.a.sendEmptyMessage(7);
                                }
                                synchronized (this) {
                                    ++this.v;
                                    this.notifyAll();
                                    return true;
                                }
                            }
                            finally {
                                synchronized (this) {
                                    ++this.v;
                                    this.notifyAll();
                                }
                            }
                        }
                        case 8: {
                            break Label_1176_Outer;
                        }
                        case 7: {
                            break Label_1176_Outer;
                        }
                        case 6: {
                            break Label_1176_Outer;
                        }
                        case 5: {
                            break Label_1023;
                        }
                        case 4: {
                            break Label_0651_Outer;
                        }
                        case 3: {
                            break Label_0651_Outer;
                        }
                        case 2: {
                            break Label_1176;
                        }
                        case 1: {
                            Label_1182: {
                                break Label_1182;
                                try {
                                    arg2 = ((Message)o).arg1;
                                    arg3 = ((Message)o).arg2;
                                    o = (lqt)(Object)this.l;
                                    if (o[arg2] != arg3) {
                                        o[arg2] = arg3;
                                        u2 = this.u;
                                        if (u2 != 1 && u2 != 2) {
                                            o = (lqt)this.o[arg2];
                                            g = ((lrr)o).g;
                                            if (g != 0 && g != -1 && ((lrr)o).M() != 0) {
                                                b2 = (g == 2 || g == 3);
                                                b3 = (arg3 >= 0 && arg3 < this.k[arg2].length);
                                                if (b2) {
                                                    if (!b3 && o == this.p) {
                                                        this.i.b(this.q.a());
                                                    }
                                                    this.d((lrr)o);
                                                    this.j.remove(o);
                                                }
                                                if (b3) {
                                                    b4 = (this.s && this.u == 4);
                                                    b5 = b;
                                                    if (!b2) {
                                                        b5 = b;
                                                        if (b4) {
                                                            b5 = true;
                                                        }
                                                    }
                                                    this.c((lrr)o, arg3, b5);
                                                    if (b4) {
                                                        ((lrr)o).I();
                                                    }
                                                    this.a.sendEmptyMessage(7);
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                Label_0551:
                                    while (true) {
                                        Label_0460_Outer:Block_42_Outer:Label_0694_Outer:
                                        while (true) {
                                            ++n;
                                            x = min;
                                        Label_1080_Outer:
                                            while (true) {
                                                while (true) {
                                                Block_57:
                                                    while (true) {
                                                        while (true) {
                                                            while (true) {
                                                                Label_0765:Block_49_Outer:
                                                                while (true) {
                                                                    while (true) {
                                                                    Label_0445:
                                                                        while (true) {
                                                                        Label_0519:
                                                                            while (true) {
                                                                            Block_50:
                                                                                while (true) {
                                                                                    Block_37: {
                                                                                        Block_52: {
                                                                                            Block_36: {
                                                                                                Block_41: {
                                                                                                    Block_39: {
                                                                                                        Label_0797: {
                                                                                                            while (true) {
                                                                                                                break Label_0460;
                                                                                                                iftrue(Label_0567:)(x != -1L);
                                                                                                                break Label_0445;
                                                                                                                this.f();
                                                                                                                try {
                                                                                                                    this.h(1);
                                                                                                                    synchronized (this) {
                                                                                                                        this.r = true;
                                                                                                                        this.notifyAll();
                                                                                                                        return true;
                                                                                                                    }
                                                                                                                }
                                                                                                                catch (final lqt o) {
                                                                                                                    break;
                                                                                                                }
                                                                                                                break Label_0651_Outer;
                                                                                                                a = lwj.a;
                                                                                                                elapsedRealtime = SystemClock.elapsedRealtime();
                                                                                                                iftrue(Label_0440:)(this.e == -1L);
                                                                                                                Block_34: {
                                                                                                                    Block_33: {
                                                                                                                        break Block_33;
                                                                                                                        iftrue(Label_0661:)(n >= this.j.size());
                                                                                                                        break Block_34;
                                                                                                                    }
                                                                                                                    e = this.e;
                                                                                                                    break Label_0445;
                                                                                                                    Label_0567: {
                                                                                                                        c = ((lrr)o).c();
                                                                                                                    }
                                                                                                                    b6 = ((lrr)o).b();
                                                                                                                    iftrue(Label_0596:)(b6 != -1L);
                                                                                                                    break Block_41;
                                                                                                                    this.a.removeMessages(7);
                                                                                                                    iftrue(Label_0811:)((!this.s || this.u != 4) && this.u != 3);
                                                                                                                    break Label_0797;
                                                                                                                    Label_0808:
                                                                                                                    return true;
                                                                                                                    f = lwj.f(((Message)o).arg1, ((Message)o).arg2);
                                                                                                                    try {
                                                                                                                        if (f == this.f / 1000L) {
                                                                                                                            atomicInteger = this.b;
                                                                                                                        }
                                                                                                                        else {
                                                                                                                            this.t = false;
                                                                                                                            this.f = f * 1000L;
                                                                                                                            this.i.c();
                                                                                                                            this.i.b(this.f);
                                                                                                                            u3 = this.u;
                                                                                                                            if (u3 != 1 && u3 != 2) {
                                                                                                                                while (i < this.j.size()) {
                                                                                                                                    lrr = this.j.get(i);
                                                                                                                                    n(lrr);
                                                                                                                                    lrr.g(this.f);
                                                                                                                                    ++i;
                                                                                                                                }
                                                                                                                                this.h(3);
                                                                                                                                this.a.sendEmptyMessage(7);
                                                                                                                                atomicInteger = this.b;
                                                                                                                            }
                                                                                                                            else {
                                                                                                                                atomicInteger = this.b;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        atomicInteger.decrementAndGet();
                                                                                                                        return true;
                                                                                                                    }
                                                                                                                    finally {
                                                                                                                        this.b.decrementAndGet();
                                                                                                                    }
                                                                                                                    continue Label_1176_Outer;
                                                                                                                }
                                                                                                                o = (lqt)this.j.get(n);
                                                                                                                ((lrr)o).e(this.f, this.w);
                                                                                                                iftrue(Label_0517:)(n2 == 0 || !((lrr)o).h());
                                                                                                                break Block_36;
                                                                                                                this.e();
                                                                                                                return true;
                                                                                                                Label_0739: {
                                                                                                                    iftrue(Label_0765:)(u4 != 4 || n3 != 0);
                                                                                                                }
                                                                                                                break Block_52;
                                                                                                                this.g(7, elapsedRealtime, 1000L);
                                                                                                                return true;
                                                                                                                iftrue(Label_0549:)(n3 == 0 || !m);
                                                                                                                break Block_39;
                                                                                                                this.h(4);
                                                                                                                iftrue(Label_0765:)(!this.s);
                                                                                                                break Block_50;
                                                                                                                this.l();
                                                                                                                n = 0;
                                                                                                                n2 = 1;
                                                                                                                n3 = 1;
                                                                                                                x = e;
                                                                                                                continue Label_0551_Outer;
                                                                                                            }
                                                                                                            o = (lqt)((Message)o).obj;
                                                                                                            this.f();
                                                                                                            this.o = (lrr[])(Object)o;
                                                                                                            Arrays.fill(this.k, null);
                                                                                                            this.h(2);
                                                                                                            this.e();
                                                                                                            return true;
                                                                                                        }
                                                                                                        this.g(7, elapsedRealtime, 10L);
                                                                                                        return true;
                                                                                                    }
                                                                                                    n3 = 1;
                                                                                                    continue Label_0551;
                                                                                                }
                                                                                                min = -1L;
                                                                                                continue Label_0460_Outer;
                                                                                            }
                                                                                            n2 = 1;
                                                                                            break Label_0519;
                                                                                            iftrue(Label_0642:)(c == -1L || c == -2L || b6 < c);
                                                                                            break Label_0551;
                                                                                            m = this.m((lrr)o);
                                                                                            iftrue(Label_0535:)(m);
                                                                                            break Block_37;
                                                                                        }
                                                                                        this.t = this.s;
                                                                                        this.h(3);
                                                                                        this.k();
                                                                                        continue Label_0765;
                                                                                    }
                                                                                    ((lrr)o).f();
                                                                                    continue Block_49_Outer;
                                                                                }
                                                                                this.i();
                                                                                continue Label_0765;
                                                                                Label_0517: {
                                                                                    n2 = 0;
                                                                                }
                                                                                continue Label_0519;
                                                                            }
                                                                            Label_1077: {
                                                                                s = false;
                                                                            }
                                                                            break Label_0765;
                                                                            Label_0440:
                                                                            e = Long.MAX_VALUE;
                                                                            continue Label_0445;
                                                                        }
                                                                        min = x;
                                                                        continue Label_0460_Outer;
                                                                        iftrue(Label_0765:)(n3 == 0);
                                                                        continue Block_42_Outer;
                                                                    }
                                                                    iftrue(Label_1077:)(((Message)o).arg1 == 0);
                                                                    break Block_57;
                                                                    this.h(5);
                                                                    this.k();
                                                                    continue Label_0765;
                                                                }
                                                                try {
                                                                    this.t = false;
                                                                    if (!(this.s = s)) {
                                                                        this.k();
                                                                        this.l();
                                                                    }
                                                                    else {
                                                                        u5 = this.u;
                                                                        if (u5 == 4) {
                                                                            this.i();
                                                                            this.a.sendEmptyMessage(7);
                                                                        }
                                                                        else if (u5 == 3) {
                                                                            this.a.sendEmptyMessage(7);
                                                                        }
                                                                    }
                                                                    return true;
                                                                }
                                                                finally {
                                                                    this.h.obtainMessage(3).sendToTarget();
                                                                }
                                                                continue Label_0651_Outer;
                                                                Label_0706: {
                                                                    u4 = this.u;
                                                                }
                                                                iftrue(Label_0739:)(u4 != 3);
                                                                continue Label_0694_Outer;
                                                            }
                                                            this.j();
                                                            return true;
                                                            Label_0811: {
                                                                iftrue(Label_0808:)(this.j.isEmpty());
                                                            }
                                                            continue Block_42_Outer;
                                                        }
                                                        Label_0596: {
                                                            min = x;
                                                        }
                                                        iftrue(Label_0651:)(b6 == -3L);
                                                        continue Label_0694_Outer;
                                                    }
                                                    s = true;
                                                    continue;
                                                }
                                                Label_0661: {
                                                    this.x = x;
                                                }
                                                iftrue(Label_0706:)(n2 == 0 || (this.e != -1L && this.e > this.f));
                                                continue Label_1080_Outer;
                                            }
                                            Label_0642: {
                                                min = Math.min(x, b6);
                                            }
                                            continue Label_0460_Outer;
                                        }
                                        Label_0549: {
                                            n3 = 0;
                                        }
                                        continue Label_0551;
                                    }
                                    min = x;
                                }
                                catch (final OutOfMemoryError o) {}
                                catch (final RuntimeException ex) {}
                                catch (final lqt lqt) {}
                            }
                            break;
                        }
                    }
                    break;
                }
                break;
            }
        }
        catch (final OutOfMemoryError outOfMemoryError) {}
        catch (final RuntimeException ex2) {}
        catch (final lqt lqt2) {}
        Log.e("ExoPlayerImplInternal", "Internal track renderer error.", (Throwable)o);
        this.h.obtainMessage(4, (Object)o).sendToTarget();
        this.j();
        return true;
    }
}
