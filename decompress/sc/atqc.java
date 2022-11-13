// 
// Decompiled by Procyon v0.6.0
// 

public final class atqc extends atry
{
    public final atpz a;
    
    public atqc(final atpz a) {
        this.a = a;
    }
    
    public final void a(final Throwable t) {
        final atpz a = this.a;
        final Throwable m = a.m((atrw)((atsa)this).e());
        Label_0094: {
            if (a.u()) {
                final atvm atvm = (atvm)a.a;
                final atpp f = atvm.f;
                while (true) {
                    final Object a2 = f.a;
                    if (atoc.c(a2, (Object)atvn.b)) {
                        if (atvm.f.d((Object)atvn.b, (Object)m)) {
                            break;
                        }
                        continue;
                    }
                    else {
                        if (a2 instanceof Throwable) {
                            break;
                        }
                        if (atvm.f.d(a2, (Object)null)) {
                            break Label_0094;
                        }
                        continue;
                    }
                }
                return;
            }
        }
        a.c(m);
        a.s();
    }
    
    public final /* bridge */ Object invoke(final Object o) {
        this.a((Throwable)o);
        return atkq.a;
    }
}
