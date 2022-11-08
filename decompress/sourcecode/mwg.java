import android.os.Bundle;
import android.content.Intent;
import android.content.ComponentName;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwg
{
    private static final ComponentName a;
    private static final ComponentName b;
    
    static {
        new ComponentName("com.mgoogle.android.gms", "com.google.android.gms.family.v2.manage.DeleteMemberActivity");
        a = new ComponentName("com.mgoogle.android.gms", "com.google.android.gms.family.v2.create.FamilyCreationActivity");
        new ComponentName("com.mgoogle.android.gms", "com.google.android.gms.family.v2.invites.SendInvitationsActivity");
        b = new ComponentName("com.mgoogle.android.gms", "com.google.android.gms.family.v2.manage.FamilyManagementActivity");
    }
    
    public static Intent a(final mwe mwe) {
        return new Intent().setComponent(mwg.a).putExtras(new Bundle(((mwf)mwe).b));
    }
    
    public static Intent b(final mwh mwh) {
        return new Intent().setComponent(mwg.b).putExtras(new Bundle(((mwi)mwh).b));
    }
    
    public static String c(final String s) {
        return "com.google.android.gms.family.".concat(s);
    }
}
