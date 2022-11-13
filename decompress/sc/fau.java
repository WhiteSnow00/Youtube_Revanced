import j$.util.Optional;
import j$.util.Map$_EL;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fau implements fat
{
    private final arwh a;
    private final fzw b;
    
    public fau(final arwh a, final fzw b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
    }
    
    private final ahob c(final fav fav) {
        if ((fav.b & 0x1) == 0x0) {
            ttr.m("AdaptAnimHlprImp", "#getAnimationDecisionForCategory: no category provided");
            return ahob.a;
        }
        int x;
        if ((x = adyf.X(fav.c)) == 0) {
            x = 1;
        }
        Integer.toString(x - 1);
        int n = 0;
        Label_0128: {
            if ((n = x) != 2) {
                if ((n = x) != 4) {
                    break Label_0128;
                }
                n = 4;
            }
            final fzw b = this.b;
            alxw alxw;
            if ((alxw = ((arwh)b.b).f().e) == null) {
                alxw = alxw.a;
            }
            if (!alxw.aL) {
                final Object a = b.a;
                ahoe ahoe;
                if ((ahoe = alxw.aM) == null) {
                    ahoe = ahoe.a;
                }
                if (((addt)a).d(ahoe)) {
                    break Label_0128;
                }
            }
            return ahob.d;
        }
        alxw alxw2;
        if ((alxw2 = this.a.f().e) == null) {
            alxw2 = alxw.a;
        }
        if (!Collections.unmodifiableMap((Map<?, ?>)new ahbw((Map)alxw2.be, alxw.bg)).isEmpty()) {
            final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)new ahbw((Map)alxw2.be, alxw.bg));
            String s;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            s = "ANIMATION_CATEGORY_ANIMATED_IMAGES";
                        }
                        else {
                            s = "ANIMATION_CATEGORY_PAGE_TRANSITION";
                        }
                    }
                    else {
                        s = "ANIMATION_CATEGORY_PROGRESS_INDICATOR";
                    }
                }
                else {
                    s = "ANIMATION_CATEGORY_WATCH_TRANSITION";
                }
            }
            else {
                s = "ANIMATION_CATEGORY_UNKNOWN";
            }
            return (ahob)Map$_EL.getOrDefault((Map)unmodifiableMap, (Object)s, (Object)ahob.a);
        }
        return ahob.a;
    }
    
    public final int a(final fav fav, final fas fas) {
        final ahob c = this.c(fav);
        String.valueOf(c);
        final ahob a = ahob.a;
        final int ordinal = c.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 1;
                }
            }
            else {
                fas.b();
            }
            ttr.m("AdaptAnimHlprImp", "#maybeAnimate: no animation run");
            return 1;
        }
        fas.a();
        return 2;
    }
    
    public final int b(final fav fav, final atwt atwt) {
        final ahob c = this.c(fav);
        String.valueOf(c);
        final ahob a = ahob.a;
        final int ordinal = c.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 0;
                }
            }
            else {
                final Optional empty = Optional.empty();
                if (empty.isPresent()) {
                    return (int)empty.get();
                }
            }
            ttr.m("AdaptAnimHlprImp", "#selectAnimation: none selected");
            return 0;
        }
        return atwt.a;
    }
}
