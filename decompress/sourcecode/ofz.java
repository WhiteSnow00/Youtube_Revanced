import android.graphics.Paint;
import android.text.TextUtils;
import android.text.TextUtils$TruncateAt;
import android.graphics.Paint$Align;
import android.text.TextPaint;
import android.graphics.Canvas;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import android.graphics.Rect;
import android.graphics.Point;
import android.graphics.Matrix;
import java.util.concurrent.Executor;
import android.net.Uri;
import java.util.Map;
import java.util.List;
import java.util.Collections;
import com.google.protobuf.MessageLite;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ofz
{
    private static volatile ofz e;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public ofz() {
        this.c = new AtomicBoolean(false);
        final aewp a = aewp.a;
        this.d = a;
        this.a = a;
        this.b = a;
    }
    
    public ofz(final noe noe) {
        final afdu a = noe.a;
        a.getClass();
        agot.v(a.isEmpty() ^ true, (Object)"Set<Flow> enabledFlows must not be empty.");
        final String c = noe.c;
        this.d = noe.a;
        this.c = noe.b;
        this.b = c;
        this.a = noe.d;
    }
    
    public ofz(final oeu oeu, final Random c) {
        this.a = new HashMap();
        this.c = c;
        if (arkm.a.b().l()) {
            final qmr a = qms.a(oeu.a);
            a.e("cbv_module");
            a.f("UploadLimiterRecord.pb");
            final Uri a2 = a.a();
            final qoq a3 = qor.a();
            a3.f(a2);
            a3.e((MessageLite)ofy.a);
            final qor a4 = a3.a();
            if (oga.a == null) {
                synchronized (oga.class) {
                    if (oga.a == null) {
                        final eg eg = new eg((List)Collections.singletonList(qmq.r(oeu.a).q()));
                        final Executor d = nzj.D(oeu);
                        final qpm a5 = qpm.a;
                        final HashMap hashMap = new HashMap();
                        qit.h(qpd.a, hashMap);
                        oga.a = qit.i(d, eg, hashMap, a5);
                    }
                }
            }
            final aagm d2 = oga.a.D(a4);
            this.d = d2;
            final aagm aagm = d2;
            this.b = new HashMap(Collections.unmodifiableMap((Map<?, ?>)j(d2).b));
            return;
        }
        this.d = null;
        this.b = null;
    }
    
    public ofz(final byte[] array) {
        this.c = new nvn();
        this.a = new Matrix();
        this.b = new float[8];
        this.d = new Point();
    }
    
    public static ofz a(final oeu oeu) {
        if (ofz.e == null) {
            synchronized (ofz.class) {
                if (ofz.e == null) {
                    ofz.e = new ofz(oeu, aeya.a);
                }
            }
        }
        return ofz.e;
    }
    
    private final int f(int i, final int n, final int n2, final int n3, final Rect rect) {
        final Point h = this.h(i, n, n2, n3, rect.top);
        int n5;
        final int n4 = n5 = Integer.MAX_VALUE;
        if (h != null) {
            if (n > rect.top) {
                n5 = i(i, n, h.x, h.y);
            }
            else {
                n5 = i(n2, n3, h.x, h.y);
            }
            if (n5 >= Integer.MAX_VALUE) {
                n5 = n4;
            }
        }
        final Point h2 = this.h(i, n, n2, n3, rect.bottom);
        int n6 = n5;
        if (h2 != null) {
            int n7;
            if (n < rect.bottom) {
                n7 = i(i, n, h2.x, h2.y);
            }
            else {
                n7 = i(n2, n3, h2.x, h2.y);
            }
            n6 = n5;
            if (n7 < n5) {
                n6 = n7;
            }
        }
        final Point g = this.g(i, n, n2, n3, rect.left);
        int n8 = n6;
        if (g != null) {
            final int j = i(n2, n3, g.x, g.y);
            if (j < (n8 = n6)) {
                n8 = j;
            }
        }
        final Point g2 = this.g(i, n, n2, n3, rect.right);
        if (g2 != null) {
            i = i(i, n, g2.x, g2.y);
            if (i < n8) {
                return i;
            }
        }
        return n8;
    }
    
    private final Point g(int n, final int n2, final int n3, final int n4, final int x) {
        if (n3 != n && x >= Math.min(n, n3) && x <= Math.max(n, n3)) {
            ((Point)this.d).x = x;
            final Object d = this.d;
            n = (n3 - x) * (n4 - n2) / (n3 - n);
            ((Point)d).y = n4 - n;
            return (Point)this.d;
        }
        return null;
    }
    
    private final Point h(int n, final int n2, final int n3, final int n4, final int y) {
        if (n4 != n2 && y >= Math.min(n2, n4) && y <= Math.max(n2, n4)) {
            final Object d = this.d;
            n = (n4 - y) * (n3 - n) / (n4 - n2);
            ((Point)d).x = n3 - n;
            ((Point)this.d).y = y;
            return (Point)this.d;
        }
        return null;
    }
    
    private static final int i(int n, int n2, final int n3, final int n4) {
        n2 = n4 - n2;
        n = n3 - n;
        return (int)Math.sqrt(n2 * n2 + n * n);
    }
    
    private static ofy j(final aagm aagm) {
        Object a;
        final ofy ofy = (ofy)(a = ofy.a);
        try {
            final long b = oga.b();
            a = ofy;
            final long currentTimeMillis = System.currentTimeMillis();
            a = ofy;
            Object o = aagm.b().get();
            try {
                a = new HashMap<Long, agzi>();
                for (final Map.Entry<K, ofw> entry : Collections.unmodifiableMap((Map<?, ?>)((ofy)o).b).entrySet()) {
                    final HashMap hashMap = new HashMap();
                    for (final Map.Entry<K, ahca> entry2 : Collections.unmodifiableMap((Map<?, ?>)entry.getValue().b).entrySet()) {
                        if (ahdd.b((ahca)entry2.getValue()) < b + currentTimeMillis) {
                            hashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        final Long n = (Long)entry.getKey();
                        final agza builder = ofw.a.createBuilder();
                        builder.copyOnWrite();
                        ((Map<Object, Object>)((ofw)builder.instance).a()).putAll(hashMap);
                        ((Map<Long, agzi>)a).put(n, builder.build());
                    }
                }
                final agza builder2 = ofy.a.createBuilder();
                builder2.S((Map)a);
                final Map<Long, agzi> map = (Map<Long, agzi>)(a = (a = builder2.build()));
                o = new nyw((ofy)map, 3);
                a = map;
                aagm.c((aexg)o, (Executor)afsl.a);
                a = map;
            }
            catch (final CancellationException | ExecutionException | InterruptedException ex) {
                a = o;
            }
            return (ofy)a;
        }
        catch (final CancellationException | ExecutionException | InterruptedException ex2) {
            return (ofy)a;
        }
    }
    
    public final boolean b(final ahdm ahdm) {
        arkp.b();
        if (!arkm.a.b().j()) {
            int ai;
            if ((ai = aeda.ai(ahdm.i)) == 0) {
                ai = 2;
            }
            if (aeda.ah(ai) == 6) {
                return false;
            }
        }
        arkp.b();
        if (!arkm.a.b().k()) {
            final int a = ahdk.a(ahdm.j);
            if (a != 0) {
                if (a == 4) {
                    return false;
                }
            }
        }
        arkp.b();
        if (arkm.a.b().h() && ((Random)this.c).nextDouble() >= arkm.a.b().a()) {
            return false;
        }
        final long e = ahdm.e;
        int ai2;
        if ((ai2 = aeda.ai(ahdm.i)) == 0) {
            ai2 = 2;
        }
        final ogb ogb = new ogb(Long.valueOf(e), ai2);
        final long b = oga.b();
        final Object b2 = this.b;
        final boolean b3 = true;
        if (b2 != null) {
            if (this.d != null) {
                synchronized (b2) {
                    final long e2 = ahdm.e;
                    int ai3;
                    if ((ai3 = aeda.ai(ahdm.i)) == 0) {
                        ai3 = 2;
                    }
                    Object o = this.b;
                    Label_0336: {
                        if (o == null) {
                            final ahca ahca = ahdd.a;
                            break Label_0336;
                        }
                        synchronized (o) {
                            final ofw ofw = ((Map<K, ofw>)this.b).get(e2);
                            ahca ahca;
                            if (ofw == null) {
                                ahca = ahdd.a;
                                monitorexit(o);
                            }
                            else {
                                final long n = aeda.ah(ai3);
                                ahca = ahdd.a;
                                final ahas b4 = ofw.b;
                                final Long value = n;
                                if (((Map)b4).containsKey(value)) {
                                    ahca = (ahca)((Map)b4).get(value);
                                }
                                monitorexit(o);
                            }
                            Label_0581: {
                                if (b > 0L && ahdd.b(ahca) + b >= System.currentTimeMillis()) {
                                    final boolean b5 = false;
                                    break Label_0581;
                                }
                                final long e3 = ahdm.e;
                                int ai4;
                                if ((ai4 = aeda.ai(ahdm.i)) == 0) {
                                    ai4 = 2;
                                }
                                final ahca c = ahdd.c(System.currentTimeMillis());
                                o = this.b;
                                Label_0520: {
                                    if (o == null) {
                                        break Label_0520;
                                    }
                                    synchronized (o) {
                                        final Object b6 = this.b;
                                        final Long value2 = e3;
                                        ofw a2;
                                        if ((a2 = ((Map<K, ofw>)b6).get(value2)) == null) {
                                            a2 = ofw.a;
                                        }
                                        final agza builder = a2.toBuilder();
                                        final long n2 = aeda.ah(ai4);
                                        c.getClass();
                                        builder.copyOnWrite();
                                        ((Map<Long, ahca>)((ofw)builder.instance).a()).put(Long.valueOf(n2), c);
                                        ((Map<Long, ofw>)this.b).put(value2, (ofw)builder.build());
                                        monitorexit(o);
                                        final agza builder2 = ofy.a.createBuilder();
                                        builder2.S((Map)this.b);
                                        o = builder2.build();
                                        final Object d = this.d;
                                        final nyw nyw = new nyw((ofy)o, 4);
                                        o = afsl.a;
                                        ((aagm)d).c((aexg)nyw, (Executor)o);
                                        final boolean b5 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        synchronized (this.a) {
            final Long n3 = ((Map<K, Long>)this.a).get(ogb);
            final long currentTimeMillis = System.currentTimeMillis();
            boolean b5 = b3;
            if (n3 != null) {
                b5 = b3;
                if (b > 0L) {
                    b5 = (n3 + b < currentTimeMillis && b3);
                }
            }
            if (b5) {
                ((Map<ogb, Long>)this.a).put(ogb, Long.valueOf(currentTimeMillis));
            }
            return b5;
        }
    }
    
    public final void c() {
        final Boolean value = false;
        String.format("#reinstatePopupWindowSystemUi(): popupWindow.isPresent() = %b", value);
        String.format("#reinstateActivitySystemUi(): activityWindow.isPresent() = %b", value);
        ((AtomicBoolean)this.c).set(false);
    }
    
    public final void d(final CharSequence charSequence, final Canvas canvas, final float n, float n2, final Rect rect, final TextPaint textPaint, final Paint$Align textAlign, int c, float n3, final boolean b) {
        final nvp a = nvp.a(charSequence);
        final nvn e = this.e((CharSequence)a, textPaint, textAlign, c, n3);
        textPaint.setTextAlign(textAlign);
        canvas.save();
        ((Matrix)this.a).reset();
        ((Matrix)this.a).preRotate(n3, n, n2);
        final Object a2 = this.a;
        c = e.c;
        ((Matrix)a2).postTranslate((float)c, (float)e.f);
        canvas.concat((Matrix)this.a);
        n2 += a.d;
        c = 0;
        while (true) {
            final String[] a3 = a.a;
            if (c >= a3.length) {
                break;
            }
            String string;
            final String s = string = a3[c];
            if (b) {
                final Object b2 = this.b;
                n3 = a.f[c];
                if (textAlign == Paint$Align.CENTER) {
                    final float n4 = n3 / 2.0f;
                    n3 = n - n4;
                    final float[] array = (float[])b2;
                    array[0] = n3;
                    array[4] = (array[2] = n4 + n);
                    array[6] = n3;
                }
                else if (textAlign == Paint$Align.RIGHT) {
                    n3 = n - n3;
                    final float[] array2 = (float[])b2;
                    array2[0] = n3;
                    array2[4] = (array2[2] = n);
                    array2[6] = n3;
                }
                else if (textAlign == Paint$Align.LEFT) {
                    final float[] array3 = (float[])b2;
                    array3[0] = n;
                    n3 += n;
                    array3[4] = (array3[2] = n3);
                    array3[6] = n;
                }
                n3 = n2 - a.d;
                final float[] array4 = (float[])b2;
                array4[3] = (array4[1] = n3);
                array4[7] = (array4[5] = n2);
                ((Matrix)this.a).mapPoints((float[])this.b);
                int n5 = 0;
                boolean b3 = true;
                Object b4;
                while (true) {
                    b4 = this.b;
                    if (n5 >= 8) {
                        break;
                    }
                    final float[] array5 = (float[])b4;
                    b3 &= rect.contains((int)array5[n5], (int)array5[n5 + 1]);
                    n5 += 2;
                }
                string = s;
                if (!b3) {
                    final float[] array6 = (float[])b4;
                    final float n6 = array6[0];
                    final float n7 = array6[1];
                    n3 = array6[2];
                    final int f = this.f((int)n6, (int)n7, (int)n3, (int)array6[3], rect);
                    final float[] array7 = (float[])this.b;
                    string = TextUtils.ellipsize((CharSequence)s, textPaint, (float)Math.min(f, this.f((int)array7[6], (int)array7[7], (int)array7[4], (int)array7[5], rect)), TextUtils$TruncateAt.END).toString();
                }
            }
            canvas.drawText(string, n, n2, (Paint)textPaint);
            n2 += a.d + a.e;
            ++c;
        }
        canvas.restore();
    }
    
    public final nvn e(final CharSequence charSequence, final TextPaint textPaint, final Paint$Align paint$Align, int n, float n2) {
        final nvn nvn = (nvn)this.c;
        nvn.a = 0;
        nvn.b = 0;
        nvn.c = 0;
        nvn.d = 0;
        nvn.e = 0;
        nvn.f = 0;
        nvn.g = 0;
        nvn.h = 0;
        if (charSequence == null) {
            return nvn;
        }
        final nvp a = nvp.a(charSequence);
        if (!textPaint.equals(a.g)) {
            a.g.set(textPaint);
            a.d = -(int)(textPaint.descent() + textPaint.ascent());
            a.e = (int)(textPaint.getTextSize() - a.d);
            a.b = 0;
            a.c = 0;
            int n3 = 0;
            while (true) {
                final String[] a2 = a.a;
                if (n3 >= a2.length) {
                    break;
                }
                a.f[n3] = textPaint.measureText(a2[n3]);
                a.c = Math.max(a.c, (int)a.f[n3]);
                final int b = a.b;
                int d;
                if (n3 == 0) {
                    d = a.d;
                }
                else {
                    d = a.e + a.d;
                }
                a.b = b + d;
                ++n3;
            }
            a.b += a.e;
        }
        n2 %= 360.0f;
        if (n2 == 0.0f) {
            nvn.g = a.b;
            final int c = a.c;
            nvn.h = c;
            nvn.a = c;
            nvn.c = 0;
            final int n4 = nvo.a[paint$Align.ordinal()];
            Label_0358: {
                if (n4 != 1) {
                    int b2;
                    if (n4 != 2) {
                        if (n4 != 3) {
                            break Label_0358;
                        }
                        b2 = -a.c;
                    }
                    else {
                        b2 = -a.c / 2;
                    }
                    nvn.b = b2;
                }
                else {
                    nvn.b = 0;
                }
            }
            final int b3 = a.b;
            nvn.d = b3;
            final int[] b4 = nvo.b;
            if (n == 0) {
                throw null;
            }
            n = b4[n - 1];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        return nvn;
                    }
                    nvn.e = -b3;
                    n = -(b3 - a.e);
                }
                else {
                    nvn.e = -b3 / 2;
                    n = -(b3 - a.e) / 2;
                }
                nvn.f = n;
            }
            else {
                nvn.e = 0;
                nvn.f = 0;
            }
        }
        else if (n2 == 180.0f) {
            nvn.g = a.b;
            final int c2 = a.c;
            nvn.h = c2;
            nvn.a = c2;
            nvn.c = 0;
            final int n5 = nvo.a[paint$Align.ordinal()];
            Label_0589: {
                int b5;
                if (n5 != 1) {
                    if (n5 != 2) {
                        if (n5 != 3) {
                            break Label_0589;
                        }
                        nvn.b = 0;
                        break Label_0589;
                    }
                    else {
                        b5 = -a.c / 2;
                    }
                }
                else {
                    b5 = -a.c;
                }
                nvn.b = b5;
            }
            final int b6 = a.b;
            nvn.d = b6;
            final int[] b7 = nvo.b;
            if (n == 0) {
                throw null;
            }
            n = b7[n - 1];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        return nvn;
                    }
                    nvn.e = 0;
                    n = b6 - a.e;
                }
                else {
                    nvn.e = -b6 / 2;
                    n = (b6 - a.e) / 2;
                }
                nvn.f = n;
            }
            else {
                nvn.e = -b6;
                nvn.f = 0;
            }
        }
        else if (n2 == 90.0f) {
            nvn.g = a.c;
            final int b8 = a.b;
            nvn.h = b8;
            nvn.a = b8;
            final int[] b9 = nvo.b;
            if (n == 0) {
                throw null;
            }
            n = b9[n - 1];
            Label_0857: {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            break Label_0857;
                        }
                        nvn.b = 0;
                        n = a.b - a.e;
                    }
                    else {
                        n = a.b;
                        nvn.b = -n / 2;
                        n = (n - a.e) / 2;
                    }
                    nvn.c = n;
                }
                else {
                    nvn.b = -a.b;
                    nvn.c = 0;
                }
            }
            nvn.d = a.c;
            nvn.f = 0;
            n = nvo.a[paint$Align.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        return nvn;
                    }
                    n = -a.c;
                }
                else {
                    n = -a.c / 2;
                }
                nvn.e = n;
            }
            else {
                nvn.e = 0;
            }
        }
        else if (n2 == 270.0f) {
            nvn.g = a.c;
            final int b10 = a.b;
            nvn.h = b10;
            nvn.a = b10;
            final int[] b11 = nvo.b;
            if (n == 0) {
                throw null;
            }
            n = b11[n - 1];
            Label_1096: {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            break Label_1096;
                        }
                        n = a.b;
                        nvn.b = -n;
                        n = -(n - a.e);
                    }
                    else {
                        n = a.b;
                        nvn.b = -n / 2;
                        n = -(n - a.e) / 2;
                    }
                    nvn.c = n;
                }
                else {
                    nvn.b = 0;
                    nvn.c = 0;
                }
            }
            nvn.d = a.c;
            nvn.f = 0;
            n = nvo.a[paint$Align.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        return nvn;
                    }
                    nvn.e = 0;
                    return nvn;
                }
                else {
                    n = -a.c / 2;
                }
            }
            else {
                n = -a.c;
            }
            nvn.e = n;
        }
        else {
            final double radians = Math.toRadians(n2);
            final double sin = Math.sin(radians);
            final double cos = Math.cos(radians);
            final double abs = Math.abs(sin);
            final int c3 = a.c;
            final double abs2 = Math.abs(cos);
            final int b12 = a.b;
            final double n6 = c3;
            Double.isNaN(n6);
            final double n7 = b12;
            Double.isNaN(n7);
            nvn.g = (int)(abs * n6 + abs2 * n7);
            final double abs3 = Math.abs(cos);
            final int c4 = a.c;
            final double abs4 = Math.abs(sin);
            final double n8 = a.b;
            final double n9 = c4;
            Double.isNaN(n9);
            Double.isNaN(n8);
            nvn.h = (int)(abs3 * n9 + abs4 * n8);
            final double abs5 = Math.abs(sin);
            Double.isNaN(n8);
            nvn.a = (int)(n8 / abs5);
            final int b13 = a.b;
            final double abs6 = Math.abs(cos);
            final double n10 = b13;
            Double.isNaN(n10);
            nvn.d = (int)(n10 / abs6);
            final double n11 = a.b - a.e;
            Double.isNaN(n11);
            final int c5 = (int)(n11 * sin);
            Double.isNaN(n11);
            final int n12 = (int)(n11 * cos);
            final int n13 = n - 1;
            final int[] b14 = nvo.b;
            if (n == 0) {
                throw null;
            }
            n = b14[n13];
            Label_1521: {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            break Label_1521;
                        }
                        nvn.c = c5;
                        n = -n12;
                    }
                    else {
                        nvn.c = c5 / 2;
                        n = -n12 / 2;
                    }
                }
                else {
                    n = 0;
                    nvn.c = 0;
                }
                nvn.f = n;
            }
            final double n14 = a.b;
            final double abs7 = Math.abs(sin);
            Double.isNaN(n14);
            final int n15 = (int)(n14 * abs7);
            final double n16 = a.b;
            final double abs8 = Math.abs(cos);
            Double.isNaN(n16);
            n = (int)(n16 * abs8);
            if (sin >= 0.0 && cos >= 0.0) {
                final int n17 = nvo.b[n13];
                if (n17 != 1) {
                    if (n17 != 2) {
                        if (n17 == 3) {
                            final int n18 = nvo.a[paint$Align.ordinal()];
                            if (n18 != 1) {
                                if (n18 != 2) {
                                    if (n18 != 3) {
                                        return nvn;
                                    }
                                    nvn.b = -nvn.a + n15;
                                }
                                else {
                                    nvn.b = 0;
                                }
                                n = nvn.d;
                            }
                            else {
                                nvn.b = 0;
                            }
                            nvn.e = -n;
                        }
                    }
                    else {
                        final int n19 = nvo.a[paint$Align.ordinal()];
                        if (n19 != 1) {
                            if (n19 != 2) {
                                if (n19 != 3) {
                                    return nvn;
                                }
                                nvn.b = -nvn.a + n15 / 2;
                                nvn.e = -nvn.d + n / 2;
                                return nvn;
                            }
                            else {
                                nvn.b = -nvn.a / 2;
                                n = nvn.d;
                            }
                        }
                        else {
                            nvn.b = -n15 / 2;
                        }
                        nvn.e = -n / 2;
                    }
                }
                else {
                    final int n20 = nvo.a[paint$Align.ordinal()];
                    if (n20 != 1) {
                        if (n20 != 2) {
                            if (n20 != 3) {
                                return nvn;
                            }
                            nvn.b = -nvn.a;
                            nvn.e = -nvn.d + n;
                            return nvn;
                        }
                        else {
                            nvn.b = -nvn.a;
                        }
                    }
                    else {
                        nvn.b = -n15;
                    }
                    nvn.e = 0;
                }
            }
            else if (sin >= 0.0 && cos < 0.0) {
                final int n21 = nvo.b[n13];
                if (n21 != 1) {
                    if (n21 != 2) {
                        if (n21 == 3) {
                            final int n22 = nvo.a[paint$Align.ordinal()];
                            if (n22 != 1) {
                                if (n22 != 2) {
                                    if (n22 != 3) {
                                        return nvn;
                                    }
                                    nvn.b = 0;
                                    nvn.e = -nvn.d + n;
                                    return nvn;
                                }
                                else {
                                    nvn.b = 0;
                                }
                            }
                            else {
                                nvn.b = -nvn.a + n15;
                            }
                            nvn.e = 0;
                        }
                    }
                    else {
                        final int n23 = nvo.a[paint$Align.ordinal()];
                        if (n23 != 1) {
                            if (n23 != 2) {
                                if (n23 != 3) {
                                    return nvn;
                                }
                                nvn.b = -n15 / 2;
                                nvn.e = -nvn.d + n / 2;
                                return nvn;
                            }
                            else {
                                nvn.b = -nvn.a / 2;
                                n = nvn.d;
                            }
                        }
                        else {
                            nvn.b = -nvn.a + n15 / 2;
                        }
                        nvn.e = -n / 2;
                    }
                }
                else {
                    final int n24 = nvo.a[paint$Align.ordinal()];
                    if (n24 != 1) {
                        if (n24 != 2) {
                            if (n24 != 3) {
                                return nvn;
                            }
                            n = -n15;
                        }
                        else {
                            n = -nvn.a;
                        }
                        nvn.b = n;
                        n = nvn.d;
                    }
                    else {
                        nvn.b = -nvn.a;
                    }
                    nvn.e = -n;
                }
            }
            else if (sin < 0.0 && cos < 0.0) {
                final int n25 = nvo.b[n13];
                if (n25 != 1) {
                    if (n25 != 2) {
                        if (n25 == 3) {
                            final int n26 = nvo.a[paint$Align.ordinal()];
                            if (n26 != 1) {
                                if (n26 != 2) {
                                    if (n26 != 3) {
                                        return nvn;
                                    }
                                    nvn.b = -n15;
                                }
                                else {
                                    nvn.b = -nvn.a;
                                }
                                nvn.e = 0;
                            }
                            else {
                                nvn.b = -nvn.a;
                                nvn.e = -nvn.d + n;
                            }
                        }
                    }
                    else {
                        final int n27 = nvo.a[paint$Align.ordinal()];
                        if (n27 != 1) {
                            if (n27 != 2) {
                                if (n27 != 3) {
                                    return nvn;
                                }
                                nvn.b = -n15 / 2;
                            }
                            else {
                                nvn.b = -nvn.a / 2;
                                n = nvn.d;
                            }
                            nvn.e = -n / 2;
                        }
                        else {
                            nvn.b = -nvn.a + n15 / 2;
                            nvn.e = -nvn.d + n / 2;
                        }
                    }
                }
                else {
                    final int n28 = nvo.a[paint$Align.ordinal()];
                    Label_2545: {
                        if (n28 != 1) {
                            if (n28 != 2) {
                                if (n28 != 3) {
                                    return nvn;
                                }
                                nvn.b = 0;
                                break Label_2545;
                            }
                            else {
                                nvn.b = 0;
                            }
                        }
                        else {
                            nvn.b = -nvn.a + n15;
                        }
                        n = nvn.d;
                    }
                    nvn.e = -n;
                }
            }
            else {
                final int n29 = nvo.b[n13];
                if (n29 != 1) {
                    if (n29 != 2) {
                        if (n29 == 3) {
                            final int n30 = nvo.a[paint$Align.ordinal()];
                            Label_2660: {
                                if (n30 != 1) {
                                    if (n30 != 2) {
                                        if (n30 != 3) {
                                            return nvn;
                                        }
                                        nvn.b = -nvn.a;
                                        break Label_2660;
                                    }
                                    else {
                                        n = -nvn.a;
                                    }
                                }
                                else {
                                    n = -n15;
                                }
                                nvn.b = n;
                                n = nvn.d;
                            }
                            nvn.e = -n;
                        }
                    }
                    else {
                        final int n31 = nvo.a[paint$Align.ordinal()];
                        if (n31 != 1) {
                            if (n31 != 2) {
                                if (n31 != 3) {
                                    return nvn;
                                }
                                nvn.b = -nvn.a + n15 / 2;
                            }
                            else {
                                nvn.b = -nvn.a / 2;
                                n = nvn.d;
                            }
                            nvn.e = -n / 2;
                        }
                        else {
                            nvn.b = -n15 / 2;
                            nvn.e = -nvn.d + n / 2;
                        }
                    }
                }
                else {
                    final int n32 = nvo.a[paint$Align.ordinal()];
                    if (n32 != 1) {
                        if (n32 != 2) {
                            if (n32 != 3) {
                                return nvn;
                            }
                            nvn.b = -nvn.a + n15;
                            n = 0;
                        }
                        else {
                            n = 0;
                            nvn.b = 0;
                        }
                    }
                    else {
                        nvn.b = 0;
                        n += -nvn.d;
                    }
                    nvn.e = n;
                }
            }
        }
        return nvn;
    }
}
