// 
// Decompiled by Procyon v0.6.0
// 

public final class aopz implements vhc
{
    public static final vhd a;
    public final aoqa b;
    private final vgx c;
    
    static {
        a = new aopy();
    }
    
    public aopz(final aoqa b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vgs a() {
        return new aopx(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        afhi.j(this.getEmojiModel().a());
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aopz && this.b.equals(((aopz)o).b);
    }
    
    public aoqb getAction() {
        aoqb aoqb;
        if ((aoqb = aoqb.b(this.b.g)) == null) {
            aoqb = aoqb.a;
        }
        return aoqb;
    }
    
    public ajqh getEmoji() {
        final aoqa b = this.b;
        ajqh a;
        if (b.d == 3) {
            a = (ajqh)b.e;
        }
        else {
            a = ajqh.a;
        }
        return a;
    }
    
    public ajqf getEmojiModel() {
        final aoqa b = this.b;
        ajqh a;
        if (b.d == 3) {
            a = (ajqh)b.e;
        }
        else {
            a = ajqh.a;
        }
        return ajqf.b(a).B(this.c);
    }
    
    public Boolean getShouldAppendWhitespace() {
        return this.b.h;
    }
    
    public Boolean getShouldConditionallyPrependWhitespace() {
        return this.b.i;
    }
    
    public String getText() {
        final aoqa b = this.b;
        if (b.d == 2) {
            return (String)b.e;
        }
        return "";
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aopz.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("SuggestEditableTextItemEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
