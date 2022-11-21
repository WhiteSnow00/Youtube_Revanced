import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adik extends adia
{
    private boolean a;
    private final arna b;
    
    public adik(final arna b) {
        this.a = false;
        this.b = b;
    }
    
    public final void f(final aotm aotm) {
        aotl aotl;
        if ((aotl = aotm.e) == null) {
            aotl = aotl.a;
        }
        final boolean b = aotl.b;
        boolean a = false;
        Label_0104: {
            if (b) {
                if (!aotl.c && !aotl.e && !aotl.f && !aotl.g && !aotl.p && !aotl.n && !aotl.o) {
                    a = a;
                    if (!aotl.r) {
                        break Label_0104;
                    }
                }
                a = true;
            }
        }
        if (!(this.a = a)) {
            return;
        }
        final qbs qbs = (qbs)this.b.a();
        if (aotl.f) {
            qbs.a.c();
        }
        if (aotl.c) {
            aotd aotd;
            if ((aotd = aotm.k) == null) {
                aotd = aotd.a;
            }
            if (aotd.b == 0) {
                qbs.a.b();
            }
        }
    }
    
    public final boolean g() {
        return this.a;
    }
    
    public final boolean h(final Context context, final ahcr ahcr) {
        return false;
    }
}
