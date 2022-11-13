import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aemt
{
    public Class a;
    public cmf b;
    public aemu c;
    public cmi d;
    public aezp e;
    private aezp f;
    private aezp g;
    private afft h;
    private aezp i;
    private aezp j;
    
    public aemt() {
    }
    
    public aemt(final aemw aemw) {
        final aeyo a = aeyo.a;
        this.f = (aezp)a;
        this.g = (aezp)a;
        this.e = (aezp)a;
        this.i = (aezp)a;
        this.j = (aezp)a;
        this.a = aemw.a;
        this.b = aemw.b;
        this.f = aemw.c;
        this.c = aemw.d;
        this.d = aemw.e;
        this.g = aemw.f;
        this.e = aemw.g;
        this.h = aemw.h;
        this.i = aemw.i;
        this.j = aemw.j;
    }
    
    public aemt(final byte[] array) {
        final aeyo a = aeyo.a;
        this.f = (aezp)a;
        this.g = (aezp)a;
        this.e = (aezp)a;
        this.i = (aezp)a;
        this.j = (aezp)a;
    }
    
    public final aemw a() {
        final Class a = this.a;
        if (a != null) {
            final cmf b = this.b;
            if (b != null) {
                final aemu c = this.c;
                if (c != null) {
                    final cmi d = this.d;
                    if (d != null) {
                        final afft h = this.h;
                        if (h != null) {
                            return new aemw(a, b, this.f, c, d, this.g, this.e, h, this.i, this.j);
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" workerClass");
        }
        if (this.b == null) {
            sb.append(" constraints");
        }
        if (this.c == null) {
            sb.append(" initialDelay");
        }
        if (this.d == null) {
            sb.append(" inputData");
        }
        if (this.h == null) {
            sb.append(" tags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final Set set) {
        this.h = afft.p((Collection)set);
    }
}
