// 
// Decompiled by Procyon v0.6.0
// 

public final class cno extends cfy
{
    public static final cno c;
    
    static {
        c = new cno();
    }
    
    private cno() {
        super(7, 8);
    }
    
    public final void a(final cgl cgl) {
        cgl.g("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
