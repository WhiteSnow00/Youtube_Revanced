// 
// Decompiled by Procyon v0.6.0
// 

public final class kve implements uve
{
    private final atjj a;
    private final arhr b;
    private final vlq c;
    private final vrr d;
    private final atjj e;
    private final atjj f;
    private final aexq g;
    private final atjj h;
    private final aaec i;
    
    public kve(final atjj a, final aaec i, final arhr b, final vlq c, final vrr d, final atjj e, final atjj f, final aexq g, final atjj h, final uyi uyi, final byte[] array) {
        this.a = a;
        this.i = i;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        if (!uyi.f(45382963L)) {
            b.a();
        }
    }
    
    public final utd a(final ajnl ajnl, final alff alff, final boolean b) {
        Object o = null;
        Label_0360: {
            if (iba.V(ajnl) != null) {
                o = this.a.a();
            }
            else {
                ajnj ajnj;
                if ((ajnj = ajnl.g) == null) {
                    ajnj = ajnj.a;
                }
                if (ajnj.b == 49399797) {
                    ajnj ajnj2;
                    if ((ajnj2 = ajnl.g) == null) {
                        ajnj2 = ajnj.a;
                    }
                    anws a;
                    if (ajnj2.b == 49399797) {
                        a = (anws)ajnj2.c;
                    }
                    else {
                        a = anws.a;
                    }
                    if (a.d.size() > 0 && (((anwv)a.d.get(0)).e & 0x400) != 0x0) {
                        o = this.e.a();
                        break Label_0360;
                    }
                }
                if ((ajnl.c & 0x800000) != 0x0) {
                    o = this.h.a();
                }
                else {
                    final ajnj g = ajnl.g;
                    ajnj a2;
                    if (g == null) {
                        a2 = ajnj.a;
                    }
                    else {
                        a2 = g;
                    }
                    if (a2.b == 154115041) {
                        o = this.f.a();
                    }
                    else {
                        ajnj a3;
                        if ((a3 = g) == null) {
                            a3 = ajnj.a;
                        }
                        if (a3.b == 449330433) {
                            o = this.i.b((vke)this.d);
                        }
                        else {
                            int m;
                            if ((m = ajox.m(ajnl.m)) == 0) {
                                m = 1;
                            }
                            if (m - 1 != 2) {
                                final aaec i = this.i;
                                Object d;
                                if (b) {
                                    d = this.d;
                                }
                                else {
                                    d = this.b.a();
                                }
                                o = i.b((vke)d);
                            }
                            else {
                                o = this.i.b((vke)this.c);
                            }
                        }
                    }
                }
            }
        }
        if (this.g.h()) {
            ((utd)o).e((acik)this.g.c());
        }
        ((utd)o).g(ajnl, alff);
        return (utd)o;
    }
}
