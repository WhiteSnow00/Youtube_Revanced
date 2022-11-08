// 
// Decompiled by Procyon v0.6.0
// 

public final class cnm extends cfy
{
    public static final cnm c;
    
    static {
        c = new cnm();
    }
    
    private cnm() {
        super(4, 5);
    }
    
    public final void a(final cgl cgl) {
        cgl.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        cgl.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
