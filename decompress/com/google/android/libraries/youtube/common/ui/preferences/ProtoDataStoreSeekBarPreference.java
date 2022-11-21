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

public class ProtoDataStoreSeekBarPreference extends SeekBarPreference implements ttk
{
    private Object G;
    private aenv H;
    private aup g;
    private tre h;
    private tth i;
    
    public ProtoDataStoreSeekBarPreference(final Context context, final AttributeSet set) {
        super(context, set);
        adme.L(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    public final void F(final Object o) {
        this.G = o;
        ((Preference)this).y = o;
    }
    
    public final boolean R(final Object o) {
        final boolean r = super.R(o);
        if (r) {
            final aup g = this.g;
            final ListenableFuture b = this.i.b(o);
            final tre h = this.h;
            h.getClass();
            tfx.n(g, b, (tui)new tti(h, 4), (tui)new sus(11));
        }
        return r;
    }
    
    protected final void ab(final int n) {
    }
    
    public final void ac(final int n) {
        super.k(n);
    }
    
    public final void ah(final tre h) {
        this.h = h;
    }
    
    public final void ai(final aup g) {
        this.g = g;
    }
    
    public final void aj(final Map map) {
        final tth i = map.get(((Preference)this).s);
        i.getClass();
        this.i = i;
        final int intValue = (int)this.G;
        final aenv h = new aenv((afvp)new qrs(tfx.b(this.g, this.i.a(), (afax)rtx.s), 5), (Executor)afwd.a);
        this.H = h;
        tfx.n(this.g, h.c(), (tui)new hlx(this, intValue, 3), (tui)new tti(this, 3));
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
