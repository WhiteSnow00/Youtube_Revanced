// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.lens;

import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;

public class LensController implements aua, tgg
{
    public final atke a;
    public final boolean b;
    public final vcy c;
    public final atke d;
    public final LinkedHashMap e;
    public byte[] f;
    public final afkb g;
    private final tgd h;
    
    public LensController(final tgd h, final atke a, final vaf vaf, final vcy c, final atke d) {
        this.h = h;
        this.a = a;
        this.b = fbu.ae(vaf);
        this.c = c;
        this.d = d;
        this.e = (LinkedHashMap)new gty();
        this.g = afkb.a();
    }
    
    public final void g() {
        final aiqj aiqj = this.e.get(((abpq)this.a.a()).s());
        if (aiqj != null) {
            this.c.c(aiqj, (Map)null);
        }
    }
    
    public final void lW(final aun aun) {
        if (this.b) {
            this.h.g((Object)this);
        }
    }
    
    public final void mM(final aun aun) {
        this.g();
    }
    
    public final void mq(final aun aun) {
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array2;
        if (n != -1) {
            final Class[] array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    final aanw aanw = (aanw)o;
                    final abpq abpq = (abpq)this.a.a();
                    array2 = array;
                    if (this.b) {
                        if (abpq.V()) {
                            array2 = array;
                        }
                        else if (aanw.a() == 3) {
                            this.g();
                            final abvx q = abpq.q();
                            if (q == null) {
                                array2 = array;
                            }
                            else {
                                final long c = q.c();
                                final afkb g = this.g;
                                final Long value = c;
                                final aiqj aiqj = (aiqj)g.b(value);
                                if (aiqj != null) {
                                    this.c.c(aiqj, (Map)afev.m("player_timestamp_ms", value));
                                    return null;
                                }
                                array2 = array;
                            }
                        }
                        else {
                            if (aanw.a() == 2) {
                                this.g();
                                return null;
                            }
                            array2 = array;
                        }
                    }
                }
                else {
                    final aans aans = (aans)o;
                    array2 = array;
                    if (this.b) {
                        if (aans.c() == abke.a) {
                            this.g();
                            this.g.d();
                            return null;
                        }
                        array2 = array;
                    }
                }
            }
            else {
                final aani aani = (aani)o;
                array2 = array;
                if (this.b) {
                    if (aani.a() == null) {
                        array2 = array;
                    }
                    else {
                        final alem a = aani.a().a;
                        alen alen;
                        if ((alen = a.e) == null) {
                            alen = alen.a;
                        }
                        aled a2;
                        if (alen.b == 51779735) {
                            a2 = (aled)alen.c;
                        }
                        else {
                            a2 = aled.a;
                        }
                        alec alec;
                        if ((alec = a2.c) == null) {
                            alec = alec.a;
                        }
                        anyv a3;
                        if (alec.b == 49399797) {
                            a3 = (anyv)alec.c;
                        }
                        else {
                            a3 = anyv.a;
                        }
                        final Iterator<Object> iterator = ((List<Object>)a3.d).iterator();
                        while (iterator.hasNext()) {
                            aoir aoir;
                            if ((aoir = iterator.next().bp) == null) {
                                aoir = aoir.a;
                            }
                            if ((aoir.b & 0x10) != 0x0) {
                                this.f = aoir.g.I();
                                break;
                            }
                        }
                        alen alen2;
                        if ((alen2 = a.e) == null) {
                            alen2 = alen.a;
                        }
                        aled a4;
                        if (alen2.b == 51779735) {
                            a4 = (aled)alen2.c;
                        }
                        else {
                            a4 = aled.a;
                        }
                        alec alec2;
                        if ((alec2 = a4.c) == null) {
                            alec2 = alec.a;
                        }
                        anyv a5;
                        if (alec2.b == 49399797) {
                            a5 = (anyv)alec2.c;
                        }
                        else {
                            a5 = anyv.a;
                        }
                        final Iterator<Object> iterator2 = ((List<Object>)a5.d).iterator();
                        anyy anyy;
                        do {
                            array2 = array;
                            if (!iterator2.hasNext()) {
                                return array2;
                            }
                            anyy = iterator2.next();
                        } while ((anyy.e & 0x40000000) == 0x0);
                        alns alns;
                        if ((alns = anyy.bB) == null) {
                            alns = alns.a;
                        }
                        final Iterator<Object> iterator3 = ((List<Object>)alns.b).iterator();
                        while (true) {
                            array2 = array;
                            if (!iterator3.hasNext()) {
                                break;
                            }
                            final alnr alnr = iterator3.next();
                            aiqj aiqj2;
                            if ((aiqj2 = alnr.d) == null) {
                                aiqj2 = aiqj.a;
                            }
                            this.g.e(afid.e((Comparable)(long)alnr.b, (Comparable)(long)alnr.c), aiqj2);
                        }
                    }
                }
            }
        }
        else {
            array2 = new Class[] { aani.class, aans.class, aanw.class };
        }
        return array2;
    }
    
    public final void my(final aun aun) {
        if (this.b) {
            this.h.m((Object)this);
        }
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
