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

public final class athj
{
    public int a;
    public final Object b;
    public Object c;
    
    public athj() {
        final Object[] array = new Object[5];
        this.b = array;
        this.c = array;
    }
    
    public athj(final int n) {
        this.b = new ardu[n];
        this.a = -1;
    }
    
    public athj(final MediaFormat mediaFormat) {
        final MediaCodec encoderByType = MediaCodec.createEncoderByType(mediaFormat.getString("mime"));
        this.b = encoderByType;
        final MediaCodec mediaCodec = encoderByType;
        encoderByType.configure(mediaFormat, (Surface)null, (MediaCrypto)null, 1);
        final MediaCodec mediaCodec2 = encoderByType;
        encoderByType.start();
        this.a = 1;
    }
    
    public athj(final br b) {
        this.a = 0;
        this.b = b;
    }
    
    public athj(final TouchImageView b) {
        this.a = 0;
        this.b = b;
    }
    
    public athj(final Object b) {
        this.b = b;
    }
    
    public athj(final StringBuffer b) {
        this.b = b;
        this.a = b.length();
        this.c = null;
    }
    
    public athj(final StringBuilder b) {
        this.b = b;
        this.a = b.length();
        this.c = null;
    }
    
    public athj(final sfh b) {
        this.b = b;
    }
    
    public athj(final byte[] array) {
        this.c = new usk[1];
        this.b = new PriorityQueue(1);
    }
    
    public athj(final byte[] array, final byte[] array2) {
        this.b = new HashSet();
        this.a = 0;
    }
    
    public athj(final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = new dmb(this, 12, null, null, null);
        this.a = Integer.MAX_VALUE;
    }
    
    public athj(final char[] array) {
        this.a = -1;
        this.b = new WeakHashMap();
    }
    
    public athj(final char[] array, final byte[] array2) {
        this.b = afcr.d();
    }
    
    public athj(final String[] array) {
        int i = 0;
        this.a = 0;
        this.c = nrw.x();
        this.b = new int[8];
        while (i < 8) {
            ((int[])this.b)[i] = Color.parseColor(array[i]);
            ++i;
        }
    }
    
    private final aers K(final String s) {
        if (aesw.r()) {
            return (aers)aesw.o(s);
        }
        final bu od = ((br)this.b).od();
        od.getClass();
        return (aers)alhb.R((Context)od).a(s);
    }
    
    private final aers L(final String s) {
        aesw.m();
        Object o;
        if (aesw.r()) {
            o = aesw.o(s);
        }
        else {
            o = ((aeqj)ahbz.az(((br)this.b).nT(), aeqj.class)).bG().a(s);
        }
        return (aers)new aeqi(aesw.s(), (aers)o, 0);
    }
    
