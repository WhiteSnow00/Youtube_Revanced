import com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks;
import android.os.Parcel;
import android.content.ServiceConnection;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import org.webrtc.VideoCodecStatus;
import android.os.SystemClock;
import org.webrtc.Logging;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoder;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfq implements Runnable
{
    final Object a;
    private final int b;
    
    public arfq(final arac a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final arft a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final arhj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final arht a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final arie a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final asas a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final asat a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final asbx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final asdr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final asds a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final asdu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final asdx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final asgl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final ControllerServiceBridge a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public arfq(final InternalMediaCodecVideoEncoder a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                ((asdx)this.a).e.f();
                return;
            }
            case 19: {
                adme.U(((asfq)((asdu)this.a).f).a.A.get(), "Channel must have been shut down");
                return;
            }
            case 18: {
                final asfq asfq = (asfq)this.a;
                adme.U(asfq.a.A.get(), "Channel must have been shut down");
                final asgb a = asfq.a;
                a.C = true;
                a.l(false);
                asfq.a.h();
                asfq.a.i();
                return;
            }
            case 17: {
                ((asgl)this.a).a(false);
                return;
            }
            case 16: {
                ((asgl)this.a).a(true);
                return;
            }
            case 15: {
                ((asdr)this.a).c.d();
                return;
            }
            case 14: {
                ((asds)this.a).b.c();
                return;
            }
            case 13: {
                ((asbx)this.a).b.b();
                return;
            }
            case 12: {
                final Object a2 = this.a;
                synchronized (a2) {
                    if (((asat)a2).u(1)) {
                        ((asat)a2).t(2);
                        ((asas)a2).c.a();
                    }
                }
            }
            case 11: {
                final Object a3 = this.a;
                synchronized (a3) {
                    if (((asat)a3).u(4)) {
                        ((asat)a3).p(((asat)a3).n, true);
                    }
                }
            }
            case 10: {
                final arie arie = (arie)this.a;
                ((Handler)arie.b).removeCallbacks((Runnable)arie.c);
                return;
            }
            case 9: {
                final InternalMediaCodecVideoEncoder internalMediaCodecVideoEncoder = (InternalMediaCodecVideoEncoder)this.a;
                internalMediaCodecVideoEncoder.g();
                if (internalMediaCodecVideoEncoder.G == internalMediaCodecVideoEncoder.E) {
                    internalMediaCodecVideoEncoder.h();
                    return;
                }
                final long currentTimeMillis = System.currentTimeMillis();
                final long d = internalMediaCodecVideoEncoder.D;
                final int g = internalMediaCodecVideoEncoder.G;
                final int e = internalMediaCodecVideoEncoder.E;
                final int h = internalMediaCodecVideoEncoder.H;
                final float n = (float)TimeUnit.NANOSECONDS.toMillis(internalMediaCodecVideoEncoder.I);
                final Locale english = Locale.ENGLISH;
                final long d2 = internalMediaCodecVideoEncoder.D;
                final int g2 = internalMediaCodecVideoEncoder.G;
                final float n2 = (float)(currentTimeMillis - d);
                final float n3 = (float)(h * 8);
                final float n4 = n2 / 1000.0f;
                final float n5 = n3 / n4 / 1000.0f;
                final int n6 = internalMediaCodecVideoEncoder.A / 1000;
                final float n7 = (float)(g - e);
                Logging.a("IMCVideoEncoder", String.format(english, "Statistics for last %s ms. Encoded frames: %s. Bitrate: %.0f kbps. Target: %s kbps. FPS: %.1f. Avg. encode time: %.1f ms. QP: %.1f.", currentTimeMillis - d2, g2, n5, n6, n7 / n4, n / n7, internalMediaCodecVideoEncoder.J / n7));
                internalMediaCodecVideoEncoder.h();
                return;
            }
            case 8: {
                final arht arht = (arht)this.a;
                arht.i();
                if (arht.p == arht.y) {
                    arht.l();
                    return;
                }
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final long x = arht.x;
                final int p = arht.p;
                final int y = arht.y;
                final int z = arht.z;
                final float n8 = (float)arht.A;
                final float n9 = (float)arht.B;
                final Locale english2 = Locale.ENGLISH;
                final long x2 = arht.x;
                final int n10 = arht.n;
                final int o = arht.o;
                final int p2 = arht.p;
                final float n11 = (float)(elapsedRealtime - x);
                final float n12 = (float)(z * 8);
                final float n13 = n11 / 1000.0f;
                final float n14 = n12 / n13 / 1000.0f;
                final float n15 = (float)(p - y);
                Logging.a("IMCVideoDecoder", String.format(english2, "Statistics for last %s ms. Received frames: %s. Decoded: %s. Delivered: %s. Bitrate: %.0f kbps. FPS: %.1f. Decode time: %.1f. Delay: %.1f.", elapsedRealtime - x2, n10, o, p2, n14, n15 / n13, n8 / n15, n9 / n15));
                arht.l();
                return;
            }
            case 7: {
                final arht arht2 = (arht)this.a;
                arht2.i();
                final VideoCodecStatus d3 = arht2.d(0L);
                if (d3 == VideoCodecStatus.d) {
                    if (arht2.n <= arht2.o) {
                        arht2.l.a(100L);
                    }
                    return;
                }
                Logging.b("IMCVideoDecoder", "Error in deliverPendingOutputs: ".concat(String.valueOf(String.valueOf(d3))));
                arht2.r = d3;
                return;
            }
            case 6: {
                ((arht)this.a).m();
                return;
            }
            case 5: {
                final arhj arhj = (arhj)this.a;
                arhj.b.a();
                arhj.c = false;
                return;
            }
            case 4: {
                final Object a4 = this.a;
                ControllerServiceBridge.d();
                final ControllerServiceBridge controllerServiceBridge = (ControllerServiceBridge)a4;
                final argj f = controllerServiceBridge.f;
                if (f != null) {
                    try {
                        final Parcel qw = f.qW(10, f.qV());
                        final int int1 = qw.readInt();
                        qw.recycle();
                        if (int1 > 0) {
                            if (controllerServiceBridge.e) {
                                controllerServiceBridge.b();
                            }
                            return;
                        }
                    }
                    catch (final RemoteException ex) {
                        Log.w("VrCtl.ServiceBridge", "Remote exception while getting number of controllers: ".concat(ex.toString()));
                    }
                }
                for (int size = controllerServiceBridge.d.size(), i = 0; i < size; ++i) {
                    final aevn aevn = (aevn)controllerServiceBridge.d.valueAt(i);
                    if (aevn != null) {
                        ((ControllerServiceBridge$Callbacks)aevn.b).onControllerStateChanged(i, 0);
                    }
                }
                ControllerServiceBridge.d();
                controllerServiceBridge.d.clear();
                ((ControllerServiceBridge$Callbacks)controllerServiceBridge.g.b).onServiceDisconnected();
                return;
            }
            case 3: {
                final Object a5 = this.a;
                ControllerServiceBridge.d();
                final ControllerServiceBridge controllerServiceBridge2 = (ControllerServiceBridge)a5;
                if (controllerServiceBridge2.e) {
                    Log.w("VrCtl.ServiceBridge", "Service is already bound.");
                    return;
                }
                final Intent intent = new Intent("com.google.vr.vrcore.controller.BIND");
                intent.setPackage("com.google.vr.vrcore");
                if (!controllerServiceBridge2.a.bindService(intent, (ServiceConnection)a5, 1)) {
                    Log.w("VrCtl.ServiceBridge", "Bind failed. Service is not available.");
                    ((ControllerServiceBridge$Callbacks)controllerServiceBridge2.g.b).onServiceUnavailable();
                }
                controllerServiceBridge2.e = true;
                return;
            }
            case 2: {
                ((ControllerServiceBridge)this.a).a();
                return;
            }
            case 1: {
                ((arac)this.a).c.start();
                return;
            }
            case 0: {
                arfu.a(((arft)this.a).a);
            }
        }
    }
}
