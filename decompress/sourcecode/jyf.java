import com.google.protobuf.MessageLite;
import java.util.function.Function;
import j$.util.Optional;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jyf
{
    private static final afdu b;
    
    static {
        b = afdu.t((Object)"feed_filter_bar_tutorial_last_shown_timestamp", (Object)"feed_filter_bar_tutorial_shown_count");
    }
    
    static jyh a(final tdg tdg, final jyh jyh) {
        final agza builder = jyh.toBuilder();
        if (tdg.I("feed_filter_bar_tutorial_last_shown_timestamp")) {
            final long e = tdg.E("feed_filter_bar_tutorial_last_shown_timestamp", -1L);
            builder.copyOnWrite();
            final jyh jyh2 = (jyh)builder.instance;
            jyh2.b |= 0x1;
            jyh2.c = e;
        }
        if (tdg.I("feed_filter_bar_tutorial_shown_count")) {
            final int d = tdg.D("feed_filter_bar_tutorial_shown_count", 0);
            builder.copyOnWrite();
            final jyh jyh3 = (jyh)builder.instance;
            jyh3.b |= 0x2;
            jyh3.d = d;
        }
        return (jyh)builder.build();
    }
    
    public static tku b(final Context context, final atjj atjj, final aftr aftr, final String s, final auip auip, final Optional optional) {
        return (tku)tdb.v("topbar_proto.pb", context, (qbo)atjj.a(), aftr, s, (tad)jye.a, (MessageLite)jyh.a, jyf.b, auip, (boolean)optional.map((Function)jxm.c).orElse((Object)true));
    }
}
