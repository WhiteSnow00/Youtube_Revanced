import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import android.view.View;
import android.content.ServiceConnection;
import android.content.ComponentName;
import android.util.Log;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Message;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.k;
import com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.a;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.f;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnh implements Handler$Callback
{
    public final Object a;
    private final int b;
    
    public bnh(final acmy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bnh(final adjk a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public bnh(final bnk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bnh(final YouTubeControlsOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bnh(final f a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bnh(final a a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bnh(final k a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bnh(final dlt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bnh(final mpy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bnh(final muz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bnh(final pak a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bnh(final xpq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final boolean handleMessage(final Message message) {
        final int b = this.b;
        Object o = null;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        boolean b5 = false;
        final boolean b6 = false;
        final boolean b7 = false;
        int i = 0;
        switch (b) {
            default: {
                final Object a = this.a;
                final int what = message.what;
                adhr adhr;
                if (what != 1) {
                    if (what != 2) {
                        if (what != 3) {
                            if (what != 4) {
                                if (what != 5) {
                                    return b7;
                                }
                                adhr = ((acmy)a).f;
                            }
                            else {
                                adhr = ((acmy)a).e;
                            }
                        }
                        else {
                            adhr = ((acmy)a).d;
                        }
                    }
                    else {
                        adhr = ((acmy)a).c;
                    }
                }
                else {
                    adhr = ((acmy)a).b;
                }
                final acmy acmy = (acmy)a;
                if (!acmy.k(adhr)) {
                    acmy.a.post((Runnable)new acan(acmy, 8));
                }
                return true;
            }
            case 10: {
                tcl.l();
                final xpq xpq = (xpq)this.a;
                final xpb g = xpq.g;
                if (g != null) {
                    if (xpq.e && !xpq.b.r()) {
                        final xpq xpq2 = (xpq)this.a;
                        if (!xpq2.h) {
                            xpq2.c.g((Object)xpq2.i);
                            return ((xpq)this.a).h = true;
                        }
                    }
                    else {
                        final ArrayList list = new ArrayList();
                        if (message.what == 2) {
                            o = message.obj;
                        }
                        if (o == null) {
                            list.addAll(dmo.x());
                        }
                        else {
                            list.add(o);
                        }
                        while (i < list.size()) {
                            final ccw ccw = (ccw)list.get(i);
                            final boolean e = xji.e(ccw.c, g.d);
                            ++i;
                            if (e) {
                                ((xpq)this.a).b(ccw);
                                break;
                            }
                        }
                    }
                }
                return true;
            }
            case 9: {
                if (!((pak)this.a).b.isEmpty()) {
                    for (final ozr ozr : ((pak)this.a).b) {
                        if (ozr instanceof pap) {
                            ((pak)this.a).b((pap)ozr, (ozw)ozy.a);
                        }
                        else {
                            if (!(ozr instanceof ozv)) {
                                continue;
                            }
                            ((pak)this.a).e((ozv)ozr);
                        }
                    }
                    ((pak)this.a).a.sendEmptyMessageDelayed(0, 200L);
                }
                return true;
            }
            case 8: {
                final int what2 = message.what;
                Label_0779: {
                    if (what2 != 0) {
                        if (what2 != 1) {
                            return b2;
                        }
                        synchronized (((muz)this.a).c) {
                            final muy muy = (muy)message.obj;
                            final mva mva = ((muz)this.a).c.get(muy);
                            Label_0642: {
                                if (mva != null && mva.b == 3) {
                                    o = String.valueOf(muy);
                                    final StringBuilder sb = new StringBuilder("Timeout waiting for ServiceConnection callback ");
                                    sb.append((String)o);
                                    final String string = sb.toString();
                                    o = new Exception();
                                    Log.e("GmsClientSupervisor", string, (Throwable)o);
                                    o = mva.f;
                                    Object d;
                                    if ((d = o) == null) {
                                        d = muy.d;
                                    }
                                    if ((o = d) == null) {
                                        o = new(android.content.ComponentName.class)();
                                        final String c = muy.c;
                                        kht.aL((Object)c);
                                        new ComponentName(c, "unknown");
                                    }
                                    mva.onServiceDisconnected((ComponentName)o);
                                    break Label_0642;
                                }
                                break Label_0642;
                            }
                            break Label_0779;
                        }
                    }
                    synchronized (((muz)this.a).c) {
                        final muy muy2 = (muy)message.obj;
                        final mva mva2 = ((muz)this.a).c.get(muy2);
                        if (mva2 != null && mva2.b()) {
                            if (mva2.c) {
                                mva2.g.e.removeMessages(1, (Object)mva2.e);
                                final muz g2 = mva2.g;
                                g2.f.b(g2.d, (ServiceConnection)mva2);
                                mva2.c = false;
                                mva2.b = 2;
                            }
                            ((muz)this.a).c.remove(muy2);
                        }
                        monitorexit(((muz)this.a).c);
                        return true;
                    }
                }
            }
            case 7: {
                final Object a2 = this.a;
                final int arg1 = message.arg1;
                synchronized (a2) {
                    final mqa mqa = (mqa)((mpy)a2).d.get(arg1);
                    if (mqa == null) {
                        final StringBuilder sb2 = new StringBuilder("Received response for unknown request: ");
                        sb2.append(arg1);
                        Log.w("MessengerIpcClient", sb2.toString());
                        monitorexit(a2);
                    }
                    else {
                        ((mpy)a2).d.remove(arg1);
                        ((mpy)a2).d();
                        monitorexit(a2);
                        final Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            mqa.c(new mqb("Not supported by GmsCore"));
                        }
                        else {
                            mqa.a(data);
                        }
                    }
                    return true;
                }
            }
            case 6: {
                final Object a3 = this.a;
                if (message.what == 1) {
                    ((k)a3).Q(false);
                }
                else if (message.what == 2) {
                    ((k)a3).V();
                }
                else if (message.what == 3) {
                    tqf.v((View)((k)a3).u, true);
                }
                else if (message.what == 4) {
                    tqf.v((View)((k)a3).u, false);
                }
                else {
                    final boolean b10 = b3;
                    if (message.what != 5) {
                        return b10;
                    }
                    ((k)a3).v();
                }
                return true;
            }
            case 5: {
                final Object a4 = this.a;
                boolean b11 = b4;
                if (message.what == 1) {
                    if (((abcq)a4).mm()) {
                        ((a)a4).a.setVisibility(8);
                    }
                    b11 = true;
                }
                return b11;
            }
            case 4: {
                final f f = (f)this.a;
                final boolean b12 = (f.m != 4 && com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.f.a.contains(f.c.getContext().getPackageName()) && !f.o.f()) || f.j();
                final boolean j = f.i();
                final boolean l = f.l();
                if (!b12) {
                    ++f.i;
                }
                if (!j) {
                    ++f.j;
                }
                if (!l) {
                    ++f.k;
                }
                if (f.i >= 3) {
                    f.d.c();
                    f.i = 0;
                }
                else if (f.j >= 3) {
                    f.d.a();
                    f.j = 0;
                }
                else if (f.k >= 3) {
                    f.d.b();
                    f.k = 0;
                }
                if (f.o.f()) {
                    f.f.sendEmptyMessageDelayed(0, 200L);
                }
                else {
                    int n;
                    if (b12 && j) {
                        n = f.e.nextInt(2000) + 1000;
                    }
                    else {
                        n = f.e.nextInt(300) + 300;
                    }
                    f.f.sendEmptyMessageDelayed(0, (long)n);
                }
                return true;
            }
            case 3: {
                if (message.what == 1) {
                    ((YouTubeControlsOverlay)this.a).U(false);
                    b5 = true;
                }
                else if (message.what == 2) {
                    ((YouTubeControlsOverlay)this.a).E();
                    return true;
                }
                return b5;
            }
            case 2: {
                boolean b13;
                if (message.what == 1) {
                    ((dlt)this.a).c((dlr)message.obj);
                    b13 = true;
                }
                else {
                    if (message.what == 2) {
                        ((dlt)this.a).c.j((dog)message.obj);
                        return false;
                    }
                    b13 = b6;
                }
                return b13;
            }
            case 1: {
                final adjk adjk = (adjk)this.a;
                for (final bap bap : (CopyOnWriteArraySet)adjk.f) {
                    final Object c2 = adjk.c;
                    if (!bap.c && bap.b) {
                        final aye n2 = bap.d.n();
                        bap.d = new slt((char[])null, (byte[])null);
                        bap.b = false;
                        ((bao)c2).a(bap.a, n2);
                    }
                    if (((bal)adjk.a).a()) {
                        break;
                    }
                }
                return true;
            }
            case 0: {
                final Object a5 = this.a;
                if (message.what == 0) {
                    final bnk bnk = (bnk)a5;
                    bnk.b = false;
                    final bni n3 = bnk.n();
                    if (n3 != null) {
                        ((bmv)a5).y((azn)n3);
                    }
                }
                return true;
            }
        }
    }
}
