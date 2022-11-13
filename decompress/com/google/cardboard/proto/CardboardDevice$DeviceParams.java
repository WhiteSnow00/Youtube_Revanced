// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.proto;

import com.google.protobuf.MessageLite;
import java.nio.ByteBuffer;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.InputStream;
import java.util.List;

public final class CardboardDevice$DeviceParams extends ahbh implements CardboardDevice$DeviceParamsOrBuilder
{
    private static final CardboardDevice$DeviceParams DEFAULT_INSTANCE;
    public static final int DISTORTION_COEFFICIENTS_FIELD_NUMBER = 7;
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
    private int distortionCoefficientsMemoizedSerializedSize;
    private ahbo distortionCoefficients_;
    private float interLensDistance_;
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
        this.vendor_ = "";
        this.model_ = "";
        this.leftEyeFieldOfViewAngles_ = emptyFloatList();
        this.distortionCoefficients_ = emptyFloatList();
        this.primaryButton_ = 1;
    }
    
    static CardboardDevice$DeviceParams access$000() {
        return CardboardDevice$DeviceParams.DEFAULT_INSTANCE;
    }
    
    static void access$100(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final String vendor) {
        cardboardDevice$DeviceParams.setVendor(vendor);
    }
    
    static void access$1000(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        cardboardDevice$DeviceParams.clearInterLensDistance();
    }
    
    static void access$1100(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final int n, final float n2) {
        cardboardDevice$DeviceParams.setLeftEyeFieldOfViewAngles(n, n2);
    }
    
    static void access$1200(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final float n) {
        cardboardDevice$DeviceParams.addLeftEyeFieldOfViewAngles(n);
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
    
    static void access$1600(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        cardboardDevice$DeviceParams.clearVerticalAlignment();
    }
    
    static void access$1700(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final float trayToLensDistance) {
        cardboardDevice$DeviceParams.setTrayToLensDistance(trayToLensDistance);
    }
    
    static void access$1800(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        cardboardDevice$DeviceParams.clearTrayToLensDistance();
    }
    
    static void access$1900(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final int n, final float n2) {
        cardboardDevice$DeviceParams.setDistortionCoefficients(n, n2);
    }
    
    static void access$200(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        cardboardDevice$DeviceParams.clearVendor();
    }
    
    static void access$2000(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final float n) {
        cardboardDevice$DeviceParams.addDistortionCoefficients(n);
    }
    
    static void access$2100(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final Iterable iterable) {
        cardboardDevice$DeviceParams.addAllDistortionCoefficients(iterable);
    }
    
    static void access$2200(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        cardboardDevice$DeviceParams.clearDistortionCoefficients();
    }
    
    static void access$2300(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final CardboardDevice$DeviceParams$ButtonType primaryButton) {
        cardboardDevice$DeviceParams.setPrimaryButton(primaryButton);
    }
    
    static void access$2400(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        cardboardDevice$DeviceParams.clearPrimaryButton();
    }
    
    static void access$300(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final ahab vendorBytes) {
        cardboardDevice$DeviceParams.setVendorBytes(vendorBytes);
    }
    
    static void access$400(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final String model) {
        cardboardDevice$DeviceParams.setModel(model);
    }
    
    static void access$500(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        cardboardDevice$DeviceParams.clearModel();
    }
    
    static void access$600(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final ahab modelBytes) {
        cardboardDevice$DeviceParams.setModelBytes(modelBytes);
    }
    
    static void access$700(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final float screenToLensDistance) {
        cardboardDevice$DeviceParams.setScreenToLensDistance(screenToLensDistance);
    }
    
    static void access$800(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        cardboardDevice$DeviceParams.clearScreenToLensDistance();
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
    
    private void addDistortionCoefficients(final float n) {
        this.ensureDistortionCoefficientsIsMutable();
        this.distortionCoefficients_.h(n);
    }
    
    private void addLeftEyeFieldOfViewAngles(final float n) {
        this.ensureLeftEyeFieldOfViewAnglesIsMutable();
        this.leftEyeFieldOfViewAngles_.h(n);
    }
    
    private void clearDistortionCoefficients() {
        this.distortionCoefficients_ = emptyFloatList();
    }
    
    private void clearInterLensDistance() {
        this.bitField0_ &= 0xFFFFFFF7;
        this.interLensDistance_ = 0.0f;
    }
    
    private void clearLeftEyeFieldOfViewAngles() {
        this.leftEyeFieldOfViewAngles_ = emptyFloatList();
    }
    
    private void clearModel() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.model_ = getDefaultInstance().getModel();
    }
    
    private void clearPrimaryButton() {
        this.bitField0_ &= 0xFFFFFFBF;
        this.primaryButton_ = 1;
    }
    
    private void clearScreenToLensDistance() {
        this.bitField0_ &= 0xFFFFFFFB;
        this.screenToLensDistance_ = 0.0f;
    }
    
    private void clearTrayToLensDistance() {
        this.bitField0_ &= 0xFFFFFFDF;
        this.trayToLensDistance_ = 0.0f;
    }
    
    private void clearVendor() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.vendor_ = getDefaultInstance().getVendor();
    }
    
    private void clearVerticalAlignment() {
        this.bitField0_ &= 0xFFFFFFEF;
        this.verticalAlignment_ = 0;
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
    
    public static CardboardDevice$DeviceParams getDefaultInstance() {
        return CardboardDevice$DeviceParams.DEFAULT_INSTANCE;
    }
    
    public static CardboardDevice$DeviceParams$Builder newBuilder() {
        return (CardboardDevice$DeviceParams$Builder)CardboardDevice$DeviceParams.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static CardboardDevice$DeviceParams$Builder newBuilder(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        return (CardboardDevice$DeviceParams$Builder)CardboardDevice$DeviceParams.DEFAULT_INSTANCE.createBuilder((ahbh)cardboardDevice$DeviceParams);
    }
    
    public static CardboardDevice$DeviceParams parseDelimitedFrom(final InputStream inputStream) {
        return (CardboardDevice$DeviceParams)parseDelimitedFrom((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CardboardDevice$DeviceParams parseDelimitedFrom(final InputStream inputStream, final ExtensionRegistryLite extensionRegistryLite) {
        return (CardboardDevice$DeviceParams)parseDelimitedFrom((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }
    
    public static CardboardDevice$DeviceParams parseFrom(final ahab ahab) {
        return (CardboardDevice$DeviceParams)ahbh.parseFrom((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, ahab);
    }
    
    public static CardboardDevice$DeviceParams parseFrom(final ahab ahab, final ExtensionRegistryLite extensionRegistryLite) {
        return (CardboardDevice$DeviceParams)ahbh.parseFrom((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, ahab, extensionRegistryLite);
    }
    
    public static CardboardDevice$DeviceParams parseFrom(final ahag ahag) {
        return (CardboardDevice$DeviceParams)ahbh.parseFrom((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, ahag);
    }
    
    public static CardboardDevice$DeviceParams parseFrom(final ahag ahag, final ExtensionRegistryLite extensionRegistryLite) {
        return (CardboardDevice$DeviceParams)ahbh.parseFrom((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, ahag, extensionRegistryLite);
    }
    
    public static CardboardDevice$DeviceParams parseFrom(final InputStream inputStream) {
        return (CardboardDevice$DeviceParams)ahbh.parseFrom((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CardboardDevice$DeviceParams parseFrom(final InputStream inputStream, final ExtensionRegistryLite extensionRegistryLite) {
        return (CardboardDevice$DeviceParams)ahbh.parseFrom((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }
    
    public static CardboardDevice$DeviceParams parseFrom(final ByteBuffer byteBuffer) {
        return (CardboardDevice$DeviceParams)ahbh.parseFrom((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static CardboardDevice$DeviceParams parseFrom(final ByteBuffer byteBuffer, final ExtensionRegistryLite extensionRegistryLite) {
        return (CardboardDevice$DeviceParams)ahbh.parseFrom((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }
    
    public static CardboardDevice$DeviceParams parseFrom(final byte[] array) {
        return (CardboardDevice$DeviceParams)ahbh.parseFrom((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, array);
    }
    
    public static CardboardDevice$DeviceParams parseFrom(final byte[] array, final ExtensionRegistryLite extensionRegistryLite) {
        return (CardboardDevice$DeviceParams)ahbh.parseFrom((ahbh)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, array, extensionRegistryLite);
    }
    
    public static ahdd parser() {
        return CardboardDevice$DeviceParams.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setDistortionCoefficients(final int n, final float n2) {
        this.ensureDistortionCoefficientsIsMutable();
        this.distortionCoefficients_.f(n, n2);
    }
    
    private void setInterLensDistance(final float interLensDistance_) {
        this.bitField0_ |= 0x8;
        this.interLensDistance_ = interLensDistance_;
    }
    
    private void setLeftEyeFieldOfViewAngles(final int n, final float n2) {
        this.ensureLeftEyeFieldOfViewAnglesIsMutable();
        this.leftEyeFieldOfViewAngles_.f(n, n2);
    }
    
    private void setModel(final String model_) {
        model_.getClass();
        this.bitField0_ |= 0x2;
        this.model_ = model_;
    }
    
    private void setModelBytes(final ahab ahab) {
        this.model_ = ahab.E();
        this.bitField0_ |= 0x2;
    }
    
    private void setPrimaryButton(final CardboardDevice$DeviceParams$ButtonType cardboardDevice$DeviceParams$ButtonType) {
        this.primaryButton_ = cardboardDevice$DeviceParams$ButtonType.getNumber();
        this.bitField0_ |= 0x40;
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
    
    private void setVendorBytes(final ahab ahab) {
        this.vendor_ = ahab.E();
        this.bitField0_ |= 0x1;
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
                return new CardboardDevice$DeviceParams$Builder(null);
            }
            case 3: {
                return new CardboardDevice$DeviceParams();
            }
            case 2: {
                return newMessageInfo((MessageLite)CardboardDevice$DeviceParams.DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005$\u0006\u1001\u0005\u0007$\u000b\u100c\u0004\f\u100c\u0006", new Object[] { "bitField0_", "vendor_", "model_", "screenToLensDistance_", "interLensDistance_", "leftEyeFieldOfViewAngles_", "trayToLensDistance_", "distortionCoefficients_", "verticalAlignment_", CardboardDevice$DeviceParams$VerticalAlignmentType.internalGetVerifier(), "primaryButton_", CardboardDevice$DeviceParams$ButtonType.internalGetVerifier() });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public float getDistortionCoefficients(final int n) {
        return this.distortionCoefficients_.d(n);
    }
    
    public int getDistortionCoefficientsCount() {
        return this.distortionCoefficients_.size();
    }
    
    public List getDistortionCoefficientsList() {
        return (List)this.distortionCoefficients_;
    }
    
    public float getInterLensDistance() {
        return this.interLensDistance_;
    }
    
    public float getLeftEyeFieldOfViewAngles(final int n) {
        return this.leftEyeFieldOfViewAngles_.d(n);
    }
    
    public int getLeftEyeFieldOfViewAnglesCount() {
        return this.leftEyeFieldOfViewAngles_.size();
    }
    
    public List getLeftEyeFieldOfViewAnglesList() {
        return (List)this.leftEyeFieldOfViewAngles_;
    }
    
    public String getModel() {
        return this.model_;
    }
    
    public ahab getModelBytes() {
        return ahab.A(this.model_);
    }
    
    public CardboardDevice$DeviceParams$ButtonType getPrimaryButton() {
        CardboardDevice$DeviceParams$ButtonType cardboardDevice$DeviceParams$ButtonType;
        if ((cardboardDevice$DeviceParams$ButtonType = CardboardDevice$DeviceParams$ButtonType.forNumber(this.primaryButton_)) == null) {
            cardboardDevice$DeviceParams$ButtonType = CardboardDevice$DeviceParams$ButtonType.MAGNET;
        }
        return cardboardDevice$DeviceParams$ButtonType;
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
    
    public ahab getVendorBytes() {
        return ahab.A(this.vendor_);
    }
    
    public CardboardDevice$DeviceParams$VerticalAlignmentType getVerticalAlignment() {
        CardboardDevice$DeviceParams$VerticalAlignmentType cardboardDevice$DeviceParams$VerticalAlignmentType;
        if ((cardboardDevice$DeviceParams$VerticalAlignmentType = CardboardDevice$DeviceParams$VerticalAlignmentType.forNumber(this.verticalAlignment_)) == null) {
            cardboardDevice$DeviceParams$VerticalAlignmentType = CardboardDevice$DeviceParams$VerticalAlignmentType.BOTTOM;
        }
        return cardboardDevice$DeviceParams$VerticalAlignmentType;
    }
    
    public boolean hasInterLensDistance() {
        return (this.bitField0_ & 0x8) != 0x0;
    }
    
    public boolean hasModel() {
        return (this.bitField0_ & 0x2) != 0x0;
    }
    
    public boolean hasPrimaryButton() {
        return (this.bitField0_ & 0x40) != 0x0;
    }
    
    public boolean hasScreenToLensDistance() {
        return (this.bitField0_ & 0x4) != 0x0;
    }
    
    public boolean hasTrayToLensDistance() {
        return (this.bitField0_ & 0x20) != 0x0;
    }
    
    public boolean hasVendor() {
        return (this.bitField0_ & 0x1) != 0x0;
    }
    
    public boolean hasVerticalAlignment() {
        return (this.bitField0_ & 0x10) != 0x0;
    }
}
