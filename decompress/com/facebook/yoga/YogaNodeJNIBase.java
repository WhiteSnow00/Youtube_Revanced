// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.yoga;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public abstract class YogaNodeJNIBase extends ehe implements Cloneable
{
    protected long a;
    private float[] arr;
    public Object b;
    private YogaNodeJNIBase c;
    private List d;
    private bih e;
    private int mLayoutDirection;
    
    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }
    
    public YogaNodeJNIBase(final long a) {
        this.arr = null;
        this.mLayoutDirection = 0;
        if (a != 0L) {
            this.a = a;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }
    
    private static ehg ac(final long n) {
        return new ehg(Float.intBitsToFloat((int)n), (int)(n >> 32));
    }
    
    private final void ad() {
        final Object b = this.b;
        if (b instanceof ehd) {
            final dub dub = (dub)b;
            final dvd ao = dub.ao();
            if (ao != null && ((dub)ao).d == 8) {
                dub.bw(4);
            }
            if (ao != null) {
                final duc j = ((dub)ao).j;
                if (j != null && j.s == 2) {
                    dub.bi().k(false);
                }
            }
        }
    }
    
    private final long replaceChild(final YogaNodeJNIBase yogaNodeJNIBase, final int n) {
        final List d = this.d;
        if (d != null) {
            d.remove(n);
            this.d.add(n, yogaNodeJNIBase);
            yogaNodeJNIBase.c = this;
            return yogaNodeJNIBase.a;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }
    
    public final void A(final float n) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.a, n);
    }
    
    public final void B(final float n) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.a, n);
    }
    
    public final void C(final float n) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.a, n);
    }
    
    public final void D(final float n) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.a, n);
    }
    
    public final void E(final float n) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.a, n);
    }
    
    public final void F(final float n) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.a, n);
    }
    
    public final void G(final float n) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.a, n);
    }
    
    public final void H(final float n) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.a, n);
    }
    
    public final void I(final float n) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.a, n);
    }
    
    public final void J(final float n) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.a, n);
    }
    
    public final void K(final float n) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.a, n);
    }
    
    public final void L(final int n) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.a, n - 1);
    }
    
    public final void M(final int n) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.a, n - 1);
    }
    
    public final void N(final int n) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.a, n - 1);
    }
    
    public final void O(final int n) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.a, n - 1);
    }
    
    public final void P() {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.a, 0.0f);
    }
    
    public final float Q(int n) {
        final float[] arr = this.arr;
        if (arr != null) {
            int n2 = 0;
            final int n3 = (int)arr[0];
            if ((n3 & 0x4) == 0x4) {
                int n4;
                if (0x1 != (n3 & 0x1)) {
                    n4 = 4;
                }
                else {
                    n4 = 0;
                }
                if ((n3 & 0x2) != 0x2) {
                    n2 = 4;
                }
                --n;
                final int n5 = 14 - n4 - n2;
                if (n == 0) {
                    return arr[n5];
                }
                if (n == 1) {
                    return arr[n5 + 1];
                }
                if (n != 2) {
                    return arr[n5 + 3];
                }
                return arr[n5 + 2];
            }
        }
        return 0.0f;
    }
    
    public final float R(int n) {
        final float[] arr = this.arr;
        if (arr == null || ((int)arr[0] & 0x1) != 0x1) {
            return 0.0f;
        }
        if (--n == 0) {
            return arr[6];
        }
        if (n == 1) {
            return arr[7];
        }
        if (n != 2) {
            return arr[9];
        }
        return arr[8];
    }
    
    public final float S(int n) {
        final float[] arr = this.arr;
        if (arr != null) {
            int n2 = 0;
            final int n3 = (int)arr[0];
            if ((n3 & 0x2) == 0x2) {
                if (0x1 != (n3 & 0x1)) {
                    n2 = 4;
                }
                --n;
                final int n4 = 10 - n2;
                if (n == 0) {
                    return arr[n4];
                }
                if (n == 1) {
                    return arr[n4 + 1];
                }
                if (n != 2) {
                    return arr[n4 + 3];
                }
                return arr[n4 + 2];
            }
        }
        return 0.0f;
    }
    
    public final void T(final int n, final float n2) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.a, n - 1, n2);
    }
    
    public final void U(final int n, final float n2) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.a, n - 1, n2);
    }
    
    public final void V(final int n, final float n2) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.a, n - 1, n2);
    }
    
    public final void W(final int n, final float n2) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.a, n - 1, n2);
    }
    
    public final void X(final int n, final float n2) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.a, n - 1, n2);
    }
    
    public final void Y(final int n, final float n2) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.a, n - 1, n2);
    }
    
    public final void Z(final int n, final float n2) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.a, n - 1, n2);
    }
    
    public final float a() {
        final float[] arr = this.arr;
        if (arr != null) {
            return arr[2];
        }
        return 0.0f;
    }
    
    public final void aa(final bih e) {
        this.e = e;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.a, e != null);
    }
    
    public final YogaNodeJNIBase ab() {
        try {
            final YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase)super.clone();
            final long jni_YGNodeCloneJNI = YogaNative.jni_YGNodeCloneJNI(this.a);
            yogaNodeJNIBase.c = null;
            yogaNodeJNIBase.a = jni_YGNodeCloneJNI;
            yogaNodeJNIBase.d = null;
            YogaNative.jni_YGNodeClearChildrenJNI(jni_YGNodeCloneJNI);
            return yogaNodeJNIBase;
        }
        catch (final CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public final float b() {
        final float[] arr = this.arr;
        if (arr != null) {
            return arr[1];
        }
        return 0.0f;
    }
    
    public final float baseline(final float n, final float n2) {
        throw null;
    }
    
    public final float c() {
        final float[] arr = this.arr;
        if (arr != null) {
            return arr[3];
        }
        return 0.0f;
    }
    
    public final float d() {
        final float[] arr = this.arr;
        if (arr != null) {
            return arr[4];
        }
        return 0.0f;
    }
    
    public final int e() {
        final List d = this.d;
        if (d == null) {
            return 0;
        }
        return d.size();
    }
    
    public final eha f() {
        final float[] arr = this.arr;
        int mLayoutDirection;
        if (arr != null) {
            mLayoutDirection = (int)arr[5];
        }
        else {
            mLayoutDirection = this.mLayoutDirection;
        }
        return eha.a(mLayoutDirection);
    }
    
    public final eha g() {
        return eha.a(YogaNative.jni_YGNodeStyleGetDirectionJNI(this.a));
    }
    
    public final /* bridge */ ehe h() {
        return this.ab();
    }
    
    public final /* bridge */ ehe i(final int n) {
        final List d = this.d;
        if (d != null) {
            return (YogaNodeJNIBase)d.get(n);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }
    
    public final ehe j() {
        return this.c;
    }
    
    public final ehg k() {
        return ac(YogaNative.jni_YGNodeStyleGetHeightJNI(this.a));
    }
    
    public final ehg l() {
        return ac(YogaNative.jni_YGNodeStyleGetWidthJNI(this.a));
    }
    
    public final Object m() {
        return this.b;
    }
    
    public final long measure(float h, int n, float g, int n2) {
        if (this.e != null) {
            n = epi.K(n);
            n2 = epi.K(n2);
            final Object m = this.m();
            final dsw ab = ((dvd)m).ab();
            ((dvd)m).at();
            final dta p4 = ab.p;
            Label_0068: {
                if (p4 == null) {
                    break Label_0068;
                }
                try {
                    long n3;
                    if (p4.m()) {
                        n3 = 0L;
                    }
                    else {
                        dtz i;
                        if (((dub)m).c) {
                            i = ((dub)m).i;
                        }
                        else {
                            i = null;
                        }
                        final int t = bkx.t(h, n);
                        final int t2 = bkx.t(g, n2);
                        ((dub)m).e = t;
                        ((dub)m).f = t2;
                        dta dta = ((dub)m).a;
                        Label_0470: {
                            if (!dsw.A(dta, ab) && !((dvd)m).aT()) {
                                if (i == null || i.g != t || i.h != t2) {
                                    final dwt dwt = new dwt(Integer.MIN_VALUE, Integer.MIN_VALUE);
                                    ((dtg)ab).Z(p4, (dte)m, t, t2, dwt);
                                    n = dwt.a;
                                    if (n >= 0) {
                                        n2 = dwt.b;
                                        if (n2 >= 0) {
                                            final dtz j = ((dub)m).i;
                                            if (j != null) {
                                                j.g = t;
                                                j.h = t2;
                                                j.e = (float)n;
                                                j.f = (float)n2;
                                            }
                                            break Label_0470;
                                        }
                                    }
                                    final String value = String.valueOf(ab);
                                    final StringBuilder sb = new StringBuilder("MeasureOutput not set, ComponentLifecycle is: ");
                                    sb.append(value);
                                    throw new IllegalStateException(sb.toString());
                                }
                                ((dtg)ab).ax();
                                n = (int)i.e;
                                n2 = (int)i.f;
                            }
                            else {
                                final dsw aa = ((dvd)m).aa();
                                ((dvd)m).bT();
                                dsw ab2;
                                if (ab == (ab2 = aa)) {
                                    if (((dvd)m).ao() != null) {
                                        ab2 = ((dvd)m).ao().ab();
                                        ((dvd)m).ao().at();
                                    }
                                    else {
                                        ab2 = null;
                                    }
                                }
                                if (ab2 != null) {
                                    dta = ab2.p;
                                }
                                final dvd h2 = dvf.h(dta, (dvd)m, t, t2, (pb)null);
                                n = h2.H();
                                n2 = h2.a();
                            }
                        }
                        g = (float)n;
                        ((dub)m).g = g;
                        h = (float)n2;
                        ((dub)m).h = h;
                        n = Float.floatToRawIntBits(g);
                        n2 = Float.floatToRawIntBits(h);
                        n3 = ((long)n2 | (long)n << 32);
                    }
                    return n3;
                }
                catch (final Exception ex) {
                    throw cqj.d(p4, ex);
                }
            }
        }
        throw new RuntimeException("Measure function isn't defined!");
    }
    
    public final void n(final ehe ehe, final int n) {
        if (!(ehe instanceof YogaNodeJNIBase)) {
            return;
        }
        final YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase)ehe;
        if (yogaNodeJNIBase.c == null) {
            if (this.d == null) {
                this.d = new ArrayList(4);
            }
            this.d.add(n, ehe);
            yogaNodeJNIBase.c = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.a, yogaNodeJNIBase.a, n);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }
    
    public final void o(final float n, final float n2) {
        this.ad();
        final ArrayList list = new ArrayList();
        list.add(this);
        final int n3 = 0;
        for (int i = 0; i < list.size(); ++i) {
            final List d = list.get(i).d;
            if (d != null) {
                for (final YogaNodeJNIBase yogaNodeJNIBase : d) {
                    yogaNodeJNIBase.ad();
                    list.add(yogaNodeJNIBase);
                }
            }
        }
        final YogaNodeJNIBase[] array = list.toArray(new YogaNodeJNIBase[list.size()]);
        final long[] array2 = new long[array.length];
        for (int j = n3; j < array.length; ++j) {
            array2[j] = array[j].a;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.a, n, n2, array2, array);
    }
    
    public final void p(final egy egy) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.a, egy.i);
    }
    
    public final void q(final egy egy) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.a, egy.i);
    }
    
    public final void r(final egy egy) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.a, egy.i);
    }
    
    public final void s(final float n) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.a, n);
    }
    
    public final void t(final Object b) {
        this.b = b;
    }
    
    public final void u(final eha eha) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.a, eha.d);
    }
    
    public final void v(final float n) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.a, n);
    }
    
    public final void w(final float n) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.a, n);
    }
    
    public final void x(final float n) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.a, n);
    }
    
    public final void y(final float n) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.a, n);
    }
    
    public final void z(final float n) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.a, n);
    }
}
