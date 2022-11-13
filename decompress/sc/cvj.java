import android.graphics.Path$FillType;
import java.util.List;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvj implements cvf, cvm
{
    private final Path a;
    private final boolean b;
    private final cui c;
    private final cvr d;
    private boolean e;
    private final cya f;
    
    public cvj(final cui c, final cxp cxp, final cxl cxl) {
        this.a = new Path();
        this.f = new cya();
        this.b = cxl.b;
        this.c = c;
        final cvr a = cxl.a.a();
        cxp.h(this.d = a);
        a.g((cvm)this);
    }
    
    public final void d() {
        this.e = false;
        this.c.invalidateSelf();
    }
    
    public final void f(final List list, final List list2) {
        for (int i = 0; i < list.size(); ++i) {
            final cuv cuv = list.get(i);
            if (cuv instanceof cvl) {
                final cvl cvl = (cvl)cuv;
                if (cvl.e == 1) {
                    this.f.d(cvl);
                    cvl.a((cvm)this);
                }
            }
        }
    }
    
    public final String g() {
        throw null;
    }
    
    @Override
    public final Path i() {
        if (this.e) {
            return this.a;
        }
        this.a.reset();
        if (this.b) {
            this.e = true;
            return this.a;
        }
        this.a.set((Path)this.d.e());
        this.a.setFillType(Path$FillType.EVEN_ODD);
        this.f.e(this.a);
        this.e = true;
        return this.a;
    }
}
