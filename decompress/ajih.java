import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajih extends ahcz implements aheo
{
    public static final ajih a;
    private static volatile ahev i;
    public int b;
    public String c;
    public ahdp d;
    public ajht e;
    public boolean f;
    public int g;
    public String h;
    
    static {
        ahcz.registerDefaultInstance(ajih.class, a = new ajih());
    }
    
    private ajih() {
        this.c = "";
        this.d = ahcz.emptyProtobufList();
        this.h = "";
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
                if ((i = ajih.i) == null) {
                    synchronized (ajih.class) {
                        if (ajih.i == null) {
                            ajih.i = (ahev)new ahcs((ahcz)ajih.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajih.a;
            }
            case 4: {
                return new ahcr((ahcz)ajih.a);
            }
            case 3: {
                return new ajih();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajih.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1009\u0001\u0004\u1007\u0002\u0005\u100c\u0003\u0006\u1008\u0004", new Object[] { "b", "c", "d", ajht.class, "e", "f", "g", ajii.a(), "h" });
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
