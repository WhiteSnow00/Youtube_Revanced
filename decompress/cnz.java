import java.util.Iterator;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cnz
{
    static {
        cmv.b("Schedulers");
    }
    
    static cny a(final Context context, final coi coi) {
        final cpa cpa = new cpa(context, coi);
        csp.a(context, (Class)SystemJobService.class, true);
        cmv.a();
        return (cny)cpa;
    }
    
    public static void b(final cmg cmg, WorkDatabase iterator, final List list) {
        if (list != null) {
            if (list.size() != 0) {
                final crl w = iterator.w();
                ((cfw)iterator).k();
                try {
                    final int j = cmg.j;
                    final cfy a = cfy.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
                    a.e(1, 20L);
                    ((crz)w).a.j();
                    final Cursor e = byp.e(((crz)w).a, (cgv)a, false);
                    try {
                        final int d = bsj.d(e, "id");
                        final int d2 = bsj.d(e, "state");
                        final int d3 = bsj.d(e, "worker_class_name");
                        final int d4 = bsj.d(e, "input_merger_class_name");
                        final int d5 = bsj.d(e, "input");
                        final int d6 = bsj.d(e, "output");
                        final int d7 = bsj.d(e, "initial_delay");
                        final int d8 = bsj.d(e, "interval_duration");
                        final int d9 = bsj.d(e, "flex_duration");
                        final int d10 = bsj.d(e, "run_attempt_count");
                        final int d11 = bsj.d(e, "backoff_policy");
                        final int d12 = bsj.d(e, "backoff_delay_duration");
                        final int d13 = bsj.d(e, "last_enqueue_time");
                        final crl crl = w;
                        final int d14 = bsj.d(e, "minimum_retention_duration");
                        try {
                            final int d15 = bsj.d(e, "schedule_requested_at");
                            final int d16 = bsj.d(e, "run_in_foreground");
                            final int d17 = bsj.d(e, "out_of_quota_policy");
                            final int d18 = bsj.d(e, "period_count");
                            final int d19 = bsj.d(e, "generation");
                            final int d20 = bsj.d(e, "required_network_type");
                            final int d21 = bsj.d(e, "requires_charging");
                            final int d22 = bsj.d(e, "requires_device_idle");
                            final int d23 = bsj.d(e, "requires_battery_not_low");
                            final int d24 = bsj.d(e, "requires_storage_not_low");
                            final int d25 = bsj.d(e, "trigger_content_update_delay");
                            final int d26 = bsj.d(e, "trigger_max_content_delay");
                            final int d27 = bsj.d(e, "content_uri_triggers");
                            final ArrayList list2 = new ArrayList(e.getCount());
                            while (e.moveToNext()) {
                                final boolean null = e.isNull(d);
                                final byte[] array = null;
                                String string;
                                if (null) {
                                    string = null;
                                }
                                else {
                                    string = e.getString(d);
                                }
                                final int h = ciy.h(e.getInt(d2));
                                String string2;
                                if (e.isNull(d3)) {
                                    string2 = null;
                                }
                                else {
                                    string2 = e.getString(d3);
                                }
                                String string3;
                                if (e.isNull(d4)) {
                                    string3 = null;
                                }
                                else {
                                    string3 = e.getString(d4);
                                }
                                byte[] blob;
                                if (e.isNull(d5)) {
                                    blob = null;
                                }
                                else {
                                    blob = e.getBlob(d5);
                                }
                                final cml a2 = cml.a(blob);
                                byte[] blob2;
                                if (e.isNull(d6)) {
                                    blob2 = null;
                                }
                                else {
                                    blob2 = e.getBlob(d6);
                                }
                                final cml a3 = cml.a(blob2);
                                final long long1 = e.getLong(d7);
                                final long long2 = e.getLong(d8);
                                final long long3 = e.getLong(d9);
                                final int int1 = e.getInt(d10);
                                final int i = ciy.i(e.getInt(d11));
                                final long long4 = e.getLong(d12);
                                final long long5 = e.getLong(d13);
                                final long long6 = e.getLong(d14);
                                final long long7 = e.getLong(d15);
                                final boolean b = e.getInt(d16) != 0;
                                final int k = ciy.j(e.getInt(d17));
                                final int int2 = e.getInt(d18);
                                final int int3 = e.getInt(d19);
                                final int g = ciy.g(e.getInt(d20));
                                final boolean b2 = e.getInt(d21) != 0;
                                final boolean b3 = e.getInt(d22) != 0;
                                final boolean b4 = e.getInt(d23) != 0;
                                final boolean b5 = e.getInt(d24) != 0;
                                final long long8 = e.getLong(d25);
                                final long long9 = e.getLong(d26);
                                byte[] blob3;
                                if (e.isNull(d27)) {
                                    blob3 = array;
                                }
                                else {
                                    blob3 = e.getBlob(d27);
                                }
                                list2.add((Object)new crk(string, h, string2, string3, a2, a3, long1, long2, long3, new cmi(g, b2, b3, b4, b5, long8, long9, ciy.e(blob3)), int1, i, long4, long5, long6, long7, b, k, int2, int3));
                            }
                            e.close();
                            a.j();
                            final List l = crl.i();
                            if (list2.size() > 0) {
                                final long currentTimeMillis = System.currentTimeMillis();
                                final Iterator iterator2 = list2.iterator();
                                while (iterator2.hasNext()) {
                                    crl.j(((crk)iterator2.next()).c, currentTimeMillis);
                                }
                            }
                            ((cfw)iterator).n();
                            ((cfw)iterator).l();
                            if (list2.size() > 0) {
                                final crk[] array2 = (crk[])list2.toArray((Object[])new crk[list2.size()]);
                                final Iterator iterator3 = list.iterator();
                                while (iterator3.hasNext()) {
                                    iterator = (WorkDatabase)iterator3.next();
                                    if (((cny)iterator).d()) {
                                        ((cny)iterator).c(array2);
                                    }
                                }
                            }
                            if (l.size() > 0) {
                                final crk[] array3 = l.toArray(new crk[l.size()]);
                                iterator = (WorkDatabase)list.iterator();
                                while (((Iterator)iterator).hasNext()) {
                                    final cny cny = ((Iterator<cny>)iterator).next();
                                    if (!cny.d()) {
                                        cny.c(array3);
                                    }
                                }
                            }
                            return;
                        }
                        finally {}
                    }
                    finally {}
                    e.close();
                    a.j();
                }
                finally {
                    ((cfw)iterator).l();
                }
            }
        }
    }
}
