// 
// Decompiled by Procyon v0.6.0
// 

public final class cnl extends cfy
{
    public static final cnl c;
    
    static {
        c = new cnl();
    }
    
    private cnl() {
        super(3, 4);
    }
    
    public final void a(final cgl cgl) {
        cgl.g("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
