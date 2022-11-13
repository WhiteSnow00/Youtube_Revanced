import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

final class adpg implements adlj
{
    final adpi a;
    
    public adpg(final adpi a) {
        this.a = a;
    }
    
    public final void a(String g, String s, final annh annh) {
        final adpi a = this.a;
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
            a.f.d(s, annh);
        }
        finally {
            monitorexit(g);
        }
    }
    
    public final void b(final String s, final String s2, final aotl aotl) {
    }
    
    public final void c(final String s, final String s2, final apgo apgo) {
    }
    
    public final void d(String g, final String s, final apil apil) {
        final adpi a = this.a;
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
                a.c.a(s2, (adkx)new adph(a.d, apil));
            }
            catch (final adkv adkv) {
                a.i.h("UploadFeedbackTask JobStorageException", (Throwable)adkv);
            }
            final int az = aqsx.az(apil.c);
            if (az != 0) {
                if (az != 1) {
                    a.s(s, a.e.s());
                }
            }
        }
        finally {
            monitorexit(g);
        }
    }
    
    public final void e(final String s) {
        final adpi a = this.a;
        if (s == null) {
            return;
        }
        a.s(s, a.e.s());
    }
    
    public final void f(final String s, final Exception ex) {
        final adpi a = this.a;
        a.i.h("Polling finished with error.", ex);
        if (s == null) {
            return;
        }
        a.s(s, a.e.r(aphv.e));
    }
    
    public final void g() {
    }
}
