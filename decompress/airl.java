// 
// Decompiled by Procyon v0.6.0
// 

public final class airl implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final airm c;
    
    static {
        a = new airk();
    }
    
    public airl(final airm c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new airj(this.c.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        this.getIconModel();
        afhi.j(akfh.a());
        afhi.j(this.getTitleModel().a());
        afhi.j(this.getBodyModel().a());
        afhi.j(this.getConfirmTextModel().a());
        afhi.j(this.getCancelTextModel().a());
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof airl && this.c.equals(((airl)o).c);
    }
    
    public ajws getBody() {
        ajws ajws;
        if ((ajws = this.c.f) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public ajwp getBodyModel() {
        ajws ajws;
        if ((ajws = this.c.f) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.b);
    }
    
    public ajws getCancelText() {
        ajws ajws;
        if ((ajws = this.c.h) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public ajwp getCancelTextModel() {
        ajws ajws;
        if ((ajws = this.c.h) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.b);
    }
    
    public ajws getConfirmText() {
        ajws ajws;
        if ((ajws = this.c.g) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public ajwp getConfirmTextModel() {
        ajws ajws;
        if ((ajws = this.c.g) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.b);
    }
    
    public akfj getIcon() {
        akfj akfj;
        if ((akfj = this.c.d) == null) {
            akfj = akfj.a;
        }
        return akfj;
    }
    
    public akfh getIconModel() {
        akfj akfj;
        if ((akfj = this.c.d) == null) {
            akfj = akfj.a;
        }
        return akfh.b(akfj).y();
    }
    
    public ajws getTitle() {
        ajws ajws;
        if ((ajws = this.c.e) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public ajwp getTitleModel() {
        ajws ajws;
        if ((ajws = this.c.e) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.b);
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return airl.a;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("CoWatchDialogDataEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
