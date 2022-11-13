// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.List;

public final class CardboardDevice$DeviceParams extends ahbh implements ahcw
{
    public static final int BLUE_DISTORTION_COEFFICIENTS_FIELD_NUMBER = 9;
    public static final int DAYDREAM_INTERNAL_FIELD_NUMBER = 196883;
    private static final CardboardDevice$DeviceParams DEFAULT_INSTANCE;
    public static final int DISTORTION_COEFFICIENTS_FIELD_NUMBER = 7;
    public static final int FREEFORM_DISTORTION_FIELD_NUMBER = 13;
    public static final int GREEN_DISTORTION_COEFFICIENTS_FIELD_NUMBER = 8;
    public static final int HAS_MAGNET_FIELD_NUMBER = 10;
    public static final int INTERNAL_FIELD_NUMBER = 1729;
    public static final int INTER_LENS_DISTANCE_FIELD_NUMBER = 4;
    public static final int LEFT_EYE_FIELD_OF_VIEW_ANGLES_FIELD_NUMBER = 5;
    public static final int MODEL_FIELD_NUMBER = 2;
    private static volatile ahdd PARSER;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 12;
    public static final int SCREEN_TO_LENS_DISTANCE_FIELD_NUMBER = 3;
    public static final int TRAY_TO_LENS_DISTANCE_FIELD_NUMBER = 6;
    public static final int VENDOR_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 11;
    private int bitField0_;
    private int blueDistortionCoefficientsMemoizedSerializedSize;
    private ahbo blueDistortionCoefficients_;
    private CardboardDevice$DaydreamInternalParams daydreamInternal_;
    private int distortionCoefficientsMemoizedSerializedSize;
    private ahbo distortionCoefficients_;
    private CardboardDevice$FreeformDistortion freeformDistortion_;
    private int greenDistortionCoefficientsMemoizedSerializedSize;
    private ahbo greenDistortionCoefficients_;
    private boolean hasMagnet_;
    private float interLensDistance_;
    private CardboardDevice$CardboardInternalParams internal_;
    private int leftEyeFieldOfViewAnglesMemoizedSerializedSize;
    private ahbo leftEyeFieldOfViewAngles_;
    private String model_;
    private int primaryButton_;
    private float screenToLensDistance_;
    private float trayToLensDistance_;
    private String vendor_;
    private int verticalAlignment_;
    
    static {
        ahbh.registerDefaultInstance((Class)CardboardDevice$DeviceParams.class, (ahbh)(DEFAULT_INSTANCE = new CardboardDevice$DeviceParams()));
    }
    
    private CardboardDevice$DeviceParams() {
        this.leftEyeFieldOfViewAnglesMemoizedSerializedSize = -1;
        this.distortionCoefficientsMemoizedSerializedSize = -1;
        this.greenDistortionCoefficientsMemoizedSerializedSize = -1;
        this.blueDistortionCoefficientsMemoizedSerializedSize = -1;
        this.vendor_ = "";
        this.model_ = "";
        this.leftEyeFieldOfViewAngles_ = emptyFloatList();
        this.distortionCoefficients_ = emptyFloatList();
        this.greenDistortionCoefficients_ = emptyFloatList();
        this.blueDistortionCoefficients_ = emptyFloatList();
        this.primaryButton_ = 1;
    }
    
    static CardboardDevice$DeviceParams access$000() {
        return CardboardDevice$DeviceParams.DEFAULT_INSTANCE;
    }
    
    static void access$100(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final String vendor) {
        cardboardDevice$DeviceParams.setVendor(vendor);
    }
    
    static void access$1300(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final Iterable iterable) {
        cardboardDevice$DeviceParams.addAllLeftEyeFieldOfViewAngles(iterable);
    }
    
    static void access$1400(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        cardboardDevice$DeviceParams.clearLeftEyeFieldOfViewAngles();
    }
    
