import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.Map;
import j$.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.Set;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaac implements tak
{
    private final aaad a;
    private final aaam b;
    
    public aaac(final aaad a, final aaam b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(Bundle iterator) {
        final aaad a = this.a;
        final zkh c = a.h.c();
        afcw afcw;
        if (c.z()) {
            afcw = afgm.b;
        }
        else {
            final vce a2 = ((vcf)a.d.a()).a(c);
            final aaal aaal = (aaal)a.e.a();
            final ArrayList list = new ArrayList();
            vem.ai(zvj.c, 4, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(a.f.c())), aaal, (List)list);
            final afcr afcr = (afcr)a2.l(vem.an(aaal, (List)list)).ab();
            final HashMap hashMap = new HashMap();
            for (int size = ((List)afcr).size(), i = 0; i < size; ++i) {
                final String s = (String)((List)afcr).get(i);
                final afdu afdu = (afdu)a2.a(s).ab();
                if (afdu != null && !afdu.isEmpty()) {
                    final afie k = afdu.k();
                    while (((Iterator)k).hasNext()) {
                        hashMap.put(((Iterator)k).next(), s);
                    }
                }
                else {
                    trn.l("[Offline] Couldn't find parent key for refreshEntity: ".concat(String.valueOf(s)));
                }
            }
            final aaao aaao = ((aaam)a.g.a()).g.get();
            Object o;
            if (aaao == null) {
                o = afgq.a;
            }
            else {
                o = aaao.d();
            }
            hashMap.keySet().removeAll((Collection)Collection$_EL.stream((Collection)o).filter((Predicate)new wxn(14)).map((Function)zxk.e).collect(Collectors.toSet()));
            final afct h = afcw.h();
            for (final Map.Entry<K, String> entry : hashMap.entrySet()) {
                final anrz anrz = (anrz)a2.f((String)entry.getValue()).j((Class)anrz.class).af();
                if (anrz != null) {
                    h.g((Object)entry.getKey(), (Object)anrz.getConstraints());
                }
            }
            afcw = h.c();
        }
        final HashMap hashMap2 = new HashMap();
        afcr c2;
        if (a.k.c.f(45382418L)) {
            c2 = (afcr)Collection$_EL.stream((Collection)aaad.c).map((Function)new ysf(a, 11)).collect(afaj.a);
        }
        else {
            c2 = aaad.c;
        }
        for (final Map.Entry<String, V> entry2 : afcw.r()) {
            final agza builder = amsh.a.createBuilder();
            final String d = entry2.getKey();
            builder.copyOnWrite();
            final amsh amsh = (amsh)builder.instance;
            d.getClass();
            amsh.b |= 0x2;
            amsh.d = d;
            builder.copyOnWrite();
            final amsh amsh2 = (amsh)builder.instance;
            amsh2.c = 3;
            amsh2.b |= 0x1;
            final List list2 = (List)entry2.getValue();
            final agzc agzc = (agzc)((agzi)amsf.b).createBuilder();
            agzc.n((Iterable)list2);
            agzc.o((Iterable)c2);
            final agzg b = anrw.b;
            final agza builder2 = ((agzi)anrw.a).createBuilder();
            builder2.copyOnWrite();
            final anrw anrw = (anrw)builder2.instance;
            anrw.c |= 0x1;
            anrw.d = true;
            agzc.e((agyr)b, (Object)builder2.build());
            final amsf e = (amsf)((agza)agzc).build();
            builder.copyOnWrite();
            final amsh amsh3 = (amsh)builder.instance;
            e.getClass();
            amsh3.e = e;
            amsh3.b |= 0x4;
            final amsh amsh4 = (amsh)builder.build();
            final Integer value = vek.a((String)entry2.getKey());
            List list3;
            if ((list3 = (List)hashMap2.get(value)) == null) {
                list3 = new ArrayList();
                hashMap2.put(value, list3);
            }
            list3.add(amsh4);
        }
        iterator = (Bundle)hashMap2.values().iterator();
        while (((Iterator)iterator).hasNext()) {
            final List list4 = ((Iterator<List>)iterator).next();
            try {
                ((aaam)a.g.a()).b(list4);
            }
            catch (final aaan aaan) {
                final String format = String.format("Refresh error. Msg: %s", aaan.getMessage());
                trn.d(format, (Throwable)aaan);
                zjp.c(zjo.b, zjn.B, format, (Throwable)aaan);
            }
        }
        try {
            ListenableFuture listenableFuture;
            if ((listenableFuture = ((aaap)this.b.a.a()).b) == null) {
                listenableFuture = aftm.a;
            }
            listenableFuture.get();
            final aaad a3 = this.a;
            a3.c(a3.a());
            return 0;
        }
        catch (final ExecutionException | InterruptedException ex) {
            return 1;
        }
    }
}
