import j$.util.stream.Collectors;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import android.text.TextUtils;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaau implements aabj
{
    private final uyi a;
    private final avt b;
    private final adcr c;
    
    public aaau(final adcr c, final avt b, final uyi a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    private static ahvn b(final String s, final List list, int n, int n2, final boolean b, final boolean b2, final boolean b3, final List list2) {
        final boolean b4 = b3 && !list2.isEmpty();
        final agza builder = ((agzi)ahvn.a).createBuilder();
        if (b && b4) {
            builder.copyOnWrite();
            final ahvn ahvn = (ahvn)builder.instance;
            ahvn.c = 4;
            ahvn.b |= 0x1;
        }
        else if (b4) {
            builder.copyOnWrite();
            final ahvn ahvn2 = (ahvn)builder.instance;
            ahvn2.c = 2;
            ahvn2.b |= 0x1;
        }
        else if (b) {
            builder.copyOnWrite();
            final ahvn ahvn3 = (ahvn)builder.instance;
            ahvn3.c = 3;
            ahvn3.b |= 0x1;
        }
        else if (b2) {
            builder.copyOnWrite();
            final ahvn ahvn4 = (ahvn)builder.instance;
            ahvn4.c = 6;
            ahvn4.b |= 0x1;
        }
        else {
            builder.copyOnWrite();
            final ahvn ahvn5 = (ahvn)builder.instance;
            ahvn5.c = 1;
            ahvn5.b |= 0x1;
        }
        if (b4) {
            n = n2;
        }
        final int size = list.size();
        if (n > 0 || b) {
            final int n3 = n2 = (n + size - 1) % size;
            if (b4) {
                n2 = (int)list2.get(n3);
            }
            final aioe c = c(list.get(n2).f(), s, n2, false);
            builder.copyOnWrite();
            final ahvn ahvn6 = (ahvn)builder.instance;
            c.getClass();
            ahvn6.h = c;
            ahvn6.b |= 0x20;
        }
        if (n < size - 1 || b) {
            final int n4 = n2 = (n + 1) % size;
            if (b4) {
                n2 = (int)list2.get(n4);
            }
            final aioe c2 = c(list.get(n2).f(), s, n2, false);
            builder.copyOnWrite();
            final ahvn ahvn7 = (ahvn)builder.instance;
            c2.getClass();
            ahvn7.f = c2;
            ahvn7.b |= 0x8;
            builder.copyOnWrite();
            final ahvn ahvn8 = (ahvn)builder.instance;
            c2.getClass();
            ahvn8.d = c2;
            ahvn8.b |= 0x2;
        }
        if (b2) {
            final aioe c3 = c(list.get(n).f(), s, n, true);
            builder.copyOnWrite();
            final ahvn ahvn9 = (ahvn)builder.instance;
            c3.getClass();
            ahvn9.d = c3;
            ahvn9.b |= 0x2;
        }
        return (ahvn)builder.build();
    }
    
    private static aioe c(final String c, final String d, final int e, final boolean g) {
        final agza builder = ((agzi)amuk.a).createBuilder();
        if (!TextUtils.isEmpty((CharSequence)c)) {
            builder.copyOnWrite();
            final amuk amuk = (amuk)builder.instance;
            c.getClass();
            amuk.b |= 0x1;
            amuk.c = c;
        }
        if (!TextUtils.isEmpty((CharSequence)d)) {
            builder.copyOnWrite();
            final amuk amuk2 = (amuk)builder.instance;
            d.getClass();
            amuk2.b |= 0x2;
            amuk2.d = d;
        }
        if (e >= 0) {
            builder.copyOnWrite();
            final amuk amuk3 = (amuk)builder.instance;
            amuk3.b |= 0x4;
            amuk3.e = e;
        }
        builder.copyOnWrite();
        final amuk amuk4 = (amuk)builder.instance;
        amuk4.b |= 0x20;
        amuk4.g = g;
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        agzc.e((agyr)OfflineWatchEndpointOuterClass.offlineWatchEndpoint, builder.build());
        return (aioe)agzc.build();
    }
    
    private static List d(final String s, final List list, final int n, final int n2, final int n3, final List list2) {
        final int n4 = n3 & 0x2;
        final ArrayList list3 = new ArrayList(4);
        list3.add(e(s, list, n, n2, false, false));
        Label_0102: {
            if ((n3 & 0x1) != 0x0) {
                list3.add(e(s, list, n, n2, true, false));
                if (n4 == 0) {
                    break Label_0102;
                }
                list3.add(b(s, list, n, n2, true, false, true, list2));
            }
            else if (n4 == 0) {
                break Label_0102;
            }
            list3.add(b(s, list, n, n2, false, false, true, list2));
        }
        list3.add(e(s, list, n, n2, false, true));
        return list3;
    }
    
    private static ahvn e(final String s, final List list, final int n, final int n2, final boolean b, final boolean b2) {
        return b(s, list, n, n2, b, b2, false, new ArrayList());
    }
    
    public final ahvo a(final PlaybackStartDescriptor playbackStartDescriptor, final aaat aaat) {
        monitorenter(this);
        try {
            final List d = aaat.d();
            if (this.a.f(45352939L)) {
                final ahvo t = this.c.T(playbackStartDescriptor, (List)Collection$_EL.stream((Collection)d).map((Function)zxk.f).collect(Collectors.toList()));
                monitorexit(this);
                return t;
            }
            final String i = playbackStartDescriptor.i();
            final int size = d.size();
            final int max = Math.max(playbackStartDescriptor.a(), 0);
            List list2;
            if (size > 1) {
                final ArrayList<Integer> list = new ArrayList<Integer>();
                for (int j = 0; j < size; ++j) {
                    list.add(j);
                }
                list.set(0, max);
                list.set(max, 0);
                this.b.Y((ArrayList)list, size);
                list2 = d(i, d, max, 0, 7, list);
            }
            else {
                int n;
                if (!TextUtils.isEmpty((CharSequence)i)) {
                    n = 5;
                }
                else {
                    n = 4;
                }
                list2 = d(i, d, max, max, n, new ArrayList());
            }
            final agzc agzc = (agzc)((agzi)ahvo.a).createBuilder();
            agzc.h(list2);
            agzc.g(list2);
            final ahvo ahvo = (ahvo)agzc.build();
            monitorexit(this);
            return ahvo;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
