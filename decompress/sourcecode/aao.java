import java.util.List;
import android.os.Build;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aao
{
    public static final bx a;
    
    static {
        final ArrayList list = new ArrayList();
        Label_0069: {
            if (!"HUAWEI".equalsIgnoreCase(Build.BRAND) || !"SNE-LX1".equalsIgnoreCase(Build.MODEL)) {
                if (!"HONOR".equalsIgnoreCase(Build.BRAND) || !"STK-LX1".equalsIgnoreCase(Build.MODEL)) {
                    break Label_0069;
                }
            }
            list.add(new wp());
        }
        list.add(new aap());
        a = new bx((List)list, (byte[])null);
    }
}
