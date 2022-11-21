import android.net.Uri;
import android.graphics.Bitmap;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxs
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    
    public arxs() {
    }
    
    public arxs(final byte[] array) {
        this.d = null;
        this.a = null;
        this.b = null;
        this.c = null;
    }
    
    public arxs(final byte[] array, final byte[] array2) {
        this.d = akfi.a;
    }
    
    public static String i(final String s, final Object... array) {
        return String.format(Locale.ROOT, s, array);
    }
    
    public static List m(final List list) {
        return n(list, null);
    }
    
    public static List n(final List list, final Map map) {
        final ArrayList list2 = new ArrayList(1);
        for (final alrl alrl : list) {
            if (alrl.b == 128538449) {
                final alrk alrk = (alrk)alrl.c;
                final int b = alrk.b;
                if (b == 2) {
                    final aowb c = (aowb)alrk.c;
                    final arxs arxs = new arxs(null, null);
                    arxs.c = c;
                    arxs.d = akfi.a;
                    arxs.b = acou.c(c);
                    list2.add(arxs);
                }
                else {
                    if (b != 1) {
                        continue;
                    }
                    akfi akfi;
                    if ((akfi = akfi.b(((akfj)alrk.c).c)) == null) {
                        akfi = akfi.a;
                    }
                    if (akfi == akfi.a) {
                        continue;
                    }
                    akfj a;
                    if (alrk.b == 1) {
                        a = (akfj)alrk.c;
                    }
                    else {
                        a = akfj.a;
                    }
                    akfi d;
                    if ((d = akfi.b(a.c)) == null) {
                        d = akfi.a;
                    }
                    Integer a2;
                    if (map != null && map.containsKey(d)) {
                        a2 = map.get(d);
                    }
                    else {
                        a2 = null;
                    }
                    ahkc ahkc;
                    if ((ahkc = alrk.d) == null) {
                        ahkc = ahkc.a;
                    }
                    final arxs arxs2 = new arxs(null, null);
                    arxs2.c = null;
                    arxs2.d = d;
                    if (ahkc != null && (ahkc.b & 0x1) != 0x0) {
                        ahkb ahkb;
                        if ((ahkb = ahkc.c) == null) {
                            ahkb = ahkb.a;
                        }
                        if ((ahkb.b & 0x2) != 0x0) {
                            ahkb ahkb2;
                            if ((ahkb2 = ahkc.c) == null) {
                                ahkb2 = ahkb.a;
                            }
                            arxs2.b = ahkb2.c;
                        }
                    }
                    arxs2.a = a2;
                    list2.add(arxs2);
                }
            }
        }
        return list2;
    }
    
    public static ThreadFactory o(final arxs arxs) {
        final Object d = arxs.d;
        final Object a = arxs.a;
        final Object b = arxs.b;
        Object o;
        if ((o = arxs.c) == null) {
            o = Executors.defaultThreadFactory();
        }
        AtomicLong atomicLong;
        if (d != null) {
            atomicLong = new AtomicLong(0L);
        }
        else {
            atomicLong = null;
        }
        return new afxw((ThreadFactory)o, (String)d, atomicLong, (Boolean)a, (Integer)b);
    }
    
    public final arxv a() {
        this.a.getClass();
        this.b.getClass();
        this.c.getClass();
        adme.U(true, "at least one of channelRef and subchannelRef must be null");
        return new arxv((String)this.a, (arxt)this.b, (long)this.c, null, (aryd)this.d, null);
    }
    
    public final void b(final long n) {
        this.c = n;
    }
    
    public final arxr c() {
        return new arxr((SocketAddress)this.a, (InetSocketAddress)this.c, (String)this.d, (String)this.b);
    }
    
    public final void d(final SocketAddress a) {
        a.getClass();
        this.a = a;
    }
    
    public final void e(final InetSocketAddress c) {
        c.getClass();
        this.c = c;
    }
    
    public final agjw f() {
        return new agjw((String)this.b, (String)this.a, (String)null, (String)null, (String)this.d, (String)null, (String)this.c);
    }
    
    public final void g(final String a) {
        kht.aW(a, (Object)"ApiKey must be set.");
        this.a = a;
    }
    
    public final void h(final String b) {
        kht.aW(b, (Object)"ApplicationId must be set.");
        this.b = b;
    }
    
    public final void j(final boolean b) {
        this.a = b;
    }
    
    public final void k(final String d) {
        i(d, 0);
        this.d = d;
    }
    
    public final adoa l() {
        final Object a = this.a;
        if (a != null) {
            return new adoa((String)a, (Bitmap)this.d, (byte[])this.b, (Uri)this.c);
        }
        throw new IllegalStateException("Missing required properties: frontendId");
    }
}
