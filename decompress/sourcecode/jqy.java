import android.net.Uri;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqy
{
    private static final String[] b;
    
    static {
        b = new String[] { "background_pip_policy_v2" };
    }
    
    static jqx a() {
        final agza builder = jqw.a.createBuilder();
        builder.copyOnWrite();
        final jqw jqw = (jqw)builder.instance;
        jqw.b |= 0x1;
        jqw.c = true;
        final jqw c = (jqw)builder.build();
        final agza builder2 = jqx.a.createBuilder();
        builder2.copyOnWrite();
        final jqx jqx = (jqx)builder2.instance;
        c.getClass();
        jqx.c = c;
        jqx.b |= 0x1;
        return (jqx)builder2.build();
    }
    
    public static tku b(final Context context, final String c, final aftr aftr, final qbo qbo, final auip auip) {
        final qmr a = qms.a(context);
        a.e("settings");
        a.f("back_up_settings.pb");
        final Uri a2 = a.a();
        final qos d = qou.d(context, (Executor)aftr);
        d.c = c;
        d.b();
        d.d(jqy.b);
        d.e((qot)fnd.d);
        final qou a3 = d.a();
        final qoq a4 = qor.a();
        a4.e((MessageLite)a());
        a4.f(a2);
        a4.b((qon)a3);
        return (tku)auip.bK(qan.h(qbo.D(a4.a())), (MessageLite)a());
    }
}
