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

public class ProtoDataStoreListPreference extends ListPreference implements ttk
{
    public ttl G;
    private tth H;
    private tre I;
    private aenv J;
    private ListenableFuture K;
    private aup L;
    private Object M;
    
    public ProtoDataStoreListPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.K = afxr.l(null);
        adme.L(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    public final void F(final Object o) {
        this.M = o;
        ((Preference)this).y = o;
    }
    
    public final boolean R(final Object o) {
        final boolean r = super.R(o);
        if (r) {
            final aup l = this.L;
            final ListenableFuture ac = this.ac((String)o);
            final tre i = this.I;
            i.getClass();
            tfx.n(l, ac, (tui)new tti(i, 2), (tui)new syx(this, o, 15));
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
    
    public final void ah(final tre i) {
        i.getClass();
        this.I = i;
    }
    
    public final void ai(final aup l) {
        this.L = l;
    }
    
    public final void aj(final Map map) {
        final tth h = map.get(((Preference)this).s);
        h.getClass();
        this.H = h;
        final String s = (String)this.M;
        final aenv j = new aenv((afvp)new qrs(tfx.b(this.L, h.a(), (afax)new rsy(this, s, 5)), 4), (Executor)afwd.a);
        this.J = j;
        tfx.n(this.L, j.c(), (tui)new syx(this, s, 16), (tui)new syx(this, s, 17));
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
        final aup l = this.L;
        final tre i = this.I;
        i.getClass();
        tfx.n(l, ac, (tui)new tti(i, 2), (tui)new syx(this, s, 18));
    }
    
    protected final String s(final String s) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }
}
