import com.google.android.gms.common.Feature;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mzl
{
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    
    static {
        a = new Feature("device_enabled_api", 1L);
        b = new Feature("instant_app_removed_api", 1L);
        c = new Feature("instant_app_installed_api", 1L);
        d = new Feature("instant_app_uninstalled_api", 1L);
    }
}
