// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui.preferences;

import androidx.preference.Preference;
import android.content.res.TypedArray;
import java.util.concurrent.Executor;
import java.util.Map;
import com.google.common.util.concurrent.ListenableFuture;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.content.Context;
import androidx.preference.EditTextPreference;

public class ProtoDataStoreEditTextPreference extends EditTextPreference implements tsh
{
    private tsf G;
    private aemc H;
    private Object I;
    private tqd h;
    private aun i;
    
    public ProtoDataStoreEditTextPreference(final Context context, final AttributeSet set) {
        super(context, set);
        adkp.I(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    public final void F(final Object o) {
        this.I = o;
        ((Preference)this).y = o;
    }
    
    public final boolean R(final Object o) {
        final boolean r = super.R(o);
        if (r) {
            final aun i = this.i;
            final ListenableFuture b = this.G.b(o);
            final tqd h = this.h;
            h.getClass();
            teu.n(i, b, (ttg)new spu(h, 19), (ttg)new stt(10));
        }
        return r;
    }
    
    protected final void Z(final String s) {
    }
    
    public final void ah(final tqd h) {
        h.getClass();
        this.h = h;
    }
    
    public final void ai(final aun i) {
        this.i = i;
    }
    
    public final void aj(final Map map) {
        final tsf g = map.get(((Preference)this).s);
        g.getClass();
        this.G = g;
        final String s = (String)this.I;
        final aemc h = new aemc((afty)new qqz(teu.b(this.i, g.a(), (aezf)new sts(this, 10)), 3), (Executor)afum.a);
        this.H = h;
        teu.n(this.i, h.c(), (ttg)new sxu(this, s, 13), (ttg)new spu(this, 20));
    }
    
    @Override
    protected final void h(final Object o) {
    }
    
    public final void k(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            super.i(s);
        }
    }
    
    @Override
    protected final Object lj(final TypedArray typedArray, final int n) {
        return this.I = typedArray.getString(n);
    }
    
    protected final String s(final String s) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }
}
