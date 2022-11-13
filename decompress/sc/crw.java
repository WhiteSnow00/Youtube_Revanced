import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class crw implements cri
{
    public final cft a;
    public final cfq b;
    public final cfy c;
    public final cfy d;
    public final cfy e;
    public final cfy f;
    private final cfy g;
    private final cfy h;
    private final cfy i;
    private final cfy j;
    private final cfy k;
    
    public crw(final cft a) {
        this.a = a;
        this.b = (cfq)new crn(a);
        new cro(a);
        this.g = (cfy)new crp(a);
        this.h = (cfy)new crq(a);
        this.c = (cfy)new crr(a);
        this.i = (cfy)new crs(a);
        this.j = (cfy)new crt(a);
        this.d = (cfy)new cru(a);
        this.e = (cfy)new crv(a);
        this.k = (cfy)new crj(a);
        this.f = (cfy)new crk(a);
        new crl(a);
        new crm(a);
    }
    
    public final crh a(String string) {
        final cfv a = cfv.a("SELECT * FROM workspec WHERE id=?", 1);
        if (string == null) {
            a.f(1);
        }
        else {
            a.g(1, string);
        }
        this.a.j();
        final Cursor d = bsg.d(this.a, (cgs)a, false);
        try {
            final int f = bsg.f(d, "id");
            final int f2 = bsg.f(d, "state");
            final int f3 = bsg.f(d, "worker_class_name");
            final int f4 = bsg.f(d, "input_merger_class_name");
            final int f5 = bsg.f(d, "input");
            final int f6 = bsg.f(d, "output");
            final int f7 = bsg.f(d, "initial_delay");
            final int f8 = bsg.f(d, "interval_duration");
            final int f9 = bsg.f(d, "flex_duration");
            final int f10 = bsg.f(d, "run_attempt_count");
            final int f11 = bsg.f(d, "backoff_policy");
            final int f12 = bsg.f(d, "backoff_delay_duration");
            final int f13 = bsg.f(d, "last_enqueue_time");
            final int f14 = bsg.f(d, "minimum_retention_duration");
            try {
                final int f15 = bsg.f(d, "schedule_requested_at");
                final int f16 = bsg.f(d, "run_in_foreground");
                final int f17 = bsg.f(d, "out_of_quota_policy");
                final int f18 = bsg.f(d, "period_count");
                final int f19 = bsg.f(d, "generation");
                final int f20 = bsg.f(d, "required_network_type");
                final int f21 = bsg.f(d, "requires_charging");
                final int f22 = bsg.f(d, "requires_device_idle");
                final int f23 = bsg.f(d, "requires_battery_not_low");
                final int f24 = bsg.f(d, "requires_storage_not_low");
                final int f25 = bsg.f(d, "trigger_content_update_delay");
                final int f26 = bsg.f(d, "trigger_max_content_delay");
                final int f27 = bsg.f(d, "content_uri_triggers");
                final boolean moveToFirst = d.moveToFirst();
                crh crh = null;
                final byte[] array = null;
                if (moveToFirst) {
                    if (d.isNull(f)) {
                        string = null;
                    }
                    else {
                        string = d.getString(f);
                    }
                    final int g = chu.g(d.getInt(f2));
                    String string2;
                    if (d.isNull(f3)) {
                        string2 = null;
                    }
                    else {
                        string2 = d.getString(f3);
                    }
                    String string3;
                    if (d.isNull(f4)) {
                        string3 = null;
                    }
                    else {
                        string3 = d.getString(f4);
                    }
                    byte[] blob;
                    if (d.isNull(f5)) {
                        blob = null;
                    }
                    else {
                        blob = d.getBlob(f5);
                    }
                    final cmi a2 = cmi.a(blob);
                    byte[] blob2;
                    if (d.isNull(f6)) {
                        blob2 = null;
                    }
                    else {
                        blob2 = d.getBlob(f6);
                    }
                    final cmi a3 = cmi.a(blob2);
                    final long long1 = d.getLong(f7);
                    final long long2 = d.getLong(f8);
                    final long long3 = d.getLong(f9);
                    final int int1 = d.getInt(f10);
                    final int h = chu.h(d.getInt(f11));
                    final long long4 = d.getLong(f12);
                    final long long5 = d.getLong(f13);
                    final long long6 = d.getLong(f14);
                    final long long7 = d.getLong(f15);
                    final boolean b = d.getInt(f16) != 0;
                    final int i = chu.i(d.getInt(f17));
                    final int int2 = d.getInt(f18);
                    final int int3 = d.getInt(f19);
                    final int f28 = chu.f(d.getInt(f20));
                    final boolean b2 = d.getInt(f21) != 0;
                    final boolean b3 = d.getInt(f22) != 0;
                    final boolean b4 = d.getInt(f23) != 0;
                    final boolean b5 = d.getInt(f24) != 0;
                    final long long8 = d.getLong(f25);
                    final long long9 = d.getLong(f26);
                    byte[] blob3;
                    if (d.isNull(f27)) {
                        blob3 = array;
                    }
                    else {
                        blob3 = d.getBlob(f27);
                    }
                    crh = new crh(string, g, string2, string3, a2, a3, long1, long2, long3, new cmf(f28, b2, b3, b4, b5, long8, long9, chu.d(blob3)), int1, h, long4, long5, long6, long7, b, i, int2, int3);
                }
                d.close();
                a.j();
                return crh;
            }
            finally {}
        }
        finally {}
        d.close();
        a.j();
    }
    
    public final List b() {
        final cfv a = cfv.a("SELECT * FROM workspec WHERE state=1", 0);
        this.a.j();
        final Cursor d = bsg.d(this.a, (cgs)a, false);
        try {
            final int f = bsg.f(d, "id");
            final int f2 = bsg.f(d, "state");
            final int f3 = bsg.f(d, "worker_class_name");
            final int f4 = bsg.f(d, "input_merger_class_name");
            final int f5 = bsg.f(d, "input");
            final int f6 = bsg.f(d, "output");
            final int f7 = bsg.f(d, "initial_delay");
            final int f8 = bsg.f(d, "interval_duration");
            final int f9 = bsg.f(d, "flex_duration");
            final int f10 = bsg.f(d, "run_attempt_count");
            final int f11 = bsg.f(d, "backoff_policy");
            final int f12 = bsg.f(d, "backoff_delay_duration");
            final int f13 = bsg.f(d, "last_enqueue_time");
            final int f14 = bsg.f(d, "minimum_retention_duration");
            try {
                final int f15 = bsg.f(d, "schedule_requested_at");
                final int f16 = bsg.f(d, "run_in_foreground");
                final int f17 = bsg.f(d, "out_of_quota_policy");
                final int f18 = bsg.f(d, "period_count");
                final int f19 = bsg.f(d, "generation");
                final int f20 = bsg.f(d, "required_network_type");
                final int f21 = bsg.f(d, "requires_charging");
                final int f22 = bsg.f(d, "requires_device_idle");
                final int f23 = bsg.f(d, "requires_battery_not_low");
                final int f24 = bsg.f(d, "requires_storage_not_low");
                final int f25 = bsg.f(d, "trigger_content_update_delay");
                final int f26 = bsg.f(d, "trigger_max_content_delay");
                final int f27 = bsg.f(d, "content_uri_triggers");
                final ArrayList list = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    final boolean null = d.isNull(f);
                    final byte[] array = null;
                    String string;
                    if (null) {
                        string = null;
                    }
                    else {
                        string = d.getString(f);
                    }
                    final int g = chu.g(d.getInt(f2));
                    String string2;
                    if (d.isNull(f3)) {
                        string2 = null;
                    }
                    else {
                        string2 = d.getString(f3);
                    }
                    String string3;
                    if (d.isNull(f4)) {
                        string3 = null;
                    }
                    else {
                        string3 = d.getString(f4);
                    }
                    byte[] blob;
                    if (d.isNull(f5)) {
                        blob = null;
                    }
                    else {
                        blob = d.getBlob(f5);
                    }
                    final cmi a2 = cmi.a(blob);
                    byte[] blob2;
                    if (d.isNull(f6)) {
                        blob2 = null;
                    }
                    else {
                        blob2 = d.getBlob(f6);
                    }
                    final cmi a3 = cmi.a(blob2);
                    final long long1 = d.getLong(f7);
                    final long long2 = d.getLong(f8);
                    final long long3 = d.getLong(f9);
                    final int int1 = d.getInt(f10);
                    final int h = chu.h(d.getInt(f11));
                    final long long4 = d.getLong(f12);
                    final long long5 = d.getLong(f13);
                    final long long6 = d.getLong(f14);
                    final long long7 = d.getLong(f15);
                    final boolean b = d.getInt(f16) != 0;
                    final int i = chu.i(d.getInt(f17));
                    final int int2 = d.getInt(f18);
                    final int int3 = d.getInt(f19);
                    final int f28 = chu.f(d.getInt(f20));
                    final boolean b2 = d.getInt(f21) != 0;
                    final boolean b3 = d.getInt(f22) != 0;
                    final boolean b4 = d.getInt(f23) != 0;
                    final boolean b5 = d.getInt(f24) != 0;
                    final long long8 = d.getLong(f25);
                    final long long9 = d.getLong(f26);
                    byte[] blob3;
                    if (d.isNull(f27)) {
                        blob3 = array;
                    }
                    else {
                        blob3 = d.getBlob(f27);
                    }
                    list.add((Object)new crh(string, g, string2, string3, a2, a3, long1, long2, long3, new cmf(f28, b2, b3, b4, b5, long8, long9, chu.d(blob3)), int1, h, long4, long5, long6, long7, b, i, int2, int3));
                }
                d.close();
                a.j();
                return list;
            }
            finally {}
        }
        finally {}
        d.close();
        a.j();
        throw;
    }
    
    public final List c() {
        final cfv a = cfv.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.j();
        final Cursor d = bsg.d(this.a, (cgs)a, false);
        try {
            final int f = bsg.f(d, "id");
            final int f2 = bsg.f(d, "state");
            final int f3 = bsg.f(d, "worker_class_name");
            final int f4 = bsg.f(d, "input_merger_class_name");
            final int f5 = bsg.f(d, "input");
            final int f6 = bsg.f(d, "output");
            final int f7 = bsg.f(d, "initial_delay");
            final int f8 = bsg.f(d, "interval_duration");
            final int f9 = bsg.f(d, "flex_duration");
            final int f10 = bsg.f(d, "run_attempt_count");
            final int f11 = bsg.f(d, "backoff_policy");
            final int f12 = bsg.f(d, "backoff_delay_duration");
            final int f13 = bsg.f(d, "last_enqueue_time");
            final int f14 = bsg.f(d, "minimum_retention_duration");
            try {
                final int f15 = bsg.f(d, "schedule_requested_at");
                final int f16 = bsg.f(d, "run_in_foreground");
                final int f17 = bsg.f(d, "out_of_quota_policy");
                final int f18 = bsg.f(d, "period_count");
                final int f19 = bsg.f(d, "generation");
                final int f20 = bsg.f(d, "required_network_type");
                final int f21 = bsg.f(d, "requires_charging");
                final int f22 = bsg.f(d, "requires_device_idle");
                final int f23 = bsg.f(d, "requires_battery_not_low");
                final int f24 = bsg.f(d, "requires_storage_not_low");
                final int f25 = bsg.f(d, "trigger_content_update_delay");
                final int f26 = bsg.f(d, "trigger_max_content_delay");
                final int f27 = bsg.f(d, "content_uri_triggers");
                final ArrayList list = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    final boolean null = d.isNull(f);
                    final byte[] array = null;
                    String string;
                    if (null) {
                        string = null;
                    }
                    else {
                        string = d.getString(f);
                    }
                    final int g = chu.g(d.getInt(f2));
                    String string2;
                    if (d.isNull(f3)) {
                        string2 = null;
                    }
                    else {
                        string2 = d.getString(f3);
                    }
                    String string3;
                    if (d.isNull(f4)) {
                        string3 = null;
                    }
                    else {
                        string3 = d.getString(f4);
                    }
                    byte[] blob;
                    if (d.isNull(f5)) {
                        blob = null;
                    }
                    else {
                        blob = d.getBlob(f5);
                    }
                    final cmi a2 = cmi.a(blob);
                    byte[] blob2;
                    if (d.isNull(f6)) {
                        blob2 = null;
                    }
                    else {
                        blob2 = d.getBlob(f6);
                    }
                    final cmi a3 = cmi.a(blob2);
                    final long long1 = d.getLong(f7);
                    final long long2 = d.getLong(f8);
                    final long long3 = d.getLong(f9);
                    final int int1 = d.getInt(f10);
                    final int h = chu.h(d.getInt(f11));
                    final long long4 = d.getLong(f12);
                    final long long5 = d.getLong(f13);
                    final long long6 = d.getLong(f14);
                    final long long7 = d.getLong(f15);
                    final boolean b = d.getInt(f16) != 0;
                    final int i = chu.i(d.getInt(f17));
                    final int int2 = d.getInt(f18);
                    final int int3 = d.getInt(f19);
                    final int f28 = chu.f(d.getInt(f20));
                    final boolean b2 = d.getInt(f21) != 0;
                    final boolean b3 = d.getInt(f22) != 0;
                    final boolean b4 = d.getInt(f23) != 0;
                    final boolean b5 = d.getInt(f24) != 0;
                    final long long8 = d.getLong(f25);
                    final long long9 = d.getLong(f26);
                    byte[] blob3;
                    if (d.isNull(f27)) {
                        blob3 = array;
                    }
                    else {
                        blob3 = d.getBlob(f27);
                    }
                    list.add((Object)new crh(string, g, string2, string3, a2, a3, long1, long2, long3, new cmf(f28, b2, b3, b4, b5, long8, long9, chu.d(blob3)), int1, h, long4, long5, long6, long7, b, i, int2, int3));
                }
                d.close();
                a.j();
                return list;
            }
            finally {}
        }
        finally {}
        d.close();
        a.j();
        throw;
    }
    
    public final List d(String string) {
        final cfv a = cfv.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (string == null) {
            a.f(1);
        }
        else {
            a.g(1, string);
        }
        this.a.j();
        final Cursor d = bsg.d(this.a, (cgs)a, false);
        try {
            final ArrayList list = new ArrayList(d.getCount());
            while (d.moveToNext()) {
                if (d.isNull(0)) {
                    string = null;
                }
                else {
                    string = d.getString(0);
                }
                list.add((Object)new crf(string, chu.g(d.getInt(1))));
            }
            d.close();
            a.j();
            return list;
        }
        finally {
            d.close();
            a.j();
            while (true) {}
        }
    }
    
    public final void e(final String s) {
        this.a.j();
        final chc d = this.g.d();
        d.g(1, s);
        this.a.k();
        try {
            d.b();
            this.a.n();
        }
        finally {
            this.a.l();
            this.g.f(d);
        }
    }
    
    public final void f(final String s, final long n) {
        this.a.j();
        final chc d = this.j.d();
        d.e(1, n);
        if (s == null) {
            d.f(2);
        }
        else {
            d.g(2, s);
        }
        this.a.k();
        try {
            d.b();
            this.a.n();
        }
        finally {
            this.a.l();
            this.j.f(d);
        }
    }
    
    public final void g(final String s, final cmi cmi) {
        this.a.j();
        final chc d = this.i.d();
        final byte[] e = cmi.e(cmi);
        if (e == null) {
            d.f(1);
        }
        else {
            d.c(1, e);
        }
        d.g(2, s);
        this.a.k();
        try {
            d.b();
            this.a.n();
        }
        finally {
            this.a.l();
            this.i.f(d);
        }
    }
    
    public final int h(final String s) {
        final cfv a = cfv.a("SELECT state FROM workspec WHERE id=?", 1);
        if (s == null) {
            a.f(1);
        }
        else {
            a.g(1, s);
        }
        this.a.j();
        final cft a2 = this.a;
        final boolean b = false;
        final Cursor d = bsg.d(a2, (cgs)a, false);
        int g = b ? 1 : 0;
        try {
            if (d.moveToFirst()) {
                Integer value;
                if (d.isNull(0)) {
                    value = null;
                }
                else {
                    value = d.getInt(0);
                }
                if (value == null) {
                    g = (b ? 1 : 0);
                }
                else {
                    g = chu.g((int)value);
                }
            }
            return g;
        }
        finally {
            d.close();
            a.j();
        }
    }
    
    public final List i() {
        final cfv a = cfv.a("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        a.e(1, 200L);
        this.a.j();
        final Cursor d = bsg.d(this.a, (cgs)a, false);
        try {
            final int f = bsg.f(d, "id");
            final int f2 = bsg.f(d, "state");
            final int f3 = bsg.f(d, "worker_class_name");
            final int f4 = bsg.f(d, "input_merger_class_name");
            final int f5 = bsg.f(d, "input");
            final int f6 = bsg.f(d, "output");
            final int f7 = bsg.f(d, "initial_delay");
            final int f8 = bsg.f(d, "interval_duration");
            final int f9 = bsg.f(d, "flex_duration");
            final int f10 = bsg.f(d, "run_attempt_count");
            final int f11 = bsg.f(d, "backoff_policy");
            final int f12 = bsg.f(d, "backoff_delay_duration");
            final int f13 = bsg.f(d, "last_enqueue_time");
            final int f14 = bsg.f(d, "minimum_retention_duration");
            try {
                final int f15 = bsg.f(d, "schedule_requested_at");
                final int f16 = bsg.f(d, "run_in_foreground");
                final int f17 = bsg.f(d, "out_of_quota_policy");
                final int f18 = bsg.f(d, "period_count");
                final int f19 = bsg.f(d, "generation");
                final int f20 = bsg.f(d, "required_network_type");
                final int f21 = bsg.f(d, "requires_charging");
                final int f22 = bsg.f(d, "requires_device_idle");
                final int f23 = bsg.f(d, "requires_battery_not_low");
                final int f24 = bsg.f(d, "requires_storage_not_low");
                final int f25 = bsg.f(d, "trigger_content_update_delay");
                final int f26 = bsg.f(d, "trigger_max_content_delay");
                final int f27 = bsg.f(d, "content_uri_triggers");
                final ArrayList list = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    final boolean null = d.isNull(f);
                    final byte[] array = null;
                    String string;
                    if (null) {
                        string = null;
                    }
                    else {
                        string = d.getString(f);
                    }
                    final int g = chu.g(d.getInt(f2));
                    String string2;
                    if (d.isNull(f3)) {
                        string2 = null;
                    }
                    else {
                        string2 = d.getString(f3);
                    }
                    String string3;
                    if (d.isNull(f4)) {
                        string3 = null;
                    }
                    else {
                        string3 = d.getString(f4);
                    }
                    byte[] blob;
                    if (d.isNull(f5)) {
                        blob = null;
                    }
                    else {
                        blob = d.getBlob(f5);
                    }
                    final cmi a2 = cmi.a(blob);
                    byte[] blob2;
                    if (d.isNull(f6)) {
                        blob2 = null;
                    }
                    else {
                        blob2 = d.getBlob(f6);
                    }
                    final cmi a3 = cmi.a(blob2);
                    final long long1 = d.getLong(f7);
                    final long long2 = d.getLong(f8);
                    final long long3 = d.getLong(f9);
                    final int int1 = d.getInt(f10);
                    final int h = chu.h(d.getInt(f11));
                    final long long4 = d.getLong(f12);
                    final long long5 = d.getLong(f13);
                    final long long6 = d.getLong(f14);
                    final long long7 = d.getLong(f15);
                    final boolean b = d.getInt(f16) != 0;
                    final int i = chu.i(d.getInt(f17));
                    final int int2 = d.getInt(f18);
                    final int int3 = d.getInt(f19);
                    final int f28 = chu.f(d.getInt(f20));
                    final boolean b2 = d.getInt(f21) != 0;
                    final boolean b3 = d.getInt(f22) != 0;
                    final boolean b4 = d.getInt(f23) != 0;
                    final boolean b5 = d.getInt(f24) != 0;
                    final long long8 = d.getLong(f25);
                    final long long9 = d.getLong(f26);
                    byte[] blob3;
                    if (d.isNull(f27)) {
                        blob3 = array;
                    }
                    else {
                        blob3 = d.getBlob(f27);
                    }
                    list.add((Object)new crh(string, g, string2, string3, a2, a3, long1, long2, long3, new cmf(f28, b2, b3, b4, b5, long8, long9, chu.d(blob3)), int1, h, long4, long5, long6, long7, b, i, int2, int3));
                }
                d.close();
                a.j();
                return list;
            }
            finally {}
        }
        finally {}
        d.close();
        a.j();
        throw;
    }
    
    public final void j(final String s, final long n) {
        this.a.j();
        final chc d = this.k.d();
        d.e(1, n);
        if (s == null) {
            d.f(2);
        }
        else {
            d.g(2, s);
        }
        this.a.k();
        try {
            d.b();
            this.a.n();
        }
        finally {
            this.a.l();
            this.k.f(d);
        }
    }
    
    public final void k(final int n, final String s) {
        this.a.j();
        final chc d = this.h.d();
        d.e(1, (long)chu.e(n));
        if (s == null) {
            d.f(2);
        }
        else {
            d.g(2, s);
        }
        this.a.k();
        try {
            d.b();
            this.a.n();
        }
        finally {
            this.a.l();
            this.h.f(d);
        }
    }
    
    public final void l(final abh abh) {
        final Set keySet = abh.keySet();
        if (!keySet.isEmpty()) {
            if (abh.d > 999) {
                abh abh2 = new abh(999);
                final int d = abh.d;
                int n = 0;
                int n2 = 0;
            Label_0046:
                while (true) {
                    n2 = 0;
                    int i = n;
                    while (i < d) {
                        abh2.put((Object)abh.c(i), (Object)abh.f(i));
                        n = i + 1;
                        final int n3 = n2 + 1;
                        i = n;
                        if ((n2 = n3) == 999) {
                            this.l(abh2);
                            abh2 = new abh(999);
                            continue Label_0046;
                        }
                    }
                    break;
                }
                if (n2 > 0) {
                    this.l(abh2);
                }
                return;
            }
            final StringBuilder g = bym.g();
            g.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            final int size = keySet.size();
            bym.h(g, size);
            g.append(")");
            final cfv a = cfv.a(g.toString(), size);
            final Iterator iterator = keySet.iterator();
            int n4 = 1;
            while (iterator.hasNext()) {
                final String s = (String)iterator.next();
                if (s == null) {
                    a.f(n4);
                }
                else {
                    a.g(n4, s);
                }
                ++n4;
            }
            final Cursor d2 = bsg.d(this.a, (cgs)a, false);
            try {
                final int e = bsg.e(d2, "work_spec_id");
                if (e != -1) {
                    while (d2.moveToNext()) {
                        final ArrayList list = (ArrayList)abh.get((Object)d2.getString(e));
                        if (list != null) {
                            byte[] blob;
                            if (d2.isNull(0)) {
                                blob = null;
                            }
                            else {
                                blob = d2.getBlob(0);
                            }
                            list.add(cmi.a(blob));
                        }
                    }
                }
            }
            finally {
                d2.close();
            }
        }
    }
    
    public final void m(final abh abh) {
        final Set keySet = abh.keySet();
        if (!keySet.isEmpty()) {
            if (abh.d > 999) {
                abh abh2 = new abh(999);
                final int d = abh.d;
                int i = 0;
                int n = 0;
            Label_0046:
                while (true) {
                    n = 0;
                    while (i < d) {
                        abh2.put((Object)abh.c(i), (Object)abh.f(i));
                        final int n2 = i + 1;
                        final int n3 = n + 1;
                        i = n2;
                        if ((n = n3) == 999) {
                            this.m(abh2);
                            abh2 = new abh(999);
                            i = n2;
                            continue Label_0046;
                        }
                    }
                    break;
                }
                if (n > 0) {
                    this.m(abh2);
                }
                return;
            }
            final StringBuilder g = bym.g();
            g.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            final int size = keySet.size();
            bym.h(g, size);
            g.append(")");
            final cfv a = cfv.a(g.toString(), size);
            final Iterator iterator = keySet.iterator();
            int n4 = 1;
            while (iterator.hasNext()) {
                final String s = (String)iterator.next();
                if (s == null) {
                    a.f(n4);
                }
                else {
                    a.g(n4, s);
                }
                ++n4;
            }
            final Cursor d2 = bsg.d(this.a, (cgs)a, false);
            try {
                final int e = bsg.e(d2, "work_spec_id");
                if (e != -1) {
                    while (d2.moveToNext()) {
                        final ArrayList list = (ArrayList)abh.get((Object)d2.getString(e));
                        if (list != null) {
                            String string;
                            if (d2.isNull(0)) {
                                string = null;
                            }
                            else {
                                string = d2.getString(0);
                            }
                            list.add(string);
                        }
                    }
                }
            }
            finally {
                d2.close();
            }
        }
    }
}
