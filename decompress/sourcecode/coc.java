import java.util.Set;
import java.util.Map;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import androidx.work.impl.WorkDatabase_Impl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class coc extends cft
{
    final /* synthetic */ WorkDatabase_Impl b;
    
    public coc(final WorkDatabase_Impl b) {
        this.b = b;
        super(16);
    }
    
    public final void a(final cgl cgl) {
        cgl.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cgl.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        cgl.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        cgl.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        cgl.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        cgl.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        cgl.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cgl.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        cgl.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cgl.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cgl.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        cgl.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cgl.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        cgl.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cgl.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }
    
    public final void b(final cgl cgl) {
        cgl.g("DROP TABLE IF EXISTS `Dependency`");
        cgl.g("DROP TABLE IF EXISTS `WorkSpec`");
        cgl.g("DROP TABLE IF EXISTS `WorkTag`");
        cgl.g("DROP TABLE IF EXISTS `SystemIdInfo`");
        cgl.g("DROP TABLE IF EXISTS `WorkName`");
        cgl.g("DROP TABLE IF EXISTS `WorkProgress`");
        cgl.g("DROP TABLE IF EXISTS `Preference`");
        final List f = this.b.f;
        if (f != null) {
            for (int size = f.size(), i = 0; i < size; ++i) {
                final bsa bsa = this.b.f.get(i);
            }
        }
    }
    
    public final void c(final cgl a) {
        (this.b.a = a).g("PRAGMA foreign_keys = ON");
        ((cfs)this.b).m(a);
        final List f = this.b.f;
        if (f != null) {
            for (int size = f.size(), i = 0; i < size; ++i) {
                ((bsa)this.b.f.get(i)).c(a);
            }
        }
    }
    
    public final void d(final cgl cgl) {
        bsf.c(cgl);
    }
    
    public final void e() {
        final List f = this.b.f;
        if (f != null) {
            for (int size = f.size(), i = 0; i < size; ++i) {
                final bsa bsa = this.b.f.get(i);
            }
        }
    }
    
    public final fwn f(final cgl cgl) {
        final HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new cfz("work_spec_id", "TEXT", true, 1, (String)null, 1));
        hashMap.put("prerequisite_id", new cfz("prerequisite_id", "TEXT", true, 2, (String)null, 1));
        final HashSet set = new HashSet(2);
        set.add(new cga("WorkSpec", "CASCADE", "CASCADE", (List)Arrays.asList("work_spec_id"), (List)Arrays.asList("id")));
        set.add(new cga("WorkSpec", "CASCADE", "CASCADE", (List)Arrays.asList("prerequisite_id"), (List)Arrays.asList("id")));
        final HashSet set2 = new HashSet(2);
        set2.add(new cgc("index_Dependency_work_spec_id", false, (List)Arrays.asList("work_spec_id"), (List)Arrays.asList("ASC")));
        set2.add(new cgc("index_Dependency_prerequisite_id", false, (List)Arrays.asList("prerequisite_id"), (List)Arrays.asList("ASC")));
        final cgd cgd = new cgd("Dependency", (Map)hashMap, (Set)set, (Set)set2);
        final cgd d = caw.d(cgl, "Dependency");
        if (!cgd.equals((Object)d)) {
            final StringBuilder sb = new StringBuilder("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
            sb.append(cgd);
            sb.append("\n Found:\n");
            sb.append(d);
            return new fwn(false, sb.toString());
        }
        final HashMap hashMap2 = new HashMap(27);
        hashMap2.put("id", new cfz("id", "TEXT", true, 1, (String)null, 1));
        hashMap2.put("state", new cfz("state", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("worker_class_name", new cfz("worker_class_name", "TEXT", true, 0, (String)null, 1));
        hashMap2.put("input_merger_class_name", new cfz("input_merger_class_name", "TEXT", false, 0, (String)null, 1));
        hashMap2.put("input", new cfz("input", "BLOB", true, 0, (String)null, 1));
        hashMap2.put("output", new cfz("output", "BLOB", true, 0, (String)null, 1));
        hashMap2.put("initial_delay", new cfz("initial_delay", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("interval_duration", new cfz("interval_duration", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("flex_duration", new cfz("flex_duration", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("run_attempt_count", new cfz("run_attempt_count", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("backoff_policy", new cfz("backoff_policy", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("backoff_delay_duration", new cfz("backoff_delay_duration", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("last_enqueue_time", new cfz("last_enqueue_time", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("minimum_retention_duration", new cfz("minimum_retention_duration", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("schedule_requested_at", new cfz("schedule_requested_at", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("run_in_foreground", new cfz("run_in_foreground", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("out_of_quota_policy", new cfz("out_of_quota_policy", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("period_count", new cfz("period_count", "INTEGER", true, 0, "0", 1));
        hashMap2.put("generation", new cfz("generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("required_network_type", new cfz("required_network_type", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("requires_charging", new cfz("requires_charging", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("requires_device_idle", new cfz("requires_device_idle", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("requires_battery_not_low", new cfz("requires_battery_not_low", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("requires_storage_not_low", new cfz("requires_storage_not_low", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("trigger_content_update_delay", new cfz("trigger_content_update_delay", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("trigger_max_content_delay", new cfz("trigger_max_content_delay", "INTEGER", true, 0, (String)null, 1));
        hashMap2.put("content_uri_triggers", new cfz("content_uri_triggers", "BLOB", true, 0, (String)null, 1));
        final HashSet set3 = new HashSet(0);
        final HashSet set4 = new HashSet(2);
        set4.add(new cgc("index_WorkSpec_schedule_requested_at", false, (List)Arrays.asList("schedule_requested_at"), (List)Arrays.asList("ASC")));
        set4.add(new cgc("index_WorkSpec_last_enqueue_time", false, (List)Arrays.asList("last_enqueue_time"), (List)Arrays.asList("ASC")));
        final cgd cgd2 = new cgd("WorkSpec", (Map)hashMap2, (Set)set3, (Set)set4);
        final cgd d2 = caw.d(cgl, "WorkSpec");
        if (!cgd2.equals((Object)d2)) {
            final StringBuilder sb2 = new StringBuilder("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
            sb2.append(cgd2);
            sb2.append("\n Found:\n");
            sb2.append(d2);
            return new fwn(false, sb2.toString());
        }
        final HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new cfz("tag", "TEXT", true, 1, (String)null, 1));
        hashMap3.put("work_spec_id", new cfz("work_spec_id", "TEXT", true, 2, (String)null, 1));
        final HashSet set5 = new HashSet(1);
        set5.add(new cga("WorkSpec", "CASCADE", "CASCADE", (List)Arrays.asList("work_spec_id"), (List)Arrays.asList("id")));
        final HashSet set6 = new HashSet(1);
        set6.add(new cgc("index_WorkTag_work_spec_id", false, (List)Arrays.asList("work_spec_id"), (List)Arrays.asList("ASC")));
        final cgd cgd3 = new cgd("WorkTag", (Map)hashMap3, (Set)set5, (Set)set6);
        final cgd d3 = caw.d(cgl, "WorkTag");
        if (!cgd3.equals((Object)d3)) {
            final StringBuilder sb3 = new StringBuilder("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
            sb3.append(cgd3);
            sb3.append("\n Found:\n");
            sb3.append(d3);
            return new fwn(false, sb3.toString());
        }
        final HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new cfz("work_spec_id", "TEXT", true, 1, (String)null, 1));
        hashMap4.put("generation", new cfz("generation", "INTEGER", true, 2, "0", 1));
        hashMap4.put("system_id", new cfz("system_id", "INTEGER", true, 0, (String)null, 1));
        final HashSet set7 = new HashSet(1);
        set7.add(new cga("WorkSpec", "CASCADE", "CASCADE", (List)Arrays.asList("work_spec_id"), (List)Arrays.asList("id")));
        final cgd cgd4 = new cgd("SystemIdInfo", (Map)hashMap4, (Set)set7, (Set)new HashSet(0));
        final cgd d4 = caw.d(cgl, "SystemIdInfo");
        if (!cgd4.equals((Object)d4)) {
            final StringBuilder sb4 = new StringBuilder("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
            sb4.append(cgd4);
            sb4.append("\n Found:\n");
            sb4.append(d4);
            return new fwn(false, sb4.toString());
        }
        final HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new cfz("name", "TEXT", true, 1, (String)null, 1));
        hashMap5.put("work_spec_id", new cfz("work_spec_id", "TEXT", true, 2, (String)null, 1));
        final HashSet set8 = new HashSet(1);
        set8.add(new cga("WorkSpec", "CASCADE", "CASCADE", (List)Arrays.asList("work_spec_id"), (List)Arrays.asList("id")));
        final HashSet set9 = new HashSet(1);
        set9.add(new cgc("index_WorkName_work_spec_id", false, (List)Arrays.asList("work_spec_id"), (List)Arrays.asList("ASC")));
        final cgd cgd5 = new cgd("WorkName", (Map)hashMap5, (Set)set8, (Set)set9);
        final cgd d5 = caw.d(cgl, "WorkName");
        if (!cgd5.equals((Object)d5)) {
            final StringBuilder sb5 = new StringBuilder("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
            sb5.append(cgd5);
            sb5.append("\n Found:\n");
            sb5.append(d5);
            return new fwn(false, sb5.toString());
        }
        final HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new cfz("work_spec_id", "TEXT", true, 1, (String)null, 1));
        hashMap6.put("progress", new cfz("progress", "BLOB", true, 0, (String)null, 1));
        final HashSet set10 = new HashSet(1);
        set10.add(new cga("WorkSpec", "CASCADE", "CASCADE", (List)Arrays.asList("work_spec_id"), (List)Arrays.asList("id")));
        final cgd cgd6 = new cgd("WorkProgress", (Map)hashMap6, (Set)set10, (Set)new HashSet(0));
        final cgd d6 = caw.d(cgl, "WorkProgress");
        if (!cgd6.equals((Object)d6)) {
            final StringBuilder sb6 = new StringBuilder("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
            sb6.append(cgd6);
            sb6.append("\n Found:\n");
            sb6.append(d6);
            return new fwn(false, sb6.toString());
        }
        final HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new cfz("key", "TEXT", true, 1, (String)null, 1));
        hashMap7.put("long_value", new cfz("long_value", "INTEGER", false, 0, (String)null, 1));
        final cgd cgd7 = new cgd("Preference", (Map)hashMap7, (Set)new HashSet(0), (Set)new HashSet(0));
        final cgd d7 = caw.d(cgl, "Preference");
        if (!cgd7.equals((Object)d7)) {
            final StringBuilder sb7 = new StringBuilder("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
            sb7.append(cgd7);
            sb7.append("\n Found:\n");
            sb7.append(d7);
            return new fwn(false, sb7.toString());
        }
        return new fwn(true, (String)null);
    }
}
