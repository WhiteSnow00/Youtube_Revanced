import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abjh
{
    private yru a;
    private final Set b;
    private final Set c;
    private String d;
    private long e;
    private long f;
    
    public abjh() {
        this.a = null;
        this.b = new HashSet();
        this.c = new HashSet();
    }
    
    private final void d() {
        synchronized (this) {
            final yru a = this.a;
            if (a != null) {
                a.b();
                this.a = null;
                this.d = null;
            }
            this.e = -1L;
            this.f = -1L;
        }
    }
    
    public final void a(final aans aans, final acbc acbc) {
        synchronized (this) {
            final aanq d = aans.d();
            if (d == null) {
                return;
            }
            final String d2 = ((yrv)d.a).d("Cuepoint-Identifier");
            final yrc a = d.a();
            Label_0326: {
                if (d2 != null && a != null) {
                    Label_0085: {
                        int b;
                        if ((b = a.b) == 0) {
                            if (a.c >= 0L) {
                                break Label_0085;
                            }
                            b = 0;
                        }
                        if (b != 1 && b != 2) {
                            break Label_0326;
                        }
                    }
                    if (aans.e() != null || acbc.j.contains(d2)) {
                        this.d();
                        return;
                    }
                    if (acbc.n(aans.c()) != null) {
                        if (aans.h()) {
                            if (aans.b() == this.f) {
                                this.e = -1L;
                                return;
                            }
                            this.f = aans.b();
                            throw new yru(0);
                        }
                        else {
                            if (!aans.g()) {
                                return;
                            }
                            if (aans.b() == this.e) {
                                this.e = -1L;
                                return;
                            }
                            this.e = aans.b();
                            throw new yru(0);
                        }
                    }
                    else {
                        if (this.b.contains(d2)) {
                            if (this.b.contains(d2) && d2.equals(this.d)) {
                                final yru a2 = this.a;
                                if (a2 != null) {
                                    if (a2.c()) {
                                        throw a2;
                                    }
                                }
                            }
                            return;
                        }
                        this.b.add(d2);
                        final yru a3 = new yru(5000);
                        this.a = a3;
                        this.d = d2;
                        throw a3;
                    }
                }
            }
            this.d();
        }
    }
    
    public final void b() {
        synchronized (this) {
            final yru a = this.a;
            if (a != null) {
                if (!a.c()) {
                    final String d = this.d;
                    if (d != null && this.b.contains(d)) {
                        this.c.add(this.d);
                    }
                }
                this.d();
            }
        }
    }
    
    public final boolean c(final String s) {
        synchronized (this) {
            return this.c.contains(s);
        }
    }
}
