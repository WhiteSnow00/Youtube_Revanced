// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.account.service;

import java.util.Iterator;
import java.util.List;
import android.os.RemoteException;
import java.util.Set;
import android.accounts.Account;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.io.IOException;
import android.content.SharedPreferences;

public class AccountsChangedJobIntentService extends rkt
{
    public arkg e;
    
    protected final void b() {
        final abrj abrj = (abrj)this.e.a();
        this.getApplicationContext();
        final Object a = abrj.a;
        Object e = abrj.e;
        Object f = abrj.f;
        Object b = abrj.b;
        final Object h = abrj.h;
        Object g = abrj.g;
        Object o = abrj.d;
        Object i = abrj.i;
        final Object c = abrj.c;
        tbi.e();
        try {
            Object j;
            Object o2 = j = ((rna)h).i();
            Object o3 = i;
            Object o4 = o;
            Object o5 = g;
            Object o6 = b;
            Object o7 = f;
            Object o8 = e;
            Object o9 = o2;
            Object o10 = i;
            Object o11 = o;
            Object o12 = g;
            Object o13 = b;
            Object o14 = f;
            Object o15 = e;
            try {
                final int int1 = ((SharedPreferences)a).getInt("account_last_handled_event_index", 0);
                j = o2;
                o3 = i;
                o4 = o;
                o5 = g;
                o6 = b;
                o7 = f;
                o8 = e;
                o9 = o2;
                o10 = i;
                o11 = o;
                o12 = g;
                o13 = b;
                o14 = f;
                o15 = e;
                final int length = ((riq)o2).length;
                int max = int1;
                int n = 0;
                while (true) {
                    Label_0587: {
                        if (n >= length) {
                            break Label_0587;
                        }
                        j = o2;
                        o3 = i;
                        o4 = o;
                        o5 = g;
                        o6 = b;
                        o7 = f;
                        o8 = e;
                        o9 = o2;
                        o10 = i;
                        o11 = o;
                        o12 = g;
                        o13 = b;
                        o14 = f;
                        o15 = e;
                        final String name = o2[n].name;
                        j = o2;
                        o3 = i;
                        o4 = o;
                        o5 = g;
                        o6 = b;
                        o7 = f;
                        o8 = e;
                        o9 = o2;
                        o10 = i;
                        o11 = o;
                        o12 = g;
                        o13 = b;
                        o14 = f;
                        o15 = e;
                        final tgd tgd = (tgd)c;
                        j = o2;
                        o3 = i;
                        o4 = o;
                        o5 = g;
                        o6 = b;
                        o7 = f;
                        o8 = e;
                        o9 = o2;
                        o10 = i;
                        o11 = o;
                        o12 = g;
                        o13 = b;
                        o14 = f;
                        o15 = e;
                        final ubu ubu = (ubu)g;
                        j = o2;
                        o3 = i;
                        o4 = o;
                        o5 = g;
                        o6 = b;
                        o7 = f;
                        o8 = e;
                        o9 = o2;
                        o10 = i;
                        o11 = o;
                        o12 = g;
                        o13 = b;
                        o14 = f;
                        o15 = e;
                        final rna rna = (rna)h;
                        j = o2;
                        o3 = i;
                        o4 = o;
                        o5 = g;
                        o6 = b;
                        o7 = f;
                        o8 = e;
                        o9 = o2;
                        o10 = i;
                        o11 = o;
                        o12 = g;
                        o13 = b;
                        o14 = f;
                        o15 = e;
                        final rhx rhx = (rhx)b;
                        try {
                            max = Math.max(max, rhl.c(int1, -1, name, (SharedPreferences)a, (ril)e, (riq)f, rhx, rna, ubu, (rlt)o, tgd, (atke)i));
                            ++n;
                            continue;
                            o7 = o2;
                            o11 = i;
                            o9 = o;
                            o6 = g;
                            o10 = b;
                            o8 = f;
                            o5 = e;
                            ((SharedPreferences)a).edit().putInt("account_last_handled_event_index", max).apply();
                            i = o11;
                            e = o5;
                            b = o10;
                            g = o6;
                            f = o7;
                            o = o9;
                            o2 = o8;
                        }
                        catch (final IOException ex) {
                            o8 = f;
                            f = o2;
                            o9 = ex;
                            o2 = o8;
                        }
                        catch (final mht mht) {
                            o8 = f;
                            f = o2;
                            o9 = mht;
                            o2 = o8;
                        }
                    }
                }
            }
            catch (final IOException o9) {
                o10 = o3;
                o11 = o4;
            }
            catch (final mht mht2) {
                o8 = o15;
                o7 = o14;
                o6 = o13;
                o5 = o12;
                j = o9;
                o9 = mht2;
            }
            f = j;
            i = o10;
            o = o11;
            g = o5;
            b = o6;
            o2 = o7;
            e = o8;
            ttr.n("Error getting Account rename information, continuing regardless.", (Throwable)o9);
            if (((ril)e).t() && ((ril)e).c() instanceof AccountIdentity && !rna.c(((AccountIdentity)((ril)e).c()).a(), (Account[])f)) {
                if (((AccountIdentity)((ril)e).c()).l() == 3) {
                    teu.i(((ubu)g).q(), (tet)jog.f);
                }
                ((rlt)o).o(false);
            }
            final List l = ((ril)e).l((Account[])f);
            ((rhx)b).f((Iterable)l);
            for (final AccountIdentity accountIdentity : l) {
                ((riq)o2).n(accountIdentity);
                o = new zmi((zme)accountIdentity);
                ((tgd)c).d(o);
                o = ((Set)((atke)i).a()).iterator();
                while (((Iterator)o).hasNext()) {
                    ((Iterator<zmj>)o).next().c((zme)accountIdentity);
                }
            }
            ((ril)e).p(l);
        }
        catch (final mqg | mqh | RemoteException ex2) {
            ((rlt)o).o(false);
        }
    }
}
