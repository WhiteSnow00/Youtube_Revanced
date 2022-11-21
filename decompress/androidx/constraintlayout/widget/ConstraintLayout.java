// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.view.View$MeasureSpec;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Arrays;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.HashSet;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.res.Resources$NotFoundException;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashMap;
import java.util.ArrayList;
import android.util.SparseArray;
import android.view.ViewGroup;

public class ConstraintLayout extends ViewGroup
{
    final SparseArray a;
    public final ArrayList b;
    protected final acu c;
    public int d;
    protected boolean e;
    public int f;
    final adt g;
    private int h;
    private int i;
    private int j;
    private aeb k;
    private int l;
    private HashMap m;
    private final SparseArray n;
    
    public ConstraintLayout(final Context context) {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new acu();
        this.h = 0;
        this.d = 0;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.g = new adt(this, this);
        this.f(null, 0, 0);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new acu();
        this.h = 0;
        this.d = 0;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.g = new adt(this, this);
        this.f(set, 0, 0);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new acu();
        this.h = 0;
        this.d = 0;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.g = new adt(this, this);
        this.f(set, n, 0);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new acu();
        this.h = 0;
        this.d = 0;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.g = new adt(this, this);
        this.f(set, n, n2);
    }
    
    protected static final ads d() {
        return new ads();
    }
    
