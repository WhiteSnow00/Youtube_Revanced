// 
// Decompiled by Procyon v0.6.0
// 

public final class fdh implements zku
{
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;
    
    public fdh(final fcq c, final aioe b, final Object a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fdh(final fdj c, final aioe b, final Object a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fdh(final lll c, final almd b, final String a, final int d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
    }
    
    public final void b() {
        final int d = this.d;
        if (d != 0) {
            if (d != 1) {
                ((lll)this.c).d((almd)this.b, (String)this.a, uyp.b);
                return;
            }
            ((fcq)this.c).d((aioe)this.b, this.a, true);
        }
        else {
            try {
                ((fdj)this.c).b((aioe)this.b, this.a);
            }
            catch (final vbh vbh) {
                ((fdj)this.c).b.e((Throwable)vbh);
            }
        }
    }
    
    public final void c(final Exception ex) {
        final int d = this.d;
        if (d == 0) {
            ((fdj)this.c).b.e((Throwable)ex);
            return;
        }
        if (d != 1) {
            ((tny)((lll)this.c).a).e((Throwable)ex);
            return;
        }
        ((fcq)this.c).a.e((Throwable)ex);
    }
}
