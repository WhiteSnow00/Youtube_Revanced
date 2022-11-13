import android.support.v7.widget.LinearLayoutManager;
import org.chromium.net.NetworkChangeNotifierAutoDetect;
import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aasq implements Runnable
{
    final int a;
    final Object b;
    private final int c;
    
    public aasq(final aast b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final aaus b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final aave b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final aawr b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final acqv b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final aczi b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final adis b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final aelo b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final agod b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final ako b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final arey b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final arzg b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final asax b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final asbc b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final auck b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aasq(final InternalMediaCodecVideoEncoder b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.c) {
            default: {
                NetworkChangeNotifierAutoDetect.-$$Nest$fgetmObserver(((auck)this.b).b).onConnectionTypeChanged(this.a);
                return;
            }
            case 19: {
                ((asbc)this.b).e.l(this.a);
                return;
            }
            case 18: {
                ((asbc)this.b).e.k(this.a);
                return;
            }
            case 17: {
                ((asbc)this.b).e.g(this.a);
                return;
            }
            case 16: {
                ((asax)this.b).b.f(this.a);
                return;
            }
            case 15: {
                final int a = asgy.a;
                try {
                    final asaq a2 = ((arzg)this.b).a;
                    final int a3 = this.a;
                    adkp.I(true, (Object)"numMessages must be > 0");
                    if (((asdu)a2).b()) {
                        return;
                    }
                    ((asdu)a2).e += a3;
                    ((asdu)a2).a();
                }
                finally {
                    try {
                        final Throwable t;
                        ((arzg)this.b).k(t);
                    }
                    finally {}
                }
            }
            case 14: {
                final Object b = this.b;
                final int a4 = this.a;
                final InternalMediaCodecVideoEncoder internalMediaCodecVideoEncoder = (InternalMediaCodecVideoEncoder)b;
                internalMediaCodecVideoEncoder.N.o(a4, false);
                final arfe g = internalMediaCodecVideoEncoder.g;
                synchronized (g.a) {
                    final int b2 = g.b - 1;
                    g.b = b2;
                    if (b2 == 0) {
                        g.a.notifyAll();
                    }
                }
            }
            case 13: {
                final Object b3 = this.b;
                final int a5 = this.a;
                final arey arey = (arey)b3;
                arey.n(a5, false);
                synchronized (arey.C) {
                    --((arey)b3).D;
                    ((arey)b3).C.notifyAll();
                }
            }
            case 12: {
                final Object b4 = this.b;
                final int a6 = this.a;
                final arey arey2 = (arey)b4;
                arey2.n(a6, false);
                synchronized (arey2.C) {
                    --((arey)b4).D;
                    ((arey)b4).C.notifyAll();
                }
            }
            case 11: {
                final Object b5 = this.b;
                final int a7 = this.a;
                final agod agod = (agod)b5;
                if (!agod.g) {
                    if (agod.i.d == 4) {
                        agod.h.f(a7);
                        return;
                    }
                    agod.d += a7;
                }
                return;
            }
            case 10: {
                ((aelo)this.b).stopSelf(this.a);
                return;
            }
            case 9: {
                ((adis)this.b).a(this.a);
                return;
            }
            case 8: {
                ((aczi)this.b).d.a(this.a);
                return;
            }
            case 7: {
                ((acqv)this.b).N.aa(this.a);
                return;
            }
            case 6: {
                final Object b6 = this.b;
                final int a8 = this.a;
                final nw n = ((acqv)b6).N.n;
                if (n != null) {
                    ((LinearLayoutManager)n).ab(a8, 0);
                }
                return;
            }
            case 5: {
                ((aawr)this.b).j(this.a);
                return;
            }
            case 4: {
                ((abde)((aave)this.b).k).h(this.a, 0);
                return;
            }
            case 3: {
                final Object b7 = this.b;
                final int a9 = this.a;
                final abef h = ((aaus)b7).h;
                if (h != null) {
                    h.x(a9);
                }
                return;
            }
            case 2: {
                ((aast)this.b).j.setGravity(this.a);
                return;
            }
            case 1: {
                ((ako)this.b).accept((Object)this.a);
                return;
            }
            case 0: {
                ((aast)this.b).j.setTextColor(this.a);
            }
        }
    }
}
