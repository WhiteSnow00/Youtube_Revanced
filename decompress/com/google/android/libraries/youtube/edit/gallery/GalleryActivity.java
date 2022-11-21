// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.gallery;

import android.view.MenuItem;
import java.util.concurrent.Callable;
import android.content.Context;
import com.google.protos.youtube.api.innertube.CameraEndpointOuterClass;
import android.os.Bundle;
import android.net.Uri;
import android.content.Intent;
import com.google.protobuf.ExtensionRegistryLite;
import android.hardware.Camera;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import android.os.Handler;

public class GalleryActivity extends usn implements usj, acwj
{
    public static final long a;
    public static final tui b;
    public xbh c;
    public adlq d;
    public Handler e;
    public afxj f;
    public umg g;
    public usk h;
    public acwk i;
    public boolean j;
    public boolean k;
    public acwi l;
    public arzb m;
    private aisc o;
    private PermissionDescriptor[] p;
    private int q;
    private int r;
    private boolean s;
    private String t;
    
    static {
        a = TimeUnit.DAYS.toSeconds(7L);
        b = (tui)sus.p;
    }
    
    public GalleryActivity() {
        this.j = true;
        this.k = false;
        this.s = false;
    }
    
    public static boolean f() {
        return Camera.getNumberOfCameras() > 0;
    }
    
    private final alji h() {
        final ahcr builder = ((ahcz)alji.a).createBuilder();
        final ahcr builder2 = ((ahcz)alkp.a).createBuilder();
        final String t = this.t;
        builder2.copyOnWrite();
        final alkp alkp = (alkp)builder2.instance;
        t.getClass();
        alkp.b |= 0x1;
        alkp.c = t;
        builder.bg(builder2);
        return (alji)builder.build();
    }
    
    private final void i() {
        final usk h = this.h;
        if (h != null) {
            h.c = null;
            this.h = null;
        }
    }
    
    private final void j(final br br) {
        final ct i = ((bu)this).getSupportFragmentManager().i();
        i.A(2131429106, br);
        i.a();
    }
    
    private final void k() {
        if (this.h == null) {
            this.h = new usk();
        }
        final usk h = this.h;
        h.c = (usj)this;
        h.ai = this.h();
    }
    
    private final void l() {
        if (this.i == null) {
            final acwi l = this.l;
            l.e(this.p);
            l.f = xbf.b(18635);
            l.g = xbf.c(18638);
            l.h = xbf.c(18636);
            l.i = xbf.c(18637);
            l.b(this.q);
            l.c(this.r);
            this.i = this.l.a();
        }
        this.i.aK((acwj)this);
        this.i.s(this.h());
    }
    
    public final aisc a() {
        Label_0046: {
            if (this.o != null) {
                break Label_0046;
            }
            final Intent intent = this.getIntent();
            if (intent == null) {
                break Label_0046;
            }
            final byte[] byteArrayExtra = intent.getByteArrayExtra("navigation_endpoint");
            if (byteArrayExtra == null) {
                break Label_0046;
            }
            try {
                this.o = (aisc)ahcz.parseFrom((ahcz)aisc.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry());
                return this.o;
            }
            catch (final ahds ahds) {
                return this.o;
            }
        }
    }
    
    public final void aM() {
        this.finish();
    }
    
    public final void aN() {
        this.e.post((Runnable)new usc(this, 2));
    }
    
    public final void b() {
        this.finish();
    }
    
    public final void d(final Uri uri, final boolean b) {
        if (uri != null) {
            final Bundle bundle = new Bundle();
            final aisc a = this.a();
            int n2;
            final int n = n2 = 902;
            if (a != null) {
                n2 = n;
                if (((ahcu)a).ry((ahci)CameraEndpointOuterClass.cameraEndpoint)) {
                    n2 = n;
                    if ((((aifr)((ahcu)a).rx((ahci)CameraEndpointOuterClass.cameraEndpoint)).b & 0x4) != 0x0) {
                        bundle.putBoolean("video_show_metadata", false);
                        bundle.putBoolean("navigate_to_my_uploads", false);
                        final aisc a2 = this.a();
                        int b2;
                        final int n3 = b2 = -1;
                        if (a2 != null) {
                            if (!((ahcu)a2).ry((ahci)CameraEndpointOuterClass.cameraEndpoint)) {
                                b2 = n3;
                            }
                            else {
                                final aifr aifr = (aifr)((ahcu)a2).rx((ahci)CameraEndpointOuterClass.cameraEndpoint);
                                b2 = n3;
                                if ((aifr.b & 0x4) != 0x0) {
                                    apmz apmz;
                                    if ((apmz = aifr.d) == null) {
                                        apmz = apmz.a;
                                    }
                                    b2 = apmz.b;
                                }
                            }
                        }
                        bundle.putInt("video_time_limit_seconds", b2);
                        n2 = 1800;
                    }
                }
            }
            apke apke;
            if (b) {
                apke = apke.d;
            }
            else {
                apke = apke.b;
            }
            bundle.putInt("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", apke.k);
            final Intent intent = new Intent("com.google.android.youtube.intent.action.INTERNAL_UPLOAD");
            intent.setDataAndType(uri, "video/*");
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id", this.t);
            apkz apkz;
            if ((apkz = this.m.f().h) == null) {
                apkz = apkz.a;
            }
            intent.putExtra("navigate_to_my_uploads", apkz.u ^ true);
            intent.putExtras(bundle);
            ((qu)this).startActivityForResult(intent, n2);
        }
    }
    
