import java.io.IOException;
import java.io.FileNotFoundException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brk implements brl
{
    @Override
    public final int a(final int n) {
        if (n == 7) {
            return 6;
        }
        return 3;
    }
    
    @Override
    public final void b(final long n) {
    }
    
    @Override
    public final long c(final tun tun) {
        final Object b = tun.b;
        if (!(b instanceof azb) && !(b instanceof FileNotFoundException) && !(b instanceof bcd) && !(b instanceof brq) && !bbo.sN((IOException)b)) {
            return Math.min((tun.a - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }
    
    @Override
    public final yrd d(final bwm bwm, final tun tun) {
        final Object b = tun.b;
        if (b instanceof bcg) {
            final int d = ((bcg)b).d;
            if (d == 403 || d == 404 || d == 410 || d == 416 || d == 500 || d == 503) {
                if (bwm.a(1)) {
                    return new yrd(1, 300000L, (byte[])null, (byte[])null);
                }
                if (bwm.a(2)) {
                    return new yrd(2, 60000L, (byte[])null, (byte[])null);
                }
                return null;
            }
        }
        return null;
    }
}
