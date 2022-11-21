import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aufx
{
    public final int a;
    public final int b;
    public final Object c;
    
    public aufx(final int b, final int a, final List c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public aufx(final aufx aufx, final int n, final byte[] array, final byte[] array2) {
        this((String)aufx.c, n, aufx.a, null, null);
    }
    
    public aufx(final String c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aufx(final String s, final int a, final int b, final byte[] array) {
        this.c = afbh.k(s);
        this.a = a;
        this.b = b;
    }
    
    public aufx(final String c, final int b, final int a, final byte[] array, final byte[] array2) {
        c.getClass();
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aufx(final Set c, final int a) {
        this.c = c;
        this.a = a;
        this.b = 0;
    }
    
    public aufx(final Set c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static String a(final int n) {
        try {
            final StringBuilder sb = new StringBuilder("auto_offline_video_list_");
            sb.append(n - 1);
            return sb.toString();
        }
        catch (final NullPointerException ex) {
            return "auto_offline_video_list_0";
        }
    }
    
    public static String b(final int n) {
        final StringBuilder sb = new StringBuilder("offline_candidate_video_list_");
        sb.append(n - 1);
        return sb.toString();
    }
}
