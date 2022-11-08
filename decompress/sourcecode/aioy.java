import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aioy implements vdt
{
    public static final vdu a;
    public final aioz b;
    private final vdo c;
    
    static {
        a = new aiox();
    }
    
    public aioy(final aioz b, final vdo c) {
        this.b = b;
        this.c = c;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        final afif d = ((afcr)this.getMentionRunsModels()).D();
        while (((Iterator)d).hasNext()) {
            final aqlg aqlg = (aqlg)((Iterator)d).next();
            afds.j((Iterable)new afds().g());
        }
        final afif d2 = ((afcr)this.getEmojiRunsModels()).D();
        while (((Iterator)d2).hasNext()) {
            afds.j((Iterable)((ajmk)((Iterator)d2).next()).a());
        }
        afds.j((Iterable)this.getDismissDialogCommandModel().a());
        return afds.g();
    }
    
    public final aiow c() {
        return new aiow(((agzi)this.b).toBuilder());
    }
    
    public final byte[] d() {
        return ((agxl)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aioy && ((agzi)this.b).equals(((aioy)o).b);
    }
    
    public String getCommentDraft() {
        return this.b.h;
    }
    
    public String getCommentText() {
        return this.b.d;
    }
    
    public aioe getDismissDialogCommand() {
        aioe aioe;
        if ((aioe = this.b.l) == null) {
            aioe = aioe.a;
        }
        return aioe;
    }
    
    public aiod getDismissDialogCommandModel() {
        aioe aioe;
        if ((aioe = this.b.l) == null) {
            aioe = aioe.a;
        }
        return aiod.b(aioe).y(this.c);
    }
    
    public List getEmojiRuns() {
        return (List)this.b.g;
    }
    
    public List getEmojiRunsModels() {
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)this.b.g).iterator();
        while (iterator.hasNext()) {
            afcm.h(ajmk.b(iterator.next()).F(this.c));
        }
        return (List)afcm.g();
    }
    
    public String getFirstLineText() {
        return this.b.q;
    }
    
    public Boolean getIsFocused() {
        return this.b.k;
    }
    
    public Boolean getIsInitialized() {
        return this.b.i;
    }
    
    public Float getLineHeight() {
        return this.b.n;
    }
    
    public List getMentionRuns() {
        return (List)this.b.f;
    }
    
    public List getMentionRunsModels() {
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)this.b.f).iterator();
        while (iterator.hasNext()) {
            afcm.h(new aqlg((aqlh)((agzi)iterator.next()).toBuilder().build()));
        }
        return (List)afcm.g();
    }
    
    public Float getNumLines() {
        return this.b.m;
    }
    
    public Boolean getNumLinesChanged() {
        return this.b.o;
    }
    
    public Boolean getShouldDisplayStoredText() {
        return this.b.j;
    }
    
    public String getShownText() {
        return this.b.e;
    }
    
    public Float getTextWidth() {
        return this.b.p;
    }
    
    public vdu getType() {
        return aioy.a;
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
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