    static void access$1500(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final CardboardDevice$DeviceParams$VerticalAlignmentType verticalAlignment) {
        cardboardDevice$DeviceParams.setVerticalAlignment(verticalAlignment);
    }
    
    static void access$1700(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final float trayToLensDistance) {
        cardboardDevice$DeviceParams.setTrayToLensDistance(trayToLensDistance);
    }
    
    static void access$2100(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final Iterable iterable) {
        cardboardDevice$DeviceParams.addAllDistortionCoefficients(iterable);
    }
    
    static void access$2200(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        cardboardDevice$DeviceParams.clearDistortionCoefficients();
    }
    
    static void access$3100(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final boolean b) {
        cardboardDevice$DeviceParams.setHasMagnet(true);
    }
    
    static void access$400(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final String model) {
        cardboardDevice$DeviceParams.setModel(model);
    }
    
    static void access$700(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final float screenToLensDistance) {
        cardboardDevice$DeviceParams.setScreenToLensDistance(screenToLensDistance);
    }
    
    static void access$900(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final float interLensDistance) {
        cardboardDevice$DeviceParams.setInterLensDistance(interLensDistance);
    }
    
    private void addAllDistortionCoefficients(final Iterable iterable) {
        this.ensureDistortionCoefficientsIsMutable();
        agzk.addAll(iterable, (List)this.distortionCoefficients_);
    }
    
    private void addAllLeftEyeFieldOfViewAngles(final Iterable iterable) {
        this.ensureLeftEyeFieldOfViewAnglesIsMutable();
        agzk.addAll(iterable, (List)this.leftEyeFieldOfViewAngles_);
    }
    
    private void clearDistortionCoefficients() {
        this.distortionCoefficients_ = emptyFloatList();
    }
    
    private void clearLeftEyeFieldOfViewAngles() {
        this.leftEyeFieldOfViewAngles_ = emptyFloatList();
    }
    
    private void ensureDistortionCoefficientsIsMutable() {
        final ahbo distortionCoefficients_ = this.distortionCoefficients_;
        if (!distortionCoefficients_.c()) {
            this.distortionCoefficients_ = ahbh.mutableCopy(distortionCoefficients_);
        }
    }
    
    private void ensureLeftEyeFieldOfViewAnglesIsMutable() {
        final ahbo leftEyeFieldOfViewAngles_ = this.leftEyeFieldOfViewAngles_;
        if (!leftEyeFieldOfViewAngles_.c()) {
            this.leftEyeFieldOfViewAngles_ = ahbh.mutableCopy(leftEyeFieldOfViewAngles_);
        }
    }
    
