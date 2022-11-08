// 
// Decompiled by Procyon v0.6.0
// 

public final class cnp extends cfy
{
    public static final cnp c;
    
    static {
        c = new cnp();
    }
    
    private cnp() {
        super(8, 9);
    }
    
    public final void a(final cgl cgl) {
        cgl.g("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
