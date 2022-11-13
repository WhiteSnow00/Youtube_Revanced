// 
// Decompiled by Procyon v0.6.0
// 

final class cti extends ctb
{
    public cti() {
    }
    
    public final void a(final ctj ctj, final ctj c) {
        ctj.c = c;
    }
    
    public final void b(final ctj ctj, final Thread b) {
        ctj.b = b;
    }
    
    public final boolean c(final ctk ctk, final ctf ctf, final ctf e) {
        synchronized (ctk) {
            if (ctk.e == ctf) {
                ctk.e = e;
                return true;
            }
            return false;
        }
    }
    
    public final boolean d(final ctk ctk, final Object o, final Object d) {
        synchronized (ctk) {
            if (ctk.d == o) {
                ctk.d = d;
                return true;
            }
            return false;
        }
    }
    
    public final boolean e(final ctk ctk, final ctj ctj, final ctj f) {
        synchronized (ctk) {
            if (ctk.f == ctj) {
                ctk.f = f;
                return true;
            }
            return false;
        }
    }
}
