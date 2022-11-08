import java.util.List;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import java.util.Observable;
import java.util.Observer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abgw implements Observer
{
    final /* synthetic */ Object a = a;
    final /* synthetic */ Object b = b;
    private final /* synthetic */ int c;
    
    public abgw(final abgx b, final aptj a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void update(final Observable observable, Object o) {
        if (this.c != 0) {
            o = this.b;
            final Object a = this.a;
            o = ((tyh)o).a;
            ((hzx)o).d(((xfq)a).h());
            return;
        }
        ((abgx)this.b).d.deleteObserver((Observer)this);
        final aptj aptj = (aptj)this.a;
        if ((aptj.b & 0x10000) != 0x0) {
            aioe aioe;
            if ((aioe = aptj.p) == null) {
                aioe = aioe.a;
            }
            if (((agzd)aioe).rs((agyr)CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)) {
                aioe aioe2;
                if ((aioe2 = ((aptj)this.a).p) == null) {
                    aioe2 = aioe.a;
                }
                ((abgx)this.b).e.b((List)((CommandExecutorCommandOuterClass$CommandExecutorCommand)((agzd)aioe2).rr((agyr)CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b);
            }
        }
        ((abgx)this.b).g();
        ((abgx)this.b).a();
        ((abgx)this.b).b(apth.h, (aptj)this.a);
    }
}
