// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.yoga;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public abstract class YogaNodeJNIBase extends ehb implements Cloneable
{
    protected long a;
    private float[] arr;
    public Object b;
    private YogaNodeJNIBase c;
    private List d;
    private bkv e;
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
    
    private static ehd ac(final long n) {
        return new ehd(Float.intBitsToFloat((int)n), (int)(n >> 32));
    }
    
    private final void ad() {
        final Object b = this.b;
        if (b instanceof eha) {
            final dty dty = (dty)b;
            final dva ao = dty.ao();
            if (ao != null && ((dty)ao).d == 8) {
                dty.bw(4);
            }
            if (ao != null) {
                final dtz j = ((dty)ao).j;
                if (j != null && j.s == 2) {
                    dty.bi().k(false);
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
    
    public final void aa(final bkv e) {
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
    
    public final egx f() {
        final float[] arr = this.arr;
        int mLayoutDirection;
        if (arr != null) {
            mLayoutDirection = (int)arr[5];
        }
        else {
            mLayoutDirection = this.mLayoutDirection;
        }
        return egx.a(mLayoutDirection);
    }
    
    public final egx g() {
        return egx.a(YogaNative.jni_YGNodeStyleGetDirectionJNI(this.a));
    }
    
    public final /* bridge */ ehb h() {
        return this.ab();
    }
    
    public final /* bridge */ ehb i(final int n) {
        final List d = this.d;
        if (d != null) {
            return (YogaNodeJNIBase)d.get(n);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }
    
    public final ehb j() {
        return this.c;
    }
    
    public final ehd k() {
        return ac(YogaNative.jni_YGNodeStyleGetHeightJNI(this.a));
    }
    
    public final ehd l() {
        return ac(YogaNative.jni_YGNodeStyleGetWidthJNI(this.a));
    }
    
    public final Object m() {
        return this.b;
    }
    
    public final long measure(float h, int n, float g, int n2) {
        if (this.e != null) {
            n = epf.L(n);
            n2 = epf.L(n2);
            final Object m = this.m();
            final dst ab = ((dva)m).ab();
            ((dva)m).at();
            final dsx p4 = ab.p;
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
                        dtw i;
                        if (((dty)m).c) {
                            i = ((dty)m).i;
                        }
                        else {
                            i = null;
                        }
                        final int h2 = bkw.h(h, n);
                        final int h3 = bkw.h(g, n2);
                        ((dty)m).e = h2;
                        ((dty)m).f = h3;
                        dsx dsx = ((dty)m).a;
                        Label_0470: {
                            if (!dst.A(dsx, ab) && !((dva)m).aT()) {
                                if (i == null || i.g != h2 || i.h != h3) {
                                    final dwq dwq = new dwq(Integer.MIN_VALUE, Integer.MIN_VALUE);
                                    ((dtd)ab).Z(p4, (dtb)m, h2, h3, dwq);
                                    n = dwq.a;
                                    if (n >= 0) {
                                        n2 = dwq.b;
                                        if (n2 >= 0) {
                                            final dtw j = ((dty)m).i;
                                            if (j != null) {
                                                j.g = h2;
                                                j.h = h3;
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
                                ((dtd)ab).ax();
                                n = (int)i.e;
                                n2 = (int)i.f;
                            }
                            else {
                                final dst aa = ((dva)m).aa();
                                ((dva)m).bT();
                                dst ab2;
                                if (ab == (ab2 = aa)) {
                                    if (((dva)m).ao() != null) {
                                        ab2 = ((dva)m).ao().ab();
                                        ((dva)m).ao().at();
                                    }
                                    else {
                                        ab2 = null;
                                    }
                                }
                                if (ab2 != null) {
                                    dsx = ab2.p;
                                }
                                final dva h4 = dvc.h(dsx, (dva)m, h2, h3, (pa)null);
                                n = h4.H();
                                n2 = h4.a();
                            }
                        }
                        g = (float)n;
                        ((dty)m).g = g;
                        h = (float)n2;
                        ((dty)m).h = h;
                        n2 = Float.floatToRawIntBits(g);
                        n = Float.floatToRawIntBits(h);
                        n3 = ((long)n | (long)n2 << 32);
                    }
                    return n3;
                }
                catch (final Exception ex) {
                    throw coy.d(p4, ex);
                }
            }
        }
        throw new RuntimeException("Measure function isn't defined!");
    }
    
    public final void n(final ehb ehb, final int n) {
        if (!(ehb instanceof YogaNodeJNIBase)) {
            return;
        }
        final YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase)ehb;
        if (yogaNodeJNIBase.c == null) {
            if (this.d == null) {
                this.d = new ArrayList(4);
            }
            this.d.add(n, ehb);
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
    
    public final void p(final egv egv) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.a, egv.i);
    }
    
    public final void q(final egv egv) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.a, egv.i);
    }
    
    public final void r(final egv egv) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.a, egv.i);
    }
    
    public final void s(final float n) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.a, n);
    }
    
    public final void t(final Object b) {
        this.b = b;
    }
    
    public final void u(final egx egx) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.a, egx.d);
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
