import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoe extends ahcz implements aheo
{
    public static final apoe a;
    private static volatile ahev i;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ahdp h;
    
    static {
        ahcz.registerDefaultInstance(apoe.class, a = new apoe());
    }
    
    private apoe() {
        this.h = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = apoe.i) == null) {
                    synchronized (apoe.class) {
                        if (apoe.i == null) {
                            apoe.i = (ahev)new ahcs((ahcz)apoe.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apoe.a;
            }
            case 4: {
                return new ahcr((short[][])null);
            }
            case 3: {
                return new apoe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apoe.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u100c\u0003\u0005\u100c\u0004\u0006\u001b", new Object[] { "b", "c", "d", "e", "f", apnx.a(), "g", apnw.a(), "h", apob.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
