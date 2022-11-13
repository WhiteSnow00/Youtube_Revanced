import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htc implements aezf
{
    private final int a;
    
    public htc(final int a) {
        this.a = a;
    }
    
    public static final ajlp a(final ahfu ahfu) {
        final ahaz builder = ((ahbh)ajlp.a).createBuilder();
        if ((ahfu.b & 0x1) != 0x0) {
            final int c = ahfu.c;
            builder.copyOnWrite();
            final ajlp ajlp = (ajlp)builder.instance;
            ajlp.b |= 0x1;
            ajlp.c = c;
        }
        if ((ahfu.b & 0x2) != 0x0) {
            final int d = ahfu.d;
            builder.copyOnWrite();
            final ajlp ajlp2 = (ajlp)builder.instance;
            ajlp2.b |= 0x2;
            ajlp2.d = d;
        }
        final ahbo e = ahfu.e;
        builder.copyOnWrite();
        final ajlp ajlp3 = (ajlp)builder.instance;
        final ahbo e2 = ajlp3.e;
        if (!e2.c()) {
            ajlp3.e = ahbh.mutableCopy(e2);
        }
        agzk.addAll((Iterable)e, (List)ajlp3.e);
        if ((ahfu.b & 0x4) != 0x0) {
            final int al = adyf.al(ahfu.f);
            if (al != 0) {
                if (al == 2) {
                    builder.copyOnWrite();
                    final ajlp ajlp4 = (ajlp)builder.instance;
                    ajlp4.f = 1;
                    ajlp4.b |= 0x4;
                    return (ajlp)builder.build();
                }
            }
            builder.copyOnWrite();
            final ajlp ajlp5 = (ajlp)builder.instance;
            ajlp5.f = 0;
            ajlp5.b |= 0x4;
        }
        return (ajlp)builder.build();
    }
    
    public final Object apply(final Object o) {
        switch (this.a) {
            default: {
                final zsf zsf = (zsf)o;
                final zsf a = zsf.a;
                final int ordinal = zsf.ordinal();
                zsi zsi;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(zsf))));
                            }
                            zsi = zsi.f;
                        }
                        else {
                            zsi = zsi.c;
                        }
                    }
                    else {
                        zsi = zsi.b;
                    }
                }
                else {
                    zsi = zsi.a;
                }
                return zsi;
            }
            case 8: {
                final aqyq aqyq = (aqyq)o;
                final aqyq a2 = aqyq.a;
                apov apov = null;
                switch (aqyq.ordinal()) {
                    default: {
                        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aqyq))));
                    }
                    case 6: {
                        apov = apov.g;
                        break;
                    }
                    case 5: {
                        apov = apov.f;
                        break;
                    }
                    case 4: {
                        apov = apov.e;
                        break;
                    }
                    case 3: {
                        apov = apov.d;
                        break;
                    }
                    case 2: {
                        apov = apov.c;
                        break;
                    }
                    case 1: {
                        apov = apov.b;
                        break;
                    }
                    case 0: {
                        apov = apov.a;
                        break;
                    }
                }
                return apov;
            }
            case 7: {
                final aqye aqye = (aqye)o;
                final aqye a3 = aqye.a;
                final int ordinal2 = aqye.ordinal();
                apou apou;
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aqye))));
                                }
                                apou = apou.c;
                            }
                            else {
                                apou = apou.a;
                            }
                        }
                        else {
                            apou = apou.b;
                        }
                    }
                    else {
                        apou = apou.a;
                    }
                }
                else {
                    apou = apou.a;
                }
                return apou;
            }
            case 6: {
                final aqxt aqxt = (aqxt)o;
                final aqxt a4 = aqxt.a;
                final int ordinal3 = aqxt.ordinal();
                apot apot;
                if (ordinal3 != 0) {
                    if (ordinal3 != 1) {
                        if (ordinal3 != 2) {
                            if (ordinal3 != 3) {
                                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aqxt))));
                            }
                            apot = apot.d;
                        }
                        else {
                            apot = apot.c;
                        }
                    }
                    else {
                        apot = apot.b;
                    }
                }
                else {
                    apot = apot.a;
                }
                return apot;
            }
            case 5: {
                final aqzc aqzc = (aqzc)o;
                final ahaz builder = ((ahbh)ajln.a).createBuilder();
                if ((aqzc.b & 0x1) != 0x0) {
                    final String c = aqzc.c;
                    builder.copyOnWrite();
                    final ajln ajln = (ajln)builder.instance;
                    c.getClass();
                    ajln.b |= 0x1;
                    ajln.c = c;
                }
                return builder.build();
            }
            case 4: {
                final String c2 = (String)o;
                final ahaz builder2 = ((ahbh)ajlr.a).createBuilder();
                builder2.copyOnWrite();
                final ajlr ajlr = (ajlr)builder2.instance;
                c2.getClass();
                ajlr.b |= 0x1;
                ajlr.c = c2;
                return builder2.build();
            }
            case 3: {
                return a((ahfu)o);
            }
            case 2: {
                final aqza aqza = (aqza)o;
                final ahaz builder3 = ((ahbh)ajlm.a).createBuilder();
                if ((aqza.b & 0x1) != 0x0) {
                    final String c3 = aqza.c;
                    builder3.copyOnWrite();
                    final ajlm ajlm = (ajlm)builder3.instance;
                    c3.getClass();
                    ajlm.b |= 0x1;
                    ajlm.c = c3;
                }
                return builder3.build();
            }
            case 1: {
                return ((cyb)o).a;
            }
            case 0: {
                final htd htd = (htd)o;
                final ahaz builder4 = arag.a.createBuilder();
                final String a5 = htd.a;
                builder4.copyOnWrite();
                final arag arag = (arag)builder4.instance;
                a5.getClass();
                arag.b |= 0x1;
                arag.c = a5;
                final String b = htd.b;
                builder4.copyOnWrite();
                final arag arag2 = (arag)builder4.instance;
                b.getClass();
                arag2.b |= 0x2;
                arag2.d = b;
                final int spanStart = htd.d.b.getText().getSpanStart((Object)htd.c);
                builder4.copyOnWrite();
                final arag arag3 = (arag)builder4.instance;
                arag3.b |= 0x4;
                arag3.e = spanStart;
                final int spanEnd = htd.d.b.getText().getSpanEnd((Object)htd.c);
                builder4.copyOnWrite();
                final arag arag4 = (arag)builder4.instance;
                arag4.b |= 0x8;
                arag4.f = spanEnd;
                return builder4.build();
            }
        }
    }
}
