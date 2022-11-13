import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgi implements jgj
{
    private final int a;
    private final ahbh b;
    
    public jgi(final aicw b, final int a) {
        this.a = a;
        this.b = (ahbh)b;
    }
    
    public jgi(final amte b, final int a) {
        this.a = a;
        this.b = (ahbh)b;
    }
    
    public final aiqj a() {
        if (this.a != 0) {
            final aicw aicw = (aicw)this.b;
            aiqj g;
            if ((aicw.b & 0x4) != 0x0) {
                if ((g = aicw.g) == null) {
                    return aiqj.a;
                }
            }
            else {
                g = null;
            }
            return g;
        }
        aiqj aiqj;
        if ((aiqj = ((amte)this.b).f) == null) {
            aiqj = aiqj.a;
        }
        return aiqj;
    }
    
    public final ajut b() {
        if (this.a != 0) {
            ajut ajut;
            if ((ajut = ((aicw)this.b).d) == null) {
                ajut = ajut.a;
            }
            return ajut;
        }
        ajut ajut2;
        if ((ajut2 = ((amte)this.b).c) == null) {
            ajut2 = ajut.a;
        }
        return ajut2;
    }
    
    public final ajut c() {
        if (this.a != 0) {
            ajut ajut;
            if ((ajut = ((aicw)this.b).c) == null) {
                ajut = ajut.a;
            }
            return ajut;
        }
        ajut ajut2;
        if ((ajut2 = ((amte)this.b).b) == null) {
            ajut2 = ajut.a;
        }
        return ajut2;
    }
    
    public final aotp d() {
        if (this.a != 0) {
            final aicw aicw = (aicw)this.b;
            aotp k;
            if ((aicw.b & 0x40) != 0x0) {
                if ((k = aicw.k) == null) {
                    return aotp.a;
                }
            }
            else {
                k = null;
            }
            return k;
        }
        aotp aotp;
        if ((aotp = ((amte)this.b).i) == null) {
            aotp = aotp.a;
        }
        return aotp;
    }
    
    public final List e() {
        if (this.a != 0) {
            return (List)((aicw)this.b).e;
        }
        return (List)((amte)this.b).d;
    }
    
    public final List f() {
        if (this.a != 0) {
            return (List)((aicw)this.b).f;
        }
        return (List)((amte)this.b).e;
    }
    
    public final byte[] g() {
        if (this.a != 0) {
            return ((aicw)this.b).l.I();
        }
        return null;
    }
    
    public final int h() {
        final int a = this.a;
        int n = 1;
        if (a != 0) {
            final aicw aicw = (aicw)this.b;
            if ((aicw.b & 0x20) != 0x0) {
                final int ae = aefb.ae(aicw.j);
                if (ae != 0) {
                    return ae;
                }
            }
            else {
                n = 0;
            }
            return n;
        }
        final int ae2 = aefb.ae(((amte)this.b).h);
        if (ae2 == 0) {
            return 1;
        }
        return ae2;
    }
}
