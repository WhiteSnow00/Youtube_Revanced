import java.util.List;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcy extends ahcz implements aheo
{
    private static final arcy a;
    private static volatile ahev b;
    private int c;
    private ahdp d;
    private ahdp e;
    private boolean f;
    
    static {
        ahcz.registerDefaultInstance(arcy.class, a = new arcy());
    }
    
    private arcy() {
        this.d = ahcz.emptyProtobufList();
        this.e = ahcz.emptyProtobufList();
    }
    
    public static arcy e() {
        return arcy.a;
    }
    
    public static arcy f() {
        return arcy.a;
    }
    
    public static arcy g(final InputStream inputStream, final ExtensionRegistryLite extensionRegistryLite) {
        return (arcy)ahcz.parseFrom(arcy.a, inputStream, extensionRegistryLite);
    }
    
    public static arcy h(final byte[] array, final ExtensionRegistryLite extensionRegistryLite) {
        return (arcy)ahcz.parseFrom(arcy.a, array, extensionRegistryLite);
    }
    
    public static void j(final arcy arcy, final int n, final arco arco) {
        arcy.r(n, arco);
    }
    
    public static void k(final arcy arcy, final int n, final arbk arbk) {
        arcy.q(n, arbk);
    }
    
    public static void l(final arcy arcy) {
        arcy.n();
    }
    
    private void n() {
        this.c &= 0xFFFFFFFE;
        this.f = false;
    }
    
    private void o() {
        final ahdp e = this.e;
        if (!e.c()) {
            this.e = ahcz.mutableCopy(e);
        }
    }
    
    private void p() {
        final ahdp d = this.d;
        if (!d.c()) {
            this.d = ahcz.mutableCopy(d);
        }
    }
    
    private void q(final int n, final arbk arbk) {
        arbk.getClass();
        this.o();
        this.e.set(n, (Object)arbk);
    }
    
    private void r(final int n, final arco arco) {
        arco.getClass();
        this.p();
        this.d.set(n, (Object)arco);
    }
    
    public int a() {
        return this.e.size();
    }
    
    public int b() {
        return this.d.size();
    }
    
    public arbk c(final int n) {
        return (arbk)this.e.get(n);
    }
    
    public arco d(final int n) {
        return (arco)this.d.get(n);
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = arcy.b) == null) {
                    synchronized (arcy.class) {
                        if (arcy.b == null) {
                            arcy.b = (ahev)new ahcs((ahcz)arcy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arcy.a;
            }
            case 4: {
                return new ahcr((ahcz)e());
            }
            case 3: {
                return new arcy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arcy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u1007\u0000", new Object[] { "c", "d", arco.class, "e", arbk.class, "f" });
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
