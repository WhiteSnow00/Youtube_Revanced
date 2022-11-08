import com.google.android.libraries.blocks.StatusException;
import j$.time.Duration;
import android.net.Uri;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import j$.util.Optional;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyj implements aevu, rbd
{
    public final Object a;
    public ByteBuffer b;
    public boolean c;
    public final atyi d;
    public final rbf e;
    public volatile Optional f;
    public final AtomicBoolean g;
    public final gpd h;
    public final gpd i;
    
    public atyj(final Context context, final Uri uri, final atyi d) {
        this.a = new Object();
        this.f = Optional.empty();
        this.h = new gpd((byte[])null);
        this.i = new gpd((byte[])null);
        this.g = new AtomicBoolean(false);
        this.d = d;
        final int h = rbf.h;
        context.getClass();
        uri.getClass();
        this.e = new rbf(context, uri, (bnv)new bni(context), new beh(context), (rbd)this);
        this.b = ByteBuffer.allocateDirect(0);
    }
    
    public final void a() {
        synchronized (this.a) {
            this.c = true;
            this.h.e();
        }
    }
    
    public final agyp b(final aqpn aqpn) {
        this.b = ByteBuffer.allocateDirect(aqpn.b);
        final rbf e = this.e;
        e.a((Runnable)new qkb(e, 12));
        return agyp.a;
    }
    
    public final agyp c(final aqpt aqpt) {
        this.h();
        final rbf e = this.e;
        final Duration ofNanos = Duration.ofNanos(aqpt.b * 1000L);
        e.d.set(true);
        e.a((Runnable)new pxz(e, ofNanos, 20));
        return agyp.a;
    }
    
    public final agyp d() {
        final rbf e = this.e;
        e.a((Runnable)new qkb(e.a, 11));
        return agyp.a;
    }
    
    public final aqpm e() {
        try {
            this.i.c(2L);
            if (!this.i.d()) {
                return aqpm.a;
            }
            final agza builder = ((agzi)aqpm.a).createBuilder();
            final int a = ((ayf)this.f.get()).A;
            builder.copyOnWrite();
            final aqpm aqpm = (aqpm)builder.instance;
            aqpm.b |= 0x1;
            aqpm.c = a;
            final int b = ((ayf)this.f.get()).B;
            builder.copyOnWrite();
            final aqpm aqpm2 = (aqpm)builder.instance;
            aqpm2.b |= 0x2;
            aqpm2.d = b;
            return (aqpm)builder.build();
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new StatusException(agsq.b, ex.toString());
        }
    }
    
    public final aqps f() {
        try {
            this.h.c(2L);
            if (!this.h.d()) {
                return aqps.a;
            }
            synchronized (this.a) {
                this.b.flip();
                final agza builder = ((agzi)aqps.a).createBuilder();
                final agyc w = agyc.w(this.b);
                builder.copyOnWrite();
                final aqps aqps = (aqps)builder.instance;
                aqps.b |= 0x1;
                aqps.c = w;
                final boolean c = this.c;
                builder.copyOnWrite();
                final aqps aqps2 = (aqps)builder.instance;
                aqps2.b |= 0x2;
                aqps2.d = c;
                final aqps aqps3 = (aqps)builder.build();
                this.h.f();
                this.b.compact();
                this.c = false;
                return aqps3;
            }
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new StatusException(agsq.b, ex.toString());
        }
    }
    
    public final aqpu g() {
        final agza builder = ((agzi)aqpu.a).createBuilder();
        final boolean andSet = this.g.getAndSet(false);
        builder.copyOnWrite();
        final aqpu aqpu = (aqpu)builder.instance;
        aqpu.b |= 0x1;
        aqpu.c = andSet;
        return (aqpu)builder.build();
    }
    
    public final void h() {
        synchronized (this.a) {
            final ByteBuffer b = this.b;
            if (b == null) {
                return;
            }
            b.clear();
            this.h.f();
            this.c = false;
        }
    }
}
