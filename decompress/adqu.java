import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

final class adqu implements admy
{
    final adqw a;
    
    public adqu(final adqw a) {
        this.a = a;
    }
    
    @Override
    public final void a(String g, String s, final anpn anpn) {
        final adqw a = this.a;
        g = (String)a.g;
        monitorenter(g);
        if (s == null) {
            return;
        }
        try {
            if (!a.g.containsKey(s)) {
                return;
            }
            s = (String)((Pair)a.g.get(s)).first;
            a.f.d(s, anpn);
        }
        finally {
            monitorexit(g);
        }
    }
    
    @Override
    public final void b(final String s, final String s2, final aovx aovx) {
    }
    
    @Override
    public final void c(final String s, final String s2, final apja apja) {
    }
    
    @Override
    public final void d(String g, final String s, final apkx apkx) {
        final adqw a = this.a;
        g = (String)a.g;
        monitorenter(g);
        if (s == null) {
            return;
        }
        try {
            if (!a.g.containsKey(s)) {
                return;
            }
            final String s2 = (String)a.g.get(s).first;
            try {
                a.c.a(s2, (admm)new adqv(a.d, apkx));
            }
            catch (final admk admk) {
                a.i.D("UploadFeedbackTask JobStorageException", (Throwable)admk);
            }
            final int ar = aqvq.ar(apkx.c);
            if (ar != 0) {
                if (ar != 1) {
                    a.s(s, a.e.n());
                }
            }
        }
        finally {
            monitorexit(g);
        }
    }
    
    @Override
    public final void e(final String s) {
        final adqw a = this.a;
        if (s == null) {
            return;
        }
        a.s(s, a.e.n());
    }
    
    @Override
    public final void f(final String s, final Exception ex) {
        final adqw a = this.a;
        a.i.D("Polling finished with error.", (Throwable)ex);
        if (s == null) {
            return;
        }
        a.s(s, a.e.m(apkh.e));
    }
    
    @Override
    public final void g() {
    }
}
