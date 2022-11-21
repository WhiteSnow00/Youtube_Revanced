import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitb implements vhc
{
    public static final vhd a;
    public final aitc b;
    private final vgx c;
    
    static {
        a = new aita();
    }
    
    public aitb(final aitc b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vgs a() {
        return this.c();
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final aflv d = ((afgh)this.getMentionRunsModels()).D();
        while (((Iterator)d).hasNext()) {
            final aqql aqql = (aqql)((Iterator)d).next();
            afhi.j(new afhi().g());
        }
        final aflv d2 = ((afgh)this.getEmojiRunsModels()).D();
        while (((Iterator)d2).hasNext()) {
            afhi.j(((ajqo)((Iterator)d2).next()).a());
        }
        afhi.j(this.getDismissDialogCommandModel().a());
        afhi.j(this.getStartingTextModel().a());
        return afhi.g();
    }
    
    public final aisz c() {
        return new aisz(this.b.toBuilder());
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aitb && this.b.equals(((aitb)o).b);
    }
    
    public String getCommentDraft() {
        return this.b.h;
    }
    
    public String getCommentText() {
        return this.b.d;
    }
    
    public aisc getDismissDialogCommand() {
        aisc aisc;
        if ((aisc = this.b.k) == null) {
            aisc = aisc.a;
        }
        return aisc;
    }
    
    public aisb getDismissDialogCommandModel() {
        aisc aisc;
        if ((aisc = this.b.k) == null) {
            aisc = aisc.a;
        }
        return aisb.b(aisc).F(this.c);
    }
    
    public List getEmojiRuns() {
        return (List)this.b.g;
    }
    
    public List getEmojiRunsModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.b.g).iterator();
        while (iterator.hasNext()) {
            afgc.h(ajqo.b(iterator.next()).A(this.c));
        }
        return afgc.g();
    }
    
    public String getFirstLineText() {
        return this.b.p;
    }
    
    public Boolean getIsInitialized() {
        return this.b.i;
    }
    
    public Float getLineHeight() {
        return this.b.m;
    }
    
    public List getMentionRuns() {
        return (List)this.b.f;
    }
    
    public List getMentionRunsModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.b.f).iterator();
        while (iterator.hasNext()) {
            afgc.h(new aqql((aqqm)iterator.next().toBuilder().build()));
        }
        return afgc.g();
    }
    
    public Float getNumLines() {
        return this.b.l;
    }
    
    public Boolean getNumLinesChanged() {
        return this.b.n;
    }
    
    public Boolean getShouldDisplayStoredText() {
        return this.b.j;
    }
    
    public String getShownText() {
        return this.b.e;
    }
    
    public Boolean getSmartReplyServed() {
        return this.b.q;
    }
    
    public ajws getStartingText() {
        ajws ajws;
        if ((ajws = this.b.r) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public ajwp getStartingTextModel() {
        ajws ajws;
        if ((ajws = this.b.r) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.c);
    }
    
    public Float getTextWidth() {
        return this.b.o;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aitb.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("CommentComposerTextStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
