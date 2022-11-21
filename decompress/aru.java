import java.util.Arrays;
import java.util.ArrayList;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.Spannable;
import android.os.HandlerThread;
import java.util.Collection;
import android.os.Looper;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import android.os.Handler;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aru
{
    private static final Object k;
    private static volatile aru l;
    public final ReadWriteLock a;
    public final Set b;
    public int c;
    public final Handler d;
    public final arp e;
    final art f;
    public final boolean g;
    final boolean h;
    final int[] i;
    public final arr j;
    
    static {
        k = new Object();
    }
    
    private aru(arq e) {
        final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
        this.a = a;
        this.c = 3;
        this.g = e.b;
        this.h = e.c;
        this.i = e.d;
        this.f = e.a;
        this.j = e.f;
        this.d = new Handler(Looper.getMainLooper());
        final abk b = new abk();
        this.b = b;
        final Set e2 = e.e;
        if (e2 != null && !e2.isEmpty()) {
            b.addAll(e2);
        }
        e = (arq)new aro(this);
        this.e = (arp)e;
        a.writeLock().lock();
        try {
            this.c = 0;
            a.writeLock().unlock();
            if (this.a() == 0) {
                try {
                    final aro aro = (aro)e;
                    final oqz oqz = new oqz((aro)e);
                    final aro aro2 = (aro)e;
                    final art f = ((aro)e).c.f;
                    synchronized (((asb)f).a) {
                        if (((asb)f).b == null) {
                            (((asb)f).c = new HandlerThread("emojiCompat", 10)).start();
                            ((asb)f).b = new Handler(((asb)f).c.getLooper());
                        }
                        ((asb)f).b.post((Runnable)new vt((asb)f, oqz, 14, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                    }
                }
                finally {
                    final aro aro3 = (aro)e;
                    ((aro)e).c.h();
                }
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public static aru b() {
        synchronized (aru.k) {
            afc.f(aru.l != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            return aru.l;
        }
    }
    
    public static void f(final arq arq) {
        if (aru.l == null) {
            synchronized (aru.k) {
                if (aru.l == null) {
                    aru.l = new aru(arq);
                }
            }
        }
    }
    
    public final int a() {
        this.a.readLock().lock();
        try {
            return this.c;
        }
        finally {
            this.a.readLock().unlock();
        }
    }
    
    public final CharSequence c(final CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        }
        else {
            length = charSequence.length();
        }
        return this.d(charSequence, 0, length);
    }
    
    public final CharSequence d(final CharSequence charSequence, final int n, final int n2) {
        return this.g(charSequence, n, n2, Integer.MAX_VALUE);
    }
    
    public final boolean e() {
        return this.a() == 1;
    }
    
    public final CharSequence g(final CharSequence charSequence, int spanEnd, int n, int n2) {
        int min = spanEnd;
        afc.f(this.e(), "Not initialized yet");
        afc.i(min, "start cannot be negative");
        afc.i(n, "end cannot be negative");
        afc.i(n2, "maxEmojiCount cannot be negative");
        afc.d(min <= n, "start should be <= than end");
        final CharSequence charSequence2 = null;
        if (charSequence == null) {
            return null;
        }
        afc.d(min <= charSequence.length(), "start should be < than charSequence length");
        afc.d(n <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() != 0) {
            if (min != n) {
                final boolean g = this.g;
                final aufw a = ((aro)this.e).a;
                final boolean b = charSequence instanceof aso;
                if (b) {
                    ((aso)charSequence).a();
                }
                Label_0235: {
                    if (b) {
                        break Label_0235;
                    }
                    try {
                        Object o;
                        if (charSequence instanceof Spannable) {
                            o = charSequence;
                        }
                        else {
                            o = charSequence2;
                            if (charSequence instanceof Spanned) {
                                o = charSequence2;
                                if (((Spanned)charSequence).nextSpanTransition(min - 1, n + 1, (Class)ary.class) <= n) {
                                    o = new SpannableString(charSequence);
                                }
                            }
                        }
                        spanEnd = min;
                        int n3 = n;
                        if (o != null) {
                            final ary[] array = (ary[])((Spannable)o).getSpans(min, n, (Class)ary.class);
                            spanEnd = min;
                            n3 = n;
                            if (array != null) {
                                final int length = array.length;
                                spanEnd = min;
                                n3 = n;
                                if (length > 0) {
                                    int n4 = 0;
                                    while (true) {
                                        spanEnd = min;
                                        n3 = n;
                                        if (n4 >= length) {
                                            break;
                                        }
                                        final ary ary = array[n4];
                                        final int spanStart = ((Spannable)o).getSpanStart((Object)ary);
                                        spanEnd = ((Spannable)o).getSpanEnd((Object)ary);
                                        if (spanStart != n) {
                                            ((Spannable)o).removeSpan((Object)ary);
                                        }
                                        min = Math.min(spanStart, min);
                                        n = Math.max(spanEnd, n);
                                        ++n4;
                                    }
                                }
                            }
                        }
                        CharSequence charSequence3;
                        if (spanEnd != n3 && spanEnd < charSequence.length()) {
                            int n5;
                            if ((n5 = n2) != Integer.MAX_VALUE) {
                                n5 = n2;
                                if (o != null) {
                                    n5 = n2 - ((ary[])((Spannable)o).getSpans(0, ((Spannable)o).length(), (Class)ary.class)).length;
                                }
                            }
                            final arx arx = new arx((bkl)((dev)a.b).c, a.a, (int[])a.d, null, null);
                            n = Character.codePointAt(charSequence, spanEnd);
                            n2 = spanEnd;
                            int n6 = 0;
                            while (spanEnd < n3 && n6 < n5) {
                                final int a2 = arx.a(n);
                                if (a2 != 1) {
                                    if (a2 != 2) {
                                        int n7 = 0;
                                        Object o2 = null;
                                        Label_0606: {
                                            if (!g) {
                                                n7 = n6;
                                                o2 = o;
                                                if (a.q(charSequence, n2, spanEnd, arx.c())) {
                                                    break Label_0606;
                                                }
                                            }
                                            if ((o2 = o) == null) {
                                                o2 = new SpannableString(charSequence);
                                            }
                                            aufw.r((Spannable)o2, arx.c(), n2, spanEnd);
                                            n7 = n6 + 1;
                                        }
                                        n2 = spanEnd;
                                        n6 = n7;
                                        o = o2;
                                    }
                                    else {
                                        final int n8 = spanEnd + Character.charCount(n);
                                        if ((spanEnd = n8) >= n3) {
                                            continue;
                                        }
                                        n = Character.codePointAt(charSequence, n8);
                                        spanEnd = n8;
                                    }
                                }
                                else {
                                    n2 += Character.charCount(Character.codePointAt(charSequence, n2));
                                    if (n2 < n3) {
                                        n = Character.codePointAt(charSequence, n2);
                                    }
                                    spanEnd = n2;
                                }
                            }
                            Object o3 = o;
                            Label_0767: {
                                if (arx.d()) {
                                    o3 = o;
                                    if (n6 < n5) {
                                        if (!g) {
                                            o3 = o;
                                            if (a.q(charSequence, n2, spanEnd, arx.b())) {
                                                break Label_0767;
                                            }
                                        }
                                        if ((o3 = o) == null) {
                                            o3 = new SpannableString(charSequence);
                                        }
                                        aufw.r((Spannable)o3, arx.b(), n2, spanEnd);
                                    }
                                }
                            }
                            Object o4;
                            if ((o4 = o3) == null) {
                                o4 = charSequence;
                            }
                            charSequence3 = (CharSequence)o4;
                            if (b) {
                                ((aso)charSequence).b();
                                charSequence3 = (CharSequence)o4;
                            }
                        }
                        else {
                            if (b) {
                                ((aso)charSequence).b();
                            }
                            charSequence3 = charSequence;
                        }
                        return charSequence3;
                    }
                    finally {
                        if (b) {
                            ((aso)charSequence).b();
                        }
                    }
                }
            }
        }
        return charSequence;
    }
    
    final void h() {
        final ArrayList list = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            list.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post((Runnable)new ars(list, this.c));
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public final void i(final apl apl) {
        afc.k(apl, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            final int c = this.c;
            if (c != 1 && c != 2) {
                this.b.add(apl);
            }
            else {
                final Handler d = this.d;
                afc.k(apl, "initCallback cannot be null");
                d.post((Runnable)new ars(Arrays.asList(apl), c));
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public final void j(final apl apl) {
        this.a.writeLock().lock();
        try {
            this.b.remove(apl);
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
}
