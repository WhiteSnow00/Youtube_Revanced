import android.graphics.drawable.RippleDrawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import java.util.List;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import java.util.ArrayList;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import java.util.Iterator;
import java.util.Map;
import org.webrtc.Logging;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.HashMap;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownView;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhz
{
    private static arhz c;
    public final Object a;
    public int b;
    
    public arhz() {
        this.a = new Object();
    }
    
    public arhz(final ImageView a) {
        this.b = 0;
        this.a = a;
    }
    
    public arhz(final AdCountdownView a, final acig acig) {
        a.getClass();
        this.a = a;
        a.b = new sme(a.d, new acip((tqp)acig, a.d), a.getBackground(), a.getAlpha());
        final slw c = a.c;
        final acip acip = new acip((tqp)acig, c.b);
        final ImageView b = c.b;
        c.m = new sme(b, acip, b.getBackground(), c.b.getAlpha());
        this.b = a.getVisibility();
        this.d();
    }
    
    public arhz(final byte[] array) {
        this.b = -1;
        this.a = new HashMap();
    }
    
    private arhz(final byte[] array, final byte[] array2) {
        this.b = 0;
        this.a = new abi();
    }
    
    public arhz(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new bat(8);
    }
    
    public arhz(final byte[] array, final char[] array2) {
        this.a = new ReentrantLock();
    }
    
    public arhz(final char[] array) {
        this.a = new AtomicInteger();
        this.b = 1;
    }
    
    public arhz(final char[] array, final byte[] array2) {
        this.k();
        this.a = agpx.P(2131429811, 2131429812, 2131429823, 2131429824, 2131429825, 2131429826, 2131429827, 2131429828, 2131429829, 2131429830, 2131429813, 2131429814, 2131429815, 2131429816, 2131429817, 2131429818, 2131429819, 2131429820, 2131429821, 2131429822);
    }
    
    public arhz(final char[] array, final byte[] array2, final byte[] array3) {
        this.a = new Object[256];
    }
    
    public static arhz t() {
        synchronized (arhz.class) {
            if (arhz.c == null) {
                arhz.c = new arhz((byte[])null, (byte[])null);
            }
            return arhz.c;
        }
    }
    
    public final void a() {
        final Object a = this.a;
        monitorenter(a);
        boolean b = false;
        try {
            while (this.b > 0) {
                try {
                    this.a.wait();
                }
                catch (final InterruptedException ex) {
                    Logging.c("IMCVideoEncoder", "Interrupted while waiting on busy count", (Throwable)ex);
                    b = true;
                }
            }
            monitorexit(a);
            if (b) {
                Thread.currentThread().interrupt();
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void b(final char b, final String s) {
        ((Map<Character, String>)this.a).put(Character.valueOf(b), s);
        if (b > this.b) {
            this.b = b;
        }
    }
    
    public final void c() {
        final char[][] array = new char[this.b + 1][];
        for (final Map.Entry<Character, V> entry : ((Map<Object, Object>)this.a).entrySet()) {
            array[(char)entry.getKey()] = ((String)entry.getValue()).toCharArray();
        }
    }
    
    public final void d() {
        this.e(false);
        ((AdCountdownView)this.a).a();
    }
    
    public final void e(final boolean b) {
        ((AdCountdownView)this.a).b(b);
        ((AdCountdownView)this.a).setVisibility(this.b);
    }
    
    public final void f(final int n) {
        this.b = n;
        ((AdCountdownView)this.a).setVisibility(n);
    }
    
    public final void g() {
        final int decrementAndGet = ((AtomicInteger)this.a).decrementAndGet();
        if (decrementAndGet < 0) {
            ((AtomicInteger)this.a).addAndGet(-decrementAndGet);
            final StringBuilder sb = new StringBuilder("AudioBufferManager: Invalid decrementBuffersInUse to new value: ");
            sb.append(decrementAndGet);
            rbf.b(sb.toString());
        }
    }
    
    public final BatchedLogErrorParcelable h() {
        synchronized (this) {
            final ArrayList<LogErrorParcelable> list = new ArrayList<LogErrorParcelable>(((Map<K, ? extends LogErrorParcelable>)this.a).values());
            final int b = this.b;
            if (b > 0) {
                list.add(new LogErrorParcelable("UNKNOWN", 1002, b));
                this.b = 0;
            }
            ((Map)this.a).clear();
            return new BatchedLogErrorParcelable((List)list);
        }
    }
    
    public final void i(final LogErrorParcelable logErrorParcelable) {
        synchronized (this) {
            final akr akr = new akr((Object)logErrorParcelable.a, (Object)logErrorParcelable.b);
            final LogErrorParcelable logErrorParcelable2 = ((Map<K, LogErrorParcelable>)this.a).get(akr);
            if (logErrorParcelable2 != null) {
                logErrorParcelable2.c = aftz.p(logErrorParcelable2.c, logErrorParcelable.c);
                return;
            }
            final Object a = this.a;
            if (((abp)a).d >= 100) {
                this.b = aftz.p(this.b, logErrorParcelable.c);
                return;
            }
            ((Map<akr, LogErrorParcelable>)a).put(akr, logErrorParcelable);
        }
    }
    
    public final long j(final btn btn) {
        final byte[] a = ((bat)this.a).a;
        int i = 0;
        btn.j(a, 0, 1);
        final int n = ((bat)this.a).a[0] & 0xFF;
        if (n != 0) {
            int n2;
            int n3;
            for (n2 = 128, n3 = 0; (n & n2) == 0x0; n2 >>= 1, ++n3) {}
            int n4 = n & ~n2;
            btn.j(((bat)this.a).a, 1, n3);
            while (i < n3) {
                final byte[] a2 = ((bat)this.a).a;
                ++i;
                n4 = (a2[i] & 0xFF) + (n4 << 8);
            }
            this.b += n3 + 1;
            return n4;
        }
        return Long.MIN_VALUE;
    }
    
    public final void k() {
        this.b = -1;
    }
    
    public final void l() {
        if (((ImageView)this.a).getDrawable() != null) {
            ((ImageView)this.a).getDrawable().setLevel(this.b);
        }
    }
    
    public final void m() {
        final Drawable drawable = ((ImageView)this.a).getDrawable();
        if (drawable != null) {
            mc.c(drawable);
        }
    }
    
    public final void n(final AttributeSet set, int i) {
        final cdr w = cdr.w(((ImageView)this.a).getContext(), set, gm.f, i, 0);
        final Object a = this.a;
        anc.M((View)a, ((ImageView)a).getContext(), gm.f, set, (TypedArray)w.a, i, 0);
        try {
            Drawable drawable2;
            final Drawable drawable = drawable2 = ((ImageView)this.a).getDrawable();
            if (drawable == null) {
                i = w.i(1, -1);
                drawable2 = drawable;
                if (i != -1) {
                    final Drawable b = fc.b(((ImageView)this.a).getContext(), i);
                    if ((drawable2 = b) != null) {
                        ((ImageView)this.a).setImageDrawable(b);
                        drawable2 = b;
                    }
                }
            }
            if (drawable2 != null) {
                mc.c(drawable2);
            }
            if (w.q(2)) {
                apl.c((ImageView)this.a, w.j(2));
            }
            if (w.q(3)) {
                apl.d((ImageView)this.a, mc.a(w.f(3, -1), (PorterDuff$Mode)null));
            }
        }
        finally {
            w.o();
        }
    }
    
    public final void o(final Drawable drawable) {
        this.b = drawable.getLevel();
    }
    
    public final void p(final int n) {
        if (n != 0) {
            final Drawable b = fc.b(((ImageView)this.a).getContext(), n);
            if (b != null) {
                mc.c(b);
            }
            ((ImageView)this.a).setImageDrawable(b);
        }
        else {
            ((ImageView)this.a).setImageDrawable((Drawable)null);
        }
        this.m();
    }
    
    public final boolean q() {
        return !(((ImageView)this.a).getBackground() instanceof RippleDrawable);
    }
    
    public final Object r() {
        int b = this.b;
        if (b > 0) {
            --b;
            final Object[] array = (Object[])this.a;
            final Object o = array[b];
            array[b] = null;
            this.b = b;
            return o;
        }
        return null;
    }
    
    public final void s(final Object o) {
        final int b = this.b;
        if (b < 256) {
            ((Object[])this.a)[b] = o;
            this.b = b + 1;
        }
    }
    
    public final arjd u() {
        final int b = this.b + 1;
        this.b = b;
        if (b < ((ArrayList)this.a).size()) {
            return new arjd(this, this.b, null, null);
        }
        throw new IllegalStateException("This id for ActionBarMenuItem is exceeding the maximum allowed number.");
    }
}