    private final void M(final aeso aeso, final br br, final boolean b) {
        if (br.ar()) {
            for (final br br2 : br.og().j()) {
                if (br2 instanceof aerp) {
                    ((aerp)br2).sb(aeso, b);
                }
                else {
                    this.M(aeso, br2, b);
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
                        ((List<bau>)this.c).add(new bau((AttributedCharacterIterator.Attribute)entry.getKey(), entry.getValue(), n2 + i, n2 + runLimit));
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
    
    public final void E(int alpha) {
        if (alpha == this.a) {
            return;
        }
        if ((this.a = alpha) == 0) {
            final TouchImageView touchImageView = (TouchImageView)this.b;
            touchImageView.setImageDrawable(agw.a(touchImageView.getContext(), 2131233465));
            return;
        }
        if (this.c == null) {
            this.c = BitmapFactory.decodeResource(((TouchImageView)this.b).getContext().getResources(), 2131233466);
        }
        final Bitmap bitmap = (Bitmap)this.c;
        final Bitmap bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        final Paint paint = new Paint();
        paint.setAntiAlias(true);
        final float n = (float)Color.red(alpha);
        final float n2 = (float)Color.green(alpha);
        final float n3 = (float)Color.blue(alpha);
        alpha = Color.alpha(alpha);
        paint.setColorFilter((ColorFilter)new ColorMatrixColorFilter(new ColorMatrix(new float[] { (255.0f - n) / 255.0f, 0.0f, 0.0f, 0.0f, n, 0.0f, (255.0f - n2) / 255.0f, 0.0f, 0.0f, n2, 0.0f, 0.0f, (255.0f - n3) / 255.0f, 0.0f, n3, 0.0f, 0.0f, 0.0f, alpha / 255.0f, 0.0f })));
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        ((TouchImageView)this.b).setImageBitmap(bitmap2);
    }
    
    public final jki F(final anvp anvp) {
        if ((anvp.b & 0x2) != 0x0) {
            return ((Map<K, jki>)this.b).get(jfi.f(anvp));
        }
        return null;
    }
    
    public final RecyclerView G() {
        final Object c = this.c;
        if (c == null) {
            return null;
        }
        return ((eel)c).l;
    }
    
    public final void H() {
        final Object c = this.c;
        if (c != null) {
            final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout)c;
            if (swipeRefreshLayout.b) {
                if (bkv.f()) {
                    swipeRefreshLayout.k(false);
                    return;
                }
                final Object b = this.b;
                final eel eel = (eel)c;
                eel.removeCallbacks((Runnable)b);
                eel.post((Runnable)this.b);
            }
        }
    }
    
    public final void I(final int n) {
        final Object c = this.c;
        if (c == null) {
            return;
        }
        ((eel)c).l.aa(n);
    }
    
    public final void J(final bnx bnx, final long n) {
        final boolean b = bnx instanceof boq;
        boolean b2 = true;
        if (b) {
            b2 = (n != -9223372036854775807L && b2);
        }
        dk.i(b2, (Object)"Progressive media source must define an initial placeholder duration.");
        ((afcm)this.b).h((Object)new bnf(bnx, this.a++, baw.w(n)));
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
    
    public final void b(final athi athi) {
        for (Object b = this.b; b != null; b = ((Object[])b)[4]) {
            for (int i = 0; i < 4; ++i) {
                final Object o = ((Object[])b)[i];
                if (o == null) {
                    break;
                }
                if (athi.a(o)) {
                    return;
                }
            }
        }
    }
    
    public final void c(final Object o) {
        ((Object[])this.b)[0] = o;
    }
    
    public final boolean d(final aujp aujp) {
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
                if (o == atht.a) {
                    aujp.tu();
                    break Label_0071;
                }
                if (o instanceof athr) {
                    aujp.b(((athr)o).a);
                    break Label_0071;
                }
                if (o instanceof aths) {
                    aujp.f(((aths)o).a);
                }
                else {
                    aujp.tr(o);
                }
                ++i;
            }
            b = ((Object[])b)[4];
        }
        return true;
    }
    
    public final aers e() {
        final Object c = this.c;
        if (c != null) {
            return ((aeso)c).a();
        }
        return aesw.f();
    }
    
    public final aers f() {
        final Object c = this.c;
        if (c != null) {
            return ((aeso)c).a();
        }
        return aesw.f();
    }
    
    public final aers g() {
        try {
            final Object c = this.c;
            if (c != null) {
                return ((aeso)c).a();
            }
            return aesw.f();
        }
        finally {
            this.c = null;
            this.a = 0;
        }
    }
    
    public final aers h() {
        final Object c = this.c;
        if (c != null) {
            return ((aeso)c).a();
        }
        return aesw.f();
    }
    
    public final aers i() {
        final aers f = aesw.f();
        if (this.a > 0) {
            this.j(aeso.b(), false);
        }
        return f;
    }
    
    public final void j(final aeso c, final boolean b) {
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
        this.M((aeso)(this.c = c), (br)this.b, b);
    }
    
    public final aers k() {
        return this.K("Fragment:onActivityResult");
    }
    
    public final aers l() {
        return this.L("DialogFragment:onCancel");
    }
    
    public final aers m(final int n, final int n2) {
        final aers f = aesw.f();
        if (n != 0 || n2 != 0) {
            this.j(aeso.b(), true);
        }
        return f;
    }
    
    public final aers n() {
        return this.L("DialogFragment:onDismiss");
    }
    
    public final aers o() {
        return this.K("Fragment:onOptionsItemSelected");
    }
    
    public final void p() {
        aesw.t();
        if (this.a > 0) {
            this.j(aeso.b(), false);
        }
    }
    
    public final aexq q(final int n) {
        if (n >= 0 && n < this.a) {
            return aexq.k(((usk[])this.c)[n]);
        }
        return (aexq)aewp.a;
    }
    
    public final void r(final float b, final float c) {
        final int a = this.a;
        final Object c2 = this.c;
        final int length = ((usk[])c2).length;
        if (a >= length) {
            this.c = Arrays.copyOf((usk[])c2, length + length);
        }
        final usk[] array = (usk[])this.c;
        usk usk = array[a];
        if (usk == null) {
            usk = new usk(a, b, c);
            array[a] = usk;
        }
        else {
            usk.a = a;
            usk.b = b;
            usk.c = c;
        }
        ++this.a;
        ((PriorityQueue)this.b).add(usk);
    }
    
    public final int s() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public final aacr t() {
        synchronized (this) {
            return (aacr)this.c;
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
