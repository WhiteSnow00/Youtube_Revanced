import j$.util.Optional;
import j$.util.Map$_EL;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class faq implements fap
{
    private final arud a;
    private final fzo b;
    
    public faq(final arud a, final fzo b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
    }
    
    private final ahmd c(final far far) {
        if ((far.b & 0x1) == 0x0) {
            trn.m("AdaptAnimHlprImp", "#getAnimationDecisionForCategory: no category provided");
            return ahmd.a;
        }
        int s;
        if ((s = aeda.S(far.c)) == 0) {
            s = 1;
        }
        Integer.toString(s - 1);
        int n = 0;
        Label_0128: {
            if ((n = s) != 2) {
                if ((n = s) != 4) {
                    break Label_0128;
                }
                n = 4;
            }
            final fzo b = this.b;
            alvs alvs;
            if ((alvs = ((arud)b.b).f().e) == null) {
                alvs = alvs.a;
            }
            if (!alvs.aL) {
                final Object a = b.a;
                ahmg ahmg;
                if ((ahmg = alvs.aM) == null) {
                    ahmg = ahmg.a;
                }
                if (((adbq)a).d(ahmg)) {
                    break Label_0128;
                }
            }
            return ahmd.d;
        }
        alvs alvs2;
        if ((alvs2 = this.a.f().e) == null) {
            alvs2 = alvs.a;
        }
        if (!Collections.unmodifiableMap((Map<?, ?>)new agzx((Map)alvs2.be, alvs.bg)).isEmpty()) {
            final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)new agzx((Map)alvs2.be, alvs.bg));
            String s2;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            s2 = "ANIMATION_CATEGORY_ANIMATED_IMAGES";
                        }
                        else {
                            s2 = "ANIMATION_CATEGORY_PAGE_TRANSITION";
                        }
                    }
                    else {
                        s2 = "ANIMATION_CATEGORY_PROGRESS_INDICATOR";
                    }
                }
                else {
                    s2 = "ANIMATION_CATEGORY_WATCH_TRANSITION";
                }
            }
            else {
                s2 = "ANIMATION_CATEGORY_UNKNOWN";
            }
            return (ahmd)Map$_EL.getOrDefault((Map)unmodifiableMap, (Object)s2, (Object)ahmd.a);
        }
        return ahmd.a;
    }
    
    @Override
    public final int a(final far far, final fao fao) {
        final ahmd c = this.c(far);
        String.valueOf(c);
        final ahmd a = ahmd.a;
        final int ordinal = c.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 1;
                }
            }
            else {
                fao.b();
            }
            trn.m("AdaptAnimHlprImp", "#maybeAnimate: no animation run");
            return 1;
        }
        fao.a();
        return 2;
    }
    
    @Override
    public final int b(final far far, final atvw atvw) {
        final ahmd c = this.c(far);
        String.valueOf(c);
        final ahmd a = ahmd.a;
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
            trn.m("AdaptAnimHlprImp", "#selectAnimation: none selected");
            return 0;
        }
        return atvw.a;
    }
}
