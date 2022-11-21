import java.util.ArrayList;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

final class cki extends cjd
{
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;
    
    public cki() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }
    
    public cki(cki cki, final abi abi) {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        final Matrix j = new Matrix();
        this.j = j;
        this.m = null;
        this.c = cki.c;
        this.d = cki.d;
        this.e = cki.e;
        this.f = cki.f;
        this.g = cki.g;
        this.h = cki.h;
        this.i = cki.i;
        final int[] l = cki.l;
        this.l = null;
        final String m = cki.m;
        this.m = m;
        final int k = cki.k;
        int i = 0;
        this.k = 0;
        if (m != null) {
            ((abp)abi).put((Object)m, (Object)this);
        }
        j.set(cki.j);
        for (ArrayList b = cki.b; i < b.size(); ++i) {
            final Object value = b.get(i);
            if (value instanceof cki) {
                cki = (cki)value;
                this.b.add(new cki(cki, abi));
            }
            else {
                Object o;
                if (value instanceof ckh) {
                    o = new ckh((ckh)value);
                }
                else {
                    if (!(value instanceof ckg)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    o = new ckg((ckg)value);
                }
                this.b.add(o);
                final String n = ((ckj)o).n;
                if (n != null) {
                    ((abp)abi).put((Object)n, o);
                }
            }
        }
    }
    
    @Override
    public final boolean c() {
        for (int i = 0; i < this.b.size(); ++i) {
            if (((cjd)this.b.get(i)).c()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean d(final int[] array) {
        int i = 0;
        boolean b = false;
        while (i < this.b.size()) {
            b |= this.b.get(i).d(array);
            ++i;
        }
        return b;
    }
    
    public String getGroupName() {
        return this.m;
    }
    
    public Matrix getLocalMatrix() {
        return this.j;
    }
    
    public float getPivotX() {
        return this.d;
    }
    
    public float getPivotY() {
        return this.e;
    }
    
    public float getRotation() {
        return this.c;
    }
    
    public float getScaleX() {
        return this.f;
    }
    
    public float getScaleY() {
        return this.g;
    }
    
    public float getTranslateX() {
        return this.h;
    }
    
    public float getTranslateY() {
        return this.i;
    }
    
    public final void n() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }
    
    public void setPivotX(final float d) {
        if (d != this.d) {
            this.d = d;
            this.n();
        }
    }
    
    public void setPivotY(final float e) {
        if (e != this.e) {
            this.e = e;
            this.n();
        }
    }
    
    public void setRotation(final float c) {
        if (c != this.c) {
            this.c = c;
            this.n();
        }
    }
    
    public void setScaleX(final float f) {
        if (f != this.f) {
            this.f = f;
            this.n();
        }
    }
    
    public void setScaleY(final float g) {
        if (g != this.g) {
            this.g = g;
            this.n();
        }
    }
    
    public void setTranslateX(final float h) {
        if (h != this.h) {
            this.h = h;
            this.n();
        }
    }
    
    public void setTranslateY(final float i) {
        if (i != this.i) {
            this.i = i;
            this.n();
        }
    }
}
