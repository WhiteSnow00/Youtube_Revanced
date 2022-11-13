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
import androidx.preference.SeekBarPreference;

public class ProtoDataStoreSeekBarPreference extends SeekBarPreference implements tsh
{
    private Object G;
    private aemc H;
    private aun g;
    private tqd h;
    private tsf i;
    
    public ProtoDataStoreSeekBarPreference(final Context context, final AttributeSet set) {
        super(context, set);
        adkp.I(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    public final void F(final Object o) {
        this.G = o;
        ((Preference)this).y = o;
    }
    
    public final boolean R(final Object o) {
        final boolean r = super.R(o);
        if (r) {
            final aun g = this.g;
            final ListenableFuture b = this.i.b(o);
            final tqd h = this.h;
            h.getClass();
            teu.n(g, b, (ttg)new tsi(h, 2), (ttg)new stt(11));
        }
        return r;
    }
    
    protected final void ab(final int n) {
    }
    
    public final void ac(final int n) {
        super.k(n);
    }
    
    public final void ah(final tqd h) {
        this.h = h;
    }
    
    public final void ai(final aun g) {
        this.g = g;
    }
    
    public final void aj(final Map map) {
        final tsf i = map.get(((Preference)this).s);
        i.getClass();
        this.i = i;
        final int intValue = (int)this.G;
        final aemc h = new aemc((afty)new qqz(teu.b(this.g, this.i.a(), (aezf)rsv.s), 5), (Executor)afum.a);
        this.H = h;
        teu.n(this.g, h.c(), (ttg)new hlp(this, intValue, 3), (ttg)new tsi(this, 0));
    }
    
    protected final void h(final Object o) {
    }
    
    protected final Object lj(final TypedArray typedArray, final int n) {
        return this.G = super.lj(typedArray, n);
    }
    
    protected final int p(final int n) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }
}
