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

public final class adjk
{
    public final Object a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    
    public adjk(final Context c, final atnb d, final atnb e, final atnb f) {
        this.a = new Object();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = new HashMap();
    }
    
    public adjk(final Looper looper, final bae bae, final bao bao) {
        this(new CopyOnWriteArraySet(), looper, bae, bao);
    }
    
    public adjk(final CopyOnWriteArraySet f, final Looper looper, final bae g, final bao c) {
        this.g = g;
        this.f = f;
        this.c = c;
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.a = g.b(looper, (Handler$Callback)new bnh(this, 1, null, null));
    }
    
    public adjk(final zoa e, final dba g, final oco a, final Executor f, final vbd c, final vmx d) {
        this.e = e;
        this.g = g;
        this.a = a;
        this.f = f;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final aosw aosw) {
        final ahcr builder = ((ahcz)aosv.a).createBuilder();
        if (aosw != null) {
            builder.copyOnWrite();
            final aosv aosv = (aosv)builder.instance;
            aosv.c = aosw.d;
            aosv.b |= 0x1;
        }
        this.c(builder, false, false);
    }
    
    public final void b(final aosw aosw) {
        if (this.b) {
            qbs.a().a.d(new adkv("Heartbeat", aosw).toString());
            return;
        }
        this.a(aosw);
    }
    
    public final void c(final ahcr ahcr, final boolean b, boolean b2) {
        if (b) {
            ((aapu)((atnb)this.d).a()).bL((aosv)ahcr.build(), true);
            return;
        }
        final Object a = this.a;
        monitorenter(a);
        try {
            for (final adim adim : ((Map<K, adim>)this.g).values()) {
                if (adim.g() && !adim.b()) {
                    b2 |= adim.h((Context)this.c, ahcr);
                }
            }
            monitorexit(a);
            if (b2) {
                ((aapu)((atnb)this.d).a()).bK((aosv)ahcr.build());
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
                final ListenableFuture j = afxr.j();
                monitorexit(this);
                return j;
            }
            if (!this.f()) {
                tut.l("Couldn't store browse response due to uninitialized disk cache");
                final ListenableFuture i = afxr.j();
                monitorexit(this);
                return i;
            }
            if (((akka)messageLite).t <= 0 && ((akka)messageLite).u <= 0) {
                this.e(s);
                final ListenableFuture k = afxr.j();
                monitorexit(this);
                return k;
            }
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            if (((zoa)this.e).t()) {
                hashMap.put("Identity-Id", ((zoa)this.e).c().d());
            }
            final byte[] byteArray = messageLite.toByteArray();
            aknj aknj;
            if ((aknj = ((akka)messageLite).c) == null) {
                aknj = aknj.a;
            }
            final daz b = wbe.B(byteArray, (Map)hashMap, aknj);
            daz daz;
            if (b == null) {
                daz = null;
            }
            else {
                final long f = ((oco)this.a).c() + TimeUnit.SECONDS.toMillis(((akka)messageLite).t);
                b.e = TimeUnit.SECONDS.toMillis(((akka)messageLite).u) + f;
                b.f = f;
                b.d = ((oco)this.a).c();
                daz = b;
            }
            if (daz == null) {
                tut.l("Failed to generate cache entry for browse response");
                final ListenableFuture l = afxr.j();
                monitorexit(this);
                return l;
            }
            final ListenableFuture o = afxr.o((Runnable)new utr(this, s, daz, 3, (byte[])null), (Executor)this.f);
            monitorexit(this);
            return o;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final ListenableFuture e(final String s) {
        if (!this.f()) {
            tut.l("Couldn't remove entry due to uninitialized disk cache");
            return afxr.k(new IllegalStateException("Couldn't remove entry due to uninitialized disk cache"));
        }
        return afxr.o((Runnable)new ukz(this, s, 15, (byte[])null), (Executor)this.f);
    }
    
    public final boolean f() {
        synchronized (this) {
            if (this.b) {
                return true;
            }
            try {
                ((dba)this.g).c();
                return this.b = true;
            }
            catch (final RuntimeException ex) {
                znh.c(zng.b, znf.e, "Couldn't initialize disk cache", (Throwable)ex);
                tut.d("Couldn't initialize disk cache", (Throwable)ex);
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
        bad.b(o);
        ((CopyOnWriteArraySet<bap>)this.f).add(new bap(o));
    }
    
    public final void i() {
        if (((ArrayDeque)this.e).isEmpty()) {
            return;
        }
        if (!((bal)this.a).a()) {
            final Object a = this.a;
            ((bal)a).h(((bal)a).e(0));
        }
        final boolean empty = ((ArrayDeque)this.d).isEmpty();
        ((ArrayDeque)this.d).addAll((Collection)this.e);
        ((ArrayDeque)this.e).clear();
        if (!(empty ^ true)) {
            while (!((ArrayDeque)this.d).isEmpty()) {
                ((ArrayDeque)this.d).peekFirst().run();
                ((ArrayDeque)this.d).removeFirst();
            }
        }
    }
    
    public final void j(final int n, final ban ban) {
        ((ArrayDeque<qp>)this.e).add(new qp(new CopyOnWriteArraySet((Collection<? extends E>)this.f), n, ban, 7));
    }
    
    public final void k() {
        final Iterator iterator = ((CopyOnWriteArraySet)this.f).iterator();
        while (iterator.hasNext()) {
            ((bap)iterator.next()).a((bao)this.c);
        }
        ((CopyOnWriteArraySet)this.f).clear();
        this.b = true;
    }
    
    public final void l(final Object o) {
        for (final bap bap : (CopyOnWriteArraySet)this.f) {
            if (bap.a.equals(o)) {
                bap.a((bao)this.c);
                ((CopyOnWriteArraySet)this.f).remove(bap);
            }
        }
    }
    
    public final void m(final int n, final ban ban) {
        this.j(n, ban);
        this.i();
    }
    
    public final vxu n(final String s) {
        synchronized (this) {
            if (!this.f()) {
                tut.l("Couldn't fetch browse response due to uninitialized disk cache");
                final akka a = akka.a;
                return vxu.ab();
            }
            final daz a2 = ((dba)this.g).a(s);
            if (a2 == null) {
                final akka a3 = akka.a;
                return vxu.ab();
            }
            final String s2 = a2.g.get("Identity-Id");
            Label_0124: {
                if (((zoa)this.e).t()) {
                    if (TextUtils.equals((CharSequence)((zoa)this.e).c().d(), (CharSequence)s2)) {
                        break Label_0124;
                    }
                }
                else if (TextUtils.isEmpty((CharSequence)s2)) {
                    break Label_0124;
                }
                final akka a4 = akka.a;
                return vxu.ab();
            }
            final akka a5 = akka.a;
            final MessageLite a6 = ((vmx)this.d).a(a2.a, (MessageLite)a5);
            if (a6 == null) {
                tut.b(String.format("Failed to deserialize %s from cache", ((MessageLite)a5).getClass().getSimpleName()));
                return vxu.ab();
            }
            final vbc a7 = ((vbd)this.c).a(a2);
            if (((vbe)a7).b == vbg.d) {
                this.e(s);
                ((vbe)a7).a.cancel(true);
            }
            return new vxu(a6, a7);
        }
    }
}
