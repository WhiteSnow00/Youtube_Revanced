// 
// Decompiled by Procyon v0.6.0
// 

public final class cnk extends cfy
{
    public static final cnk c;
    
    static {
        c = new cnk();
    }
    
    private cnk() {
        super(1, 2);
    }
    
    public final void a(final cgl cgl) {
        cgl.g("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        cgl.g("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        cgl.g("DROP TABLE IF EXISTS alarmInfo");
        cgl.g("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
