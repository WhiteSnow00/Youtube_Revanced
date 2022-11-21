import java.util.List;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import java.util.Observable;
import java.util.Observer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abjw implements Observer
{
    final Object a;
    final Object b;
    private final int c;
    
    public abjw(final abjx b, final apyh a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abjw(final ubo b, final xiz a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void update(final Observable observable, Object o) {
        if (this.c != 0) {
            o = this.b;
            final Object a = this.a;
            o = ((ubo)o).a;
            ((ibd)o).d(((xiz)a).h());
            return;
        }
        ((abjx)this.b).d.deleteObserver((Observer)this);
        final apyh apyh = (apyh)this.a;
        if ((apyh.b & 0x10000) != 0x0) {
            aisc aisc;
            if ((aisc = apyh.p) == null) {
                aisc = aisc.a;
            }
            if (((ahcu)aisc).ry((ahci)CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)) {
                aisc aisc2;
                if ((aisc2 = ((apyh)this.a).p) == null) {
                    aisc2 = aisc.a;
                }
                ((abjx)this.b).e.b((List)((CommandExecutorCommandOuterClass$CommandExecutorCommand)((ahcu)aisc2).rx((ahci)CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b);
            }
        }
        ((abjx)this.b).g();
        ((abjx)this.b).a();
        o = this.b;
        ((abjx)o).b(apyf.h, (apyh)this.a);
    }
}
