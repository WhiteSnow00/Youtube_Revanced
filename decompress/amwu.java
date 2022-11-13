import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwu implements vfu
{
    public static final vfv a;
    private final vfp b;
    private final amww c;
    
    static {
        a = new amwt();
    }
    
    public amwu(final amww c, final vfp b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new amws(((ahbh)this.c).toBuilder());
    }
    
    public final afft b() {
        final affr affr = new affr();
        this.getCommandModel();
        affr.j((Iterable)aqep.a());
        final amwr commandWrapperModel = this.getCommandWrapperModel();
        final affr affr2 = new affr();
        CommandOuterClass$Command commandOuterClass$Command;
        if ((commandOuterClass$Command = commandWrapperModel.b.b) == null) {
            commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
        }
        aqep.b(commandOuterClass$Command).B();
        affr2.j((Iterable)aqep.a());
        alvw alvw;
        if ((alvw = commandWrapperModel.b.c) == null) {
            alvw = alvw.b;
        }
        affr2.j((Iterable)alvu.b(alvw).L(commandWrapperModel.a).a());
        affr.j((Iterable)affr2.g());
        affr.j((Iterable)this.getLoggingDirectivesModel().a());
        return affr.g();
    }
    
    public final byte[] d() {
        return ((agzk)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amwu && ((ahbh)this.c).equals((Object)((amwu)o).c);
    }
    
    public amwx getAddToOfflineButtonState() {
        amwx amwx;
        if ((amwx = amwx.b(this.c.f)) == null) {
            amwx = amwx.a;
        }
        return amwx;
    }
    
    public CommandOuterClass$Command getCommand() {
        final amww c = this.c;
        CommandOuterClass$Command defaultInstance;
        if (c.c == 5) {
            defaultInstance = (CommandOuterClass$Command)c.d;
        }
        else {
            defaultInstance = CommandOuterClass$Command.getDefaultInstance();
        }
        return defaultInstance;
    }
    
    public aqep getCommandModel() {
        final amww c = this.c;
        CommandOuterClass$Command defaultInstance;
        if (c.c == 5) {
            defaultInstance = (CommandOuterClass$Command)c.d;
        }
        else {
            defaultInstance = CommandOuterClass$Command.getDefaultInstance();
        }
        return aqep.b(defaultInstance).B();
    }
    
    public amwv getCommandWrapper() {
        final amww c = this.c;
        amwv a;
        if (c.c == 7) {
            a = (amwv)c.d;
        }
        else {
            a = amwv.a;
        }
        return a;
    }
    
    public amwr getCommandWrapperModel() {
        final amww c = this.c;
        amwv a;
        if (c.c == 7) {
            a = (amwv)c.d;
        }
        else {
            a = amwv.a;
        }
        return new amwr((amwv)((ahbh)a).toBuilder().build(), this.b);
    }
    
    public Boolean getContentCheckOk() {
        return this.c.g;
    }
    
    public alvw getLoggingDirectives() {
        alvw alvw;
        if ((alvw = this.c.i) == null) {
            alvw = alvw.b;
        }
        return alvw;
    }
    
    public alvu getLoggingDirectivesModel() {
        alvw alvw;
        if ((alvw = this.c.i) == null) {
            alvw = alvw.b;
        }
        return alvu.b(alvw).L(this.b);
    }
    
    public ahab getOfflineabilityRenderer() {
        final amww c = this.c;
        ahab b;
        if (c.c == 3) {
            b = (ahab)c.d;
        }
        else {
            b = ahab.b;
        }
        return b;
    }
    
    public Boolean getRacyCheckOk() {
        return this.c.h;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return amwu.a;
    }
    
    public String getYpcGetOfflineUpsellEndpointParams() {
        final amww c = this.c;
        if (c.c == 4) {
            return (String)c.d;
        }
        return "";
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.c).hashCode() ^ 0xF6181;
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
