// 
// Decompiled by Procyon v0.6.0
// 

public final class cnn extends cfy
{
    public static final cnn c;
    
    static {
        c = new cnn();
    }
    
    private cnn() {
        super(6, 7);
    }
    
    public final void a(final cgl cgl) {
        cgl.g("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
