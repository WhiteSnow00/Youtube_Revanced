import java.util.concurrent.Executor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.GetDownloadActionCommandOuterClass$GetDownloadActionCommand;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihh implements Runnable
{
    public final ihi a;
    public final ListenableFuture b;
    public final ListenableFuture c;
    public final GetDownloadActionCommandOuterClass$GetDownloadActionCommand d;
    public final ListenableFuture e;
    public final aiqj f;
    public final ahaz g;
    public final adfq h;
    
    public ihh(final ihi a, final ListenableFuture b, final ListenableFuture c, final GetDownloadActionCommandOuterClass$GetDownloadActionCommand d, final ahaz g, final ListenableFuture e, final adfq h, final aiqj f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
        this.h = h;
        this.f = f;
    }
    
    @Override
    public final void run() {
        final ihi a = this.a;
        final ListenableFuture b = this.b;
        final ListenableFuture c = this.c;
        final GetDownloadActionCommandOuterClass$GetDownloadActionCommand d = this.d;
        final ahaz g = this.g;
        final ListenableFuture e = this.e;
        final adfq h = this.h;
        final aiqj f = this.f;
        try {
            final Optional optional = (Optional)afwm.u((Future)b);
            final boolean booleanValue = (boolean)afwm.u((Future)c);
            final int b2 = d.b;
            final int n = 0;
            final boolean b3 = (b2 & 0x8) != 0x0 && d.f;
            Label_0294: {
                if (optional.isPresent()) {
                    final boolean booleanValue2 = ((amwu)optional.get()).getRacyCheckOk();
                    g.copyOnWrite();
                    final GetDownloadActionCommandOuterClass$GetDownloadActionCommand getDownloadActionCommandOuterClass$GetDownloadActionCommand = (GetDownloadActionCommandOuterClass$GetDownloadActionCommand)g.instance;
                    getDownloadActionCommandOuterClass$GetDownloadActionCommand.b |= 0x8;
                    getDownloadActionCommandOuterClass$GetDownloadActionCommand.f = booleanValue2;
                    final boolean booleanValue3 = ((amwu)optional.get()).getContentCheckOk();
                    g.copyOnWrite();
                    final GetDownloadActionCommandOuterClass$GetDownloadActionCommand getDownloadActionCommandOuterClass$GetDownloadActionCommand2 = (GetDownloadActionCommandOuterClass$GetDownloadActionCommand)g.instance;
                    getDownloadActionCommandOuterClass$GetDownloadActionCommand2.b |= 0x4;
                    getDownloadActionCommandOuterClass$GetDownloadActionCommand2.e = booleanValue3;
                }
                else {
                    boolean b4 = booleanValue;
                    if (!b3) {
                        if (booleanValue) {
                            g.copyOnWrite();
                            final GetDownloadActionCommandOuterClass$GetDownloadActionCommand getDownloadActionCommandOuterClass$GetDownloadActionCommand3 = (GetDownloadActionCommandOuterClass$GetDownloadActionCommand)g.instance;
                            getDownloadActionCommandOuterClass$GetDownloadActionCommand3.b |= 0x8;
                            getDownloadActionCommandOuterClass$GetDownloadActionCommand3.f = true;
                            break Label_0294;
                        }
                        b4 = false;
                    }
                    if (b3 && !b4) {
                        a.f.aB(a.a.c(), true);
                    }
                }
            }
            final boolean booleanValue4 = (boolean)afwm.u((Future)e);
            g.copyOnWrite();
            final GetDownloadActionCommandOuterClass$GetDownloadActionCommand getDownloadActionCommandOuterClass$GetDownloadActionCommand4 = (GetDownloadActionCommandOuterClass$GetDownloadActionCommand)g.instance;
            getDownloadActionCommandOuterClass$GetDownloadActionCommand4.b |= 0x80;
            getDownloadActionCommandOuterClass$GetDownloadActionCommand4.i = booleanValue4;
            final GetDownloadActionCommandOuterClass$GetDownloadActionCommand getDownloadActionCommandOuterClass$GetDownloadActionCommand5 = (GetDownloadActionCommandOuterClass$GetDownloadActionCommand)g.build();
            final ahab c2 = f.c;
            final Executor b5 = a.b;
            final imu imu = new imu(h.c, ((eg)h.d).ab(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            imu.a = Optional.of((Object)getDownloadActionCommandOuterClass$GetDownloadActionCommand5.h);
            ((vkk)imu).j(c2);
            final int c3 = getDownloadActionCommandOuterClass$GetDownloadActionCommand5.c;
            int n2;
            if (c3 != 0) {
                if (c3 != 1) {
                    if (c3 != 2) {
                        n2 = n;
                    }
                    else {
                        n2 = 2;
                    }
                }
                else {
                    n2 = 1;
                }
            }
            else {
                n2 = 3;
            }
            if (n2 != 0) {
                --n2;
                String s = "";
                if (n2 != 0) {
                    if (n2 == 1) {
                        if (c3 == 2) {
                            s = (String)getDownloadActionCommandOuterClass$GetDownloadActionCommand5.d;
                        }
                        imu.c = Optional.of((Object)s);
                    }
                }
                else {
                    if (c3 == 1) {
                        s = (String)getDownloadActionCommandOuterClass$GetDownloadActionCommand5.d;
                    }
                    imu.b = Optional.of((Object)s);
                }
                if ((getDownloadActionCommandOuterClass$GetDownloadActionCommand5.b & 0x4) != 0x0) {
                    imu.d = Optional.of((Object)getDownloadActionCommandOuterClass$GetDownloadActionCommand5.e);
                }
                if ((getDownloadActionCommandOuterClass$GetDownloadActionCommand5.b & 0x8) != 0x0) {
                    imu.e = Optional.of((Object)getDownloadActionCommandOuterClass$GetDownloadActionCommand5.f);
                }
                if ((getDownloadActionCommandOuterClass$GetDownloadActionCommand5.b & 0x10) != 0x0) {
                    amwz amwz;
                    if ((amwz = amwz.b(getDownloadActionCommandOuterClass$GetDownloadActionCommand5.g)) == null) {
                        amwz = amwz.a;
                    }
                    imu.f = Optional.of((Object)amwz);
                }
                if ((getDownloadActionCommandOuterClass$GetDownloadActionCommand5.b & 0x80) != 0x0) {
                    imu.g = Optional.of((Object)getDownloadActionCommandOuterClass$GetDownloadActionCommand5.i);
                }
                teu.k(((vml)h.e).b((vls)imu, b5), a.c, (tes)new hug(a, 5), (tet)new exe(a, f, 19));
                return;
            }
            throw null;
        }
        catch (final ExecutionException ex) {
            zlm.c(zll.b, zlk.B, "Get download action command resolver execution exception", (Throwable)ex);
        }
    }
}
