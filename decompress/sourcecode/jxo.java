import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass;
import java.util.Collection;
import java.util.ArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

final class jxo extends acpi
{
    final aexq a;
    final aexq b;
    final aexq c;
    final veu d;
    final Parcelable e;
    public final boolean f;
    public final boolean g;
    final agza h;
    public final agza i;
    
    public jxo(final agza h, final aexq a, final aexq b, final aexq c, final veu d, final LinearLayoutManager linearLayoutManager, final boolean f, final boolean g, final agza i, final boolean b2, final acjb acjb) {
        if (h != null && !b2) {
            final ArrayList list = new ArrayList(((tdv)acjb).size());
            acjb.k((Collection)list);
            h.copyOnWrite();
            final ajqj ajqj = (ajqj)h.instance;
            final ajqj a2 = ajqj.a;
            ajqj.c = ajqj.emptyProtobufList();
            for (int size = list.size(), j = 0; j < size; ++j) {
                final Object value = list.get(j);
                if (value instanceof aiit) {
                    final agzc agzc = (agzc)((agzi)anss.a).createBuilder();
                    agzc.e((agyr)ChipCloudRendererOuterClass.chipCloudChipRenderer, value);
                    h.aN(agzc);
                }
                else if (value instanceof aibb) {
                    final agzc agzc2 = (agzc)((agzi)anss.a).createBuilder();
                    agzc2.e((agyr)ButtonRendererOuterClass.buttonRenderer, value);
                    h.aN(agzc2);
                }
                else if (value instanceof aiiy) {
                    final agzc agzc3 = (agzc)((agzi)anss.a).createBuilder();
                    agzc3.e((agyr)ChipCloudRendererOuterClass.chipDividerRenderer, value);
                    h.aN(agzc3);
                }
                else if (value instanceof abzh) {
                    final agzc agzc4 = (agzc)((agzi)anss.a).createBuilder();
                    agzc4.e((agyr)ElementRendererOuterClass.elementRenderer, ((abzh)value).a);
                    h.aN(agzc4);
                }
            }
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = ((nw)linearLayoutManager).Q();
        this.h = h;
        this.f = f;
        this.g = g;
        this.i = i;
    }
}
