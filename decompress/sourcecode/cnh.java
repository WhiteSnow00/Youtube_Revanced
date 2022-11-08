// 
// Decompiled by Procyon v0.6.0
// 

public final class cnh extends cfy
{
    public static final cnh c;
    
    static {
        c = new cnh();
    }
    
    private cnh() {
        super(11, 12);
    }
    
    public final void a(final cgl cgl) {
        cgl.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
