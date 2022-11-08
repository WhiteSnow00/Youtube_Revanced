import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;

// 
// Decompiled by Procyon v0.6.0
// 

final class ckd extends ckf
{
    public int[] a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    Paint$Cap h;
    Paint$Join i;
    float j;
    agmd k;
    agmd l;
    
    public ckd() {
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint$Cap.BUTT;
        this.i = Paint$Join.MITER;
        this.j = 4.0f;
    }
    
    public ckd(final ckd ckd) {
        super((ckf)ckd);
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint$Cap.BUTT;
        this.i = Paint$Join.MITER;
        this.j = 4.0f;
        final int[] a = ckd.a;
        this.a = null;
        this.k = ckd.k;
        this.b = ckd.b;
        this.c = ckd.c;
        this.l = ckd.l;
        this.o = ckd.o;
        this.d = ckd.d;
        this.e = ckd.e;
        this.f = ckd.f;
        this.g = ckd.g;
        this.h = ckd.h;
        this.i = ckd.i;
        this.j = ckd.j;
    }
    
    public final boolean b() {
        return this.l.G() || this.k.G();
    }
    
    public final boolean c(final int[] array) {
        return this.k.H(array) | this.l.H(array);
    }
    
    float getFillAlpha() {
        return this.d;
    }
    
    int getFillColor() {
        return this.l.b;
    }
    
    float getStrokeAlpha() {
        return this.c;
    }
    
    int getStrokeColor() {
        return this.k.b;
    }
    
    float getStrokeWidth() {
        return this.b;
    }
    
    float getTrimPathEnd() {
        return this.f;
    }
    
    float getTrimPathOffset() {
        return this.g;
    }
    
    float getTrimPathStart() {
        return this.e;
    }
    
    void setFillAlpha(final float d) {
        this.d = d;
    }
    
    void setFillColor(final int b) {
        this.l.b = b;
    }
    
    void setStrokeAlpha(final float c) {
        this.c = c;
    }
    
    void setStrokeColor(final int b) {
        this.k.b = b;
    }
    
    void setStrokeWidth(final float b) {
        this.b = b;
    }
    
    void setTrimPathEnd(final float f) {
        this.f = f;
    }
    
    void setTrimPathOffset(final float g) {
        this.g = g;
    }
    
    void setTrimPathStart(final float e) {
        this.e = e;
    }
}
