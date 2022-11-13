import java.util.Queue;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.io.File;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyb
{
    public final Object a;
    
    public cyb() {
        this.a = new ArrayList();
    }
    
    public cyb(final acmr a, final byte[] array) {
        this.a = a;
    }
    
    public cyb(final atke a) {
        a.getClass();
        this.a = a;
    }
    
    public cyb(final atke a, final byte[] array) {
        a.getClass();
        this.a = a;
    }
    
    public cyb(final cl a) {
        this.a = a;
    }
    
    public cyb(final cya a) {
        this.a = a;
    }
    
    private cyb(final egf a) {
        this.a = a;
    }
    
    public cyb(final eoq a) {
        this.a = a;
    }
    
    public cyb(final eqy a) {
        this.a = a;
    }
    
    public cyb(final fzw a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
    }
    
    public cyb(final hof a) {
        this.a = a;
    }
    
    public cyb(final Class a) {
        this.a = a;
    }
    
    public cyb(final Object a) {
        this.a = a;
    }
    
    public cyb(final String a) {
        this.a = a;
    }
    
    public cyb(final String a, final byte[] array) {
        this.a = a;
    }
    
    public cyb(final List a) {
        this.a = a;
    }
    
    public cyb(final Map map) {
        this.a = afev.k(map);
    }
    
    public cyb(final ubu a) {
        this.a = a;
    }
    
    public cyb(final vai a) {
        this.a = a;
    }
    
    public cyb(final vcy a) {
        this.a = a;
    }
    
    public cyb(final byte[] array) {
        this.a = dph.i(0);
    }
    
    public cyb(final byte[] array, final byte[] array2) {
        this.a = new HashMap();
    }
    
    public cyb(final byte[] array, final char[] array2) {
        this.a = atiy.aE();
    }
    
    public cyb(final char[] array) {
        this.a = new HashMap();
    }
    
    public cyb(final int[] array) {
        this.a = new HashSet();
    }
    
    public cyb(final File[] a) {
        this.a = a;
    }
    
    public cyb(final short[] array) {
        this.a = new HashMap();
    }
    
    public static cyb i(final egf egf) {
        return new cyb(egf);
    }
    
    public static boolean k(final File file) {
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; ++i) {
                k(listFiles[i]);
            }
        }
        return file.delete();
    }
    
    public final dlu a(final Class clazz, final Class clazz2) {
        monitorenter(this);
        try {
            if (clazz2.isAssignableFrom(clazz)) {
                final dlv a = dlv.a;
                monitorexit(this);
                return (dlu)a;
            }
            for (eg eg : this.a) {
                if (eg.H(clazz, clazz2)) {
                    final Object d = eg.d;
                    monitorexit(this);
                    return (dlu)d;
                }
            }
            final String value = String.valueOf(clazz);
            final String value2 = String.valueOf(clazz2);
            final StringBuilder sb = new StringBuilder();
            sb.append("No transcoder registered to transcode from ");
            sb.append(value);
            sb.append(" to ");
            sb.append(value2);
            throw new IllegalArgumentException(sb.toString());
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final List b(final Class clazz, final Class clazz2) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            if (clazz2.isAssignableFrom(clazz)) {
                list.add(clazz2);
                monitorexit(this);
                return list;
            }
            for (final eg eg : this.a) {
                if (eg.H(clazz, clazz2) && !list.contains(eg.b)) {
                    list.add(eg.b);
                }
            }
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c(final Class clazz, final Class clazz2, final dlu dlu) {
        synchronized (this) {
            ((List<eg>)this.a).add(new eg(clazz, clazz2, dlu));
        }
    }
    
    public final dzo d(final ByteBuffer byteBuffer) {
        synchronized (this) {
            dzo dzo;
            if ((dzo = ((Queue<dzo>)this.a).poll()) == null) {
                dzo = new dzo(null);
            }
            dzo.c = null;
            Arrays.fill((byte[])dzo.b, (byte)0);
            dzo.d = new dcw();
            dzo.a = 0;
            dzo.c = byteBuffer.asReadOnlyBuffer();
            ((ByteBuffer)dzo.c).position(0);
            ((ByteBuffer)dzo.c).order(ByteOrder.LITTLE_ENDIAN);
            return dzo;
        }
    }
    
    public final void e(final dzo dzo) {
        synchronized (this) {
            dzo.c = null;
            dzo.d = null;
            ((Queue<dzo>)this.a).offer(dzo);
        }
    }
    
    public final void f() {
        ((Map)this.a).clear();
    }
    
    public final AtomicReference g(final String s) {
        synchronized (this) {
            if (!((Map)this.a).containsKey(s)) {
                ((Map<String, AtomicReference>)this.a).put(s, new AtomicReference());
            }
            return ((Map<K, AtomicReference>)this.a).get(s);
        }
    }
    
    public final void h(final String s, final Callable callable) {
        ((Map<String, Callable>)this.a).put(s, callable);
    }
    
    public final boolean j() {
        return ((hof)this.a).a().isPresent();
    }
    
    public final void l(final wyw wyw, final int n) {
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        final ahbf browseEndpoint = BrowseEndpointOuterClass.browseEndpoint;
        final ahaz builder = ((ahbh)aicj.a).createBuilder();
        builder.copyOnWrite();
        final aicj aicj = (aicj)builder.instance;
        aicj.b |= 0x1;
        aicj.c = "FEsfv_audio_picker";
        builder.copyOnWrite();
        final aicj aicj2 = (aicj)builder.instance;
        aicj2.b |= 0x4;
        aicj2.d = "";
        ahbb.e((ahaq)browseEndpoint, (Object)builder.build());
        final ahab b = ahab.b;
        ((ahaz)ahbb).copyOnWrite();
        final aiqj aiqj = (aiqj)ahbb.instance;
        b.getClass();
        aiqj.b |= 0x1;
        aiqj.c = b;
        ((vcy)this.a).a(aeea.cE(wyw, (aiqj)((ahaz)ahbb).build(), n));
    }
    
    public final boolean m() {
        return ((vai)this.a).f(45377319L);
    }
    
    public final boolean n(final boolean b) {
        return !b || ((vai)this.a).f(45382804L);
    }
    
    public final boolean o(final boolean b) {
        return ((vai)this.a).f(45377170L) && this.n(b);
    }
    
    public final void p(final boolean b) {
        ((atiy)this.a).tu((Object)b);
    }
    
    public final boolean q() {
        return ((vai)this.a).f(45357365L);
    }
    
    public final boolean r() {
        return ((vai)this.a).f(45375820L);
    }
    
    public final void s(final int n, final String c, final String d, final String g, final String h, final Optional optional) {
        final ahaz builder = akcr.a.createBuilder();
        builder.copyOnWrite();
        final akcr akcr = (akcr)builder.instance;
        akcr.e = 1;
        akcr.b |= 0x2;
        final ahaz builder2 = akcq.a.createBuilder();
        builder2.copyOnWrite();
        final akcq akcq = (akcq)builder2.instance;
        c.getClass();
        akcq.b |= 0x1;
        akcq.c = c;
        builder2.copyOnWrite();
        final akcq akcq2 = (akcq)builder2.instance;
        d.getClass();
        akcq2.b |= 0x2;
        akcq2.d = d;
        builder.copyOnWrite();
        final akcr akcr2 = (akcr)builder.instance;
        final akcq d2 = (akcq)builder2.build();
        d2.getClass();
        akcr2.d = d2;
        akcr2.c = 1;
        builder.copyOnWrite();
        final akcr akcr3 = (akcr)builder.instance;
        g.getClass();
        akcr3.b |= 0x8;
        akcr3.g = g;
        builder.copyOnWrite();
        final akcr akcr4 = (akcr)builder.instance;
        h.getClass();
        akcr4.b |= 0x10;
        akcr4.h = h;
        if (optional.isPresent()) {
            final long longValue = (long)optional.get();
            builder.copyOnWrite();
            final akcr akcr5 = (akcr)builder.instance;
            akcr5.b |= 0x4;
            akcr5.f = longValue;
        }
        final wye wye = new wye(n - 1, 22);
        final ahaz builder3 = ((ahbh)ajtf.a).createBuilder();
        builder3.copyOnWrite();
        final ajtf ajtf = (ajtf)builder3.instance;
        final akcr l = (akcr)builder.build();
        l.getClass();
        ajtf.l = l;
        ajtf.b |= 0x4000;
        wye.a = (ajtf)builder3.build();
        if (n != 2 && n != 8) {
            ((acmr)this.a).d(wye, ajtz.v);
            return;
        }
        ((acmr)this.a).g(wye, ajtz.v);
    }
}
