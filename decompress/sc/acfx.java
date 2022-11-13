import java.util.Iterator;
import java.util.List;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.FlowPrevStepCommandOuterClass$FlowPrevStepCommand;
import java.util.Map;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfx implements vcv
{
    public final Object a;
    private final int b;
    private final Object c;
    private final Object d;
    private final Object e;
    private final Object f;
    
    public acfx(final Activity a, final wal c, final vzd e, final xib f, final vai d, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.e = e;
        this.f = f;
        this.d = d;
    }
    
    public acfx(final vdr d, final zmf e, final asid f, final aekp c, final vcy a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
        this.c = c;
        this.a = a;
    }
    
    public final void mE(final aiqj aj, final Map map) {
        if (this.b == 0) {
            final FlowPrevStepCommandOuterClass$FlowPrevStepCommand flowPrevStepCommandOuterClass$FlowPrevStepCommand = (FlowPrevStepCommandOuterClass$FlowPrevStepCommand)((ahbc)aj).rx((ahaq)FlowPrevStepCommandOuterClass$FlowPrevStepCommand.flowPrevStepCommand);
            if ((flowPrevStepCommandOuterClass$FlowPrevStepCommand.b & 0x1) != 0x0) {
                final List k = ((aekp)this.c).K(flowPrevStepCommandOuterClass$FlowPrevStepCommand.c);
                if (k != null) {
                    for (final acfw acfw : k) {
                        final vdq a = ((vdr)this.d).a(((zmf)this.e).c());
                        ((vfp)a).f(acfw.f).E((asid)this.f).s((asjm)new kvy(this, flowPrevStepCommandOuterClass$FlowPrevStepCommand, acfw, (vfp)a, 3)).ab();
                    }
                }
            }
            return;
        }
        final boolean b = ((wal)this.c).l() instanceof wbk;
        final cl supportFragmentManager = ((bu)this.a).getSupportFragmentManager();
        if (((vai)this.d).l(45382597L).aM()) {
            final wck wck = new wck();
            wck.aj = aj;
            wck.r(supportFragmentManager, "live_chat_item_context_menu_elements_triggering_fragment");
            return;
        }
        if (!b && !((alqc)((xib)this.f).b).h) {
            final Object e = this.e;
            final wcj wcj = new wcj();
            final Bundle bundle = new Bundle();
            bundle.putByteArray("navigation_endpoint", ((agzk)aj).toByteArray());
            wcj.ag(bundle);
            wcj.ag = (vze)e;
            wcj.r(supportFragmentManager, "live_chat_item_context_menu_dialog");
            return;
        }
        final Object e2 = this.e;
        e2.getClass();
        final wch wch = new wch();
        final Bundle bundle2 = new Bundle();
        bundle2.putByteArray("navigation_endpoint", ((agzk)aj).toByteArray());
        wch.ag(bundle2);
        wch.aj = (vze)e2;
        wch.r(supportFragmentManager, "live_chat_item_context_menu_bottom_sheet_fragment");
    }
}
