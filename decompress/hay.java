import android.util.TypedValue;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hay
{
    float a;
    float b;
    float c;
    float d;
    float e;
    int f;
    int g;
    public final float h;
    public final float i;
    final float j;
    
    public hay(final Resources resources) {
        this.a = 1.0f;
        this.b = 1.0f;
        this.f = 1;
        this.g = 1;
        this.h = TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics());
        this.i = TypedValue.applyDimension(1, 128.0f, resources.getDisplayMetrics());
        this.j = TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
    }
    
    public final float a() {
        final float b = this.b;
        final float a = this.a;
        return (b - a) / (4.0f - a);
    }
    
    public final ahfp b() {
        final ahaz builder = ((ahbh)ahfp.a).createBuilder();
        final ahaz builder2 = ((ahbh)ahfq.a).createBuilder();
        final float b = this.b;
        builder2.copyOnWrite();
        final ahfq ahfq = (ahfq)builder2.instance;
        ahfq.b |= 0x1;
        ahfq.c = b;
        final float b2 = this.b;
        builder2.copyOnWrite();
        final ahfq ahfq2 = (ahfq)builder2.instance;
        ahfq2.b |= 0x2;
        ahfq2.d = b2;
        builder.copyOnWrite();
        final ahfp ahfp = (ahfp)builder.instance;
        final ahfq d = (ahfq)builder2.build();
        d.getClass();
        ahfp.d = d;
        ahfp.b |= 0x2;
        final float e = this.e;
        builder.copyOnWrite();
        final ahfp ahfp2 = (ahfp)builder.instance;
        ahfp2.b |= 0x8;
        ahfp2.e = e;
        final ahaz builder3 = ((ahbh)ahfq.a).createBuilder();
        final float c = this.c;
        builder3.copyOnWrite();
        final ahfq ahfq3 = (ahfq)builder3.instance;
        ahfq3.b |= 0x1;
        ahfq3.c = c;
        final float d2 = this.d;
        builder3.copyOnWrite();
        final ahfq ahfq4 = (ahfq)builder3.instance;
        ahfq4.b |= 0x2;
        ahfq4.d = d2;
        builder.copyOnWrite();
        final ahfp ahfp3 = (ahfp)builder.instance;
        final ahfq c2 = (ahfq)builder3.build();
        c2.getClass();
        ahfp3.c = c2;
        ahfp3.b |= 0x1;
        return (ahfp)builder.build();
    }
    
    public final ahfr c() {
        final ahaz builder = ((ahbh)ahfp.a).createBuilder();
        final ahaz builder2 = ((ahbh)ahfq.a).createBuilder();
        final float b = this.b;
        builder2.copyOnWrite();
        final ahfq ahfq = (ahfq)builder2.instance;
        ahfq.b |= 0x1;
        ahfq.c = b;
        final float b2 = this.b;
        builder2.copyOnWrite();
        final ahfq ahfq2 = (ahfq)builder2.instance;
        ahfq2.b |= 0x2;
        ahfq2.d = b2;
        builder.copyOnWrite();
        final ahfp ahfp = (ahfp)builder.instance;
        final ahfq d = (ahfq)builder2.build();
        d.getClass();
        ahfp.d = d;
        ahfp.b |= 0x2;
        final float e = -this.e;
        builder.copyOnWrite();
        final ahfp ahfp2 = (ahfp)builder.instance;
        ahfp2.b |= 0x8;
        ahfp2.e = e;
        final ahaz builder3 = ((ahbh)ahfq.a).createBuilder();
        final float c = this.c;
        final float n = (float)this.f;
        builder3.copyOnWrite();
        final ahfq ahfq3 = (ahfq)builder3.instance;
        ahfq3.b |= 0x1;
        ahfq3.c = c * -2.0f / n;
        final float d2 = this.d;
        final float n2 = (float)this.g;
        builder3.copyOnWrite();
        final ahfq ahfq4 = (ahfq)builder3.instance;
        ahfq4.b |= 0x2;
        ahfq4.d = d2 * -2.0f / n2;
        builder.copyOnWrite();
        final ahfp ahfp3 = (ahfp)builder.instance;
        final ahfq c2 = (ahfq)builder3.build();
        c2.getClass();
        ahfp3.c = c2;
        ahfp3.b |= 0x1;
        final ahaz builder4 = ((ahbh)ahfr.a).createBuilder();
        builder4.copyOnWrite();
        final ahfr ahfr = (ahfr)builder4.instance;
        final ahfp d3 = (ahfp)builder.build();
        d3.getClass();
        ahfr.d = d3;
        ahfr.c |= 0x1;
        return (ahfr)builder4.build();
    }
    
    public final void d() {
        final float n = (float)this.f;
        final float n2 = this.b + 1.0f;
        final float n3 = n * n2 / 2.0f;
        final float j = this.j;
        final float n4 = n3 - j;
        final float n5 = this.g * n2 / 2.0f - j;
        this.c = aeuz.j(this.c, -n4, n4);
        this.d = aeuz.j(this.d, -n5, n5);
    }
    
    public final void e(final float n) {
        if (Math.abs(n / this.b - 1.0f) >= 0.001f) {
            this.b = aeuz.j(n, this.a, 4.0f);
        }
        this.d();
    }
}
