import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlx extends ahcz implements aheo
{
    public static final amlx a;
    private static volatile ahev k;
    public int b;
    public ajws c;
    public ajws d;
    public ajws e;
    public int f;
    public aowb g;
    public ahdp h;
    public ahdp i;
    public ajws j;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(amlx.class, a = new amlx());
    }
    
    private amlx() {
        this.l = 2;
        this.h = ahcz.emptyProtobufList();
        this.i = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = amlx.k) == null) {
                    synchronized (amlx.class) {
                        if (amlx.k == null) {
                            amlx.k = (ahev)new ahcs((ahcz)amlx.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return amlx.a;
            }
            case 4: {
                return new ahcr((ahcz)amlx.a);
            }
            case 3: {
                return new amlx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlx.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u041b\u0006\u041b\u0007\u100c\u0003\b\u1409\u0005", new Object[] { "b", "c", "d", "e", "g", "h", aiet.class, "i", aooa.class, "f", ankj.m, "j" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
