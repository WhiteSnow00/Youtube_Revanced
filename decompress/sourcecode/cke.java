import java.util.ArrayList;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

final class cke extends ciw
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
    
    public cke() {
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
    
    public cke(cke cke, final abg abg) {
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
        this.c = cke.c;
        this.d = cke.d;
        this.e = cke.e;
        this.f = cke.f;
        this.g = cke.g;
        this.h = cke.h;
        this.i = cke.i;
        final int[] l = cke.l;
        this.l = null;
        final String m = cke.m;
        this.m = m;
        final int k = cke.k;
        int i = 0;
        this.k = 0;
        if (m != null) {
            ((abn)abg).put((Object)m, (Object)this);
        }
        j.set(cke.j);
        for (ArrayList b = cke.b; i < b.size(); ++i) {
            final Object value = b.get(i);
            if (value instanceof cke) {
                cke = (cke)value;
                this.b.add(new cke(cke, abg));
            }
            else {
                Object o;
                if (value instanceof ckd) {
                    o = new ckd((ckd)value);
                }
                else {
                    if (!(value instanceof ckc)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    o = new ckc((ckc)value);
                }
                this.b.add(o);
                final String n = ((ckf)o).n;
                if (n != null) {
                    ((abn)abg).put((Object)n, o);
                }
            }
        }
    }
    
    public final boolean b() {
        for (int i = 0; i < this.b.size(); ++i) {
            if (((ciw)this.b.get(i)).b()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean c(final int[] array) {
        int i = 0;
        boolean b = false;
        while (i < this.b.size()) {
            b |= this.b.get(i).c(array);
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
    
    public final void m() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }
    
    public void setPivotX(final float d) {
        if (d != this.d) {
            this.d = d;
            this.m();
        }
    }
    
    public void setPivotY(final float e) {
        if (e != this.e) {
            this.e = e;
            this.m();
        }
    }
    
    public void setRotation(final float c) {
        if (c != this.c) {
            this.c = c;
            this.m();
        }
    }
    
    public void setScaleX(final float f) {
        if (f != this.f) {
            this.f = f;
            this.m();
        }
    }
    
    public void setScaleY(final float g) {
        if (g != this.g) {
            this.g = g;
            this.m();
        }
    }
    
    public void setTranslateX(final float h) {
        if (h != this.h) {
            this.h = h;
            this.m();
        }
    }
    
    public void setTranslateY(final float i) {
        if (i != this.i) {
            this.i = i;
            this.m();
        }
    }
}
