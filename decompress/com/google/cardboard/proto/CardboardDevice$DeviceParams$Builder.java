// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.proto;

import java.util.Collections;
import java.util.List;

public final class CardboardDevice$DeviceParams$Builder extends agza implements CardboardDevice$DeviceParamsOrBuilder
{
    private CardboardDevice$DeviceParams$Builder() {
        super((agzi)CardboardDevice$DeviceParams.DEFAULT_INSTANCE);
    }
    
    public CardboardDevice$DeviceParams$Builder addAllDistortionCoefficients(final Iterable iterable) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).addAllDistortionCoefficients(iterable);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder addAllLeftEyeFieldOfViewAngles(final Iterable iterable) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).addAllLeftEyeFieldOfViewAngles(iterable);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder addDistortionCoefficients(final float n) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).addDistortionCoefficients(n);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder addLeftEyeFieldOfViewAngles(final float n) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).addLeftEyeFieldOfViewAngles(n);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder clearDistortionCoefficients() {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).clearDistortionCoefficients();
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder clearInterLensDistance() {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).clearInterLensDistance();
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder clearLeftEyeFieldOfViewAngles() {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).clearLeftEyeFieldOfViewAngles();
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder clearModel() {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).clearModel();
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder clearPrimaryButton() {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).clearPrimaryButton();
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder clearScreenToLensDistance() {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).clearScreenToLensDistance();
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder clearTrayToLensDistance() {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).clearTrayToLensDistance();
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder clearVendor() {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).clearVendor();
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder clearVerticalAlignment() {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).clearVerticalAlignment();
        return this;
    }
    
    public float getDistortionCoefficients(final int n) {
        return ((CardboardDevice$DeviceParams)this.instance).getDistortionCoefficients(n);
    }
    
    public int getDistortionCoefficientsCount() {
        return ((CardboardDevice$DeviceParams)this.instance).getDistortionCoefficientsCount();
    }
    
    public List getDistortionCoefficientsList() {
        return Collections.unmodifiableList((List<?>)((CardboardDevice$DeviceParams)this.instance).getDistortionCoefficientsList());
    }
    
    public float getInterLensDistance() {
        return ((CardboardDevice$DeviceParams)this.instance).getInterLensDistance();
    }
    
    public float getLeftEyeFieldOfViewAngles(final int n) {
        return ((CardboardDevice$DeviceParams)this.instance).getLeftEyeFieldOfViewAngles(n);
    }
    
    public int getLeftEyeFieldOfViewAnglesCount() {
        return ((CardboardDevice$DeviceParams)this.instance).getLeftEyeFieldOfViewAnglesCount();
    }
    
    public List getLeftEyeFieldOfViewAnglesList() {
        return Collections.unmodifiableList((List<?>)((CardboardDevice$DeviceParams)this.instance).getLeftEyeFieldOfViewAnglesList());
    }
    
    public String getModel() {
        return ((CardboardDevice$DeviceParams)this.instance).getModel();
    }
    
    public agyc getModelBytes() {
        return ((CardboardDevice$DeviceParams)this.instance).getModelBytes();
    }
    
    public CardboardDevice$DeviceParams$ButtonType getPrimaryButton() {
        return ((CardboardDevice$DeviceParams)this.instance).getPrimaryButton();
    }
    
    public float getScreenToLensDistance() {
        return ((CardboardDevice$DeviceParams)this.instance).getScreenToLensDistance();
    }
    
    public float getTrayToLensDistance() {
        return ((CardboardDevice$DeviceParams)this.instance).getTrayToLensDistance();
    }
    
    public String getVendor() {
        return ((CardboardDevice$DeviceParams)this.instance).getVendor();
    }
    
    public agyc getVendorBytes() {
        return ((CardboardDevice$DeviceParams)this.instance).getVendorBytes();
    }
    
    public CardboardDevice$DeviceParams$VerticalAlignmentType getVerticalAlignment() {
        return ((CardboardDevice$DeviceParams)this.instance).getVerticalAlignment();
    }
    
    public boolean hasInterLensDistance() {
        return ((CardboardDevice$DeviceParams)this.instance).hasInterLensDistance();
    }
    
    public boolean hasModel() {
        return ((CardboardDevice$DeviceParams)this.instance).hasModel();
    }
    
    public boolean hasPrimaryButton() {
        return ((CardboardDevice$DeviceParams)this.instance).hasPrimaryButton();
    }
    
    public boolean hasScreenToLensDistance() {
        return ((CardboardDevice$DeviceParams)this.instance).hasScreenToLensDistance();
    }
    
    public boolean hasTrayToLensDistance() {
        return ((CardboardDevice$DeviceParams)this.instance).hasTrayToLensDistance();
    }
    
    public boolean hasVendor() {
        return ((CardboardDevice$DeviceParams)this.instance).hasVendor();
    }
    
    public boolean hasVerticalAlignment() {
        return ((CardboardDevice$DeviceParams)this.instance).hasVerticalAlignment();
    }
    
    public CardboardDevice$DeviceParams$Builder setDistortionCoefficients(final int n, final float n2) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setDistortionCoefficients(n, n2);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setInterLensDistance(final float n) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setInterLensDistance(n);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setLeftEyeFieldOfViewAngles(final int n, final float n2) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setLeftEyeFieldOfViewAngles(n, n2);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setModel(final String s) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setModel(s);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setModelBytes(final agyc agyc) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setModelBytes(agyc);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setPrimaryButton(final CardboardDevice$DeviceParams$ButtonType cardboardDevice$DeviceParams$ButtonType) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setPrimaryButton(cardboardDevice$DeviceParams$ButtonType);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setScreenToLensDistance(final float n) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setScreenToLensDistance(n);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setTrayToLensDistance(final float n) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setTrayToLensDistance(n);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setVendor(final String s) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setVendor(s);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setVendorBytes(final agyc agyc) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setVendorBytes(agyc);
        return this;
    }
    
    public CardboardDevice$DeviceParams$Builder setVerticalAlignment(final CardboardDevice$DeviceParams$VerticalAlignmentType cardboardDevice$DeviceParams$VerticalAlignmentType) {
        this.copyOnWrite();
        ((CardboardDevice$DeviceParams)this.instance).setVerticalAlignment(cardboardDevice$DeviceParams$VerticalAlignmentType);
        return this;
    }
}
