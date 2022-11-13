// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui.preferences;

import androidx.preference.Preference;
import android.content.res.TypedArray;
import java.util.concurrent.Executor;
import java.util.Map;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import androidx.preference.ListPreference;

public class ProtoDataStoreListPreference extends ListPreference implements tsh
{
    public tsj G;
    private tsf H;
    private tqd I;
    private aemc J;
    private ListenableFuture K;
    private aun L;
    private Object M;
    
    public ProtoDataStoreListPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.K = afwm.m((Object)null);
        adkp.I(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    public final void F(final Object o) {
        this.M = o;
        ((Preference)this).y = o;
    }
    
    public final boolean R(final Object o) {
        final boolean r = super.R(o);
        if (r) {
            final aun l = this.L;
            final ListenableFuture ac = this.ac((String)o);
            final tqd i = this.I;
            i.getClass();
            teu.n(l, ac, (ttg)new tsi(i, 1), (ttg)new sxu(this, o, 14));
        }
        return r;
    }
    
    protected final void Z(final String s) {
    }
    
    protected final ListenableFuture ac(final String s) {
        return this.H.b((Object)s);
    }
    
    public final void ad(final String s, final String s2) {
        if (TextUtils.isEmpty((CharSequence)s2)) {
            super.o(s);
            return;
        }
        super.o(s2);
    }
    
    public final void ae(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            super.o(s2);
            return;
        }
        if (s != null) {
            super.o(s);
        }
    }
    
    public final void af(final String s) {
        super.o(s);
    }
    
    public final void ag(final String s) {
        super.o(s);
    }
    
    public final void ah(final tqd i) {
        i.getClass();
        this.I = i;
    }
    
    public final void ai(final aun l) {
        this.L = l;
    }
    
    public final void aj(final Map map) {
        final tsf h = map.get(((Preference)this).s);
        h.getClass();
        this.H = h;
        final String s = (String)this.M;
        final aemc j = new aemc((afty)new qqz(teu.b(this.L, h.a(), (aezf)new rrw(this, s, 5)), 4), (Executor)afum.a);
        this.J = j;
        teu.n(this.L, j.c(), (ttg)new sxu(this, s, 15), (ttg)new sxu(this, s, 16));
    }
    
    @Override
    protected final void h(final Object o) {
    }
    
    @Override
    protected final Object lj(final TypedArray typedArray, final int n) {
        return this.M = typedArray.getString(n);
    }
    
    @Override
    public final void o(final String s) {
        final ListenableFuture ac = this.ac(s);
        this.K = ac;
        final aun l = this.L;
        final tqd i = this.I;
        i.getClass();
        teu.n(l, ac, (ttg)new tsi(i, 1), (ttg)new sxu(this, s, 17));
    }
    
    protected final String s(final String s) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }
}
