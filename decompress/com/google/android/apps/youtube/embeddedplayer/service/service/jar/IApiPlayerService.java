// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.view.KeyEvent;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import android.os.IInterface;

public interface IApiPlayerService extends IInterface
{
    void A(final EmbedsPrewarmData p0);
    
    void B(final boolean p0);
    
    void D(final CommandWrapper p0);
    
    void E(final int p0);
    
    void F(final int p0);
    
    void G(final boolean p0);
    
    void H(final boolean p0);
    
    void I(final boolean p0);
    
    void J();
    
    void K(final String p0);
    
    void L();
    
    void M();
    
    void N();
    
    boolean O();
    
    boolean P(final byte[] p0);
    
    byte[] Q();
    
    byte[] R();
    
    d a();
    
    c b();
    
    com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d();
    
    com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e();
    
    void f();
    
    void g();
    
    void h(final String p0, final int p1, final int p2, final int p3);
    
    void i(final String p0, final int p1, final int p2);
    
    void j(final List p0, final int p1, final int p2, final int p3);
    
    void k(final boolean p0);
    
    void l(final String p0);
    
    void m();
    
    void n();
    
    void o(final String p0, final int p1, final int p2, final boolean p3, final int p4);
    
    void p(final String p0, final boolean p1, final int p2, final boolean p3, final int p4);
    
    void q(final List p0, final int p1, final int p2, final boolean p3, final int p4);
    
    void r();
    
    void s(final VisibilityChangeEventData p0);
    
    void t(final byte[] p0);
    
    void u(final int p0, final KeyEvent p1);
    
    void v(final int p0, final KeyEvent p1);
    
    void w();
    
    void x();
    
    void y();
    
    void z();
}
