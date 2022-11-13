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

public final class admk implements vgn
{
    private final zmf a;
    private final adku b;
    private final aldf c;
    
    public admk(final adku b, final vaf vaf, final zmf a) {
        this.c = vam.a(vaf);
        this.b = b;
        this.a = a;
    }
    
    public final void b(final String s, final Bundle bundle) {
        List subList = null;
        Label_0175: {
            try {
                final ArrayList list = new ArrayList(this.b.c().values());
                final zme c = this.a.c();
                if (c != null) {
                    if (!c.z()) {
                        final String d = c.d();
                        final ArrayList list2 = new ArrayList();
                        for (int size = list.size(), i = 0; i < size; ++i) {
                            final admv admv = (admv)list.get(i);
                            if (d.equals(admv.e)) {
                                list2.add(admv);
                            }
                        }
                        Collections.sort((List<Object>)list2, (Comparator<? super Object>)new mm(18));
                        Collections.reverse(list2);
                        subList = list2;
                        if (list2.size() > 10) {
                            subList = list2.subList(0, 10);
                        }
                        break Label_0175;
                    }
                }
            }
            catch (final adkv adkv) {
                ttr.d("Error while querying upload jobs from JobStorage", (Throwable)adkv);
            }
            subList = null;
        }
        if (subList == null) {
            return;
        }
        final Iterator iterator = subList.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final ahaz builder = ((ahbh)iterator.next()).toBuilder();
            builder.copyOnWrite();
            final admv admv2 = (admv)builder.instance;
            admv2.b &= 0xFFFFFFFE;
            admv2.e = admv.a.e;
            builder.copyOnWrite();
            final admv admv3 = (admv)builder.instance;
            admv3.i = null;
            admv3.b &= 0xFFFFFFEF;
            builder.copyOnWrite();
            final admv admv4 = (admv)builder.instance;
            admv4.b &= 0xFFFFF7FF;
            admv4.n = admv.a.n;
            final admv admv5 = (admv)builder.build();
            final String k = admv5.k;
            final StringBuilder sb = new StringBuilder("frontend_id: ");
            sb.append(k);
            sb.append("\n");
            final String string = sb.toString();
            final String ac = admv5.ac;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append("video_id: ");
            sb2.append(ac);
            sb2.append("\n");
            final String string2 = sb2.toString();
            final String encodeToString = Base64.encodeToString(((agzk)admv5).toByteArray(), 0);
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
        final ahaz builder2 = ((ahbh)aldf.a).createBuilder();
        aldf a;
        try {
            ((agzj)builder2).mergeFrom(((agzk)this.c).toByteArray(), ExtensionRegistryLite.getGeneratedRegistry());
            builder2.copyOnWrite();
            ((aldf)builder2.instance).j = aldf.emptyLongList();
            builder2.copyOnWrite();
            ((aldf)builder2.instance).k = aldf.emptyLongList();
            builder2.copyOnWrite();
            ((aldf)builder2.instance).e = aldf.emptyLongList();
            builder2.copyOnWrite();
            ((aldf)builder2.instance).i = aldf.emptyLongList();
            builder2.copyOnWrite();
            ((aldf)builder2.instance).m = aldf.emptyLongList();
            builder2.copyOnWrite();
            ((aldf)builder2.instance).l = aldf.emptyLongList();
            a = (aldf)builder2.build();
        }
        catch (final ahca ahca) {
            ttr.d("Exception while cloning", (Throwable)ahca);
            a = aldf.a;
        }
        bundle.putString("upload_config", Base64.encodeToString(((agzk)a).toByteArray(), 0));
        ((ahbh)a).toString();
    }
    
    public final void c(final Bundle bundle) {
    }
}
