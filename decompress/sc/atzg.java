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

public final class atzg implements aexu, rcw
{
    public final Object a;
    public ByteBuffer b;
    public boolean c;
    public final atzf d;
    public final rcy e;
    public volatile Optional f;
    public final AtomicBoolean g;
    public final gpj h;
    public final gpj i;
    
    public atzg(final Context context, final Uri uri, final atzf d) {
        this.a = new Object();
        this.f = Optional.empty();
        this.h = new gpj((byte[])null);
        this.i = new gpj((byte[])null);
        this.g = new AtomicBoolean(false);
        this.d = d;
        final int h = rcy.h;
        context.getClass();
        uri.getClass();
        this.e = new rcy(context, uri, (bnw)new bnj(context), new bei(context), (rcw)this);
        this.b = ByteBuffer.allocateDirect(0);
    }
    
    public final void a() {
        synchronized (this.a) {
            this.c = true;
            this.h.e();
        }
    }
    
    public final ahao b(final aqrz aqrz) {
        this.b = ByteBuffer.allocateDirect(aqrz.b);
        final rcy e = this.e;
        e.a((Runnable)new qrd(e, 12));
        return ahao.a;
    }
    
    public final ahao c(final aqsf aqsf) {
        this.h();
        final rcy e = this.e;
        final Duration ofNanos = Duration.ofNanos(aqsf.b * 1000L);
        e.d.set(true);
        e.a((Runnable)new rcu(e, ofNanos, 0));
        return ahao.a;
    }
    
    public final ahao d() {
        final rcy e = this.e;
        e.a((Runnable)new qrd(e.a, 11));
        return ahao.a;
    }
    
    public final aqry e() {
        try {
            this.i.c(2L);
            if (!this.i.d()) {
                return aqry.a;
            }
            final ahaz builder = ((ahbh)aqry.a).createBuilder();
            final int a = ((ayg)this.f.get()).A;
            builder.copyOnWrite();
            final aqry aqry = (aqry)builder.instance;
            aqry.b |= 0x1;
            aqry.c = a;
            final int b = ((ayg)this.f.get()).B;
            builder.copyOnWrite();
            final aqry aqry2 = (aqry)builder.instance;
            aqry2.b |= 0x2;
            aqry2.d = b;
            return (aqry)builder.build();
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new StatusException(agup.b, ex.toString());
        }
    }
    
    public final aqse f() {
        try {
            this.h.c(2L);
            if (!this.h.d()) {
                return aqse.a;
            }
            synchronized (this.a) {
                this.b.flip();
                final ahaz builder = ((ahbh)aqse.a).createBuilder();
                final ahab w = ahab.w(this.b);
                builder.copyOnWrite();
                final aqse aqse = (aqse)builder.instance;
                aqse.b |= 0x1;
                aqse.c = w;
                final boolean c = this.c;
                builder.copyOnWrite();
                final aqse aqse2 = (aqse)builder.instance;
                aqse2.b |= 0x2;
                aqse2.d = c;
                final aqse aqse3 = (aqse)builder.build();
                this.h.f();
                this.b.compact();
                this.c = false;
                return aqse3;
            }
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new StatusException(agup.b, ex.toString());
        }
    }
    
    public final aqsg g() {
        final ahaz builder = ((ahbh)aqsg.a).createBuilder();
        final boolean andSet = this.g.getAndSet(false);
        builder.copyOnWrite();
        final aqsg aqsg = (aqsg)builder.instance;
        aqsg.b |= 0x1;
        aqsg.c = andSet;
        return (aqsg)builder.build();
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
