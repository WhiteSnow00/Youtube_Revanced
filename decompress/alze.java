import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alze extends ahcz implements aheo
{
    public static final alze a;
    private static volatile ahev m;
    public int b;
    public int c;
    public ahdp d;
    public ajws e;
    public ajws f;
    public CommandOuterClass$Command g;
    public CommandOuterClass$Command h;
    public CommandOuterClass$Command i;
    public amdx j;
    public amdo k;
    public alxw l;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(alze.class, a = new alze());
    }
    
    private alze() {
        this.n = 2;
        this.d = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = alze.m) == null) {
                    synchronized (alze.class) {
                        if (alze.m == null) {
                            alze.m = (ahev)new ahcs((ahcz)alze.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return alze.a;
            }
            case 4: {
                return new ahcr((ahcz)alze.a);
            }
            case 3: {
                return new alze();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alze.a, "\u0001\n\u0000\u0001\u0001\u03e7\n\u0000\u0001\b\u0001\u100c\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0002\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u1009\u0007\n\u1409\b\u03e7\u1409\t", new Object[] { "b", "c", alwa.n, "d", alyy.class, "e", "f", "g", "h", "i", "j", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
