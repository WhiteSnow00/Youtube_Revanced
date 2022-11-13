// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.yoga;

public class YogaNative
{
    static {
        agse.c(egz.a, new String[0]);
    }
    
    public static native void jni_YGConfigFreeJNI(final long p0);
    
    public static native long jni_YGConfigNewJNI();
    
    static native void jni_YGConfigSetExperimentalFeatureEnabledJNI(final long p0, final int p1, final boolean p2);
    
    static native void jni_YGConfigSetLoggerJNI(final long p0, final YogaLogger p1);
    
    static native void jni_YGConfigSetPointScaleFactorJNI(final long p0, final float p1);
    
    static native void jni_YGConfigSetPrintTreeFlagJNI(final long p0, final boolean p1);
    
    static native void jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviourJNI(final long p0, final boolean p1);
    
    static native void jni_YGConfigSetUseLegacyStretchBehaviourJNI(final long p0, final boolean p1);
    
    public static native void jni_YGConfigSetUseWebDefaultsJNI(final long p0, final boolean p1);
    
    static native void jni_YGNodeCalculateLayoutJNI(final long p0, final float p1, final float p2, final long[] p3, final YogaNodeJNIBase[] p4);
    
    static native void jni_YGNodeClearChildrenJNI(final long p0);
    
    static native long jni_YGNodeCloneJNI(final long p0);
    
    static native void jni_YGNodeCopyStyleJNI(final long p0, final long p1);
    
    public static native void jni_YGNodeFreeJNI(final long p0);
    
    static native void jni_YGNodeInsertChildJNI(final long p0, final long p1, final int p2);
    
    static native boolean jni_YGNodeIsDirtyJNI(final long p0);
    
    static native boolean jni_YGNodeIsReferenceBaselineJNI(final long p0);
    
    static native void jni_YGNodeMarkDirtyAndPropogateToDescendantsJNI(final long p0);
    
    static native void jni_YGNodeMarkDirtyJNI(final long p0);
    
    public static native long jni_YGNodeNewJNI();
    
    public static native long jni_YGNodeNewWithConfigJNI(final long p0);
    
    static native void jni_YGNodePrintJNI(final long p0);
    
    static native void jni_YGNodeRemoveChildJNI(final long p0, final long p1);
    
    static native void jni_YGNodeResetJNI(final long p0);
    
    static native void jni_YGNodeSetHasBaselineFuncJNI(final long p0, final boolean p1);
    
    static native void jni_YGNodeSetHasMeasureFuncJNI(final long p0, final boolean p1);
    
    static native void jni_YGNodeSetIsReferenceBaselineJNI(final long p0, final boolean p1);
    
    static native void jni_YGNodeSetStyleInputsJNI(final long p0, final float[] p1, final int p2);
    
    static native int jni_YGNodeStyleGetAlignContentJNI(final long p0);
    
    static native int jni_YGNodeStyleGetAlignItemsJNI(final long p0);
    
    static native int jni_YGNodeStyleGetAlignSelfJNI(final long p0);
    
    static native float jni_YGNodeStyleGetAspectRatioJNI(final long p0);
    
    static native float jni_YGNodeStyleGetBorderJNI(final long p0, final int p1);
    
    static native int jni_YGNodeStyleGetDirectionJNI(final long p0);
    
    static native int jni_YGNodeStyleGetDisplayJNI(final long p0);
    
    static native long jni_YGNodeStyleGetFlexBasisJNI(final long p0);
    
    static native int jni_YGNodeStyleGetFlexDirectionJNI(final long p0);
    
    static native float jni_YGNodeStyleGetFlexGrowJNI(final long p0);
    
    static native float jni_YGNodeStyleGetFlexJNI(final long p0);
    
    static native float jni_YGNodeStyleGetFlexShrinkJNI(final long p0);
    
    static native int jni_YGNodeStyleGetFlexWrapJNI(final long p0);
    
