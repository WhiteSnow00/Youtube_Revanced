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

public final class ars
{
    private static final Object k;
    private static volatile ars l;
    public final ReadWriteLock a;
    public final Set b;
    public int c;
    public final Handler d;
    public final arn e;
    final arr f;
    public final boolean g;
    final boolean h;
    final int[] i;
    public final arp j;
    
    static {
        k = new Object();
    }
    
    private ars(aro e) {
        final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
        this.a = a;
        this.c = 3;
        this.g = e.b;
        this.h = e.c;
        this.i = e.d;
        this.f = e.a;
        this.j = e.f;
        this.d = new Handler(Looper.getMainLooper());
        final abi b = new abi();
        this.b = (Set)b;
        final Set e2 = e.e;
        if (e2 != null && !e2.isEmpty()) {
            ((Set)b).addAll(e2);
        }
        e = (aro)new arm(this);
        this.e = (arn)e;
        a.writeLock().lock();
        try {
            this.c = 0;
            a.writeLock().unlock();
            if (this.a() == 0) {
                try {
                    final arm arm = (arm)e;
                    final qpt qpt = new qpt((arm)e);
                    final arm arm2 = (arm)e;
                    final arr f = ((arm)e).c.f;
                    synchronized (((ary)f).a) {
                        if (((ary)f).b == null) {
                            (((ary)f).c = new HandlerThread("emojiCompat", 10)).start();
                            ((ary)f).b = new Handler(((ary)f).c.getLooper());
                        }
                        ((ary)f).b.post((Runnable)new vs((ary)f, qpt, 14, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                    }
                }
                finally {
                    final arm arm3 = (arm)e;
                    ((arm)e).c.h();
                }
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public static ars b() {
        synchronized (ars.k) {
            aff.g(ars.l != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            return ars.l;
        }
    }
    
    public static void f(final aro aro) {
        if (ars.l == null) {
            synchronized (ars.k) {
                if (ars.l == null) {
                    ars.l = new ars(aro);
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
    
    public final CharSequence g(final CharSequence charSequence, int spanEnd, int n, int min) {
        final int n2 = spanEnd;
        final int n3 = min;
        aff.g(this.e(), "Not initialized yet");
        aff.j(n2, "start cannot be negative");
        aff.j(n, "end cannot be negative");
        aff.j(n3, "maxEmojiCount cannot be negative");
        aff.e(n2 <= n, (Object)"start should be <= than end");
        final CharSequence charSequence2 = null;
        if (charSequence == null) {
            return null;
        }
        aff.e(n2 <= charSequence.length(), (Object)"start should be < than charSequence length");
        aff.e(n <= charSequence.length(), (Object)"end should be < than charSequence length");
        if (charSequence.length() != 0) {
            if (n2 != n) {
                final boolean g = this.g;
                final aucj a = ((arm)this.e).a;
                final boolean b = charSequence instanceof asl;
                if (b) {
                    ((asl)charSequence).a();
                }
                Label_0239: {
                    if (b) {
                        break Label_0239;
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
                                if (((Spanned)charSequence).nextSpanTransition(n2 - 1, n + 1, (Class)arw.class) <= n) {
                                    o = new SpannableString(charSequence);
                                }
                            }
                        }
                        spanEnd = n2;
                        int n4 = n;
                        if (o != null) {
                            final arw[] array = (arw[])((Spannable)o).getSpans(n2, n, (Class)arw.class);
                            spanEnd = n2;
                            n4 = n;
                            if (array != null) {
                                final int length = array.length;
                                spanEnd = n2;
                                n4 = n;
                                if (length > 0) {
                                    int n5 = 0;
                                    min = n2;
                                    while (true) {
                                        spanEnd = min;
                                        n4 = n;
                                        if (n5 >= length) {
                                            break;
                                        }
                                        final arw arw = array[n5];
                                        final int spanStart = ((Spannable)o).getSpanStart((Object)arw);
                                        spanEnd = ((Spannable)o).getSpanEnd((Object)arw);
                                        if (spanStart != n) {
                                            ((Spannable)o).removeSpan((Object)arw);
                                        }
                                        min = Math.min(spanStart, min);
                                        n = Math.max(spanEnd, n);
                                        ++n5;
                                    }
                                }
                            }
                        }
                        CharSequence charSequence3;
                        if (spanEnd != n4 && spanEnd < charSequence.length()) {
                            int n6;
                            if ((n6 = n3) != Integer.MAX_VALUE) {
                                n6 = n3;
                                if (o != null) {
                                    n6 = n3 - ((arw[])((Spannable)o).getSpans(0, ((Spannable)o).length(), (Class)arw.class)).length;
                                }
                            }
                            final arv arv = new arv((bkh)((der)a.b).c, a.a, (int[])a.d, null, null);
                            n = Character.codePointAt(charSequence, spanEnd);
                            min = spanEnd;
                            int n7 = 0;
                            while (spanEnd < n4 && n7 < n6) {
                                final int a2 = arv.a(n);
                                if (a2 != 1) {
                                    if (a2 != 2) {
                                        int n8 = 0;
                                        Object o2 = null;
                                        Label_0614: {
                                            if (!g) {
                                                n8 = n7;
                                                o2 = o;
                                                if (a.q(charSequence, min, spanEnd, arv.c())) {
                                                    break Label_0614;
                                                }
                                            }
                                            if ((o2 = o) == null) {
                                                o2 = new SpannableString(charSequence);
                                            }
                                            aucj.r((Spannable)o2, arv.c(), min, spanEnd);
                                            n8 = n7 + 1;
                                        }
                                        min = spanEnd;
                                        n7 = n8;
                                        o = o2;
                                    }
                                    else {
                                        final int n9 = spanEnd + Character.charCount(n);
                                        if ((spanEnd = n9) >= n4) {
                                            continue;
                                        }
                                        n = Character.codePointAt(charSequence, n9);
                                        spanEnd = n9;
                                    }
                                }
                                else {
                                    min += Character.charCount(Character.codePointAt(charSequence, min));
                                    if (min < n4) {
                                        n = Character.codePointAt(charSequence, min);
                                    }
                                    spanEnd = min;
                                }
                            }
                            Object o3 = o;
                            Label_0775: {
                                if (arv.d()) {
                                    o3 = o;
                                    if (n7 < n6) {
                                        if (!g) {
                                            o3 = o;
                                            if (a.q(charSequence, min, spanEnd, arv.b())) {
                                                break Label_0775;
                                            }
                                        }
                                        if ((o3 = o) == null) {
                                            o3 = new SpannableString(charSequence);
                                        }
                                        aucj.r((Spannable)o3, arv.b(), min, spanEnd);
                                    }
                                }
                            }
                            Object o4;
                            if ((o4 = o3) == null) {
                                o4 = charSequence;
                            }
                            charSequence3 = (CharSequence)o4;
                            if (b) {
                                ((asl)charSequence).b();
                                charSequence3 = (CharSequence)o4;
                            }
                        }
                        else {
                            if (b) {
                                ((asl)charSequence).b();
                            }
                            charSequence3 = charSequence;
                        }
                        return charSequence3;
                    }
                    finally {
                        if (b) {
                            ((asl)charSequence).b();
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
            this.d.post((Runnable)new arq(list, this.c));
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public final void i(final apk apk) {
        aff.l((Object)apk, (Object)"initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            final int c = this.c;
            if (c != 1 && c != 2) {
                this.b.add(apk);
            }
            else {
                final Handler d = this.d;
                aff.l((Object)apk, (Object)"initCallback cannot be null");
                d.post((Runnable)new arq(Arrays.asList(apk), c));
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public final void j(final apk apk) {
        this.a.writeLock().lock();
        try {
            this.b.remove(apk);
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
}
