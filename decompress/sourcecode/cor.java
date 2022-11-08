import java.util.concurrent.Executor;
import androidx.work.impl.WorkDatabase;
import android.os.Bundle;
import java.util.Iterator;
import android.os.PowerManager$WakeLock;
import android.content.Context;
import java.util.List;
import java.util.Collections;
import android.util.Log;
import java.util.ArrayList;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

final class cor implements Runnable
{
    final /* synthetic */ cou a;
    
    public cor(final cou a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        Object o = this.a.g;
        monitorenter(o);
        try {
            final cou a = this.a;
            final List g = a.g;
            int i = 0;
            a.h = (Intent)g.get(0);
            monitorexit(o);
            o = this.a.h;
            if (o != null) {
                final String action = ((Intent)o).getAction();
                final int intExtra = this.a.h.getIntExtra("KEY_START_ID", 0);
                cmr.a();
                new StringBuilder("Processing command ").append(this.a.h);
                final Context b = this.a.b;
                o = new StringBuilder();
                ((StringBuilder)o).append(action);
                ((StringBuilder)o).append(" (");
                ((StringBuilder)o).append(intExtra);
                ((StringBuilder)o).append(")");
                final PowerManager$WakeLock a2 = css.a(b, ((StringBuilder)o).toString());
                try {
                    cmr.a();
                    final StringBuilder sb = new StringBuilder("Acquiring operation wake lock (");
                    sb.append(action);
                    sb.append(") ");
                    sb.append(a2);
                    a2.acquire();
                    final cou a3 = this.a;
                    final con f = a3.f;
                    final Intent h = a3.h;
                    final String action2 = h.getAction();
                    Label_1730: {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                            cmr.a();
                            new StringBuilder("Handling constraints changed ").append(h);
                            final int a4 = cop.a;
                            final Context b2 = f.b;
                            final cpd cpd = new cpd(a3.e.j, (cpb)null, (byte[])null);
                            final List c = a3.e.d.w().c();
                            coo.a(b2, c);
                            cpd.a((Iterable)c);
                            final ArrayList list = new ArrayList(c.size());
                            final long currentTimeMillis = System.currentTimeMillis();
                            for (final crg crg : c) {
                                final String c2 = crg.c;
                                if (currentTimeMillis >= crg.a() && (!crg.c() || cpd.c(c2))) {
                                    list.add((Object)crg);
                                }
                            }
                            while (i < list.size()) {
                                final crg crg2 = (crg)list.get(i);
                                final String c3 = crg2.c;
                                final Intent c4 = con.c(b2, cht.j(crg2));
                                cmr.a();
                                ((Executor)a3.j.a).execute(new cos(a3, c4, intExtra));
                                ++i;
                            }
                            cpd.b();
                        }
                        else if ("ACTION_RESCHEDULE".equals(action2)) {
                            cmr.a();
                            new StringBuilder("Handling reschedule ").append(h);
                            a3.e.m();
                        }
                        else {
                            final Bundle extras = h.getExtras();
                            Label_1677: {
                                if (extras != null) {
                                    if (!extras.isEmpty()) {
                                        for (int j = 0; j <= 0; ++j) {
                                            if (extras.get((new String[] { "KEY_WORKSPEC_ID" })[j]) == null) {
                                                break Label_1677;
                                            }
                                        }
                                        if ("ACTION_SCHEDULE_WORK".equals(action2)) {
                                            final cqv g2 = con.g(h);
                                            cmr.a();
                                            final StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Handling schedule work for ");
                                            sb2.append(g2);
                                            g2.toString();
                                            final WorkDatabase d = a3.e.d;
                                            ((cfs)d).k();
                                            try {
                                                final crg a5 = d.w().a(g2.a);
                                                if (a5 == null) {
                                                    cmr.a();
                                                    final String a6 = con.a;
                                                    final StringBuilder sb3 = new StringBuilder();
                                                    sb3.append("Skipping scheduling ");
                                                    sb3.append(g2);
                                                    sb3.append(" because it's no longer in the DB");
                                                    Log.w(a6, sb3.toString());
                                                }
                                                else if (chs.d(a5.t)) {
                                                    cmr.a();
                                                    final String a7 = con.a;
                                                    final StringBuilder sb4 = new StringBuilder();
                                                    sb4.append("Skipping scheduling ");
                                                    sb4.append(g2);
                                                    sb4.append("because it is finished.");
                                                    Log.w(a7, sb4.toString());
                                                }
                                                else {
                                                    final long a8 = a5.a();
                                                    if (!a5.c()) {
                                                        cmr.a();
                                                        final StringBuilder sb5 = new StringBuilder();
                                                        sb5.append("Setting up Alarms for ");
                                                        sb5.append(g2);
                                                        sb5.append("at ");
                                                        com.b(f.b, d, g2, a8);
                                                    }
                                                    else {
                                                        cmr.a();
                                                        final StringBuilder sb6 = new StringBuilder();
                                                        sb6.append("Opportunistically setting an alarm for ");
                                                        sb6.append(g2);
                                                        sb6.append("at ");
                                                        com.b(f.b, d, g2, a8);
                                                        ((Executor)a3.j.a).execute(new cos(a3, con.b(f.b), intExtra));
                                                    }
                                                    ((cfs)d).n();
                                                }
                                                break Label_1730;
                                            }
                                            finally {
                                                ((cfs)d).l();
                                            }
                                        }
                                        if ("ACTION_DELAY_MET".equals(action2)) {
                                            synchronized (f.d) {
                                                final cqv g3 = con.g(h);
                                                cmr.a();
                                                final StringBuilder sb7 = new StringBuilder();
                                                sb7.append("Handing delay met for ");
                                                sb7.append(g3);
                                                if (!f.c.containsKey(g3)) {
                                                    final coq coq = new coq(f.b, intExtra, a3, f.e.V(g3), (byte[])null, (byte[])null);
                                                    f.c.put(g3, coq);
                                                    final String a9 = coq.c.a;
                                                    final Context a10 = coq.a;
                                                    final StringBuilder sb8 = new StringBuilder();
                                                    sb8.append(a9);
                                                    sb8.append(" (");
                                                    sb8.append(coq.b);
                                                    sb8.append(")");
                                                    coq.i = css.a(a10, sb8.toString());
                                                    cmr.a();
                                                    final StringBuilder sb9 = new StringBuilder();
                                                    sb9.append("Acquiring wakelock ");
                                                    sb9.append(coq.i);
                                                    sb9.append("for WorkSpec ");
                                                    coq.i.acquire();
                                                    final crg a11 = coq.d.e.d.w().a(a9);
                                                    if (a11 == null) {
                                                        coq.g.execute((Runnable)new cdi(coq, 12));
                                                    }
                                                    else if (!(coq.j = a11.c())) {
                                                        cmr.a();
                                                        coq.e((List)Collections.singletonList(a11));
                                                    }
                                                    else {
                                                        coq.e.a((Iterable)Collections.singletonList(a11));
                                                    }
                                                }
                                                else {
                                                    cmr.a();
                                                    final StringBuilder sb10 = new StringBuilder();
                                                    sb10.append("WorkSpec ");
                                                    sb10.append(g3);
                                                }
                                                break Label_1730;
                                            }
                                        }
                                        if ("ACTION_STOP_WORK".equals(action2)) {
                                            final Bundle extras2 = h.getExtras();
                                            final String string = extras2.getString("KEY_WORKSPEC_ID");
                                            List o2;
                                            if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                                                final int int1 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                                                final ArrayList list2 = new ArrayList(1);
                                                final avt u = f.e.U(new cqv(string, int1));
                                                o2 = list2;
                                                if (u != null) {
                                                    list2.add(u);
                                                    o2 = list2;
                                                }
                                            }
                                            else {
                                                o2 = f.e.o(string);
                                            }
                                            for (final avt avt : o2) {
                                                cmr.a();
                                                a3.e.p(avt);
                                                com.a(f.b, a3.e.d, (cqv)avt.a);
                                                a3.a((cqv)avt.a, false);
                                            }
                                            break Label_1730;
                                        }
                                        if ("ACTION_EXECUTION_COMPLETED".equals(action2)) {
                                            final cqv g4 = con.g(h);
                                            final boolean boolean1 = h.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                                            cmr.a();
                                            final StringBuilder sb11 = new StringBuilder();
                                            sb11.append("Handling onExecutionCompleted ");
                                            sb11.append(h);
                                            sb11.append(", ");
                                            f.a(g4, boolean1);
                                            break Label_1730;
                                        }
                                        cmr.a();
                                        final String a12 = con.a;
                                        final StringBuilder sb12 = new StringBuilder();
                                        sb12.append("Ignoring intent ");
                                        sb12.append(h);
                                        Log.w(a12, "Ignoring intent ".concat(String.valueOf(h)));
                                        break Label_1730;
                                    }
                                }
                            }
                            cmr.a();
                            final String a13 = con.a;
                            final StringBuilder sb13 = new StringBuilder();
                            sb13.append("Invalid request for ");
                            sb13.append(action2);
                            sb13.append(" , requires KEY_WORKSPEC_ID .");
                            Log.e(a13, sb13.toString());
                        }
                    }
                    cmr.a();
                    final StringBuilder sb14 = new StringBuilder("Releasing operation wake lock (");
                    sb14.append(action);
                    sb14.append(") ");
                    sb14.append(a2);
                    a2.release();
                    final cou a14 = this.a;
                    o = a14.j.a;
                    final Object a15 = new so(a14, 4);
                    ((Executor)o).execute((Runnable)a15);
                }
                finally {
                    try {
                        cmr.a();
                        Log.e(cou.a, "Unexpected error in onHandleIntent", (Throwable)o);
                        cmr.a();
                        final StringBuilder sb15 = new StringBuilder("Releasing operation wake lock (");
                        sb15.append(action);
                        sb15.append(") ");
                        sb15.append(a2);
                        a2.release();
                        final cou a16 = this.a;
                        final Object a17 = a16.j.a;
                        final so so = new so(a16, 4);
                    }
                    finally {
                        cmr.a();
                        final StringBuilder sb16 = new StringBuilder("Releasing operation wake lock (");
                        sb16.append(action);
                        sb16.append(") ");
                        sb16.append(a2);
                        a2.release();
                        final Object a15 = this.a;
                        ((Executor)((cou)a15).j.a).execute((Runnable)new so((cou)a15, 4));
                    }
                }
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
