// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.effects;

import com.google.research.xeno.effect.Control;
import java.util.regex.Matcher;
import java.util.Iterator;
import java.util.List;
import j$.util.Optional;
import j$.util.Objects;
import java.util.regex.Pattern;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.creation.common.util.PresetTracker;

public class ShortsPresetTracker extends PresetTracker
{
    public tzf a;
    
    public ShortsPresetTracker(final aum aum, final unz unz, final aagm aagm, final byte[] array) {
        super(aum, unz, aagm, (byte[])null);
    }
    
    protected final void g() {
        final String f = this.f;
        if (f != null) {
            tcp.m(this.i.c((aexg)new ujo(f, 1), (Executor)afsl.a), (tcn)rji.q);
        }
    }
    
    public final void i(final ugb ugb, final van van) {
        float r;
        if ((r = ugb.r) == 0.0f) {
            r = 1.0f;
        }
        final String l = ugb.l;
        final List b = van.b();
        final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = null;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 = null;
        Label_0092: {
            if (b != null) {
                if (l != null) {
                    for (final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 : b) {
                        if (FilterMapTable$FilterDescriptor.j(filterMapTable$FilterDescriptor2.d, l)) {
                            break Label_0092;
                        }
                    }
                }
            }
            filterMapTable$FilterDescriptor2 = null;
        }
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor3 = filterMapTable$FilterDescriptor2;
        Label_0317: {
            if (filterMapTable$FilterDescriptor2 == null) {
                filterMapTable$FilterDescriptor3 = filterMapTable$FilterDescriptor;
                if (b != null) {
                    if (l == null) {
                        filterMapTable$FilterDescriptor3 = filterMapTable$FilterDescriptor;
                    }
                    else {
                        final aety a = afno.a(Pattern.compile("_[0-9]*$"));
                        final String string = l.toString();
                        final Matcher matcher = ((afnm)a).b.matcher(string);
                        afnn afnn;
                        if (matcher.find(0)) {
                            final int start = matcher.start(0);
                            final int n = matcher.end(0) - start;
                            afnn = new afnn(string, start, n, Math.max(1, n) + start);
                        }
                        else {
                            afnn = null;
                        }
                        Object o;
                        if (afnn == null) {
                            o = null;
                        }
                        else {
                            o = new afnn(string, 0, afnn.a, afnn.b);
                        }
                        final String s = (String)Optional.ofNullable((Object)Objects.toString(o, (String)null)).orElse((Object)null);
                        final Iterator iterator2 = b.iterator();
                        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor4;
                        do {
                            filterMapTable$FilterDescriptor3 = filterMapTable$FilterDescriptor;
                            if (!iterator2.hasNext()) {
                                break Label_0317;
                            }
                            filterMapTable$FilterDescriptor4 = (filterMapTable$FilterDescriptor3 = (FilterMapTable$FilterDescriptor)iterator2.next());
                            if (!FilterMapTable$FilterDescriptor.j(filterMapTable$FilterDescriptor4.a, l)) {
                                continue;
                            }
                            break Label_0317;
                        } while (s == null || !FilterMapTable$FilterDescriptor.j(filterMapTable$FilterDescriptor4.a, s));
                        filterMapTable$FilterDescriptor3 = filterMapTable$FilterDescriptor4;
                    }
                }
            }
        }
        String a2;
        if (filterMapTable$FilterDescriptor3 != null) {
            a2 = filterMapTable$FilterDescriptor3.a;
        }
        else {
            a2 = (String)van.d;
        }
        this.h = a2;
        final tzf a3 = this.a;
        if (a3 != null) {
            final String h = this.h;
            final hav hav = (hav)a3;
            hav.m = h;
            hav.n = r;
        }
    }
    
    public final void my(final aum aum) {
        if (this.g) {
            this.g();
        }
        final tzf a = this.a;
        if (a != null) {
            final String e = this.e;
            if (e != null) {
                final aagm i = this.i;
                final hav hav = (hav)a;
                final FilterMapTable$FilterDescriptor k = hav.k;
                float a2;
                final float n = a2 = 1.0f;
                if (k != null) {
                    a2 = n;
                    if (k.a.equals(e)) {
                        final Control b = hav.k.b("preset_intensity");
                        a2 = n;
                        if (b != null) {
                            a2 = b.b.a();
                        }
                    }
                }
                tcp.m(i.c((aexg)new ugc(a2), (Executor)afsl.a), (tcn)rji.r);
            }
        }
    }
}
