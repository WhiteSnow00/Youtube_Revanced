import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import com.google.protos.youtube.api.innertube.DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifw implements Runnable
{
    public final ifx a;
    public final Collection b;
    
    public ifw(final ifx a, final Collection b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final ifx a = this.a;
        final Collection b = this.b;
        if (!a.b.isEmpty()) {
            final afeq o = afeq.o((Collection)a.b);
            for (int size = ((List)o).size(), i = 0; i < size; ++i) {
                final Object a2 = ((pvh)((List)o).get(i)).a;
                final HashSet<String> set = new HashSet<String>();
                final HashMap<String, aivh> hashMap = new HashMap<String, aivh>();
                final HashSet<aivh> set2 = new HashSet<aivh>();
                final jsv jsv = (jsv)a2;
                final HashSet ae = agqs.ae((Iterable)jsv.g.g);
                final ArrayList list = new ArrayList();
                for (final aimw aimw : jsv.g.e) {
                    aivh a3;
                    if (aimw.b == 48602820) {
                        a3 = (aivh)aimw.c;
                    }
                    else {
                        a3 = aivh.a;
                    }
                    aive aive;
                    if ((aive = a3.k) == null) {
                        aive = aive.a;
                    }
                    if (aive.b == 135739232) {
                        aivh a4;
                        if (aimw.b == 48602820) {
                            a4 = (aivh)aimw.c;
                        }
                        else {
                            a4 = aivh.a;
                        }
                        list.add(a4);
                    }
                }
                final Iterator iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    aive aive2;
                    if ((aive2 = ((aivh)iterator2.next()).k) == null) {
                        aive2 = aive.a;
                    }
                    anhx a5;
                    if (aive2.b == 135739232) {
                        a5 = (anhx)aive2.c;
                    }
                    else {
                        a5 = anhx.a;
                    }
                    set.add(a5.c);
                }
                for (final aaat aaat : b) {
                    final String a6 = aaat.a.a;
                    final hzn hzn = (hzn)jsv.b.a();
                    aaat.getClass();
                    final aivh aivh = (aivh)hzn.E((Class)aaat.class, (Class)aivh.class, (Object)aaat, (afev)null);
                    if (set.contains(a6)) {
                        hashMap.put(a6, aivh);
                    }
                    else {
                        if (ae.contains(a6)) {
                            continue;
                        }
                        set2.add(aivh);
                    }
                }
                Label_1266: {
                    if (((fmr)jsv.c.a()).i()) {
                        final acjn t = jsv.d.t();
                        for (int j = 0; j < t.a(); ++j) {
                            final Object c = t.c(j);
                            if (c instanceof aivh) {
                                final aivh aivh2 = (aivh)c;
                                aiqj a7;
                                if (aivh2.c == 4) {
                                    a7 = (aiqj)aivh2.d;
                                }
                                else {
                                    a7 = aiqj.a;
                                }
                                if (flh.c(a7)) {
                                    break Label_1266;
                                }
                            }
                            if (c instanceof DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer) {
                                break Label_1266;
                            }
                            if (t.c(j) instanceof aims) {
                                break;
                            }
                        }
                        final Context a8 = jsv.a;
                        final ahaz builder = ((ahbh)aivh.a).createBuilder();
                        final ajut g = acak.g(new String[] { a8.getString(2132018917) });
                        builder.copyOnWrite();
                        final aivh aivh3 = (aivh)builder.instance;
                        g.getClass();
                        aivh3.g = g;
                        aivh3.b |= 0x1;
                        final aiqj a9 = flh.a;
                        builder.copyOnWrite();
                        final aivh aivh4 = (aivh)builder.instance;
                        a9.getClass();
                        aivh4.d = a9;
                        aivh4.c = 4;
                        final ahaz builder2 = ((ahbh)aive.a).createBuilder();
                        final ahaz builder3 = anhx.a.createBuilder();
                        builder3.copyOnWrite();
                        final anhx anhx = (anhx)builder3.instance;
                        anhx.b |= 0x1;
                        anhx.c = "PPSV";
                        builder2.copyOnWrite();
                        final aive aive3 = (aive)builder2.instance;
                        final anhx c2 = (anhx)builder3.build();
                        c2.getClass();
                        aive3.c = c2;
                        aive3.b = 135739232;
                        builder.copyOnWrite();
                        final aivh aivh5 = (aivh)builder.instance;
                        final aive k = (aive)builder2.build();
                        k.getClass();
                        aivh5.k = k;
                        aivh5.b |= 0x8000;
                        final ahaz builder4 = ((ahbh)aivf.a).createBuilder();
                        final ahaz builder5 = ((ahbh)aivk.a).createBuilder();
                        final long seconds = TimeUnit.MILLISECONDS.toSeconds(Long.MAX_VALUE);
                        builder5.copyOnWrite();
                        final aivk aivk = (aivk)builder5.instance;
                        aivk.b |= 0x1;
                        aivk.c = seconds;
                        builder4.copyOnWrite();
                        final aivf aivf = (aivf)builder4.instance;
                        final aivk c3 = (aivk)builder5.build();
                        c3.getClass();
                        aivf.c = c3;
                        aivf.b = 135744618;
                        builder.copyOnWrite();
                        final aivh aivh6 = (aivh)builder.instance;
                        final aivf l = (aivf)builder4.build();
                        l.getClass();
                        aivh6.l = l;
                        aivh6.b |= 0x10000;
                        final ahaz builder6 = ((ahbh)aivj.a).createBuilder();
                        final ahaz builder7 = ((ahbh)akdk.a).createBuilder();
                        final ahbb ahbb = (ahbb)((ahbh)akdi.a).createBuilder();
                        final akdh m = akdh.l;
                        ((ahaz)ahbb).copyOnWrite();
                        final akdi akdi = (akdi)ahbb.instance;
                        akdi.c = m.sy;
                        akdi.b |= 0x1;
                        builder7.copyOnWrite();
                        final akdk akdk = (akdk)builder7.instance;
                        final akdi c4 = (akdi)((ahaz)ahbb).build();
                        c4.getClass();
                        akdk.c = c4;
                        akdk.b |= 0x1;
                        builder6.copyOnWrite();
                        final aivj aivj = (aivj)builder6.instance;
                        final akdk f = (akdk)builder7.build();
                        f.getClass();
                        aivj.f = f;
                        aivj.b |= 0x80;
                        builder.copyOnWrite();
                        final aivh aivh7 = (aivh)builder.instance;
                        final aivj i2 = (aivj)builder6.build();
                        i2.getClass();
                        aivh7.i = i2;
                        aivh7.b |= 0x20;
                        set2.add((aivh)builder.build());
                    }
                }
                final ArrayList list2 = new ArrayList(set2);
                Collections.sort((List<E>)list2, (Comparator<? super E>)jsv.h);
                final ArrayList list3 = new ArrayList(list.size() + list2.size());
                int n = 0;
                int n2 = 0;
                while (n < list.size() || n2 < list2.size()) {
                    final aivh aivh8 = (aivh)jsv.j((List)list, n);
                    final aivh aivh9 = (aivh)jsv.j((List)list2, n2);
                    Label_1613: {
                        if (aivh8 != null) {
                            if (aivh9 == null) {
                                list3.add((Object)jsv.g(aivh8, (Map)hashMap));
                            }
                            else {
                                if (jsv.h.a(aivh8, aivh9) > 0) {
                                    list3.add((Object)aivh9);
                                    break Label_1613;
                                }
                                list3.add((Object)jsv.g(aivh8, (Map)hashMap));
                            }
                            ++n;
                            continue;
                        }
                        list3.add((Object)aivh9);
                    }
                    ++n2;
                }
                int f2;
                if (jsv.f) {
                    f2 = jsv.g.f + 1;
                }
                else {
                    f2 = jsv.g.f;
                }
                int n3 = 0;
                while (f2 < ((tfz)jsv.e).size() || n3 < list3.size()) {
                    Object value;
                    if (f2 < ((tfz)jsv.e).size()) {
                        value = ((tfz)jsv.e).get(f2);
                    }
                    else {
                        value = null;
                    }
                    final aivh aivh10 = (aivh)jsv.j((List)list3, n3);
                    Label_1509: {
                        if (value != null) {
                            if (value instanceof aivh) {
                                aive aive4;
                                if ((aive4 = ((aivh)value).k) == null) {
                                    aive4 = aive.a;
                                }
                                if (aive4.b == 135739232) {
                                    break Label_1509;
                                }
                            }
                            ++f2;
                            continue;
                        }
                    }
                    if (value == null) {
                        jsv.e.add((Object)aivh10);
                    }
                    else {
                        if (aivh10 == null) {
                            ((tfz)jsv.e).remove(f2);
                            continue;
                        }
                        if (!value.equals(aivh10)) {
                            jsv.e.n(f2, (Object)aivh10);
                        }
                    }
                    ++f2;
                    ++n3;
                }
                jsv.m();
            }
        }
    }
}
