import android.os.Message;
import androidx.media3.common.Metadata$Entry;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.util.List;
import android.os.Looper;
import androidx.media3.common.Metadata;
import android.os.Handler;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmq extends bdx implements Handler$Callback
{
    private final bmo d;
    private final bmp e;
    private final Handler f;
    private final bvf g;
    private bve h;
    private boolean i;
    private boolean j;
    private long k;
    private Metadata l;
    private long m;
    
    public bmq(final bmp e, final Looper looper) {
        final bmo a = bmo.a;
        super(5);
        dk.d((Object)e);
        this.e = e;
        Handler d;
        if (looper == null) {
            d = null;
        }
        else {
            d = bax.D(looper, (Handler$Callback)this);
        }
        this.f = d;
        this.d = a;
        this.g = new bvf();
        this.m = -9223372036854775807L;
    }
    
    private final long b(final long n) {
        final boolean b = true;
        dk.h(n != -9223372036854775807L);
        dk.h(this.m != -9223372036854775807L && b);
        return n - this.m;
    }
    
    private final void c(final Metadata metadata, final List list) {
        for (int i = 0; i < metadata.a(); ++i) {
            final ayg a = metadata.b(i).a();
            if (a != null && this.d.b(a)) {
                final bve a2 = this.d.a(a);
                final byte[] array = (byte[])dk.d((Object)metadata.b(i).c());
                ((bcw)this.g).clear();
                ((bdc)this.g).b(array.length);
                final ByteBuffer c = this.g.c;
                final int a3 = bax.a;
                c.put(array);
                ((bdc)this.g).c();
                final Metadata a4 = a2.a(this.g);
                if (a4 != null) {
                    this.c(a4, list);
                }
            }
            else {
                list.add(metadata.b(i));
            }
        }
    }
    
    private final void e(final Metadata metadata) {
        final beu beu = (beu)this.e;
        final bex a = beu.a;
        final ayw a2 = a.F.a();
        for (int i = 0; i < metadata.a(); ++i) {
            metadata.b(i).b(a2);
        }
        a.F = a2.a();
        final ayx t = beu.a.T();
        if (!t.equals((Object)beu.a.t)) {
            final bex a3 = beu.a;
            a3.t = t;
            a3.J.j(14, (bam)new bem(beu, 14));
        }
        beu.a.J.j(28, (bam)new bem(metadata, 15));
        beu.a.J.i();
    }
    
    protected final void C(final ayg[] array, long b, final long m) {
        this.h = this.d.a(array[0]);
        final Metadata l = this.l;
        if (l != null) {
            b = l.b;
            final long n = this.m + b - m;
            Metadata i = l;
            if (b != n) {
                i = new Metadata(n, l.a);
            }
            this.l = i;
        }
        this.m = m;
    }
    
    public final void R(final long n, final long n2) {
        int i;
        do {
            final boolean j = this.i;
            final int n3 = 0;
            if (!j && this.l == null) {
                ((bcw)this.g).clear();
                final bxc q = this.Q();
                final int p2 = this.P(q, (bdc)this.g, 0);
                if (p2 == -4) {
                    if (((bcw)this.g).isEndOfStream()) {
                        this.i = true;
                    }
                    else {
                        final bvf g = this.g;
                        g.g = this.k;
                        ((bdc)g).c();
                        final bve h = this.h;
                        final int a = bax.a;
                        final Metadata a2 = h.a(this.g);
                        if (a2 != null) {
                            final ArrayList list = new ArrayList(a2.a());
                            this.c(a2, list);
                            if (!list.isEmpty()) {
                                this.l = new Metadata(this.b(this.g.e), (Metadata$Entry[])list.toArray((Object[])new Metadata$Entry[0]));
                            }
                        }
                    }
                }
                else if (p2 == -5) {
                    final ayg a3 = q.a;
                    dk.d((Object)a3);
                    this.k = a3.r;
                }
            }
            final Metadata l = this.l;
            i = n3;
            if (l != null) {
                i = n3;
                if (l.b <= this.b(n)) {
                    final Metadata k = this.l;
                    final Handler f = this.f;
                    if (f != null) {
                        f.obtainMessage(0, (Object)k).sendToTarget();
                    }
                    else {
                        this.e(k);
                    }
                    this.l = null;
                    i = 1;
                }
            }
            if (this.i && this.l == null) {
                this.j = true;
            }
        } while (i != 0);
    }
    
    public final boolean S() {
        return this.j;
    }
    
    public final boolean T() {
        return true;
    }
    
    public final int a(final ayg ayg) {
        if (this.d.b(ayg)) {
            int n;
            if (ayg.G == 0) {
                n = 4;
            }
            else {
                n = 2;
            }
            return ber.b(n);
        }
        return ber.b(0);
    }
    
    public final String d() {
        return "MetadataRenderer";
    }
    
    public final boolean handleMessage(final Message message) {
        if (message.what == 0) {
            this.e((Metadata)message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
    
    protected final void w() {
        this.l = null;
        this.h = null;
        this.m = -9223372036854775807L;
    }
    
    protected final void y(final long n, final boolean b) {
        this.l = null;
        this.i = false;
        this.j = false;
    }
}
