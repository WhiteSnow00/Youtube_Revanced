// 
// Decompiled by Procyon v0.6.0
// 

public final class fut implements acik
{
    private final /* synthetic */ int d;
    
    static {
        c = new fut(5);
        b = new fut(2);
        a = new fut(1);
    }
    
    public fut(final int d) {
        this.d = d;
    }
    
    public static boolean b(final acij acij) {
        return acij.j("MainSortFilterSubMenuContextDecoratorPreventDisableWhenOfflineKey", false);
    }
    
    public final void a(final acij acij, final achk achk, final int n) {
        final int d = this.d;
        final boolean b = false;
        boolean b2 = false;
        final Boolean value = true;
        switch (d) {
            default: {
                boolean b3 = b;
                if (n == achk.a() - 1) {
                    b3 = true;
                }
                acij.f("isLastItem", (Object)b3);
                return;
            }
            case 7: {
                if (n == 0) {
                    b2 = true;
                }
                acij.f("isFirstItem", (Object)b2);
                return;
            }
            case 6: {
                if (n == achk.a() - 1 && achk.c(n) instanceof apmz) {
                    acij.f("video_with_context_hide_separator_present_context_decorator", (Object)value);
                }
                return;
            }
            case 5: {
                if (achk.c(n) instanceof acna) {
                    fah.u(acij, 2);
                }
                return;
            }
            case 4: {
                acij.f("clarify_box_no_bottom", (Object)Boolean.TRUE);
                return;
            }
            case 3: {
                acij.f("clarify_box_in_metadata_highlights", (Object)Boolean.TRUE);
                return;
            }
            case 2: {
                ((wwx)acij).d = (wxz)new wws(wya.b(42352));
                return;
            }
            case 1: {
                if (achk.c(n) instanceof acna) {
                    fah.u(acij, 2);
                }
                return;
            }
            case 0: {
                acij.f("MainSortFilterSubMenuContextDecoratorPreventDisableWhenOfflineKey", (Object)value);
            }
        }
    }
}
