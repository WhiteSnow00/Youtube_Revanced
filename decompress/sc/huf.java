import android.os.Bundle;
import android.content.Intent;
import java.util.List;
import android.text.TextUtils;
import java.util.ArrayList;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class huf implements Runnable
{
    public final UploadActivity a;
    public final alvj b;
    
    public huf(final UploadActivity a, final alvj b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final UploadActivity a = this.a;
        final alvj b = this.b;
        aplf c;
        if (a.s.p) {
            c = a.n.c();
        }
        else {
            c = null;
        }
        final ahaz builder = ((ahbh)apgy.a).createBuilder();
        final ArrayList list = new ArrayList();
        final Intent intent = a.getIntent();
        final int n = 0;
        boolean i;
        int n3;
        if (intent != null) {
            final Bundle extras = a.getIntent().getExtras();
            boolean b2;
            if (extras != null) {
                final String string = extras.getString("android.intent.extra.TITLE");
                if (string != null) {
                    final ahaz builder2 = ((ahbh)alkt.a).createBuilder();
                    builder2.copyOnWrite();
                    final alkt alkt = (alkt)builder2.instance;
                    alkt.b |= 0x1;
                    alkt.e = "android.intent.extra.TITLE";
                    builder2.copyOnWrite();
                    final alkt alkt2 = (alkt)builder2.instance;
                    alkt2.c = 2;
                    alkt2.d = string;
                    list.add(builder2.build());
                }
                final String string2 = extras.getString("android.intent.extra.SUBJECT");
                if (string2 != null) {
                    final ahaz builder3 = ((ahbh)alkt.a).createBuilder();
                    builder3.copyOnWrite();
                    final alkt alkt3 = (alkt)builder3.instance;
                    alkt3.b |= 0x1;
                    alkt3.e = "android.intent.extra.SUBJECT";
                    builder3.copyOnWrite();
                    final alkt alkt4 = (alkt)builder3.instance;
                    alkt4.c = 2;
                    alkt4.d = string2;
                    list.add(builder3.build());
                }
                final String string3 = extras.getString("android.intent.extra.TEXT");
                if (string3 != null) {
                    final ahaz builder4 = ((ahbh)alkt.a).createBuilder();
                    builder4.copyOnWrite();
                    final alkt alkt5 = (alkt)builder4.instance;
                    alkt5.b |= 0x1;
                    alkt5.e = "android.intent.extra.TEXT";
                    builder4.copyOnWrite();
                    final alkt alkt6 = (alkt)builder4.instance;
                    alkt6.c = 2;
                    alkt6.d = string3;
                    list.add(builder4.build());
                }
                final ahaz builder5 = ((ahbh)alkt.a).createBuilder();
                builder5.copyOnWrite();
                final alkt alkt7 = (alkt)builder5.instance;
                alkt7.b |= 0x1;
                alkt7.e = "hide_video_preview_key";
                final String string4 = Boolean.toString(a.C.i(a.getIntent()));
                builder5.copyOnWrite();
                final alkt alkt8 = (alkt)builder5.instance;
                string4.getClass();
                alkt8.c = 2;
                alkt8.d = string4;
                list.add(builder5.build());
                final boolean boolean1 = extras.getBoolean("com.google.android.libraries.youtube.upload.extra_upload_activity_presumed_shorts_eligibility", false);
                final String string5 = extras.getString("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_title");
                b2 = boolean1;
                if (string5 != null) {
                    adns adns2;
                    if (a.ao.h()) {
                        final ahaz builder6 = ((ahbh)a.ao.c()).toBuilder();
                        builder6.copyOnWrite();
                        final adns adns = (adns)builder6.instance;
                        adns.b |= 0x2;
                        adns.c = string5;
                        adns2 = (adns)builder6.build();
                    }
                    else {
                        final ahaz builder7 = ((ahbh)adns.a).createBuilder();
                        builder7.copyOnWrite();
                        final adns adns3 = (adns)builder7.instance;
                        adns3.b |= 0x2;
                        adns3.c = string5;
                        adns2 = (adns)builder7.build();
                    }
                    a.ao = aezp.k((Object)adns2);
                    b2 = boolean1;
                }
            }
            else {
                b2 = false;
            }
            int n2;
            if (adjx.k(intent) == 7) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            if (adjx.f(intent)) {
                builder.copyOnWrite();
                final apgy apgy = (apgy)builder.instance;
                apgy.b |= 0x2;
                apgy.d = true;
            }
            i = b2;
            n3 = n2;
            if (!TextUtils.isEmpty((CharSequence)a.ap)) {
                final String ap = a.ap;
                builder.copyOnWrite();
                final apgy apgy2 = (apgy)builder.instance;
                ap.getClass();
                apgy2.b |= 0x1;
                apgy2.c = ap;
                i = b2;
                n3 = n2;
            }
        }
        else {
            i = false;
            n3 = 2;
        }
        final glx am = a.am;
        final glx a2 = glx.a;
        final rlv a3 = rlv.a;
        final int ordinal = am.ordinal();
        int n4;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    n4 = n;
                }
                else {
                    n4 = 1;
                }
            }
            else {
                n4 = 3;
            }
        }
        else {
            n4 = 2;
        }
        final adlm t = a.t;
        final fch fch = new fch(a, 7);
        final apgy j = (apgy)builder.build();
        final aezp ao = a.ao;
        final vml f = t.f;
        final ahaz builder8 = alcz.a.createBuilder();
        if (c != null) {
            builder8.copyOnWrite();
            final alcz alcz = (alcz)builder8.instance;
            alcz.d = c;
            alcz.b |= 0x2;
        }
        if (b != null) {
            builder8.copyOnWrite();
            final alcz alcz2 = (alcz)builder8.instance;
            alcz2.e = b;
            alcz2.b |= 0x8;
        }
        builder8.copyOnWrite();
        final alcz alcz3 = (alcz)builder8.instance;
        final ahbx f2 = alcz3.f;
        if (!f2.c()) {
            alcz3.f = ahbh.mutableCopy(f2);
        }
        agzk.addAll((Iterable)list, (List)alcz3.f);
        if (n4 != 0) {
            builder8.copyOnWrite();
            final alcz alcz4 = (alcz)builder8.instance;
            alcz4.g = n4 - 1;
            alcz4.b |= 0x10;
        }
        if (j != null) {
            builder8.copyOnWrite();
            final alcz alcz5 = (alcz)builder8.instance;
            alcz5.j = j;
            alcz5.b |= 0x80;
        }
        if (ao.h()) {
            final ahaz builder9 = alcy.a.createBuilder();
            if ((((adns)ao.c()).b & 0x2) != 0x0) {
                final String c2 = ((adns)ao.c()).c;
                builder9.copyOnWrite();
                final alcy alcy = (alcy)builder9.instance;
                c2.getClass();
                alcy.b |= 0x1;
                alcy.c = c2;
            }
            final alcy l = (alcy)builder9.build();
            builder8.copyOnWrite();
            final alcz alcz6 = (alcz)builder8.instance;
            l.getClass();
            alcz6.l = l;
            alcz6.b |= 0x200;
        }
        builder8.copyOnWrite();
        final alcz alcz7 = (alcz)builder8.instance;
        alcz7.h = n3 - 1;
        alcz7.b |= 0x20;
        builder8.copyOnWrite();
        final alcz alcz8 = (alcz)builder8.instance;
        alcz8.b |= 0x40;
        alcz8.i = i;
        builder8.copyOnWrite();
        final alcz alcz9 = (alcz)builder8.instance;
        alcz9.b |= 0x100;
        alcz9.k = true;
        final adlg adlg = new adlg(t.c, t.d.c(), (alcz)builder8.build(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((vkk)adlg).k(vap.b);
        f.e((vls)adlg, (zpf)fch);
    }
}
