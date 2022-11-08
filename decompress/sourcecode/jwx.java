import android.view.View;
import android.view.MenuItem;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import android.text.TextUtils;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwx implements fzi, fze
{
    private final ggv a;
    private final thh b;
    private final toi c;
    private final Context d;
    private aioe e;
    private String f;
    private int g;
    private final sin h;
    private final alm i;
    
    public jwx(final ggv a, final thh b, final sin h, final toi c, final alm i, final Context d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.e = aioe.a;
        this.d = d;
        this.a = a;
        b.getClass();
        this.b = b;
        h.getClass();
        this.h = h;
        c.getClass();
        this.c = c;
        this.i = i;
    }
    
    private final void h(final boolean b, final int n, final acvr acvr) {
        final ggv a = this.a;
        a.d(this.i.S(this.e, this.f, this.g, b, n, a.o(), acvr));
    }
    
    @Override
    public final void a() {
        this.h(false, -1, new acvr());
    }
    
    @Override
    public final void b(final int n, final acvr acvr) {
        this.h(false, n, acvr);
    }
    
    @Override
    public final void c(final acvr acvr) {
        this.h(false, -1, acvr);
    }
    
    @Override
    public final void d(final acvr acvr) {
        this.h(true, -1, acvr);
    }
    
    @Override
    public final void e(final String s) {
        final aioe a = aioe.a;
        String c = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            c = "";
        }
        a.getClass();
        final agzc agzc = (agzc)((agzi)a).toBuilder();
        final agzg searchEndpoint = SearchEndpointOuterClass.searchEndpoint;
        final agzc agzc2 = (agzc)((agzi)((agzd)a).rr((agyr)SearchEndpointOuterClass.searchEndpoint)).toBuilder();
        agzc2.copyOnWrite();
        final anvb anvb = (anvb)agzc2.instance;
        c.getClass();
        anvb.b |= 0x1;
        anvb.c = c;
        agzc.e((agyr)searchEndpoint, agzc2.build());
        this.e = (aioe)agzc.build();
    }
    
    public final void f(final String f) {
        this.f = f;
    }
    
    public final void g() {
        this.g = 10349;
    }
    
    public final int j() {
        return 2131429836;
    }
    
    public final int k() {
        return 0;
    }
    
    public final fyz l() {
        return null;
    }
    
    public final boolean n() {
        return true;
    }
    
    public final void o(final MenuItem menuItem) {
        menuItem.setActionView((View)null);
        menuItem.setShowAsAction(2);
        menuItem.setIcon(2131233877);
    }
    
    public final boolean p() {
        if (!this.h.a && !this.b.o()) {
            this.c.b();
            return false;
        }
        this.a();
        return true;
    }
    
    @Override
    public final int q() {
        return 50;
    }
    
    @Override
    public final CharSequence r() {
        return this.d.getString(2132018659);
    }
}
