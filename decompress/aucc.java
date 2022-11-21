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

public final class aucc implements aezl, rdw
{
    public final Object a;
    public ByteBuffer b;
    public boolean c;
    public final aucb d;
    public final rdy e;
    public volatile Optional f;
    public final AtomicBoolean g;
    public final gpo h;
    public final gpo i;
    
    public aucc(final Context context, final Uri uri, final aucb d) {
        this.a = new Object();
        this.f = Optional.empty();
        this.h = new gpo((byte[])null);
        this.i = new gpo((byte[])null);
        this.g = new AtomicBoolean(false);
        this.d = d;
        final int h = rdy.h;
        context.getClass();
        uri.getClass();
        this.e = new rdy(context, uri, (bnz)new bnm(context), new bek(context), (rdw)this);
        this.b = ByteBuffer.allocateDirect(0);
    }
    
    public final void a() {
        synchronized (this.a) {
            this.c = true;
            this.h.e();
        }
    }
    
    @Override
    public final ahcg b(final aqus aqus) {
        this.b = ByteBuffer.allocateDirect(aqus.b);
        final rdy e = this.e;
        e.a((Runnable)new qyh(e, 9));
        return ahcg.a;
    }
    
    @Override
    public final ahcg c(final aquy aquy) {
        this.h();
        final rdy e = this.e;
        final Duration ofNanos = Duration.ofNanos(aquy.b * 1000L);
        e.d.set(true);
        e.a((Runnable)new rae(e, ofNanos, 4));
        return ahcg.a;
    }
    
    @Override
    public final ahcg d() {
        final rdy e = this.e;
        e.a((Runnable)new qyh(e.a, 8));
        return ahcg.a;
    }
    
    @Override
    public final aqur e() {
        try {
            this.i.c(2L);
            if (!this.i.d()) {
                return aqur.a;
            }
            final ahcr builder = aqur.a.createBuilder();
            final int a = ((ayh)this.f.get()).A;
            builder.copyOnWrite();
            final aqur aqur = (aqur)builder.instance;
            aqur.b |= 0x1;
            aqur.c = a;
            final int b = ((ayh)this.f.get()).B;
            builder.copyOnWrite();
            final aqur aqur2 = (aqur)builder.instance;
            aqur2.b |= 0x2;
            aqur2.d = b;
            return (aqur)builder.build();
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new StatusException(agwh.b, ex.toString());
        }
    }
    
    @Override
    public final aqux f() {
        try {
            this.h.c(2L);
            if (!this.h.d()) {
                return aqux.a;
            }
            synchronized (this.a) {
                this.b.flip();
                final ahcr builder = aqux.a.createBuilder();
                final ahbt w = ahbt.w(this.b);
                builder.copyOnWrite();
                final aqux aqux = (aqux)builder.instance;
                aqux.b |= 0x1;
                aqux.c = w;
                final boolean c = this.c;
                builder.copyOnWrite();
                final aqux aqux2 = (aqux)builder.instance;
                aqux2.b |= 0x2;
                aqux2.d = c;
                final aqux aqux3 = (aqux)builder.build();
                this.h.f();
                this.b.compact();
                this.c = false;
                return aqux3;
            }
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new StatusException(agwh.b, ex.toString());
        }
    }
    
    @Override
    public final aquz g() {
        final ahcr builder = aquz.a.createBuilder();
        final boolean andSet = this.g.getAndSet(false);
        builder.copyOnWrite();
        final aquz aquz = (aquz)builder.instance;
        aquz.b |= 0x1;
        aquz.c = andSet;
        return (aquz)builder.build();
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
