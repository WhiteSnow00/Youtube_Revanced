// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui.preferences;

import androidx.preference.Preference;
import android.content.res.TypedArray;
import java.util.Map;
import android.util.AttributeSet;
import android.text.TextUtils;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import androidx.preference.CheckBoxPreference;

public class ProtoDataStoreCheckBoxPreference extends CheckBoxPreference implements tsh
{
    private tsf c;
    private tqd d;
    private ListenableFuture e;
    private aun f;
    private Object g;
    
    public ProtoDataStoreCheckBoxPreference(final Context context) {
        super(context);
        this.e = afwm.m((Object)null);
        this.g = false;
        adkp.I(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    public ProtoDataStoreCheckBoxPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.e = afwm.m((Object)null);
        this.g = false;
        adkp.I(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    public ProtoDataStoreCheckBoxPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.e = afwm.m((Object)null);
        this.g = false;
        adkp.I(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    public ProtoDataStoreCheckBoxPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.e = afwm.m((Object)null);
        this.g = false;
        adkp.I(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    private final ListenableFuture am(final Boolean b) {
        return this.c.b((Object)b);
    }
    
    public final void F(final Object o) {
        this.g = o;
        ((Preference)this).y = o;
    }
    
    public final boolean R(final Object o) {
        final boolean r = super.R(o);
        if (r) {
            final aun f = this.f;
            final ListenableFuture am = this.am((Boolean)o);
            final tqd d = this.d;
            d.getClass();
            teu.n(f, am, (ttg)new spu(d, 17), (ttg)new stt(9));
        }
        return r;
    }
    
    protected final boolean S(final boolean b) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }
    
    protected final void Y(final boolean b) {
    }
    
    protected void af() {
    }
    
    public final void ag(final boolean b) {
        super.k(b);
    }
    
    public final void ah(final tqd d) {
        this.d = d;
    }
    
    public final void ai(final aun f) {
        this.f = f;
    }
    
    public final void aj(final Map map) {
        final tsf c = map.get(((Preference)this).s);
        c.getClass();
        this.c = c;
        teu.n(this.f, c.a(), (ttg)new sxu(this, (Boolean)this.g, 12), (ttg)new spu(this, 18));
    }
    
    public final void ak(final boolean b) {
        super.k(b);
        this.af();
    }
    
    public final void al(final Boolean b) {
        super.k((boolean)b);
    }
    
    protected final void h(final Object o) {
    }
    
    public final void k(final boolean b) {
        final ListenableFuture am = this.am(b);
        this.e = am;
        final aun f = this.f;
        final tqd d = this.d;
        d.getClass();
        teu.n(f, am, (ttg)new spu(d, 17), (ttg)new jnh(this, b, 4));
    }
    
    protected final Object lj(final TypedArray typedArray, final int n) {
        return this.g = super.lj(typedArray, n);
    }
}
