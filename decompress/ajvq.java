import java.util.List;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvq implements vhc
{
    public static final vhd a;
    public final ajvt b;
    private final vgx c;
    
    static {
        a = new ajvp();
    }
    
    public ajvq(final ajvt b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vgs a() {
        return new ajvo((ahct)((ahcz)this.b).toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final ajvn dynamicCommandsModel = this.getDynamicCommandsModel();
        final afhi afhi2 = new afhi();
        aisc aisc;
        if ((aisc = dynamicCommandsModel.b.c) == null) {
            aisc = aisc.a;
        }
        afhi2.j(aisb.b(aisc).F(dynamicCommandsModel.a).a());
        aisc aisc2;
        if ((aisc2 = dynamicCommandsModel.b.d) == null) {
            aisc2 = aisc.a;
        }
        afhi2.j(aisb.b(aisc2).F(dynamicCommandsModel.a).a());
        afhi.j(afhi2.g());
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
        return o instanceof ajvq && ((ahcz)this.b).equals(((ajvq)o).b);
    }
    
    public String getCurrentStepId() {
        return this.b.d;
    }
    
    public ajvr getDynamicCommands() {
        ajvr ajvr;
        if ((ajvr = this.b.g) == null) {
            ajvr = ajvr.a;
        }
        return ajvr;
    }
    
    public ajvn getDynamicCommandsModel() {
        ajvr ajvr;
        if ((ajvr = this.b.g) == null) {
            ajvr = ajvr.a;
        }
        return new ajvn((ajvr)((ahcz)ajvr).toBuilder().build(), this.c);
    }
    
    public Map getNextStepIdOverrideMap() {
        return Collections.unmodifiableMap((Map<?, ?>)this.b.f);
    }
    
    public List getStepIdStack() {
        return (List)this.b.e;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajvq.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("FlowStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
