import android.view.ViewGroup$LayoutParams;
import android.util.Log;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$MarginLayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ads extends ViewGroup$MarginLayoutParams
{
    public int A;
    public int B;
    public int C;
    public int D;
    boolean E;
    boolean F;
    public float G;
    public float H;
    public String I;
    float J;
    int K;
    public float L;
    public float M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a;
    public boolean aa;
    public boolean ab;
    public String ac;
    public int ad;
    public boolean ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public int al;
    public int am;
    public int an;
    public int ao;
    public int ap;
    public int aq;
    public float ar;
    public int as;
    public int at;
    public float au;
    public act av;
    public boolean aw;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    
    public ads() {
        super(-2, -2);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = true;
        this.F = true;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = null;
        this.J = 0.0f;
        this.K = 1;
        this.L = -1.0f;
        this.M = -1.0f;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1.0f;
        this.W = 1.0f;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.aa = false;
        this.ab = false;
        this.ac = null;
        this.ad = 0;
        this.ae = true;
        this.af = true;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = -1;
        this.am = -1;
        this.an = -1;
        this.ao = -1;
        this.ap = Integer.MIN_VALUE;
        this.aq = Integer.MIN_VALUE;
        this.ar = 0.5f;
        this.av = new act();
        this.aw = false;
    }
    
    public ads(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = true;
        this.F = true;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = null;
        this.J = 0.0f;
        this.K = 1;
        this.L = -1.0f;
        this.M = -1.0f;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1.0f;
        this.W = 1.0f;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.aa = false;
        this.ab = false;
        this.ac = null;
        this.ad = 0;
        this.ae = true;
        this.af = true;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = -1;
        this.am = -1;
        this.an = -1;
        this.ao = -1;
        this.ap = Integer.MIN_VALUE;
        this.aq = Integer.MIN_VALUE;
        this.ar = 0.5f;
        this.av = new act();
        this.aw = false;
        obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(set, aef.b);
        for (int indexCount = ((TypedArray)obtainStyledAttributes).getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = ((TypedArray)obtainStyledAttributes).getIndex(i);
            final int value = adr.a.get(index);
            switch (value) {
                default: {
                    switch (value) {
                        default: {
                            switch (value) {
                                default: {
                                    continue;
                                }
                                case 67: {
                                    this.d = ((TypedArray)obtainStyledAttributes).getBoolean(index, this.d);
                                    continue;
                                }
                                case 66: {
                                    this.ad = ((TypedArray)obtainStyledAttributes).getInt(index, this.ad);
                                    continue;
                                }
                                case 65: {
                                    aeb.e((Object)this, (TypedArray)obtainStyledAttributes, index, 1);
                                    this.F = true;
                                    continue;
                                }
                                case 64: {
                                    aeb.e((Object)this, (TypedArray)obtainStyledAttributes, index, 0);
                                    this.E = true;
                                    continue;
                                }
                            }
                            break;
                        }
                        case 55: {
                            this.C = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.C);
                            continue;
                        }
                        case 54: {
                            this.D = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.D);
                            continue;
                        }
                        case 53: {
                            final int resourceId = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.o);
                            this.o = resourceId;
                            if (resourceId == -1) {
                                this.o = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                continue;
                            }
                            continue;
                        }
                        case 52: {
                            final int resourceId2 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.n);
                            this.n = resourceId2;
                            if (resourceId2 == -1) {
                                this.n = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                continue;
                            }
                            continue;
                        }
                        case 51: {
                            this.ac = ((TypedArray)obtainStyledAttributes).getString(index);
                            continue;
                        }
                        case 50: {
                            this.Y = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.Y);
                            continue;
                        }
                        case 49: {
                            this.X = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.X);
                            continue;
                        }
                        case 48: {
                            this.O = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                            continue;
                        }
                        case 47: {
                            this.N = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                            continue;
                        }
                        case 46: {
                            this.M = ((TypedArray)obtainStyledAttributes).getFloat(index, this.M);
                            continue;
                        }
                        case 45: {
                            this.L = ((TypedArray)obtainStyledAttributes).getFloat(index, this.L);
                            continue;
                        }
                        case 44: {
                            aeb.f(this, ((TypedArray)obtainStyledAttributes).getString(index));
                            continue;
                        }
                    }
                    break;
                }
                case 38: {
                    this.W = Math.max(0.0f, ((TypedArray)obtainStyledAttributes).getFloat(index, this.W));
                    this.Q = 2;
                    break;
                }
                case 37: {
                    try {
                        this.U = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.U);
                    }
                    catch (final Exception ex) {
                        if (((TypedArray)obtainStyledAttributes).getInt(index, this.U) == -2) {
                            this.U = -2;
                        }
                    }
                    break;
                }
                case 36: {
                    try {
                        this.S = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.S);
                    }
                    catch (final Exception ex2) {
                        if (((TypedArray)obtainStyledAttributes).getInt(index, this.S) == -2) {
                            this.S = -2;
                        }
                    }
                    break;
                }
                case 35: {
                    this.V = Math.max(0.0f, ((TypedArray)obtainStyledAttributes).getFloat(index, this.V));
                    this.P = 2;
                    break;
                }
                case 34: {
                    try {
                        this.T = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.T);
                    }
                    catch (final Exception ex3) {
                        if (((TypedArray)obtainStyledAttributes).getInt(index, this.T) == -2) {
                            this.T = -2;
                        }
                    }
                    break;
                }
                case 33: {
                    try {
                        this.R = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.R);
                    }
                    catch (final Exception ex4) {
                        if (((TypedArray)obtainStyledAttributes).getInt(index, this.R) == -2) {
                            this.R = -2;
                        }
                    }
                    break;
                }
                case 32: {
                    final int int1 = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                    this.Q = int1;
                    if (int1 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    }
                    break;
                }
                case 31: {
                    final int int2 = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                    this.P = int2;
                    if (int2 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    }
                    break;
                }
                case 30: {
                    this.H = ((TypedArray)obtainStyledAttributes).getFloat(index, this.H);
                    break;
                }
                case 29: {
                    this.G = ((TypedArray)obtainStyledAttributes).getFloat(index, this.G);
                    break;
                }
                case 28: {
                    this.ab = ((TypedArray)obtainStyledAttributes).getBoolean(index, this.ab);
                    break;
                }
                case 27: {
                    this.aa = ((TypedArray)obtainStyledAttributes).getBoolean(index, this.aa);
                    break;
                }
                case 26: {
                    this.B = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.B);
                    break;
                }
                case 25: {
                    this.A = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.A);
                    break;
                }
                case 24: {
                    this.z = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.z);
                    break;
                }
                case 23: {
                    this.y = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.y);
                    break;
                }
                case 22: {
                    this.x = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.x);
                    break;
                }
                case 21: {
                    this.w = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.w);
                    break;
                }
                case 20: {
                    final int resourceId3 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.v);
                    this.v = resourceId3;
                    if (resourceId3 == -1) {
                        this.v = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 19: {
                    final int resourceId4 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.u);
                    this.u = resourceId4;
                    if (resourceId4 == -1) {
                        this.u = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 18: {
                    final int resourceId5 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.t);
                    this.t = resourceId5;
                    if (resourceId5 == -1) {
                        this.t = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 17: {
                    final int resourceId6 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.s);
                    this.s = resourceId6;
                    if (resourceId6 == -1) {
                        this.s = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 16: {
                    final int resourceId7 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.m);
                    this.m = resourceId7;
                    if (resourceId7 == -1) {
                        this.m = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 15: {
                    final int resourceId8 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.l);
                    this.l = resourceId8;
                    if (resourceId8 == -1) {
                        this.l = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 14: {
                    final int resourceId9 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.k);
                    this.k = resourceId9;
                    if (resourceId9 == -1) {
                        this.k = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 13: {
                    final int resourceId10 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.j);
                    this.j = resourceId10;
                    if (resourceId10 == -1) {
                        this.j = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 12: {
                    final int resourceId11 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.i);
                    this.i = resourceId11;
                    if (resourceId11 == -1) {
                        this.i = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 11: {
                    final int resourceId12 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.h);
                    this.h = resourceId12;
                    if (resourceId12 == -1) {
                        this.h = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 10: {
                    final int resourceId13 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.g);
                    this.g = resourceId13;
                    if (resourceId13 == -1) {
                        this.g = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 9: {
                    final int resourceId14 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.f);
                    this.f = resourceId14;
                    if (resourceId14 == -1) {
                        this.f = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 8: {
                    final int resourceId15 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.e);
                    this.e = resourceId15;
                    if (resourceId15 == -1) {
                        this.e = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 7: {
                    this.c = ((TypedArray)obtainStyledAttributes).getFloat(index, this.c);
                    break;
                }
                case 6: {
                    this.b = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.b);
                    break;
                }
                case 5: {
                    this.a = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.a);
                    break;
                }
                case 4: {
                    final float r = ((TypedArray)obtainStyledAttributes).getFloat(index, this.r) % 360.0f;
                    this.r = r;
                    if (r < 0.0f) {
                        this.r = (360.0f - r) % 360.0f;
                        break;
                    }
                    break;
                }
                case 3: {
                    this.q = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.q);
                    break;
                }
                case 2: {
                    final int resourceId16 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.p);
                    this.p = resourceId16;
                    if (resourceId16 == -1) {
                        this.p = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        break;
                    }
                    break;
                }
                case 1: {
                    this.Z = ((TypedArray)obtainStyledAttributes).getInt(index, this.Z);
                    break;
                }
            }
        }
        ((TypedArray)obtainStyledAttributes).recycle();
        this.a();
    }
    
    public ads(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = true;
        this.F = true;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = null;
        this.J = 0.0f;
        this.K = 1;
        this.L = -1.0f;
        this.M = -1.0f;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1.0f;
        this.W = 1.0f;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.aa = false;
        this.ab = false;
        this.ac = null;
        this.ad = 0;
        this.ae = true;
        this.af = true;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = -1;
        this.am = -1;
        this.an = -1;
        this.ao = -1;
        this.ap = Integer.MIN_VALUE;
        this.aq = Integer.MIN_VALUE;
        this.ar = 0.5f;
        this.av = new act();
        this.aw = false;
        if (!(viewGroup$LayoutParams instanceof ads)) {
            return;
        }
        final ads ads = (ads)viewGroup$LayoutParams;
        this.a = ads.a;
        this.b = ads.b;
        this.c = ads.c;
        this.d = ads.d;
        this.e = ads.e;
        this.f = ads.f;
        this.g = ads.g;
        this.h = ads.h;
        this.i = ads.i;
        this.j = ads.j;
        this.k = ads.k;
        this.l = ads.l;
        this.m = ads.m;
        this.n = ads.n;
        this.o = ads.o;
        this.p = ads.p;
        this.q = ads.q;
        this.r = ads.r;
        this.s = ads.s;
        this.t = ads.t;
        this.u = ads.u;
        this.v = ads.v;
        this.w = ads.w;
        this.x = ads.x;
        this.y = ads.y;
        this.z = ads.z;
        this.A = ads.A;
        this.B = ads.B;
        this.C = ads.C;
        this.D = ads.D;
        this.G = ads.G;
        this.H = ads.H;
        this.I = ads.I;
        this.J = ads.J;
        this.K = ads.K;
        this.L = ads.L;
        this.M = ads.M;
        this.N = ads.N;
        this.O = ads.O;
        this.aa = ads.aa;
        this.ab = ads.ab;
        this.P = ads.P;
        this.Q = ads.Q;
        this.R = ads.R;
        this.T = ads.T;
        this.S = ads.S;
        this.U = ads.U;
        this.V = ads.V;
        this.W = ads.W;
        this.X = ads.X;
        this.Y = ads.Y;
        this.Z = ads.Z;
        this.ae = ads.ae;
        this.af = ads.af;
        this.ag = ads.ag;
        this.ah = ads.ah;
        this.al = ads.al;
        this.am = ads.am;
        this.an = ads.an;
        this.ao = ads.ao;
        this.ap = ads.ap;
        this.aq = ads.aq;
        this.ar = ads.ar;
        this.ac = ads.ac;
        this.ad = ads.ad;
        this.av = ads.av;
        this.E = ads.E;
        this.F = ads.F;
    }
    
    public final void a() {
        this.ah = false;
        this.ae = true;
        this.af = true;
        if (this.width == -2 && this.aa) {
            this.ae = false;
            if (this.P == 0) {
                this.P = 1;
            }
        }
        if (this.height == -2 && this.ab) {
            this.af = false;
            if (this.Q == 0) {
                this.Q = 1;
            }
        }
        if (this.width == 0 || this.width == -1) {
            this.ae = false;
            if (this.width == 0 && this.P == 1) {
                this.width = -2;
                this.aa = true;
            }
        }
        if (this.height == 0 || this.height == -1) {
            this.af = false;
            if (this.height == 0 && this.Q == 1) {
                this.height = -2;
                this.ab = true;
            }
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.ah = true;
        this.ae = true;
        this.af = true;
        if (!(this.av instanceof acw)) {
            this.av = new acw();
        }
        ((acw)this.av).c(this.Z);
    }
    
    public final void resolveLayoutDirection(int n) {
        final int leftMargin = this.leftMargin;
        final int rightMargin = this.rightMargin;
        super.resolveLayoutDirection(n);
        n = this.getLayoutDirection();
        this.an = -1;
        this.ao = -1;
        this.al = -1;
        this.am = -1;
        this.ap = this.w;
        this.aq = this.y;
        final float g = this.G;
        this.ar = g;
        final int a = this.a;
        this.as = a;
        final int b = this.b;
        this.at = b;
        final float c = this.c;
        this.au = c;
        Label_0423: {
            if (n == 1) {
                n = this.s;
                Label_0147: {
                    if (n != -1) {
                        this.an = n;
                    }
                    else {
                        n = this.t;
                        if (n == -1) {
                            n = 0;
                            break Label_0147;
                        }
                        this.ao = n;
                    }
                    n = 1;
                }
                final int u = this.u;
                if (u != -1) {
                    this.am = u;
                    n = 1;
                }
                final int v = this.v;
                if (v != -1) {
                    this.al = v;
                    n = 1;
                }
                final int a2 = this.A;
                if (a2 != Integer.MIN_VALUE) {
                    this.aq = a2;
                }
                final int b2 = this.B;
                if (b2 != Integer.MIN_VALUE) {
                    this.ap = b2;
                }
                if (n != 0) {
                    this.ar = 1.0f - g;
                }
                if (this.ah && this.Z == 1 && this.d) {
                    if (c != -1.0f) {
                        this.au = 1.0f - c;
                        this.as = -1;
                        this.at = -1;
                    }
                    else {
                        if (a != -1) {
                            this.at = a;
                            this.as = -1;
                        }
                        else {
                            if (b == -1) {
                                break Label_0423;
                            }
                            this.as = b;
                            this.at = -1;
                        }
                        this.au = -1.0f;
                    }
                }
            }
            else {
                n = this.s;
                if (n != -1) {
                    this.am = n;
                }
                n = this.t;
                if (n != -1) {
                    this.al = n;
                }
                n = this.u;
                if (n != -1) {
                    this.an = n;
                }
                n = this.v;
                if (n != -1) {
                    this.ao = n;
                }
                n = this.A;
                if (n != Integer.MIN_VALUE) {
                    this.ap = n;
                }
                n = this.B;
                if (n != Integer.MIN_VALUE) {
                    this.aq = n;
                }
            }
        }
        if (this.u == -1 && this.v == -1 && this.t == -1 && this.s == -1) {
            n = this.g;
            if (n != -1) {
                this.an = n;
                if (this.rightMargin <= 0 && rightMargin > 0) {
                    this.rightMargin = rightMargin;
                }
            }
            else {
                n = this.h;
                if (n != -1) {
                    this.ao = n;
                    if (this.rightMargin <= 0 && rightMargin > 0) {
                        this.rightMargin = rightMargin;
                    }
                }
            }
            n = this.e;
            if (n != -1) {
                this.al = n;
                if (this.leftMargin <= 0 && leftMargin > 0) {
                    this.leftMargin = leftMargin;
                }
            }
            else {
                n = this.f;
                if (n != -1) {
                    this.am = n;
                    if (this.leftMargin <= 0 && leftMargin > 0) {
                        this.leftMargin = leftMargin;
                    }
                }
            }
        }
    }
}
