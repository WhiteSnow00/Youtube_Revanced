import com.google.protos.youtube.api.innertube.PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint;
import android.content.Intent;
import com.google.android.libraries.accountlinking.LinkResponse;
import android.net.Uri;
import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.libraries.youtube.metadataeditor.thumbnail.ShortsEditThumbnailController;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl;
import com.google.android.libraries.youtube.account.verification.controller.PhoneVerificationController;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import com.google.android.apps.youtube.app.settings.offline.SmartDownloadsPrefsFragment;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.apps.youtube.app.extensions.lens.OpenLensForFrameController;
import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtz implements rd
{
    public final Object a;
    private final int b;
    
    public gtz(final GalFlowActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gtz(final OpenLensForFrameController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gtz(final OfflinePrefsFragment a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gtz(final SmartDownloadsPrefsFragment a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gtz(final DevicePhotosFragment a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gtz(final PhoneVerificationController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gtz(final TvSignInControllerImpl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gtz(final ShortsEditThumbnailController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gtz(final jns a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gtz(final joo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gtz(final zgm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gtz(final zgu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(Object o) {
        switch (this.b) {
            default: {
                final Object a = this.a;
                final ActivityResult activityResult = (ActivityResult)o;
                if (activityResult.a == 1) {
                    final Intent b = activityResult.b;
                    b.getClass();
                    final Bundle bundleExtra = b.getBundleExtra("shorts_edit_thumbnail_activity_state_key");
                    bundleExtra.getClass();
                    final ShortsEditThumbnailController shortsEditThumbnailController = (ShortsEditThumbnailController)a;
                    shortsEditThumbnailController.f = bundleExtra;
                    final String stringExtra = b.getStringExtra("shorts_edit_thumbnail_thumbnail_path_key");
                    stringExtra.getClass();
                    shortsEditThumbnailController.g = stringExtra;
                    return;
                }
                break;
            }
            case 13: {
                final Object a2 = this.a;
                final ActivityResult activityResult2 = (ActivityResult)o;
                final int a3 = activityResult2.a;
                if (a3 != -1) {
                    if (a3 == 0) {
                        final bu od = ((zgu)a2).od();
                        od.getClass();
                        od.getSupportFragmentManager().N("imagePickerBackPressed", new Bundle());
                    }
                }
                else {
                    final Intent b2 = activityResult2.b;
                    if (b2 != null) {
                        final Uri data = b2.getData();
                        if (data != null) {
                            final Bundle bundle = new Bundle();
                            bundle.putString("imageSelectedKey", data.toString());
                            final bu od2 = ((zgu)a2).od();
                            od2.getClass();
                            od2.getSupportFragmentManager().N("imageSelected", bundle);
                        }
                    }
                }
                return;
            }
            case 12: {
                final Object a4 = this.a;
                final ActivityResult activityResult3 = (ActivityResult)o;
                if (activityResult3.a != -1) {
                    return;
                }
                final Intent b3 = activityResult3.b;
                final zgm zgm = (zgm)a4;
                if (zgm.ag.n(b3.getData())) {
                    zgm.ap.v(b3.getData());
                    return;
                }
                tpe.x(zgm.ai, 2132018439, 1);
                return;
            }
            case 11: {
                final Object a5 = this.a;
                final ActivityResult activityResult4 = (ActivityResult)o;
                final int a6 = activityResult4.a;
                final Intent b4 = activityResult4.b;
                if (a6 == -1) {
                    final int intExtra = b4.getIntExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyExitType", 2);
                    Optional optional = Optional.empty();
                    if (b4.hasExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyLoungeDeviceId")) {
                        optional = optional;
                        if (b4.getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyLoungeDeviceId") != null) {
                            optional = Optional.of((Object)new xiz(b4.getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyLoungeDeviceId")));
                        }
                    }
                    final int intExtra2 = b4.getIntExtra("com.google.android.libraries.youtube.mdx.tvsignin.requestType", -1);
                    if (intExtra != 0) {
                        if (intExtra != 1) {
                            if (intExtra == 2) {
                                if (TextUtils.isEmpty((CharSequence)b4.getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyError"))) {
                                    ((TvSignInControllerImpl)a5).e.getString(2132018631);
                                }
                                final xrm m = ((TvSignInControllerImpl)a5).m;
                                m.a(((Context)m.a).getString(2132018631), 36388);
                            }
                        }
                        else {
                            final xrm i = ((TvSignInControllerImpl)a5).m;
                            i.a(((Context)i.a).getString(2132018629), 36388);
                        }
                    }
                    else {
                        final TvSignInControllerImpl tvSignInControllerImpl = (TvSignInControllerImpl)a5;
                        final xrm j = tvSignInControllerImpl.m;
                        j.a(((Context)j.a).getString(2132018630), 36389);
                        final afke k = ((afjg)tvSignInControllerImpl.f).k();
                        while (k.hasNext()) {
                            ((xrk)k.next()).m(optional, intExtra2);
                        }
                    }
                }
                else if (a6 == 0) {
                    ((TvSignInControllerImpl)a5).i = true;
                }
                ((TvSignInControllerImpl)a5).h = null;
                return;
            }
            case 10: {
                final Object a7 = this.a;
                final int intValue = (int)o;
                if (intValue != -2) {
                    if (intValue != -1) {
                        if (intValue != 0) {
                            if (intValue == 1) {
                                final PhoneVerificationController phoneVerificationController = (PhoneVerificationController)a7;
                                final PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint c = phoneVerificationController.c;
                                if (c != null && (c.b & 0x8) != 0x0) {
                                    final vcy a8 = phoneVerificationController.a;
                                    aiqj aiqj;
                                    if ((aiqj = c.d) == null) {
                                        aiqj = aiqj.a;
                                    }
                                    a8.a(aiqj);
                                }
                            }
                        }
                        else {
                            final PhoneVerificationController phoneVerificationController2 = (PhoneVerificationController)a7;
                            final PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint c2 = phoneVerificationController2.c;
                            if (c2 != null && (c2.b & 0x20) != 0x0) {
                                final vcy a9 = phoneVerificationController2.a;
                                aiqj aiqj2;
                                if ((aiqj2 = c2.f) == null) {
                                    aiqj2 = aiqj.a;
                                }
                                a9.a(aiqj2);
                            }
                        }
                    }
                    else {
                        final PhoneVerificationController phoneVerificationController3 = (PhoneVerificationController)a7;
                        final PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint c3 = phoneVerificationController3.c;
                        if (c3 != null && (c3.b & 0x10) != 0x0) {
                            final vcy a10 = phoneVerificationController3.a;
                            aiqj aiqj3;
                            if ((aiqj3 = c3.e) == null) {
                                aiqj3 = aiqj.a;
                            }
                            a10.a(aiqj3);
                        }
                    }
                    return;
                }
                ttr.b("Could not determine phone verification result from the activity result.");
                return;
            }
            case 9: {
                final Object a11 = this.a;
                if (o) {
                    final DevicePhotosFragment devicePhotosFragment = (DevicePhotosFragment)a11;
                    devicePhotosFragment.q(0);
                    if (arrm.a.c().p()) {
                        devicePhotosFragment.ag = (aezp)aeyo.a;
                    }
                    devicePhotosFragment.p();
                    return;
                }
                final DevicePhotosFragment devicePhotosFragment2 = (DevicePhotosFragment)a11;
                if (devicePhotosFragment2.ax("android.permission.READ_EXTERNAL_STORAGE")) {
                    devicePhotosFragment2.q(1);
                    return;
                }
                devicePhotosFragment2.q(2);
                return;
            }
            case 8: {
                final Object a12 = this.a;
                if (((ActivityResult)o).a == -1) {
                    final DevicePhotosFragment devicePhotosFragment3 = (DevicePhotosFragment)a12;
                    if (devicePhotosFragment3.al.h()) {
                        devicePhotosFragment3.e.a = aqvt.g;
                        devicePhotosFragment3.b.l((Uri)devicePhotosFragment3.al.c());
                    }
                }
                return;
            }
            case 7: {
                final Object a13 = this.a;
                if (o) {
                    final DevicePhotosFragment devicePhotosFragment4 = (DevicePhotosFragment)a13;
                    final que ae = devicePhotosFragment4.ae;
                    final ahaz builder = ((ahbh)agsp.a).createBuilder();
                    builder.copyOnWrite();
                    final agsp agsp = (agsp)builder.instance;
                    agsp.c = 122;
                    agsp.b |= 0x1;
                    ae.a((agsp)builder.build());
                    devicePhotosFragment4.a();
                    return;
                }
                final DevicePhotosFragment devicePhotosFragment5 = (DevicePhotosFragment)a13;
                if (devicePhotosFragment5.ax("android.permission.CAMERA")) {
                    final que ae2 = devicePhotosFragment5.ae;
                    final ahaz builder2 = ((ahbh)agsp.a).createBuilder();
                    builder2.copyOnWrite();
                    final agsp agsp2 = (agsp)builder2.instance;
                    agsp2.c = 123;
                    agsp2.b |= 0x1;
                    ae2.a((agsp)builder2.build());
                    return;
                }
                final que ae3 = devicePhotosFragment5.ae;
                final ahaz builder3 = ((ahbh)agsp.a).createBuilder();
                builder3.copyOnWrite();
                final agsp agsp3 = (agsp)builder3.instance;
                agsp3.c = 124;
                agsp3.b |= 0x1;
                ae3.a((agsp)builder3.build());
                devicePhotosFragment5.ak.show();
                return;
            }
            case 6: {
                final Object a14 = this.a;
                final ActivityResult activityResult5 = (ActivityResult)o;
                if (activityResult5.a == -1) {
                    final DevicePhotosFragment devicePhotosFragment6 = (DevicePhotosFragment)a14;
                    devicePhotosFragment6.e.a = aqvt.h;
                    devicePhotosFragment6.b.l(activityResult5.b.getData());
                }
                return;
            }
            case 5: {
                final Object a15 = this.a;
                final ActivityResult activityResult6 = (ActivityResult)o;
                final SmartDownloadsPrefsFragment smartDownloadsPrefsFragment = (SmartDownloadsPrefsFragment)a15;
                smartDownloadsPrefsFragment.c.f(smartDownloadsPrefsFragment.ae, activityResult6, smartDownloadsPrefsFragment.nZ());
                return;
            }
            case 4: {
                final Object a16 = this.a;
                if (((ActivityResult)o).a == 2) {
                    ((joo)a16).a.finish();
                }
                return;
            }
            case 3: {
                final Object a17 = this.a;
                final ActivityResult activityResult7 = (ActivityResult)o;
                final OfflinePrefsFragment offlinePrefsFragment = (OfflinePrefsFragment)a17;
                offlinePrefsFragment.ax.f(offlinePrefsFragment.aF, activityResult7, offlinePrefsFragment.nZ());
                return;
            }
            case 2: {
                final Object a18 = this.a;
                final int a19 = ((ActivityResult)o).a;
                final jns jns = (jns)a18;
                if (a19 == -1) {
                    jns.p();
                    return;
                }
                jns.e();
                return;
            }
            case 1: {
                final Object a20 = this.a;
                final ActivityResult activityResult8 = (ActivityResult)o;
                final GalFlowActivity galFlowActivity = (GalFlowActivity)a20;
                final gqh a21 = galFlowActivity.a;
                gqg gqg = null;
                Label_1620: {
                    Label_1616: {
                        try {
                            final int a22 = activityResult8.a;
                            final Intent b5 = activityResult8.b;
                            if (a22 == -1) {
                                if (b5.hasExtra("link_response")) {
                                    if (((LinkResponse)b5.getParcelableExtra("link_response")).a) {
                                        gqg = gqg.c;
                                        break Label_1620;
                                    }
                                    break Label_1616;
                                }
                            }
                            else if (a22 == -2 && b5.hasExtra("error_type") && b5.hasExtra("message")) {
                                o = new npj(b5.getIntExtra("error_type", 0), b5.getStringExtra("message"));
                                throw o;
                            }
                            o = new npj(1, "Invalid activity result");
                            throw o;
                        }
                        catch (final npj npj) {
                            if (npj.a == 4) {
                                gqg = gqg.d;
                                break Label_1620;
                            }
                            ttr.d("Unable to get link response.", (Throwable)npj);
                        }
                    }
                    gqg = gqg.e;
                }
                a21.a(galFlowActivity, gqg);
                return;
            }
            case 0: {
                final Object a23 = this.a;
                final ActivityResult activityResult9 = (ActivityResult)o;
                if (activityResult9.a == -1) {
                    final wxx d = ((OpenLensForFrameController)a23).d;
                    final aknr d2 = aknt.d();
                    final alnn a24 = alno.a();
                    final alnp b6 = alnp.b;
                    ((ahaz)a24).copyOnWrite();
                    alno.c((alno)a24.instance, b6);
                    final alno alno = (alno)((ahaz)a24).build();
                    ((ahaz)d2).copyOnWrite();
                    aknt.z((aknt)d2.instance, alno);
                    d.d((aknt)((ahaz)d2).build());
                    return;
                }
                String.valueOf(activityResult9);
                ((OpenLensForFrameController)a23).i(alnp.g);
                break;
            }
        }
    }
}
