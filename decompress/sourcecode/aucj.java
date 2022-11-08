import java.util.Map;
import android.graphics.Paint;
import java.nio.ByteBuffer;
import android.widget.ImageView$ScaleType;
import android.graphics.Bitmap;
import android.os.Vibrator;
import org.chromium.net.CronetEngine;
import android.util.Pair;
import android.text.Spannable;
import android.view.inputmethod.InputConnection;
import android.text.Selection;
import android.view.KeyEvent;
import android.text.Editable;
import java.util.WeakHashMap;
import android.util.LruCache;
import java.util.HashMap;
import java.util.Date;
import android.content.Intent;
import android.os.VibrationEffect;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucj
{
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    protected aucj() {
        this.c = null;
        this.b = null;
        this.d = null;
        this.a = false;
    }
    
    public aucj(final Context context, final uyi uyi) {
        this.b = context.getSystemService("vibrator");
        this.a = uyi.f(45382096L);
        if (Build$VERSION.SDK_INT >= 29) {
            this.d = VibrationEffect.createPredefined(2);
            this.c = VibrationEffect.createPredefined(0);
            return;
        }
        this.d = VibrationEffect.createOneShot(10L, 96);
        this.c = VibrationEffect.createOneShot(25L, 255);
    }
    
    public aucj(final atjj c, final atjj b, final atjj d, final tlq tlq) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = tlq.m(tlq.av);
    }
    
    public aucj(final der b, final arp c, final boolean a, final int[] d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public aucj(final CharSequence d, final CharSequence b, final CharSequence c, final boolean a) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aucj(final String c, final Intent b, final Exception d, final boolean a) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public aucj(final String b, final byte[][] c, final boolean a, final Date d) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public aucj(final tdz c, final tda tda) {
        final HashMap b = new HashMap();
        final LruCache d = new LruCache(5);
        c.getClass();
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = tda.d().i;
    }
    
    public aucj(final uyi uyi, final alm d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.c = new WeakHashMap();
        this.b = new WeakHashMap();
        this.a = uyi.bC();
    }
    
    public static aucj g(final String s) {
        tsx.n(s);
        return new aucj(s, null, null, false);
    }
    
    public static boolean o(final Editable editable, final KeyEvent keyEvent, final boolean b) {
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
            final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
            if (s(selectionStart, selectionEnd)) {
                return false;
            }
            final arw[] array = (arw[])editable.getSpans(selectionStart, selectionEnd, (Class)arw.class);
            if (array != null) {
                final int length = array.length;
                if (length > 0) {
                    int i = 0;
                    while (i < length) {
                        final arw arw = array[i];
                        final int spanStart = editable.getSpanStart((Object)arw);
                        final int spanEnd = editable.getSpanEnd((Object)arw);
                        Label_0134: {
                            if (b) {
                                if (spanStart == selectionStart) {
                                    break Label_0134;
                                }
                            }
                            else if (spanEnd == selectionStart) {
                                break Label_0134;
                            }
                            if (selectionStart <= spanStart || selectionStart >= spanEnd) {
                                ++i;
                                continue;
                            }
                        }
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean p(final InputConnection inputConnection, final Editable editable, int n, int n2, final boolean b) {
        if (editable != null && n >= 0) {
            if (n2 >= 0) {
                final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
                final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
                if (s(selectionStart, selectionEnd)) {
                    return false;
                }
                if (b) {
                    final int max = Math.max(n, 0);
                    n = ((CharSequence)editable).length();
                    Label_0200: {
                        Label_0198: {
                            if (selectionStart >= 0) {
                                if (n >= selectionStart) {
                                    n = selectionStart;
                                    int n3;
                                    if ((n3 = max) >= 0) {
                                        while (true) {
                                            int n4 = 0;
                                            int n5 = n3;
                                            int n6 = n;
                                            while (true) {
                                                n = n6;
                                                if (n5 == 0) {
                                                    break Label_0200;
                                                }
                                                n = n6 - 1;
                                                if (n < 0) {
                                                    if (n4 != 0) {
                                                        break Label_0198;
                                                    }
                                                    n = 0;
                                                    break Label_0200;
                                                }
                                                else {
                                                    final char char1 = ((CharSequence)editable).charAt(n);
                                                    if (n4 != 0) {
                                                        if (!Character.isHighSurrogate(char1)) {
                                                            break Label_0198;
                                                        }
                                                        n3 = n5 - 1;
                                                        break;
                                                    }
                                                    else if (!Character.isSurrogate(char1)) {
                                                        --n5;
                                                        n6 = n;
                                                    }
                                                    else {
                                                        if (Character.isHighSurrogate(char1)) {
                                                            break Label_0198;
                                                        }
                                                        n4 = 1;
                                                        n6 = n;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        n = -1;
                    }
                    final int max2 = Math.max(n2, 0);
                    final int length = ((CharSequence)editable).length();
                    Label_0346: {
                        Label_0344: {
                            if (selectionEnd >= 0) {
                                if (length >= selectionEnd) {
                                    n2 = selectionEnd;
                                    int i;
                                    if ((i = max2) >= 0) {
                                    Label_0245:
                                        while (true) {
                                            int n7 = 0;
                                            while (i != 0) {
                                                if (n2 >= length) {
                                                    n2 = length;
                                                    if (n7 != 0) {
                                                        break Label_0344;
                                                    }
                                                    break;
                                                }
                                                else {
                                                    final char char2 = ((CharSequence)editable).charAt(n2);
                                                    if (n7 != 0) {
                                                        if (!Character.isLowSurrogate(char2)) {
                                                            break Label_0344;
                                                        }
                                                        --i;
                                                        ++n2;
                                                        continue Label_0245;
                                                    }
                                                    else if (!Character.isSurrogate(char2)) {
                                                        --i;
                                                        ++n2;
                                                    }
                                                    else {
                                                        if (Character.isLowSurrogate(char2)) {
                                                            break Label_0344;
                                                        }
                                                        ++n2;
                                                        n7 = 1;
                                                    }
                                                }
                                            }
                                            break Label_0346;
                                        }
                                    }
                                }
                            }
                        }
                        n2 = -1;
                    }
                    if (n == -1 || n2 == -1) {
                        return false;
                    }
                }
                else {
                    n = Math.max(selectionStart - n, 0);
                    n2 = Math.min(selectionEnd + n2, editable.length());
                }
                final arw[] array = (arw[])editable.getSpans(n, n2, (Class)arw.class);
                if (array != null) {
                    final int length2 = array.length;
                    if (length2 > 0) {
                        for (final arw arw : array) {
                            final int spanStart = editable.getSpanStart((Object)arw);
                            final int spanEnd = editable.getSpanEnd((Object)arw);
                            n = Math.min(spanStart, n);
                            n2 = Math.max(spanEnd, n2);
                        }
                        n = Math.max(n, 0);
                        n2 = Math.min(n2, editable.length());
                        inputConnection.beginBatchEdit();
                        editable.delete(n, n2);
                        inputConnection.endBatchEdit();
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static final void r(final Spannable spannable, final art art, final int n, final int n2) {
        spannable.setSpan((Object)new arw(art), n, n2, 33);
    }
    
    private static boolean s(final int n, final int n2) {
        return n == -1 || n2 == -1 || n != n2;
    }
    
    public final Intent a() {
        if (this.f()) {
            throw new IllegalStateException("Cannot call getRecoveryIntent() on a successful fetch.");
        }
        if (this.e()) {
            return (Intent)this.b;
        }
        throw new IllegalStateException("Cannot call getRecoveryIntent() on an unrecoverable fetch.");
    }
    
    public final Pair b() {
        if (this.f()) {
            return Pair.create((Object)"Authorization", (Object)"Bearer ".concat(String.valueOf(this.c)));
        }
        throw new IllegalStateException("Cannot call getAuthenticationHeaderInfo on an unsuccessful fetch.");
    }
    
    public final Exception c() {
        final Object d = this.d;
        if (d != null) {
            return (Exception)d;
        }
        throw new IllegalStateException("Cannot call getException() on a successful or recoverable fetch.");
    }
    
    public final String d() {
        if (this.f()) {
            return (String)this.c;
        }
        throw new IllegalStateException("Cannot call getValue on an unsuccessful fetch.");
    }
    
    public final boolean e() {
        return this.b != null;
    }
    
    public final boolean f() {
        return this.c != null;
    }
    
    public final CronetEngine h(final boolean b) {
        if (!b) {
            return (CronetEngine)((atjj)this.c).a();
        }
        if (!this.a) {
            return (CronetEngine)((atjj)this.b).a();
        }
        return (CronetEngine)((atjj)this.d).a();
    }
    
    public final gle i(final fsj fsj) {
        return ((Map<K, gle>)this.c).get(fsj);
    }
    
    public final void j(final int n) {
        final Object b = this.b;
        if (b != null && ((Vibrator)b).hasVibrator() && Build$VERSION.SDK_INT != 26) {
            if (this.a) {
                Object o;
                if (n != 0 && n != 3) {
                    if (n == 2) {
                        o = this.d;
                    }
                    else {
                        o = null;
                    }
                }
                else {
                    o = this.c;
                }
                if (o != null) {
                    try {
                        if (Build$VERSION.SDK_INT > 26) {
                            ((Vibrator)this.b).vibrate((VibrationEffect)o);
                        }
                    }
                    catch (final RuntimeException ex) {
                        trn.d("Failed to haptics vibrate for video zoom", (Throwable)ex);
                    }
                }
            }
        }
    }
    
    public final Bitmap k(final String s) {
        if (!this.a) {
            return (Bitmap)((LruCache)this.d).get((Object)s);
        }
        return null;
    }
    
    public final foi l(final String s) {
        return ((Map<K, foi>)this.b).get(s);
    }
    
    public final void m(final String s, final long n, final Bitmap bitmap, final ImageView$ScaleType imageView$ScaleType) {
        final foi foi = new foi(n, imageView$ScaleType);
        ((Map<String, foi>)this.b).put(s, foi);
        if (!this.a) {
            if (bitmap != null) {
                ((LruCache)this.d).put((Object)s, (Object)bitmap);
            }
            else {
                ((LruCache)this.d).remove((Object)s);
            }
        }
        ((tdz)this.c).f((Object)new foj(s, foi));
    }
    
    public final void n(final String s, final long n) {
        this.m(s, n, null, ImageView$ScaleType.FIT_CENTER);
    }
    
    public final boolean q(final CharSequence charSequence, int i, final int n, final art art) {
        if (art.b == 0) {
            final Object c = this.c;
            final chr e = art.e();
            final int a = e.a(8);
            if (a != 0) {
                ((ByteBuffer)e.b).getShort(a + e.a);
            }
            if (aru.a.get() == null) {
                aru.a.set(new StringBuilder());
            }
            final StringBuilder sb = aru.a.get();
            sb.setLength(0);
            while (i < n) {
                sb.append(charSequence.charAt(i));
                ++i;
            }
            if (!aid.a((Paint)((aru)c).b, sb.toString())) {
                i = 1;
            }
            else {
                i = 2;
            }
            art.b = i;
        }
        return art.b == 2;
    }
}
