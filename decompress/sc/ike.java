import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ike
{
    public static final afev a;
    
    static {
        a = afev.o("downloads_page_downloads_item_section_identifier", xaa.c(51721), "downloads_page_recommendations_item_section_identifier", xaa.c(51722), "downloads_page_smart_downloads_item_section_identifier", xaa.c(139572));
    }
    
    public static void a(final ackm ackm, final MessageLite messageLite) {
        if (messageLite == null) {
            return;
        }
        final String k = ackm.k("downloads_page_section_key");
        final ikc c = c(ackm);
        if (c != null) {
            if (k != null) {
                final ikd a = c.a();
                if (ikd.f(k, messageLite) != null) {
                    final appm a2 = a.a(k, messageLite);
                    if (a2 == null) {
                        ttr.b("Trying to show ungrafted proto for section: ".concat(k));
                        return;
                    }
                    a.a.J(3, xmm.ac(a2), (alhi)null);
                }
            }
        }
    }
    
    public static void b(final ackm ackm, final MessageLite messageLite) {
        if (ackm != null) {
            if (messageLite != null) {
                final String k = ackm.k("downloads_page_section_key");
                final ikc c = c(ackm);
                if (c != null) {
                    if (k != null) {
                        final ikd a = c.a();
                        final xab f = ikd.f(k, messageLite);
                        if (f != null) {
                            final appm a2 = a.a(k, messageLite);
                            if (a2 == null) {
                                ttr.b("Trying to show ungrafted proto for section: ".concat(k));
                                return;
                            }
                            a.a.t(xmm.ac(a2), (alhi)null);
                            final appm b = a.b(f, messageLite);
                            if (b != null) {
                                a.a.t(xmm.ac(b), (alhi)null);
                            }
                        }
                    }
                }
            }
        }
    }
    
    private static ikc c(final ackm ackm) {
        if (!(ackm.c("sectionListController") instanceof ikc)) {
            return null;
        }
        return (ikc)ackm.c("sectionListController");
    }
}
