import java.util.Iterator;
import java.util.List;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aist implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final aisu c;
    
    static {
        a = new aiss();
    }
    
    public aist(final aisu c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return this.c();
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final aflv d = ((afgh)this.getEmojiCategoriesModels()).D();
        while (((Iterator)d).hasNext()) {
            final ajqd ajqd = (ajqd)((Iterator)d).next();
            final afhi afhi2 = new afhi();
            aqgs aqgs;
            if ((aqgs = ajqd.b.b) == null) {
                aqgs = aqgs.a;
            }
            afhi2.j(aqgm.b(aqgs).n(ajqd.a).a());
            CommandOuterClass$Command commandOuterClass$Command;
            if ((commandOuterClass$Command = ajqd.b.c) == null) {
                commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
            }
            final agpb b = aqhj.b(commandOuterClass$Command);
            final vgx a = ajqd.a;
            b.al();
            afhi2.j(aqhj.a());
            afhi.j(afhi2.g());
        }
        return afhi.g();
    }
    
    public final aisr c() {
        return new aisr(this.c.toBuilder());
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aist && this.c.equals(((aist)o).c);
    }
    
    public List getEmojiCategories() {
        return (List)this.c.i;
    }
    
    public List getEmojiCategoriesModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.c.i).iterator();
        while (iterator.hasNext()) {
            afgc.h(new ajqd((ajqe)((ahcz)iterator.next()).toBuilder().build(), this.b));
        }
        return afgc.g();
    }
    
    public Boolean getIsDismissFromSend() {
        return this.c.f;
    }
    
    public Boolean getIsEmojiPickerEnabled() {
        return this.c.g;
    }
    
    public Boolean getIsEmojiPickerToggled() {
        return this.c.h;
    }
    
    public Boolean getIsSending() {
        return this.c.e;
    }
    
    public Boolean getIsTimestampButtonEnabled() {
        return this.c.k;
    }
    
    public Boolean getIsTimestampButtonSupported() {
        return this.c.j;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aist.a;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("CommentComposerButtonStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
