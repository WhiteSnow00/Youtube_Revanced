import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.Map;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.concurrent.Executor;
import android.os.Handler$Callback;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;
import android.os.Looper;
import java.util.HashMap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfr
{
    public final Object a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    private final Object g;
    
    public adfr(final Context c, final atjj g, final atjj d, final atjj e) {
        this.a = new Object();
        this.c = c;
        this.g = g;
        this.d = d;
        this.e = e;
        this.f = new HashMap();
    }
    
    public adfr(final Looper looper, final bac bac, final bam bam) {
        this(new CopyOnWriteArraySet(), looper, bac, bam);
    }
    
    public adfr(final CopyOnWriteArraySet e, final Looper looper, final bac f, final bam c) {
        this.f = f;
        this.e = e;
        this.c = c;
        this.g = new ArrayDeque();
        this.d = new ArrayDeque();
        this.a = f.b(looper, (Handler$Callback)new bnd(this, 1, (byte[])null, (byte[])null));
    }
    
    public adfr(final zki d, final daw f, final oas a, final Executor e, final uxy c, final vjl g) {
        this.d = d;
        this.f = f;
        this.a = a;
        this.e = e;
        this.c = c;
        this.g = g;
    }
    
    public final void a(final aooi aooi) {
        final agza builder = aooh.a.createBuilder();
        if (aooi != null) {
            builder.copyOnWrite();
            final aooh aooh = (aooh)builder.instance;
            aooh.c = aooi.c;
            aooh.b |= 0x1;
        }
        this.c(builder, false, false);
    }
    
    public final void b(final aooi aooi) {
        if (this.b) {
            pzp.a().a.d(new adhc("Heartbeat", aooi).toString());
            return;
        }
        this.a(aooi);
    }
    
    public final void c(final agza agza, final boolean b, boolean b2) {
        if (b) {
            ((auip)((atjj)this.g).a()).x((aooh)agza.build(), true);
            return;
        }
        final Object a = this.a;
        monitorenter(a);
        try {
            for (final adex adex : ((Map<K, adex>)this.f).values()) {
                if (adex.e()) {
                    b2 |= adex.f((Context)this.c, agza);
                }
            }
            monitorexit(a);
            if (b2) {
                ((auip)((atjj)this.g).a()).x((aooh)agza.build(), false);
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final ListenableFuture d(final String s, final MessageLite messageLite) {
        monitorenter(this);
        try {
            if (TextUtils.isEmpty((CharSequence)s)) {
                throw new IllegalArgumentException("Invalid cache key: ".concat(s));
            }
            if (messageLite == null) {
                final ListenableFuture k = afva.k();
                monitorexit(this);
                return k;
            }
            if (!this.f()) {
                trn.l("Couldn't store browse response due to uninitialized disk cache");
                final ListenableFuture i = afva.k();
                monitorexit(this);
                return i;
            }
            if (((akfw)messageLite).t <= 0 && ((akfw)messageLite).u <= 0) {
                this.e(s);
                final ListenableFuture j = afva.k();
                monitorexit(this);
                return j;
            }
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            if (((zki)this.d).t()) {
                hashMap.put("Identity-Id", ((zki)this.d).c().d());
            }
            final byte[] byteArray = messageLite.toByteArray();
            akjf akjf;
            if ((akjf = ((akfw)messageLite).c) == null) {
                akjf = akjf.a;
            }
            final dav q = vwh.q(byteArray, (Map)hashMap, akjf);
            dav dav;
            if (q == null) {
                dav = null;
            }
            else {
                final long f = ((oas)this.a).c() + TimeUnit.SECONDS.toMillis(((akfw)messageLite).t);
                q.e = TimeUnit.SECONDS.toMillis(((akfw)messageLite).u) + f;
                q.f = f;
                q.d = ((oas)this.a).c();
                dav = q;
            }
            if (dav == null) {
                trn.l("Failed to generate cache entry for browse response");
                final ListenableFuture l = afva.k();
                monitorexit(this);
                return l;
            }
            final ListenableFuture p2 = afva.p((Runnable)new uqv(this, s, dav, 3, (byte[])null), (Executor)this.e);
            monitorexit(this);
            return p2;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final ListenableFuture e(final String s) {
        if (!this.f()) {
            trn.l("Couldn't remove entry due to uninitialized disk cache");
            return afva.l((Throwable)new IllegalStateException("Couldn't remove entry due to uninitialized disk cache"));
        }
        return afva.p((Runnable)new upt(this, s, 9, (byte[])null), (Executor)this.e);
    }
    
    public final boolean f() {
        synchronized (this) {
            if (this.b) {
                return true;
            }
            try {
                ((daw)this.f).c();
                return this.b = true;
            }
            catch (final RuntimeException ex) {
                zjp.c(zjo.b, zjn.e, "Couldn't initialize disk cache", (Throwable)ex);
                trn.d("Couldn't initialize disk cache", (Throwable)ex);
                return false;
            }
        }
    }
    
    public final void g(final MessageLite messageLite) {
        synchronized (this) {
            this.d("FElibrary", messageLite).isCancelled();
        }
    }
    
    public final void h(final Object o) {
        if (this.b) {
            return;
        }
        dk.d(o);
        ((CopyOnWriteArraySet<ban>)this.e).add(new ban(o));
    }
    
    public final void i() {
        if (((ArrayDeque)this.d).isEmpty()) {
            return;
        }
        if (!((baj)this.a).a()) {
            final Object a = this.a;
            ((baj)a).h(((baj)a).e(0));
        }
        final boolean empty = ((ArrayDeque)this.g).isEmpty();
        ((ArrayDeque)this.g).addAll((Collection)this.d);
        ((ArrayDeque)this.d).clear();
        if (!(empty ^ true)) {
            while (!((ArrayDeque)this.g).isEmpty()) {
                ((ArrayDeque)this.g).peekFirst().run();
                ((ArrayDeque)this.g).removeFirst();
            }
        }
    }
    
    public final void j(final int n, final bal bal) {
        ((ArrayDeque<qo>)this.d).add(new qo(new CopyOnWriteArraySet((Collection<? extends E>)this.e), n, bal, 7));
    }
    
    public final void k() {
        final Iterator iterator = ((CopyOnWriteArraySet)this.e).iterator();
        while (iterator.hasNext()) {
            ((ban)iterator.next()).a((bam)this.c);
        }
        ((CopyOnWriteArraySet)this.e).clear();
        this.b = true;
    }
    
    public final void l(final Object o) {
        for (final ban ban : (CopyOnWriteArraySet)this.e) {
            if (ban.a.equals(o)) {
                ban.a((bam)this.c);
                ((CopyOnWriteArraySet)this.e).remove(ban);
            }
        }
    }
    
    public final void m(final int n, final bal bal) {
        this.j(n, bal);
        this.i();
    }
    
    public final uyi n(final String s) {
        synchronized (this) {
            if (!this.f()) {
                trn.l("Couldn't fetch browse response due to uninitialized disk cache");
                final akfw a = akfw.a;
                return uyi.cW();
            }
            final dav a2 = ((daw)this.f).a(s);
            if (a2 == null) {
                final akfw a3 = akfw.a;
                return uyi.cW();
            }
            final String s2 = a2.g.get("Identity-Id");
            Label_0124: {
                if (((zki)this.d).t()) {
                    if (TextUtils.equals((CharSequence)((zki)this.d).c().d(), (CharSequence)s2)) {
                        break Label_0124;
                    }
                }
                else if (TextUtils.isEmpty((CharSequence)s2)) {
                    break Label_0124;
                }
                final akfw a4 = akfw.a;
                return uyi.cW();
            }
            final akfw a5 = akfw.a;
            final MessageLite a6 = ((vjl)this.g).a(a2.a, (MessageLite)a5);
            if (a6 == null) {
                trn.b(String.format("Failed to deserialize %s from cache", ((MessageLite)a5).getClass().getSimpleName()));
                return uyi.cW();
            }
            final uxx a7 = ((uxy)this.c).a(a2);
            if (((uxz)a7).b == uyb.d) {
                this.e(s);
                ((uxz)a7).a.cancel(true);
            }
            return new uyi(a6, a7);
        }
    }
}
