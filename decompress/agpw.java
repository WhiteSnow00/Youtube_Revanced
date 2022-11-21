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

public final class agpw
{
    public final Object a;
    public int b;
    public final Object c;
    
    public agpw() {
        this.b = 1;
        this.a = new PriorityQueue(5);
        this.c = new PriorityQueue(5, Collections.reverseOrder());
    }
    
    public agpw(final adrp a, final String c) {
        this.b = 3;
        this.a = a;
        this.c = c;
    }
    
    public agpw(final Shader a, final ColorStateList c, final int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public agpw(final View view) {
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
    
    public agpw(final bah c) {
        this.a = new SparseArray();
        this.c = c;
        this.b = -1;
    }
    
    public agpw(final dfp c) {
        this.a = dpr.b(150, (dpn)new dfn(this, 1, (byte[])null, (byte[])null, (byte[])null));
        this.c = c;
    }
    
    public agpw(final gab c, final qrk a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = 1;
        this.c = c;
        this.a = a;
    }
    
    public agpw(final Object a, final int b) {
        this.c = new LinkedHashMap();
        this.a = a;
        this.b = b;
    }
    
    public agpw(final String c, final alau a) {
        this.b = 0;
        this.c = c;
        this.a = a;
    }
    
    public agpw(final zwq zwq) {
        final HashSet c = new HashSet();
        this.c = c;
        final HashSet set = c;
        this.a = new zwv(this, c, (byte[])null, (byte[])null);
        this.b = zwq.k().size();
    }
    
    public agpw(final byte[] array) {
        this.b = -1;
        this.c = new float[4];
        this.a = new float[4];
    }
    
    public agpw(final byte[] array, final byte[] array2) {
        this.c = new EnumMap((Class<Enum>)fye.class);
        final fye[] values = fye.values();
        final int length = values.length;
        final Integer value = 0;
        for (int i = 0; i < length; ++i) {
            ((EnumMap)this.c).put((Enum)values[i], value);
        }
        this.b = 0;
        this.a = atls.aF((Object)value);
    }
    
    public agpw(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new Object();
        this.c = new PriorityQueue(10, Collections.reverseOrder());
        this.b = Integer.MIN_VALUE;
    }
    
    public agpw(final char[] array, final byte[] array2) {
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
    
    public static agpw Q(final int n) {
        return new agpw(null, null, n);
    }
    
    private final rbm R(final rbl rbl) {
        for (final rbm rbm : (PriorityQueue)this.a) {
            if (rbm.b == rbl) {
                return rbm;
            }
        }
        for (final rbm rbm2 : (PriorityQueue)this.c) {
            if (rbm2.b == rbl) {
                return rbm2;
            }
        }
        return null;
    }
    
    private final void S() {
        synchronized (this) {
            if (((PriorityQueue)this.a).size() < this.b) {
                final rbm rbm = ((PriorityQueue)this.c).poll();
                if (rbm != null) {
                    ((PriorityQueue)this.a).add(rbm);
                    rbm.c = false;
                    rbm.b.a();
                }
            }
            else {
                qol.d(((PriorityQueue)this.a).isEmpty() ^ true);
                final rbm rbm2 = ((PriorityQueue)this.c).peek();
                if (rbm2 != null) {
                    final rbm rbm3 = ((PriorityQueue)this.a).peek();
                    if (rbm2.a > rbm3.a && !rbm3.c) {
                        rbm3.c = true;
                        rbm3.b.b();
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
            throw new azj(n, b);
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
                b = baz.a;
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
    
    public final oc J(final int n) {
        oc oc;
        if ((oc = (oc)((SparseArray)this.c).get(n)) == null) {
            oc = new oc();
            ((SparseArray)this.c).put(n, (Object)oc);
        }
        return oc;
    }
    
    public final oo K(int size) {
        final oc oc = (oc)((SparseArray)this.c).get(size);
        if (oc != null && !oc.a.isEmpty()) {
            final ArrayList a = oc.a;
            size = a.size();
            int n;
            do {
                n = size - 1;
                if (n < 0) {
                    return null;
                }
                size = n;
            } while (((oo)a.get(n)).r());
            return (oo)a.remove(n);
        }
        return null;
    }
    
    public final void L() {
        ++this.b;
    }
    
    public final void M() {
        for (int i = 0; i < ((SparseArray)this.c).size(); ++i) {
            final oc oc = (oc)((SparseArray)this.c).valueAt(i);
            final ArrayList a = oc.a;
            for (int size = a.size(), j = 0; j < size; ++j) {
                apk.d(((oo)a.get(j)).a);
            }
            oc.a.clear();
        }
    }
    
    public final void N() {
        --this.b;
    }
    
    public final void O(final oo oo) {
        final int f = oo.f;
        final ArrayList a = this.J(f).a;
        final int b = ((oc)((SparseArray)this.c).get(f)).b;
        if (a.size() >= 5) {
            apk.d(oo.a);
            return;
        }
        oo.l();
        a.add(oo);
    }
    
    public final boolean a() {
        return !((LinkedHashMap)this.c).isEmpty();
    }
    
    public final vic b() {
        final Object a = this.a;
        if (a != null && !((List)((alau)a).c).isEmpty() && ((albb)((alau)this.a).c.get(0)).b == 49399797) {
            final albb albb = (albb)((alau)this.a).c.get(0);
            aobc a2;
            if (albb.b == 49399797) {
                a2 = (aobc)albb.c;
            }
            else {
                a2 = aobc.a;
            }
            return new vic(a2);
        }
        return null;
    }
    
    public final aoaj c() {
        final Object a = this.a;
        if (a != null && !((List)((alau)a).c).isEmpty() && ((albb)((alau)this.a).c.get(0)).b == 87359530) {
            final albb albb = (albb)((alau)this.a).c.get(0);
            aoaj a2;
            if (albb.b == 87359530) {
                a2 = (aoaj)albb.c;
            }
            else {
                a2 = aoaj.a;
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
    
    public final zwv e() {
        synchronized (this) {
            return (zwv)this.a;
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
    
    public final void l(final rbl rbl) {
        synchronized (this) {
            rbl.getClass();
            final rbm r = this.R(rbl);
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
                final rbm rbm = ((PriorityQueue)this.c).poll();
                ((PriorityQueue)this.a).add(rbm);
                rbm.b.a();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void n(final rbl rbl, final int n) {
        synchronized (this) {
            rbl.getClass();
            final rbm r = this.R(rbl);
            if (r == null) {
                ((PriorityQueue<Object>)this.c).add(new rbm(n, rbl));
            }
            else {
                if (r.a == n) {
                    return;
                }
                if (((PriorityQueue)this.c).contains(r)) {
                    ((PriorityQueue)this.c).remove(r);
                    ((PriorityQueue<Object>)this.c).add(new rbm(n, rbl));
                }
                else {
                    ((PriorityQueue)this.a).remove(r);
                    ((PriorityQueue<Object>)this.a).add(new rbm(n, rbl));
                }
            }
            this.S();
        }
    }
    
    public final void o(final rbl rbl) {
        synchronized (this) {
            rbl.getClass();
            final rbm r = this.R(rbl);
            if (r != null) {
                ((PriorityQueue)this.a).remove(r);
                ((PriorityQueue)this.c).remove(r);
                this.S();
            }
        }
    }
    
    public final boolean p(final rbl rbl) {
        synchronized (this) {
            qol.b(this.q(rbl));
            ((PriorityQueue)this.a).remove(this.R(rbl));
            final int b = this.b;
            if (b == 1) {
                return false;
            }
            this.b = b - 1;
            return true;
        }
    }
    
    public final boolean q(final rbl rbl) {
        synchronized (this) {
            final rbm r = this.R(rbl);
            return r != null && ((PriorityQueue)this.a).contains(r);
        }
    }
    
    public final void r(final float n, final float n2) {
        nyk.c(this.b + 1 < 4, "Attempt to add more than 3 segments");
        final int b = this.b + 1;
        this.b = b;
        ((float[])this.c)[b] = n;
        ((float[])this.a)[b] = n2;
    }
    
    public final void s(final float n) {
        nyk.c(this.b >= 0, "Attempt to correct a point not added yet");
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
        ((qrk)this.a).b((afax)new fqv(n, 4), (Executor)afwd.a);
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
                        apkf apkf;
                        if (--n != 1) {
                            if (n != 2) {
                                if (n != 3) {
                                    if (n != 4) {
                                        znh.b(zng.b, znf.f, "Transcode is canceled with unknown transcode mode");
                                        break Label_0149;
                                    }
                                    apkf = apkf.bx;
                                }
                                else {
                                    apkf = apkf.bp;
                                }
                            }
                            else {
                                apkf = apkf.aQ;
                            }
                        }
                        else {
                            apkf = apkf.bl;
                        }
                        if (apkf != null) {
                            ((gab)c).P(apkf, 10);
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
                Label_0560: {
                    if (b) {
                        final Object c2 = this.c;
                        n = this.b;
                        if (n == 0) {
                            throw null;
                        }
                        apkf apkf2;
                        if (--n != 1) {
                            if (n != 2) {
                                if (n != 3) {
                                    if (n != 4) {
                                        znh.b(zng.b, znf.f, "Transcode timed out with unknown transcode mode");
                                        break Label_0560;
                                    }
                                    apkf2 = apkf.by;
                                }
                                else {
                                    apkf2 = apkf.bq;
                                    s = "[ShortsCreation][Android][VideoIngestion]";
                                }
                            }
                            else {
                                apkf2 = apkf.aR;
                                s = "[ShortsCreation][Android][SegmentImport]";
                            }
                        }
                        else {
                            apkf2 = apkf.bm;
                            s = "[ShortsCreation][Android][ClipEdit]";
                        }
                        if (apkf2 != null) {
                            ((gab)c2).P(apkf2, 10);
                        }
                        final zng b2 = zng.b;
                        final znf f = znf.f;
                        final String string = ex2.toString();
                        final StringBuilder sb = new StringBuilder();
                        sb.append(s);
                        sb.append(" Transcode timeout due to ");
                        sb.append(string);
                        znh.c(b2, f, sb.toString(), (Throwable)ex2);
                    }
                    else {
                        final Object c3 = this.c;
                        n = this.b;
                        if (n == 0) {
                            throw null;
                        }
                        apkf apkf3;
                        if (--n != 1) {
                            if (n != 2) {
                                if (n != 3) {
                                    if (n != 4) {
                                        znh.b(zng.b, znf.f, "Transcode fails with unknown transcode mode");
                                        break Label_0560;
                                    }
                                    apkf3 = apkf.bw;
                                }
                                else {
                                    apkf3 = apkf.bo;
                                    s = "[ShortsCreation][Android][VideoIngestion]";
                                }
                            }
                            else {
                                apkf3 = apkf.aP;
                                s = "[ShortsCreation][Android][SegmentImport]";
                            }
                        }
                        else {
                            apkf3 = apkf.bk;
                            s = "[ShortsCreation][Android][ClipEdit]";
                        }
                        if (apkf3 != null) {
                            ((gab)c3).P(apkf3, 10);
                        }
                        final zng b3 = zng.b;
                        final znf f2 = znf.f;
                        final String string2 = ex2.toString();
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(s);
                        sb2.append(" Transcode fails due to ");
                        sb2.append(string2);
                        znh.c(b3, f2, sb2.toString(), (Throwable)ex2);
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
            Label_0674: {
                apkf apkf4;
                if (--n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                znh.b(zng.b, znf.f, "Transcode is completed with unknown transcode mode");
                                break Label_0674;
                            }
                            apkf4 = apkf.bv;
                        }
                        else {
                            apkf4 = apkf.bn;
                        }
                    }
                    else {
                        apkf4 = apkf.aO;
                    }
                }
                else {
                    apkf4 = apkf.bj;
                }
                if (apkf4 != null) {
                    ((gab)c4).P(apkf4, 10);
                }
            }
            if (context != null) {
                context.sendBroadcast(new Intent("onTranscodeCompleted"));
            }
        }
    }
    
    public final void x(final fye fye, int b) {
        ((EnumMap)this.c).put((Enum)fye, b);
        final Iterator iterator = ((EnumMap)this.c).values().iterator();
        b = 0;
        while (iterator.hasNext()) {
            b += (int)iterator.next();
        }
        if (this.b == b) {
            return;
        }
        this.b = b;
        ((atls)this.a).tt((Object)b);
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
