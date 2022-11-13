import android.graphics.Typeface;
import java.util.Arrays;
import android.graphics.Paint;
import android.os.Build$VERSION;
import android.text.Layout$Alignment;
import android.text.TextUtils$TruncateAt;
import android.content.res.ColorStateList;
import android.text.TextPaint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsg
{
    public TextPaint a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public CharSequence h;
    public ColorStateList i;
    public float j;
    public float k;
    public boolean l;
    final boolean m;
    public TextUtils$TruncateAt n;
    public int o;
    Layout$Alignment p;
    akf q;
    public int r;
    boolean s;
    
    public dsg() {
        boolean m = true;
        this.a = new TextPaint(1);
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = true;
        if (Build$VERSION.SDK_INT < 28) {
            m = false;
        }
        this.m = m;
        this.n = null;
        this.o = Integer.MAX_VALUE;
        this.p = Layout$Alignment.ALIGN_NORMAL;
        this.q = akl.c;
        this.r = 0;
        this.s = false;
    }
    
    public final void a() {
        if (this.s) {
            final TextPaint a = new TextPaint((Paint)this.a);
            a.set(this.a);
            this.a = a;
            this.s = false;
        }
    }
    
    @Override
    public final int hashCode() {
        final int color = this.a.getColor();
        final int floatToIntBits = Float.floatToIntBits(this.a.getTextSize());
        final Typeface typeface = this.a.getTypeface();
        int hashCode = 0;
        int hashCode2;
        if (typeface != null) {
            hashCode2 = this.a.getTypeface().hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int floatToIntBits2 = Float.floatToIntBits(this.b);
        final int floatToIntBits3 = Float.floatToIntBits(this.c);
        final int floatToIntBits4 = Float.floatToIntBits(this.d);
        final int e = this.e;
        final int linkColor = this.a.linkColor;
        final int floatToIntBits5 = Float.floatToIntBits(this.a.density);
        final int hashCode3 = Arrays.hashCode(this.a.drawableState);
        final int f = this.f;
        final int g = this.g;
        final int floatToIntBits6 = Float.floatToIntBits(this.j);
        final int floatToIntBits7 = Float.floatToIntBits(this.k);
        final int floatToIntBits8 = Float.floatToIntBits(Float.MAX_VALUE);
        final int l = this.l ? 1 : 0;
        final int m = this.m ? 1 : 0;
        final TextUtils$TruncateAt n = this.n;
        int hashCode4;
        if (n != null) {
            hashCode4 = n.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int o = this.o;
        final Layout$Alignment p = this.p;
        int hashCode5;
        if (p != null) {
            hashCode5 = p.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final akf q = this.q;
        int hashCode6;
        if (q != null) {
            hashCode6 = q.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int r = this.r;
        final int hashCode7 = Arrays.hashCode((int[])null);
        final int hashCode8 = Arrays.hashCode((int[])null);
        final CharSequence h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return ((((((((((((((((((((((((color + 31) * 31 + floatToIntBits) * 31 + hashCode2) * 31 + floatToIntBits2) * 31 + floatToIntBits3) * 31 + floatToIntBits4) * 31 + e) * 31 + linkColor) * 31 + floatToIntBits5) * 31 + hashCode3) * 31 + f) * 31 + g) * 31 + floatToIntBits6) * 31 + floatToIntBits7) * 31 + floatToIntBits8) * 31 + l) * 31 + m) * 31 + hashCode4) * 961 + o) * 31 + hashCode5) * 31 + hashCode6) * 31 + r) * 961 + hashCode7) * 31 + hashCode8) * 31 + hashCode;
    }
}
