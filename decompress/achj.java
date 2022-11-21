import java.util.Iterator;
import java.util.List;
import com.google.protos.youtube.api.innertube.FlowPrevStepCommandOuterClass$FlowPrevStepCommand;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achj implements vbk
{
    public final veh a;
    private final vey b;
    private final zoa c;
    private final askz d;
    private final aheu e;
    
    public achj(final vey b, final zoa c, final askz d, final aheu e, final veh a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    public final void sb(final aisc aisc, final Map map) {
        final FlowPrevStepCommandOuterClass$FlowPrevStepCommand flowPrevStepCommandOuterClass$FlowPrevStepCommand = (FlowPrevStepCommandOuterClass$FlowPrevStepCommand)((ahcu)aisc).rx((ahci)FlowPrevStepCommandOuterClass$FlowPrevStepCommand.flowPrevStepCommand);
        if ((flowPrevStepCommandOuterClass$FlowPrevStepCommand.b & 0x1) != 0x0) {
            final List s = this.e.S(flowPrevStepCommandOuterClass$FlowPrevStepCommand.c);
            if (s == null) {
                return;
            }
            for (final achi achi : s) {
                final vex a = this.b.a(this.c.c());
                ((vgx)a).g(achi.f).E(this.d).s((asmi)new kwh(this, flowPrevStepCommandOuterClass$FlowPrevStepCommand, achi, (vgx)a, 3)).ab();
            }
        }
    }
}
