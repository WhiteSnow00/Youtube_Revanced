import java.util.Iterator;
import android.text.TextUtils;
import android.content.ContentValues;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cob extends cfy
{
    public cob() {
        super(14, 15);
    }
    
    public final void a(final cgl cgl) {
        cgl.g("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        cgl.g("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
        cgl.g("DROP TABLE `WorkSpec`");
        cgl.g("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
        cgl.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        cgl.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        cgl.g("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        final ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        int n = 0;
        if (contentValues.size() != 0) {
            final int size = contentValues.size();
            final Object[] array = new Object[size];
            final StringBuilder sb = new StringBuilder("UPDATE ");
            sb.append(cgu.a[3]);
            sb.append("WorkSpec SET ");
            for (final String s : contentValues.keySet()) {
                String s2;
                if (n > 0) {
                    s2 = ",";
                }
                else {
                    s2 = "";
                }
                sb.append(s2);
                sb.append(s);
                array[n] = contentValues.get(s);
                sb.append("=?");
                ++n;
            }
            for (int i = size; i < size; ++i) {
                array[i] = (new Object[0])[i - size];
            }
            if (!TextUtils.isEmpty((CharSequence)"last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            final chb k = ((cgu)cgl).k(sb.toString());
            cdj.d((cgq)k, array);
            k.b();
            return;
        }
        throw new IllegalArgumentException("Empty values");
    }
}
