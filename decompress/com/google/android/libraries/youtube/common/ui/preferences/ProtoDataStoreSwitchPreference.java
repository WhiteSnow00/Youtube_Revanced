// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui.preferences;

import androidx.preference.Preference;
import android.content.res.TypedArray;
import java.util.Map;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import androidx.preference.SwitchPreference;

public class ProtoDataStoreSwitchPreference extends SwitchPreference implements ttk
{
    public ttl c;
    private tth d;
    private tre e;
    private ListenableFuture f;
    private aup g;
    private Object h;
    private ListenableFuture i;
    
    public ProtoDataStoreSwitchPreference(final Context context) {
        super(context);
        this.f = afxr.l(null);
    }
    
    public ProtoDataStoreSwitchPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.f = afxr.l(null);
        adme.L(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    private final ListenableFuture am(final Boolean b) {
        return this.d.b((Object)b);
    }
    
    public final void F(final Object o) {
        this.h = o;
        ((Preference)this).y = o;
    }
    
    public final boolean R(final Object o) {
        final boolean r = super.R(o);
        if (r) {
            final aup g = this.g;
            final ListenableFuture am = this.am((Boolean)o);
            final tre e = this.e;
            e.getClass();
            tfx.n(g, am, (tui)new tti(e, 5), (tui)new syx(this, o, 19));
        }
        return r;
    }
    
    protected final boolean S(final boolean b) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }
    
    protected final void Y(final boolean b) {
    }
    
    public final ListenableFuture af() {
        return tfx.b(this.g, this.i, (afax)new sur(this, 13));
    }
    
    public final ListenableFuture ag(final Boolean b) {
        return afxr.m(tfx.b(this.g, afun.e((ListenableFuture)afxb.m(this.d.a()), (Class)Exception.class, (afax)new sur(b, 14), tfx.a), (afax)new sur(this, 12)));
    }
    
    public final void ah(final tre e) {
        this.e = e;
    }
    
    public final void ai(final aup g) {
        this.g = g;
    }
    
    public final void aj(final Map map) {
        final tth d = map.get(((Preference)this).s);
        d.getClass();
        this.d = d;
        this.i = this.ag((Boolean)this.h);
    }
    
    public final void ak(final boolean b) {
        super.k(b);
    }
    
    public final void al(final Boolean b) {
        super.k((boolean)b);
    }
    
    protected final void h(final Object o) {
    }
    
    public final void k(final boolean b) {
        final ListenableFuture am = this.am(b);
        this.f = am;
        final aup g = this.g;
        final tre e = this.e;
        e.getClass();
        tfx.n(g, am, (tui)new tti(e, 5), (tui)new jns(this, b, 5));
    }
    
    protected final Object lj(final TypedArray typedArray, final int n) {
        return this.h = super.lj(typedArray, n);
    }
}
