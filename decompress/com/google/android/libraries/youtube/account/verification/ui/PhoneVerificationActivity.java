// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.account.verification.ui;

import android.os.Parcelable;
import android.content.Intent;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import com.google.protobuf.ExtensionRegistryLite;
import android.os.Bundle;

public class PhoneVerificationActivity extends rnp
{
    public vcy b;
    public atke c;
    public tvr d;
    public vai e;
    
    public final void onBackPressed() {
        if (this.e.l(45384568L).aM()) {
            final rob rob = (rob)((bu)this).getSupportFragmentManager().f("verification_fragment_tag");
            if (rob != null) {
                rob.aM();
            }
            return;
        }
        ((rob)this.c.a()).aM();
    }
    
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((fa)this).setTheme(this.d.a);
        ((qt)this).setContentView(2131624982);
        if (bundle == null && this.getIntent().hasExtra("PHONE_VERIFICATION_COMMAND")) {
            try {
                final Intent intent = this.getIntent();
                final aiqj a = aiqj.a;
                final ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                final Parcelable parcelableExtra = intent.getParcelableExtra("PHONE_VERIFICATION_COMMAND");
                ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
                if (parcelableExtra instanceof Bundle) {
                    bundle = (Bundle)parcelableExtra;
                    bundle.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
                    protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse)bundle.getParcelable("protoparsers");
                }
                else {
                    protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse)parcelableExtra;
                }
                this.b.a((aiqj)adyf.au(protoParsers$InternalDontUse, (MessageLite)a, generatedRegistry));
            }
            catch (final ahca ahca) {
                ttr.d("Failed to parse command from intent", (Throwable)ahca);
            }
        }
    }
}
