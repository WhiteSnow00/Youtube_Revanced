// 
// Decompiled by Procyon v0.6.0
// 

public final class fvc implements ackn
{
    public static final fvc a;
    public static final fvc b;
    public static final fvc c;
    private final int d;
    
    static {
        c = new fvc(5);
        b = new fvc(2);
        a = new fvc(1);
    }
    
    public fvc(final int d) {
        this.d = d;
    }
    
    public static boolean b(final ackm ackm) {
        return ackm.j("MainSortFilterSubMenuContextDecoratorPreventDisableWhenOfflineKey", false);
    }
    
    public final void a(final ackm ackm, final acjn acjn, final int n) {
        final int d = this.d;
        boolean b = false;
        final boolean b2 = false;
        final Boolean value = true;
        switch (d) {
            default: {
                if (n == acjn.a() - 1) {
                    b = true;
                }
                ackm.f("isLastItem", (Object)b);
                return;
            }
            case 7: {
                boolean b3 = b2;
                if (n == 0) {
                    b3 = true;
                }
                ackm.f("isFirstItem", (Object)b3);
                return;
            }
            case 6: {
                if (n == acjn.a() - 1 && acjn.c(n) instanceof appd) {
                    ackm.f("video_with_context_hide_separator_present_context_decorator", (Object)value);
                }
                return;
            }
            case 5: {
                if (acjn.c(n) instanceof acpe) {
                    fal.s(ackm, 2);
                }
                return;
            }
            case 4: {
                ackm.f("clarify_box_no_bottom", (Object)Boolean.TRUE);
                return;
            }
            case 3: {
                ackm.f("clarify_box_in_metadata_highlights", (Object)Boolean.TRUE);
                return;
            }
            case 2: {
                ((wyy)ackm).d = (wzz)new wyt(xaa.b(42352));
                return;
            }
            case 1: {
                if (acjn.c(n) instanceof acpe) {
                    fal.s(ackm, 2);
                }
                return;
            }
            case 0: {
                ackm.f("MainSortFilterSubMenuContextDecoratorPreventDisableWhenOfflineKey", (Object)value);
            }
        }
    }
}
