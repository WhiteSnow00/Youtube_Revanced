import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imi extends ilp
{
    private final Context a;
    private final fmr b;
    
    public imi(final atke atke, final fmr b, final Context a) {
        super(atke, (Class)alki.class);
        this.b = b;
        this.a = a;
    }
    
    private static final aoiw g(final String e, final boolean g, final ajhp ajhp, final int n) {
        final ahaz builder = ((ahbh)aoiy.a).createBuilder();
        final anul i = jgk.I(ajhj.b, ajhp, n);
        builder.copyOnWrite();
        final aoiy aoiy = (aoiy)builder.instance;
        i.getClass();
        aoiy.c = i;
        aoiy.b |= 0x1;
        final aoiy d = (aoiy)builder.build();
        final ahaz builder2 = ((ahbh)aoiw.a).createBuilder();
        builder2.copyOnWrite();
        final aoiw aoiw = (aoiw)builder2.instance;
        e.getClass();
        aoiw.b |= 0x1;
        aoiw.e = e;
        builder2.copyOnWrite();
        final aoiw aoiw2 = (aoiw)builder2.instance;
        aoiw2.b |= 0x4;
        aoiw2.g = g;
        builder2.copyOnWrite();
        final aoiw aoiw3 = (aoiw)builder2.instance;
        d.getClass();
        aoiw3.d = d;
        aoiw3.c = 3;
        return (aoiw)builder2.build();
    }
    
    protected final /* bridge */ Object a(final aaeh aaeh, final afev afev) {
        final boolean booleanValue = (boolean)e(afev, "downloads_page_should_hide_filter_menu");
        alki a;
        if (!this.b.k() && !this.b.l()) {
            a = alki.a;
        }
        else {
            final ajhp b = ajhp.b((int)e(afev, "downloads_page_filter_type"));
            final int intValue = (int)e(afev, "downloads_page_downloads_section_items_to_show");
            final ahaz builder = ((ahbh)alki.a).createBuilder();
            final ahaz builder2 = ((ahbh)alkf.a).createBuilder();
            if (!booleanValue) {
                final Context a2 = this.a;
                final ahaz builder3 = ((ahbh)aoix.a).createBuilder();
                builder3.bK(g(a2.getString(2132017949), ajhp.b == b, ajhp.b, intValue));
                final String string = a2.getString(2132017950);
                final ajhp c = ajhp.c;
                builder3.bK(g(string, c == b, c, intValue));
                final String string2 = a2.getString(2132017951);
                final ajhp d = ajhp.d;
                builder3.bK(g(string2, d == b, d, intValue));
                final aoix c2 = (aoix)builder3.build();
                if (c2 != null) {
                    builder2.copyOnWrite();
                    final alkf alkf = (alkf)builder2.instance;
                    alkf.c = c2;
                    alkf.b |= 0x1;
                }
            }
            builder.copyOnWrite();
            final alki alki = (alki)builder.instance;
            final alkf d2 = (alkf)builder2.build();
            d2.getClass();
            alki.d = d2;
            alki.b |= 0x2;
            if (this.b.g()) {
                final ajut g = acak.g(new String[] { this.a.getString(2132017919) });
                builder.copyOnWrite();
                final alki alki2 = (alki)builder.instance;
                g.getClass();
                alki2.c = g;
                alki2.b |= 0x1;
            }
            a = (alki)builder.build();
        }
        return a;
    }
    
    protected final Object f() {
        return alki.a;
    }
}
