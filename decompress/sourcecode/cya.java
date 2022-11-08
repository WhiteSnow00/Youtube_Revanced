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

public final class cya
{
    public final Object a;
    
    public cya() {
        this.a = new ArrayList();
    }
    
    public cya(final acko a, final byte[] array) {
        this.a = a;
    }
    
    public cya(final atjj a) {
        a.getClass();
        this.a = a;
    }
    
    public cya(final atjj a, final byte[] array) {
        a.getClass();
        this.a = a;
    }
    
    public cya(final atjj a, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public cya(final cl a) {
        this.a = a;
    }
    
    public cya(final cxz a) {
        this.a = a;
    }
    
    private cya(final ege a) {
        this.a = a;
    }
    
    public cya(final eqv a) {
        this.a = a;
    }
    
    public cya(final fzo a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
    }
    
    public cya(final hnj a) {
        this.a = a;
    }
    
    public cya(final Class a) {
        this.a = a;
    }
    
    public cya(final Object a) {
        this.a = a;
    }
    
    public cya(final String a) {
        this.a = a;
    }
    
    public cya(final String a, final byte[] array) {
        this.a = a;
    }
    
    public cya(final List a) {
        this.a = a;
    }
    
    public cya(final Map map) {
        this.a = afcw.k(map);
    }
    
    public cya(final tzs a) {
        this.a = a;
    }
    
    public cya(final uyi a) {
        this.a = a;
    }
    
    public cya(final vax a) {
        this.a = a;
    }
    
    public cya(final byte[] array) {
        this.a = dpg.j(0);
    }
    
    public cya(final byte[] array, final byte[] array2) {
        this.a = new HashMap();
    }
    
    public cya(final byte[] array, final char[] array2) {
        this.a = atig.aD();
    }
    
    public cya(final char[] array) {
        this.a = new HashMap();
    }
    
    public cya(final int[] array) {
        this.a = new HashSet();
    }
    
    public cya(final File[] a) {
        this.a = a;
    }
    
    public cya(final short[] array) {
        this.a = new HashMap();
    }
    
    public static cya i(final ege ege) {
        return new cya(ege);
    }
    
    public static boolean k(final File file) {
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                k(listFiles[i]);
            }
        }
        return file.delete();
    }
    
    public final dlt a(final Class clazz, final Class clazz2) {
        monitorenter(this);
        try {
            if (clazz2.isAssignableFrom(clazz)) {
                final dlu a = dlu.a;
                monitorexit(this);
                return (dlt)a;
            }
            for (eg eg : this.a) {
                if (eg.H(clazz, clazz2)) {
                    final Object d = eg.d;
                    monitorexit(this);
                    return (dlt)d;
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
    
    public final void c(final Class clazz, final Class clazz2, final dlt dlt) {
        synchronized (this) {
            ((List<eg>)this.a).add(new eg(clazz, clazz2, dlt));
        }
    }
    
    public final dzn d(final ByteBuffer byteBuffer) {
        synchronized (this) {
            dzn dzn;
            if ((dzn = ((Queue<dzn>)this.a).poll()) == null) {
                dzn = new dzn(null);
            }
            dzn.c = null;
            Arrays.fill((byte[])dzn.b, (byte)0);
            dzn.d = new dcv();
            dzn.a = 0;
            dzn.c = byteBuffer.asReadOnlyBuffer();
            ((ByteBuffer)dzn.c).position(0);
            ((ByteBuffer)dzn.c).order(ByteOrder.LITTLE_ENDIAN);
            return dzn;
        }
    }
    
    public final void e(final dzn dzn) {
        synchronized (this) {
            dzn.c = null;
            dzn.d = null;
            ((Queue<dzn>)this.a).offer(dzn);
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
        return ((hnj)this.a).a().isPresent();
    }
    
    public final void l(final wwv wwv, final int n) {
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        final agzg browseEndpoint = BrowseEndpointOuterClass.browseEndpoint;
        final agza builder = ((agzi)aial.a).createBuilder();
        builder.copyOnWrite();
        final aial aial = (aial)builder.instance;
        aial.b |= 0x1;
        aial.c = "FEsfv_audio_picker";
        builder.copyOnWrite();
        final aial aial2 = (aial)builder.instance;
        aial2.b |= 0x4;
        aial2.d = "";
        agzc.e((agyr)browseEndpoint, (Object)builder.build());
        final agyc b = agyc.b;
        ((agza)agzc).copyOnWrite();
        final aioe aioe = (aioe)agzc.instance;
        b.getClass();
        aioe.b |= 0x1;
        aioe.c = b;
        ((vax)this.a).a(avt.Q(wwv, (aioe)((agza)agzc).build(), n));
    }
    
    public final boolean m() {
        return ((uyi)this.a).f(45377319L);
    }
    
    public final boolean n(final boolean b) {
        return !b || ((uyi)this.a).f(45382804L);
    }
    
    public final boolean o(final boolean b) {
        return ((uyi)this.a).f(45377170L) && this.n(b);
    }
    
    public final void p(final boolean b) {
        ((atig)this.a).tr((Object)b);
    }
    
    public final boolean q() {
        return ((uyi)this.a).f(45357365L);
    }
    
    public final boolean r() {
        return ((uyi)this.a).f(45375820L);
    }
    
    public final void s(final int n, final String c, final String d, final String g, final String h, final Optional optional) {
        final agza builder = ((agzi)akao.a).createBuilder();
        builder.copyOnWrite();
        final akao akao = (akao)builder.instance;
        akao.e = 1;
        akao.b |= 0x2;
        final agza builder2 = ((agzi)akan.a).createBuilder();
        builder2.copyOnWrite();
        final akan akan = (akan)builder2.instance;
        c.getClass();
        akan.b |= 0x1;
        akan.c = c;
        builder2.copyOnWrite();
        final akan akan2 = (akan)builder2.instance;
        d.getClass();
        akan2.b |= 0x2;
        akan2.d = d;
        builder.copyOnWrite();
        final akao akao2 = (akao)builder.instance;
        final akan d2 = (akan)builder2.build();
        d2.getClass();
        akao2.d = d2;
        akao2.c = 1;
        builder.copyOnWrite();
        final akao akao3 = (akao)builder.instance;
        g.getClass();
        akao3.b |= 0x8;
        akao3.g = g;
        builder.copyOnWrite();
        final akao akao4 = (akao)builder.instance;
        h.getClass();
        akao4.b |= 0x10;
        akao4.h = h;
        if (optional.isPresent()) {
            final long longValue = (long)optional.get();
            builder.copyOnWrite();
            final akao akao5 = (akao)builder.instance;
            akao5.b |= 0x4;
            akao5.f = longValue;
        }
        final wwc wwc = new wwc(n - 1, 22);
        final agza builder3 = ((agzi)ajrb.a).createBuilder();
        builder3.copyOnWrite();
        final ajrb ajrb = (ajrb)builder3.instance;
        final akao l = (akao)builder.build();
        l.getClass();
        ajrb.l = l;
        ajrb.b |= 0x4000;
        wwc.a = (ajrb)builder3.build();
        if (n != 2 && n != 8) {
            ((acko)this.a).d(wwc, ajrw.v);
            return;
        }
        ((acko)this.a).g(wwc, ajrw.v);
    }
}
