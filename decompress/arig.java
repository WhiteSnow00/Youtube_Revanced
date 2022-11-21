import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arig extends ahcz implements aheo
{
    public static final arig a;
    private static volatile ahev e;
    public boolean b;
    public int c;
    public String d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(arig.class, a = new arig());
    }
    
    private arig() {
        this.d = "";
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = arig.e) == null) {
                    synchronized (arig.class) {
                        if (arig.e == null) {
                            arig.e = (ahev)new ahcs((ahcz)arig.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return arig.a;
            }
            case 4: {
                return new ahcr((ahcz)arig.a);
            }
            case 3: {
                return new arig();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arig.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1008\u0002", new Object[] { "f", "b", "c", "d" });
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
