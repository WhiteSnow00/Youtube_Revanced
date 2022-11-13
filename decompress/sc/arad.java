import java.util.List;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arad extends ahbh implements ahcw
{
    private static final arad a;
    private static volatile ahdd b;
    private int c;
    private ahbx d;
    private ahbx e;
    private boolean f;
    
    static {
        ahbh.registerDefaultInstance((Class)arad.class, (ahbh)(a = new arad()));
    }
    
    private arad() {
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
    }
    
    public static arad e() {
        return arad.a;
    }
    
    public static arad f() {
        return arad.a;
    }
    
    public static arad g(final InputStream inputStream, final ExtensionRegistryLite extensionRegistryLite) {
        return (arad)ahbh.parseFrom((ahbh)arad.a, inputStream, extensionRegistryLite);
    }
    
    public static arad h(final byte[] array, final ExtensionRegistryLite extensionRegistryLite) {
        return (arad)ahbh.parseFrom((ahbh)arad.a, array, extensionRegistryLite);
    }
    
    public static void j(final arad arad, final int n, final aqzt aqzt) {
        arad.r(n, aqzt);
    }
    
    public static void k(final arad arad, final int n, final aqyp aqyp) {
        arad.q(n, aqyp);
    }
    
    public static void l(final arad arad) {
        arad.n();
    }
    
    private void n() {
        this.c &= 0xFFFFFFFE;
        this.f = false;
    }
    
    private void o() {
        final ahbx e = this.e;
        if (!e.c()) {
            this.e = ahbh.mutableCopy(e);
        }
    }
    
    private void p() {
        final ahbx d = this.d;
        if (!d.c()) {
            this.d = ahbh.mutableCopy(d);
        }
    }
    
    private void q(final int n, final aqyp aqyp) {
        aqyp.getClass();
        this.o();
        this.e.set(n, (Object)aqyp);
    }
    
    private void r(final int n, final aqzt aqzt) {
        aqzt.getClass();
        this.p();
        this.d.set(n, (Object)aqzt);
    }
    
    public int a() {
        return this.e.size();
    }
    
    public int b() {
        return this.d.size();
    }
    
    public aqyp c(final int n) {
        return (aqyp)this.e.get(n);
    }
    
    public aqzt d(final int n) {
        return (aqzt)this.d.get(n);
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = arad.b) == null) {
                    synchronized (arad.class) {
                        if (arad.b == null) {
                            arad.b = (ahdd)new ahba((ahbh)arad.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arad.a;
            }
            case 4: {
                return new ahaz((ahbh)e());
            }
            case 3: {
                return new arad();
            }
            case 2: {
                return newMessageInfo((MessageLite)arad.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u1007\u0000", new Object[] { "c", "d", aqzt.class, "e", aqyp.class, "f" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public List i() {
        return (List)this.d;
    }
    
    public boolean m() {
        return this.f;
    }
}
