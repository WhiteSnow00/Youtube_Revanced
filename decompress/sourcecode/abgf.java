import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abgf
{
    private yoa a;
    private final Set b;
    private final Set c;
    private String d;
    private long e;
    private long f;
    
    public abgf() {
        this.a = null;
        this.b = new HashSet();
        this.c = new HashSet();
    }
    
    private final void d() {
        synchronized (this) {
            final yoa a = this.a;
            if (a != null) {
                a.b();
                this.a = null;
                this.d = null;
            }
            this.e = -1L;
            this.f = -1L;
        }
    }
    
    public final void a(final aakb aakb, final abxq abxq) {
        synchronized (this) {
            final aajz d = aakb.d();
            if (d == null) {
                return;
            }
            final String d2 = ((yob)d.a).d("Cuepoint-Identifier");
            final yni a = d.a();
            Label_0322: {
                if (d2 != null && a != null) {
                    Label_0081: {
                        int b;
                        if ((b = a.b) == 0) {
                            if (a.c >= 0L) {
                                break Label_0081;
                            }
                            b = 0;
                        }
                        if (b != 1 && b != 2) {
                            break Label_0322;
                        }
                    }
                    if (aakb.e() != null || abxq.j.contains(d2)) {
                        this.d();
                        return;
                    }
                    if (abxq.n(aakb.c()) != null) {
                        if (aakb.h()) {
                            if (aakb.b() == this.f) {
                                this.e = -1L;
                                return;
                            }
                            this.f = aakb.b();
                            throw new yoa(0);
                        }
                        else {
                            if (!aakb.g()) {
                                return;
                            }
                            if (aakb.b() == this.e) {
                                this.e = -1L;
                                return;
                            }
                            this.e = aakb.b();
                            throw new yoa(0);
                        }
                    }
                    else {
                        if (this.b.contains(d2)) {
                            if (this.b.contains(d2) && d2.equals(this.d)) {
                                final yoa a2 = this.a;
                                if (a2 != null) {
                                    if (a2.c()) {
                                        throw a2;
                                    }
                                }
                            }
                            return;
                        }
                        this.b.add(d2);
                        final yoa a3 = new yoa(5000);
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
            final yoa a = this.a;
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
