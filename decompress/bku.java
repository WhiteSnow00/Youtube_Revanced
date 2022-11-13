import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import android.util.Pair;
import android.media.NotProvisionedException;
import android.media.DeniedByServerException;

// 
// Decompiled by Procyon v0.6.0
// 

public class bku
{
    public static volatile dut a;
    public static volatile dus b;
    public static dsl c;
    public static dup d;
    public static dvv e;
    public static dwx f;
    public static dwi g;
    private static dud h;
    
    public static boolean a(final Throwable t) {
        return t instanceof DeniedByServerException;
    }
    
    public static boolean b(final Throwable t) {
        return t instanceof NotProvisionedException;
    }
    
    public static Pair c(final bkm bkm) {
        final Map d = bkm.d();
        if (d == null) {
            return null;
        }
        return new Pair((Object)t(d, "LicenseDurationRemaining"), (Object)t(d, "PlaybackDurationRemaining"));
    }
    
    public static int r(final float n) {
        double n2;
        double n3;
        if (n > 0.0f) {
            n2 = n;
            n3 = 0.5;
        }
        else {
            n2 = n;
            n3 = -0.5;
        }
        Double.isNaN(n2);
        return (int)(n2 + n3);
    }
    
    public static void s(final dun dun, final View a, final MotionEvent b) {
        bkw.e();
        if (bku.h == null) {
            bku.h = new dud();
        }
        final dud h = bku.h;
        h.b = b;
        h.a = a;
        dun.b.l().P(dun, bku.h);
        final dud h2 = bku.h;
        h2.b = null;
        h2.a = null;
    }
    
    private static long t(final Map map, final String s) {
        try {
            final String s2 = map.get(s);
            if (s2 != null) {
                return Long.parseLong(s2);
            }
            return -9223372036854775807L;
        }
        catch (final NumberFormatException ex) {
            return -9223372036854775807L;
        }
    }
    
    public void d(final String s, final Bundle bundle) {
        throw null;
    }
    
    public void e(final Bundle bundle) {
        throw null;
    }
    
    public void f() {
    }
    
    public void g() {
    }
    
    public void h() {
    }
    
    public void i(final cct cct) {
    }
    
    public void j(final cct cct) {
    }
    
    public void k(final cct cct) {
    }
    
    @Deprecated
    public void l() {
    }
    
    public void m(final cct cct) {
    }
    
    public void n(final cda cda) {
    }
    
    public void o(final cct cct, final int n) {
        this.p();
    }
    
    @Deprecated
    public void p() {
    }
    
    public void q(final cct cct, final int n) {
        this.l();
    }
}
