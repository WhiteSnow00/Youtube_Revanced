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

public final class ActivityAccountState implements aua
{
    public final boolean a;
    public Object b;
    public int c;
    public aejz d;
    public int e;
    public final aujg f;
    private final KeepStateCallbacksHandler g;
    private final List h;
    private final ExtensionRegistryLite i;
    private final aeqe j;
    private final agq k;
    
    public ActivityAccountState(final aeqe j, final aujg f, final KeepStateCallbacksHandler g, final ExtensionRegistryLite i, final agq k, final byte[] array, final byte[] array2, final byte[] array3) {
        this.h = new ArrayList();
        this.b = null;
        this.c = -1;
        this.d = aejz.a;
        this.e = 0;
        this.j = j;
        this.f = f;
        this.g = g;
        this.i = i;
        this.a = (boolean)false;
        this.k = k;
        j.getLifecycle().b((aum)this);
        j.getSavedStateRegistry().c("tiktok_activity_account_state_saved_instance_state", (cgh)new cb(this, 14));
    }
    
    private static void n(final cl cl) {
        cl.ai(1);
        final List j = cl.j();
        if (j != null && !j.isEmpty()) {
            final ct i = cl.i();
            for (final br br : j) {
                if (br instanceof arlm && ((arlm)br).aR() instanceof aejs) {
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
        qdt.h();
        return this.c;
    }
    
    public final void h() {
        this.j.b().ab();
    }
    
    public final boolean i() {
        qdt.h();
        return this.c != -1;
    }
    
    public final boolean j(final int c, final aejz d, final int e) {
        d.getClass();
        qdt.h();
        this.g.g();
        final int c2 = this.c;
        final boolean b = e != this.e;
        final boolean b2 = c != c2;
        if (b2 || b) {
            this.h();
        }
        if (b2 || (b && this.e != 0)) {
            n(this.j.b());
        }
        if (b2) {
            this.c = c;
            final agq k = this.k;
            final AccountId b3 = AccountId.b(c);
            synchronized (k.b) {
                final Set g = k.g();
                if (!g.isEmpty()) {
                    final AccountId accountId = (AccountId)agpc.W((Iterable)g);
                    synchronized (k.b) {
                        adkp.Q(((Map)k.e).containsKey((Object)accountId));
                        ((Map<Object, Object>)k.e).remove(accountId);
                        final aepc d2 = ((ahdc)((aqtv)k.c).a).d(accountId);
                        synchronized (d2.c) {
                            final avi a = d2.a;
                            for (final String s : atwm.d(atwm.d((Set)a.b.keySet(), (Iterable)a.c.keySet()), (Iterable)a.d.keySet())) {
                                final avi a2 = d2.a;
                                s.getClass();
                                a2.b.remove(s);
                                if (a2.d.remove(s) != null) {
                                    throw null;
                                }
                                a2.e.remove(s);
                                final avi a3 = d2.a;
                                s.getClass();
                                a3.c.remove(s);
                            }
                            arks b4;
                            if (d2.d != null) {
                                b4 = ((aepa)aqsy.k(d2.d, aepa.class)).b();
                            }
                            else {
                                b4 = null;
                            }
                            d2.d = null;
                            monitorexit(d2.c);
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
                ((aejt)iterator2.next()).a();
            }
        }
        this.d = d;
        this.e = e;
        return b2 || b;
    }
    
    public final void k() {
        this.j(-1, aejz.a, 0);
    }
    
    public final void l(final Throwable t) {
        t.getClass();
        this.j(-1, aejz.a, 3);
        this.f.n();
        final aujg f = this.f;
        final aetf o = aeux.o("onAccountError");
        try {
            final afke k = ((afiq)f.c).k();
            while (k.hasNext()) {
                ((aejp)k.next()).sX(t);
            }
            final Iterator iterator = ((ArrayList)f.b).iterator();
            while (iterator.hasNext()) {
                ((aejp)iterator.next()).sX(t);
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
                    aevy.j(t, t2);
                }
            }
            while (true) {}
        }
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void m() {
        if (this.j(-1, aejz.a, 1)) {
            this.f.o();
            final aujg f = this.f;
            final aetf o = aeux.o("onAccountLoading");
            try {
                final afke k = ((afiq)f.c).k();
                while (k.hasNext()) {
                    ((aejp)k.next()).b();
                }
                final Iterator iterator = ((ArrayList)f.b).iterator();
                while (iterator.hasNext()) {
                    ((aejp)iterator.next()).b();
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
                    aevy.j(t, t2);
                }
            }
        }
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
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
                this.d = (aejz)adyf.av(a, "state_account_info", (MessageLite)aejz.a, this.i);
                final int int1 = a.getInt("state_account_state", 0);
                this.e = int1;
                if (int1 != 0) {
                    if (int1 == 1) {
                        this.f.o();
                        return;
                    }
                    if (int1 == 2) {
                        final aujg f = this.f;
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
            catch (final ahca ahca) {
                throw new RuntimeException("Failed to get AccountInfo from Bundle.", (Throwable)ahca);
            }
        }
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
