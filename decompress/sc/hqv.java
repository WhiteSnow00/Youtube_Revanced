import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.function.Function;
import java.util.function.Consumer;
import j$.util.Optional;
import android.util.SparseBooleanArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqv
{
    public boolean a;
    private final abpq b;
    private final fnt c;
    private final atjz d;
    private final SparseBooleanArray e;
    private int f;
    private final arwh g;
    private final cyb h;
    
    public hqv(final abpq b, final fnt c, final cyb h, final arwh g, final Optional optional, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = new SparseBooleanArray();
        this.b = b;
        this.c = c;
        this.h = h;
        this.g = g;
        this.d = ((atjz)atjm.e()).bc();
        optional.ifPresent((Consumer)new hoa(this, 12));
    }
    
    private final boolean f() {
        return this.a || this.c.b == fnq.b;
    }
    
    public final int a() {
        if (!this.f()) {
            return 0;
        }
        this.d.tu((Object)true);
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
        ansk ansk;
        if ((ansk = this.g.f().u) == null) {
            ansk = ansk.a;
        }
        answ answ;
        if ((answ = ansk.d) == null) {
            answ = answ.a;
        }
        if (answ.z && (boolean)((hof)this.h.a).a().map((Function)hon.j).orElse((Object)false)) {
            return 0;
        }
        return this.a();
    }
    
    public final void c(final int n) {
        final SparseBooleanArray e = this.e;
        monitorenter(e);
        if (n == 0) {
            return;
        }
        try {
            if (!this.e.get(n)) {
                return;
            }
            this.e.delete(n);
            if (this.e.size() == 0 && this.f()) {
                monitorexit(e);
                this.d.tu((Object)false);
                final abvx q = this.b.q();
                if (q != null) {
                    final PlayerResponseModel d = q.d();
                    if (d != null && d.T()) {
                        this.b.Z(0L);
                    }
                }
                this.b.C();
            }
        }
        finally {
            monitorexit(e);
        }
    }
    
    public final void d() {
        synchronized (this.e) {
            this.d.tu((Object)false);
            this.e.clear();
        }
    }
    
    public final boolean e() {
        synchronized (this.e) {
            return this.e.size() > 0;
        }
    }
}