    public static CardboardDevice$DeviceParams$Builder newBuilder() {
        return (CardboardDevice$DeviceParams$Builder)CardboardDevice$DeviceParams.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static CardboardDevice$DeviceParams parseFrom(final byte[] array, final ExtensionRegistryLite extensionRegistryLite) {
        return (CardboardDevice$DeviceParams)ahbh.parseFrom((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, array, extensionRegistryLite);
    }
    
    private void setHasMagnet(final boolean b) {
        this.bitField0_ |= 0x40;
        this.hasMagnet_ = true;
    }
    
    private void setInterLensDistance(final float interLensDistance_) {
        this.bitField0_ |= 0x8;
        this.interLensDistance_ = interLensDistance_;
    }
    
    private void setModel(final String model_) {
        model_.getClass();
        this.bitField0_ |= 0x2;
        this.model_ = model_;
    }
    
    private void setScreenToLensDistance(final float screenToLensDistance_) {
        this.bitField0_ |= 0x4;
        this.screenToLensDistance_ = screenToLensDistance_;
    }
    
    private void setTrayToLensDistance(final float trayToLensDistance_) {
        this.bitField0_ |= 0x20;
        this.trayToLensDistance_ = trayToLensDistance_;
    }
    
    private void setVendor(final String vendor_) {
        vendor_.getClass();
        this.bitField0_ |= 0x1;
        this.vendor_ = vendor_;
    }
    
    private void setVerticalAlignment(final CardboardDevice$DeviceParams$VerticalAlignmentType cardboardDevice$DeviceParams$VerticalAlignmentType) {
        this.verticalAlignment_ = cardboardDevice$DeviceParams$VerticalAlignmentType.getNumber();
        this.bitField0_ |= 0x10;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = CardboardDevice$DeviceParams.PARSER) == null) {
                    synchronized (CardboardDevice$DeviceParams.class) {
                        if (CardboardDevice$DeviceParams.PARSER == null) {
                            CardboardDevice$DeviceParams.PARSER = (ahdd)new ahba((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return CardboardDevice$DeviceParams.DEFAULT_INSTANCE;
            }
            case 4: {
                return new CardboardDevice$DeviceParams$Builder((CardboardDevice$1)null);
            }
            case 3: {
                return new CardboardDevice$DeviceParams();
            }
            case 2: {
                return newMessageInfo((MessageLite)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\ue113\u0018\u000f\u0000\u0004\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005$\u0006\u1001\u0005\u0007$\b$\t$\n\u1007\u0006\u000b\u100c\u0004\f\u100c\u0007\r\u1009\b\u06c1\u1009\t\ue113\u0018\u1009\n", new Object[] { "bitField0_", "vendor_", "model_", "screenToLensDistance_", "interLensDistance_", "leftEyeFieldOfViewAngles_", "trayToLensDistance_", "distortionCoefficients_", "greenDistortionCoefficients_", "blueDistortionCoefficients_", "hasMagnet_", "verticalAlignment_", CardboardDevice$DeviceParams$VerticalAlignmentType.internalGetVerifier(), "primaryButton_", CardboardDevice$DeviceParams$ButtonType.internalGetVerifier(), "freeformDistortion_", "internal_", "daydreamInternal_" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public CardboardDevice$DaydreamInternalParams getDaydreamInternal() {
        CardboardDevice$DaydreamInternalParams cardboardDevice$DaydreamInternalParams;
        if ((cardboardDevice$DaydreamInternalParams = this.daydreamInternal_) == null) {
            cardboardDevice$DaydreamInternalParams = CardboardDevice$DaydreamInternalParams.getDefaultInstance();
        }
        return cardboardDevice$DaydreamInternalParams;
    }
    
    public List getDistortionCoefficientsList() {
        return (List)this.distortionCoefficients_;
    }
    
    public boolean getHasMagnet() {
        return this.hasMagnet_;
    }
    
    public float getInterLensDistance() {
        return this.interLensDistance_;
    }
    
    public List getLeftEyeFieldOfViewAnglesList() {
        return (List)this.leftEyeFieldOfViewAngles_;
    }
    
    public String getModel() {
        return this.model_;
    }
    
    public float getScreenToLensDistance() {
        return this.screenToLensDistance_;
    }
    
    public float getTrayToLensDistance() {
        return this.trayToLensDistance_;
    }
    
    public String getVendor() {
        return this.vendor_;
    }
    
    public CardboardDevice$DeviceParams$VerticalAlignmentType getVerticalAlignment() {
        CardboardDevice$DeviceParams$VerticalAlignmentType cardboardDevice$DeviceParams$VerticalAlignmentType;
        if ((cardboardDevice$DeviceParams$VerticalAlignmentType = CardboardDevice$DeviceParams$VerticalAlignmentType.forNumber(this.verticalAlignment_)) == null) {
            cardboardDevice$DeviceParams$VerticalAlignmentType = CardboardDevice$DeviceParams$VerticalAlignmentType.BOTTOM;
        }
        return cardboardDevice$DeviceParams$VerticalAlignmentType;
    }
    
    public boolean hasDaydreamInternal() {
        return (this.bitField0_ & 0x400) != 0x0;
    }
}
