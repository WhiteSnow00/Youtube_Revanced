import j$.util.Optional;
import android.graphics.drawable.BitmapDrawable;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Bitmap;
import j$.util.function.Function$_CC;
import java.util.HashMap;
import android.view.KeyEvent;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvt implements Function
{
    public final int a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public gvt(final gvu b, final int a, final KeyEvent c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public gvt(final lgj b, final htk c, final int a, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public gvt(final vcg c, final int a, final HashMap b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gvt(final vcg b, final int a, final vcf c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final Function andThen(final Function function) {
        final int d = this.d;
        if (d == 0) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        if (d == 1) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        if (d == 2) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        if (d == 3) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        if (d != 4) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        return Function$_CC.$default$andThen((Function)this, function);
    }
    
    @Override
    public final Object apply(Object c) {
        final int d = this.d;
        final boolean b = false;
        boolean b2 = false;
        final boolean b3 = false;
        if (d == 0) {
            final Object b4 = this.b;
            final int a = this.a;
            final Object c2 = this.c;
            if (((hih)c).c(a) || ((gvv)b4).l.h(a, (KeyEvent)c2)) {
                b2 = true;
            }
            return b2;
        }
        if (d == 1) {
            final Object b5 = this.b;
            final int a2 = this.a;
            final Object c3 = this.c;
            if (!((hih)c).d(a2)) {
                final boolean b6 = b;
                if (!((gvv)b5).l.i(a2, (KeyEvent)c3)) {
                    return b6;
                }
            }
            return true;
        }
        if (d == 2) {
            final Object b7 = this.b;
            final int a3 = this.a;
            final Object c4 = this.c;
            final hih hih = (hih)c;
            final KeyEvent keyEvent = (KeyEvent)c4;
            if (!hih.b(a3, keyEvent)) {
                final boolean b8 = b3;
                if (!((gvv)b7).l.g(a3, keyEvent)) {
                    return b8;
                }
            }
            return true;
        }
        if (d == 3) {
            final Object b9 = this.b;
            final Object c5 = this.c;
            final int a4 = this.a;
            final lft lft = (lft)c;
            final Optional a5 = lft.a;
            lgi lgi;
            if (a5.isPresent()) {
                final lgy lgy = (lgy)a5.get();
                final Bitmap a6 = lgy.a;
                final int b10 = lgy.b;
                final int c6 = lgy.c;
                final htk htk = (htk)c5;
                if (htk.c == (c = htk.a)) {
                    c = htk.d;
                }
                htk.c = c;
                ((eg)htk.c).O(a4);
                final eg eg = (eg)htk.c;
                final Bitmap bitmap = (Bitmap)eg.c;
                final int width = bitmap.getWidth();
                final int height = bitmap.getHeight();
                final float n = (float)b10;
                final float n2 = (float)c6;
                final float n3 = (float)(height - c6);
                final float n4 = (width - b10) / 2.0f;
                final float n5 = n3 / 2.0f;
                final RectF rectF = new RectF(n4, n5, n + n4, n2 + n5);
                ((Canvas)eg.b).drawBitmap(a6, new Rect(0, 0, b10, c6), rectF, (Paint)null);
                final Object d2 = eg.d;
                final Object b11 = htk.b;
                final Bitmap bitmap2 = (Bitmap)((eg)htk.c).c;
                final Context context = (Context)b11;
                final Bitmap bitmap3 = (Bitmap)d2;
                tpe.B(context, bitmap2, bitmap3);
                lgi = new lgi(Optional.of((Object)new BitmapDrawable(((Activity)((lgj)b9).a).getResources(), bitmap3)), Optional.of((Object)rectF), lft.b);
            }
            else {
                lgi = new lgi(Optional.empty(), Optional.empty(), lft.b);
            }
            return lgi;
        }
        if (d != 4) {
            return ((vcg)this.b).d(this.a, (aqae)c, (vcf)this.c);
        }
        final Object c7 = this.c;
        final int a7 = this.a;
        return ((vcg)c7).d(a7, (aqae)c, (vcf)((HashMap)this.b).get(a7));
    }
    
    @Override
    public final Function compose(final Function function) {
        final int d = this.d;
        if (d == 0) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        if (d == 1) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        if (d == 2) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        if (d == 3) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        if (d != 4) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        return Function$_CC.$default$compose((Function)this, function);
    }
}
