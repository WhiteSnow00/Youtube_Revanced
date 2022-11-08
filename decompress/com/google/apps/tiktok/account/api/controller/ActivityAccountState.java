// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.account.api.controller;

import java.util.Map;
import android.os.Bundle;
import com.google.protobuf.MessageLite;
import java.util.Set;
import com.google.apps.tiktok.account.AccountId;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.List;

public final class ActivityAccountState implements atz
{
    public final boolean a;
    public Object b;
    public int c;
    public aehy d;
    public int e;
    public final auip f;
    private final KeepStateCallbacksHandler g;
    private final List h;
    private final ExtensionRegistryLite i;
    private final aeoe j;
    private final agp k;
    
    public ActivityAccountState(final aeoe j, final auip f, final KeepStateCallbacksHandler g, final ExtensionRegistryLite i, final agp k, final byte[] array, final byte[] array2, final byte[] array3) {
        this.h = new ArrayList();
        this.b = null;
        this.c = -1;
        this.d = aehy.a;
        this.e = 0;
        this.j = j;
        this.f = f;
        this.g = g;
        this.i = i;
        this.a = (boolean)false;
        this.k = k;
        j.getLifecycle().b((aul)this);
        j.getSavedStateRegistry().c("tiktok_activity_account_state_saved_instance_state", (cgg)new cb(this, 14));
    }
    
    private static void n(final cl cl) {
        cl.ai(1);
        final List j = cl.j();
        if (j != null && !j.isEmpty()) {
            final ct i = cl.i();
            for (final br br : j) {
                if (br instanceof arix && ((arix)br).aR() instanceof aehr) {
                    i.n(br);
                }
                else {
                    final cl og = br.og();
                    og.ab();
                    n(og);
                }
            }
            if (!i.j()) {
                i.z();
                i.d();
            }
        }
    }
    
    public final int g() {
        qcj.s();
        return this.c;
    }
    
    public final void h() {
        this.j.b().ab();
    }
    
    public final boolean i() {
        qcj.s();
        return this.c != -1;
    }
    
    public final boolean j(final int c, final aehy d, final int e) {
        d.getClass();
        qcj.s();
        this.g.g();
        final boolean b = c != this.c;
        final boolean b2 = e != this.e;
        if (b || b2) {
            this.h();
        }
        if (b || (b2 && this.e != 0)) {
            n(this.j.b());
        }
        if (b) {
            this.c = c;
            final agp k = this.k;
            final AccountId b3 = AccountId.b(c);
            synchronized (k.b) {
                final Set g = k.g();
                if (!g.isEmpty()) {
                    final AccountId accountId = (AccountId)adwd.aL((Iterable)g);
                    synchronized (k.b) {
                        agot.D(((Map)k.e).containsKey((Object)accountId));
                        ((Map<Object, Object>)k.e).remove(accountId);
                        final aenc g2 = ((ahbd)((arvv)k.c).c).g(accountId);
                        synchronized (g2.c) {
                            final avh a = g2.a;
                            for (final String s : atva.h(atva.h(a.b.keySet(), a.c.keySet()), a.d.keySet())) {
                                final avh a2 = g2.a;
                                s.getClass();
                                a2.b.remove(s);
                                if (a2.d.remove(s) != null) {
                                    throw null;
                                }
                                a2.e.remove(s);
                                final avh a3 = g2.a;
                                s.getClass();
                                a3.c.remove(s);
                            }
                            arid b4;
                            if (g2.d != null) {
                                b4 = ((aena)aqqm.k(g2.d, (Class)aena.class)).b();
                            }
                            else {
                                b4 = null;
                            }
                            g2.d = null;
                            monitorexit(g2.c);
                            if (b4 != null) {
                                b4.a();
                            }
                        }
                    }
                }
                ((Map<AccountId, Object>)k.e).put(b3, k.f(b3));
            }
        }
        if (this.e == 0) {
            final Iterator iterator2 = this.h.iterator();
            while (iterator2.hasNext()) {
                ((aehs)iterator2.next()).a();
            }
        }
        this.d = d;
        this.e = e;
        return b || b2;
    }
    
    public final void k() {
        this.j(-1, aehy.a, 0);
    }
    
    public final void l(final Throwable t) {
        t.getClass();
        this.j(-1, aehy.a, 3);
        this.f.n();
        final auip f = this.f;
        final aere o = aesw.o("onAccountError");
        try {
            final afie k = ((afgq)f.b).k();
            while (((Iterator)k).hasNext()) {
                ((aeho)((Iterator)k).next()).sR(t);
            }
            final Iterator iterator = ((ArrayList)f.c).iterator();
            while (iterator.hasNext()) {
                ((aeho)iterator.next()).sR(t);
            }
            o.close();
        }
        finally {
            Label_0132: {
                try {
                    o.close();
                    break Label_0132;
                }
                finally {
                    final Throwable t2;
                    aeda.D(t, t2);
                }
            }
            while (true) {}
        }
    }
    
    public final void m() {
        if (this.j(-1, aehy.a, 1)) {
            this.f.o();
            final auip f = this.f;
            final aere o = aesw.o("onAccountLoading");
            try {
                final afie k = ((afgq)f.b).k();
                while (((Iterator)k).hasNext()) {
                    ((aeho)((Iterator)k).next()).b();
                }
                final Iterator iterator = ((ArrayList)f.c).iterator();
                while (iterator.hasNext()) {
                    ((aeho)iterator.next()).b();
                }
                o.close();
            }
            finally {
                try {
                    o.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    aeda.D(t, t2);
                }
            }
        }
    }
    
    public final void mq(final aum aum) {
        Bundle a;
        if (this.j.getSavedStateRegistry().d) {
            a = this.j.getSavedStateRegistry().a("tiktok_activity_account_state_saved_instance_state");
        }
        else {
            a = null;
        }
        if (a != null) {
            if (!this.a && a.getBoolean("tiktok_accounts_disabled")) {
                n(this.j.b());
                return;
            }
            this.c = a.getInt("state_account_id", -1);
            try {
                this.d = (aehy)aeda.aq(a, "state_account_info", (MessageLite)aehy.a, this.i);
                final int int1 = a.getInt("state_account_state", 0);
                this.e = int1;
                if (int1 != 0) {
                    if (int1 == 1) {
                        this.f.o();
                        return;
                    }
                    if (int1 == 2) {
                        final auip f = this.f;
                        AccountId.b(this.c);
                        f.m(this.d);
                        return;
                    }
                    if (int1 == 3) {
                        this.f.n();
                        return;
                    }
                    throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                }
            }
            catch (final ahab ahab) {
                throw new RuntimeException("Failed to get AccountInfo from Bundle.", (Throwable)ahab);
            }
        }
    }
}
