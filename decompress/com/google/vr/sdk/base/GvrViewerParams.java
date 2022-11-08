// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import com.google.vr.sdk.proto.CardboardDevice$DeviceParams$Builder;
import android.net.Uri$Builder;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import android.net.Uri;

public class GvrViewerParams
{
    private static final GvrViewerParams$VerticalAlignmentType CARDBOARD_V1_VERTICAL_ALIGNMENT;
    private static final GvrViewerParams$VerticalAlignmentType CARDBOARD_V2_2_VERTICAL_ALIGNMENT;
    private static final GvrViewerParams DEFAULT_PARAMS;
    private static final Uri URI_ORIGINAL_CARDBOARD_NFC;
    private static final Uri URI_ORIGINAL_CARDBOARD_QR_CODE;
    private Distortion distortion;
    private boolean hasMagnet;
    private float interLensDistance;
    private FieldOfView leftEyeMaxFov;
    private String model;
    private CardboardDevice$DeviceParams originalDeviceProto;
    private float screenToLensDistance;
    private String vendor;
    private GvrViewerParams$VerticalAlignmentType verticalAlignment;
    private float verticalDistanceToLensCenter;
    
    static {
        URI_ORIGINAL_CARDBOARD_NFC = new Uri$Builder().scheme("cardboard").authority("v1.0.0").build();
        URI_ORIGINAL_CARDBOARD_QR_CODE = new Uri$Builder().scheme("http").authority("g.co").appendEncodedPath("cardboard").build();
        CARDBOARD_V2_2_VERTICAL_ALIGNMENT = GvrViewerParams$VerticalAlignmentType.BOTTOM;
        CARDBOARD_V1_VERTICAL_ALIGNMENT = GvrViewerParams$VerticalAlignmentType.BOTTOM;
        DEFAULT_PARAMS = new GvrViewerParams();
    }
    
    public GvrViewerParams() {
        this.setDefaultValues();
    }
    
    public GvrViewerParams(final GvrViewerParams gvrViewerParams) {
        this.copyFrom(gvrViewerParams);
    }
    
    public GvrViewerParams(final CardboardDevice$DeviceParams originalDeviceProto) {
        this.setDefaultValues();
        if (originalDeviceProto == null) {
            return;
        }
        this.originalDeviceProto = originalDeviceProto;
        this.vendor = originalDeviceProto.getVendor();
        this.model = originalDeviceProto.getModel();
        this.interLensDistance = originalDeviceProto.getInterLensDistance();
        this.verticalAlignment = GvrViewerParams$VerticalAlignmentType.fromProtoValue(originalDeviceProto.getVerticalAlignment());
        this.verticalDistanceToLensCenter = originalDeviceProto.getTrayToLensDistance();
        this.screenToLensDistance = originalDeviceProto.getScreenToLensDistance();
        if ((this.leftEyeMaxFov = FieldOfView.parseFromProtobuf(originalDeviceProto.getLeftEyeFieldOfViewAnglesList())) == null) {
            this.leftEyeMaxFov = new FieldOfView();
        }
        if ((this.distortion = Distortion.parseFromProtobuf(originalDeviceProto.getDistortionCoefficientsList())) == null) {
            this.distortion = new Distortion();
        }
        this.hasMagnet = originalDeviceProto.getHasMagnet();
    }
    
    public static GvrViewerParams cardboardV2ViewerParams() {
        final GvrViewerParams gvrViewerParams = new GvrViewerParams();
        gvrViewerParams.setToCardboardV2ViewerParams();
        return gvrViewerParams;
    }
    
    private void copyFrom(final GvrViewerParams gvrViewerParams) {
        this.vendor = gvrViewerParams.vendor;
        this.model = gvrViewerParams.model;
        this.interLensDistance = gvrViewerParams.interLensDistance;
        this.verticalAlignment = gvrViewerParams.verticalAlignment;
        this.verticalDistanceToLensCenter = gvrViewerParams.verticalDistanceToLensCenter;
        this.screenToLensDistance = gvrViewerParams.screenToLensDistance;
        this.leftEyeMaxFov = new FieldOfView(gvrViewerParams.leftEyeMaxFov);
        this.hasMagnet = gvrViewerParams.hasMagnet;
        this.distortion = new Distortion(gvrViewerParams.distortion);
        this.originalDeviceProto = gvrViewerParams.originalDeviceProto;
    }
    
    private void setDefaultValues() {
        this.setToCardboardV2ViewerParams();
        this.vendor = "Google, Inc.";
        this.model = "Default Cardboard";
    }
    
