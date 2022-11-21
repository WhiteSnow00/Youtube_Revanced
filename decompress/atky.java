import java.util.List;
import java.util.Arrays;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import java.text.Format;
import java.io.IOException;
import java.util.Iterator;
import android.content.Context;
import android.graphics.Color;
import java.util.WeakHashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaCodec;
import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atky
{
    public int a;
    public final Object b;
    public Object c;
    
    public atky() {
        final Object[] array = new Object[5];
        this.b = array;
        this.c = array;
    }
    
    public atky(final int n) {
        this.b = new arjd[n];
        this.a = -1;
    }
    
    public atky(final MediaFormat mediaFormat) {
        final MediaCodec encoderByType = MediaCodec.createEncoderByType(mediaFormat.getString("mime"));
        this.b = encoderByType;
        final MediaCodec mediaCodec = encoderByType;
        encoderByType.configure(mediaFormat, (Surface)null, (MediaCrypto)null, 1);
        final MediaCodec mediaCodec2 = encoderByType;
        encoderByType.start();
        this.a = 1;
    }
    
    public atky(final br b) {
        this.a = 0;
        this.b = b;
    }
    
    public atky(final TouchImageView b) {
        this.a = 0;
        this.b = b;
    }
    
    public atky(final Object b) {
        this.b = b;
    }
    
    public atky(final StringBuffer b) {
        this.b = b;
        this.a = b.length();
        this.c = null;
    }
    
    public atky(final StringBuilder b) {
        this.b = b;
        this.a = b.length();
        this.c = null;
    }
    
    public atky(final sil b) {
        this.b = b;
    }
    
    public atky(final byte[] array) {
        this.c = new uvi[1];
        this.b = new PriorityQueue(1);
    }
    
    public atky(final byte[] array, final byte[] array2) {
        this.b = new HashSet();
        this.a = 0;
    }
    
    public atky(final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = new dew(this, 13, (byte[])null, (byte[])null, (byte[])null);
        this.a = Integer.MAX_VALUE;
    }
    
    public atky(final char[] array) {
        this.a = -1;
        this.b = new WeakHashMap();
    }
    
    public atky(final char[] array, final byte[] array2) {
        this.b = afgh.d();
    }
    
    public atky(final String[] array) {
        int i = 0;
        this.a = 0;
        this.c = obf.l();
        this.b = new int[8];
        while (i < 8) {
            ((int[])this.b)[i] = Color.parseColor(array[i]);
            ++i;
        }
    }
    
    private final aevl K(final String s) {
        if (aewp.r()) {
            return aewp.o(s);
        }
        final bu oa = ((br)this.b).oa();
        oa.getClass();
        return afot.l((Context)oa).a(s);
    }
    
    private final aevl L(final String s) {
        aewp.m();
        Object o;
        if (aewp.r()) {
            o = aewp.o(s);
        }
        else {
            o = ((aeuc)aegu.N(((br)this.b).nQ(), aeuc.class)).bG().a(s);
        }
        return new aetq(aewp.s(), (aevl)o, 2);
    }
    
    private final void M(final aewh aewh, final br br, final boolean b) {
        if (br.ar()) {
            for (final br br2 : br.oc().j()) {
                if (br2 instanceof aevi) {
                    ((aevi)br2).sh(aewh, b);
                }
                else {
                    this.M(aewh, br2, b);
                }
            }
        }
    }
    
    public final boolean A() {
        return this.a == 4;
    }
    
    public final void B(final CharSequence charSequence) {
        try {
            ((Appendable)this.b).append(charSequence);
            this.a += charSequence.length();
        }
        catch (final IOException ex) {
            throw new z((Throwable)ex);
        }
    }
    
    public final void C(final Format format, Object b) {
        if (this.c == null) {
            this.B(format.format(b));
            return;
        }
        final AttributedCharacterIterator formatToCharacterIterator = format.formatToCharacterIterator(b);
        final int a = this.a;
        b = this.b;
        try {
            final int beginIndex = formatToCharacterIterator.getBeginIndex();
            final int endIndex = formatToCharacterIterator.getEndIndex();
            if (beginIndex < endIndex) {
                ((Appendable)b).append(formatToCharacterIterator.first());
                int n = beginIndex;
                while (++n < endIndex) {
                    ((Appendable)b).append(formatToCharacterIterator.next());
                }
            }
            this.a = endIndex - beginIndex + a;
            formatToCharacterIterator.first();
            int i = formatToCharacterIterator.getIndex();
            final int endIndex2 = formatToCharacterIterator.getEndIndex();
            final int n2 = a - i;
            while (i < endIndex2) {
                final Map<AttributedCharacterIterator.Attribute, Object> attributes = formatToCharacterIterator.getAttributes();
                final int runLimit = formatToCharacterIterator.getRunLimit();
                if (attributes.size() != 0) {
                    for (final Map.Entry entry : attributes.entrySet()) {
                        ((List<bax>)this.c).add(new bax((AttributedCharacterIterator.Attribute)entry.getKey(), entry.getValue(), n2 + i, n2 + runLimit));
                    }
                }
                formatToCharacterIterator.setIndex(runLimit);
                i = runLimit;
            }
        }
        catch (final IOException ex) {
            throw new z((Throwable)ex);
        }
    }
    
    public final void D(final Format format, final Object o, final String s) {
        if (this.c == null && s != null) {
            this.B(s);
            return;
        }
        this.C(format, o);
    }
    
    public final void E(final int a) {
        if (a == this.a) {
            return;
        }
        if ((this.a = a) == 0) {
            final TouchImageView touchImageView = (TouchImageView)this.b;
            touchImageView.setImageDrawable(agy.a(touchImageView.getContext(), 2131233466));
            return;
        }
        if (this.c == null) {
            this.c = BitmapFactory.decodeResource(((TouchImageView)this.b).getContext().getResources(), 2131233467);
        }
        final Bitmap bitmap = (Bitmap)this.c;
        final Bitmap bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        final Paint paint = new Paint();
        paint.setAntiAlias(true);
        final float n = (float)Color.red(a);
        final float n2 = (float)Color.green(a);
        final float n3 = (float)Color.blue(a);
        paint.setColorFilter((ColorFilter)new ColorMatrixColorFilter(new ColorMatrix(new float[] { (255.0f - n) / 255.0f, 0.0f, 0.0f, 0.0f, n, 0.0f, (255.0f - n2) / 255.0f, 0.0f, 0.0f, n2, 0.0f, 0.0f, (255.0f - n3) / 255.0f, 0.0f, n3, 0.0f, 0.0f, 0.0f, Color.alpha(a) / 255.0f, 0.0f })));
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        ((TouchImageView)this.b).setImageBitmap(bitmap2);
    }
    
    public final jlw F(final aoaa aoaa) {
        if ((aoaa.b & 0x2) != 0x0) {
            return ((Map<K, jlw>)this.b).get(jgu.k(aoaa));
        }
        return null;
    }
    
    public final RecyclerView G() {
        final Object c = this.c;
        if (c == null) {
            return null;
        }
        return ((eep)c).l;
    }
    
    public final void H() {
        final Object c = this.c;
        if (c != null) {
            final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout)c;
            if (swipeRefreshLayout.b) {
                if (bkx.r()) {
                    swipeRefreshLayout.k(false);
                    return;
                }
                final Object b = this.b;
                final eep eep = (eep)c;
                eep.removeCallbacks((Runnable)b);
                eep.post((Runnable)this.b);
            }
        }
    }
    
    public final void I(final int n) {
        final Object c = this.c;
        if (c == null) {
            return;
        }
        ((eep)c).l.aa(n);
    }
    
    public final void J(final bob bob, final long n) {
        final boolean b = bob instanceof bou;
        boolean b2 = true;
        if (b) {
            b2 = (n != -9223372036854775807L && b2);
        }
        bad.g(b2, "Progressive media source must define an initial placeholder duration.");
        ((afgc)this.b).h(new bnj(bob, this.a++, baz.w(n)));
    }
    
    public final void a(final Object o) {
        int a;
        if ((a = this.a) == 4) {
            final Object[] c = new Object[5];
            ((Object[])this.c)[4] = c;
            this.c = c;
            a = 0;
        }
        ((Object[])this.c)[a] = o;
        this.a = a + 1;
    }
    
    public final void b(final atkx atkx) {
        for (Object b = this.b; b != null; b = ((Object[])b)[4]) {
            for (int i = 0; i < 4; ++i) {
                final Object o = ((Object[])b)[i];
                if (o == null) {
                    break;
                }
                if (atkx.a(o)) {
                    return;
                }
            }
        }
    }
    
    public final void c(final Object o) {
        ((Object[])this.b)[0] = o;
    }
    
    public final boolean d(final auna auna) {
        Object b = this.b;
    Label_0071:
        while (true) {
            int i = 0;
            if (b == null) {
                return false;
            }
            while (i < 4) {
                final Object o = ((Object[])b)[i];
                if (o == null) {
                    break;
                }
                if (o == atli.a) {
                    auna.tw();
                    break Label_0071;
                }
                if (o instanceof atlg) {
                    auna.b(((atlg)o).a);
                    break Label_0071;
                }
                if (o instanceof atlh) {
                    auna.f(((atlh)o).a);
                }
                else {
                    auna.tt(o);
                }
                ++i;
            }
            b = ((Object[])b)[4];
        }
        return true;
    }
    
    public final aevl e() {
        final Object c = this.c;
        if (c != null) {
            return ((aewh)c).a();
        }
        return aewp.f();
    }
    
    public final aevl f() {
        final Object c = this.c;
        if (c != null) {
            return ((aewh)c).a();
        }
        return aewp.f();
    }
    
    public final aevl g() {
        try {
            final Object c = this.c;
            if (c != null) {
                return ((aewh)c).a();
            }
            return aewp.f();
        }
        finally {
            this.c = null;
            this.a = 0;
        }
    }
    
    public final aevl h() {
        final Object c = this.c;
        if (c != null) {
            return ((aewh)c).a();
        }
        return aewp.f();
    }
    
    public final aevl i() {
        final aevl f = aewp.f();
        if (this.a > 0) {
            this.j(aewh.b(), false);
        }
        return f;
    }
    
    public final void j(final aewh c, final boolean b) {
        if (b) {
            if (c == null) {
                int a;
                if ((a = this.a - 1) < 0) {
                    a = 0;
                }
                if ((this.a = a) == 0) {
                    this.c = null;
                }
                return;
            }
            ++this.a;
        }
        this.M((aewh)(this.c = c), (br)this.b, b);
    }
    
    public final aevl k() {
        return this.K("Fragment:onActivityResult");
    }
    
    public final aevl l() {
        return this.L("DialogFragment:onCancel");
    }
    
    public final aevl m(final int n, final int n2) {
        final aevl f = aewp.f();
        if (n != 0 || n2 != 0) {
            this.j(aewh.b(), true);
        }
        return f;
    }
    
    public final aevl n() {
        return this.L("DialogFragment:onDismiss");
    }
    
    public final aevl o() {
        return this.K("Fragment:onOptionsItemSelected");
    }
    
    public final void p() {
        aewp.t();
        if (this.a > 0) {
            this.j(aewh.b(), false);
        }
    }
    
    public final afbh q(final int n) {
        if (n >= 0 && n < this.a) {
            return afbh.k(((uvi[])this.c)[n]);
        }
        return afag.a;
    }
    
    public final void r(final float b, final float c) {
        final int a = this.a;
        final Object c2 = this.c;
        final int length = ((uvi[])c2).length;
        if (a >= length) {
            this.c = Arrays.copyOf((uvi[])c2, length + length);
        }
        final uvi[] array = (uvi[])this.c;
        uvi uvi = array[a];
        if (uvi == null) {
            uvi = new uvi(a, b, c);
            array[a] = uvi;
        }
        else {
            uvi.a = a;
            uvi.b = b;
            uvi.c = c;
        }
        ++this.a;
        ((PriorityQueue)this.b).add(uvi);
    }
    
    public final int s() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public final aagl t() {
        synchronized (this) {
            return (aagl)this.c;
        }
    }
    
    public final HashSet u() {
        synchronized (this) {
            return (HashSet)this.b;
        }
    }
    
    public final void v(final String s) {
        synchronized (this) {
            ((HashSet)this.b).add(s);
        }
    }
    
    public final void w(final String s) {
        synchronized (this) {
            ((HashSet)this.b).remove(s);
        }
    }
    
    public final void x(final int a) {
        synchronized (this) {
            this.t().e();
            this.a = a;
        }
    }
    
    public final String y() {
        final int a = this.a;
        String s;
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        s = "RENDERING";
                    }
                    else {
                        s = "ENTERED";
                    }
                }
                else {
                    s = "ENTER_REQUESTED";
                }
            }
            else {
                s = "SCHEDULED";
            }
        }
        else {
            s = "NOT_SCHEDULED";
        }
        return s;
    }
    
    public final boolean z() {
        final int a = this.a;
        return a == 2 || a == 3 || a == 4;
    }
}
