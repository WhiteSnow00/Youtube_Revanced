import com.google.protos.youtube.api.innertube.ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint;
import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcc implements vau
{
    public final vax a;
    public final tny b;
    private final ScheduledExecutorService c;
    private final Executor d;
    private final Runnable e;
    private final Runnable f;
    private final Runnable g;
    private final zki h;
    private final acwg i;
    private final acwj j;
    private final vup k;
    private final aeim l;
    
    public fcc(final vup k, final ScheduledExecutorService c, final Executor d, final acwz acwz, final acwz acwz2, final adea adea, final aeim l, final zki h, final vax a, final tny b, final acwg i, final acwj j, final byte[] array, final byte[] array2, final byte[] array3) {
        this.k = k;
        c.getClass();
        this.c = c;
        this.d = d;
        acwz.getClass();
        this.e = new exu(acwz, 4);
        acwz2.getClass();
        this.f = new exu(acwz2, 4);
        adea.getClass();
        this.g = new exu(adea, 5);
        l.getClass();
        this.l = l;
        h.getClass();
        this.h = h;
        this.a = a;
        this.b = b;
        i.getClass();
        this.i = i;
        j.getClass();
        this.j = j;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        if (this.h.t()) {
            this.c.execute(this.e);
            this.c.execute(this.f);
            this.c.execute(this.g);
        }
        else {
            ((SQLiteOpenHelper)this.l.b).getWritableDatabase().delete("suggestions", "1", (String[])null);
        }
        this.i.b();
        this.j.b();
        final agza builder = ((agzi)SetSettingEndpointOuterClass$SetSettingEndpoint.a).createBuilder();
        final String b = ((ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint)((agzd)aioe).rr((agyr)ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.clearSearchHistorySettingEndpoint)).b;
        builder.copyOnWrite();
        final SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint = (SetSettingEndpointOuterClass$SetSettingEndpoint)builder.instance;
        b.getClass();
        setSettingEndpointOuterClass$SetSettingEndpoint.b |= 0x1;
        setSettingEndpointOuterClass$SetSettingEndpoint.e = b;
        final SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint2 = (SetSettingEndpointOuterClass$SetSettingEndpoint)builder.build();
        final vtn a = this.k.a(this.h.c());
        final vtm b2 = a.b();
        ((vii)b2).j(vem.c(aioe));
        b2.w(setSettingEndpointOuterClass$SetSettingEndpoint2);
        tcp.l(a.e((vjn)b2), this.d, (tcn)new fcb(this, 0), (tco)new erz(this, 6), afua.a);
    }
}
