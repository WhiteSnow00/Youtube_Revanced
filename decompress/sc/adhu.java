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

public final class adhu
{
    public final Object a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    private final Object g;
    
    public adhu(final Context c, final atke g, final atke d, final atke e) {
        this.a = new Object();
        this.c = c;
        this.g = g;
        this.d = d;
        this.e = e;
        this.f = new HashMap();
    }
    
    public adhu(final Looper looper, final bad bad, final ban ban) {
        this(new CopyOnWriteArraySet(), looper, bad, ban);
    }
    
    public adhu(final CopyOnWriteArraySet e, final Looper looper, final bad f, final ban c) {
        this.f = f;
        this.e = e;
        this.c = c;
        this.g = new ArrayDeque();
        this.d = new ArrayDeque();
        this.a = f.b(looper, (Handler$Callback)new bne(this, 1, null, null));
    }
    
    public adhu(final zmf d, final dax f, final oby a, final Executor e, final uzx c, final vlq g) {
        this.d = d;
        this.f = f;
        this.a = a;
        this.e = e;
        this.c = c;
        this.g = g;
    }
    
    public final void a(final aoql aoql) {
        final ahaz builder = ((ahbh)aoqk.a).createBuilder();
        if (aoql != null) {
            builder.copyOnWrite();
            final aoqk aoqk = (aoqk)builder.instance;
            aoqk.c = aoql.c;
            aoqk.b |= 0x1;
        }
        this.c(builder, false, false);
    }
    
    public final void b(final aoql aoql) {
        if (this.b) {
            qaz.a().a.d(new adjf("Heartbeat", aoql).toString());
            return;
        }
        this.a(aoql);
    }
    
    public final void c(final ahaz ahaz, final boolean b, boolean b2) {
        if (b) {
            ((aujg)((atke)this.g).a()).x((aoqk)ahaz.build(), true);
            return;
        }
        final Object a = this.a;
        monitorenter(a);
        try {
            for (final adha adha : ((Map<K, adha>)this.f).values()) {
                if (adha.e()) {
                    b2 |= adha.f((Context)this.c, ahaz);
                }
            }
            monitorexit(a);
            if (b2) {
                ((aujg)((atke)this.g).a()).x((aoqk)ahaz.build(), false);
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final ListenableFuture d(String concat, final MessageLite messageLite) {
        monitorenter(this);
        try {
            if (TextUtils.isEmpty((CharSequence)concat)) {
                concat = "Invalid cache key: ".concat(concat);
                throw new IllegalArgumentException(concat);
            }
            if (messageLite == null) {
                final ListenableFuture k = afwm.k();
                monitorexit(this);
                return k;
            }
            if (!this.f()) {
                ttr.l("Couldn't store browse response due to uninitialized disk cache");
                final ListenableFuture i = afwm.k();
                monitorexit(this);
                return i;
            }
            if (((akhz)messageLite).t <= 0 && ((akhz)messageLite).u <= 0) {
                this.e(concat);
                final ListenableFuture j = afwm.k();
                monitorexit(this);
                return j;
            }
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            if (((zmf)this.d).t()) {
                hashMap.put("Identity-Id", ((zmf)this.d).c().d());
            }
            final byte[] byteArray = messageLite.toByteArray();
            akli akli;
            if ((akli = ((akhz)messageLite).c) == null) {
                akli = akli.a;
            }
            final daw s = vyg.s(byteArray, (Map)hashMap, akli);
            daw daw;
            if (s == null) {
                daw = null;
            }
            else {
                final long f = ((oby)this.a).c() + TimeUnit.SECONDS.toMillis(((akhz)messageLite).t);
                s.e = TimeUnit.SECONDS.toMillis(((akhz)messageLite).u) + f;
                s.f = f;
                s.d = ((oby)this.a).c();
                daw = s;
            }
            if (daw == null) {
                ttr.l("Failed to generate cache entry for browse response");
                final ListenableFuture l = afwm.k();
                monitorexit(this);
                return l;
            }
            final ListenableFuture p2 = afwm.p((Runnable)new usq(this, concat, daw, 3, (byte[])null), (Executor)this.e);
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
            ttr.l("Couldn't remove entry due to uninitialized disk cache");
            return afwm.l((Throwable)new IllegalStateException("Couldn't remove entry due to uninitialized disk cache"));
        }
        return afwm.p((Runnable)new ulz(this, s, 12, (byte[])null), (Executor)this.e);
    }
    
    public final boolean f() {
        synchronized (this) {
            if (this.b) {
                return true;
            }
            try {
                ((dax)this.f).c();
                return this.b = true;
            }
            catch (final RuntimeException ex) {
                zlm.c(zll.b, zlk.e, "Couldn't initialize disk cache", (Throwable)ex);
                ttr.d("Couldn't initialize disk cache", (Throwable)ex);
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
        ((CopyOnWriteArraySet<bao>)this.e).add(new bao(o));
    }
    
    public final void i() {
        if (((ArrayDeque)this.d).isEmpty()) {
            return;
        }
        if (!((bak)this.a).a()) {
            final Object a = this.a;
            ((bak)a).h(((bak)a).e(0));
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
    
    public final void j(final int n, final bam bam) {
        ((ArrayDeque<qo>)this.d).add(new qo(new CopyOnWriteArraySet((Collection<? extends E>)this.e), n, bam, 7));
    }
    
    public final void k() {
        final Iterator iterator = ((CopyOnWriteArraySet)this.e).iterator();
        while (iterator.hasNext()) {
            ((bao)iterator.next()).a((ban)this.c);
        }
        ((CopyOnWriteArraySet)this.e).clear();
        this.b = true;
    }
    
    public final void l(final Object o) {
        for (final bao bao : (CopyOnWriteArraySet)this.e) {
            if (bao.a.equals(o)) {
                bao.a((ban)this.c);
                ((CopyOnWriteArraySet)this.e).remove(bao);
            }
        }
    }
    
    public final void m(final int n, final bam bam) {
        this.j(n, bam);
        this.i();
    }
    
    public final vwa n(final String s) {
        synchronized (this) {
            if (!this.f()) {
                ttr.l("Couldn't fetch browse response due to uninitialized disk cache");
                final akhz a = akhz.a;
                return vwa.t();
            }
            final daw a2 = ((dax)this.f).a(s);
            if (a2 == null) {
                final akhz a3 = akhz.a;
                return vwa.t();
            }
            final String s2 = a2.g.get("Identity-Id");
            Label_0124: {
                if (((zmf)this.d).t()) {
                    if (TextUtils.equals((CharSequence)((zmf)this.d).c().d(), (CharSequence)s2)) {
                        break Label_0124;
                    }
                }
                else if (TextUtils.isEmpty((CharSequence)s2)) {
                    break Label_0124;
                }
                final akhz a4 = akhz.a;
                return vwa.t();
            }
            final akhz a5 = akhz.a;
            final MessageLite a6 = ((vlq)this.g).a(a2.a, (MessageLite)a5);
            if (a6 == null) {
                ttr.b(String.format("Failed to deserialize %s from cache", ((MessageLite)a5).getClass().getSimpleName()));
                return vwa.t();
            }
            final uzw a7 = ((uzx)this.c).a(a2);
            if (((uzy)a7).b == vaa.d) {
                this.e(s);
                ((uzy)a7).a.cancel(true);
            }
            return new vwa(a6, a7);
        }
    }
}
