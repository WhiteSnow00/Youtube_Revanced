import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiis implements vhc
{
    public static final vhd a;
    private final aiit b;
    
    static {
        a = new aiir();
    }
    
    public aiis(final aiit b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new aiiq(((ahcz)this.b).toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        this.getOnEditCommandModel();
        afhi.j(aqhj.a());
        return afhi.g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiis && ((ahcz)this.b).equals(((aiis)o).b);
    }
    
    public Boolean getIsEditable() {
        return this.b.e;
    }
    
    public Boolean getIsFocusedScubaOverride() {
        return this.b.g;
    }
    
    public aiiu getMode() {
        aiiu aiiu;
        if ((aiiu = aiiu.b(this.b.h)) == null) {
            aiiu = aiiu.b;
        }
        return aiiu;
    }
    
    public CommandOuterClass$Command getOnEditCommand() {
        CommandOuterClass$Command commandOuterClass$Command;
        if ((commandOuterClass$Command = this.b.f) == null) {
            commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
        }
        return commandOuterClass$Command;
    }
    
    public aqhj getOnEditCommandModel() {
        CommandOuterClass$Command commandOuterClass$Command;
        if ((commandOuterClass$Command = this.b.f) == null) {
            commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
        }
        return aqhj.b(commandOuterClass$Command).al();
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aiis.a;
    }
    
    public String getValue() {
        return this.b.d;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ChannelEditableTextFieldEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
