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

public class ProtoDataStoreSwitchPreference extends SwitchPreference implements tsh
{
    public tsj c;
    private tsf d;
    private tqd e;
    private ListenableFuture f;
    private aun g;
    private Object h;
    private ListenableFuture i;
    
    public ProtoDataStoreSwitchPreference(final Context context) {
        super(context);
        this.f = afwm.m((Object)null);
    }
    
    public ProtoDataStoreSwitchPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.f = afwm.m((Object)null);
        adkp.I(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
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
            final aun g = this.g;
            final ListenableFuture am = this.am((Boolean)o);
            final tqd e = this.e;
            e.getClass();
            teu.n(g, am, (ttg)new tsi(e, 3), (ttg)new sxu(this, o, 18));
        }
        return r;
    }
    
    protected final boolean S(final boolean b) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }
    
    protected final void Y(final boolean b) {
    }
    
    public final ListenableFuture af() {
        return teu.b(this.g, this.i, (aezf)new sts(this, 13));
    }
    
    public final ListenableFuture ag(final Boolean b) {
        return afwm.n(teu.b(this.g, afsw.e((ListenableFuture)afvk.m(this.d.a()), (Class)Exception.class, (aezf)new sts(b, 14), teu.a), (aezf)new sts(this, 12)));
    }
    
    public final void ah(final tqd e) {
        this.e = e;
    }
    
    public final void ai(final aun g) {
        this.g = g;
    }
    
    public final void aj(final Map map) {
        final tsf d = map.get(((Preference)this).s);
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
        final aun g = this.g;
        final tqd e = this.e;
        e.getClass();
        teu.n(g, am, (ttg)new tsi(e, 3), (ttg)new jnh(this, b, 5));
    }
    
    protected final Object lj(final TypedArray typedArray, final int n) {
        return this.h = super.lj(typedArray, n);
    }
}
