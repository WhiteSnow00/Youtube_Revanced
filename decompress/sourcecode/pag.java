// 
// Decompiled by Procyon v0.6.0
// 

public final class pag
{
    public final ozd a;
    public final paj b;
    public final oas c;
    public final paa d;
    public int e;
    public Runnable f;
    public Runnable g;
    
    public pag(final ozd a, final oas c) {
        this.d = (paa)new paf(this);
        this.e = 0;
        this.f = null;
        this.g = null;
        this.a = a;
        this.b = new paj();
        this.c = c;
    }
    
    public final void a() {
        this.f = null;
        final paj b = this.b;
        if (b.c.isEmpty() && b.a.isEmpty() && b.b.isEmpty() && b.e.isEmpty()) {
            return;
        }
        final aere o = aesw.o("GIL:AutoProcessBatch");
        try {
            this.a.b((ozc)new pae(this));
            o.close();
        }
        finally {
            try {
                o.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                nrw.J(t, t2);
            }
        }
    }
    
    public final void b() {
        if (this.f != null) {
            return;
        }
        final ovk f = new ovk(this, 8);
        this.f = f;
        final int e = this.e;
        if (e > 0) {
            qcj.t((Runnable)f, (long)e);
            return;
        }
        qcj.u((Runnable)f);
    }
}
