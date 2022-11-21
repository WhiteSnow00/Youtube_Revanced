import java.util.Iterator;
import com.google.protobuf.ExtensionRegistryLite;
import android.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adny implements vhv
{
    private final zoa a;
    private final admj b;
    private final alff c;
    
    public adny(final admj b, final vbo vbo, final zoa a) {
        this.c = vbv.a(vbo);
        this.b = b;
        this.a = a;
    }
    
    public final void b(final String s, final Bundle bundle) {
        List subList = null;
        Label_0175: {
            try {
                final ArrayList list = new ArrayList(this.b.c().values());
                final znz c = this.a.c();
                if (c != null) {
                    if (!c.z()) {
                        final String d = c.d();
                        final ArrayList list2 = new ArrayList();
                        for (int size = list.size(), i = 0; i < size; ++i) {
                            final adoj adoj = (adoj)list.get(i);
                            if (d.equals(adoj.e)) {
                                list2.add(adoj);
                            }
                        }
                        Collections.sort((List<Object>)list2, (Comparator<? super Object>)new mn(18));
                        Collections.reverse(list2);
                        subList = list2;
                        if (list2.size() > 10) {
                            subList = list2.subList(0, 10);
                        }
                        break Label_0175;
                    }
                }
            }
            catch (final admk admk) {
                tut.d("Error while querying upload jobs from JobStorage", (Throwable)admk);
            }
            subList = null;
        }
        if (subList == null) {
            return;
        }
        final Iterator iterator = subList.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final ahcr builder = ((adoj)iterator.next()).toBuilder();
            builder.copyOnWrite();
            final adoj adoj2 = (adoj)builder.instance;
            adoj2.b &= 0xFFFFFFFE;
            adoj2.e = adoj.a.e;
            builder.copyOnWrite();
            final adoj adoj3 = (adoj)builder.instance;
            adoj3.i = null;
            adoj3.b &= 0xFFFFFFEF;
            builder.copyOnWrite();
            final adoj adoj4 = (adoj)builder.instance;
            adoj4.b &= 0xFFFFF7FF;
            adoj4.n = adoj.a.n;
            final adoj adoj5 = (adoj)builder.build();
            final String k = adoj5.k;
            final StringBuilder sb = new StringBuilder("frontend_id: ");
            sb.append(k);
            sb.append("\n");
            final String string = sb.toString();
            final String ac = adoj5.ac;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append("video_id: ");
            sb2.append(ac);
            sb2.append("\n");
            final String string2 = sb2.toString();
            final String encodeToString = Base64.encodeToString(adoj5.toByteArray(), 0);
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(string2);
            sb3.append("base64: ");
            sb3.append(encodeToString);
            final String string3 = sb3.toString();
            final StringBuilder sb4 = new StringBuilder("upload_job_");
            sb4.append(n);
            bundle.putString(sb4.toString(), string3);
            ++n;
        }
        final ahcr builder2 = alff.a.createBuilder();
        alff a;
        try {
            ((ahbb)builder2).mergeFrom(this.c.toByteArray(), ExtensionRegistryLite.getGeneratedRegistry());
            builder2.copyOnWrite();
            ((alff)builder2.instance).j = ahcz.emptyLongList();
            builder2.copyOnWrite();
            ((alff)builder2.instance).k = ahcz.emptyLongList();
            builder2.copyOnWrite();
            ((alff)builder2.instance).e = ahcz.emptyLongList();
            builder2.copyOnWrite();
            ((alff)builder2.instance).i = ahcz.emptyLongList();
            builder2.copyOnWrite();
            ((alff)builder2.instance).m = ahcz.emptyLongList();
            builder2.copyOnWrite();
            ((alff)builder2.instance).l = ahcz.emptyLongList();
            a = (alff)builder2.build();
        }
        catch (final ahds ahds) {
            tut.d("Exception while cloning", (Throwable)ahds);
            a = alff.a;
        }
        bundle.putString("upload_config", Base64.encodeToString(a.toByteArray(), 0));
        a.toString();
    }
    
    public final void c(final Bundle bundle) {
    }
}
