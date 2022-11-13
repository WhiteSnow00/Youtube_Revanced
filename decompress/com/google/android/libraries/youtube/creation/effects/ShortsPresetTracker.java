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
    public ubh a;
    
    public ShortsPresetTracker(final aun aun, final upw upw, final qqr qqr) {
        super(aun, upw, qqr);
    }
    
    public static void h() {
        ttr.b("Error saving most recent preset effect ID for Short");
    }
    
    public static void l() {
        ttr.b("Error saving most recent preset effect ID for Short");
    }
    
    protected final void g() {
        final String f = this.f;
        if (f != null) {
            teu.m(this.i.b((aezf)new uig(f, 2), (Executor)afum.a), (tes)rll.q);
        }
    }
    
    public final void i(final uie uie, final vbs vbs) {
        float r;
        if ((r = uie.r) == 0.0f) {
            r = 1.0f;
        }
        final String l = uie.l;
        final List b = vbs.b();
        final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = null;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 = null;
        Label_0093: {
            if (b != null) {
                if (l != null) {
                    for (final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 : b) {
                        if (FilterMapTable$FilterDescriptor.j(filterMapTable$FilterDescriptor2.d, l)) {
                            break Label_0093;
                        }
                    }
                }
            }
            filterMapTable$FilterDescriptor2 = null;
        }
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor3 = filterMapTable$FilterDescriptor2;
        Label_0318: {
            if (filterMapTable$FilterDescriptor2 == null) {
                filterMapTable$FilterDescriptor3 = filterMapTable$FilterDescriptor;
                if (b != null) {
                    if (l == null) {
                        filterMapTable$FilterDescriptor3 = filterMapTable$FilterDescriptor;
                    }
                    else {
                        final afpo a = afpp.a(Pattern.compile("_[0-9]*$"));
                        final String string = l.toString();
                        final Matcher matcher = ((afpm)a).a.matcher(string);
                        afpn afpn;
                        if (matcher.find(0)) {
                            final int start = matcher.start(0);
                            final int n = matcher.end(0) - start;
                            afpn = new afpn(string, start, n, Math.max(1, n) + start);
                        }
                        else {
                            afpn = null;
                        }
                        Object o;
                        if (afpn == null) {
                            o = null;
                        }
                        else {
                            o = new afpn(string, 0, afpn.a, afpn.b);
                        }
                        final String s = (String)Optional.ofNullable((Object)Objects.toString(o, (String)null)).orElse((Object)null);
                        final Iterator iterator2 = b.iterator();
                        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor4;
                        do {
                            filterMapTable$FilterDescriptor3 = filterMapTable$FilterDescriptor;
                            if (!iterator2.hasNext()) {
                                break Label_0318;
                            }
                            filterMapTable$FilterDescriptor4 = (filterMapTable$FilterDescriptor3 = (FilterMapTable$FilterDescriptor)iterator2.next());
                            if (!FilterMapTable$FilterDescriptor.j(filterMapTable$FilterDescriptor4.a, l)) {
                                continue;
                            }
                            break Label_0318;
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
            a2 = (String)vbs.d;
        }
        this.h = a2;
        final ubh a3 = this.a;
        if (a3 != null) {
            final String h = this.h;
            final hbk hbk = (hbk)a3;
            hbk.m = h;
            hbk.n = r;
        }
    }
    
    public final void my(final aun aun) {
        if (this.g) {
            this.g();
        }
        final ubh a = this.a;
        if (a != null) {
            final String e = this.e;
            if (e != null) {
                final qqr i = this.i;
                final hbk hbk = (hbk)a;
                final FilterMapTable$FilterDescriptor k = hbk.k;
                float a2;
                final float n = a2 = 1.0f;
                if (k != null) {
                    a2 = n;
                    if (k.a.equals(e)) {
                        final Control b = hbk.k.b("preset_intensity");
                        a2 = n;
                        if (b != null) {
                            a2 = b.b.a();
                        }
                    }
                }
                teu.m(i.b((aezf)new uif(a2), (Executor)afum.a), (tes)rll.r);
            }
        }
    }
}
