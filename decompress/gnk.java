import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnk implements otb
{
    private final vpi a;
    private final zmf b;
    private final vcy c;
    private final tqd d;
    private final Executor e;
    private final aeea f;
    
    public gnk(final vpi a, final aeea f, final zmf b, final vcy c, final tqd d, final Executor e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final ahaq a() {
        return (ahaq)aqnl.b;
    }
    
    public final /* bridge */ ashc b(final Object o, final ota ota) {
        final aqnl aqnl = (aqnl)o;
        ashc ashc;
        if ((aqnl.c & 0x1) != 0x0) {
            akkf akkf;
            if ((akkf = aqnl.d) == null) {
                akkf = akkf.a;
            }
            final vpk vpk = new vpk(this.f, this.b.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            final int b = akkf.b;
            if ((b & 0x20) != 0x0) {
                vpk.e = akkf.h;
            }
            if ((b & 0x4) != 0x0) {
                vpk.w(akkf.g);
            }
            if ((akkf.b & 0x2) != 0x0) {
                vpk.x(akkf.f);
            }
            final int c = akkf.c;
            if (c == 9) {
                final akjs akjs = (akjs)akkf.d;
                final int b2 = akjs.b;
                if ((b2 & 0x1) != 0x0) {
                    vpk.b = akjs.c;
                }
                if ((b2 & 0x4) != 0x0) {
                    akdw g;
                    if ((g = akjs.e) == null) {
                        g = akdw.a;
                    }
                    vpk.g = g;
                }
                final int c2 = akkf.c;
                akjs a;
                if (c2 == 9) {
                    a = (akjs)akkf.d;
                }
                else {
                    a = akjs.a;
                }
                if ((a.b & 0x2) != 0x0) {
                    akjs a2;
                    if (c2 == 9) {
                        a2 = (akjs)akkf.d;
                    }
                    else {
                        a2 = akjs.a;
                    }
                    vpk.f = a2.d;
                }
            }
            else if (c == 10) {
                final akjt akjt = (akjt)akkf.d;
                if ((akjt.b & 0x1) != 0x0) {
                    vpk.d = akjt.c;
                }
            }
            else if (c == 8) {
                vpk.a = (List)((akjv)akkf.d).b;
            }
            else if (c == 7) {
                final akjx akjx = (akjx)akkf.d;
                if ((akjx.b & 0x1) != 0x0) {
                    vpk.c = akjx.c;
                }
            }
            else if (c == 14) {
                vpk.y = (akjr)akkf.d;
            }
            else if (c == 15) {
                vpk.z = ((akjw)akkf.d).c;
            }
            final ListenableFuture d = this.a.d(vpk, this.e);
            afwm.w(d, (afva)new gnj(this.c, this.d), (Executor)afum.a);
            ashc = tpe.cq(d);
        }
        else {
            ashc = ashc.t(new Throwable("CreatePostElementCommand has no post request"));
        }
        return ashc;
    }
}
