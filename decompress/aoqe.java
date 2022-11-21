import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqe extends ahcz implements aheo
{
    public static final aoqe a;
    public static final ahcx b;
    private static volatile ahev e;
    public ahdp c;
    public ahdp d;
    
    static {
        final aoqe a2 = new aoqe();
        ahcz.registerDefaultInstance(aoqe.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aoqh.a, a2, (MessageLite)a2, null, 343899489, ahgc.k, aoqe.class);
    }
    
    private aoqe() {
        this.c = ahcz.emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
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
                if ((e = aoqe.e) == null) {
                    synchronized (aoqe.class) {
                        if (aoqe.e == null) {
                            aoqe.e = (ahev)new ahcs((ahcz)aoqe.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoqe.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqe.a);
            }
            case 3: {
                return new aoqe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqe.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[] { "c", "d", ajrk.class });
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
