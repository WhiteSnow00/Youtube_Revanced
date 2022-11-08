import android.os.Build$VERSION;
import android.graphics.drawable.AnimatedImageDrawable;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import android.view.View;
import android.graphics.Bitmap;
import com.google.android.libraries.elements.interfaces.ContentMode;
import android.support.rastermill.FrameSequenceDrawable;
import android.util.Pair;
import android.widget.ImageView$ScaleType;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.libraries.elements.interfaces.ImageProxy;

// 
// Decompiled by Procyon v0.6.0
// 

final class orh extends dny
{
    private final dwp c;
    private final ImageProxy d;
    private final ImageProxy e;
    private final ImageProxy f;
    private final oun g;
    private final otd h;
    private final otl i;
    private final int j;
    private boolean k;
    private final adcr l;
    
    public orh(final dwp c, final ImageView imageView, final ImageProxy d, final adcr l, final ImageProxy e, final ImageProxy f, final oun g, final otd h, final otl i, final int j, final byte[] array, final byte[] array2) {
        super(imageView);
        this.k = false;
        this.c = c;
        this.d = d;
        this.l = l;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    private final Drawable q(Drawable drawable, final ImageProxy imageProxy) {
        final boolean b = drawable instanceof BitmapDrawable;
        boolean b2 = true;
        Object o;
        if (b) {
            final aglt a = ((ogs)imageProxy).a();
            final ContentMode contentMode = imageProxy.contentMode();
            final Bitmap bitmap = ((BitmapDrawable)drawable).getBitmap();
            ImageView$ScaleType imageView$ScaleType;
            if ((imageView$ScaleType = oaw.j(contentMode)) == ImageView$ScaleType.CENTER_INSIDE) {
                imageView$ScaleType = ImageView$ScaleType.FIT_CENTER;
            }
            final Drawable drawable2 = drawable = null;
            Label_0426: {
                if (a != null) {
                    final otl i = this.i;
                    drawable = drawable2;
                    if (i != null) {
                        Label_0195: {
                            if (a.L() == 1) {
                                final omq omq = (omq)i;
                                final otk otk = omq.a.get(a.K());
                                if (otk == null) {
                                    final otd c = omq.c;
                                    final int k = a.K();
                                    final StringBuilder sb = new StringBuilder("Unknown Flatbuffer extension in ImageProcessorExtensionResolverExtension id: ");
                                    sb.append(k);
                                    c.b(24, sb.toString());
                                    drawable = drawable2;
                                }
                                else {
                                    drawable = otk.a(otk.b(a.M()), bitmap, imageView$ScaleType);
                                }
                            }
                            else {
                                if (a.L() == 2) {
                                    final omq omq2 = (omq)i;
                                    final Pair pair = omq2.b.get(a.K());
                                    if (pair == null) {
                                        final otd c2 = omq2.c;
                                        final int j = a.K();
                                        final StringBuilder sb2 = new StringBuilder("ImageProcessorExtensionResolver: Unknown PB image processor extension: ");
                                        sb2.append(j);
                                        c2.b(24, sb2.toString());
                                        drawable = drawable2;
                                        break Label_0426;
                                    }
                                    try {
                                        drawable = ((otj)pair.first).a(oga.n(a.M(), (ahbe)pair.second), bitmap, imageView$ScaleType);
                                        break Label_0195;
                                    }
                                    catch (final ahab ahab) {
                                        final otd c3 = omq2.c;
                                        final int l = a.K();
                                        final StringBuilder sb3 = new StringBuilder("Failed to parse PB Image Processor Extension in ImageProcessorExtensionResolver. Extension id: ");
                                        sb3.append(l);
                                        c3.d(24, sb3.toString(), ahab);
                                        drawable = drawable2;
                                        break Label_0426;
                                    }
                                }
                                final otd c4 = ((omq)i).c;
                                final int m = a.K();
                                final StringBuilder sb4 = new StringBuilder("ImageProcessorExtensionResolver: extension with unknown format: ");
                                sb4.append(m);
                                c4.b(24, sb4.toString());
                                drawable = drawable2;
                            }
                        }
                    }
                }
            }
            if (drawable == null) {
                o = new ohj(bitmap, imageView$ScaleType, this.h);
            }
            else {
                o = drawable;
            }
        }
        else {
            o = drawable;
            if (drawable instanceof FrameSequenceDrawable) {
                final FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable)drawable;
                final argv b3 = orj.b(imageProxy);
                o = drawable;
                if (b3 != null) {
                    frameSequenceDrawable.setCornerRadius((int)oga.p(b3.as(), ((ImageView)this.a).getContext().getResources().getDisplayMetrics()));
                    o = drawable;
                }
            }
        }
        if (!(o instanceof ohj)) {
            ((ImageView)((doe)this).a).setScaleType(oaw.j(imageProxy.contentMode()));
        }
        final aglt b4 = ((ogs)imageProxy).b;
        final int b5 = b4.b(10);
        if (b5 == 0 || b4.b.get(b5 + b4.a) == 0) {
            b2 = false;
        }
        aio.d((Drawable)o, b2);
        oaw.m((Drawable)o, imageProxy);
        return (Drawable)o;
    }
    
