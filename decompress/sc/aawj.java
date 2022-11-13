import com.google.protos.youtube.api.innertube.EnterVrModeCommandOuterClass$EnterVrModeCommand;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawj implements vcv
{
    private final int a;
    private final Object b;
    
    public aawj(final aawr b, final int a) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aawj(final vyy b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        if (this.a != 0) {
            final AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand addItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand = (AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand)((ahbc)aiqj).rx((ahaq)AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.addItemToChatTeaserCommand);
            final String f = addItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.f;
            Optional optional;
            if (wbm.a.containsKey((Object)f)) {
                optional = Optional.of((Object)wbm.a.get((Object)f));
            }
            else {
                optional = Optional.empty();
            }
            if (optional.isPresent() && addItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.e <= (long)optional.get()) {
                return;
            }
            ((vyy)this.b).a(addItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand);
        }
        else {
            if (((ahbc)aiqj).ry((ahaq)EnterVrModeCommandOuterClass$EnterVrModeCommand.enterVrModeCommand)) {
                ((aawr)this.b).f();
                return;
            }
            throw new vdj("Expected a EnterVrModeCommand, but did not find one.");
        }
    }
}
