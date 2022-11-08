import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.function.Function;
import java.util.function.Consumer;
import j$.util.Optional;
import android.util.SparseBooleanArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqa
{
    public boolean a;
    private final abno b;
    private final fno c;
    private final atje d;
    private final SparseBooleanArray e;
    private int f;
    private final arud g;
    private final cya h;
    
    public hqa(final abno b, final fno c, final cya h, final arud g, final Optional optional, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = new SparseBooleanArray();
        this.b = b;
        this.c = c;
        this.h = h;
        this.g = g;
        this.d = ((atje)atir.e()).aX();
        optional.ifPresent((Consumer)new hnr(this, 11));
    }
    
    private final boolean f() {
        return this.a || this.c.b == fnl.b;
    }
    
    public final int a() {
        if (!this.f()) {
            return 0;
        }
        this.d.tr((Object)true);
        this.b.a();
        final SparseBooleanArray e = this.e;
        monitorenter(e);
        try {
            int n;
            do {
                final int f = this.f + 1;
                this.f = f;
                if ((n = f) == Integer.MAX_VALUE) {
                    this.f = 1;
                    n = 1;
                }
            } while (this.e.get(n));
            this.e.put(this.f, true);
            final int f2 = this.f;
            monitorexit(e);
            return f2;
        }
        finally {
            monitorexit(e);
            while (true) {}
        }
    }
    
    public final int b() {
        anqh anqh;
        if ((anqh = this.g.f().u) == null) {
            anqh = anqh.a;
        }
        anqt anqt;
        if ((anqt = anqh.d) == null) {
            anqt = anqt.a;
        }
        if (anqt.z && (boolean)((hnj)this.h.a).a().map((Function)hns.j).orElse((Object)false)) {
            return 0;
        }
        return this.a();
    }
    
    public final void c(final int n) {
        Object o = this.e;
        monitorenter(o);
        if (n == 0) {
            return;
        }
        try {
            if (!this.e.get(n)) {
                return;
            }
            this.e.delete(n);
            if (this.e.size() == 0 && this.f()) {
                monitorexit(o);
                this.d.tr((Object)false);
                o = this.b.q();
                if (o != null) {
                    o = ((abtt)o).d();
                    if (o != null && ((PlayerResponseModel)o).T()) {
                        this.b.aa(0L);
                    }
                }
                this.b.D();
            }
        }
        finally {
            monitorexit(o);
        }
    }
    
    public final void d() {
        synchronized (this.e) {
            this.d.tr((Object)false);
            this.e.clear();
        }
    }
    
    public final boolean e() {
        synchronized (this.e) {
            return this.e.size() > 0;
        }
    }
}
