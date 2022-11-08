import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfe implements acik
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public kfe(final acij b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public kfe(final acma b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public kfe(final acmc b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public kfe(final acnp b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public kfe(final acpd b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public kfe(final arcv b, final int a, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public kfe(final jeb b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public kfe(final smh b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public kfe(final vax b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public static smh b(final Map map) {
        final smc smc = (smc)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)smc.class);
        smh e;
        if (smc != null) {
            e = smc.e();
        }
        else {
            e = (smh)tmy.O(map, (Object)"commentThreadMutator", (Class)smh.class);
        }
        return e;
    }
    
    public static acma c(final acij acij) {
        return (acma)acij.c("SortFilterSubMenuContextDecoratorKey");
    }
    
    public static void d(final acij acij, final acma acma) {
        acij.f("SortFilterSubMenuContextDecoratorKey", (Object)acma);
    }
    
    public final void a(final acij acij, final achk achk, final int n) {
        final int a = this.a;
        final Boolean value = true;
        switch (a) {
            default: {
                d(acij, (acma)this.b);
                return;
            }
            case 8: {
                acij.f("sectionListController", this.b);
                return;
            }
            case 7: {
                acij.f("sectionController", this.b);
                return;
            }
            case 6: {
                acij.f("horizontalShelfColumnCountSupplier", this.b);
                return;
            }
            case 5: {
                final Object b = this.b;
                if (b != null) {
                    acij.f("commandRouter", b);
                }
                return;
            }
            case 4: {
                acij.f("commentThreadMutator", this.b);
                return;
            }
            case 3: {
                acij.f("commentGhostCardAnimController", this.b);
                return;
            }
            case 2: {
                acij.f("is_drawer_context", (Object)value);
                acij.f("avatar_selection_listener", ((acij)this.b).c("avatar_selection_listener"));
                acij.f("avatar_selection_controller", ((acij)this.b).c("avatar_selection_controller"));
                return;
            }
            case 1: {
                acij.f("segmentedPlaylistContextDecoratorController", this.b);
                acij.f("segmentedPlaylistContextDecoratorRenderer", achk.c(n));
                return;
            }
            case 0: {
                acij.f("is_drawer_context", (Object)value);
                acij.f("avatar_selection_listener", ((acij)this.b).c("avatar_selection_listener"));
                acij.f("avatar_selection_controller", ((acij)this.b).c("avatar_selection_controller"));
                acij.f("SECTION_LIST_DRAWER_COMPACT_MODE", (Object)((acij)this.b).j("SECTION_LIST_DRAWER_COMPACT_MODE", true));
            }
        }
    }
}