    private final void f(AttributeSet obtainStyledAttributes, int n, int indexCount) {
        final acu c = this.c;
        c.ag = this;
        final adt g = this.g;
        c.aG = g;
        c.a.g = g;
        this.a.put(this.getId(), (Object)this);
        this.k = null;
        Label_0339: {
            if (obtainStyledAttributes == null) {
                break Label_0339;
            }
            obtainStyledAttributes = (AttributeSet)this.getContext().obtainStyledAttributes(obtainStyledAttributes, aef.b, n, indexCount);
            indexCount = ((TypedArray)obtainStyledAttributes).getIndexCount();
            n = 0;
        Label_0329_Outer:
            while (true) {
                Label_0335: {
                    if (n >= indexCount) {
                        break Label_0335;
                    }
                    final int index = ((TypedArray)obtainStyledAttributes).getIndex(n);
                    int resourceId;
                    int resourceId2;
                    Label_0323_Outer:Block_11_Outer:
                    while (true) {
                        if (index == 16) {
                            this.h = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(16, this.h);
                            break Label_0329;
                        }
                        if (index == 17) {
                            this.d = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(17, this.d);
                            break Label_0329;
                        }
                        if (index == 14) {
                            this.i = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(14, this.i);
                            break Label_0329;
                        }
                        if (index == 15) {
                            this.j = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(15, this.j);
                            break Label_0329;
                        }
                        if (index == 113) {
                            this.f = ((TypedArray)obtainStyledAttributes).getInt(113, this.f);
                            break Label_0329;
                        }
                        Label_0270: {
                            if (index != 56) {
                                break Label_0270;
                            }
                            resourceId = ((TypedArray)obtainStyledAttributes).getResourceId(56, 0);
                            if (resourceId == 0) {
                                break Label_0329;
                            }
                            try {
                                ss.b(this.getContext(), resourceId, new SparseArray(), new SparseArray());
                                ++n;
                                continue Label_0329_Outer;
                                while (true) {
                                    while (true) {
                                        this.l = resourceId2;
                                        continue Label_0323_Outer;
                                        ((TypedArray)obtainStyledAttributes).recycle();
                                        break Label_0339;
                                        resourceId2 = ((TypedArray)obtainStyledAttributes).getResourceId(34, 0);
                                        try {
                                            (this.k = new aeb()).c(this.getContext(), resourceId2);
                                        }
                                        catch (final Resources$NotFoundException ex) {
                                            this.k = null;
                                        }
                                        continue Block_11_Outer;
                                    }
                                    iftrue(Label_0329:)(index != 34);
                                    continue;
                                }
                                this.c.U(this.f);
                            }
                            catch (final Resources$NotFoundException ex2) {
                                continue;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
    
    private final void g() {
        this.e = true;
    }
    
    private final void h() {
        int inEditMode = this.isInEditMode() ? 1 : 0;
        int n = this.getChildCount();
        for (int i = 0; i < n; ++i) {
            final act rd = this.rD(this.getChildAt(i));
            if (rd != null) {
                rd.s();
            }
        }
        Label_0359: {
            if (inEditMode == 0) {
                break Label_0359;
            }
            int i = 0;
        Label_0353_Outer:
            while (true) {
                if (i >= n) {
                    break Label_0359;
                }
                final View child = this.getChildAt(i);
                String resourceName;
                int id;
                int index;
                String substring;
                int index2;
                String substring2;
                int id2;
                act act;
                View view;
                View viewById;
                Iterator iterator;
                String s;
                HashMap f;
                adp adp;
                adw adw;
                View child2;
                Barrier barrier;
                int id3;
                adx d;
                adx d2;
                int[] ak;
                adq adq;
                acx j;
                act rd2;
                acx k;
                int as;
                act[] ar;
                int length;
                adx d3;
                Barrier barrier2;
                String al;
                adw adw2;
                View a;
                ads ads;
                int al2;
                int am;
                int an;
                int ao;
                int ap;
                int aq;
                float ar2;
                SparseArray n2;
                act act2;
                String l;
                int length2;
                int index3;
                int n3;
                aea e;
                int n4;
                int n5;
                int n6;
                act act3;
                acw acw;
                int as2;
                int q;
                int u;
                float w;
                String substring3;
                float x;
                act u2;
                String substring4;
                float float1;
                String substring5;
                float float2;
                int p;
                int t;
                float v;
                int n7;
                Integer n8;
                int[] ak2;
                View child3;
                aed aed;
                int size;
                int n9;
                HashSet set;
                Iterator iterator2;
                aea e2;
                int n10;
                View child4;
                int n11;
                Guideline guideline;
                ads d4;
                act act4;
                View child5;
                act act5;
                act act6;
                act act7;
                float h;
                aeb m;
                float n13;
                float n12;
                float n15;
                float n14;
                float n16;
                float n17;
                int y;
                act act8;
                int n18;
                View a2;
                int index4;
                act act9;
                int h2;
                Class<? extends View> class1;
                String concat;
                Method method;
                ColorDrawable colorDrawable;
                acu c;
                boolean aj;
                View child6;
                aec aec;
                int n19;
                int n20;
                String substring6;
                acx i2;
                HashMap b;
                Integer value;
                act act10;
                act rd3;
                float au;
                act[] ar3;
                int as3;
                String al3;
                View child7;
                StringBuilder sb;
                View viewById2;
                adx d5;
                ads d6;
                String s2;
                int d7;
                ads layoutParams;
                String resourceEntryName;
                adz b2;
                adq adq2;
                int bottom;
                int left;
                int right;
                int left2;
                float l2;
                float[] al4;
                float r;
                Block_29_Outer:Block_119_Outer:
                while (true) {
                    try {
                        resourceName = this.getResources().getResourceName(child.getId());
                        id = child.getId();
                        if (resourceName instanceof String) {
                            if (this.m == null) {
                                this.m = new HashMap();
                            }
                            index = resourceName.indexOf("/");
                            if (index != -1) {
                                substring = resourceName.substring(index + 1);
                            }
                            else {
                                substring = resourceName;
                            }
                            this.m.put(substring, id);
                        }
                        index2 = resourceName.indexOf(47);
                        substring2 = resourceName;
                        if (index2 != -1) {
                            substring2 = resourceName.substring(index2 + 1);
                        }
                        id2 = child.getId();
                        if (id2 == 0) {
                            act = this.c;
                        }
                        else {
                            if ((view = (View)this.a.get(id2)) == null) {
                                viewById = this.findViewById(id2);
                                if ((view = viewById) != null && (view = viewById) != this) {
                                    view = viewById;
                                    if (viewById.getParent() == this) {
                                        this.onViewAdded(viewById);
                                        view = viewById;
                                    }
                                }
                            }
                            if (view == this) {
                                act = this.c;
                            }
                            else if (view == null) {
                                act = null;
                            }
                            else {
                                act = ((ads)view.getLayoutParams()).av;
                            }
                        }
                        act.ai = substring2;
                        ++i;
                        continue Label_0353_Outer;
                    Label_3109_Outer:
                        while (true) {
                            Label_4116: {
                                while (true) {
                                    Block_88_Outer:Block_95_Outer:Label_2592_Outer:
                                    while (true) {
                                    Label_2592:
                                        while (true) {
                                            while (true) {
                                                while (true) {
                                                    Label_4144:Label_1793_Outer:Block_74_Outer:
                                                    while (true) {
                                                        Label_4142: {
                                                            while (true) {
                                                                Label_1793:Label_3988_Outer:Label_2351_Outer:
                                                                while (true) {
                                                                Label_2351:
                                                                    while (true) {
                                                                    Label_3988:
                                                                        while (true) {
                                                                            Block_126_Outer:Label_4426_Outer:Label_2086_Outer:Block_100_Outer:Block_42_Outer:Block_63_Outer:Block_19_Outer:
                                                                            while (true) {
                                                                                s = (String)iterator.next();
                                                                                adp = f.get(s);
                                                                                iftrue(Label_0855:)(adp.a);
                                                                                Label_0797: {
                                                                                    while (true) {
                                                                                        Label_0370: {
                                                                                        Block_114:
                                                                                            while (true) {
                                                                                                Block_62: {
                                                                                                    while (true) {
                                                                                                    Block_49_Outer:
                                                                                                        while (true) {
                                                                                                            Block_65_Outer:Block_60_Outer:
                                                                                                            while (true) {
                                                                                                                Label_2204:Label_3692_Outer:
                                                                                                                while (true) {
                                                                                                                    Block_59: {
                                                                                                                        while (true) {
                                                                                                                        Label_3692:
                                                                                                                            while (true) {
                                                                                                                            Block_103:
                                                                                                                                while (true) {
                                                                                                                                    Label_4244_Outer:Block_36_Outer:
                                                                                                                                    while (true) {
                                                                                                                                        Block_99: {
                                                                                                                                            while (true) {
                                                                                                                                            Block_35:
                                                                                                                                                while (true) {
                                                                                                                                                    while (true) {
                                                                                                                                                    Label_3506:
                                                                                                                                                        while (true) {
                                                                                                                                                            Label_2741_Outer:Block_105_Outer:
                                                                                                                                                            while (true) {
                                                                                                                                                                while (true) {
                                                                                                                                                                    Label_2741:Label_3196_Outer:Block_39_Outer:
                                                                                                                                                                    while (true) {
                                                                                                                                                                    Label_0749:
                                                                                                                                                                        while (true) {
                                                                                                                                                                        Block_31:
                                                                                                                                                                            while (true) {
                                                                                                                                                                                Label_3196:Block_22_Outer:
                                                                                                                                                                                while (true) {
                                                                                                                                                                                Label_3597_Outer:
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        Label_3810:Label_4000_Outer:Block_69_Outer:
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            Block_107: {
                                                                                                                                                                                            Label_0534_Outer:
                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                    Block_68: {
                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                            Block_24: {
                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                Label_4000:
                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                    Label_3597:
                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                            Block_97: {
                                                                                                                                                                                                                            Block_98:
                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                    Block_57: {
                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                            Label_2086:Label_2929_Outer:
                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                Label_2929:Block_93_Outer:
                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                    Block_70: {
                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                            Label_3479: {
                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                    Label_3378: {
                                                                                                                                                                                                                                                                    Label_3888:
                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                        Label_2279:
                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                Block_51: {
                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            Block_33: {
                                                                                                                                                                                                                                                                                                break Block_33;
                                                                                                                                                                                                                                                                                                adw.d.aj = 1;
                                                                                                                                                                                                                                                                                                barrier = (Barrier)child2;
                                                                                                                                                                                                                                                                                                barrier.setId(id3);
                                                                                                                                                                                                                                                                                                d = adw.d;
                                                                                                                                                                                                                                                                                                barrier.a = d.ah;
                                                                                                                                                                                                                                                                                                barrier.c(d.ai);
                                                                                                                                                                                                                                                                                                d2 = adw.d;
                                                                                                                                                                                                                                                                                                barrier.b.b = d2.ap;
                                                                                                                                                                                                                                                                                                ak = d2.ak;
                                                                                                                                                                                                                                                                                                iftrue(Label_0712:)(ak == null);
                                                                                                                                                                                                                                                                                            Block_102:
                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                    Block_61: {
                                                                                                                                                                                                                                                                                                        Label_1766: {
                                                                                                                                                                                                                                                                                                        Label_2141_Outer:
                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                Label_2252: {
                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                            Block_25: {
                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                        Label_3652: {
                                                                                                                                                                                                                                                                                                                                            Block_90: {
                                                                                                                                                                                                                                                                                                                                                Label_1454:Label_3277_Outer:Label_2667_Outer:
                                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                                Label_2667:
                                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                                        Block_64: {
                                                                                                                                                                                                                                                                                                                                                            Block_112: {
                                                                                                                                                                                                                                                                                                                                                                Label_3277:Block_83_Outer:
                                                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                                                    Block_82: {
                                                                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                                                                        Label_4426:
                                                                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                                                                Block_130: {
                                                                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                                                                        Label_0460_Outer:Block_18_Outer:
                                                                                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                                                                                            Label_4299: {
                                                                                                                                                                                                                                                                                                                                                                                                Block_58: {
                                                                                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                            Block_81: {
                                                                                                                                                                                                                                                                                                                                                                                                                Block_23: {
                                                                                                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                Label_2318: {
                                                                                                                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                        Block_85: {
                                                                                                                                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                Label_0460:Block_72_Outer:
                                                                                                                                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    Label_1896: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            Block_78: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            Block_96_Outer:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Block_71: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                Label_2793: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Block_44: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Label_4390: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Block_120_Outer:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                Block_43: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Block_127: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Block_30: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Block_30;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Label_2576: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                j = adq.i;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break Label_2583;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                rd2.s = 2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Label_3631: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Block_40: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                Block_75: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Block_52: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Block_123: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Label_1943:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Label_4335: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_4335;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ++i;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_4244_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Label_2494:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        as = k.as;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ar = k.ar;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        length = ar.length;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_2540:)(as + 1 <= length);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Block_61;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            d3.ak = aeb.g((View)barrier2, al);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ((adq)barrier2).g(adw2.d.ak);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_2086;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ++n;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_2279;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Label_2198:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_1943;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_2570:)(a == null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Block_58;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Label_2049:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            al = d3.al;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_2086:)(al == null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            continue Label_2086_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Label_3002:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        al2 = ads.al;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        am = ads.am;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        an = ads.an;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ao = ads.ao;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ap = ads.ap;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aq = ads.aq;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ar2 = ads.ar;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n = ads.p;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_3112:)(n == -1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Block_75;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        act2 = (act)n2.get(am);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_3196:)(act2 == null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_3597_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n = -1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_3631;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        length2 = l.length();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        index3 = l.indexOf(44);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_3994:)(index3 <= 0 || index3 >= length2 - 1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Block_112;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Label_2710:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_4244_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_1932:)(n3 >= i);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Block_23;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        child2.setElevation(e.o);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        inEditMode = n4;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = n5;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n = n6;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_1896;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        rd2.O(3, act3, 5, ads.topMargin, ads.x);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_3378;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        adq.e(adq.f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_2318;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        acw.a = -1.0f;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        acw.b = as2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_2929;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_0797;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    q = ads.Q;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n = ads.S;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    u = ads.U;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    w = ads.W;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    rd2.t = q;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    rd2.y = n;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iftrue(Label_4390:)((n = u) != Integer.MAX_VALUE);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Block_127;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    x = Float.parseFloat(substring3);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_4144;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ((ada)u2).Y(rd2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_2793;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_0370;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        float1 = Float.parseFloat(substring4);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        float2 = Float.parseFloat(substring5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (float1 <= 0.0f || float2 <= 0.0f) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_4142;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (n == 1) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            x = Math.abs(float2 / float1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_4144;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        x = Math.abs(float1 / float2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_4144;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    catch (final NumberFormatException ex) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_4142;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_4116;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Label_3329:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n = ads.j;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iftrue(Label_3378:)(n == -1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_4144;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    p = ads.P;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n = ads.R;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    t = ads.T;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v = ads.V;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    rd2.s = p;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    rd2.v = n;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iftrue(Label_4299:)((n = t) != Integer.MAX_VALUE);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Block_123;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    acw.c = -1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_2741;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Label_2248:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n7 = n;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_2252;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    barrier2 = new Barrier(this.getContext());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    barrier2.setId((int)n8);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    d3 = adw2.d;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ak2 = d3.ak;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iftrue(Label_2049:)(ak2 == null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_2929;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.i(rd2, ads, n2, n, 5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_3506;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    continue Label_4426;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Label_2621:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    aed = (aed)child3;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iftrue(Label_2589:)(n >= size);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Block_52;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iftrue(Label_3002:)(!ads.ah);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Block_68;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    rd2.X = x;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    rd2.Y = n;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_3692;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Label_1932:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n9 = inEditMode;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iterator2 = set.iterator();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_1943;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Label_1742:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iftrue(Label_1766:)(Float.isNaN(e2.h));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Block_40;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    child4 = this.getChildAt(n10);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iftrue(Label_2242:)(!(child4 instanceof adq));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_4000;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n11 = n;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n = i;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = n11;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_1896;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iftrue(Label_3238:)(an == -1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Block_81;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iftrue(Label_2201:)(!iterator2.hasNext());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Block_43;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    guideline = new Guideline(this.getContext());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    guideline.setId((int)n8);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    d4 = d();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    adw2.a(d4);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.addView((View)guideline, (ViewGroup$LayoutParams)d4);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    continue Label_1943;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                act4 = (act)n2.get(al2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_3154:)(act4 == null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break Block_78;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                child5 = this.getChildAt(i);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                rd2 = this.rD(child5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_2744:)(rd2 != null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                continue Label_2741;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_4299;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        adq = this.b.get(n);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_2318:)(!adq.isInEditMode());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        continue Block_72_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                act5 = (act)n2.get(n);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_3109:)(act5 == null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break Block_88_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_2630:)(n >= n7);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break Block_62;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                rd2.O(5, act6, 5, ads.bottomMargin, ads.z);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break Label_3479;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            child2.setPivotX(adw.e.h);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_1766;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            rd2.O(3, act7, 3, ads.topMargin, ads.x);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_3378;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Label_3112:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_3157:)(al2 == -1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            continue Block_65_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            h = ads.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_3597:)(h < 0.0f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Block_97;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            rd2.ae = ar2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            continue Block_96_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = this.getChildCount();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        set = new HashSet(m.b.keySet());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n3 = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        continue Label_0460;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n12 = n13 / 2.0f;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n14 = n15 / 2.0f;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n16 = (float)child2.getLeft();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n17 = (float)child2.getTop();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        child2.setPivotX(n12 - n16);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        child2.setPivotY(n14 - n17);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_1793;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    y = ads.Y;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    rd2.Z = n;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    rd2.aa = y;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_3652;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ((adq)child5).b(rd2, this.c.c);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    continue Block_120_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                this.i(rd2, ads, n2, n, 6);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break Label_3506;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                rd2.O(4, act8, 4, ads.rightMargin, aq);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break Label_3277;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                continue Block_126_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_3652:)(inEditMode == 0);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Block_98;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n18 = adq.c[i];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            a2 = this.a(n18);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_2459:)((a = a2) != null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_3888;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Label_2630:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.n.clear();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.n.put(0, (Object)this.c);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            this.n.put(this.getId(), (Object)this.c);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_2667;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            rd2.K(3).f = ads.topMargin;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            rd2.K(5).f = ads.bottomMargin;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_3888;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Label_2938:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_2967:)(as2 == -1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Block_71;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ((adq)barrier).g(ak);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_0749;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_4390;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                n8 = (Integer)iterator2.next();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                adw2 = (adw)m.b.get(n8);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_2198:)(adw2 == null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break Block_44;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_3804:)(!ads.ab);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break Block_107;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                Label_3985: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n = -1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break Label_3988;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                Label_3154:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                continue Label_3196;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_4172:)(x <= 0.0f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                continue Block_49_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            substring4 = l.substring(index3, index4);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            substring5 = l.substring(index4 + 1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_4142:)(substring4.length() <= 0 || substring5.length() <= 0);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            continue Label_4244_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        l = ads.I;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_4166:)(l == null || l.length() == 0);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        continue Label_0460_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Label_0534_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    act9 = (act)n2.get(n);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iftrue(Label_3479:)(act9 == null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break Block_90;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iftrue(Label_2576:)(i >= adq.d);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    continue Label_2667_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                n = ads.i;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_3329:)(n == -1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break Block_85;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                Label_0417: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ++i;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break Label_0370;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    h2 = adp.h;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Label_1266: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (h2 == 0) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_1266;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Label_0964: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Label_1005: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                Label_1046: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Label_1084: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Label_1143: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Label_1184: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                Label_1225: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    switch (h2 - 1) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        default: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_0797;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        case 7: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        case 6: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_0964;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        case 5: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_1005;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        case 4: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_1046;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        case 3: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_1084;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        case 2: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_1143;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        case 1: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_1184;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        case 0: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_1225;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        class1.getMethod(concat, Integer.TYPE).invoke(child2, adp.c);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        continue Label_1454;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        class1.getMethod(concat, Boolean.TYPE).invoke(child2, adp.f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        continue Label_1454;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        class1.getMethod(concat, Integer.TYPE).invoke(child2, adp.c);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        continue Label_1454;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        class1.getMethod(concat, Float.TYPE).invoke(child2, adp.d);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        continue Label_1454;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        class1.getMethod(concat, Integer.TYPE).invoke(child2, adp.g);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        continue Label_1454;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        class1.getMethod(concat, CharSequence.class).invoke(child2, adp.e);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        continue Label_1454;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        class1.getMethod(concat, Float.TYPE).invoke(child2, adp.d);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        continue Label_1454;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        method = class1.getMethod(concat, Drawable.class);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        colorDrawable = new ColorDrawable();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        colorDrawable.setColor(adp.g);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        method.invoke(child2, colorDrawable);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    catch (final InvocationTargetException concat) {}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    catch (final IllegalAccessException concat) {}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    catch (final NoSuchMethodException s) {}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                catch (final InvocationTargetException ex2) {}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                catch (final IllegalAccessException ex3) {}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                catch (final NoSuchMethodException ex4) {}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break Label_2667;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                Label_1921:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            rd2.z = n;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            rd2.A = w;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_4426:)(w <= 0.0f || w >= 1.0f || q != 0);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break Block_130;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_2141:)(adw2.d.aj != 1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        continue Block_95_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                rd2.U = c;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                n2 = this.n;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ads.a();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ads.aw = false;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                rd2.ah = child5.getVisibility();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                aj = ads.aj;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                rd2.ag = child5;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_2866:)(!(child5 instanceof adq));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                continue Block_93_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_3579:)(ar2 < 0.0f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            continue Block_22_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Label_3994: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            index3 = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n = -1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Label_4000;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Label_0555:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_1921:)(id3 == -1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break Block_25;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    iftrue(Label_2741:)(as2 < 0);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    continue Label_2929_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                aec = (aec)child6;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            rd2.O(2, act4, 2, ads.leftMargin, ap);
                                                                                                                                                                                                                                                                                                                                                                                                                                                            continue Label_3196;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            act8 = (act)n2.get(ao);
                                                                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_3277:)(act8 == null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                            continue Label_3277_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    n19 = n3 + 1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    n20 = i;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = n;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    n = n20;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    n3 = n19;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    continue Label_0460;
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                Label_2744: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    ads = (ads)child5.getLayoutParams();
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                c = this.c;
                                                                                                                                                                                                                                                                                                                                                                                                                                                c.aI.add(rd2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                u2 = rd2.U;
                                                                                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_2793:)(u2 == null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                continue Block_18_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            ++n;
                                                                                                                                                                                                                                                                                                                                                                                                                                            continue Label_2592;
                                                                                                                                                                                                                                                                                                                                                                                                                                            Label_4166: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                rd2.X = 0.0f;
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            break Label_3692;
                                                                                                                                                                                                                                                                                                                                                                                                                                            Label_3968:
                                                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_3985:)(!substring6.equalsIgnoreCase("H"));
                                                                                                                                                                                                                                                                                                                                                                                                                                            break Block_114;
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                        act7 = (act)n2.get(n);
                                                                                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_3378:)(act7 == null);
                                                                                                                                                                                                                                                                                                                                                                                                                                        continue Block_22_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                    rd2.Q(2);
                                                                                                                                                                                                                                                                                                                                                                                                                                    continue Label_3888;
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                i2 = adq.i;
                                                                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_2333:)(i2 != null);
                                                                                                                                                                                                                                                                                                                                                                                                                                continue Label_3597_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_1943:)(!adw2.d.b);
                                                                                                                                                                                                                                                                                                                                                                                                                            continue Block_65_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        index4 = l.indexOf(58);
                                                                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_4116:)(index4 < 0 || index4 >= length2 - 1);
                                                                                                                                                                                                                                                                                                                                                                                                                        continue Block_60_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                child2 = this.getChildAt(n3);
                                                                                                                                                                                                                                                                                                                                                                                                                id3 = child2.getId();
                                                                                                                                                                                                                                                                                                                                                                                                                b = m.b;
                                                                                                                                                                                                                                                                                                                                                                                                                value = id3;
                                                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_0555:)(b.containsKey(value));
                                                                                                                                                                                                                                                                                                                                                                                                                break Block_24;
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                            act10 = (act)n2.get(an);
                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_3277:)(act10 == null);
                                                                                                                                                                                                                                                                                                                                                                                                            break Block_82;
                                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_0423:)(this.l == -1);
                                                                                                                                                                                                                                                                                                                                                                                                            continue Label_4244_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_3841:)(ads.height != -1);
                                                                                                                                                                                                                                                                                                                                                                                                        continue Label_3988_Outer;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                k = adq.i;
                                                                                                                                                                                                                                                                                                                                                                                                rd3 = this.rD(a);
                                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_2570:)(rd3 == k);
                                                                                                                                                                                                                                                                                                                                                                                                break Block_59;
                                                                                                                                                                                                                                                                                                                                                                                                Label_2201: {
                                                                                                                                                                                                                                                                                                                                                                                                    n10 = 0;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                break Label_2204;
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            rd2.w = n;
                                                                                                                                                                                                                                                                                                                                                                                            rd2.x = v;
                                                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_4335:)(v <= 0.0f || v >= 1.0f || p != 0);
                                                                                                                                                                                                                                                                                                                                                                                            continue Label_4426_Outer;
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        Label_3804: {
                                                                                                                                                                                                                                                                                                                                                                                            rd2.Q(4);
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        continue Label_3810;
                                                                                                                                                                                                                                                                                                                                                                                        child6 = this.getChildAt(i);
                                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_0417:)(child6.getId() != this.l || !(child6 instanceof aec));
                                                                                                                                                                                                                                                                                                                                                                                        continue Block_83_Outer;
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                    ++n10;
                                                                                                                                                                                                                                                                                                                                                                                    break Label_2204;
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                rd2.t = 2;
                                                                                                                                                                                                                                                                                                                                                                                continue Label_4426;
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                            Label_3238: {
                                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_3277:)(ao == -1);
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                            continue Block_63_Outer;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        iftrue(Label_2741:)(au <= -1.0f);
                                                                                                                                                                                                                                                                                                                                                                        break Block_70;
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                    rd2.O(4, act10, 2, ads.rightMargin, aq);
                                                                                                                                                                                                                                                                                                                                                                    continue Label_3277;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                Label_3509: {
                                                                                                                                                                                                                                                                                                                                                                    n = ads.n;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_3538:)(n == -1);
                                                                                                                                                                                                                                                                                                                                                                break Label_2741_Outer;
                                                                                                                                                                                                                                                                                                                                                                ar3 = k.ar;
                                                                                                                                                                                                                                                                                                                                                                as3 = k.as;
                                                                                                                                                                                                                                                                                                                                                                ar3[as3] = rd3;
                                                                                                                                                                                                                                                                                                                                                                k.as = as3 + 1;
                                                                                                                                                                                                                                                                                                                                                                break Label_0534_Outer;
                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_2710:)(n >= n7);
                                                                                                                                                                                                                                                                                                                                                                break Block_64;
                                                                                                                                                                                                                                                                                                                                                                Label_0712:
                                                                                                                                                                                                                                                                                                                                                                al3 = d2.al;
                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_0749:)(al3 == null);
                                                                                                                                                                                                                                                                                                                                                                break Block_31;
                                                                                                                                                                                                                                                                                                                                                                Label_3430:
                                                                                                                                                                                                                                                                                                                                                                n = ads.l;
                                                                                                                                                                                                                                                                                                                                                                iftrue(Label_3479:)(n == -1);
                                                                                                                                                                                                                                                                                                                                                                break Label_3506;
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            substring6 = l.substring(0, index3);
                                                                                                                                                                                                                                                                                                                                                            iftrue(Label_3968:)(!substring6.equalsIgnoreCase("W"));
                                                                                                                                                                                                                                                                                                                                                            break Block_126_Outer;
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        child7 = this.getChildAt(n);
                                                                                                                                                                                                                                                                                                                                                        this.n.put(child7.getId(), (Object)this.rD(child7));
                                                                                                                                                                                                                                                                                                                                                        ++n;
                                                                                                                                                                                                                                                                                                                                                        continue Label_2667;
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    sb = new StringBuilder();
                                                                                                                                                                                                                                                                                                                                                    sb.append(class1.getName());
                                                                                                                                                                                                                                                                                                                                                    sb.append(" must have a method ");
                                                                                                                                                                                                                                                                                                                                                    sb.append(concat);
                                                                                                                                                                                                                                                                                                                                                    Log.e("TransitionLayout", sb.toString(), (Throwable)s);
                                                                                                                                                                                                                                                                                                                                                    continue Label_1454;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                viewById2 = ((View)child2.getParent()).findViewById(adw.e.j);
                                                                                                                                                                                                                                                                                                                                                iftrue(Label_1793:)(viewById2 == null);
                                                                                                                                                                                                                                                                                                                                                break Label_3196;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            rd2.O(5, act9, 3, ads.bottomMargin, ads.z);
                                                                                                                                                                                                                                                                                                                                            break Label_3479;
                                                                                                                                                                                                                                                                                                                                            iftrue(Label_3723:)(ads.width != -1);
                                                                                                                                                                                                                                                                                                                                            break Block_102;
                                                                                                                                                                                                                                                                                                                                            Label_3686: {
                                                                                                                                                                                                                                                                                                                                                rd2.P(4);
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            break Label_3692;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        iftrue(Label_3738:)(ads.ae);
                                                                                                                                                                                                                                                                                                                                        continue Label_3692_Outer;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    Label_3856: {
                                                                                                                                                                                                                                                                                                                                        rd2.Q(1);
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    rd2.x(ads.height);
                                                                                                                                                                                                                                                                                                                                    iftrue(Label_3888:)(ads.height != -2);
                                                                                                                                                                                                                                                                                                                                    continue Label_2141_Outer;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                set.remove(value);
                                                                                                                                                                                                                                                                                                                                adw = (adw)m.b.get(value);
                                                                                                                                                                                                                                                                                                                                iftrue(Label_1884:)(adw == null);
                                                                                                                                                                                                                                                                                                                                break Label_2592;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            iftrue(Label_1884:)(id3 == -1 || !m.b.containsKey(value));
                                                                                                                                                                                                                                                                                                                            continue Label_3109_Outer;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        d5 = adw2.d;
                                                                                                                                                                                                                                                                                                                        barrier2.a = d5.ah;
                                                                                                                                                                                                                                                                                                                        barrier2.c(d5.ai);
                                                                                                                                                                                                                                                                                                                        d6 = d();
                                                                                                                                                                                                                                                                                                                        ((adq)barrier2).h();
                                                                                                                                                                                                                                                                                                                        adw2.a(d6);
                                                                                                                                                                                                                                                                                                                        this.addView((View)barrier2, (ViewGroup$LayoutParams)d6);
                                                                                                                                                                                                                                                                                                                        continue Block_105_Outer;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                this.c.aI.clear();
                                                                                                                                                                                                                                                                                                                size = this.b.size();
                                                                                                                                                                                                                                                                                                                iftrue(Label_2589:)(size <= 0);
                                                                                                                                                                                                                                                                                                                break Block_51;
                                                                                                                                                                                                                                                                                                                continue Label_3597;
                                                                                                                                                                                                                                                                                                                Label_3157: {
                                                                                                                                                                                                                                                                                                                    iftrue(Label_3196:)(am == -1);
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                continue Block_100_Outer;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            rd2.P(2);
                                                                                                                                                                                                                                                                                                            break Label_2741;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        iftrue(Label_1793:)(Float.isNaN(adw.e.i));
                                                                                                                                                                                                                                                                                                        break Label_2351;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    k.ar = Arrays.copyOf(ar, length + length);
                                                                                                                                                                                                                                                                                                    continue Block_36_Outer;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                iftrue(Label_3686:)(!ads.aa);
                                                                                                                                                                                                                                                                                                break Block_103;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            concat = "set".concat(String.valueOf(s));
                                                                                                                                                                                                                                                                                            continue Label_4000_Outer;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        Label_3738: {
                                                                                                                                                                                                                                                                                            rd2.P(1);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        rd2.C(ads.width);
                                                                                                                                                                                                                                                                                        iftrue(Label_3770:)(ads.width != -2);
                                                                                                                                                                                                                                                                                        continue Label_0534_Outer;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                n = 0;
                                                                                                                                                                                                                                                                                continue Label_2279;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            Label_3841: {
                                                                                                                                                                                                                                                                                rd2.Q(3);
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            rd2.x(0);
                                                                                                                                                                                                                                                                            continue Label_3888;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        s2 = adq.h.get(n18);
                                                                                                                                                                                                                                                                        d7 = adq.d(this, s2);
                                                                                                                                                                                                                                                                        a = a2;
                                                                                                                                                                                                                                                                        iftrue(Label_2459:)(d7 == 0);
                                                                                                                                                                                                                                                                        break Block_57;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    n = ads.k;
                                                                                                                                                                                                                                                                    iftrue(Label_3430:)(n == -1);
                                                                                                                                                                                                                                                                    continue Label_2351_Outer;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            n = ads.m;
                                                                                                                                                                                                                                                            iftrue(Label_3509:)(n == -1);
                                                                                                                                                                                                                                                            continue Label_3597_Outer;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        layoutParams = (ads)child2.getLayoutParams();
                                                                                                                                                                                                                                                        layoutParams.a();
                                                                                                                                                                                                                                                        adw.a(layoutParams);
                                                                                                                                                                                                                                                        f = adw.f;
                                                                                                                                                                                                                                                        class1 = child2.getClass();
                                                                                                                                                                                                                                                        iterator = f.keySet().iterator();
                                                                                                                                                                                                                                                        break Label_0797;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    acw.a = au;
                                                                                                                                                                                                                                                    acw.b = -1;
                                                                                                                                                                                                                                                    continue Label_2929;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                ((adq)barrier2).g(ak2);
                                                                                                                                                                                                                                                continue Label_2086;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            Log.w("ConstraintSet", "id unknown ".concat(String.valueOf(resourceEntryName)));
                                                                                                                                                                                                                                            continue Label_3196_Outer;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        Label_3723: {
                                                                                                                                                                                                                                            rd2.P(3);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        rd2.C(0);
                                                                                                                                                                                                                                        break Label_2741;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    adq.c[i] = d7;
                                                                                                                                                                                                                                    adq.h.put(d7, s2);
                                                                                                                                                                                                                                    a = this.a(d7);
                                                                                                                                                                                                                                    continue Block_100_Outer;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                iftrue(Label_3631:)((n = ads.X) != -1);
                                                                                                                                                                                                                                break Block_99;
                                                                                                                                                                                                                                Label_1457: {
                                                                                                                                                                                                                                    n6 = i;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                n4 = inEditMode;
                                                                                                                                                                                                                                n5 = n;
                                                                                                                                                                                                                                child2.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                                                                                                                                                                                                                                b2 = adw.b;
                                                                                                                                                                                                                                iftrue(Label_1501:)(b2.c != 0);
                                                                                                                                                                                                                                break Block_35;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            rd2.af = h;
                                                                                                                                                                                                                            continue Label_3597;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        ++index3;
                                                                                                                                                                                                                        continue Label_4000;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    adq2 = (adq)child4;
                                                                                                                                                                                                                    continue Block_69_Outer;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                resourceEntryName = child2.getContext().getResources().getResourceEntryName(child2.getId());
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (final Exception ex5) {
                                                                                                                                                                                                                resourceEntryName = "UNKNOWN";
                                                                                                                                                                                                            }
                                                                                                                                                                                                            continue Block_74_Outer;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    acw = (acw)rd2;
                                                                                                                                                                                                    as2 = ads.as;
                                                                                                                                                                                                    n = ads.at;
                                                                                                                                                                                                    au = ads.au;
                                                                                                                                                                                                    iftrue(Label_2938:)(au == -1.0f);
                                                                                                                                                                                                    continue Block_36_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                ++i;
                                                                                                                                                                                                continue Label_2351;
                                                                                                                                                                                            }
                                                                                                                                                                                            rd2.Q(3);
                                                                                                                                                                                            continue Label_3810;
                                                                                                                                                                                        }
                                                                                                                                                                                        rd2.K(2).f = ads.leftMargin;
                                                                                                                                                                                        rd2.K(4).f = ads.rightMargin;
                                                                                                                                                                                        break Label_2741;
                                                                                                                                                                                        Label_0423: {
                                                                                                                                                                                            m = this.k;
                                                                                                                                                                                        }
                                                                                                                                                                                        iftrue(Label_2248:)(m == null);
                                                                                                                                                                                        continue Block_39_Outer;
                                                                                                                                                                                    }
                                                                                                                                                                                    rd2.O(2, act2, 4, ads.leftMargin, ap);
                                                                                                                                                                                    continue Label_3196;
                                                                                                                                                                                }
                                                                                                                                                                                n = viewById2.getTop();
                                                                                                                                                                                bottom = viewById2.getBottom();
                                                                                                                                                                                left = viewById2.getLeft();
                                                                                                                                                                                i = viewById2.getRight();
                                                                                                                                                                                right = child2.getRight();
                                                                                                                                                                                left2 = child2.getLeft();
                                                                                                                                                                                n13 = (float)(left + i);
                                                                                                                                                                                n15 = (float)(n + bottom);
                                                                                                                                                                                iftrue(Label_1793:)(right - left2 <= 0 || child2.getBottom() - child2.getTop() <= 0);
                                                                                                                                                                                continue Label_1793_Outer;
                                                                                                                                                                            }
                                                                                                                                                                            d2.ak = aeb.g((View)barrier, al3);
                                                                                                                                                                            ((adq)barrier).g(adw.d.ak);
                                                                                                                                                                            continue Label_0749;
                                                                                                                                                                        }
                                                                                                                                                                        acw.a = -1.0f;
                                                                                                                                                                        acw.b = -1;
                                                                                                                                                                        acw.c = n;
                                                                                                                                                                        continue Label_2741;
                                                                                                                                                                    }
                                                                                                                                                                    iftrue(Label_3856:)(ads.af);
                                                                                                                                                                    continue Block_19_Outer;
                                                                                                                                                                }
                                                                                                                                                                rd2.r = n;
                                                                                                                                                                continue Label_2741_Outer;
                                                                                                                                                            }
                                                                                                                                                            this.i(rd2, ads, n2, n, 3);
                                                                                                                                                            continue Label_3506;
                                                                                                                                                        }
                                                                                                                                                        act6 = (act)n2.get(n);
                                                                                                                                                        iftrue(Label_3479:)(act6 == null);
                                                                                                                                                        continue Label_1793_Outer;
                                                                                                                                                    }
                                                                                                                                                    child2.setAlpha(adw.b.d);
                                                                                                                                                    child2.setRotation(adw.e.c);
                                                                                                                                                    child2.setRotationX(adw.e.d);
                                                                                                                                                    child2.setRotationY(adw.e.e);
                                                                                                                                                    child2.setScaleX(adw.e.f);
                                                                                                                                                    child2.setScaleY(adw.e.g);
                                                                                                                                                    e2 = adw.e;
                                                                                                                                                    iftrue(Label_1742:)(e2.j == -1);
                                                                                                                                                    continue Label_3692_Outer;
                                                                                                                                                }
                                                                                                                                                child2.setVisibility(b2.b);
                                                                                                                                                continue;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iftrue(Label_3652:)(ads.Y == -1);
                                                                                                                                        continue Block_42_Outer;
                                                                                                                                    }
                                                                                                                                    iftrue(Label_4432:)(i >= n7);
                                                                                                                                    continue Label_2592_Outer;
                                                                                                                                }
                                                                                                                                rd2.P(3);
                                                                                                                                continue Label_3692;
                                                                                                                            }
                                                                                                                            l2 = ads.L;
                                                                                                                            al4 = rd2.al;
                                                                                                                            al4[0] = l2;
                                                                                                                            al4[1] = ads.M;
                                                                                                                            rd2.aj = ads.N;
                                                                                                                            rd2.ak = ads.O;
                                                                                                                            n = ads.ad;
                                                                                                                            iftrue(Label_4244:)(n < 0 || n > 3);
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    iftrue(Label_2494:)(rd3 != null);
                                                                                                                    continue Label_2351_Outer;
                                                                                                                }
                                                                                                                inEditMode = n9;
                                                                                                                n7 = n;
                                                                                                                iftrue(Label_2252:)(n10 >= i);
                                                                                                                continue Label_2592_Outer;
                                                                                                            }
                                                                                                            child2.setTranslationX(adw.e.k);
                                                                                                            child2.setTranslationY(adw.e.l);
                                                                                                            child2.setTranslationZ(adw.e.m);
                                                                                                            e = adw.e;
                                                                                                            inEditMode = n4;
                                                                                                            i = n5;
                                                                                                            n = n6;
                                                                                                            iftrue(Label_1896:)(!e.n);
                                                                                                            continue Block_88_Outer;
                                                                                                        }
                                                                                                        Label_0855: {
                                                                                                            concat = s;
                                                                                                        }
                                                                                                        continue Block_63_Outer;
                                                                                                    }
                                                                                                    Label_4432: {
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                                child3 = this.getChildAt(n);
                                                                                                iftrue(Label_2621:)(child3 instanceof aed);
                                                                                                continue Block_19_Outer;
                                                                                            }
                                                                                            n = 1;
                                                                                            continue Label_3988;
                                                                                        }
                                                                                        iftrue(Label_0423:)(i >= n);
                                                                                        continue Label_3109_Outer;
                                                                                    }
                                                                                }
                                                                                iftrue(Label_1457:)(!iterator.hasNext());
                                                                                continue Block_29_Outer;
                                                                            }
                                                                            n = 0;
                                                                            continue Label_3988;
                                                                        }
                                                                        Label_2333: {
                                                                            i2.as = 0;
                                                                        }
                                                                        Arrays.fill(i2.ar, null);
                                                                        i = 0;
                                                                        continue Label_2351;
                                                                    }
                                                                    child2.setPivotY(adw.e.i);
                                                                    continue Label_1793;
                                                                }
                                                                Label_2967: {
                                                                    iftrue(Label_2741:)(n == -1 || n < 0);
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                        x = 0.0f;
                                                        continue Label_4144;
                                                    }
                                                    act3 = (act)n2.get(n);
                                                    iftrue(Label_3378:)(act3 == null);
                                                    continue Block_119_Outer;
                                                }
                                                Label_3538: {
                                                    n = ads.o;
                                                }
                                                iftrue(Label_3506:)(n == -1);
                                                continue Label_2592_Outer;
                                            }
                                            Label_2589: {
                                                n = 0;
                                            }
                                            continue Label_2592;
                                        }
                                        iftrue(Label_0749:)(!(child2 instanceof Barrier));
                                        continue Block_88_Outer;
                                    }
                                    r = ads.r;
                                    rd2.O(7, act5, 7, ads.q, 0);
                                    rd2.E = r;
                                    continue;
                                }
                            }
                            substring3 = l.substring(index3);
                            iftrue(Label_4142:)(substring3.length() <= 0);
                            continue;
                        }
                    }
                    catch (final Resources$NotFoundException ex6) {
                        continue;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    private final void i(final act act, final ads ads, final SparseArray sparseArray, final int n, final int n2) {
        final View view = (View)this.a.get(n);
        final act act2 = (act)sparseArray.get(n);
        if (act2 != null && view != null && view.getLayoutParams() instanceof ads) {
            ads.ag = true;
            if (n2 == 6) {
                final ads ads2 = (ads)view.getLayoutParams();
                ads2.ag = true;
                ads2.av.F = true;
            }
            act.K(6).j(act2.K(n2), ads.D, ads.C);
            act.F = true;
            act.K(3).d();
            act.K(5).d();
        }
    }
    
    public final View a(final int n) {
        return (View)this.a.get(n);
    }
    
    protected final boolean c() {
        return (this.getContext().getApplicationInfo().flags & 0x400000) != 0x0 && this.getLayoutDirection() == 1;
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof ads;
    }
    
    protected final void dispatchDraw(final Canvas canvas) {
        final ArrayList b = this.b;
        if (b != null) {
            final int size = b.size();
            if (size > 0) {
                for (int i = 0; i < size; ++i) {
                    final adq adq = this.b.get(i);
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.isInEditMode()) {
            final float n = (float)this.getWidth();
            final float n2 = (float)this.getHeight();
            for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j) {
                final View child = this.getChildAt(j);
                if (child.getVisibility() != 8) {
                    final Object tag = child.getTag();
                    if (tag != null && tag instanceof String) {
                        final String[] split = ((String)tag).split(",");
                        if (split.length == 4) {
                            final int int1 = Integer.parseInt(split[0]);
                            final int int2 = Integer.parseInt(split[1]);
                            final int int3 = Integer.parseInt(split[2]);
                            final int int4 = Integer.parseInt(split[3]);
                            final float n3 = int1 / 1080.0f;
                            final float n4 = int2 / 1920.0f;
                            final float n5 = int3 / 1080.0f;
                            final float n6 = int4 / 1920.0f;
                            final Paint paint = new Paint();
                            paint.setColor(-65536);
                            final int n7 = (int)(n4 * n2);
                            final int n8 = (int)(n3 * n);
                            final float n9 = (float)((int)(n5 * n) + n8);
                            final float n10 = (float)n8;
                            final float n11 = (float)n7;
                            canvas.drawLine(n10, n11, n9, n11, paint);
                            final float n12 = (float)(n7 + (int)(n6 * n2));
                            canvas.drawLine(n9, n11, n9, n12, paint);
                            canvas.drawLine(n9, n12, n10, n12, paint);
                            canvas.drawLine(n10, n12, n10, n11, paint);
                            paint.setColor(-16711936);
                            canvas.drawLine(n10, n11, n9, n12, paint);
                            canvas.drawLine(n10, n12, n9, n11, paint);
                        }
                    }
                }
            }
        }
    }
    
    public final void forceLayout() {
        this.g();
        super.forceLayout();
    }
    
    protected final /* bridge */ ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)d();
    }
    
    public final /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ads(this.getContext(), set);
    }
    
    protected final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new ads(viewGroup$LayoutParams);
    }
    
    protected final void onLayout(final boolean b, int i, int n, int n2, int l) {
        n2 = this.getChildCount();
        final boolean inEditMode = this.isInEditMode();
        n = 0;
        View child;
        ads ads;
        act av;
        boolean ak;
        boolean aj;
        int k;
        aed aed;
        for (i = 0; i < n2; ++i) {
            child = this.getChildAt(i);
            ads = (ads)child.getLayoutParams();
            av = ads.av;
            if (child.getVisibility() == 8 && !ads.ah && !ads.ai) {
                ak = ads.ak;
                if (!inEditMode) {
                    continue;
                }
            }
            aj = ads.aj;
            k = av.k();
            l = av.l();
            child.layout(k, l, av.j() + k, av.h() + l);
            if (child instanceof aed) {
                aed = (aed)child;
                throw null;
            }
        }
        n2 = this.b.size();
        if (n2 > 0) {
            adq adq;
            for (i = n; i < n2; ++i) {
                adq = this.b.get(i);
            }
        }
    }
    
    protected final void onMeasure(int resolveSizeAndState, int min) {
        if (!this.e) {
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                if (this.getChildAt(i).isLayoutRequested()) {
                    this.e = true;
                    break;
                }
            }
        }
        this.c.c = this.c();
        if (this.e) {
            this.e = false;
            for (int childCount2 = this.getChildCount(), j = 0; j < childCount2; ++j) {
                if (this.getChildAt(j).isLayoutRequested()) {
                    this.h();
                    final acu c = this.c;
                    c.aH.a(c);
                    break;
                }
            }
        }
        acu c2 = this.c;
        final acl d = c2.d;
        final int f = this.f;
        final int mode = View$MeasureSpec.getMode(resolveSizeAndState);
        final int size = View$MeasureSpec.getSize(resolveSizeAndState);
        int mode2 = View$MeasureSpec.getMode(min);
        final int size2 = View$MeasureSpec.getSize(min);
        final int max = Math.max(0, this.getPaddingTop());
        final int max2 = Math.max(0, this.getPaddingBottom());
        final int e = max + max2;
        int d2 = Math.max(0, this.getPaddingLeft()) + Math.max(0, this.getPaddingRight());
        final int n = Math.max(0, this.getPaddingStart()) + Math.max(0, this.getPaddingEnd());
        if (n > 0) {
            d2 = n;
        }
        final adt g = this.g;
        g.b = max;
        g.c = max2;
        g.d = d2;
        g.e = e;
        g.f = resolveSizeAndState;
        g.g = min;
        int ar = Math.max(0, this.getPaddingStart());
        final int max3 = Math.max(0, this.getPaddingEnd());
        if (ar <= 0 && max3 <= 0) {
            ar = Math.max(0, this.getPaddingLeft());
        }
        else if (this.c()) {
            ar = max3;
        }
        final int n2 = size - d2;
        final int n3 = size2 - e;
        final adt g2 = this.g;
        final int e2 = g2.e;
        final int d3 = g2.d;
        int childCount3 = this.getChildCount();
        int n4 = 0;
        int n5 = 0;
        Label_0486: {
            int max4;
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        n4 = 0;
                    }
                    else {
                        n4 = Math.min(this.i - d3, n2);
                    }
                    n5 = 1;
                    break Label_0486;
                }
                if (childCount3 == 0) {
                    final int h = this.h;
                    childCount3 = 0;
                    max4 = Math.max(0, h);
                }
                else {
                    max4 = 0;
                }
            }
            else {
                if (childCount3 == 0) {
                    n4 = Math.max(0, this.h);
                    n5 = 2;
                    childCount3 = 0;
                    break Label_0486;
                }
                max4 = n2;
            }
            n5 = 2;
            n4 = max4;
        }
        int n6 = 0;
        int min2 = 0;
        Label_0585: {
            int n7;
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        n6 = 1;
                        min2 = 0;
                        break Label_0585;
                    }
                    min2 = Math.min(this.j - e2, n3);
                    n6 = 1;
                    break Label_0585;
                }
                else if (childCount3 == 0) {
                    n7 = Math.max(0, this.d);
                }
                else {
                    n7 = 0;
                }
            }
            else if (childCount3 == 0) {
                n7 = Math.max(0, this.d);
            }
            else {
                n7 = n3;
            }
            final int n8 = 2;
            min2 = n7;
            n6 = n8;
        }
        if (n4 != c2.j() || min2 != c2.h()) {
            c2.a.c = true;
        }
        c2.Z = 0;
        c2.aa = 0;
        final int k = this.i;
        final int[] d4 = c2.D;
        d4[0] = k - d3;
        d4[1] = this.j - e2;
        c2.B(0);
        c2.A(0);
        c2.P(n5);
        c2.C(n4);
        c2.Q(n6);
        c2.x(min2);
        c2.B(this.h - d3);
        c2.A(this.d - e2);
        c2.ar = ar;
        c2.as = max;
        final ajc ah = c2.aH;
        final adt ag = c2.aG;
        final int size3 = c2.aI.size();
        final boolean b = acy.b(f, 128);
        final int l = c2.j();
        final int h2 = c2.h();
        int n9;
        final boolean b2 = (n9 = ((b || acy.b(f, 64)) ? 1 : 0)) != 0;
        Label_0973: {
            if (b2) {
                int n10 = 0;
                while (true) {
                    n9 = (b2 ? 1 : 0);
                    if (n10 >= size3) {
                        break Label_0973;
                    }
                    final act act = c2.aI.get(n10);
                    final int m = act.M();
                    final int n11 = act.N();
                    boolean b3 = m == 3 && n11 == 3 && act.X > 0.0f;
                    if (act.H()) {
                        if (b3) {
                            break;
                        }
                        b3 = false;
                    }
                    if (act.I() && b3) {
                        break;
                    }
                    if (act instanceof acz) {
                        break;
                    }
                    if (act.H()) {
                        break;
                    }
                    if (act.I()) {
                        break;
                    }
                    ++n10;
                }
                n9 = 0;
            }
        }
        int n16 = 0;
        int n17 = 0;
        Label_1045: {
            int n12 = 0;
            while (true) {
                Label_1025: {
                    if ((n12 = mode) != 1073741824) {
                        break Label_1025;
                    }
                    if (mode2 != 1073741824) {
                        n12 = 1073741824;
                        break Label_1025;
                    }
                    final int n13 = 1073741824;
                    final int n14 = 1073741824;
                    final int n15 = 1;
                    n16 = n13;
                    mode2 = n14;
                    n17 = n15;
                    break Label_1045;
                }
                if (b) {
                    final int n13 = n12;
                    final int n14 = mode2;
                    continue;
                }
                break;
            }
            n17 = 0;
            n16 = n12;
        }
        final int n18 = n9 & n17;
        int n34;
        int n35;
        boolean b7;
        if (n18 != 0) {
            final int min3 = Math.min(c2.D[0], n2);
            final int min4 = Math.min(c2.D[1], n3);
            final boolean b4 = n16 != 1073741824;
            if (n16 == 1073741824 && c2.j() != min3) {
                c2.C(min3);
                c2.c();
            }
            final boolean b5 = mode2 != 1073741824;
            if (mode2 == 1073741824 && c2.h() != min4) {
                c2.x(min4);
                c2.c();
            }
            int v = 0;
            int n31 = 0;
            int n32 = 0;
            Label_2434: {
                if (n16 == 1073741824 && mode2 == 1073741824) {
                    final ade a = c2.a;
                    if (a.b || a.c) {
                        final ArrayList ai = a.a.aI;
                        for (int size4 = ai.size(), n19 = 0; n19 < size4; ++n19) {
                            final act act2 = (act)ai.get(n19);
                            act2.r();
                            act2.e = false;
                            act2.h.g();
                            act2.i.g();
                        }
                        a.a.r();
                        final acu a2 = a.a;
                        a2.e = false;
                        a2.h.g();
                        a.a.i.g();
                        a.c = false;
                    }
                    a.d(a.d);
                    final acu a3 = a.a;
                    a3.Z = 0;
                    a3.aa = 0;
                    final int l2 = a3.L(0);
                    final int l3 = a.a.L(1);
                    if (a.b) {
                        a.b();
                    }
                    final acu a4 = a.a;
                    final int k2 = a4.k();
                    final int l4 = a4.l();
                    a4.h.i.c(k2);
                    a.a.i.i.c(l4);
                    a.c();
                    int n20 = l3;
                    int n21 = 0;
                    int n22 = 0;
                    Label_1701: {
                        if (l2 != 2) {
                            n21 = l2;
                            if ((n22 = l3) != 2) {
                                break Label_1701;
                            }
                            n20 = 2;
                        }
                        n21 = l2;
                        n22 = n20;
                        if (b) {
                            final ArrayList e3 = a.e;
                            final int size5 = e3.size();
                            int n23 = 0;
                            while (n23 < size5) {
                                final boolean e4 = ((ado)e3.get(n23)).e();
                                ++n23;
                                if (!e4) {
                                    n21 = l2;
                                    n22 = n20;
                                    break Label_1701;
                                }
                            }
                            int n24;
                            if ((n24 = l2) == 2) {
                                a.a.P(1);
                                final acu a5 = a.a;
                                a5.C(a.a(a5, 0));
                                final acu a6 = a.a;
                                a6.h.f.c(a6.j());
                                n24 = 2;
                            }
                            n21 = n24;
                            if ((n22 = n20) == 2) {
                                a.a.Q(1);
                                final acu a7 = a.a;
                                a7.x(a.a(a7, 1));
                                final acu a8 = a.a;
                                a8.i.f.c(a8.h());
                                n22 = n20;
                                n21 = n24;
                            }
                        }
                    }
                    final acu a9 = a.a;
                    final int n25 = a9.aq[0];
                    boolean b6;
                    if (n25 != 1 && n25 != 4) {
                        b6 = false;
                    }
                    else {
                        final int n26 = a9.j() + k2;
                        a9.h.j.c(n26);
                        a.a.h.f.c(n26 - k2);
                        a.c();
                        final acu a10 = a.a;
                        final int n27 = a10.aq[1];
                        if (n27 == 1 || n27 == 4) {
                            final int n28 = a10.h() + l4;
                            a10.i.j.c(n28);
                            a.a.i.f.c(n28 - l4);
                        }
                        a.c();
                        b6 = true;
                    }
                    final ArrayList e5 = a.e;
                    for (int size6 = e5.size(), n29 = 0; n29 < size6; ++n29) {
                        final ado ado = (ado)e5.get(n29);
                        if (ado.d != a.a || ado.h) {
                            ado.c();
                        }
                    }
                    final ArrayList e6 = a.e;
                    while (true) {
                        for (int size7 = e6.size(), n30 = 0; n30 < size7; ++n30) {
                            final ado ado2 = (ado)e6.get(n30);
                            if (b6 || ado2.d != a.a) {
                                if (ado2.i.i) {
                                    if (ado2.j.i || ado2 instanceof adi) {
                                        if (ado2.f.i || ado2 instanceof adc || ado2 instanceof adi) {
                                            continue;
                                        }
                                    }
                                }
                                v = 0;
                                a.a.P(n21);
                                a.a.Q(n22);
                                n31 = n18;
                                n32 = 2;
                                break Label_2434;
                            }
                        }
                        v = 1;
                        continue;
                    }
                }
                final ade a11 = c2.a;
                if (a11.b) {
                    final ArrayList ai2 = a11.a.aI;
                    for (int size8 = ai2.size(), n33 = 0; n33 < size8; ++n33) {
                        final act act3 = (act)ai2.get(n33);
                        act3.r();
                        act3.e = false;
                        final adk h3 = act3.h;
                        h3.f.i = false;
                        h3.h = false;
                        h3.g();
                        final adm i2 = act3.i;
                        i2.f.i = false;
                        i2.h = false;
                        i2.g();
                    }
                    a11.a.r();
                    final acu a12 = a11.a;
                    a12.e = false;
                    final adk h4 = a12.h;
                    h4.f.i = false;
                    h4.h = false;
                    h4.g();
                    final adm i3 = a11.a.i;
                    i3.f.i = false;
                    i3.h = false;
                    i3.g();
                    a11.b();
                    n31 = n18;
                }
                else {
                    n31 = n18;
                }
                a11.d(a11.d);
                final acu a13 = a11.a;
                a13.Z = 0;
                a13.aa = 0;
                a13.h.i.c(0);
                a11.a.i.i.c(0);
                if (n16 == 1073741824) {
                    v = (c2.V(b, 0) ? 1 : 0);
                    n32 = 1;
                }
                else {
                    n32 = 0;
                    v = 1;
                }
                if (mode2 == 1073741824) {
                    v &= (c2.V(b, 1) ? 1 : 0);
                    ++n32;
                }
            }
            n34 = v;
            n35 = n32;
            b7 = (n31 != 0);
            if (v != 0) {
                c2.D(b4 ^ true, b5 ^ true);
                n34 = v;
                n35 = n32;
                b7 = (n31 != 0);
            }
        }
        else {
            n34 = 0;
            n35 = 0;
            b7 = (n18 != 0);
        }
        if (n34 == 0 || n35 != 2) {
            final int ax = c2.ax;
            if (size3 > 0) {
                final int size9 = c2.aI.size();
                final boolean w = c2.W(64);
                final adt ag2 = c2.aG;
                for (int n36 = 0; n36 < size9; ++n36) {
                    final act act4 = c2.aI.get(n36);
                    if (!(act4 instanceof acw) && !(act4 instanceof acq)) {
                        final boolean g3 = act4.G;
                        if (w) {
                            final adk h5 = act4.h;
                            if (h5 != null) {
                                final adm i4 = act4.i;
                                if (i4 != null && h5.f.i && i4.f.i) {
                                    continue;
                                }
                            }
                        }
                        final int l5 = act4.L(0);
                        final int l6 = act4.L(1);
                        int n37 = l5;
                        int n38 = l6;
                        int n39 = 0;
                        boolean b8 = false;
                        Label_2728: {
                            if (l5 == 3) {
                                if (act4.s != 1 && l6 == 3) {
                                    if (act4.t != 1) {
                                        n39 = 3;
                                        n38 = 3;
                                        b8 = true;
                                        break Label_2728;
                                    }
                                    n37 = 3;
                                    n38 = 3;
                                }
                                else {
                                    n37 = 3;
                                    n38 = l6;
                                }
                            }
                            b8 = false;
                            n39 = n37;
                        }
                        if (!b8) {
                            if (c2.W(1) && !(act4 instanceof acz)) {
                                boolean b10;
                                final boolean b9 = b10 = (n39 == 3 && act4.s == 0 && n38 != 3 && !act4.H());
                                if (n38 == 3) {
                                    b10 = b9;
                                    if (act4.t == 0) {
                                        b10 = b9;
                                        if (n39 != 3) {
                                            b10 = b9;
                                            if (!act4.H()) {
                                                b10 = true;
                                            }
                                        }
                                    }
                                }
                                if (n39 == 3 || n38 == 3) {
                                    if (act4.X > 0.0f) {
                                        continue;
                                    }
                                }
                                if (b10) {
                                    continue;
                                }
                            }
                            ah.b(ag2, act4, 0);
                        }
                    }
                }
                for (int childCount4 = ag2.a.getChildCount(), n40 = 0; n40 < childCount4; ++n40) {
                    final View child = ag2.a.getChildAt(n40);
                    if (child instanceof aed) {
                        final aed aed = (aed)child;
                        final ConstraintLayout a14 = ag2.a;
                        throw null;
                    }
                }
                final int size10 = ag2.a.b.size();
                if (size10 > 0) {
                    for (int n41 = 0; n41 < size10; ++n41) {
                        final adq adq = ag2.a.b.get(n41);
                        final ConstraintLayout a15 = ag2.a;
                    }
                }
            }
            ah.a(c2);
            final int size11 = ((ArrayList)ah.c).size();
            if (size3 > 0) {
                ah.c(c2, 0, l, h2);
            }
            int n49 = 0;
            Label_3750: {
                acu acu;
                if (size11 > 0) {
                    final int m2 = c2.M();
                    final int n42 = c2.N();
                    int n43 = Math.max(c2.j(), ((act)ah.a).ac);
                    int max5 = Math.max(c2.h(), ((act)ah.a).ad);
                    boolean b11 = false;
                    int n45;
                    for (int n44 = 0; n44 < size11; ++n44, n43 = n45) {
                        final act act5 = ((ArrayList)ah.c).get(n44);
                        if (act5 instanceof acz) {
                            final int j2 = act5.j();
                            final int h6 = act5.h();
                            final boolean b12 = ah.b(ag, act5, 1);
                            final int j3 = act5.j();
                            boolean b13 = b11 | b12;
                            final int h7 = act5.h();
                            int max6 = n43;
                            if (j3 != j2) {
                                act5.C(j3);
                                max6 = n43;
                                if (m2 == 2 && act5.i() > (max6 = n43)) {
                                    max6 = Math.max(n43, act5.i() + act5.K(4).b());
                                }
                                b13 = true;
                            }
                            int max7 = max5;
                            if (h7 != h6) {
                                act5.x(h7);
                                max7 = max5;
                                if (n42 == 2 && act5.g() > (max7 = max5)) {
                                    max7 = Math.max(max5, act5.g() + act5.K(5).b());
                                }
                                b13 = true;
                            }
                            final acz acz = (acz)act5;
                            final boolean b14 = b13;
                            n45 = max6;
                            max5 = max7;
                            b11 = b14;
                        }
                        else {
                            n45 = n43;
                        }
                    }
                    int n46 = 0;
                    boolean b15 = b11;
                    int n47 = max5;
                    final int n48 = size11;
                    final adt adt = ag;
                    while (true) {
                        acu = c2;
                        n49 = ax;
                        if (n46 >= 2) {
                            break;
                        }
                        final int n50 = 0;
                        int max8 = n47;
                        for (int n51 = n50; n51 < n48; ++n51) {
                            final act act6 = ((ArrayList)ah.c).get(n51);
                            if ((!(act6 instanceof acx) || act6 instanceof acz) && !(act6 instanceof acw) && act6.ah != 8 && (!b7 || !act6.h.f.i || !act6.i.f.i) && !(act6 instanceof acz)) {
                                final int j4 = act6.j();
                                final int h8 = act6.h();
                                final int ab = act6.ab;
                                int n52 = 1;
                                if (n46 == 1) {
                                    n52 = 2;
                                }
                                b15 |= ah.b(adt, act6, n52);
                                final int j5 = act6.j();
                                final int h9 = act6.h();
                                if (j5 != j4) {
                                    act6.C(j5);
                                    if (m2 == 2 && act6.i() > n43) {
                                        n43 = Math.max(n43, act6.i() + act6.K(4).b());
                                    }
                                    b15 = true;
                                }
                                if (h9 != h8) {
                                    act6.x(h9);
                                    if (n42 == 2 && act6.g() > max8) {
                                        max8 = Math.max(max8, act6.g() + act6.K(5).b());
                                    }
                                    b15 = true;
                                }
                                if (act6.F && ab != act6.ab) {
                                    b15 = true;
                                }
                            }
                        }
                        if (!b15) {
                            n49 = ax;
                            break Label_3750;
                        }
                        ++n46;
                        ah.c(c2, n46, l, h2);
                        b15 = false;
                        n47 = max8;
                    }
                }
                else {
                    n49 = ax;
                    acu = c2;
                }
                c2 = acu;
            }
            c2.U(n49);
        }
        final int j6 = this.c.j();
        final int h10 = this.c.h();
        final acu c3 = this.c;
        final boolean ay = c3.ay;
        final boolean az = c3.az;
        final adt g4 = this.g;
        final int e7 = g4.e;
        resolveSizeAndState = resolveSizeAndState(j6 + g4.d, resolveSizeAndState, 0);
        final int resolveSizeAndState2 = resolveSizeAndState(h10 + e7, min, 0);
        min = Math.min(this.i, resolveSizeAndState & 0xFFFFFF);
        final int min5 = Math.min(this.j, resolveSizeAndState2 & 0xFFFFFF);
        resolveSizeAndState = min;
        if (ay) {
            resolveSizeAndState = (min | 0x1000000);
        }
        min = min5;
        if (az) {
            min = (min5 | 0x1000000);
        }
        this.setMeasuredDimension(resolveSizeAndState, min);
    }
    
    public final void onViewAdded(final View view) {
        super.onViewAdded(view);
        final act rd = this.rD(view);
        if (view instanceof Guideline && !(rd instanceof acw)) {
            final ads ads = (ads)view.getLayoutParams();
            ads.av = new acw();
            ads.ah = true;
            ((acw)ads.av).c(ads.Z);
        }
        if (view instanceof adq) {
            final adq adq = (adq)view;
            adq.h();
            ((ads)view.getLayoutParams()).ai = true;
            if (!this.b.contains(adq)) {
                this.b.add(adq);
            }
        }
        this.a.put(view.getId(), (Object)view);
        this.e = true;
    }
    
    public final void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.Y(this.rD(view));
        this.b.remove(view);
        this.e = true;
    }
    
    public final act rD(final View view) {
        if (view == this) {
            return this.c;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof ads) {
                return ((ads)view.getLayoutParams()).av;
            }
            view.setLayoutParams(this.generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof ads) {
                return ((ads)view.getLayoutParams()).av;
            }
        }
        return null;
    }
    
    public final Object rE(final Object o) {
        if (o instanceof String) {
            final HashMap m = this.m;
            if (m != null && m.containsKey(o)) {
                return this.m.get(o);
            }
        }
        return null;
    }
    
    public final void requestLayout() {
        this.g();
        super.requestLayout();
    }
    
    public final void setId(final int id) {
        this.a.remove(this.getId());
        super.setId(id);
        this.a.put(this.getId(), (Object)this);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
