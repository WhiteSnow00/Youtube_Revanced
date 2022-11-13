import java.util.Arrays;
import j$.util.Optional;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gly implements glm
{
    private final aotp a;
    private final String b;
    private final aiqj c;
    private final aiqj d;
    private final aiqj e;
    private final ajut f;
    private final List g;
    private final boolean h;
    private final boolean i;
    private final glp j;
    private Optional k;
    private final boolean l;
    private final float m;
    private final boolean n;
    private final boolean o;
    private final int p;
    
    public gly(final aotp a, final String b, final aiqj c, final aiqj d, final aiqj e, final ajut f, final aotd[] array, final boolean h, final boolean i, final glp j, final Optional k, final boolean l, final float m, final boolean n, final boolean o, final int p16) {
        this.k = Optional.empty();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        List<aotd> list;
        if (array == null) {
            list = null;
        }
        else {
            list = Arrays.asList(array);
        }
        this.g = list;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p16;
    }
    
    @Override
    public final float a() {
        return this.m;
    }
    
    @Override
    public final glp b() {
        return this.j;
    }
    
    @Override
    public final aiqj c() {
        return this.c;
    }
    
    @Override
    public final aiqj d() {
        return this.d;
    }
    
    @Override
    public final aiqj e() {
        return this.e;
    }
    
    @Override
    public final ajut f() {
        return this.f;
    }
    
    @Override
    public final aotp g() {
        return this.a;
    }
    
    @Override
    public final Optional h() {
        return this.k;
    }
    
    @Override
    public final String i() {
        return this.b;
    }
    
    @Override
    public final List j() {
        return this.g;
    }
    
    @Override
    public final boolean k() {
        return this.o;
    }
    
    @Override
    public final boolean l() {
        return this.n;
    }
    
    @Override
    public final boolean m() {
        return this.l;
    }
    
    @Override
    public final boolean n() {
        return this.h;
    }
    
    @Override
    public final boolean o() {
        return this.i;
    }
    
    @Override
    public final boolean p() {
        return glb.j(this);
    }
    
    @Override
    public final boolean q() {
        return glb.k(this);
    }
    
    @Override
    public final boolean r(final glm glm) {
        return glb.l(this, glm);
    }
    
    @Override
    public final int s() {
        return this.p;
    }
    
    @Override
    public final int t() {
        return 4;
    }
    
    @Override
    public final void u() {
        glb.m(this);
    }
}
