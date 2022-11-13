import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigz implements vfu
{
    public static final vfv a;
    private final aiha b;
    
    static {
        a = new aigy();
    }
    
    public aigz(final aiha b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new aigx(this.b.toBuilder());
    }
    
    public final afft b() {
        final affr affr = new affr();
        this.getOnEditCommandModel();
        affr.j((Iterable)aqep.a());
        return affr.g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aigz && this.b.equals((Object)((aigz)o).b);
    }
    
    public Boolean getIsEditable() {
        return this.b.e;
    }
    
    public Boolean getIsFocusedScubaOverride() {
        return this.b.g;
    }
    
    public aihb getMode() {
        aihb aihb;
        if ((aihb = aihb.b(this.b.h)) == null) {
            aihb = aihb.b;
        }
        return aihb;
    }
    
    public CommandOuterClass$Command getOnEditCommand() {
        CommandOuterClass$Command commandOuterClass$Command;
        if ((commandOuterClass$Command = this.b.f) == null) {
            commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
        }
        return commandOuterClass$Command;
    }
    
    public aqep getOnEditCommandModel() {
        CommandOuterClass$Command commandOuterClass$Command;
        if ((commandOuterClass$Command = this.b.f) == null) {
            commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
        }
        return aqep.b(commandOuterClass$Command).B();
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aigz.a;
    }
    
    public String getValue() {
        return this.b.d;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
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
