import java.util.Map;
import java.util.Collections;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmu
{
    private static agmu c;
    public Object a;
    public Object b;
    
    private agmu() {
        this.a = null;
        this.b = null;
    }
    
    public agmu(final byte[] array) {
    }
    
    public agmu(final char[] array) {
        this.b = "Unknown";
        this.a = "Unknown";
    }
    
    public static agmu a() {
        synchronized (agmu.class) {
            if (agmu.c == null) {
                agmu.c = new agmu();
            }
            return agmu.c;
        }
    }
    
    public static String c(final String s, final boolean b) {
        if (!"VisibleUsingXml".equals(s) && !"Visible".equals(s) && !"Invisible".equals(s)) {
            throw new IllegalStateException("Illegal visibility state: ".concat(String.valueOf(s)));
        }
        String s2;
        if (b) {
            s2 = s;
            if ("Invisible".equals(s)) {
                return "Invisible_to_Visible";
            }
        }
        else {
            if ("VisibleUsingXml".equals(s)) {
                return "VisibleUsingXml_to_Invisible";
            }
            s2 = s;
            if ("Visible".equals(s)) {
                s2 = "Visible_to_Invisible";
            }
        }
        return s2;
    }
    
    public static final String f(final boolean b, final boolean b2) {
        String s;
        if (b) {
            if (!b2) {
                s = "Visible";
            }
            else {
                s = "VisibleUsingXml";
            }
        }
        else {
            s = "Invisible";
        }
        return s;
    }
    
    public final boolean b(final Context context) {
        if (this.a == null) {
            this.a = (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        ((Boolean)this.a).booleanValue();
        return (boolean)this.a;
    }
    
    public final void d(final boolean b, final boolean b2) {
        Object b3;
        if (((String)this.b).equals("Unknown")) {
            b3 = f(b, b2);
        }
        else {
            b3 = this.b;
        }
        this.b = b3;
    }
    
    public final void e(final boolean b, final boolean b2) {
        Object a;
        if (((String)this.a).equals("Unknown")) {
            a = f(b, b2);
        }
        else {
            a = this.a;
        }
        this.a = a;
    }
    
    public final aegc g() {
        this.i(Collections.unmodifiableMap((Map<?, ?>)this.h()));
        if (this.a != null) {
            return new aegc((Integer)this.b, (Map)this.a);
        }
        throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
    }
    
    public final Map h() {
        final Object a = this.a;
        if (a != null) {
            return (Map)a;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
    
    public final void i(final Map a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null splitInstallErrorCodeByModule");
    }
}
