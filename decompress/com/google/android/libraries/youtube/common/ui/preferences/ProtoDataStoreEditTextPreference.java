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

public class ProtoDataStoreEditTextPreference extends EditTextPreference implements ttk
{
    private tth G;
    private aenv H;
    private Object I;
    private tre h;
    private aup i;
    
    public ProtoDataStoreEditTextPreference(final Context context, final AttributeSet set) {
        super(context, set);
        adme.L(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    public final void F(final Object o) {
        this.I = o;
        ((Preference)this).y = o;
    }
    
    public final boolean R(final Object o) {
        final boolean r = super.R(o);
        if (r) {
            final aup i = this.i;
            final ListenableFuture b = this.G.b(o);
            final tre h = this.h;
            h.getClass();
            tfx.n(i, b, (tui)new tti(h, 1), (tui)new sus(10));
        }
        return r;
    }
    
    protected final void Z(final String s) {
    }
    
    public final void ah(final tre h) {
        h.getClass();
        this.h = h;
    }
    
    public final void ai(final aup i) {
        this.i = i;
    }
    
    public final void aj(final Map map) {
        final tth g = map.get(((Preference)this).s);
        g.getClass();
        this.G = g;
        final String s = (String)this.I;
        final aenv h = new aenv((afvp)new qrs(tfx.b(this.i, g.a(), (afax)new sur(this, 10)), 3), (Executor)afwd.a);
        this.H = h;
        tfx.n(this.i, h.c(), (tui)new syx(this, s, 14), (tui)new tti(this, 0));
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
