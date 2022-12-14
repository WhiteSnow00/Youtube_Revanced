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

public class ProtoDataStoreCheckBoxPreference extends CheckBoxPreference implements ttk
{
    private tth c;
    private tre d;
    private ListenableFuture e;
    private aup f;
    private Object g;
    
    public ProtoDataStoreCheckBoxPreference(final Context context) {
        super(context);
        this.e = afxr.l(null);
        this.g = false;
        adme.L(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    public ProtoDataStoreCheckBoxPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.e = afxr.l(null);
        this.g = false;
        adme.L(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    public ProtoDataStoreCheckBoxPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.e = afxr.l(null);
        this.g = false;
        adme.L(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
    }
    
    public ProtoDataStoreCheckBoxPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.e = afxr.l(null);
        this.g = false;
        adme.L(TextUtils.isEmpty((CharSequence)((Preference)this).s) ^ true, "Make sure key attribute is set in the xml file.");
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
            final aup f = this.f;
            final ListenableFuture am = this.am((Boolean)o);
            final tre d = this.d;
            d.getClass();
            tfx.n(f, am, (tui)new ski(d, 19), (tui)new sus(9));
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
    
    public final void ah(final tre d) {
        this.d = d;
    }
    
    public final void ai(final aup f) {
        this.f = f;
    }
    
    public final void aj(final Map map) {
        final tth c = map.get(((Preference)this).s);
        c.getClass();
        this.c = c;
        tfx.n(this.f, c.a(), (tui)new syx(this, (Boolean)this.g, 13), (tui)new ski(this, 20));
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
        final aup f = this.f;
        final tre d = this.d;
        d.getClass();
        tfx.n(f, am, (tui)new ski(d, 19), (tui)new jns(this, b, 4));
    }
    
    protected final Object lj(final TypedArray typedArray, final int n) {
        return this.g = super.lj(typedArray, n);
    }
}
