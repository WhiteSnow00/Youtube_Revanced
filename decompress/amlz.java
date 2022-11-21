import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlz extends ahcz implements aheo
{
    public static final amlz a;
    private static volatile ahev m;
    public int b;
    public ajws c;
    public ajws d;
    public ajws e;
    public akfj f;
    public boolean g;
    public aisc h;
    public aisc i;
    public ahdp j;
    public long k;
    public long l;
    private amma n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(amlz.class, a = new amlz());
    }
    
    private amlz() {
        this.o = 2;
        this.j = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = amlz.m) == null) {
                    synchronized (amlz.class) {
                        if (amlz.m == null) {
                            amlz.m = (ahev)new ahcs((ahcz)amlz.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return amlz.a;
            }
            case 4: {
                return new ahcr((ahcz)amlz.a);
            }
            case 3: {
                return new amlz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlz.a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1007\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\t\u001b\u000b\u1003\n\f\u1003\u000b\r\u1409\u0002", new Object[] { "b", "c", "d", "f", "g", "h", "i", "n", "j", ammn.class, "k", "l", "e" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
