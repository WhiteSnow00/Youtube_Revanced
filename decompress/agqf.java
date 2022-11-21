import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqf extends ahcz implements aheo
{
    public static final agqf a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(agqf.class, a = new agqf());
    }
    
    private agqf() {
        this.b = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = agqf.c) == null) {
                    synchronized (agqf.class) {
                        if (agqf.c == null) {
                            agqf.c = (ahev)new ahcs((ahcz)agqf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agqf.a;
            }
            case 4: {
                return new ahcr((ahcz)agqf.a);
            }
            case 3: {
                return new agqf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agqf.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", agqe.class });
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
