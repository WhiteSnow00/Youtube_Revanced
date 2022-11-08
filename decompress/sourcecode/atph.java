// 
// Decompiled by Procyon v0.6.0
// 

public final class atph extends atrd
{
    public final atpe a;
    
    public atph(final atpe a) {
        this.a = a;
    }
    
    public final void a(final Throwable t) {
        final atpe a = this.a;
        final Throwable m = a.m((atrb)((atrf)this).e());
        Label_0094: {
            if (a.u()) {
                final atup atup = (atup)a.a;
                final atou f = atup.f;
                while (true) {
                    final Object a2 = f.a;
                    if (atnh.c(a2, atuq.b)) {
                        if (atup.f.d((Object)atuq.b, (Object)m)) {
                            break;
                        }
                        continue;
                    }
                    else {
                        if (a2 instanceof Throwable) {
                            break;
                        }
                        if (atup.f.d(a2, (Object)null)) {
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
}
