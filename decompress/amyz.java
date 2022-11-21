import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amyz implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final amzb c;
    
    static {
        a = new amyy();
    }
    
    public amyz(final amzb c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new amyx(((ahcz)this.c).toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        this.getCommandModel();
        afhi.j(aqhj.a());
        final amyw commandWrapperModel = this.getCommandWrapperModel();
        final afhi afhi2 = new afhi();
        CommandOuterClass$Command commandOuterClass$Command;
        if ((commandOuterClass$Command = commandWrapperModel.b.b) == null) {
            commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
        }
        aqhj.b(commandOuterClass$Command).al();
        afhi2.j(aqhj.a());
        alxw alxw;
        if ((alxw = commandWrapperModel.b.c) == null) {
            alxw = alxw.b;
        }
        afhi2.j(alxu.b(alxw).w(commandWrapperModel.a).a());
        afhi.j(afhi2.g());
        afhi.j(this.getLoggingDirectivesModel().a());
        return afhi.g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amyz && ((ahcz)this.c).equals(((amyz)o).c);
    }
    
    public amzc getAddToOfflineButtonState() {
        amzc amzc;
        if ((amzc = amzc.b(this.c.f)) == null) {
            amzc = amzc.a;
        }
        return amzc;
    }
    
    public CommandOuterClass$Command getCommand() {
        final amzb c = this.c;
        CommandOuterClass$Command defaultInstance;
        if (c.c == 5) {
            defaultInstance = (CommandOuterClass$Command)c.d;
        }
        else {
            defaultInstance = CommandOuterClass$Command.getDefaultInstance();
        }
        return defaultInstance;
    }
    
    public aqhj getCommandModel() {
        final amzb c = this.c;
        CommandOuterClass$Command defaultInstance;
        if (c.c == 5) {
            defaultInstance = (CommandOuterClass$Command)c.d;
        }
        else {
            defaultInstance = CommandOuterClass$Command.getDefaultInstance();
        }
        return aqhj.b(defaultInstance).al();
    }
    
    public amza getCommandWrapper() {
        final amzb c = this.c;
        amza a;
        if (c.c == 7) {
            a = (amza)c.d;
        }
        else {
            a = amza.a;
        }
        return a;
    }
    
    public amyw getCommandWrapperModel() {
        final amzb c = this.c;
        amza a;
        if (c.c == 7) {
            a = (amza)c.d;
        }
        else {
            a = amza.a;
        }
        return new amyw((amza)((ahcz)a).toBuilder().build(), this.b);
    }
    
    public Boolean getContentCheckOk() {
        return this.c.g;
    }
    
    public alxw getLoggingDirectives() {
        alxw alxw;
        if ((alxw = this.c.i) == null) {
            alxw = alxw.b;
        }
        return alxw;
    }
    
    public alxu getLoggingDirectivesModel() {
        alxw alxw;
        if ((alxw = this.c.i) == null) {
            alxw = alxw.b;
        }
        return alxu.b(alxw).w(this.b);
    }
    
    public ahbt getOfflineabilityRenderer() {
        final amzb c = this.c;
        ahbt b;
        if (c.c == 3) {
            b = (ahbt)c.d;
        }
        else {
            b = ahbt.b;
        }
        return b;
    }
    
    public Boolean getRacyCheckOk() {
        return this.c.h;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amyz.a;
    }
    
    public String getYpcGetOfflineUpsellEndpointParams() {
        final amzb c = this.c;
        if (c.c == 4) {
            return (String)c.d;
        }
        return "";
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.c).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("OfflineabilityEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
