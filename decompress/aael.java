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

public final class aael implements aafc
{
    private final vbs a;
    private final aefs b;
    private final aefs c;
    
    public aael(final aefs b, final aefs c, final vbs a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    private static ahze b(final String s, final List list, int n, int n2, final boolean b, final boolean b2, final boolean b3, final List list2) {
        final boolean b4 = b3 && !list2.isEmpty();
        final ahcr builder = ((ahcz)ahze.a).createBuilder();
        if (b && b4) {
            builder.copyOnWrite();
            final ahze ahze = (ahze)builder.instance;
            ahze.c = 4;
            ahze.b |= 0x1;
        }
        else if (b4) {
            builder.copyOnWrite();
            final ahze ahze2 = (ahze)builder.instance;
            ahze2.c = 2;
            ahze2.b |= 0x1;
        }
        else if (b) {
            builder.copyOnWrite();
            final ahze ahze3 = (ahze)builder.instance;
            ahze3.c = 3;
            ahze3.b |= 0x1;
        }
        else if (b2) {
            builder.copyOnWrite();
            final ahze ahze4 = (ahze)builder.instance;
            ahze4.c = 6;
            ahze4.b |= 0x1;
        }
        else {
            builder.copyOnWrite();
            final ahze ahze5 = (ahze)builder.instance;
            ahze5.c = 1;
            ahze5.b |= 0x1;
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
            final aisc c = c(list.get(n2).f(), s, n2, false);
            builder.copyOnWrite();
            final ahze ahze6 = (ahze)builder.instance;
            c.getClass();
            ahze6.h = c;
            ahze6.b |= 0x20;
        }
        if (n < size - 1 || b) {
            final int n4 = n2 = (n + 1) % size;
            if (b4) {
                n2 = (int)list2.get(n4);
            }
            final aisc c2 = c(list.get(n2).f(), s, n2, false);
            builder.copyOnWrite();
            final ahze ahze7 = (ahze)builder.instance;
            c2.getClass();
            ahze7.f = c2;
            ahze7.b |= 0x8;
            builder.copyOnWrite();
            final ahze ahze8 = (ahze)builder.instance;
            c2.getClass();
            ahze8.d = c2;
            ahze8.b |= 0x2;
        }
        if (b2) {
            final aisc c3 = c(list.get(n).f(), s, n, true);
            builder.copyOnWrite();
            final ahze ahze9 = (ahze)builder.instance;
            c3.getClass();
            ahze9.d = c3;
            ahze9.b |= 0x2;
        }
        return (ahze)builder.build();
    }
    
    private static aisc c(final String c, final String d, final int e, final boolean g) {
        final ahcr builder = ((ahcz)amyt.a).createBuilder();
        if (!TextUtils.isEmpty((CharSequence)c)) {
            builder.copyOnWrite();
            final amyt amyt = (amyt)builder.instance;
            c.getClass();
            amyt.b |= 0x1;
            amyt.c = c;
        }
        if (!TextUtils.isEmpty((CharSequence)d)) {
            builder.copyOnWrite();
            final amyt amyt2 = (amyt)builder.instance;
            d.getClass();
            amyt2.b |= 0x2;
            amyt2.d = d;
        }
        if (e >= 0) {
            builder.copyOnWrite();
            final amyt amyt3 = (amyt)builder.instance;
            amyt3.b |= 0x4;
            amyt3.e = e;
        }
        builder.copyOnWrite();
        final amyt amyt4 = (amyt)builder.instance;
        amyt4.b |= 0x20;
        amyt4.g = g;
        final ahct ahct = (ahct)((ahcz)aisc.a).createBuilder();
        ahct.e((ahci)OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (Object)builder.build());
        return (aisc)((ahcr)ahct).build();
    }
    
    private static List d(final String s, final List list, final int n, final int n2, final int n3, final List list2) {
        final ArrayList list3 = new ArrayList(4);
        list3.add(e(s, list, n, n2, false, false));
        final int n4 = n3 & 0x2;
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
    
    private static ahze e(final String s, final List list, final int n, final int n2, final boolean b, final boolean b2) {
        return b(s, list, n, n2, b, b2, false, new ArrayList());
    }
    
    public final ahzf a(final PlaybackStartDescriptor playbackStartDescriptor, final aaek aaek) {
        monitorenter(this);
        try {
            final List d = aaek.d();
            if (this.a.f(45352939L)) {
                final ahzf au = this.b.au(playbackStartDescriptor, (List)Collection$_EL.stream((Collection)d).map((Function)zzl.i).collect(Collectors.toList()));
                monitorexit(this);
                return au;
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
                this.c.cv(list, size);
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
            final ahct ahct = (ahct)((ahcz)ahzf.a).createBuilder();
            ahct.h((Iterable)list2);
            ahct.g((Iterable)list2);
            final ahzf ahzf = (ahzf)((ahcr)ahct).build();
            monitorexit(this);
            return ahzf;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
