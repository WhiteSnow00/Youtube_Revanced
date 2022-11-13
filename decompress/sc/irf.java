import java.util.concurrent.TimeUnit;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irf implements Comparator
{
    private final boolean a;
    private final int b;
    
    public irf(final int b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    private static Long b(final aivh aivh) {
        final TimeUnit seconds = TimeUnit.SECONDS;
        aivf aivf;
        if ((aivf = aivh.l) == null) {
            aivf = aivf.a;
        }
        aivk a;
        if (aivf.b == 135744618) {
            a = (aivk)aivf.c;
        }
        else {
            a = aivk.a;
        }
        return seconds.toMillis(a.c);
    }
    
    private static String c(final aivh aivh) {
        final int b = aivh.b;
        final ajut ajut = null;
        ajut ajut2;
        if ((b & 0x1) != 0x0) {
            if ((ajut2 = aivh.g) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        String b2;
        if (acak.b(ajut2) == null) {
            b2 = "";
        }
        else {
            ajut ajut3 = ajut;
            if ((aivh.b & 0x1) != 0x0 && (ajut3 = aivh.g) == null) {
                ajut3 = ajut.a;
            }
            b2 = aevy.b(acak.b(ajut3).toString());
        }
        return b2;
    }
    
    public final int a(final aivh aivh, final aivh aivh2) {
        if (this.b == 3) {
            int n;
            if (this.a) {
                n = b(aivh2).compareTo(b(aivh));
            }
            else {
                n = b(aivh).compareTo(b(aivh2));
            }
            return n;
        }
        int n2;
        if (this.a) {
            n2 = c(aivh2).compareTo(c(aivh));
        }
        else {
            n2 = c(aivh).compareTo(c(aivh2));
        }
        return n2;
    }
    
    @Override
    public final /* bridge */ int compare(final Object o, final Object o2) {
        return this.a((aivh)o, (aivh)o2);
    }
}