    private final void r() {
        this.k = true;
        final adcr l = this.l;
        if (l != null) {
            final View a = ((doe)this).a;
            final ImageProxy d = this.d;
            final dwp c = this.c;
            final acej a2 = acek.a();
            a2.d = aceq.a();
            final acek a3 = a2.a();
            final agza builder = ((agzi)aorl.a).createBuilder();
            final int a4 = c.a;
            builder.copyOnWrite();
            final aorl aorl = (aorl)builder.instance;
            aorl.b |= 0x2;
            aorl.d = a4;
            final int b = c.b;
            builder.copyOnWrite();
            final aorl aorl2 = (aorl)builder.instance;
            aorl2.b |= 0x4;
            aorl2.e = b;
            final ImageSourceProxy o = oga.o(d, c.a, c.b);
            if (o != null && o.url() != null) {
                final String url = o.url();
                builder.copyOnWrite();
                final aorl aorl3 = (aorl)builder.instance;
                url.getClass();
                aorl3.b |= 0x1;
                aorl3.c = url;
            }
            final agzc agzc = (agzc)((agzi)aorm.a).createBuilder();
            agzc.cI(builder);
            ((acer)l.a).f((ImageView)a, a3, (aorm)agzc.build());
        }
    }
    
    private static void s(final AnimatedImageDrawable animatedImageDrawable) {
        animatedImageDrawable.setRepeatCount(-1);
        animatedImageDrawable.start();
    }
    
    public final void a(Drawable drawable) {
        if (!this.k) {
            this.r();
        }
        final adcr l = this.l;
        if (l != null) {
            ((acer)l.a).d((ImageView)((doe)this).a, (acek)null, (aorm)null);
        }
        Drawable q;
        if ((q = drawable) != null) {
            final ImageProxy f = this.f;
            q = drawable;
            if (f != null) {
                drawable = (q = this.q(drawable, f));
                if (Build$VERSION.SDK_INT >= 28) {
                    q = drawable;
                    if (drawable instanceof AnimatedImageDrawable) {
                        s((AnimatedImageDrawable)drawable);
                        q = drawable;
                    }
                }
            }
        }
        super.a(q);
    }
    
    public final void e(final dob dob) {
        final dwp c = this.c;
        dob.g(c.a, c.b);
    }
    
    public final void f(Drawable drawable) {
        this.r();
        Drawable q = drawable;
        if (drawable != null) {
            final ImageProxy e = this.e;
            q = drawable;
            if (e != null) {
                drawable = (q = this.q(drawable, e));
                if (Build$VERSION.SDK_INT >= 28) {
                    q = drawable;
                    if (drawable instanceof AnimatedImageDrawable) {
                        s((AnimatedImageDrawable)drawable);
                        q = drawable;
                    }
                }
            }
        }
        super.f(q);
    }
    
    public final void lp(final Drawable drawable) {
        final adcr l = this.l;
        if (l != null) {
            ((acer)l.a).e((ImageView)((doe)this).a, (acek)null, (aorm)null);
        }
        Drawable q;
        if ((q = drawable) != null) {
            final ImageProxy e = this.e;
            q = drawable;
            if (e != null) {
                q = this.q(drawable, e);
            }
        }
        super.lp(q);
    }
}
