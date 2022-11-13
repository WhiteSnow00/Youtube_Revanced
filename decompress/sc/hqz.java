import j$.util.Optional;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqz
{
    public final Executor a;
    public final String b;
    public antg c;
    public boolean d;
    public int e;
    public int f;
    public final qqr g;
    
    public hqz(final qqr g, final aun aun, final Executor a, final oby oby) {
        this.c = antg.a;
        this.g = g;
        this.a = a;
        this.b = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date(oby.c()));
        teu.n(aun, g.a(), (ttg)hid.m, (ttg)new hlo(this, 10));
    }
    
    public final void a(final antg c) {
        c.getClass();
        this.c = c;
    }
    
    public final boolean b() {
        return this.d() == 2;
    }
    
    public final void c() {
        if (this.d) {
            final antg c = this.c;
            if ((c.b & 0x2) != 0x0 && c.d > 0) {
                Optional.empty();
                return;
            }
        }
        ++this.e;
        Optional.of((Object)this.g.b((aezf)new ggp(this, 16), this.a));
    }
    
    public final int d() {
        final antg c = this.c;
        final int b = c.b;
        if ((b & 0x2) != 0x0) {
            if (c.d > 0) {
                if (this.d) {
                    return 4;
                }
            }
        }
        else if ((b & 0x1) == 0x0) {
            return 3;
        }
        if ((b & 0x1) != 0x0) {
            final int c2 = c.c;
            if (c2 == 0) {
                return 3;
            }
            if (c2 > 0 && this.e >= c2) {
                return 3;
            }
        }
        return 2;
    }
}
