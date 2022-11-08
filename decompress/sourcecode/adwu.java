import android.graphics.Path;
import java.util.Collection;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwu
{
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    public final List f;
    private final List g;
    
    public adwu() {
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.e();
    }
    
    private final void g(final float d) {
        final float d2 = this.d;
        if (d2 != d) {
            final float f = (d - d2 + 360.0f) % 360.0f;
            if (f > 180.0f) {
                return;
            }
            final float b = this.b;
            final float c = this.c;
            final adwq adwq = new adwq(b, c, b, c);
            adwq.e = this.d;
            adwq.f = f;
            this.g.add(new adwo(adwq));
            this.d = d;
        }
    }
    
    final adwt a(Matrix matrix) {
        this.g(this.e);
        matrix = new Matrix(matrix);
        return (adwt)new adwn((List)new ArrayList(this.g), matrix);
    }
    
    public final void b(final adwt adwt, final float n, final float d) {
        this.g(n);
        this.g.add(adwt);
        this.d = d;
    }
    
    public final void c(final Matrix matrix, final Path path) {
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            ((adws)this.f.get(i)).a(matrix, path);
        }
    }
    
    public final void d(final float n, final float n2) {
        final adwr adwr = new adwr();
        adwr.a = n;
        adwr.b = n2;
        this.f.add(adwr);
        final adwp adwp = new adwp(adwr, this.b, this.c);
        this.b((adwt)adwp, adwp.b() + 270.0f, adwp.b() + 270.0f);
        this.b = n;
        this.c = n2;
    }
    
    public final void e() {
        this.f(0.0f, 270.0f, 0.0f);
    }
    
    public final void f(final float n, final float d, final float n2) {
        this.a = n;
        this.b = 0.0f;
        this.c = n;
        this.d = d;
        this.e = (d + n2) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