    public final void e() {
        adme.T(this.h == null);
        this.k();
        final Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            this.h.o(extras.getString("extra_gallery_secondary_action_class"));
        }
        this.setRequestedOrientation(-1);
        this.j((br)this.h);
        final acwk i = this.i;
        if (i != null) {
            i.aK((acwj)null);
            this.i = null;
        }
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        if (intent != null && intent.getBooleanExtra("close_gallery_on_successful_upload", false) && n2 == -1) {
            this.setResult(-1, intent);
            this.finish();
            return;
        }
        int n3;
        if ((n3 = n) == 902) {
            if (n2 == 0 && this.j) {
                if (!this.s && this.h != null) {
                    this.i();
                    this.k = true;
                }
                return;
            }
            n3 = 902;
        }
        super.onActivityResult(n3, n2, intent);
    }
    
    public final void onBackPressed() {
        final acwk i = this.i;
        if (i != null) {
            i.r();
            return;
        }
        final usk h = this.h;
        if (h != null) {
            if (!h.af) {
                h.d();
            }
            return;
        }
        super.onBackPressed();
    }
    
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((qu)this).setContentView(2131624483);
        if (bundle != null) {
            final Bundle bundle2 = bundle.getBundle("interaction_bundle");
            this.t = bundle.getString("frontend_upload_id");
            bundle = bundle2;
        }
        else {
            bundle = null;
        }
        this.c.M(bundle, this.a());
        if (this.t == null) {
            final aisc a = this.a();
            String e = null;
            Label_0111: {
                if (a != null && ((ahcu)a).ry((ahci)CameraEndpointOuterClass.cameraEndpoint)) {
                    final aifr aifr = (aifr)((ahcu)a).rx((ahci)CameraEndpointOuterClass.cameraEndpoint);
                    if ((aifr.b & 0x10) != 0x0) {
                        e = aifr.e;
                        break Label_0111;
                    }
                }
                e = null;
            }
            if (e != null) {
                this.t = this.d.y(apkb.b, e, null);
            }
            else {
                this.t = this.d.x(apkb.b, null);
            }
        }
        this.p = new PermissionDescriptor[] { new PermissionDescriptor(0, xbf.c(18642), xbf.c(18643)) };
        int q;
        if (!acwc.j((Context)this)) {
            q = 2132018084;
        }
        else {
            q = 2132018085;
        }
        this.q = q;
        int r;
        if (!acwc.j((Context)this)) {
            r = 2132018088;
        }
        else {
            r = 2132018089;
        }
        this.r = r;
        final br e2 = ((bu)this).getSupportFragmentManager().e(2131429106);
        if (e2 instanceof acwk) {
            this.i = (acwk)e2;
            this.l();
        }
        else if (e2 instanceof usk) {
            this.h = (usk)e2;
            this.k();
        }
        if (acwc.f((Context)this, this.p)) {
            if (this.i == null) {
                adme.T(true);
                this.l();
                this.setRequestedOrientation(-1);
                this.j((br)this.i);
                this.i();
            }
        }
        else if (this.h == null) {
            this.e();
        }
        this.s = true;
        tfx.n((aup)this, this.f.rz((Callable)new ush(this.g)), GalleryActivity.b, (tui)tfx.b);
    }
    
    public final void onDestroy() {
        super.onDestroy();
        if (this.isFinishing()) {
            final String t = this.t;
            if (t != null) {
                this.d.d(t, apkg.l);
            }
        }
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ((qu)this).onBackPressed();
        return true;
    }
    
    public final void onPause() {
        super.onPause();
        this.j = true;
        this.s = false;
    }
    
    public final void onResume() {
        super.onResume();
        this.j = false;
        if (this.k) {
            if (this.h == null) {
                this.e();
            }
            this.k = false;
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("interaction_bundle", this.c.L());
        bundle.putString("frontend_upload_id", this.t);
    }
}
