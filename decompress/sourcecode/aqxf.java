import java.util.List;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxf extends agzi implements aqxg
{
    private static final aqxf a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private int e;
    private aqxd f;
    private ahdw g;
    private ahdv h;
    private int i;
    private agzy j;
    private ahdw k;
    private long l;
    private aqyk m;
    
    static {
        agzi.registerDefaultInstance(aqxf.class, a = new aqxf());
    }
    
    private aqxf() {
        this.j = agzi.emptyProtobufList();
    }
    
    private void C(final aqwp aqwp) {
        aqwp.getClass();
        this.F();
        this.j.add((Object)aqwp);
    }
    
    private void D() {
        this.c &= 0xFFFFFF7F;
        this.l = 0L;
    }
    
    private void E() {
        this.j = agzi.emptyProtobufList();
    }
    
    private void F() {
        final agzy j = this.j;
        if (!j.c()) {
            this.j = agzi.mutableCopy(j);
        }
    }
    
    private void G(final ahdv h) {
        h.getClass();
        this.h = h;
        this.c |= 0x10;
    }
    
    private void H(final int e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void I(final ahdw g) {
        g.getClass();
        this.g = g;
        this.c |= 0x8;
    }
    
    private void J(final aqxd f) {
        f.getClass();
        this.f = f;
        this.c |= 0x4;
    }
    
    private void K(final int d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    public static aqxe j() {
        return (aqxe)aqxf.a.createBuilder();
    }
    
    public static aqxf l() {
        return aqxf.a;
    }
    
    public static aqxf m(final byte[] array, final ExtensionRegistryLite extensionRegistryLite) {
        return (aqxf)agzi.parseFrom(aqxf.a, array, extensionRegistryLite);
    }
    
    public boolean A() {
        return (this.c & 0x40) != 0x0;
    }
    
    public boolean B() {
        return (this.c & 0x20) != 0x0;
    }
    
    public int a() {
        return this.e;
    }
    
    public int b() {
        return this.j.size();
    }
    
    public int c() {
        return this.d;
    }
    
    public int d() {
        return this.i;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aqxf.b) == null) {
                    synchronized (aqxf.class) {
                        if (aqxf.b == null) {
                            aqxf.b = (ahbe)new agzb((agzi)aqxf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqxf.a;
            }
            case 4: {
                return new aqxe();
            }
            case 3: {
                return new aqxf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxf.a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1004\u0005\u0006\u001b\u0007\u1002\u0007\t\u1009\b\n\u1009\u0006\u000b\u1009\u0004", new Object[] { "c", "d", "e", "f", "g", "i", "j", aqwp.class, "l", "m", "k", "h" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public long e() {
        return this.l;
    }
    
    public ahdw f() {
        ahdw ahdw;
        if ((ahdw = this.g) == null) {
            ahdw = ahdw.a;
        }
        return ahdw;
    }
    
    public ahdw g() {
        ahdw ahdw;
        if ((ahdw = this.k) == null) {
            ahdw = ahdw.a;
        }
        return ahdw;
    }
    
    public aqwp h(final int n) {
        return (aqwp)this.j.get(0);
    }
    
    public aqxd i() {
        aqxd aqxd;
        if ((aqxd = this.f) == null) {
            aqxd = aqxd.a;
        }
        return aqxd;
    }
    
    public aqyk n() {
        aqyk aqyk;
        if ((aqyk = this.m) == null) {
            aqyk = aqyk.a;
        }
        return aqyk;
    }
    
    public List o() {
        return (List)this.j;
    }
    
    public boolean x() {
        return (this.c & 0x100) != 0x0;
    }
    
    public boolean y() {
        return (this.c & 0x8) != 0x0;
    }
    
    public boolean z() {
        return (this.c & 0x4) != 0x0;
    }
}
