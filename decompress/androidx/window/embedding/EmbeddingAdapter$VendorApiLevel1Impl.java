// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import androidx.window.extensions.embedding.SplitPlaceholderRule$Builder;
import androidx.window.extensions.embedding.SplitPairRule$Builder;
import androidx.window.extensions.embedding.SplitInfo;

final class EmbeddingAdapter$VendorApiLevel1Impl
{
    public static final EmbeddingAdapter$VendorApiLevel1Impl INSTANCE;
    
    static {
        INSTANCE = new EmbeddingAdapter$VendorApiLevel1Impl();
    }
    
    private EmbeddingAdapter$VendorApiLevel1Impl() {
    }
    
    private final boolean isSplitAttributesSupported(final SplitAttributes splitAttributes) {
        return splitAttributes.getSplitType() instanceof SplitAttributes$SplitType$RatioSplitType && atyb.i((Object[])new SplitAttributes$LayoutDirection[] { SplitAttributes$LayoutDirection.LEFT_TO_RIGHT, SplitAttributes$LayoutDirection.RIGHT_TO_LEFT, SplitAttributes$LayoutDirection.LOCALE }, (Object)splitAttributes.getLayoutDirection());
    }
    
    private final atnh translateSplitAttributesCompatInternal(final SplitAttributes splitAttributes) {
        final boolean splitAttributesSupported = this.isSplitAttributesSupported(splitAttributes);
        int n = 3;
        atnh atnh;
        if (!splitAttributesSupported) {
            atnh = new atnh(0.0f, 3);
        }
        else {
            final float value$window_release = splitAttributes.getSplitType().getValue$window_release();
            final SplitAttributes$LayoutDirection layoutDirection = splitAttributes.getLayoutDirection();
            if (!atqz.c(layoutDirection, SplitAttributes$LayoutDirection.LOCALE)) {
                if (atqz.c(layoutDirection, SplitAttributes$LayoutDirection.LEFT_TO_RIGHT)) {
                    n = 0;
                }
                else {
                    if (!atqz.c(layoutDirection, SplitAttributes$LayoutDirection.RIGHT_TO_LEFT)) {
                        throw new IllegalStateException("Unsupported layout direction must be covered in @isSplitAttributesSupported!");
                    }
                    n = 1;
                }
            }
            atnh = new atnh(value$window_release, n);
        }
        return atnh;
    }
    
    public final SplitAttributes getSplitAttributesCompat(final SplitInfo splitInfo) {
        splitInfo.getClass();
        final SplitAttributes$Builder splitAttributes$Builder = new SplitAttributes$Builder();
        splitAttributes$Builder.setSplitType(SplitAttributes$SplitType.Companion.buildSplitTypeFromValue$window_release(splitInfo.getSplitRatio()));
        splitAttributes$Builder.setLayoutDirection(SplitAttributes$LayoutDirection.LOCALE);
        return splitAttributes$Builder.build();
    }
    
    public final SplitPairRule$Builder setDefaultSplitAttributesCompat(SplitPairRule$Builder setLayoutDirection, final SplitAttributes splitAttributes) {
        setLayoutDirection.getClass();
        splitAttributes.getClass();
        final atnh translateSplitAttributesCompatInternal = this.translateSplitAttributesCompatInternal(splitAttributes);
        setLayoutDirection = setLayoutDirection.setSplitRatio(((Number)translateSplitAttributesCompatInternal.a).floatValue()).setLayoutDirection(((Number)translateSplitAttributesCompatInternal.b).intValue());
        setLayoutDirection.getClass();
        return setLayoutDirection;
    }
    
    public final SplitPlaceholderRule$Builder setDefaultSplitAttributesCompat(SplitPlaceholderRule$Builder setLayoutDirection, final SplitAttributes splitAttributes) {
        setLayoutDirection.getClass();
        splitAttributes.getClass();
        final atnh translateSplitAttributesCompatInternal = this.translateSplitAttributesCompatInternal(splitAttributes);
        setLayoutDirection = setLayoutDirection.setSplitRatio(((Number)translateSplitAttributesCompatInternal.a).floatValue()).setLayoutDirection(((Number)translateSplitAttributesCompatInternal.b).intValue());
        setLayoutDirection.getClass();
        return setLayoutDirection;
    }
    
    public final SplitPlaceholderRule$Builder setFinishPrimaryWithPlaceholderCompat(SplitPlaceholderRule$Builder setFinishPrimaryWithSecondary, final int finishPrimaryWithSecondary) {
        setFinishPrimaryWithSecondary.getClass();
        setFinishPrimaryWithSecondary = setFinishPrimaryWithSecondary.setFinishPrimaryWithSecondary(finishPrimaryWithSecondary);
        setFinishPrimaryWithSecondary.getClass();
        return setFinishPrimaryWithSecondary;
    }
}
