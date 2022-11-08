import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeks
{
    public Class a;
    public cme b;
    public aekt c;
    public cmh d;
    public aexq e;
    private aexq f;
    private aexq g;
    private afdu h;
    private aexq i;
    private aexq j;
    
    public aeks() {
    }
    
    public aeks(final aekv aekv) {
        final aewp a = aewp.a;
        this.f = (aexq)a;
        this.g = (aexq)a;
        this.e = (aexq)a;
        this.i = (aexq)a;
        this.j = (aexq)a;
        this.a = aekv.a;
        this.b = aekv.b;
        this.f = aekv.c;
        this.c = aekv.d;
        this.d = aekv.e;
        this.g = aekv.f;
        this.e = aekv.g;
        this.h = aekv.h;
        this.i = aekv.i;
        this.j = aekv.j;
    }
    
    public aeks(final byte[] array) {
        final aewp a = aewp.a;
        this.f = (aexq)a;
        this.g = (aexq)a;
        this.e = (aexq)a;
        this.i = (aexq)a;
        this.j = (aexq)a;
    }
    
    public final aekv a() {
        final Class a = this.a;
        if (a != null) {
            final cme b = this.b;
            if (b != null) {
                final aekt c = this.c;
                if (c != null) {
                    final cmh d = this.d;
                    if (d != null) {
                        final afdu h = this.h;
                        if (h != null) {
                            return new aekv(a, b, this.f, c, d, this.g, this.e, h, this.i, this.j);
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
        this.h = afdu.p((Collection)set);
    }
}
