import java.util.List;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxp extends agzi implements ahax
{
    private static final aqxp a;
    private static volatile ahbe b;
    private int c;
    private agzy d;
    private agzy e;
    private boolean f;
    
    static {
        agzi.registerDefaultInstance(aqxp.class, a = new aqxp());
    }
    
    private aqxp() {
        this.d = agzi.emptyProtobufList();
        this.e = agzi.emptyProtobufList();
    }
    
    public static /* synthetic */ aqxp e() {
        return aqxp.a;
    }
    
    public static aqxp f() {
        return aqxp.a;
    }
    
    public static aqxp g(final InputStream inputStream, final ExtensionRegistryLite extensionRegistryLite) {
        return (aqxp)agzi.parseFrom(aqxp.a, inputStream, extensionRegistryLite);
    }
    
    public static aqxp h(final byte[] array, final ExtensionRegistryLite extensionRegistryLite) {
        return (aqxp)agzi.parseFrom(aqxp.a, array, extensionRegistryLite);
    }
    
    private void n() {
        this.c &= 0xFFFFFFFE;
        this.f = false;
    }
    
    private void o() {
        final agzy e = this.e;
        if (!e.c()) {
            this.e = agzi.mutableCopy(e);
        }
    }
    
    private void p() {
        final agzy d = this.d;
        if (!d.c()) {
            this.d = agzi.mutableCopy(d);
        }
    }
    
    private void q(final int n, final aqwb aqwb) {
        aqwb.getClass();
        this.o();
        this.e.set(n, (Object)aqwb);
    }
    
    private void r(final int n, final aqxf aqxf) {
        aqxf.getClass();
        this.p();
        this.d.set(n, (Object)aqxf);
    }
    
    public int a() {
        return this.e.size();
    }
    
    public int b() {
        return this.d.size();
    }
    
    public aqwb c(final int n) {
        return (aqwb)this.e.get(n);
    }
    
    public aqxf d(final int n) {
        return (aqxf)this.d.get(n);
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
                if ((b = aqxp.b) == null) {
                    synchronized (aqxp.class) {
                        if (aqxp.b == null) {
                            aqxp.b = (ahbe)new agzb((agzi)aqxp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqxp.a;
            }
            case 4: {
                return new agza((agzi)e());
            }
            case 3: {
                return new aqxp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u1007\u0000", new Object[] { "c", "d", aqxf.class, "e", aqwb.class, "f" });
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
