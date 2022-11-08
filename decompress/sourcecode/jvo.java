import com.google.protobuf.MessageLite;
import java.util.function.Function;
import j$.util.Optional;
import android.content.Context;
import com.google.android.libraries.backup.Backup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvo
{
    @Backup
    public static final String SPATIAL_AUDIO_MEALBAR_SHOWN = "spatial_audio_mealbar_shown";
    private static final afdu a;
    
    static {
        a = afdu.s((Object)"spatial_audio_mealbar_shown");
    }
    
    private jvo() {
    }
    
    public static jvp a(final tdg tdg, final jvp jvp) {
        final agza builder = jvp.toBuilder();
        if (tdg.I("spatial_audio_mealbar_shown")) {
            final boolean u = tdb.u("spatial_audio_mealbar_shown", tdg);
            builder.copyOnWrite();
            final jvp jvp2 = (jvp)builder.instance;
            jvp2.b |= 0x1;
            jvp2.c = u;
        }
        return (jvp)builder.build();
    }
    
    static tku b(final Context context, final atjj atjj, final aftr aftr, final String s, final auip auip, final Optional optional) {
        return (tku)tdb.v("spatial_audio_mealbar_proto.pb", context, (qbo)atjj.a(), aftr, s, (tad)jye.b, (MessageLite)jvp.a, jvo.a, auip, (boolean)optional.map((Function)iof.s).orElse((Object)true));
    }
}