    private void setToCardboardV2ViewerParams() {
        this.vendor = "Google";
        this.model = "Cardboard";
        this.interLensDistance = 0.064f;
        this.verticalAlignment = GvrViewerParams.CARDBOARD_V2_2_VERTICAL_ALIGNMENT;
        this.verticalDistanceToLensCenter = 0.035f;
        this.screenToLensDistance = 0.039f;
        this.leftEyeMaxFov = new FieldOfView();
        this.hasMagnet = false;
        this.distortion = new Distortion();
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = false;
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof GvrViewerParams)) {
            return false;
        }
        final GvrViewerParams gvrViewerParams = (GvrViewerParams)o;
        boolean b2 = b;
        if (this.vendor.equals(gvrViewerParams.vendor)) {
            b2 = b;
            if (this.model.equals(gvrViewerParams.model)) {
                b2 = b;
                if (this.interLensDistance == gvrViewerParams.interLensDistance) {
                    final GvrViewerParams$VerticalAlignmentType verticalAlignment = this.verticalAlignment;
                    b2 = b;
                    if (verticalAlignment == gvrViewerParams.verticalAlignment) {
                        if (verticalAlignment != GvrViewerParams$VerticalAlignmentType.CENTER) {
                            b2 = b;
                            if (this.verticalDistanceToLensCenter != gvrViewerParams.verticalDistanceToLensCenter) {
                                return b2;
                            }
                        }
                        b2 = b;
                        if (this.screenToLensDistance == gvrViewerParams.screenToLensDistance) {
                            b2 = b;
                            if (this.leftEyeMaxFov.equals(gvrViewerParams.leftEyeMaxFov)) {
                                b2 = b;
                                if (this.distortion.equals(gvrViewerParams.distortion)) {
                                    b2 = b;
                                    if (this.hasMagnet == gvrViewerParams.hasMagnet) {
                                        final CardboardDevice$DeviceParams originalDeviceProto = this.originalDeviceProto;
                                        final CardboardDevice$DeviceParams originalDeviceProto2 = gvrViewerParams.originalDeviceProto;
                                        if (originalDeviceProto != originalDeviceProto2) {
                                            b2 = b;
                                            if (originalDeviceProto == null) {
                                                return b2;
                                            }
                                            if (!originalDeviceProto.equals((Object)originalDeviceProto2)) {
                                                return false;
                                            }
                                        }
                                        b2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public byte[] toByteArray() {
        return ((agxl)this.toProtobuf()).toByteArray();
    }
    
    public CardboardDevice$DeviceParams toProtobuf() {
        final CardboardDevice$DeviceParams originalDeviceProto = this.originalDeviceProto;
        CardboardDevice$DeviceParams$Builder builder;
        if (originalDeviceProto != null) {
            builder = (CardboardDevice$DeviceParams$Builder)originalDeviceProto.toBuilder();
        }
        else {
            builder = CardboardDevice$DeviceParams.newBuilder();
        }
        builder.setVendor(this.vendor);
        builder.setModel(this.model);
        builder.setInterLensDistance(this.interLensDistance);
        builder.setVerticalAlignment(this.verticalAlignment.toProtoValue());
        if (this.verticalAlignment == GvrViewerParams$VerticalAlignmentType.CENTER) {
            builder.setTrayToLensDistance(0.035f);
        }
        else {
            builder.setTrayToLensDistance(this.verticalDistanceToLensCenter);
        }
        builder.setScreenToLensDistance(this.screenToLensDistance);
        builder.clearLeftEyeFieldOfViewAngles();
        builder.addAllLeftEyeFieldOfViewAngles(this.leftEyeMaxFov.toProtobufAsList());
        builder.clearDistortionCoefficients();
        builder.addAllDistortionCoefficients(this.distortion.toProtobufAsList());
        if (this.hasMagnet) {
            builder.setHasMagnet(true);
        }
        return (CardboardDevice$DeviceParams)builder.build();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{\n");
        final String vendor = this.vendor;
        final StringBuilder sb2 = new StringBuilder("  vendor: ");
        sb2.append(vendor);
        sb2.append(",\n");
        sb.append(sb2.toString());
        final String model = this.model;
        final StringBuilder sb3 = new StringBuilder("  model: ");
        sb3.append(model);
        sb3.append(",\n");
        sb.append(sb3.toString());
        final float interLensDistance = this.interLensDistance;
        final StringBuilder sb4 = new StringBuilder("  inter_lens_distance: ");
        sb4.append(interLensDistance);
        sb4.append(",\n");
        sb.append(sb4.toString());
        final String value = String.valueOf(this.verticalAlignment);
        final StringBuilder sb5 = new StringBuilder("  vertical_alignment: ");
        sb5.append(value);
        sb5.append(",\n");
        sb.append(sb5.toString());
        final float verticalDistanceToLensCenter = this.verticalDistanceToLensCenter;
        final StringBuilder sb6 = new StringBuilder("  vertical_distance_to_lens_center: ");
        sb6.append(verticalDistanceToLensCenter);
        sb6.append(",\n");
        sb.append(sb6.toString());
        final float screenToLensDistance = this.screenToLensDistance;
        final StringBuilder sb7 = new StringBuilder("  screen_to_lens_distance: ");
        sb7.append(screenToLensDistance);
        sb7.append(",\n");
        sb.append(sb7.toString());
        final String replace = this.leftEyeMaxFov.toString().replace("\n", "\n  ");
        final StringBuilder sb8 = new StringBuilder("  left_eye_max_fov: ");
        sb8.append(replace);
        sb8.append(",\n");
        sb.append(sb8.toString());
        final String replace2 = this.distortion.toString().replace("\n", "\n  ");
        final StringBuilder sb9 = new StringBuilder("  distortion: ");
        sb9.append(replace2);
        sb9.append(",\n");
        sb.append(sb9.toString());
        final boolean hasMagnet = this.hasMagnet;
        final StringBuilder sb10 = new StringBuilder("  magnet: ");
        sb10.append(hasMagnet);
        sb10.append(",\n");
        sb.append(sb10.toString());
        sb.append("}\n");
        return sb.toString();
    }
}
