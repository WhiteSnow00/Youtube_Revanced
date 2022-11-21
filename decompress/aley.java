import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aley extends ahcz implements aheo
{
    public static final aley a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(aley.class, a = new aley());
    }
    
    private aley() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aley.d) == null) {
                    synchronized (aley.class) {
                        if (aley.d == null) {
                            aley.d = (ahev)new ahcs((ahcz)aley.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aley.a;
            }
            case 4: {
                return new ahcr((ahcz)aley.a);
            }
            case 3: {
                return new aley();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aley.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0000", new Object[] { "b", "c" });
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
