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

public final class jfr extends jfp implements jff, wyv, acay
{
    public tvr ae;
    public wyw af;
    public lan ag;
    public aeea ah;
    private jfg ai;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        final LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout)layoutInflater.inflate(2131625608, viewGroup, false);
        final lan ag = this.ag;
        final Object b = ag.b;
        final tqd tqd = (tqd)((atke)ag.g).a();
        tqd.getClass();
        final Context context = (Context)((atke)ag.e).a();
        context.getClass();
        final Executor executor = (Executor)((atke)ag.d).a();
        executor.getClass();
        final ziy ziy = (ziy)((atke)ag.a).a();
        ziy.getClass();
        final acps acps = (acps)((atke)ag.i).a();
        acps.getClass();
        final acrr acrr = (acrr)((atke)ag.j).a();
        acrr.getClass();
        final ipd ipd = (ipd)((atke)ag.c).a();
        ipd.getClass();
        final tgd tgd = (tgd)((atke)ag.h).a();
        tgd.getClass();
        final oug oug = (oug)((atke)ag.f).a();
        oug.getClass();
        loadingFrameLayout.getClass();
        this.ai = new jfg((atke)b, tqd, context, executor, ziy, acps, acrr, ipd, tgd, oug, (wyv)this, loadingFrameLayout, (jff)this, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        return (View)loadingFrameLayout;
    }
    
    public final void T(final Bundle bundle) {
        super.T(bundle);
        final jfg ai = this.ai;
        ai.a();
        ai.m.g((Object)ai);
    }
    
    public final void nm() {
        super.nm();
        final jfg ai = this.ai;
        ai.m.m((Object)ai);
        ((acov)ai.k).sa();
    }
    
    public final void no() {
        super.no();
        this.ah.ap((acay)this);
    }
    
    public final void np() {
        super.np();
        this.ah.as((acay)this);
    }
    
    public final void nu() {
        ((bi)this).dismiss();
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        ((bi)this).nc(2, this.ae.a);
        this.af.b(xaa.b(67374), (aiqj)null, (alhi)null);
    }
    
    public final wyw pF() {
        return this.af;
    }
    
    public final Dialog pN(final Bundle bundle) {
        final Dialog pn = super.pN(bundle);
        final Window window = pn.getWindow();
        if (window != null) {
            window.setWindowAnimations(2132083655);
        }
        return pn;
    }
}
