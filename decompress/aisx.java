// 
// Decompiled by Procyon v0.6.0
// 

public final class aisx implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final aisy c;
    
    static {
        a = new aisw();
    }
    
    public aisx(final aisy c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new aisv(this.c.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        afhi.j(this.getZeroStepSuccessCommandModel().a());
        afhi.j(this.getZeroStepFailureCommandModel().a());
        afhi.j(this.getDiscardDialogReshowCommandModel().a());
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aisx && this.c.equals(((aisx)o).c);
    }
    
    public Boolean getChannelCreated() {
        return this.c.k;
    }
    
    public String getChannelCreationToken() {
        return this.c.h;
    }
    
    public String getCreateCommentParams() {
        final aisy c = this.c;
        if (c.c == 2) {
            return (String)c.d;
        }
        return "";
    }
    
    public aisc getDiscardDialogReshowCommand() {
        aisc aisc;
        if ((aisc = this.c.i) == null) {
            aisc = aisc.a;
        }
        return aisc;
    }
    
    public aisb getDiscardDialogReshowCommandModel() {
        aisc aisc;
        if ((aisc = this.c.i) == null) {
            aisc = aisc.a;
        }
        return aisb.b(aisc).F(this.b);
    }
    
    public Boolean getShouldReshowWithDraftText() {
        return this.c.j;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aisx.a;
    }
    
    public String getUpdateCommentParams() {
        final aisy c = this.c;
        if (c.c == 3) {
            return (String)c.d;
        }
        return "";
    }
    
    public aisc getZeroStepFailureCommand() {
        aisc aisc;
        if ((aisc = this.c.g) == null) {
            aisc = aisc.a;
        }
        return aisc;
    }
    
    public aisb getZeroStepFailureCommandModel() {
        aisc aisc;
        if ((aisc = this.c.g) == null) {
            aisc = aisc.a;
        }
        return aisb.b(aisc).F(this.b);
    }
    
    public aisc getZeroStepSuccessCommand() {
        aisc aisc;
        if ((aisc = this.c.f) == null) {
            aisc = aisc.a;
        }
        return aisc;
    }
    
    public aisb getZeroStepSuccessCommandModel() {
        aisc aisc;
        if ((aisc = this.c.f) == null) {
            aisc = aisc.a;
        }
        return aisb.b(aisc).F(this.b);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("CommentComposerControlsEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
