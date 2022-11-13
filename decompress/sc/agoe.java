import java.util.List;
import java.util.concurrent.TimeoutException;
import android.content.Intent;
import java.util.concurrent.Executor;
import android.graphics.Path;
import java.util.ArrayList;
import android.content.Context;
import android.content.BroadcastReceiver;
import java.util.Iterator;
import java.util.Map;
import java.util.IdentityHashMap;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import android.util.SparseArray;
import android.view.ViewParent;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import android.view.View;
import android.content.res.ColorStateList;
import android.graphics.Shader;
import java.util.Collections;
import java.util.PriorityQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoe
{
    public final Object a;
    public int b;
    public final Object c;
    
    public agoe() {
        this.b = 1;
        this.a = new PriorityQueue(5);
        this.c = new PriorityQueue(5, Collections.reverseOrder());
    }
    
    public agoe(final adpz a, final String c) {
        this.b = 3;
        this.a = a;
        this.c = c;
    }
    
    public agoe(final Shader a, final ColorStateList c, final int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public agoe(final View view) {
        ViewParent viewParent;
        for (viewParent = view.getParent(); viewParent != null && !(viewParent instanceof NestedScrollView); viewParent = viewParent.getParent()) {}
        ViewGroup c;
        if ((this.a = viewParent) == null) {
            ViewParent viewParent2;
            for (viewParent2 = view.getParent(); viewParent2 != null && (!(viewParent2 instanceof View) || ((View)viewParent2).getId() != 2131429747); viewParent2 = viewParent2.getParent()) {}
            c = (ViewGroup)viewParent2;
        }
        else {
            c = null;
        }
        this.c = c;
    }
    
    public agoe(final bag c) {
        this.a = new SparseArray();
        this.c = c;
        this.b = -1;
    }
    
    public agoe(final dfl c) {
        this.a = dpo.b(150, (dpk)new dfj(this, 1, (byte[])null, (byte[])null, (byte[])null));
        this.c = c;
    }
    
    public agoe(final fzw c, final qqr a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = 1;
        this.c = c;
        this.a = a;
    }
    
    public agoe(final Object a, final int b) {
        this.c = new LinkedHashMap();
        this.a = a;
        this.b = b;
    }
    
    public agoe(final String c, final akyu a) {
        this.b = 0;
        this.c = c;
        this.a = a;
    }
    
    public agoe(final zus zus) {
        final HashSet c = new HashSet();
        this.c = c;
        final HashSet set = c;
        this.a = new zux(this, c, (byte[])null, (byte[])null);
        this.b = zus.k().size();
    }
    
    public agoe(final byte[] array) {
        this.b = -1;
        this.c = new float[4];
        this.a = new float[4];
    }
    
    public agoe(final byte[] array, final byte[] array2) {
        this.c = new EnumMap((Class<Enum>)fxz.class);
        final fxz[] values = fxz.values();
        final int length = values.length;
        final Integer value = 0;
        for (int i = 0; i < length; ++i) {
            ((EnumMap)this.c).put((Enum)values[i], value);
        }
        this.b = 0;
        this.a = ativ.aF((Object)value);
    }
    
    public agoe(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new Object();
        this.c = new PriorityQueue(10, Collections.reverseOrder());
        this.b = Integer.MIN_VALUE;
    }
    
    public agoe(final char[] array, final byte[] array2) {
        this.c = new SparseArray();
        this.b = 0;
        this.a = Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
    }
    
    public static final long P(final long n, final long n2) {
        if (n == 0L) {
            return n2;
        }
        return n / 4L * 3L + n2 / 4L;
    }
    
    public static agoe Q(final int n) {
        return new agoe(null, null, n);
    }
    
    private final rao R(final ran ran) {
        for (final rao rao : (PriorityQueue)this.a) {
            if (rao.b == ran) {
                return rao;
            }
        }
        for (final rao rao2 : (PriorityQueue)this.c) {
            if (rao2.b == ran) {
                return rao2;
            }
        }
        return null;
    }
    
    private final void S() {
        synchronized (this) {
            if (((PriorityQueue)this.a).size() < this.b) {
                final rao rao = ((PriorityQueue)this.c).poll();
                if (rao != null) {
                    ((PriorityQueue)this.a).add(rao);
                    rao.c = false;
                    rao.b.a();
                }
            }
            else {
                qnr.d(((PriorityQueue)this.a).isEmpty() ^ true);
                final rao rao2 = ((PriorityQueue)this.c).peek();
                if (rao2 != null) {
                    final rao rao3 = ((PriorityQueue)this.a).peek();
                    if (rao2.a > rao3.a && !rao3.c) {
                        rao3.c = true;
                        rao3.b.b();
                    }
                }
            }
        }
    }
    
    public static void u(final BroadcastReceiver broadcastReceiver, final Context context) {
        if (context != null) {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
    
    public final boolean A() {
        return ((SparseArray)this.a).size() == 0;
    }
    
    public final void B(final int n) {
        synchronized (this.a) {
            ((PriorityQueue)this.c).add(n);
            this.b = Math.max(this.b, n);
        }
    }
    
    public final void C(final int n) {
        final Object a = this.a;
        monitorenter(a);
        try {
            while (this.b != n) {
                this.a.wait();
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void D(final int n) {
        synchronized (this.a) {
            final int b = this.b;
            if (b == n) {
                return;
            }
            throw new azi(n, b);
        }
    }
    
    public final void E(int b) {
        synchronized (this.a) {
            ((PriorityQueue)this.c).remove(b);
            if (((PriorityQueue)this.c).isEmpty()) {
                b = Integer.MIN_VALUE;
            }
            else {
                final Integer n = ((PriorityQueue)this.c).peek();
                b = bax.a;
                b = n;
            }
            this.b = b;
            this.a.notifyAll();
        }
    }
    
    public final boolean F() {
        return this.a != null;
    }
    
    public final boolean G() {
        if (this.a == null) {
            final Object c = this.c;
            if (c != null && ((ColorStateList)c).isStateful()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean H(final int[] array) {
        if (this.G()) {
            final ColorStateList list = (ColorStateList)this.c;
            final int colorForState = list.getColorForState(array, list.getDefaultColor());
            if (colorForState != this.b) {
                this.b = colorForState;
                return true;
            }
        }
        return false;
    }
    
    public final boolean I() {
        return this.F() || this.b != 0;
    }
    
    public final ob J(final int n) {
        ob ob;
        if ((ob = (ob)((SparseArray)this.c).get(n)) == null) {
            ob = new ob();
            ((SparseArray)this.c).put(n, (Object)ob);
        }
        return ob;
    }
    
    public final on K(int size) {
        final ob ob = (ob)((SparseArray)this.c).get(size);
        if (ob != null && !ob.a.isEmpty()) {
            final ArrayList a = ob.a;
            size = a.size();
            int n;
            do {
                n = size - 1;
                if (n < 0) {
                    return null;
                }
                size = n;
            } while (((on)a.get(n)).r());
            return (on)a.remove(n);
        }
        return null;
    }
    
    public final void L() {
        ++this.b;
    }
    
    public final void M() {
        for (int i = 0; i < ((SparseArray)this.c).size(); ++i) {
            final ob ob = (ob)((SparseArray)this.c).valueAt(i);
            final ArrayList a = ob.a;
            for (int size = a.size(), j = 0; j < size; ++j) {
                apk.e(((on)a.get(j)).a);
            }
            ob.a.clear();
        }
    }
    
    public final void N() {
        --this.b;
    }
    
    public final void O(final on on) {
        final int f = on.f;
        final ArrayList a = this.J(f).a;
        final int b = ((ob)((SparseArray)this.c).get(f)).b;
        if (a.size() >= 5) {
            apk.e(on.a);
            return;
        }
        on.l();
        a.add(on);
    }
    
    public final boolean a() {
        return !((LinkedHashMap)this.c).isEmpty();
    }
    
    public final vgu b() {
        final Object a = this.a;
        if (a != null && !((List)((akyu)a).c).isEmpty() && ((akzb)((akyu)this.a).c.get(0)).b == 49399797) {
            final akzb akzb = (akzb)((akyu)this.a).c.get(0);
            anyv a2;
            if (akzb.b == 49399797) {
                a2 = (anyv)akzb.c;
            }
            else {
                a2 = anyv.a;
            }
            return new vgu(a2);
        }
        return null;
    }
    
    public final anyc c() {
        final Object a = this.a;
        if (a != null && !((List)((akyu)a).c).isEmpty() && ((akzb)((akyu)this.a).c.get(0)).b == 87359530) {
            final akzb akzb = (akzb)((akyu)this.a).c.get(0);
            anyc a2;
            if (akzb.b == 87359530) {
                a2 = (anyc)akzb.c;
            }
            else {
                a2 = anyc.a;
            }
            return a2;
        }
        return null;
    }
    
    public final int d() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final zux e() {
        synchronized (this) {
            return (zux)this.a;
        }
    }
    
    public final HashSet f() {
        synchronized (this) {
            return (HashSet)this.c;
        }
    }
    
    public final void g(final String s) {
        synchronized (this) {
            ((HashSet)this.c).add(s);
        }
    }
    
    public final void h(final String s) {
        synchronized (this) {
            ((HashSet)this.c).remove(s);
        }
    }
    
    public final void i(final int b) {
        synchronized (this) {
            this.e().d();
            this.b = b;
        }
    }
    
    public final void j() {
        final Object a = this.a;
        if (a != null) {
            ((NestedScrollView)a).scrollBy(0, -this.b);
            this.b = 0;
            return;
        }
        final Object c = this.c;
        if (c != null) {
            ((ViewGroup)c).scrollBy(0, -this.b);
            this.b = 0;
        }
    }
    
    public final int k() {
        final Object a = this.a;
        if (a == null && this.c == null) {
            return 1;
        }
        if (a != null) {
            if (((NestedScrollView)a).getChildCount() != 1 || ((NestedScrollView)this.a).getChildAt(0).getHeight() <= ((NestedScrollView)this.a).getHeight()) {
                return 2;
            }
        }
        else if (this.c == null) {
            return 2;
        }
        return 3;
    }
    
    public final void l(final ran ran) {
        synchronized (this) {
            ran.getClass();
            final rao r = this.R(ran);
            if (r != null && ((PriorityQueue)this.a).remove(r)) {
                ((PriorityQueue)this.c).add(r);
                this.S();
            }
        }
    }
    
    public final void m(final int b) {
        monitorenter(this);
        try {
            if (b <= this.b) {
                monitorexit(this);
                return;
            }
            this.b = b;
            while (((PriorityQueue)this.a).size() < this.b && !((PriorityQueue)this.c).isEmpty()) {
                final rao rao = ((PriorityQueue)this.c).poll();
                ((PriorityQueue)this.a).add(rao);
                rao.b.a();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void n(final ran ran, final int n) {
        synchronized (this) {
            ran.getClass();
            final rao r = this.R(ran);
            if (r == null) {
                ((PriorityQueue<Object>)this.c).add(new rao(n, ran));
            }
            else {
                if (r.a == n) {
                    return;
                }
                if (((PriorityQueue)this.c).contains(r)) {
                    ((PriorityQueue)this.c).remove(r);
                    ((PriorityQueue<Object>)this.c).add(new rao(n, ran));
                }
                else {
                    ((PriorityQueue)this.a).remove(r);
                    ((PriorityQueue<Object>)this.a).add(new rao(n, ran));
                }
            }
            this.S();
        }
    }
    
    public final void o(final ran ran) {
        synchronized (this) {
            ran.getClass();
            final rao r = this.R(ran);
            if (r != null) {
                ((PriorityQueue)this.a).remove(r);
                ((PriorityQueue)this.c).remove(r);
                this.S();
            }
        }
    }
    
    public final boolean p(final ran ran) {
        synchronized (this) {
            qnr.b(this.q(ran));
            ((PriorityQueue)this.a).remove(this.R(ran));
            final int b = this.b;
            if (b == 1) {
                return false;
            }
            this.b = b - 1;
            return true;
        }
    }
    
    public final boolean q(final ran ran) {
        synchronized (this) {
            final rao r = this.R(ran);
            return r != null && ((PriorityQueue)this.a).contains(r);
        }
    }
    
    public final void r(final float n, final float n2) {
        nxt.c(this.b + 1 < 4, "Attempt to add more than 3 segments");
        final int b = this.b + 1;
        this.b = b;
        ((float[])this.c)[b] = n;
        ((float[])this.a)[b] = n2;
    }
    
    public final void s(final float n) {
        nxt.c(this.b >= 0, "Attempt to correct a point not added yet");
        ((float[])this.a)[this.b] = n;
    }
    
    public final void t(final Path path) {
        for (int i = 1; i <= this.b; ++i) {
            path.lineTo(((float[])this.c)[i], ((float[])this.a)[i]);
        }
    }
    
    public final void v(final int n, final Context context) {
        this.w(n, context, null);
    }
    
    public final void w(int n, final Context context, final Exception ex) {
        ((qqr)this.a).b((aezf)new fqt(n, 4), (Executor)afum.a);
        n -= 2;
        if (n != 2) {
            if (n != 3) {
                if (n == 4) {
                    final Object c = this.c;
                    n = this.b;
                    if (n == 0) {
                        throw null;
                    }
                    Label_0149: {
                        apht apht;
                        if (--n != 1) {
                            if (n != 2) {
                                if (n != 3) {
                                    if (n != 4) {
                                        zlm.b(zll.b, zlk.f, "Transcode is canceled with unknown transcode mode");
                                        break Label_0149;
                                    }
                                    apht = apht.bx;
                                }
                                else {
                                    apht = apht.bp;
                                }
                            }
                            else {
                                apht = apht.aQ;
                            }
                        }
                        else {
                            apht = apht.bl;
                        }
                        if (apht != null) {
                            ((fzw)c).L(apht, 10);
                        }
                    }
                    if (context != null) {
                        context.sendBroadcast(new Intent("onTranscodeCancelled"));
                    }
                }
            }
            else {
                Exception ex2;
                if ((ex2 = ex) == null) {
                    ex2 = new IllegalStateException("Transcode failed without reason");
                }
                final boolean b = ex2 instanceof TimeoutException;
                String s = "";
                Label_0469: {
                    if (b) {
                        final Object c2 = this.c;
                        n = this.b;
                        if (n == 0) {
                            throw null;
                        }
                        apht apht2;
                        if (--n != 1) {
                            if (n != 2) {
                                if (n != 3) {
                                    if (n != 4) {
                                        zlm.b(zll.b, zlk.f, "Transcode timed out with unknown transcode mode");
                                        break Label_0469;
                                    }
                                    apht2 = apht.by;
                                }
                                else {
                                    apht2 = apht.bq;
                                    s = "[ShortsCreation][Android][VideoIngestion]";
                                }
                            }
                            else {
                                apht2 = apht.aR;
                                s = "[ShortsCreation][Android][SegmentImport]";
                            }
                        }
                        else {
                            apht2 = apht.bm;
                            s = "[ShortsCreation][Android][ClipEdit]";
                        }
                        if (apht2 != null) {
                            ((fzw)c2).L(apht2, 10);
                        }
                        zlm.c(zll.b, zlk.f, s.concat(ex2.toString()), (Throwable)ex2);
                    }
                    else {
                        final Object c3 = this.c;
                        n = this.b;
                        if (n == 0) {
                            throw null;
                        }
                        apht apht3;
                        if (--n != 1) {
                            if (n != 2) {
                                if (n != 3) {
                                    if (n != 4) {
                                        zlm.b(zll.b, zlk.f, "Transcode fails with unknown transcode mode");
                                        break Label_0469;
                                    }
                                    apht3 = apht.bw;
                                }
                                else {
                                    apht3 = apht.bo;
                                    s = "[ShortsCreation][Android][VideoIngestion]";
                                }
                            }
                            else {
                                apht3 = apht.aP;
                                s = "[ShortsCreation][Android][SegmentImport]";
                            }
                        }
                        else {
                            apht3 = apht.bk;
                            s = "[ShortsCreation][Android][ClipEdit]";
                        }
                        if (apht3 != null) {
                            ((fzw)c3).L(apht3, 10);
                        }
                        zlm.c(zll.b, zlk.f, s.concat(ex2.toString()), (Throwable)ex2);
                    }
                }
                if (context != null) {
                    context.sendBroadcast(new Intent("onTranscodeFailed"));
                }
            }
        }
        else {
            final Object c4 = this.c;
            n = this.b;
            if (n == 0) {
                throw null;
            }
            Label_0583: {
                apht apht4;
                if (--n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                zlm.b(zll.b, zlk.f, "Transcode is completed with unknown transcode mode");
                                break Label_0583;
                            }
                            apht4 = apht.bv;
                        }
                        else {
                            apht4 = apht.bn;
                        }
                    }
                    else {
                        apht4 = apht.aO;
                    }
                }
                else {
                    apht4 = apht.bj;
                }
                if (apht4 != null) {
                    ((fzw)c4).L(apht4, 10);
                }
            }
            if (context != null) {
                context.sendBroadcast(new Intent("onTranscodeCompleted"));
            }
        }
    }
    
    public final void x(final fxz fxz, int b) {
        ((EnumMap)this.c).put((Enum)fxz, b);
        final Iterator iterator = ((EnumMap)this.c).values().iterator();
        b = 0;
        while (iterator.hasNext()) {
            b += (int)iterator.next();
        }
        if (this.b == b) {
            return;
        }
        this.b = b;
        ((ativ)this.a).tu((Object)b);
    }
    
    public final Object y(int b) {
        while (true) {
            Label_0018: {
                if (this.b != -1) {
                    break Label_0018;
                }
                final int b2 = 0;
                this.b = b2;
            }
            final int b3 = this.b;
            if (b3 > 0) {
                if (b < ((SparseArray)this.a).keyAt(b3)) {
                    final int b2 = this.b - 1;
                    continue;
                }
            }
            break;
        }
        while (this.b < ((SparseArray)this.a).size() - 1 && b >= ((SparseArray)this.a).keyAt(this.b + 1)) {
            ++this.b;
        }
        final Object a = this.a;
        b = this.b;
        return ((SparseArray)a).valueAt(b);
    }
    
    public final Object z() {
        final SparseArray sparseArray = (SparseArray)this.a;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }
}
