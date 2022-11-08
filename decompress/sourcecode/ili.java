import android.content.res.Resources;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ili extends ikr
{
    private final Context a;
    private final atjj b;
    private final uyi c;
    private final uyi d;
    private final arud e;
    
    public ili(final Context a, final arud e, final atjj b, final uyi c, final uyi d, final byte[] array, final byte[] array2) {
        super((Class)zyz.class, (Class)angj.class);
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private static aioe a(final String c) {
        final agza builder = ((agzi)aial.a).createBuilder();
        builder.copyOnWrite();
        final aial aial = (aial)builder.instance;
        aial.b |= 0x1;
        aial.c = c;
        final aial aial2 = (aial)builder.build();
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        agzc.e((agyr)BrowseEndpointOuterClass.browseEndpoint, (Object)aial2);
        return (aioe)((agza)agzc).build();
    }
    
    private static aioe f(final String d) {
        final agza builder = amuk.a.createBuilder();
        builder.copyOnWrite();
        final amuk amuk = (amuk)builder.instance;
        amuk.b |= 0x2;
        amuk.d = d;
        final amuk amuk2 = (amuk)builder.build();
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        agzc.e((agyr)OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (Object)amuk2);
        return (aioe)((agza)agzc).build();
    }
}
