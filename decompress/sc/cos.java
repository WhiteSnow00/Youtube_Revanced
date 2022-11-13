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

final class cos implements Runnable
{
    final cov a;
    
    public cos(final cov a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        Object o = this.a.g;
        monitorenter(o);
        try {
            final cov a = this.a;
            final List g = a.g;
            int i = 0;
            a.h = (Intent)g.get(0);
            monitorexit(o);
            o = this.a.h;
            if (o != null) {
                final String action = ((Intent)o).getAction();
                final int intExtra = this.a.h.getIntExtra("KEY_START_ID", 0);
                cms.a();
                new StringBuilder("Processing command ").append(this.a.h);
                final Context b = this.a.b;
                o = new StringBuilder();
                ((StringBuilder)o).append(action);
                ((StringBuilder)o).append(" (");
                ((StringBuilder)o).append(intExtra);
                ((StringBuilder)o).append(")");
                final PowerManager$WakeLock a2 = cst.a(b, ((StringBuilder)o).toString());
                try {
                    cms.a();
                    final StringBuilder sb = new StringBuilder("Acquiring operation wake lock (");
                    sb.append(action);
                    sb.append(") ");
                    sb.append(a2);
                    a2.acquire();
                    final cov a3 = this.a;
                    final coo f = a3.f;
                    final Intent h = a3.h;
                    final String action2 = h.getAction();
                    Label_1860: {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                            cms.a();
                            new StringBuilder("Handling constraints changed ").append(h);
                            final int a4 = coq.a;
                            final Context b2 = f.b;
                            final cpe cpe = new cpe(a3.e.j, null, null);
                            final List c = a3.e.d.w().c();
                            cop.a(b2, c);
                            cpe.a(c);
                            final ArrayList list = new ArrayList(c.size());
                            final long currentTimeMillis = System.currentTimeMillis();
                            for (final crh crh : c) {
                                final String c2 = crh.c;
                                if (currentTimeMillis >= crh.a() && (!crh.c() || cpe.c(c2))) {
                                    list.add((Object)crh);
                                }
                            }
                            while (i < list.size()) {
                                final crh crh2 = (crh)list.get(i);
                                final String c3 = crh2.c;
                                final Intent c4 = coo.c(b2, chu.j(crh2));
                                cms.a();
                                ((Executor)a3.j.a).execute(new cot(a3, c4, intExtra));
                                ++i;
                            }
                            cpe.b();
                        }
                        else if ("ACTION_RESCHEDULE".equals(action2)) {
                            cms.a();
                            new StringBuilder("Handling reschedule ").append(h);
                            a3.e.m();
                        }
                        else {
                            final Bundle extras = h.getExtras();
                            Label_1804: {
                                if (extras != null) {
                                    if (!extras.isEmpty()) {
                                        for (int j = 0; j <= 0; ++j) {
                                            if (extras.get((new String[] { "KEY_WORKSPEC_ID" })[j]) == null) {
                                                break Label_1804;
                                            }
                                        }
                                        if ("ACTION_SCHEDULE_WORK".equals(action2)) {
                                            final cqw g2 = coo.g(h);
                                            cms.a();
                                            final StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Handling schedule work for ");
                                            sb2.append(g2);
                                            g2.toString();
                                            final WorkDatabase d = a3.e.d;
                                            ((cft)d).k();
                                            try {
                                                final crh a5 = d.w().a(g2.a);
                                                if (a5 == null) {
                                                    cms.a();
                                                    final String a6 = coo.a;
                                                    final StringBuilder sb3 = new StringBuilder();
                                                    sb3.append("Skipping scheduling ");
                                                    sb3.append(g2);
                                                    sb3.append(" because it's no longer in the DB");
                                                    Log.w(a6, sb3.toString());
                                                }
                                                else if (cht.d(a5.t)) {
                                                    cms.a();
                                                    final String a7 = coo.a;
                                                    final StringBuilder sb4 = new StringBuilder();
                                                    sb4.append("Skipping scheduling ");
                                                    sb4.append(g2);
                                                    sb4.append("because it is finished.");
                                                    Log.w(a7, sb4.toString());
                                                }
                                                else {
                                                    final long a8 = a5.a();
                                                    if (!a5.c()) {
                                                        cms.a();
                                                        final StringBuilder sb5 = new StringBuilder();
                                                        sb5.append("Setting up Alarms for ");
                                                        sb5.append(g2);
                                                        sb5.append("at ");
                                                        con.b(f.b, d, g2, a8);
                                                    }
                                                    else {
                                                        cms.a();
                                                        final StringBuilder sb6 = new StringBuilder();
                                                        sb6.append("Opportunistically setting an alarm for ");
                                                        sb6.append(g2);
                                                        sb6.append("at ");
                                                        con.b(f.b, d, g2, a8);
                                                        ((Executor)a3.j.a).execute(new cot(a3, coo.b(f.b), intExtra));
                                                    }
                                                    ((cft)d).n();
                                                }
                                                break Label_1860;
                                            }
                                            finally {
                                                ((cft)d).l();
                                            }
                                        }
                                        if ("ACTION_DELAY_MET".equals(action2)) {
                                            synchronized (f.d) {
                                                final cqw g3 = coo.g(h);
                                                cms.a();
                                                final StringBuilder sb7 = new StringBuilder();
                                                sb7.append("Handing delay met for ");
                                                sb7.append(g3);
                                                if (!f.c.containsKey(g3)) {
                                                    final cor cor = new cor(f.b, intExtra, a3, f.e.V(g3), null, null);
                                                    f.c.put(g3, cor);
                                                    final String a9 = cor.c.a;
                                                    final Context a10 = cor.a;
                                                    final StringBuilder sb8 = new StringBuilder();
                                                    sb8.append(a9);
                                                    sb8.append(" (");
                                                    sb8.append(cor.b);
                                                    sb8.append(")");
                                                    cor.i = cst.a(a10, sb8.toString());
                                                    cms.a();
                                                    final StringBuilder sb9 = new StringBuilder();
                                                    sb9.append("Acquiring wakelock ");
                                                    sb9.append(cor.i);
                                                    sb9.append("for WorkSpec ");
                                                    cor.i.acquire();
                                                    final crh a11 = cor.d.e.d.w().a(a9);
                                                    if (a11 == null) {
                                                        cor.g.execute((Runnable)new cdj(cor, 12));
                                                    }
                                                    else if (!(cor.j = a11.c())) {
                                                        cms.a();
                                                        cor.e(Collections.singletonList(a11));
                                                    }
                                                    else {
                                                        cor.e.a(Collections.singletonList(a11));
                                                    }
                                                }
                                                else {
                                                    cms.a();
                                                    final StringBuilder sb10 = new StringBuilder();
                                                    sb10.append("WorkSpec ");
                                                    sb10.append(g3);
                                                }
                                                break Label_1860;
                                            }
                                        }
                                        if ("ACTION_STOP_WORK".equals(action2)) {
                                            final Bundle extras2 = h.getExtras();
                                            final String string = extras2.getString("KEY_WORKSPEC_ID");
                                            List o2;
                                            if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                                                final int int1 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                                                final ArrayList list2 = new ArrayList(1);
                                                final avu u = f.e.U(new cqw(string, int1));
                                                o2 = list2;
                                                if (u != null) {
                                                    list2.add(u);
                                                    o2 = list2;
                                                }
                                            }
                                            else {
                                                o2 = f.e.o(string);
                                            }
                                            for (final avu avu : o2) {
                                                cms.a();
                                                a3.e.p(avu);
                                                con.a(f.b, a3.e.d, (cqw)avu.a);
                                                a3.a((cqw)avu.a, false);
                                            }
                                            break Label_1860;
                                        }
                                        if ("ACTION_EXECUTION_COMPLETED".equals(action2)) {
                                            final cqw g4 = coo.g(h);
                                            final boolean boolean1 = h.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                                            cms.a();
                                            final StringBuilder sb11 = new StringBuilder();
                                            sb11.append("Handling onExecutionCompleted ");
                                            sb11.append(h);
                                            sb11.append(", ");
                                            f.a(g4, boolean1);
                                            break Label_1860;
                                        }
                                        cms.a();
                                        final String a12 = coo.a;
                                        final StringBuilder sb12 = new StringBuilder();
                                        sb12.append("Ignoring intent ");
                                        sb12.append(h);
                                        Log.w(a12, "Ignoring intent ".concat(String.valueOf(h)));
                                        break Label_1860;
                                    }
                                }
                            }
                            cms.a();
                            final String a13 = coo.a;
                            final StringBuilder sb13 = new StringBuilder();
                            sb13.append("Invalid request for ");
                            sb13.append(action2);
                            sb13.append(" , requires KEY_WORKSPEC_ID .");
                            Log.e(a13, sb13.toString());
                        }
                    }
                    cms.a();
                    final StringBuilder sb14 = new StringBuilder("Releasing operation wake lock (");
                    sb14.append(action);
                    sb14.append(") ");
                    sb14.append(a2);
                    a2.release();
                    final cov a14 = this.a;
                    final Object o3 = a14.j.a;
                    o = new so(a14, 4);
                    ((Executor)o3).execute((Runnable)o);
                }
                finally {
                    try {
                        cms.a();
                        Log.e(cov.a, "Unexpected error in onHandleIntent", (Throwable)o);
                        cms.a();
                        final StringBuilder sb15 = new StringBuilder("Releasing operation wake lock (");
                        sb15.append(action);
                        sb15.append(") ");
                        sb15.append(a2);
                        a2.release();
                        final cov a15 = this.a;
                        final Object a16 = a15.j.a;
                        final so so = new so(a15, 4);
                    }
                    finally {
                        cms.a();
                        final StringBuilder sb16 = new StringBuilder("Releasing operation wake lock (");
                        sb16.append(action);
                        sb16.append(") ");
                        sb16.append(a2);
                        a2.release();
                        final Object o3 = this.a;
                        ((Executor)((cov)o3).j.a).execute((Runnable)new so((cov)o3, 4));
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