    static native long jni_YGNodeStyleGetHeightJNI(final long p0);
    
    static native int jni_YGNodeStyleGetJustifyContentJNI(final long p0);
    
    static native long jni_YGNodeStyleGetMarginJNI(final long p0, final int p1);
    
    static native long jni_YGNodeStyleGetMaxHeightJNI(final long p0);
    
    static native long jni_YGNodeStyleGetMaxWidthJNI(final long p0);
    
    static native long jni_YGNodeStyleGetMinHeightJNI(final long p0);
    
    static native long jni_YGNodeStyleGetMinWidthJNI(final long p0);
    
    static native int jni_YGNodeStyleGetOverflowJNI(final long p0);
    
    static native long jni_YGNodeStyleGetPaddingJNI(final long p0, final int p1);
    
    static native long jni_YGNodeStyleGetPositionJNI(final long p0, final int p1);
    
    static native int jni_YGNodeStyleGetPositionTypeJNI(final long p0);
    
    static native long jni_YGNodeStyleGetWidthJNI(final long p0);
    
    static native void jni_YGNodeStyleSetAlignContentJNI(final long p0, final int p1);
    
    static native void jni_YGNodeStyleSetAlignItemsJNI(final long p0, final int p1);
    
    static native void jni_YGNodeStyleSetAlignSelfJNI(final long p0, final int p1);
    
    static native void jni_YGNodeStyleSetAspectRatioJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetBorderJNI(final long p0, final int p1, final float p2);
    
    static native void jni_YGNodeStyleSetDirectionJNI(final long p0, final int p1);
    
    static native void jni_YGNodeStyleSetDisplayJNI(final long p0, final int p1);
    
    static native void jni_YGNodeStyleSetFlexBasisAutoJNI(final long p0);
    
    static native void jni_YGNodeStyleSetFlexBasisJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetFlexBasisPercentJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetFlexDirectionJNI(final long p0, final int p1);
    
    static native void jni_YGNodeStyleSetFlexGrowJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetFlexJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetFlexShrinkJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetFlexWrapJNI(final long p0, final int p1);
    
    static native void jni_YGNodeStyleSetHeightAutoJNI(final long p0);
    
    static native void jni_YGNodeStyleSetHeightJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetHeightPercentJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetJustifyContentJNI(final long p0, final int p1);
    
    static native void jni_YGNodeStyleSetMarginAutoJNI(final long p0, final int p1);
    
    static native void jni_YGNodeStyleSetMarginJNI(final long p0, final int p1, final float p2);
    
    static native void jni_YGNodeStyleSetMarginPercentJNI(final long p0, final int p1, final float p2);
    
    static native void jni_YGNodeStyleSetMaxHeightJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetMaxHeightPercentJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetMaxWidthJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetMaxWidthPercentJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetMinHeightJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetMinHeightPercentJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetMinWidthJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetMinWidthPercentJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetOverflowJNI(final long p0, final int p1);
    
    static native void jni_YGNodeStyleSetPaddingJNI(final long p0, final int p1, final float p2);
    
    static native void jni_YGNodeStyleSetPaddingPercentJNI(final long p0, final int p1, final float p2);
    
    static native void jni_YGNodeStyleSetPositionJNI(final long p0, final int p1, final float p2);
    
    static native void jni_YGNodeStyleSetPositionPercentJNI(final long p0, final int p1, final float p2);
    
    static native void jni_YGNodeStyleSetPositionTypeJNI(final long p0, final int p1);
    
    static native void jni_YGNodeStyleSetWidthAutoJNI(final long p0);
    
    static native void jni_YGNodeStyleSetWidthJNI(final long p0, final float p1);
    
    static native void jni_YGNodeStyleSetWidthPercentJNI(final long p0, final float p1);
    
    static native void jni_YGNodeSwapChildJNI(final long p0, final long p1, final int p2);
}
