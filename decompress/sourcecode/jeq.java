import android.view.Window;
import android.app.Dialog;
import java.util.concurrent.Executor;
import android.content.Context;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jeq extends jeo implements jee, wwu, abyw
{
    public ttn ae;
    public wwv af;
    public kzl ag;
    public aeby ah;
    private jef ai;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        final LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout)layoutInflater.inflate(2131625603, viewGroup, false);
        final kzl ag = this.ag;
        final Object b = ag.b;
        final tny tny = (tny)((atjj)ag.g).a();
        tny.getClass();
        final Context context = (Context)((atjj)ag.e).a();
        context.getClass();
        final Executor executor = (Executor)((atjj)ag.d).a();
        executor.getClass();
        final zhb zhb = (zhb)((atjj)ag.a).a();
        zhb.getClass();
        final acno acno = (acno)((atjj)ag.j).a();
        acno.getClass();
        final acpn acpn = (acpn)((atjj)ag.i).a();
        acpn.getClass();
        final ioe ioe = (ioe)((atjj)ag.c).a();
        ioe.getClass();
        final tdz tdz = (tdz)((atjj)ag.h).a();
        tdz.getClass();
        final osx osx = (osx)((atjj)ag.f).a();
        osx.getClass();
        loadingFrameLayout.getClass();
        this.ai = new jef((atjj)b, tny, context, executor, zhb, acno, acpn, ioe, tdz, osx, (wwu)this, loadingFrameLayout, (jee)this, (byte[])null, (byte[])null);
        return (View)loadingFrameLayout;
    }
    
    public final void T(final Bundle bundle) {
        super.T(bundle);
        final jef ai = this.ai;
        ai.a();
        ai.m.g((Object)ai);
    }
    
    public final wwv n() {
        return this.af;
    }
    
    public final void nm() {
        super.nm();
        final jef ai = this.ai;
        ai.m.m((Object)ai);
        ((acms)ai.k).rU();
    }
    
    public final void no() {
        super.no();
        this.ah.aj((abyw)this);
    }
    
    public final void np() {
        super.np();
        this.ah.am((abyw)this);
    }
    
    public final void nu() {
        ((bi)this).dismiss();
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        ((bi)this).nc(2, this.ae.a);
        this.af.b(wya.b(67374), (aioe)null, (alff)null);
    }
    
    public final Dialog pI(final Bundle bundle) {
        final Dialog pi = super.pI(bundle);
        final Window window = pi.getWindow();
        if (window != null) {
            window.setWindowAnimations(2132083655);
        }
        return pi;
    }
}
