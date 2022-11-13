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
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.l;
import com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.a;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.f;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bne implements Handler$Callback
{
    public final Object a;
    private final int b;
    
    public bne(final acll a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bne(final adhu a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public bne(final bnh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bne(final YouTubeControlsOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bne(final f a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bne(final a a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bne(final l a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bne(final dlp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bne(final mpk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bne(final mul a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bne(final ozt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bne(final xoe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final boolean handleMessage(final Message message) {
        final int b = this.b;
        Object o = null;
        final boolean b2 = false;
        final boolean b3 = false;
        boolean b4 = false;
        final boolean b5 = false;
        final boolean b6 = false;
        final boolean b7 = false;
        int i = 0;
        switch (b) {
            default: {
                final Object a = this.a;
                final int what = message.what;
                adge adge;
                if (what != 1) {
                    if (what != 2) {
                        if (what != 3) {
                            if (what != 4) {
                                if (what != 5) {
                                    return b7;
                                }
                                adge = ((acll)a).f;
                            }
                            else {
                                adge = ((acll)a).e;
                            }
                        }
                        else {
                            adge = ((acll)a).d;
                        }
                    }
                    else {
                        adge = ((acll)a).c;
                    }
                }
                else {
                    adge = ((acll)a).b;
                }
                final acll acll = (acll)a;
                if (!acll.k(adge)) {
                    acll.a.post((Runnable)new abuv(acll, 9));
                }
                return true;
            }
            case 10: {
                tbi.f();
                final xoe xoe = (xoe)this.a;
                final xnp g = xoe.g;
                if (g != null) {
                    if (xoe.e && !xoe.b.r()) {
                        final xoe xoe2 = (xoe)this.a;
                        if (!xoe2.h) {
                            xoe2.c.g((Object)xoe2.i);
                            return ((xoe)this.a).h = true;
                        }
                    }
                    else {
                        final ArrayList list = new ArrayList();
                        if (message.what == 2) {
                            o = message.obj;
                        }
                        if (o == null) {
                            list.addAll(dml.x());
                        }
                        else {
                            list.add(o);
                        }
                        while (i < list.size()) {
                            final cct cct = (cct)list.get(i);
                            final boolean e = xhy.e(cct.c, g.d);
                            ++i;
                            if (e) {
                                ((xoe)this.a).b(cct);
                                break;
                            }
                        }
                    }
                }
                return true;
            }
            case 9: {
                if (!((ozt)this.a).b.isEmpty()) {
                    for (final oza oza : ((ozt)this.a).b) {
                        if (oza instanceof ozy) {
                            ((ozt)this.a).b((ozy)oza, (ozf)ozh.a);
                        }
                        else {
                            if (!(oza instanceof oze)) {
                                continue;
                            }
                            ((ozt)this.a).e((oze)oza);
                        }
                    }
                    ((ozt)this.a).a.sendEmptyMessageDelayed(0, 200L);
                }
                return true;
            }
            case 8: {
                final int what2 = message.what;
                Label_0778: {
                    if (what2 != 0) {
                        if (what2 != 1) {
                            return b2;
                        }
                        synchronized (((mul)this.a).c) {
                            final muk muk = (muk)message.obj;
                            final mum mum = ((mul)this.a).c.get(muk);
                            Label_0641: {
                                if (mum != null && mum.b == 3) {
                                    o = String.valueOf(muk);
                                    final StringBuilder sb = new StringBuilder("Timeout waiting for ServiceConnection callback ");
                                    sb.append((String)o);
                                    o = sb.toString();
                                    Log.e("GmsClientSupervisor", (String)o, (Throwable)new Exception());
                                    o = mum.f;
                                    Object d;
                                    if ((d = o) == null) {
                                        d = muk.d;
                                    }
                                    if ((o = d) == null) {
                                        o = new(android.content.ComponentName.class)();
                                        final String c = muk.c;
                                        khl.aP((Object)c);
                                        new ComponentName(c, "unknown");
                                    }
                                    mum.onServiceDisconnected((ComponentName)o);
                                    break Label_0641;
                                }
                                break Label_0641;
                            }
                            break Label_0778;
                        }
                    }
                    synchronized (((mul)this.a).c) {
                        final muk muk2 = (muk)message.obj;
                        final mum mum2 = ((mul)this.a).c.get(muk2);
                        if (mum2 != null && mum2.b()) {
                            if (mum2.c) {
                                mum2.g.e.removeMessages(1, (Object)mum2.e);
                                final mul g2 = mum2.g;
                                g2.f.b(g2.d, (ServiceConnection)mum2);
                                mum2.c = false;
                                mum2.b = 2;
                            }
                            ((mul)this.a).c.remove(muk2);
                        }
                        monitorexit(((mul)this.a).c);
                        return true;
                    }
                }
            }
            case 7: {
                final Object a2 = this.a;
                final int arg1 = message.arg1;
                synchronized (a2) {
                    final mpm mpm = (mpm)((mpk)a2).d.get(arg1);
                    if (mpm == null) {
                        final StringBuilder sb2 = new StringBuilder("Received response for unknown request: ");
                        sb2.append(arg1);
                        Log.w("MessengerIpcClient", sb2.toString());
                        monitorexit(a2);
                    }
                    else {
                        ((mpk)a2).d.remove(arg1);
                        ((mpk)a2).d();
                        monitorexit(a2);
                        final Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            mpm.c(new mpn("Not supported by GmsCore"));
                        }
                        else {
                            mpm.a(data);
                        }
                    }
                    return true;
                }
            }
            case 6: {
                final Object a3 = this.a;
                if (message.what == 1) {
                    ((l)a3).Q(false);
                }
                else if (message.what == 2) {
                    ((l)a3).V();
                }
                else if (message.what == 3) {
                    tpe.v((View)((l)a3).u, true);
                }
                else if (message.what == 4) {
                    tpe.v((View)((l)a3).u, false);
                }
                else {
                    final boolean b10 = b3;
                    if (message.what != 5) {
                        return b10;
                    }
                    ((l)a3).v();
                }
                return true;
            }
            case 5: {
                final Object a4 = this.a;
                if (message.what == 1) {
                    if (((abbk)a4).mn()) {
                        ((a)a4).a.setVisibility(8);
                    }
                    b4 = true;
                }
                return b4;
            }
            case 4: {
                final f f = (f)this.a;
                final boolean b11 = (f.m != 4 && com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.f.a.contains((Object)f.c.getContext().getPackageName()) && !f.o.f()) || f.j();
                final boolean j = f.i();
                final boolean l = f.l();
                if (!b11) {
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
                    if (b11 && j) {
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
                boolean b12;
                if (message.what == 1) {
                    ((YouTubeControlsOverlay)this.a).T(false);
                    b12 = true;
                }
                else {
                    if (message.what == 2) {
                        ((YouTubeControlsOverlay)this.a).D();
                        return true;
                    }
                    b12 = b5;
                }
                return b12;
            }
            case 2: {
                boolean b13;
                if (message.what == 1) {
                    ((dlp)this.a).c((dln)message.obj);
                    b13 = true;
                }
                else {
                    if (message.what == 2) {
                        ((dlp)this.a).c.j((dod)message.obj);
                        return false;
                    }
                    b13 = b6;
                }
                return b13;
            }
            case 1: {
                final adhu adhu = (adhu)this.a;
                for (final bao bao : (CopyOnWriteArraySet)adhu.e) {
                    final Object c2 = adhu.c;
                    if (!bao.c && bao.b) {
                        final ayd n2 = bao.d.n();
                        bao.d = new skt((char[])null, (byte[])null);
                        bao.b = false;
                        ((ban)c2).a(bao.a, n2);
                    }
                    if (((bak)adhu.a).a()) {
                        break;
                    }
                }
                return true;
            }
            case 0: {
                final Object a5 = this.a;
                if (message.what == 0) {
                    final bnh bnh = (bnh)a5;
                    bnh.b = false;
                    final bnf n3 = bnh.n();
                    if (n3 != null) {
                        ((bms)a5).y((azm)n3);
                    }
                }
                return true;
            }
        }
    }
}
