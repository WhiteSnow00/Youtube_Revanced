import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abrg
{
    public static final Map a;
    public static final Map b;
    
    static {
        final HashMap a2 = new HashMap();
        (a = a2).put("VSS_CMT", 1);
        a2.put("VSS_CPN", 2);
        a2.put("VSS_STATE", 3);
        a2.put("VSS_CONN", 4);
        a2.put("VSS_RT", 5);
        a2.put("VSS_VIS", 6);
        a2.put("VSS_UAO", 7);
        final HashMap b2 = new HashMap();
        (b = b2).put("VSS_CMT", "-1");
        b2.put("VSS_CPN", "");
        b2.put("VSS_STATE", "");
        b2.put("VSS_CONN", "0");
        b2.put("VSS_RT", "0");
        b2.put("VSS_VIS", "0");
        b2.put("VSS_UAO", "0");
    }
}
