// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.bottomsheet;

import java.util.concurrent.atomic.AtomicReference;
import com.google.protobuf.MessageLite;
import java.util.List;
import android.content.Context;
import j$.util.Optional;
import java.util.Set;
import android.view.View;

public class PlayerOverflowBottomSheetController implements kti, tfh
{
    public ameo a;
    private final bu b;
    private final atjj c;
    private final abns d;
    private asic e;
    private final uyi f;
    private final hdv g;
    
    public PlayerOverflowBottomSheetController(final bu b, final atjj c, final abns d, final uyi f, final hdv g, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = g;
    }
    
    public final void k(final View view, final Set set) {
        if (((dh)this.b).getLifecycle().a().a(aug.e)) {
            final String s = ((abno)this.c.a()).s();
            if (acqn.g((Context)this.b, Optional.of((Object)this.f))) {
                final hdv g = this.g;
                final ameo a = this.a;
                final Context context = (Context)((atjj)g.c).a();
                context.getClass();
                final kuf kuf = (kuf)((atjj)g.a).a();
                kuf.getClass();
                final aeim aeim = (aeim)((atjj)g.b).a();
                aeim.getClass();
                view.getClass();
                final kub a2 = new kub(context, kuf, aeim, view, s, a, set, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                a2.b.g = this.f.aM();
                final kue a3 = a2.a;
                a3.a = (kud)a2;
                a3.h();
                a2.b.e();
                return;
            }
            final ameo a4 = this.a;
            final agza builder = ((agzi)kuj.a).createBuilder();
            if (s != null) {
                builder.copyOnWrite();
                final kuj kuj = (kuj)builder.instance;
                kuj.b |= 0x2;
                kuj.e = s;
            }
            if (set != null) {
                builder.copyOnWrite();
                final kuj kuj2 = (kuj)builder.instance;
                final agzq c = kuj2.c;
                if (!c.c()) {
                    kuj2.c = agzi.mutableCopy(c);
                }
                agxl.addAll((Iterable)set, (List)kuj2.c);
            }
            if (a4 != null) {
                builder.copyOnWrite();
                final kuj kuj3 = (kuj)builder.instance;
                kuj3.d = a4;
                kuj3.b |= 0x1;
            }
            final kuj kuj4 = (kuj)builder.build();
            final kug kug = new kug();
            arin.g((br)kug);
            aenu.b((br)kug, (MessageLite)kuj4);
            ((acqj)kug).at = 400;
            ((acqj)kug).aA = true;
            kug.be();
            kug.r(this.b.getSupportFragmentManager(), (String)null);
        }
    }
    
    public final void oS(final aum aum) {
        asic e;
        if (((uyi)this.d.cd().h).bx()) {
            e = this.d.R().am((asix)new kuc(this, 2), (asix)kul.a);
        }
        else {
            e = this.d.Q().R().P(ashw.a()).am((asix)new kuc(this, 2), (asix)kul.a);
        }
        this.e = e;
    }
    
    public final void oW(final aum aum) {
        final asic e = this.e;
        if (e != null) {
            athh.f((AtomicReference)e);
            this.e = null;
        }
    }
}
